// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518;

import com.aliyun.tea.*;
import com.aliyun.dataworks_public20240518.models.*;

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
     * <p>Terminates the process for deploying or undeploying an entity. The process is not deleted and can still be queried by calling query operations.</p>
     * 
     * @param request AbolishDeploymentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbolishDeploymentResponse
     */
    public AbolishDeploymentResponse abolishDeploymentWithOptions(AbolishDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbolishDeployment"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbolishDeploymentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates the process for deploying or undeploying an entity. The process is not deleted and can still be queried by calling query operations.</p>
     * 
     * @param request AbolishDeploymentRequest
     * @return AbolishDeploymentResponse
     */
    public AbolishDeploymentResponse abolishDeployment(AbolishDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDeploymentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a resource group with a workspace.</p>
     * 
     * @param request AssociateProjectToResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateProjectToResourceGroupResponse
     */
    public AssociateProjectToResourceGroupResponse associateProjectToResourceGroupWithOptions(AssociateProjectToResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateProjectToResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateProjectToResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a resource group with a workspace.</p>
     * 
     * @param request AssociateProjectToResourceGroupRequest
     * @return AssociateProjectToResourceGroupResponse
     */
    public AssociateProjectToResourceGroupResponse associateProjectToResourceGroup(AssociateProjectToResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateProjectToResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request CloneDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneDataSourceResponse
     */
    public CloneDataSourceResponse cloneDataSourceWithOptions(CloneDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloneDataSourceName)) {
            query.put("CloneDataSourceName", request.cloneDataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    public CloneDataSourceResponse cloneDataSource(CloneDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集成报警规则</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集成报警规则</p>
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
     * <p>创建数据集成任务</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据集成任务</p>
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
     * <p>验证用</p>
     * 
     * @param request CreateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceResponse
     */
    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>验证用</p>
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
     * <p>验证用</p>
     * 
     * @param request CreateDataSourceSharedRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataSourceSharedRuleResponse
     */
    public CreateDataSourceSharedRuleResponse createDataSourceSharedRuleWithOptions(CreateDataSourceSharedRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedUser)) {
            query.put("SharedUser", request.sharedUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProjectId)) {
            query.put("TargetProjectId", request.targetProjectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSourceSharedRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceSharedRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request CreateDataSourceSharedRuleRequest
     * @return CreateDataSourceSharedRuleResponse
     */
    public CreateDataSourceSharedRuleResponse createDataSourceSharedRule(CreateDataSourceSharedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataSourceSharedRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create a process for multiple entities at a time. If you specify multiple entities in a request, the system creates a process only for the first entity.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a process for deploying or undeploying an entity in DataStudio.</p>
     * 
     * @param tmpReq CreateDeploymentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeploymentWithOptions(CreateDeploymentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeploymentShrinkRequest request = new CreateDeploymentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectIds)) {
            request.objectIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectIds, "ObjectIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectIdsShrink)) {
            body.put("ObjectIds", request.objectIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeployment"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeploymentResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create a process for multiple entities at a time. If you specify multiple entities in a request, the system creates a process only for the first entity.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a process for deploying or undeploying an entity in DataStudio.</p>
     * 
     * @param request CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeploymentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple UDFs at a time. If you specify multiple UDFs by using FlowSpec, the system creates only the first specified UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a user-defined function (UDF) in DataStudio. The information about the UDF is described by using FlowSpec.</p>
     * 
     * @param request CreateFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple UDFs at a time. If you specify multiple UDFs by using FlowSpec, the system creates only the first specified UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a user-defined function (UDF) in DataStudio. The information about the UDF is described by using FlowSpec.</p>
     * 
     * @param request CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建并绑定通用资源组网络资源。</p>
     * 
     * @param request CreateNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetworkWithOptions(CreateNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            body.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建并绑定通用资源组网络资源。</p>
     * 
     * @param request CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple nodes at a time. If you specify multiple nodes by using FlowSpec, the system creates only the first specified node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a node in DataStudio. The information about the node is described by using FlowSpec.</p>
     * 
     * @param request CreateNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNodeWithOptions(CreateNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerId)) {
            body.put("ContainerId", request.containerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple nodes at a time. If you specify multiple nodes by using FlowSpec, the system creates only the first specified node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a node in DataStudio. The information about the node is described by using FlowSpec.</p>
     * 
     * @param request CreateNodeRequest
     * @return CreateNodeResponse
     */
    public CreateNodeResponse createNode(CreateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作空间</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceTagsShrink)) {
            body.put("AliyunResourceTags", request.aliyunResourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>创建工作空间</p>
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
     * <p>添加工作空间成员</p>
     * 
     * @param tmpReq CreateProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMemberWithOptions(CreateProjectMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectMemberShrinkRequest request = new CreateProjectMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectMember"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>添加工作空间成员</p>
     * 
     * @param request CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    public CreateProjectMemberResponse createProjectMember(CreateProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple file resources at a time. If you specify multiple file resources by using FlowSpec, the system creates only the first specified resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a file resource in DataStudio. The information about the file resource is described by using FlowSpec.</p>
     * 
     * @param request CreateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot use this API operation to create multiple file resources at a time. If you specify multiple file resources by using FlowSpec, the system creates only the first specified resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a file resource in DataStudio. The information about the file resource is described by using FlowSpec.</p>
     * 
     * @param request CreateResourceRequest
     * @return CreateResourceResponse
     */
    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建通用资源组。</p>
     * 
     * @param request CreateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            body.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            body.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            body.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vswitchId)) {
            body.put("VswitchId", request.vswitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建通用资源组。</p>
     * 
     * @param request CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建网络资源的路由。</p>
     * 
     * @param request CreateRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRouteWithOptions(CreateRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            body.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            body.put("NetworkId", request.networkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网络资源的路由。</p>
     * 
     * @param request CreateRouteRequest
     * @return CreateRouteResponse
     */
    public CreateRouteResponse createRoute(CreateRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRouteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system creates only the first specified workflow. Other specified workflows and the nodes in the workflows are ignored. You can call the CreateNode operation to create a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow in a directory of DataStudio.</p>
     * 
     * @param request CreateWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowDefinitionResponse
     */
    public CreateWorkflowDefinitionResponse createWorkflowDefinitionWithOptions(CreateWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot use this API operation to create multiple workflows at a time. If you specify multiple workflows by using FlowSpec, the system creates only the first specified workflow. Other specified workflows and the nodes in the workflows are ignored. You can call the CreateNode operation to create a node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a workflow in a directory of DataStudio.</p>
     * 
     * @param request CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    public CreateWorkflowDefinitionResponse createWorkflowDefinition(CreateWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule configured for a synchronization task.</p>
     * 
     * @param request DeleteDIAlarmRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIAlarmRuleResponse
     */
    public DeleteDIAlarmRuleResponse deleteDIAlarmRuleWithOptions(DeleteDIAlarmRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule configured for a synchronization task.</p>
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
     * <p>删除数据集成任务</p>
     * 
     * @param request DeleteDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJobWithOptions(DeleteDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据集成任务</p>
     * 
     * @param request DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    public DeleteDIJobResponse deleteDIJob(DeleteDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
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
     * <p>验证用</p>
     * 
     * @param request DeleteDataSourceSharedRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceSharedRuleResponse
     */
    public DeleteDataSourceSharedRuleResponse deleteDataSourceSharedRuleWithOptions(DeleteDataSourceSharedRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSourceSharedRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceSharedRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request DeleteDataSourceSharedRuleRequest
     * @return DeleteDataSourceSharedRuleResponse
     */
    public DeleteDataSourceSharedRuleResponse deleteDataSourceSharedRule(DeleteDataSourceSharedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceSharedRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request DeleteFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunctionWithOptions(DeleteFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A UDF that is deployed cannot be deleted. If you want to delete such a UDF, you must first undeploy the UDF.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑并删除通用资源组网络资源。</p>
     * 
     * @param request DeleteNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetworkWithOptions(DeleteNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑并删除通用资源组网络资源。</p>
     * 
     * @param request DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A node that is deployed cannot be deleted. If you want to delete such a node, you must first undeploy the node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node from DataStudio.</p>
     * 
     * @param request DeleteNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNodeWithOptions(DeleteNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A node that is deployed cannot be deleted. If you want to delete such a node, you must first undeploy the node.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a node from DataStudio.</p>
     * 
     * @param request DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>销毁工作空间</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>销毁工作空间</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除工作空间成员</p>
     * 
     * @param request DeleteProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMemberWithOptions(DeleteProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectMember"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>移除工作空间成员</p>
     * 
     * @param request DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    public DeleteProjectMemberResponse deleteProjectMember(DeleteProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A file resource that is deployed cannot be deleted. If you want to delete such a file resource, you must first undeploy the file resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file resource from DataStudio.</p>
     * 
     * @param request DeleteResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResourceWithOptions(DeleteResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A file resource that is deployed cannot be deleted. If you want to delete such a file resource, you must first undeploy the file resource.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file resource from DataStudio.</p>
     * 
     * @param request DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a serverless resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a serverless resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除网络资源的路由。</p>
     * 
     * @param request DeleteRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteResponse
     */
    public DeleteRouteResponse deleteRouteWithOptions(DeleteRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除网络资源的路由。</p>
     * 
     * @param request DeleteRouteRequest
     * @return DeleteRouteResponse
     */
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(DeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            query.put("ProjectEnv", request.projectEnv);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * @param request DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A workflow that is deployed cannot be deleted. If you want to delete such a workflow, you must first undeploy the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow from DataStudio.</p>
     * 
     * @param request DeleteWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowDefinitionResponse
     */
    public DeleteWorkflowDefinitionResponse deleteWorkflowDefinitionWithOptions(DeleteWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A workflow that is deployed cannot be deleted. If you want to delete such a workflow, you must first undeploy the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workflow from DataStudio.</p>
     * 
     * @param request DeleteWorkflowDefinitionRequest
     * @return DeleteWorkflowDefinitionResponse
     */
    public DeleteWorkflowDefinitionResponse deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a resource group from a workspace.</p>
     * 
     * @param request DissociateProjectFromResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DissociateProjectFromResourceGroupResponse
     */
    public DissociateProjectFromResourceGroupResponse dissociateProjectFromResourceGroupWithOptions(DissociateProjectFromResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateProjectFromResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateProjectFromResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a resource group from a workspace.</p>
     * 
     * @param request DissociateProjectFromResourceGroupRequest
     * @return DissociateProjectFromResourceGroupResponse
     */
    public DissociateProjectFromResourceGroupResponse dissociateProjectFromResourceGroup(DissociateProjectFromResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dissociateProjectFromResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The stages in a process are sequential. For more information, see the GetDeployment operation. Skipping or repeating a stage is not allowed.
     *  The execution of a stage is asynchronous. The response of this operation indicates only whether a stage is triggered but does not indicate whether the execution of the stage is successful. You can call the GetDeployment operation to check whether the execution is successful.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Executes a stage in a process.</p>
     * 
     * @param request ExecDeploymentStageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDeploymentStageResponse
     */
    public ExecDeploymentStageResponse execDeploymentStageWithOptions(ExecDeploymentStageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDeploymentStage"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDeploymentStageResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The stages in a process are sequential. For more information, see the GetDeployment operation. Skipping or repeating a stage is not allowed.
     *  The execution of a stage is asynchronous. The response of this operation indicates only whether a stage is triggered but does not indicate whether the execution of the stage is successful. You can call the GetDeployment operation to check whether the execution is successful.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Executes a stage in a process.</p>
     * 
     * @param request ExecDeploymentStageRequest
     * @return ExecDeploymentStageResponse
     */
    public ExecDeploymentStageResponse execDeploymentStage(ExecDeploymentStageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execDeploymentStageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集成任务</p>
     * 
     * @param request GetDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIJobResponse
     */
    public GetDIJobResponse getDIJobWithOptions(GetDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集成任务</p>
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
     * <p>Obtains logs generated for a synchronization task.</p>
     * 
     * @param request GetDIJobLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIJobLogResponse
     */
    public GetDIJobLogResponse getDIJobLogWithOptions(GetDIJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDIJobLog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIJobLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains logs generated for a synchronization task.</p>
     * 
     * @param request GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    public GetDIJobLogResponse getDIJobLog(GetDIJobLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIJobLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you are assigned one of the following roles in DataWorks:</p>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Development, Project Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a data source by ID.</p>
     * 
     * @param request GetDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceResponse
     */
    public GetDataSourceResponse getDataSourceWithOptions(GetDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you are assigned one of the following roles in DataWorks:</p>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Development, Project Owner, and O\&amp;M</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a data source by ID.</p>
     * 
     * @param request GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    public GetDataSourceResponse getDataSource(GetDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a process for deploying or undeploying an entity.</p>
     * 
     * @param request GetDeploymentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeploymentResponse
     */
    public GetDeploymentResponse getDeploymentWithOptions(GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeployment"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeploymentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a process for deploying or undeploying an entity.</p>
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
     * <p>Queries the information about a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request GetFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunctionWithOptions(GetFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request GetFunctionRequest
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunction(GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>返回异步任务的状态信息</p>
     * 
     * @param request GetJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobStatusResponse
     */
    public GetJobStatusResponse getJobStatusWithOptions(GetJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobStatus"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>返回异步任务的状态信息</p>
     * 
     * @param request GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    public GetJobStatusResponse getJobStatus(GetJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个网络资源详细信息。</p>
     * 
     * @param request GetNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkResponse
     */
    public GetNetworkResponse getNetworkWithOptions(GetNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetwork"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个网络资源详细信息。</p>
     * 
     * @param request GetNetworkRequest
     * @return GetNetworkResponse
     */
    public GetNetworkResponse getNetwork(GetNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a node in DataStudio.</p>
     * 
     * @param request GetNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeResponse
     */
    public GetNodeResponse getNodeWithOptions(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a node in DataStudio.</p>
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
     * <p>Queries the information about a DataWorks workspace.</p>
     * 
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
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
     * <p>查询工作空间成员详情</p>
     * 
     * @param request GetProjectMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMemberWithOptions(GetProjectMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectMember"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作空间成员详情</p>
     * 
     * @param request GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    public GetProjectMemberResponse getProjectMember(GetProjectMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作空间角色详情</p>
     * 
     * @param request GetProjectRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectRoleResponse
     */
    public GetProjectRoleResponse getProjectRoleWithOptions(GetProjectRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectRole"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询工作空间角色详情</p>
     * 
     * @param request GetProjectRoleRequest
     * @return GetProjectRoleResponse
     */
    public GetProjectRoleResponse getProjectRole(GetProjectRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file resource.</p>
     * 
     * @param request GetResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceResponse
     */
    public GetResourceResponse getResourceWithOptions(GetResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a file resource.</p>
     * 
     * @param request GetResourceRequest
     * @return GetResourceResponse
     */
    public GetResourceResponse getResource(GetResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取指定资源组。</p>
     * 
     * @param request GetResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroupWithOptions(GetResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取指定资源组。</p>
     * 
     * @param request GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroup(GetResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取指定路由。</p>
     * 
     * @param request GetRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRouteResponse
     */
    public GetRouteResponse getRouteWithOptions(GetRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取指定路由。</p>
     * 
     * @param request GetRouteRequest
     * @return GetRouteResponse
     */
    public GetRouteResponse getRoute(GetRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRouteWithOptions(request, runtime);
    }

    /**
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * @param request GetTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskInstanceResponse
     */
    public GetTaskInstanceResponse getTaskInstanceWithOptions(GetTaskInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskInstanceResponse());
    }

    /**
     * @param request GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     */
    public GetTaskInstanceResponse getTaskInstance(GetTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskInstanceWithOptions(request, runtime);
    }

    /**
     * @param request GetTaskInstanceLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskInstanceLogResponse
     */
    public GetTaskInstanceLogResponse getTaskInstanceLogWithOptions(GetTaskInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskInstanceLog"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskInstanceLogResponse());
    }

    /**
     * @param request GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     */
    public GetTaskInstanceLogResponse getTaskInstanceLog(GetTaskInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskInstanceLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the infomation about a workflow.</p>
     * 
     * @param request GetWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowDefinitionResponse
     */
    public GetWorkflowDefinitionResponse getWorkflowDefinitionWithOptions(GetWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the infomation about a workflow.</p>
     * 
     * @param request GetWorkflowDefinitionRequest
     * @return GetWorkflowDefinitionResponse
     */
    public GetWorkflowDefinitionResponse getWorkflowDefinition(GetWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>授予工作空间成员角色</p>
     * 
     * @param tmpReq GrantMemberProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantMemberProjectRolesResponse
     */
    public GrantMemberProjectRolesResponse grantMemberProjectRolesWithOptions(GrantMemberProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantMemberProjectRolesShrinkRequest request = new GrantMemberProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantMemberProjectRoles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantMemberProjectRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>授予工作空间成员角色</p>
     * 
     * @param request GrantMemberProjectRolesRequest
     * @return GrantMemberProjectRolesResponse
     */
    public GrantMemberProjectRolesResponse grantMemberProjectRoles(GrantMemberProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantMemberProjectRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用此接口，可以将通过FlowSpec定义的工作流节点和其内部的子节点都导入到数据开发中</p>
     * 
     * @param request ImportWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportWorkflowDefinitionResponse
     */
    public ImportWorkflowDefinitionResponse importWorkflowDefinitionWithOptions(ImportWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用此接口，可以将通过FlowSpec定义的工作流节点和其内部的子节点都导入到数据开发中</p>
     * 
     * @param request ImportWorkflowDefinitionRequest
     * @return ImportWorkflowDefinitionResponse
     */
    public ImportWorkflowDefinitionResponse importWorkflowDefinition(ImportWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集成报警规则</p>
     * 
     * @param request ListDIAlarmRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRulesWithOptions(ListDIAlarmRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIAlarmRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIAlarmRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集成报警规则</p>
     * 
     * @param request ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    public ListDIAlarmRulesResponse listDIAlarmRules(ListDIAlarmRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIAlarmRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成任务事件</p>
     * 
     * @param request ListDIJobEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobEventsResponse
     */
    public ListDIJobEventsResponse listDIJobEventsWithOptions(ListDIJobEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobEvents"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成任务事件</p>
     * 
     * @param request ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    public ListDIJobEventsResponse listDIJobEvents(ListDIJobEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成任务指标</p>
     * 
     * @param tmpReq ListDIJobMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobMetricsResponse
     */
    public ListDIJobMetricsResponse listDIJobMetricsWithOptions(ListDIJobMetricsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDIJobMetricsShrinkRequest request = new ListDIJobMetricsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metricName)) {
            request.metricNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metricName, "MetricName", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobMetrics"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成任务指标</p>
     * 
     * @param request ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    public ListDIJobMetricsResponse listDIJobMetrics(ListDIJobMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成运行信息</p>
     * 
     * @param request ListDIJobRunDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobRunDetailsResponse
     */
    public ListDIJobRunDetailsResponse listDIJobRunDetailsWithOptions(ListDIJobRunDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobRunDetails"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobRunDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据集成运行信息</p>
     * 
     * @param request ListDIJobRunDetailsRequest
     * @return ListDIJobRunDetailsResponse
     */
    public ListDIJobRunDetailsResponse listDIJobRunDetails(ListDIJobRunDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobRunDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of synchronization tasks.</p>
     * 
     * @param request ListDIJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobsWithOptions(ListDIJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDIJobs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDIJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of synchronization tasks.</p>
     * 
     * @param request ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    public ListDIJobsResponse listDIJobs(ListDIJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDIJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataQualityEvaluationTaskInstances</p>
     * 
     * @param request ListDataQualityEvaluationTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    public ListDataQualityEvaluationTaskInstancesResponse listDataQualityEvaluationTaskInstancesWithOptions(ListDataQualityEvaluationTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityEvaluationTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityEvaluationTaskInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataQualityEvaluationTaskInstances</p>
     * 
     * @param request ListDataQualityEvaluationTaskInstancesRequest
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    public ListDataQualityEvaluationTaskInstancesResponse listDataQualityEvaluationTaskInstances(ListDataQualityEvaluationTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityEvaluationTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListDataQualityEvaluationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityEvaluationTasksResponse
     */
    public ListDataQualityEvaluationTasksResponse listDataQualityEvaluationTasksWithOptions(ListDataQualityEvaluationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityEvaluationTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityEvaluationTasksResponse());
    }

    /**
     * @param request ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    public ListDataQualityEvaluationTasksResponse listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityEvaluationTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListDataQualityResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityResultsResponse
     */
    public ListDataQualityResultsResponse listDataQualityResultsWithOptions(ListDataQualityResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityResults"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityResultsResponse());
    }

    /**
     * @param request ListDataQualityResultsRequest
     * @return ListDataQualityResultsResponse
     */
    public ListDataQualityResultsResponse listDataQualityResults(ListDataQualityResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>质量监控规则分页查询</p>
     * 
     * @param request ListDataQualityRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataQualityRulesResponse
     */
    public ListDataQualityRulesResponse listDataQualityRulesWithOptions(ListDataQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataQualityRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataQualityRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>质量监控规则分页查询</p>
     * 
     * @param request ListDataQualityRulesRequest
     * @return ListDataQualityRulesResponse
     */
    public ListDataQualityRulesResponse listDataQualityRules(ListDataQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataQualityRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request ListDataSourceSharedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceSharedRulesResponse
     */
    public ListDataSourceSharedRulesResponse listDataSourceSharedRulesWithOptions(ListDataSourceSharedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSourceSharedRules"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceSharedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request ListDataSourceSharedRulesRequest
     * @return ListDataSourceSharedRulesResponse
     */
    public ListDataSourceSharedRulesResponse listDataSourceSharedRules(ListDataSourceSharedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceSharedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param tmpReq ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourcesShrinkRequest request = new ListDataSourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>验证用</p>
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
     * <p>Queries a list of processes that are used to deploy or undeploy entities in DataStudio. You can also specify filter conditions to query specific processes.</p>
     * 
     * @param request ListDeploymentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeploymentsWithOptions(ListDeploymentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeployments"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeploymentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of processes that are used to deploy or undeploy entities in DataStudio. You can also specify filter conditions to query specific processes.</p>
     * 
     * @param request ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeploymentsWithOptions(request, runtime);
    }

    /**
     * @param request ListDownstreamTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownstreamTaskInstancesResponse
     */
    public ListDownstreamTaskInstancesResponse listDownstreamTaskInstancesWithOptions(ListDownstreamTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamTaskInstancesResponse());
    }

    /**
     * @param request ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     */
    public ListDownstreamTaskInstancesResponse listDownstreamTaskInstances(ListDownstreamTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownstreamTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListDownstreamTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownstreamTasksResponse
     */
    public ListDownstreamTasksResponse listDownstreamTasksWithOptions(ListDownstreamTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownstreamTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownstreamTasksResponse());
    }

    /**
     * @param request ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     */
    public ListDownstreamTasksResponse listDownstreamTasks(ListDownstreamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownstreamTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user-defined functions (UDFs) in DataStudio. You can also specify filter conditions to query specific UDFs.</p>
     * 
     * @param request ListFunctionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctionsWithOptions(ListFunctionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of user-defined functions (UDFs) in DataStudio. You can also specify filter conditions to query specific UDFs.</p>
     * 
     * @param request ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFunctionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通用资源组网络资源列表。</p>
     * 
     * @param request ListNetworksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworksResponse
     */
    public ListNetworksResponse listNetworksWithOptions(ListNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取通用资源组网络资源列表。</p>
     * 
     * @param request ListNetworksRequest
     * @return ListNetworksResponse
     */
    public ListNetworksResponse listNetworks(ListNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant nodes of a node in DataStudio.</p>
     * 
     * @param request ListNodeDependenciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeDependenciesResponse
     */
    public ListNodeDependenciesResponse listNodeDependenciesWithOptions(ListNodeDependenciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeDependencies"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeDependenciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of descendant nodes of a node in DataStudio.</p>
     * 
     * @param request ListNodeDependenciesRequest
     * @return ListNodeDependenciesResponse
     */
    public ListNodeDependenciesResponse listNodeDependencies(ListNodeDependenciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeDependenciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in DataStudio. You can also specify filter conditions to query specific nodes.</p>
     * 
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of nodes in DataStudio. You can also specify filter conditions to query specific nodes.</p>
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
     * <p>分页查询工作空间成员详情</p>
     * 
     * @param tmpReq ListProjectMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembersWithOptions(ListProjectMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectMembersShrinkRequest request = new ListProjectMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "UserIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdsShrink)) {
            body.put("UserIds", request.userIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectMembers"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>分页查询工作空间成员详情</p>
     * 
     * @param request ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    public ListProjectMembersResponse listProjectMembers(ListProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询工作空间角色详情</p>
     * 
     * @param tmpReq ListProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectRolesResponse
     */
    public ListProjectRolesResponse listProjectRolesWithOptions(ListProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectRolesShrinkRequest request = new ListProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "Codes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codesShrink)) {
            body.put("Codes", request.codesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namesShrink)) {
            body.put("Names", request.namesShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectRoles"),
            new TeaPair("version", "2024-05-18"),
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
     * <b>summary</b> : 
     * <p>分页查询工作空间角色详情</p>
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
     * <p>分页查询工作空间详情</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aliyunResourceTags)) {
            request.aliyunResourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aliyunResourceTags, "AliyunResourceTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.names)) {
            request.namesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.names, "Names", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupId)) {
            body.put("AliyunResourceGroupId", request.aliyunResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceTagsShrink)) {
            body.put("AliyunResourceTags", request.aliyunResourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namesShrink)) {
            body.put("Names", request.namesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2024-05-18"),
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
     * <p>分页查询工作空间详情</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源组列表。</p>
     * 
     * @param tmpReq ListResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResourceGroupsShrinkRequest request = new ListResourceGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceGroupTypes)) {
            request.resourceGroupTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceGroupTypes, "ResourceGroupTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statuses)) {
            request.statusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statuses, "Statuses", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源组列表。</p>
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
     * <p>Queries a list of file resources in DataStudio. You can also specify filter conditions to query specific file resources.</p>
     * 
     * @param request ListResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of file resources in DataStudio. You can also specify filter conditions to query specific file resources.</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络资源的路由列表。</p>
     * 
     * @param request ListRoutesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutesWithOptions(ListRoutesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoutes"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络资源的路由列表。</p>
     * 
     * @param request ListRoutesRequest
     * @return ListRoutesResponse
     */
    public ListRoutesResponse listRoutes(ListRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoutesWithOptions(request, runtime);
    }

    /**
     * @param request ListTaskInstanceOperationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskInstanceOperationLogsResponse
     */
    public ListTaskInstanceOperationLogsResponse listTaskInstanceOperationLogsWithOptions(ListTaskInstanceOperationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskInstanceOperationLogs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskInstanceOperationLogsResponse());
    }

    /**
     * @param request ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    public ListTaskInstanceOperationLogsResponse listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskInstanceOperationLogsWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ListTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstancesWithOptions(ListTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTaskInstancesShrinkRequest request = new ListTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizdate)) {
            body.put("Bizdate", request.bizdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResource)) {
            body.put("RuntimeResource", request.runtimeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            body.put("TaskIds", request.taskIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            body.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            body.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceType)) {
            body.put("WorkflowInstanceType", request.workflowInstanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskInstancesResponse());
    }

    /**
     * @param request ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    public ListTaskInstancesResponse listTaskInstances(ListTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListTaskOperationLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskOperationLogsResponse
     */
    public ListTaskOperationLogsResponse listTaskOperationLogsWithOptions(ListTaskOperationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskOperationLogs"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskOperationLogsResponse());
    }

    /**
     * @param request ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    public ListTaskOperationLogsResponse listTaskOperationLogs(ListTaskOperationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskOperationLogsWithOptions(request, runtime);
    }

    /**
     * @param request ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectEnv)) {
            body.put("ProjectEnv", request.projectEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeResource)) {
            body.put("RuntimeResource", request.runtimeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            body.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            body.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerRecurrence)) {
            body.put("TriggerRecurrence", request.triggerRecurrence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            body.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * @param request ListUpstreamTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpstreamTaskInstancesResponse
     */
    public ListUpstreamTaskInstancesResponse listUpstreamTaskInstancesWithOptions(ListUpstreamTaskInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamTaskInstancesResponse());
    }

    /**
     * @param request ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     */
    public ListUpstreamTaskInstancesResponse listUpstreamTaskInstances(ListUpstreamTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpstreamTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ListUpstreamTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpstreamTasksResponse
     */
    public ListUpstreamTasksResponse listUpstreamTasksWithOptions(ListUpstreamTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpstreamTasks"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpstreamTasksResponse());
    }

    /**
     * @param request ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     */
    public ListUpstreamTasksResponse listUpstreamTasks(ListUpstreamTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpstreamTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workflows in DataStudio. You can also specify filter conditions to query specific workflows.</p>
     * 
     * @param request ListWorkflowDefinitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowDefinitionsResponse
     */
    public ListWorkflowDefinitionsResponse listWorkflowDefinitionsWithOptions(ListWorkflowDefinitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowDefinitions"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowDefinitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of workflows in DataStudio. You can also specify filter conditions to query specific workflows.</p>
     * 
     * @param request ListWorkflowDefinitionsRequest
     * @return ListWorkflowDefinitionsResponse
     */
    public ListWorkflowDefinitionsResponse listWorkflowDefinitions(ListWorkflowDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowDefinitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a user-defined function (UDF) to a path in DataStudio.</p>
     * 
     * @param request MoveFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveFunctionResponse
     */
    public MoveFunctionResponse moveFunctionWithOptions(MoveFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a user-defined function (UDF) to a path in DataStudio.</p>
     * 
     * @param request MoveFunctionRequest
     * @return MoveFunctionResponse
     */
    public MoveFunctionResponse moveFunction(MoveFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a node to a path in DataStudio.</p>
     * 
     * @param request MoveNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveNodeResponse
     */
    public MoveNodeResponse moveNodeWithOptions(MoveNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a node to a path in DataStudio.</p>
     * 
     * @param request MoveNodeRequest
     * @return MoveNodeResponse
     */
    public MoveNodeResponse moveNode(MoveNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file resource to a path in DataStudio.</p>
     * 
     * @param request MoveResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResourceWithOptions(MoveResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file resource to a path in DataStudio.</p>
     * 
     * @param request MoveResourceRequest
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResource(MoveResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a workflow to a path in DataStudio.</p>
     * 
     * @param request MoveWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveWorkflowDefinitionResponse
     */
    public MoveWorkflowDefinitionResponse moveWorkflowDefinitionWithOptions(MoveWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a workflow to a path in DataStudio.</p>
     * 
     * @param request MoveWorkflowDefinitionRequest
     * @return MoveWorkflowDefinitionResponse
     */
    public MoveWorkflowDefinitionResponse moveWorkflowDefinition(MoveWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * @param tmpReq RemoveTaskInstanceDependenciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTaskInstanceDependenciesResponse
     */
    public RemoveTaskInstanceDependenciesResponse removeTaskInstanceDependenciesWithOptions(RemoveTaskInstanceDependenciesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveTaskInstanceDependenciesShrinkRequest request = new RemoveTaskInstanceDependenciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.upstreamTaskInstanceIds)) {
            request.upstreamTaskInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.upstreamTaskInstanceIds, "UpstreamTaskInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upstreamTaskInstanceIdsShrink)) {
            body.put("UpstreamTaskInstanceIds", request.upstreamTaskInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTaskInstanceDependencies"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTaskInstanceDependenciesResponse());
    }

    /**
     * @param request RemoveTaskInstanceDependenciesRequest
     * @return RemoveTaskInstanceDependenciesResponse
     */
    public RemoveTaskInstanceDependenciesResponse removeTaskInstanceDependencies(RemoveTaskInstanceDependenciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTaskInstanceDependenciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request RenameFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameFunctionResponse
     */
    public RenameFunctionResponse renameFunctionWithOptions(RenameFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
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
            new TeaPair("action", "RenameFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a user-defined function (UDF) in DataStudio.</p>
     * 
     * @param request RenameFunctionRequest
     * @return RenameFunctionResponse
     */
    public RenameFunctionResponse renameFunction(RenameFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a node in DataStudio.</p>
     * 
     * @param request RenameNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameNodeResponse
     */
    public RenameNodeResponse renameNodeWithOptions(RenameNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
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
            new TeaPair("action", "RenameNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a node in DataStudio.</p>
     * 
     * @param request RenameNodeRequest
     * @return RenameNodeResponse
     */
    public RenameNodeResponse renameNode(RenameNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a file resource in DataStudio.</p>
     * 
     * @param request RenameResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameResourceResponse
     */
    public RenameResourceResponse renameResourceWithOptions(RenameResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
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
            new TeaPair("action", "RenameResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a file resource in DataStudio.</p>
     * 
     * @param request RenameResourceRequest
     * @return RenameResourceResponse
     */
    public RenameResourceResponse renameResource(RenameResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a workflow in DataStudio.</p>
     * 
     * @param request RenameWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameWorkflowDefinitionResponse
     */
    public RenameWorkflowDefinitionResponse renameWorkflowDefinitionWithOptions(RenameWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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
            new TeaPair("action", "RenameWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renames a workflow in DataStudio.</p>
     * 
     * @param request RenameWorkflowDefinitionRequest
     * @return RenameWorkflowDefinitionResponse
     */
    public RenameWorkflowDefinitionResponse renameWorkflowDefinition(RenameWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameWorkflowDefinitionWithOptions(request, runtime);
    }

    /**
     * @param tmpReq RerunTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RerunTaskInstancesResponse
     */
    public RerunTaskInstancesResponse rerunTaskInstancesWithOptions(RerunTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RerunTaskInstancesShrinkRequest request = new RerunTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunTaskInstancesResponse());
    }

    /**
     * @param request RerunTaskInstancesRequest
     * @return RerunTaskInstancesResponse
     */
    public RerunTaskInstancesResponse rerunTaskInstances(RerunTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rerunTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param tmpReq ResumeTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTaskInstancesResponse
     */
    public ResumeTaskInstancesResponse resumeTaskInstancesWithOptions(ResumeTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResumeTaskInstancesShrinkRequest request = new ResumeTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTaskInstancesResponse());
    }

    /**
     * @param request ResumeTaskInstancesRequest
     * @return ResumeTaskInstancesResponse
     */
    public ResumeTaskInstancesResponse resumeTaskInstances(ResumeTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤销工作空间成员的角色</p>
     * 
     * @param tmpReq RevokeMemberProjectRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeMemberProjectRolesResponse
     */
    public RevokeMemberProjectRolesResponse revokeMemberProjectRolesWithOptions(RevokeMemberProjectRolesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeMemberProjectRolesShrinkRequest request = new RevokeMemberProjectRolesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "RoleCodes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("RoleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeMemberProjectRoles"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeMemberProjectRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销工作空间成员的角色</p>
     * 
     * @param request RevokeMemberProjectRolesRequest
     * @return RevokeMemberProjectRolesResponse
     */
    public RevokeMemberProjectRolesResponse revokeMemberProjectRoles(RevokeMemberProjectRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeMemberProjectRolesWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SetSuccessTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSuccessTaskInstancesResponse
     */
    public SetSuccessTaskInstancesResponse setSuccessTaskInstancesWithOptions(SetSuccessTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSuccessTaskInstancesShrinkRequest request = new SetSuccessTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSuccessTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSuccessTaskInstancesResponse());
    }

    /**
     * @param request SetSuccessTaskInstancesRequest
     * @return SetSuccessTaskInstancesResponse
     */
    public SetSuccessTaskInstancesResponse setSuccessTaskInstances(SetSuccessTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据集成任务</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动数据集成任务</p>
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
     * <p>Stops a synchronization task.</p>
     * 
     * @param request StopDIJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJobWithOptions(StopDIJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a synchronization task.</p>
     * 
     * @param request StopDIJobRequest
     * @return StopDIJobResponse
     */
    public StopDIJobResponse stopDIJob(StopDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDIJobWithOptions(request, runtime);
    }

    /**
     * @param tmpReq StopTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTaskInstancesResponse
     */
    public StopTaskInstancesResponse stopTaskInstancesWithOptions(StopTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopTaskInstancesShrinkRequest request = new StopTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskInstancesResponse());
    }

    /**
     * @param request StopTaskInstancesRequest
     * @return StopTaskInstancesResponse
     */
    public StopTaskInstancesResponse stopTaskInstances(StopTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param tmpReq SuspendTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendTaskInstancesResponse
     */
    public SuspendTaskInstancesResponse suspendTaskInstancesWithOptions(SuspendTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SuspendTaskInstancesShrinkRequest request = new SuspendTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            body.put("Ids", request.idsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendTaskInstancesResponse());
    }

    /**
     * @param request SuspendTaskInstancesRequest
     * @return SuspendTaskInstancesResponse
     */
    public SuspendTaskInstancesResponse suspendTaskInstances(SuspendTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendTaskInstancesWithOptions(request, runtime);
    }

    /**
     * @param request TriggerSchedulerTaskInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerSchedulerTaskInstanceResponse
     */
    public TriggerSchedulerTaskInstanceResponse triggerSchedulerTaskInstanceWithOptions(TriggerSchedulerTaskInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerTime)) {
            body.put("TriggerTime", request.triggerTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerSchedulerTaskInstance"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerSchedulerTaskInstanceResponse());
    }

    /**
     * @param request TriggerSchedulerTaskInstanceRequest
     * @return TriggerSchedulerTaskInstanceResponse
     */
    public TriggerSchedulerTaskInstanceResponse triggerSchedulerTaskInstance(TriggerSchedulerTaskInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerSchedulerTaskInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集成报警规则</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIAlarmRule"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIAlarmRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集成报警规则</p>
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
     * <p>更新数据集成任务</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDIJob"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDIJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据集成任务</p>
     * 
     * @param request UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    public UpdateDIJobResponse updateDIJob(UpdateDIJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDIJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request UpdateDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionProperties)) {
            query.put("ConnectionProperties", request.connectionProperties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPropertiesMode)) {
            query.put("ConnectionPropertiesMode", request.connectionPropertiesMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验证用</p>
     * 
     * @param request UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a user-defined function (UDF) in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunctionWithOptions(UpdateFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a user-defined function (UDF) in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a node in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNodeWithOptions(UpdateNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNode"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a node in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateNodeRequest
     * @return UpdateNodeResponse
     */
    public UpdateNodeResponse updateNode(UpdateNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间</p>
     * 
     * @param request UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devEnvironmentEnabled)) {
            body.put("DevEnvironmentEnabled", request.devEnvironmentEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devRoleDisabled)) {
            body.put("DevRoleDisabled", request.devRoleDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paiTaskEnabled)) {
            body.put("PaiTaskEnabled", request.paiTaskEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新工作空间</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a file resource in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResourceWithOptions(UpdateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResource"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a file resource in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    public UpdateResourceResponse updateResource(UpdateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates basic information about a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroupWithOptions(UpdateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroup"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates basic information about a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络资源的路由。</p>
     * 
     * @param request UpdateRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRouteWithOptions(UpdateRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidr)) {
            body.put("DestinationCidr", request.destinationCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoute"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络资源的路由。</p>
     * 
     * @param request UpdateRouteRequest
     * @return UpdateRouteResponse
     */
    public UpdateRouteResponse updateRoute(UpdateRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRouteWithOptions(request, runtime);
    }

    /**
     * @param tmpReq UpdateTaskInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskInstancesResponse
     */
    public UpdateTaskInstancesResponse updateTaskInstancesWithOptions(UpdateTaskInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskInstancesShrinkRequest request = new UpdateTaskInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskInstances)) {
            request.taskInstancesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskInstances, "TaskInstances", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskInstancesShrink)) {
            body.put("TaskInstances", request.taskInstancesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskInstances"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskInstancesResponse());
    }

    /**
     * @param request UpdateTaskInstancesRequest
     * @return UpdateTaskInstancesResponse
     */
    public UpdateTaskInstancesResponse updateTaskInstances(UpdateTaskInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a workflow in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateWorkflowDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowDefinitionResponse
     */
    public UpdateWorkflowDefinitionResponse updateWorkflowDefinitionWithOptions(UpdateWorkflowDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowDefinition"),
            new TeaPair("version", "2024-05-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about a workflow in DataStudio. This API operation performs an incremental update. The update information is described by using FlowSpec.</p>
     * 
     * @param request UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    public UpdateWorkflowDefinitionResponse updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowDefinitionWithOptions(request, runtime);
    }
}
