// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414;

import com.aliyun.tea.*;
import com.aliyun.dms20250414.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>为空间添加用户</p>
     * 
     * @param request AddUserToDataAgentWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToDataAgentWorkspaceResponse
     */
    public AddUserToDataAgentWorkspaceResponse addUserToDataAgentWorkspaceWithOptions(AddUserToDataAgentWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToDataAgentWorkspace"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToDataAgentWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为空间添加用户</p>
     * 
     * @param request AddUserToDataAgentWorkspaceRequest
     * @return AddUserToDataAgentWorkspaceResponse
     */
    public AddUserToDataAgentWorkspaceResponse addUserToDataAgentWorkspace(AddUserToDataAgentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToDataAgentWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量新建湖仓表分区</p>
     * 
     * @param tmpReq BatchCreateDataLakePartitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateDataLakePartitionsResponse
     */
    public BatchCreateDataLakePartitionsResponse batchCreateDataLakePartitionsWithOptions(BatchCreateDataLakePartitionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCreateDataLakePartitionsShrinkRequest request = new BatchCreateDataLakePartitionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionInputs)) {
            request.partitionInputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionInputs, "PartitionInputs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifNotExists)) {
            query.put("IfNotExists", request.ifNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResult)) {
            query.put("NeedResult", request.needResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputsShrink)) {
            body.put("PartitionInputs", request.partitionInputsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateDataLakePartitions"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateDataLakePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量新建湖仓表分区</p>
     * 
     * @param request BatchCreateDataLakePartitionsRequest
     * @return BatchCreateDataLakePartitionsResponse
     */
    public BatchCreateDataLakePartitionsResponse batchCreateDataLakePartitions(BatchCreateDataLakePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateDataLakePartitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除湖仓表分区</p>
     * 
     * @param request BatchDeleteDataLakePartitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteDataLakePartitionsResponse
     */
    public BatchDeleteDataLakePartitionsResponse batchDeleteDataLakePartitionsWithOptions(BatchDeleteDataLakePartitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifExists)) {
            query.put("IfExists", request.ifExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValuesList)) {
            query.put("PartitionValuesList", request.partitionValuesList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDataLakePartitions"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDataLakePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除湖仓表分区</p>
     * 
     * @param request BatchDeleteDataLakePartitionsRequest
     * @return BatchDeleteDataLakePartitionsResponse
     */
    public BatchDeleteDataLakePartitionsResponse batchDeleteDataLakePartitions(BatchDeleteDataLakePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDataLakePartitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新湖仓表分区</p>
     * 
     * @param tmpReq BatchUpdateDataLakePartitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateDataLakePartitionsResponse
     */
    public BatchUpdateDataLakePartitionsResponse batchUpdateDataLakePartitionsWithOptions(BatchUpdateDataLakePartitionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateDataLakePartitionsShrinkRequest request = new BatchUpdateDataLakePartitionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionInputs)) {
            request.partitionInputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionInputs, "PartitionInputs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputsShrink)) {
            body.put("PartitionInputs", request.partitionInputsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateDataLakePartitions"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateDataLakePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新湖仓表分区</p>
     * 
     * @param request BatchUpdateDataLakePartitionsRequest
     * @return BatchUpdateDataLakePartitionsResponse
     */
    public BatchUpdateDataLakePartitionsResponse batchUpdateDataLakePartitions(BatchUpdateDataLakePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateDataLakePartitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Airflow实例的自定义配置</p>
     * 
     * @param tmpReq ConfigAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigAirflowResponse
     */
    public ConfigAirflowResponse configAirflowWithOptions(ConfigAirflowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigAirflowShrinkRequest request = new ConfigAirflowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customAirflowCfg)) {
            request.customAirflowCfgShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customAirflowCfg, "CustomAirflowCfg", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAirflowCfgShrink)) {
            query.put("CustomAirflowCfg", request.customAirflowCfgShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Airflow实例的自定义配置</p>
     * 
     * @param request ConfigAirflowRequest
     * @return ConfigAirflowResponse
     */
    public ConfigAirflowResponse configAirflow(ConfigAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Airflow</p>
     * 
     * @param tmpReq CreateAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAirflowResponse
     */
    public CreateAirflowResponse createAirflowWithOptions(CreateAirflowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAirflowShrinkRequest request = new CreateAirflowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataMountInfoList)) {
            request.dataMountInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataMountInfoList, "DataMountInfoList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowName)) {
            query.put("AirflowName", request.airflowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.airflowVersion)) {
            query.put("AirflowVersion", request.airflowVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSpec)) {
            query.put("AppSpec", request.appSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagsDir)) {
            query.put("DagsDir", request.dagsDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMountInfoListShrink)) {
            query.put("DataMountInfoList", request.dataMountInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableServerless)) {
            query.put("EnableServerless", request.enableServerless);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gracefulShutdownTimeout)) {
            query.put("GracefulShutdownTimeout", request.gracefulShutdownTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            query.put("OssPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginsDir)) {
            query.put("PluginsDir", request.pluginsDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requirementFile)) {
            query.put("RequirementFile", request.requirementFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startupFile)) {
            query.put("StartupFile", request.startupFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerServerlessReplicas)) {
            query.put("WorkerServerlessReplicas", request.workerServerlessReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Airflow</p>
     * 
     * @param request CreateAirflowRequest
     * @return CreateAirflowResponse
     */
    public CreateAirflowResponse createAirflow(CreateAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Airflow logon credential. You can use this credential to log on to the DMS-managed Airflow instance.</p>
     * 
     * @param request CreateAirflowLoginTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAirflowLoginTokenResponse
     */
    public CreateAirflowLoginTokenResponse createAirflowLoginTokenWithOptions(CreateAirflowLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAirflowLoginToken"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAirflowLoginTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Airflow logon credential. You can use this credential to log on to the DMS-managed Airflow instance.</p>
     * 
     * @param request CreateAirflowLoginTokenRequest
     * @return CreateAirflowLoginTokenResponse
     */
    public CreateAirflowLoginTokenResponse createAirflowLoginToken(CreateAirflowLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAirflowLoginTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateCustomAgent</p>
     * 
     * @param tmpReq CreateCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgentWithOptions(CreateCustomAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCustomAgentShrinkRequest request = new CreateCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callbackConfig)) {
            request.callbackConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callbackConfig, "CallbackConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executionConfig)) {
            request.executionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executionConfig, "ExecutionConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeConfigList)) {
            request.knowledgeConfigListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeConfigList, "KnowledgeConfigList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTaskConfig)) {
            request.scheduleTaskConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTaskConfig, "ScheduleTaskConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackConfigShrink)) {
            query.put("CallbackConfig", request.callbackConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataJson)) {
            query.put("DataJson", request.dataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionConfigShrink)) {
            query.put("ExecutionConfig", request.executionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            query.put("Instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledge)) {
            query.put("Knowledge", request.knowledge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeConfigListShrink)) {
            query.put("KnowledgeConfigList", request.knowledgeConfigListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTaskConfigShrink)) {
            query.put("ScheduleTaskConfig", request.scheduleTaskConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textReportConfig)) {
            query.put("TextReportConfig", request.textReportConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webReportConfig)) {
            query.put("WebReportConfig", request.webReportConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateCustomAgent</p>
     * 
     * @param request CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgent(CreateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDataAgentKnowledgeBase</p>
     * 
     * @param request CreateDataAgentKnowledgeBaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataAgentKnowledgeBaseResponse
     */
    public CreateDataAgentKnowledgeBaseResponse createDataAgentKnowledgeBaseWithOptions(CreateDataAgentKnowledgeBaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromKbUuid)) {
            query.put("FromKbUuid", request.fromKbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataAgentKnowledgeBase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataAgentKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDataAgentKnowledgeBase</p>
     * 
     * @param request CreateDataAgentKnowledgeBaseRequest
     * @return CreateDataAgentKnowledgeBaseResponse
     */
    public CreateDataAgentKnowledgeBaseResponse createDataAgentKnowledgeBase(CreateDataAgentKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataAgentKnowledgeBaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDataAgentSession</p>
     * 
     * @param tmpReq CreateDataAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataAgentSessionResponse
     */
    public CreateDataAgentSessionResponse createDataAgentSessionWithOptions(CreateDataAgentSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataAgentSessionShrinkRequest request = new CreateDataAgentSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionConfig)) {
            request.sessionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionConfig, "SessionConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.file)) {
            query.put("File", request.file);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionConfigShrink)) {
            query.put("SessionConfig", request.sessionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataAgentSession"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataAgentSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateDataAgentSession</p>
     * 
     * @param request CreateDataAgentSessionRequest
     * @return CreateDataAgentSessionResponse
     */
    public CreateDataAgentSessionResponse createDataAgentSession(CreateDataAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建DataAgent工作空间</p>
     * 
     * @param request CreateDataAgentWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataAgentWorkspaceResponse
     */
    public CreateDataAgentWorkspaceResponse createDataAgentWorkspaceWithOptions(CreateDataAgentWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSessionShareEnabled)) {
            query.put("IsSessionShareEnabled", request.isSessionShareEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceDesc)) {
            query.put("WorkspaceDesc", request.workspaceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataAgentWorkspace"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataAgentWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建DataAgent工作空间</p>
     * 
     * @param request CreateDataAgentWorkspaceRequest
     * @return CreateDataAgentWorkspaceResponse
     */
    public CreateDataAgentWorkspaceResponse createDataAgentWorkspace(CreateDataAgentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataAgentWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓数据库</p>
     * 
     * @param tmpReq CreateDataLakeDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataLakeDatabaseResponse
     */
    public CreateDataLakeDatabaseResponse createDataLakeDatabaseWithOptions(CreateDataLakeDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataLakeDatabaseShrinkRequest request = new CreateDataLakeDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLakeDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLakeDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓数据库</p>
     * 
     * @param request CreateDataLakeDatabaseRequest
     * @return CreateDataLakeDatabaseResponse
     */
    public CreateDataLakeDatabaseResponse createDataLakeDatabase(CreateDataLakeDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataLakeDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓自定义函数</p>
     * 
     * @param tmpReq CreateDataLakeFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataLakeFunctionResponse
     */
    public CreateDataLakeFunctionResponse createDataLakeFunctionWithOptions(CreateDataLakeFunctionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataLakeFunctionShrinkRequest request = new CreateDataLakeFunctionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.functionInput)) {
            request.functionInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.functionInput, "FunctionInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionInputShrink)) {
            body.put("FunctionInput", request.functionInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLakeFunction"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLakeFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓自定义函数</p>
     * 
     * @param request CreateDataLakeFunctionRequest
     * @return CreateDataLakeFunctionResponse
     */
    public CreateDataLakeFunctionResponse createDataLakeFunction(CreateDataLakeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataLakeFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓表分区</p>
     * 
     * @param tmpReq CreateDataLakePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataLakePartitionResponse
     */
    public CreateDataLakePartitionResponse createDataLakePartitionWithOptions(CreateDataLakePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataLakePartitionShrinkRequest request = new CreateDataLakePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionInput)) {
            request.partitionInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionInput, "PartitionInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifNotExists)) {
            query.put("IfNotExists", request.ifNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResult)) {
            query.put("NeedResult", request.needResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputShrink)) {
            body.put("PartitionInput", request.partitionInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLakePartition"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLakePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓表分区</p>
     * 
     * @param request CreateDataLakePartitionRequest
     * @return CreateDataLakePartitionResponse
     */
    public CreateDataLakePartitionResponse createDataLakePartition(CreateDataLakePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataLakePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓表</p>
     * 
     * @param tmpReq CreateDataLakeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataLakeTableResponse
     */
    public CreateDataLakeTableResponse createDataLakeTableWithOptions(CreateDataLakeTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataLakeTableShrinkRequest request = new CreateDataLakeTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableInput)) {
            request.tableInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableInput, "TableInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableInputShrink)) {
            body.put("TableInput", request.tableInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLakeTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLakeTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新建湖仓表</p>
     * 
     * @param request CreateDataLakeTableRequest
     * @return CreateDataLakeTableResponse
     */
    public CreateDataLakeTableResponse createDataLakeTable(CreateDataLakeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataLakeTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Airflow</p>
     * 
     * @param request DeleteAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAirflowResponse
     */
    public DeleteAirflowResponse deleteAirflowWithOptions(DeleteAirflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Airflow</p>
     * 
     * @param request DeleteAirflowRequest
     * @return DeleteAirflowResponse
     */
    public DeleteAirflowResponse deleteAirflow(DeleteAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteCustomAgent</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgentWithOptions(DeleteCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteCustomAgent</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgent(DeleteCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteDataAgentKnowledgeBase</p>
     * 
     * @param request DeleteDataAgentKnowledgeBaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataAgentKnowledgeBaseResponse
     */
    public DeleteDataAgentKnowledgeBaseResponse deleteDataAgentKnowledgeBaseWithOptions(DeleteDataAgentKnowledgeBaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            query.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataAgentKnowledgeBase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataAgentKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteDataAgentKnowledgeBase</p>
     * 
     * @param request DeleteDataAgentKnowledgeBaseRequest
     * @return DeleteDataAgentKnowledgeBaseResponse
     */
    public DeleteDataAgentKnowledgeBaseResponse deleteDataAgentKnowledgeBase(DeleteDataAgentKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataAgentKnowledgeBaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DataAgent工作空间</p>
     * 
     * @param request DeleteDataAgentWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataAgentWorkspaceResponse
     */
    public DeleteDataAgentWorkspaceResponse deleteDataAgentWorkspaceWithOptions(DeleteDataAgentWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataAgentWorkspace"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataAgentWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DataAgent工作空间</p>
     * 
     * @param request DeleteDataAgentWorkspaceRequest
     * @return DeleteDataAgentWorkspaceResponse
     */
    public DeleteDataAgentWorkspaceResponse deleteDataAgentWorkspace(DeleteDataAgentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataAgentWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓数据库</p>
     * 
     * @param request DeleteDataLakeDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLakeDatabaseResponse
     */
    public DeleteDataLakeDatabaseResponse deleteDataLakeDatabaseWithOptions(DeleteDataLakeDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLakeDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLakeDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓数据库</p>
     * 
     * @param request DeleteDataLakeDatabaseRequest
     * @return DeleteDataLakeDatabaseResponse
     */
    public DeleteDataLakeDatabaseResponse deleteDataLakeDatabase(DeleteDataLakeDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLakeDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓自定义函数</p>
     * 
     * @param request DeleteDataLakeFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLakeFunctionResponse
     */
    public DeleteDataLakeFunctionResponse deleteDataLakeFunctionWithOptions(DeleteDataLakeFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLakeFunction"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLakeFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓自定义函数</p>
     * 
     * @param request DeleteDataLakeFunctionRequest
     * @return DeleteDataLakeFunctionResponse
     */
    public DeleteDataLakeFunctionResponse deleteDataLakeFunction(DeleteDataLakeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLakeFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓表分区</p>
     * 
     * @param tmpReq DeleteDataLakePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLakePartitionResponse
     */
    public DeleteDataLakePartitionResponse deleteDataLakePartitionWithOptions(DeleteDataLakePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDataLakePartitionShrinkRequest request = new DeleteDataLakePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionValues)) {
            request.partitionValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionValues, "PartitionValues", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifExists)) {
            query.put("IfExists", request.ifExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValuesShrink)) {
            query.put("PartitionValues", request.partitionValuesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLakePartition"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLakePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓表分区</p>
     * 
     * @param request DeleteDataLakePartitionRequest
     * @return DeleteDataLakePartitionResponse
     */
    public DeleteDataLakePartitionResponse deleteDataLakePartition(DeleteDataLakePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLakePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓表</p>
     * 
     * @param request DeleteDataLakeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLakeTableResponse
     */
    public DeleteDataLakeTableResponse deleteDataLakeTableWithOptions(DeleteDataLakeTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLakeTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLakeTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除湖仓表</p>
     * 
     * @param request DeleteDataLakeTableRequest
     * @return DeleteDataLakeTableResponse
     */
    public DeleteDataLakeTableResponse deleteDataLakeTable(DeleteDataLakeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLakeTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param request DeleteDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(DeleteDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文档</p>
     * 
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除onemeta3.0的知识库chunks</p>
     * 
     * @param tmpReq DeleteDocumentChunksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentChunksResponse
     */
    public DeleteDocumentChunksResponse deleteDocumentChunksWithOptions(DeleteDocumentChunksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDocumentChunksShrinkRequest request = new DeleteDocumentChunksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.chunkIds)) {
            request.chunkIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.chunkIds, "ChunkIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkIdsShrink)) {
            body.put("ChunkIds", request.chunkIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDocumentChunks"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除onemeta3.0的知识库chunks</p>
     * 
     * @param request DeleteDocumentChunksRequest
     * @return DeleteDocumentChunksResponse
     */
    public DeleteDocumentChunksResponse deleteDocumentChunks(DeleteDocumentChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentChunksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteFileUpload</p>
     * 
     * @param request DeleteFileUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileUploadResponse
     */
    public DeleteFileUploadResponse deleteFileUploadWithOptions(DeleteFileUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileUpload"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteFileUpload</p>
     * 
     * @param request DeleteFileUploadRequest
     * @return DeleteFileUploadResponse
     */
    public DeleteFileUploadResponse deleteFileUpload(DeleteFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeCustomAgent</p>
     * 
     * @param request DescribeCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomAgentResponse
     */
    public DescribeCustomAgentResponse describeCustomAgentWithOptions(DescribeCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeCustomAgent</p>
     * 
     * @param request DescribeCustomAgentRequest
     * @return DescribeCustomAgentResponse
     */
    public DescribeCustomAgentResponse describeCustomAgent(DescribeCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDataAgentSession</p>
     * 
     * @param request DescribeDataAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataAgentSessionResponse
     */
    public DescribeDataAgentSessionResponse describeDataAgentSessionWithOptions(DescribeDataAgentSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataAgentSession"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataAgentSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeDataAgentSession</p>
     * 
     * @param request DescribeDataAgentSessionRequest
     * @return DescribeDataAgentSessionResponse
     */
    public DescribeDataAgentSessionResponse describeDataAgentSession(DescribeDataAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档详情</p>
     * 
     * @param request DescribeDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocumentWithOptions(DescribeDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDocument"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档详情</p>
     * 
     * @param request DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocument(DescribeDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeFileUploadSignature</p>
     * 
     * @param request DescribeFileUploadSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileUploadSignatureResponse
     */
    public DescribeFileUploadSignatureResponse describeFileUploadSignatureWithOptions(DescribeFileUploadSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileUploadSignature"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileUploadSignatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeFileUploadSignature</p>
     * 
     * @param request DescribeFileUploadSignatureRequest
     * @return DescribeFileUploadSignatureResponse
     */
    public DescribeFileUploadSignatureResponse describeFileUploadSignature(DescribeFileUploadSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileUploadSignatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取onemeta3.0的知识库统计信息</p>
     * 
     * @param request DescribeKnowledgeBaseStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKnowledgeBaseStatsResponse
     */
    public DescribeKnowledgeBaseStatsResponse describeKnowledgeBaseStatsWithOptions(DescribeKnowledgeBaseStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            query.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKnowledgeBaseStats"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKnowledgeBaseStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取onemeta3.0的知识库统计信息</p>
     * 
     * @param request DescribeKnowledgeBaseStatsRequest
     * @return DescribeKnowledgeBaseStatsResponse
     */
    public DescribeKnowledgeBaseStatsResponse describeKnowledgeBaseStats(DescribeKnowledgeBaseStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKnowledgeBaseStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库中的上传签名</p>
     * 
     * @param request DescribeKnowledgeBaseUploadSignatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKnowledgeBaseUploadSignatureResponse
     */
    public DescribeKnowledgeBaseUploadSignatureResponse describeKnowledgeBaseUploadSignatureWithOptions(DescribeKnowledgeBaseUploadSignatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            query.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKnowledgeBaseUploadSignature"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKnowledgeBaseUploadSignatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库中的上传签名</p>
     * 
     * @param request DescribeKnowledgeBaseUploadSignatureRequest
     * @return DescribeKnowledgeBaseUploadSignatureResponse
     */
    public DescribeKnowledgeBaseUploadSignatureResponse describeKnowledgeBaseUploadSignature(DescribeKnowledgeBaseUploadSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKnowledgeBaseUploadSignatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>FileUploadCallback</p>
     * 
     * @param request FileUploadCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileUploadCallbackResponse
     */
    public FileUploadCallbackResponse fileUploadCallbackWithOptions(FileUploadCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSize)) {
            query.put("FileSize", request.fileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            query.put("Filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadLocation)) {
            query.put("UploadLocation", request.uploadLocation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileUploadCallback"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileUploadCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>FileUploadCallback</p>
     * 
     * @param request FileUploadCallbackRequest
     * @return FileUploadCallbackResponse
     */
    public FileUploadCallbackResponse fileUploadCallback(FileUploadCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fileUploadCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 Airflow</p>
     * 
     * @param request GetAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAirflowResponse
     */
    public GetAirflowResponse getAirflowWithOptions(GetAirflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 Airflow</p>
     * 
     * @param request GetAirflowRequest
     * @return GetAirflowResponse
     */
    public GetAirflowResponse getAirflow(GetAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetChatContent</p>
     * 
     * @param request GetChatContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatContentResponse
     */
    public GetChatContentResponse getChatContentWithOptions(GetChatContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatContent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetChatContent</p>
     * 
     * @param request GetChatContentRequest
     * @return GetChatContentResponse
     */
    public GetChatContentResponse getChatContent(GetChatContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主账号下的子账号信息</p>
     * 
     * @param request GetDataAgentSubAccountInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataAgentSubAccountInfoResponse
     */
    public GetDataAgentSubAccountInfoResponse getDataAgentSubAccountInfoWithOptions(GetDataAgentSubAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAccountId)) {
            query.put("SubAccountId", request.subAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataAgentSubAccountInfo"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataAgentSubAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取主账号下的子账号信息</p>
     * 
     * @param request GetDataAgentSubAccountInfoRequest
     * @return GetDataAgentSubAccountInfoResponse
     */
    public GetDataAgentSubAccountInfoResponse getDataAgentSubAccountInfo(GetDataAgentSubAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataAgentSubAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间信息</p>
     * 
     * @param request GetDataAgentWorkspaceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataAgentWorkspaceInfoResponse
     */
    public GetDataAgentWorkspaceInfoResponse getDataAgentWorkspaceInfoWithOptions(GetDataAgentWorkspaceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataAgentWorkspaceInfo"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataAgentWorkspaceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间信息</p>
     * 
     * @param request GetDataAgentWorkspaceInfoRequest
     * @return GetDataAgentWorkspaceInfoResponse
     */
    public GetDataAgentWorkspaceInfoResponse getDataAgentWorkspaceInfo(GetDataAgentWorkspaceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataAgentWorkspaceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取uc的数据库目录</p>
     * 
     * @param request GetDataLakeCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataLakeCatalogResponse
     */
    public GetDataLakeCatalogResponse getDataLakeCatalogWithOptions(GetDataLakeCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataLakeCatalog"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataLakeCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取uc的数据库目录</p>
     * 
     * @param request GetDataLakeCatalogRequest
     * @return GetDataLakeCatalogResponse
     */
    public GetDataLakeCatalogResponse getDataLakeCatalog(GetDataLakeCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataLakeCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取UC的数据库</p>
     * 
     * @param request GetDataLakeDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataLakeDatabaseResponse
     */
    public GetDataLakeDatabaseResponse getDataLakeDatabaseWithOptions(GetDataLakeDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataLakeDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataLakeDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取UC的数据库</p>
     * 
     * @param request GetDataLakeDatabaseRequest
     * @return GetDataLakeDatabaseResponse
     */
    public GetDataLakeDatabaseResponse getDataLakeDatabase(GetDataLakeDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataLakeDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取湖仓自定义函数详细信息</p>
     * 
     * @param request GetDataLakeFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataLakeFunctionResponse
     */
    public GetDataLakeFunctionResponse getDataLakeFunctionWithOptions(GetDataLakeFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataLakeFunction"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataLakeFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取湖仓自定义函数详细信息</p>
     * 
     * @param request GetDataLakeFunctionRequest
     * @return GetDataLakeFunctionResponse
     */
    public GetDataLakeFunctionResponse getDataLakeFunction(GetDataLakeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataLakeFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取湖仓表分区详情</p>
     * 
     * @param tmpReq GetDataLakePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataLakePartitionResponse
     */
    public GetDataLakePartitionResponse getDataLakePartitionWithOptions(GetDataLakePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDataLakePartitionShrinkRequest request = new GetDataLakePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionValues)) {
            request.partitionValuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionValues, "PartitionValues", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValuesShrink)) {
            query.put("PartitionValues", request.partitionValuesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataLakePartition"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataLakePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取湖仓表分区详情</p>
     * 
     * @param request GetDataLakePartitionRequest
     * @return GetDataLakePartitionResponse
     */
    public GetDataLakePartitionResponse getDataLakePartition(GetDataLakePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataLakePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表信息</p>
     * 
     * @param request GetDataLakeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataLakeTableResponse
     */
    public GetDataLakeTableResponse getDataLakeTableWithOptions(GetDataLakeTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataLakeTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataLakeTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表信息</p>
     * 
     * @param request GetDataLakeTableRequest
     * @return GetDataLakeTableResponse
     */
    public GetDataLakeTableResponse getDataLakeTable(GetDataLakeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataLakeTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调度运行Notebook文件</p>
     * 
     * @param request GetNotebookAndSubmitTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotebookAndSubmitTaskResponse
     */
    public GetNotebookAndSubmitTaskResponse getNotebookAndSubmitTaskWithOptions(GetNotebookAndSubmitTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retry)) {
            body.put("Retry", request.retry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotebookAndSubmitTask"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotebookAndSubmitTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调度运行Notebook文件</p>
     * 
     * @param request GetNotebookAndSubmitTaskRequest
     * @return GetNotebookAndSubmitTaskResponse
     */
    public GetNotebookAndSubmitTaskResponse getNotebookAndSubmitTask(GetNotebookAndSubmitTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotebookAndSubmitTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看Notebook任务运行结果</p>
     * 
     * @param request GetNotebookTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotebookTaskStatusResponse
     */
    public GetNotebookTaskStatusResponse getNotebookTaskStatusWithOptions(GetNotebookTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotebookTaskStatus"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotebookTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看Notebook任务运行结果</p>
     * 
     * @param request GetNotebookTaskStatusRequest
     * @return GetNotebookTaskStatusResponse
     */
    public GetNotebookTaskStatusResponse getNotebookTaskStatus(GetNotebookTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotebookTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间发布配置</p>
     * 
     * @param request GetWorkspaceCodePublishSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceCodePublishSettingResponse
     */
    public GetWorkspaceCodePublishSettingResponse getWorkspaceCodePublishSettingWithOptions(GetWorkspaceCodePublishSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceCodePublishSetting"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceCodePublishSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间发布配置</p>
     * 
     * @param request GetWorkspaceCodePublishSettingRequest
     * @return GetWorkspaceCodePublishSettingResponse
     */
    public GetWorkspaceCodePublishSettingResponse getWorkspaceCodePublishSetting(GetWorkspaceCodePublishSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceCodePublishSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间配额</p>
     * 
     * @param request GetWorkspaceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceQuotaResponse
     */
    public GetWorkspaceQuotaResponse getWorkspaceQuotaWithOptions(GetWorkspaceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceQuota"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作空间配额</p>
     * 
     * @param request GetWorkspaceQuotaRequest
     * @return GetWorkspaceQuotaResponse
     */
    public GetWorkspaceQuotaResponse getWorkspaceQuota(GetWorkspaceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取可用的Airflow版本列表</p>
     * 
     * @param request ListAirflowVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAirflowVersionsResponse
     */
    public ListAirflowVersionsResponse listAirflowVersionsWithOptions(ListAirflowVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAirflowVersions"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAirflowVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取可用的Airflow版本列表</p>
     * 
     * @param request ListAirflowVersionsRequest
     * @return ListAirflowVersionsResponse
     */
    public ListAirflowVersionsResponse listAirflowVersions(ListAirflowVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAirflowVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源Airflow</p>
     * 
     * @param request ListAirflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAirflowsResponse
     */
    public ListAirflowsResponse listAirflowsWithOptions(ListAirflowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            query.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAirflows"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAirflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源Airflow</p>
     * 
     * @param request ListAirflowsRequest
     * @return ListAirflowsResponse
     */
    public ListAirflowsResponse listAirflows(ListAirflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAirflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCustomAgent</p>
     * 
     * @param request ListCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomAgentResponse
     */
    public ListCustomAgentResponse listCustomAgentWithOptions(ListCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryAllReleased)) {
            query.put("QueryAllReleased", request.queryAllReleased);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCustomAgent</p>
     * 
     * @param request ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    public ListCustomAgentResponse listCustomAgent(ListCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataAgentSession</p>
     * 
     * @param request ListDataAgentSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAgentSessionResponse
     */
    public ListDataAgentSessionResponse listDataAgentSessionWithOptions(ListDataAgentSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            query.put("CreateEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            query.put("CreateStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSaved)) {
            query.put("IsSaved", request.isSaved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAgentSession"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAgentSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataAgentSession</p>
     * 
     * @param request ListDataAgentSessionRequest
     * @return ListDataAgentSessionResponse
     */
    public ListDataAgentSessionResponse listDataAgentSession(ListDataAgentSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAgentSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取主账号下的空间（分页）</p>
     * 
     * @param request ListDataAgentWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAgentWorkspaceResponse
     */
    public ListDataAgentWorkspaceResponse listDataAgentWorkspaceWithOptions(ListDataAgentWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceType)) {
            query.put("WorkspaceType", request.workspaceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAgentWorkspace"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAgentWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取主账号下的空间（分页）</p>
     * 
     * @param request ListDataAgentWorkspaceRequest
     * @return ListDataAgentWorkspaceResponse
     */
    public ListDataAgentWorkspaceResponse listDataAgentWorkspace(ListDataAgentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAgentWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间所有成员</p>
     * 
     * @param request ListDataAgentWorkspaceMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAgentWorkspaceMemberResponse
     */
    public ListDataAgentWorkspaceMemberResponse listDataAgentWorkspaceMemberWithOptions(ListDataAgentWorkspaceMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMemberId)) {
            query.put("SearchMemberId", request.searchMemberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRoleName)) {
            query.put("SearchRoleName", request.searchRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAgentWorkspaceMember"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAgentWorkspaceMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间所有成员</p>
     * 
     * @param request ListDataAgentWorkspaceMemberRequest
     * @return ListDataAgentWorkspaceMemberResponse
     */
    public ListDataAgentWorkspaceMemberResponse listDataAgentWorkspaceMember(ListDataAgentWorkspaceMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAgentWorkspaceMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataCenterDatabase</p>
     * 
     * @param request ListDataCenterDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCenterDatabaseResponse
     */
    public ListDataCenterDatabaseResponse listDataCenterDatabaseWithOptions(ListDataCenterDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importType)) {
            query.put("ImportType", request.importType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCenterDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCenterDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataCenterDatabase</p>
     * 
     * @param request ListDataCenterDatabaseRequest
     * @return ListDataCenterDatabaseResponse
     */
    public ListDataCenterDatabaseResponse listDataCenterDatabase(ListDataCenterDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataCenterDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataCenterTable</p>
     * 
     * @param request ListDataCenterTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCenterTableResponse
     */
    public ListDataCenterTableResponse listDataCenterTableWithOptions(ListDataCenterTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importType)) {
            query.put("ImportType", request.importType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCenterTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCenterTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListDataCenterTable</p>
     * 
     * @param request ListDataCenterTableRequest
     * @return ListDataCenterTableResponse
     */
    public ListDataCenterTableResponse listDataCenterTable(ListDataCenterTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataCenterTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取uc的数据库目录列表</p>
     * 
     * @param request ListDataLakeCatalogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeCatalogResponse
     */
    public ListDataLakeCatalogResponse listDataLakeCatalogWithOptions(ListDataLakeCatalogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeCatalog"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取uc的数据库目录列表</p>
     * 
     * @param request ListDataLakeCatalogRequest
     * @return ListDataLakeCatalogResponse
     */
    public ListDataLakeCatalogResponse listDataLakeCatalog(ListDataLakeCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeCatalogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据库列表</p>
     * 
     * @param request ListDataLakeDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeDatabaseResponse
     */
    public ListDataLakeDatabaseResponse listDataLakeDatabaseWithOptions(ListDataLakeDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据库列表</p>
     * 
     * @param request ListDataLakeDatabaseRequest
     * @return ListDataLakeDatabaseResponse
     */
    public ListDataLakeDatabaseResponse listDataLakeDatabase(ListDataLakeDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖函数列表</p>
     * 
     * @param request ListDataLakeFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeFunctionResponse
     */
    public ListDataLakeFunctionResponse listDataLakeFunctionWithOptions(ListDataLakeFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNamePattern)) {
            query.put("FunctionNamePattern", request.functionNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeFunction"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖函数列表</p>
     * 
     * @param request ListDataLakeFunctionRequest
     * @return ListDataLakeFunctionResponse
     */
    public ListDataLakeFunctionResponse listDataLakeFunction(ListDataLakeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖函数名列表</p>
     * 
     * @param request ListDataLakeFunctionNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeFunctionNameResponse
     */
    public ListDataLakeFunctionNameResponse listDataLakeFunctionNameWithOptions(ListDataLakeFunctionNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNamePattern)) {
            query.put("FunctionNamePattern", request.functionNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeFunctionName"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeFunctionNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖函数名列表</p>
     * 
     * @param request ListDataLakeFunctionNameRequest
     * @return ListDataLakeFunctionNameResponse
     */
    public ListDataLakeFunctionNameResponse listDataLakeFunctionName(ListDataLakeFunctionNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeFunctionNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表分区列表</p>
     * 
     * @param tmpReq ListDataLakePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakePartitionResponse
     */
    public ListDataLakePartitionResponse listDataLakePartitionWithOptions(ListDataLakePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataLakePartitionShrinkRequest request = new ListDataLakePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partNames)) {
            request.partNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partNames, "PartNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partNamesShrink)) {
            body.put("PartNames", request.partNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakePartition"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表分区列表</p>
     * 
     * @param request ListDataLakePartitionRequest
     * @return ListDataLakePartitionResponse
     */
    public ListDataLakePartitionResponse listDataLakePartition(ListDataLakePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件获取数据湖表分区列表</p>
     * 
     * @param request ListDataLakePartitionByFilterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakePartitionByFilterResponse
     */
    public ListDataLakePartitionByFilterResponse listDataLakePartitionByFilterWithOptions(ListDataLakePartitionByFilterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakePartitionByFilter"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakePartitionByFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件获取数据湖表分区列表</p>
     * 
     * @param request ListDataLakePartitionByFilterRequest
     * @return ListDataLakePartitionByFilterResponse
     */
    public ListDataLakePartitionByFilterResponse listDataLakePartitionByFilter(ListDataLakePartitionByFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakePartitionByFilterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表分区名列表</p>
     * 
     * @param request ListDataLakePartitionNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakePartitionNameResponse
     */
    public ListDataLakePartitionNameResponse listDataLakePartitionNameWithOptions(ListDataLakePartitionNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakePartitionName"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakePartitionNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表分区名列表</p>
     * 
     * @param request ListDataLakePartitionNameRequest
     * @return ListDataLakePartitionNameResponse
     */
    public ListDataLakePartitionNameResponse listDataLakePartitionName(ListDataLakePartitionNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakePartitionNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表列表</p>
     * 
     * @param request ListDataLakeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeTableResponse
     */
    public ListDataLakeTableResponse listDataLakeTableWithOptions(ListDataLakeTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表列表</p>
     * 
     * @param request ListDataLakeTableRequest
     * @return ListDataLakeTableResponse
     */
    public ListDataLakeTableResponse listDataLakeTable(ListDataLakeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表名列表</p>
     * 
     * @param request ListDataLakeTableNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeTableNameResponse
     */
    public ListDataLakeTableNameResponse listDataLakeTableNameWithOptions(ListDataLakeTableNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeTableName"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeTableNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖表名列表</p>
     * 
     * @param request ListDataLakeTableNameRequest
     * @return ListDataLakeTableNameResponse
     */
    public ListDataLakeTableNameResponse listDataLakeTableName(ListDataLakeTableNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeTableNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表信息</p>
     * 
     * @param request ListDataLakeTablebaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLakeTablebaseInfoResponse
     */
    public ListDataLakeTablebaseInfoResponse listDataLakeTablebaseInfoWithOptions(ListDataLakeTablebaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rows)) {
            query.put("Rows", request.rows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLakeTablebaseInfo"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLakeTablebaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表信息</p>
     * 
     * @param request ListDataLakeTablebaseInfoRequest
     * @return ListDataLakeTablebaseInfoResponse
     */
    public ListDataLakeTablebaseInfoResponse listDataLakeTablebaseInfo(ListDataLakeTablebaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLakeTablebaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询onemeta3.0的知识库chunks</p>
     * 
     * @param request ListDocumentChunksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDocumentChunksResponse
     */
    public ListDocumentChunksResponse listDocumentChunksWithOptions(ListDocumentChunksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkTitlePattern)) {
            body.put("ChunkTitlePattern", request.chunkTitlePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFieldName)) {
            body.put("SortFieldName", request.sortFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDocumentChunks"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDocumentChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询onemeta3.0的知识库chunks</p>
     * 
     * @param request ListDocumentChunksRequest
     * @return ListDocumentChunksResponse
     */
    public ListDocumentChunksResponse listDocumentChunks(ListDocumentChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentChunksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档列表</p>
     * 
     * @param request ListDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocumentsWithOptions(ListDocumentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePattern)) {
            body.put("NamePattern", request.namePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFieldName)) {
            body.put("SortFieldName", request.sortFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDocuments"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档列表</p>
     * 
     * @param request ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocuments(ListDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListFileUpload</p>
     * 
     * @param request ListFileUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileUploadResponse
     */
    public ListFileUploadResponse listFileUploadWithOptions(ListFileUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callFrom)) {
            query.put("CallFrom", request.callFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dmsUnit)) {
            query.put("DmsUnit", request.dmsUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadLinkExpire)) {
            query.put("DownloadLinkExpire", request.downloadLinkExpire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCategory)) {
            query.put("FileCategory", request.fileCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFrom)) {
            query.put("FileFrom", request.fileFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            query.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileUpload"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListFileUpload</p>
     * 
     * @param request ListFileUploadRequest
     * @return ListFileUploadResponse
     */
    public ListFileUploadResponse listFileUpload(ListFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询onemeta3.0的知识库</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBasesWithOptions(ListKnowledgeBasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePattern)) {
            body.put("NamePattern", request.namePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFieldName)) {
            body.put("SortFieldName", request.sortFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBases"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询onemeta3.0的知识库</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKnowledgeBasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyCustomAgent</p>
     * 
     * @param tmpReq ModifyCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCustomAgentResponse
     */
    public ModifyCustomAgentResponse modifyCustomAgentWithOptions(ModifyCustomAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCustomAgentShrinkRequest request = new ModifyCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callbackConfig)) {
            request.callbackConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callbackConfig, "CallbackConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executionConfig)) {
            request.executionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executionConfig, "ExecutionConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeConfigList)) {
            request.knowledgeConfigListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeConfigList, "KnowledgeConfigList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTaskConfig)) {
            request.scheduleTaskConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTaskConfig, "ScheduleTaskConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackConfigShrink)) {
            query.put("CallbackConfig", request.callbackConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataJson)) {
            query.put("DataJson", request.dataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionConfigShrink)) {
            query.put("ExecutionConfig", request.executionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instruction)) {
            query.put("Instruction", request.instruction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledge)) {
            query.put("Knowledge", request.knowledge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeConfigListShrink)) {
            query.put("KnowledgeConfigList", request.knowledgeConfigListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTaskConfigShrink)) {
            query.put("ScheduleTaskConfig", request.scheduleTaskConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textReportConfig)) {
            query.put("TextReportConfig", request.textReportConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webReportConfig)) {
            query.put("WebReportConfig", request.webReportConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ModifyCustomAgent</p>
     * 
     * @param request ModifyCustomAgentRequest
     * @return ModifyCustomAgentResponse
     */
    public ModifyCustomAgentResponse modifyCustomAgent(ModifyCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OperateCustomAgent</p>
     * 
     * @param request OperateCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateCustomAgentResponse
     */
    public OperateCustomAgentResponse operateCustomAgentWithOptions(OperateCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateCustomAgent"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OperateCustomAgent</p>
     * 
     * @param request OperateCustomAgentRequest
     * @return OperateCustomAgentResponse
     */
    public OperateCustomAgentResponse operateCustomAgent(OperateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新部署Airflow实例</p>
     * 
     * @param request RedeployAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RedeployAirflowResponse
     */
    public RedeployAirflowResponse redeployAirflowWithOptions(RedeployAirflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedeployAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedeployAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新部署Airflow实例</p>
     * 
     * @param request RedeployAirflowRequest
     * @return RedeployAirflowResponse
     */
    public RedeployAirflowResponse redeployAirflow(RedeployAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.redeployAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从空间中移除用户</p>
     * 
     * @param request RemoveUserToDataAgentWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserToDataAgentWorkspaceResponse
     */
    public RemoveUserToDataAgentWorkspaceResponse removeUserToDataAgentWorkspaceWithOptions(RemoveUserToDataAgentWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserToDataAgentWorkspace"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserToDataAgentWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从空间中移除用户</p>
     * 
     * @param request RemoveUserToDataAgentWorkspaceRequest
     * @return RemoveUserToDataAgentWorkspaceResponse
     */
    public RemoveUserToDataAgentWorkspaceResponse removeUserToDataAgentWorkspace(RemoveUserToDataAgentWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserToDataAgentWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SendChatMessage</p>
     * 
     * @param tmpReq SendChatMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendChatMessageResponse
     */
    public SendChatMessageResponse sendChatMessageWithOptions(SendChatMessageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatMessageShrinkRequest request = new SendChatMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSource)) {
            request.dataSourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSource, "DataSource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataSources)) {
            request.dataSourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataSources, "DataSources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionConfig)) {
            request.sessionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionConfig, "SessionConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceShrink)) {
            query.put("DataSource", request.dataSourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourcesShrink)) {
            query.put("DataSources", request.dataSourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentSessionId)) {
            query.put("ParentSessionId", request.parentSessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            query.put("Question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotedMessage)) {
            query.put("QuotedMessage", request.quotedMessage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyTo)) {
            query.put("ReplyTo", request.replyTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionConfigShrink)) {
            query.put("SessionConfig", request.sessionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatMessage"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SendChatMessage</p>
     * 
     * @param request SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    public SendChatMessageResponse sendChatMessage(SendChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置工作空间代码发布配置</p>
     * 
     * @param request SetWorkspaceCodePublishSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWorkspaceCodePublishSettingResponse
     */
    public SetWorkspaceCodePublishSettingResponse setWorkspaceCodePublishSettingWithOptions(SetWorkspaceCodePublishSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWorkspaceCodePublishSetting"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWorkspaceCodePublishSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置工作空间代码发布配置</p>
     * 
     * @param request SetWorkspaceCodePublishSettingRequest
     * @return SetWorkspaceCodePublishSettingResponse
     */
    public SetWorkspaceCodePublishSettingResponse setWorkspaceCodePublishSetting(SetWorkspaceCodePublishSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWorkspaceCodePublishSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置工作空间配额</p>
     * 
     * @param request SetWorkspaceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWorkspaceQuotaResponse
     */
    public SetWorkspaceQuotaResponse setWorkspaceQuotaWithOptions(SetWorkspaceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cuQuota)) {
            query.put("CuQuota", request.cuQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWorkspaceQuota"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWorkspaceQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置工作空间配额</p>
     * 
     * @param request SetWorkspaceQuotaRequest
     * @return SetWorkspaceQuotaResponse
     */
    public SetWorkspaceQuotaResponse setWorkspaceQuota(SetWorkspaceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWorkspaceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateAirflow</p>
     * 
     * @param tmpReq UpdateAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAirflowResponse
     */
    public UpdateAirflowResponse updateAirflowWithOptions(UpdateAirflowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAirflowShrinkRequest request = new UpdateAirflowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataMountInfoList)) {
            request.dataMountInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataMountInfoList, "DataMountInfoList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airflowId)) {
            query.put("AirflowId", request.airflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.airflowName)) {
            query.put("AirflowName", request.airflowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSpec)) {
            query.put("AppSpec", request.appSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagsDir)) {
            query.put("DagsDir", request.dagsDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataMountInfoListShrink)) {
            query.put("DataMountInfoList", request.dataMountInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableServerless)) {
            query.put("EnableServerless", request.enableServerless);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gracefulShutdownTimeout)) {
            query.put("GracefulShutdownTimeout", request.gracefulShutdownTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginsDir)) {
            query.put("PluginsDir", request.pluginsDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requirementFile)) {
            query.put("RequirementFile", request.requirementFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startupFile)) {
            query.put("StartupFile", request.startupFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerServerlessReplicas)) {
            query.put("WorkerServerlessReplicas", request.workerServerlessReplicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAirflow"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAirflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateAirflow</p>
     * 
     * @param request UpdateAirflowRequest
     * @return UpdateAirflowResponse
     */
    public UpdateAirflowResponse updateAirflow(UpdateAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAirflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新空间的信息</p>
     * 
     * @param request UpdateDataAgentSpaceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataAgentSpaceInfoResponse
     */
    public UpdateDataAgentSpaceInfoResponse updateDataAgentSpaceInfoWithOptions(UpdateDataAgentSpaceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSessionShareEnabled)) {
            query.put("IsSessionShareEnabled", request.isSessionShareEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceDesc)) {
            query.put("WorkspaceDesc", request.workspaceDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataAgentSpaceInfo"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataAgentSpaceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新空间的信息</p>
     * 
     * @param request UpdateDataAgentSpaceInfoRequest
     * @return UpdateDataAgentSpaceInfoResponse
     */
    public UpdateDataAgentSpaceInfoResponse updateDataAgentSpaceInfo(UpdateDataAgentSpaceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataAgentSpaceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调整空间成员的角色</p>
     * 
     * @param request UpdateDataAgentWorkspaceMemberRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataAgentWorkspaceMemberRoleResponse
     */
    public UpdateDataAgentWorkspaceMemberRoleResponse updateDataAgentWorkspaceMemberRoleWithOptions(UpdateDataAgentWorkspaceMemberRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DMSUnit)) {
            query.put("DMSUnit", request.DMSUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataAgentWorkspaceMemberRole"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataAgentWorkspaceMemberRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调整空间成员的角色</p>
     * 
     * @param request UpdateDataAgentWorkspaceMemberRoleRequest
     * @return UpdateDataAgentWorkspaceMemberRoleResponse
     */
    public UpdateDataAgentWorkspaceMemberRoleResponse updateDataAgentWorkspaceMemberRole(UpdateDataAgentWorkspaceMemberRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataAgentWorkspaceMemberRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓数据库</p>
     * 
     * @param tmpReq UpdateDataLakeDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataLakeDatabaseResponse
     */
    public UpdateDataLakeDatabaseResponse updateDataLakeDatabaseWithOptions(UpdateDataLakeDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataLakeDatabaseShrinkRequest request = new UpdateDataLakeDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataLakeDatabase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataLakeDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓数据库</p>
     * 
     * @param request UpdateDataLakeDatabaseRequest
     * @return UpdateDataLakeDatabaseResponse
     */
    public UpdateDataLakeDatabaseResponse updateDataLakeDatabase(UpdateDataLakeDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataLakeDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓自定义函数</p>
     * 
     * @param tmpReq UpdateDataLakeFunctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataLakeFunctionResponse
     */
    public UpdateDataLakeFunctionResponse updateDataLakeFunctionWithOptions(UpdateDataLakeFunctionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataLakeFunctionShrinkRequest request = new UpdateDataLakeFunctionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.functionInput)) {
            request.functionInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.functionInput, "FunctionInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionInputShrink)) {
            body.put("FunctionInput", request.functionInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataLakeFunction"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataLakeFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓自定义函数</p>
     * 
     * @param request UpdateDataLakeFunctionRequest
     * @return UpdateDataLakeFunctionResponse
     */
    public UpdateDataLakeFunctionResponse updateDataLakeFunction(UpdateDataLakeFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataLakeFunctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓表分区</p>
     * 
     * @param tmpReq UpdateDataLakePartitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataLakePartitionResponse
     */
    public UpdateDataLakePartitionResponse updateDataLakePartitionWithOptions(UpdateDataLakePartitionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataLakePartitionShrinkRequest request = new UpdateDataLakePartitionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionInput)) {
            request.partitionInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionInput, "PartitionInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputShrink)) {
            body.put("PartitionInput", request.partitionInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataLakePartition"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataLakePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓表分区</p>
     * 
     * @param request UpdateDataLakePartitionRequest
     * @return UpdateDataLakePartitionResponse
     */
    public UpdateDataLakePartitionResponse updateDataLakePartition(UpdateDataLakePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataLakePartitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓表信息</p>
     * 
     * @param tmpReq UpdateDataLakeTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataLakeTableResponse
     */
    public UpdateDataLakeTableResponse updateDataLakeTableWithOptions(UpdateDataLakeTableRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataLakeTableShrinkRequest request = new UpdateDataLakeTableShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableInput)) {
            request.tableInputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableInput, "TableInput", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogName)) {
            query.put("CatalogName", request.catalogName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableInputShrink)) {
            body.put("TableInput", request.tableInputShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataLakeTable"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataLakeTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新湖仓表信息</p>
     * 
     * @param request UpdateDataLakeTableRequest
     * @return UpdateDataLakeTableResponse
     */
    public UpdateDataLakeTableResponse updateDataLakeTable(UpdateDataLakeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataLakeTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档</p>
     * 
     * @param request UpdateDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocumentWithOptions(UpdateDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            body.put("NewDescription", request.newDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDocument"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新文档</p>
     * 
     * @param request UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocument(UpdateDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新onemeta3.0的知识库</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBaseWithOptions(UpdateKnowledgeBaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            query.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新onemeta3.0的知识库</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBase(UpdateKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateKnowledgeBaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传文档</p>
     * 
     * @param tmpReq UploadDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocumentWithOptions(UploadDocumentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadDocumentShrinkRequest request = new UploadDocumentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.separators)) {
            request.separatorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.separators, "Separators", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkOverlap)) {
            body.put("ChunkOverlap", request.chunkOverlap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkSize)) {
            body.put("ChunkSize", request.chunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentLoaderName)) {
            body.put("DocumentLoaderName", request.documentLoaderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separatorsShrink)) {
            body.put("Separators", request.separatorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitterModel)) {
            body.put("SplitterModel", request.splitterModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textSplitterName)) {
            body.put("TextSplitterName", request.textSplitterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vlEnhance)) {
            body.put("VlEnhance", request.vlEnhance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhTitleEnhance)) {
            body.put("ZhTitleEnhance", request.zhTitleEnhance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDocument"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传文档</p>
     * 
     * @param request UploadDocumentRequest
     * @return UploadDocumentResponse
     */
    public UploadDocumentResponse uploadDocument(UploadDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新或插入onemeta3.0的知识库chunks</p>
     * 
     * @param request UpsertDocumentChunksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertDocumentChunksResponse
     */
    public UpsertDocumentChunksResponse upsertDocumentChunksWithOptions(UpsertDocumentChunksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunks)) {
            body.put("Chunks", request.chunks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentName)) {
            body.put("DocumentName", request.documentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertDocumentChunks"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertDocumentChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新或插入onemeta3.0的知识库chunks</p>
     * 
     * @param request UpsertDocumentChunksRequest
     * @return UpsertDocumentChunksResponse
     */
    public UpsertDocumentChunksResponse upsertDocumentChunks(UpsertDocumentChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertDocumentChunksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间异步操作日志查询接口</p>
     * 
     * @param request WorkspaceActionLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WorkspaceActionLogResponse
     */
    public WorkspaceActionLogResponse workspaceActionLogWithOptions(WorkspaceActionLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WorkspaceActionLog"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WorkspaceActionLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间异步操作日志查询接口</p>
     * 
     * @param request WorkspaceActionLogRequest
     * @return WorkspaceActionLogResponse
     */
    public WorkspaceActionLogResponse workspaceActionLog(WorkspaceActionLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceActionLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间异步操作状态查询接口</p>
     * 
     * @param request WorkspaceActionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WorkspaceActionStatusResponse
     */
    public WorkspaceActionStatusResponse workspaceActionStatusWithOptions(WorkspaceActionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WorkspaceActionStatus"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WorkspaceActionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间异步操作状态查询接口</p>
     * 
     * @param request WorkspaceActionStatusRequest
     * @return WorkspaceActionStatusResponse
     */
    public WorkspaceActionStatusResponse workspaceActionStatus(WorkspaceActionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceActionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间代码发布。这是个异步接口，请求返回一个key，请根据key查询 WorkspaceActionStatus接口获取状态</p>
     * 
     * @param request WorkspaceCodePublishRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WorkspaceCodePublishResponse
     */
    public WorkspaceCodePublishResponse workspaceCodePublishWithOptions(WorkspaceCodePublishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WorkspaceCodePublish"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WorkspaceCodePublishResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>工作空间代码发布。这是个异步接口，请求返回一个key，请根据key查询 WorkspaceActionStatus接口获取状态</p>
     * 
     * @param request WorkspaceCodePublishRequest
     * @return WorkspaceCodePublishResponse
     */
    public WorkspaceCodePublishResponse workspaceCodePublish(WorkspaceCodePublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceCodePublishWithOptions(request, runtime);
    }
}
