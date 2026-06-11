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
     * <p>Adds a user to a specified workspace.</p>
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
     * <p>Adds a user to a specified workspace.</p>
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
     * <p>Creates partitions for a data lake table in a batch.</p>
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
     * <p>Creates partitions for a data lake table in a batch.</p>
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
     * <p>Batch deletes partitions from a data lake table.</p>
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
     * <p>Batch deletes partitions from a data lake table.</p>
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
     * <p>Update partitions in a data lake table in batch.</p>
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
     * <p>Update partitions in a data lake table in batch.</p>
     * 
     * @param request BatchUpdateDataLakePartitionsRequest
     * @return BatchUpdateDataLakePartitionsResponse
     */
    public BatchUpdateDataLakePartitionsResponse batchUpdateDataLakePartitions(BatchUpdateDataLakePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUpdateDataLakePartitionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Configure the airflow\.cfg file for DMS Airflow.</p>
     * 
     * <b>summary</b> : 
     * <p>Update an Airflow instance\&quot;s custom configuration</p>
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
     * <b>description</b> :
     * <p>Configure the airflow\.cfg file for DMS Airflow.</p>
     * 
     * <b>summary</b> : 
     * <p>Update an Airflow instance\&quot;s custom configuration</p>
     * 
     * @param request ConfigAirflowRequest
     * @return ConfigAirflowResponse
     */
    public ConfigAirflowResponse configAirflow(ConfigAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configAirflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an Airflow instance in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Airflow instance in a workspace.</p>
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
     * <b>description</b> :
     * <p>Creates an Airflow instance in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an Airflow instance in a workspace.</p>
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
     * <p>Obtains logon credentials for an Airflow instance hosted by Data Management Service (DMS). Use the returned token and host endpoint to construct a logon URL for the Airflow web UI.</p>
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
     * <p>Obtains logon credentials for an Airflow instance hosted by Data Management Service (DMS). Use the returned token and host endpoint to construct a logon URL for the Airflow web UI.</p>
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
     * <p>Create a custom agent in your personal space or a workspace.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.relatedSessionId)) {
            query.put("RelatedSessionId", request.relatedSessionId);
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
     * <p>Create a custom agent in your personal space or a workspace.</p>
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
     * <p>Creates a DataAgent knowledge base. The knowledge base creator has read and write permissions. Other workspace members have permission to use it.</p>
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
     * <p>Creates a DataAgent knowledge base. The knowledge base creator has read and write permissions. Other workspace members have permission to use it.</p>
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
     * <p>Create a DataAgent session</p>
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
     * <p>Create a DataAgent session</p>
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
     * <p>Creates a DataAgent workspace.</p>
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
     * <p>Creates a DataAgent workspace.</p>
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
     * <p>Creates a data lake database.</p>
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
     * <p>Creates a data lake database.</p>
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
     * <p>Creates a user-defined function (UDF) for a data lake.</p>
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
     * <p>Creates a user-defined function (UDF) for a data lake.</p>
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
     * <p>Creates a partition for a data lake table.</p>
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
     * <p>Creates a partition for a data lake table.</p>
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
     * <p>Creates a data lake table in Data Management (DMS).</p>
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
     * <p>Creates a data lake table in Data Management (DMS).</p>
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
     * <p>Deletes an Airflow instance.</p>
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
     * <p>Deletes an Airflow instance.</p>
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
     * <p>Delete a custom agent in your personal workspace or a shared workspace. Note: Only custom agents that are newly created or offline can be deleted.</p>
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
     * <p>Delete a custom agent in your personal workspace or a shared workspace. Note: Only custom agents that are newly created or offline can be deleted.</p>
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
     * <p>Deletes a DataAgent knowledge base.</p>
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
     * <p>Deletes a DataAgent knowledge base.</p>
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
     * <p>Deletes a DataAgent workspace.</p>
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
     * <p>Deletes a DataAgent workspace.</p>
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
     * <p>Deletes a data lake database.</p>
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
     * <p>Deletes a data lake database.</p>
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
     * <p>Deletes a user-defined function in a data lake.</p>
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
     * <p>Deletes a user-defined function in a data lake.</p>
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
     * <p>Deletes a partition from a data lake table.</p>
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
     * <p>Deletes a partition from a data lake table.</p>
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
     * <p>Deletes a data lake table.</p>
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
     * <p>Deletes a data lake table.</p>
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
     * <p>Deletes a document from a specified knowledge base.</p>
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
     * <p>Deletes a document from a specified knowledge base.</p>
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
     * <p>Deletes chunks from a document in a knowledge base.</p>
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
     * <p>Deletes chunks from a document in a knowledge base.</p>
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
     * <b>description</b> :
     * <p>This operation permanently removes a specified code file or directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a code file or directory from a workspace.</p>
     * 
     * @param request DeleteWorkspaceCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceCodeResponse
     */
    public DeleteWorkspaceCodeResponse deleteWorkspaceCodeWithOptions(DeleteWorkspaceCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repo)) {
            query.put("Repo", request.repo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.symlink)) {
            query.put("Symlink", request.symlink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceCode"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation permanently removes a specified code file or directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a code file or directory from a workspace.</p>
     * 
     * @param request DeleteWorkspaceCodeRequest
     * @return DeleteWorkspaceCodeResponse
     */
    public DeleteWorkspaceCodeResponse deleteWorkspaceCode(DeleteWorkspaceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkspaceCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p><code>DescribeCustomAgent</code> retrieves the details of a custom agent by its agent ID.</p>
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
     * <p><code>DescribeCustomAgent</code> retrieves the details of a custom agent by its agent ID.</p>
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
     * <p>Gets the details of a DataAgent session.</p>
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
     * <p>Gets the details of a DataAgent session.</p>
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
     * <p>Retrieves the details of a specific document.</p>
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
     * <p>Retrieves the details of a specific document.</p>
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
     * <p>Retrieves the statistics of a knowledge base.</p>
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
     * <p>Retrieves the statistics of a knowledge base.</p>
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
     * <p>Generates a signature to upload a document to a knowledge base.</p>
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
     * <p>Generates a signature to upload a document to a knowledge base.</p>
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
     * <p>Queries the configuration and status of an Airflow instance.</p>
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
     * <p>Queries the configuration and status of an Airflow instance.</p>
     * 
     * @param request GetAirflowRequest
     * @return GetAirflowResponse
     */
    public GetAirflowResponse getAirflow(GetAirflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAirflowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The response is an SSE stream. Each event follows the<code>SSEEvent</code> schema and includes metadata, such as the message level.</li>
     * <li>The <code>content</code> field contains either message text or a JSON object, as determined by the <code>content_type</code> field.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves chat content from a specific checkpoint by specifying a session ID and an agent ID.</p>
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
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The response is an SSE stream. Each event follows the<code>SSEEvent</code> schema and includes metadata, such as the message level.</li>
     * <li>The <code>content</code> field contains either message text or a JSON object, as determined by the <code>content_type</code> field.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves chat content from a specific checkpoint by specifying a session ID and an agent ID.</p>
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
     * <p>Retrieves information about a RAM user that belongs to an Alibaba Cloud account.</p>
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
     * <p>Retrieves information about a RAM user that belongs to an Alibaba Cloud account.</p>
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
     * <p>Retrieves workspace details.</p>
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
     * <p>Retrieves workspace details.</p>
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
     * <p>Retrieves the data catalog of a data lake.</p>
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
     * <p>Retrieves the data catalog of a data lake.</p>
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
     * <p>Retrieves information about a database in a data lake.</p>
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
     * <p>Retrieves information about a database in a data lake.</p>
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
     * <p>Retrieves the details of a user-defined function in a data lake.</p>
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
     * <p>Retrieves the details of a user-defined function in a data lake.</p>
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
     * <p>Retrieves the details of a data lakehouse table partition.</p>
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
     * <p>Retrieves the details of a data lakehouse table partition.</p>
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
     * <p>Retrieves information about a table in a data lake.</p>
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
     * <p>Retrieves information about a table in a data lake.</p>
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
     * <p>Submits a task to schedule and run a Notebook file.</p>
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
     * <p>Submits a task to schedule and run a Notebook file.</p>
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
     * <p>Retrieves the execution status of a Notebook task.</p>
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
     * <p>Retrieves the execution status of a Notebook task.</p>
     * 
     * @param request GetNotebookTaskStatusRequest
     * @return GetNotebookTaskStatusResponse
     */
    public GetNotebookTaskStatusResponse getNotebookTaskStatus(GetNotebookTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotebookTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the content of a specified code file from a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the content of a code file from a workspace. The response header includes the file\&quot;s modification time (<code>mtime</code>).</p>
     * 
     * @param request GetWorkspaceCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceCodeResponse
     */
    public GetWorkspaceCodeResponse getWorkspaceCodeWithOptions(GetWorkspaceCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iac)) {
            query.put("Iac", request.iac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaceCode"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the content of a specified code file from a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the content of a code file from a workspace. The response header includes the file\&quot;s modification time (<code>mtime</code>).</p>
     * 
     * @param request GetWorkspaceCodeRequest
     * @return GetWorkspaceCodeResponse
     */
    public GetWorkspaceCodeResponse getWorkspaceCode(GetWorkspaceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the deployment configuration of a workspace. The configuration includes details such as repository and branch information, and directories to exclude.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the deployment configuration of a workspace.</p>
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
     * <b>description</b> :
     * <p>This operation retrieves the deployment configuration of a workspace. The configuration includes details such as repository and branch information, and directories to exclude.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the deployment configuration of a workspace.</p>
     * 
     * @param request GetWorkspaceCodePublishSettingRequest
     * @return GetWorkspaceCodePublishSettingResponse
     */
    public GetWorkspaceCodePublishSettingResponse getWorkspaceCodePublishSetting(GetWorkspaceCodePublishSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceCodePublishSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the resource quotas and instance status for a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns the quota for a workspace.</p>
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
     * <b>description</b> :
     * <p>Retrieves the resource quotas and instance status for a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns the quota for a workspace.</p>
     * 
     * @param request GetWorkspaceQuotaRequest
     * @return GetWorkspaceQuotaResponse
     */
    public GetWorkspaceQuotaResponse getWorkspaceQuota(GetWorkspaceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkspaceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the available Airflow versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the available Airflow versions.</p>
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
     * <b>description</b> :
     * <p>Lists the available Airflow versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the available Airflow versions.</p>
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
     * <p>Retrieves a list of Airflow instances in a workspace.</p>
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
     * <p>Retrieves a list of Airflow instances in a workspace.</p>
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
     * <p>ListCustomAgent returns a list of all custom agents from the personal space and workspaces.</p>
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
     * <p>ListCustomAgent returns a list of all custom agents from the personal space and workspaces.</p>
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
     * <p>Retrieve a list of Data Agent session descriptions.</p>
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
     * <p>Retrieve a list of Data Agent session descriptions.</p>
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
     * <p>Retrieves paginated collaboration workspaces for an Alibaba Cloud account.</p>
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
     * <p>Retrieves paginated collaboration workspaces for an Alibaba Cloud account.</p>
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
     * <p>Lists all members in a workspace.</p>
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
     * <p>Lists all members in a workspace.</p>
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
     * <p>Lists user-uploaded files in a data center, excluding databases.</p>
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
     * <p>Lists user-uploaded files in a data center, excluding databases.</p>
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
     * <p>Retrieves a list of user-uploaded tables from the data center, for file types only.</p>
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
     * <p>Retrieves a list of user-uploaded tables from the data center, for file types only.</p>
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
     * <p>Retrieves a list of data lake catalogs.</p>
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
     * <p>Retrieves a list of data lake catalogs.</p>
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
     * <p>Retrieves a list of databases in a data lake.</p>
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
     * <p>Retrieves a list of databases in a data lake.</p>
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
     * <p>Retrieves a list of data lake functions.</p>
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
     * <p>Retrieves a list of data lake functions.</p>
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
     * <p>Retrieves a list of data lake function names.</p>
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
     * <p>Retrieves a list of data lake function names.</p>
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
     * <p>Retrieves the list of partitions of a data lake table.</p>
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
     * <p>Retrieves the list of partitions of a data lake table.</p>
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
     * <p>Retrieves a list of partitions for a data lake table based on filter conditions.</p>
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
     * <p>Retrieves a list of partitions for a data lake table based on filter conditions.</p>
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
     * <p>Retrieves a list of partition names for a data lake table.</p>
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
     * <p>Retrieves a list of partition names for a data lake table.</p>
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
     * <p>Retrieves a list of data lake tables.</p>
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
     * <p>Retrieves a list of data lake tables.</p>
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
     * <p>Retrieves a list of data lake table names.</p>
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
     * <p>Retrieves a list of data lake table names.</p>
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
     * <p>Retrieves the basic information about tables in a data lake.</p>
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
     * <p>Retrieves the basic information about tables in a data lake.</p>
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
     * <p>Queries a list of chunks.</p>
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
     * <p>Queries a list of chunks.</p>
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
     * <p>Lists the documents in a knowledge base.</p>
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
     * <p>Lists the documents in a knowledge base.</p>
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
     * <p>Returns a paginated list of knowledge bases.</p>
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
     * <p>Returns a paginated list of knowledge bases.</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKnowledgeBasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation lists the code files and directories at a specified path in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists code files and directories at a specified path in a workspace.</p>
     * 
     * @param request ListWorkspaceCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspaceCodeResponse
     */
    public ListWorkspaceCodeResponse listWorkspaceCodeWithOptions(ListWorkspaceCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaceCode"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation lists the code files and directories at a specified path in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists code files and directories at a specified path in a workspace.</p>
     * 
     * @param request ListWorkspaceCodeRequest
     * @return ListWorkspaceCodeResponse
     */
    public ListWorkspaceCodeResponse listWorkspaceCode(ListWorkspaceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkspaceCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify a custom agent in a personal space or workspace</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.relatedSessionId)) {
            query.put("RelatedSessionId", request.relatedSessionId);
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
     * <p>Modify a custom agent in a personal space or workspace</p>
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
     * <p>Operate custom agents in personal spaces and workspaces.</p>
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
     * <p>Operate custom agents in personal spaces and workspaces.</p>
     * 
     * @param request OperateCustomAgentRequest
     * @return OperateCustomAgentResponse
     */
    public OperateCustomAgentResponse operateCustomAgent(OperateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Redeploys an Airflow instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Redeploy an Airflow instance</p>
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
     * <b>description</b> :
     * <p>Redeploys an Airflow instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Redeploy an Airflow instance</p>
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
     * <p>Removes a user from a workspace.</p>
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
     * <p>Removes a user from a workspace.</p>
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
     * <p>Query a knowledge base</p>
     * 
     * @param request RetrieveKnowledgeBaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveKnowledgeBaseResponse
     */
    public RetrieveKnowledgeBaseResponse retrieveKnowledgeBaseWithOptions(RetrieveKnowledgeBaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearch)) {
            body.put("HybridSearch", request.hybridSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearchArgs)) {
            body.put("HybridSearchArgs", request.hybridSearchArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMetadataFields)) {
            body.put("IncludeMetadataFields", request.includeMetadataFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeVector)) {
            body.put("IncludeVector", request.includeVector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUuid)) {
            body.put("KbUuid", request.kbUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallWindow)) {
            body.put("RecallWindow", request.recallWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankFactor)) {
            body.put("RerankFactor", request.rerankFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("TopK", request.topK);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetrieveKnowledgeBase"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a knowledge base</p>
     * 
     * @param request RetrieveKnowledgeBaseRequest
     * @return RetrieveKnowledgeBaseResponse
     */
    public RetrieveKnowledgeBaseResponse retrieveKnowledgeBase(RetrieveKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retrieveKnowledgeBaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Saves code in a workspace and optionally publishes it to a repository.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves code in a workspace and creates the file if it does not exist.</p>
     * 
     * @param request SaveWorkspaceCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveWorkspaceCodeResponse
     */
    public SaveWorkspaceCodeResponse saveWorkspaceCodeWithOptions(SaveWorkspaceCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iac)) {
            body.put("Iac", request.iac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mtime)) {
            body.put("Mtime", request.mtime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.repo)) {
            body.put("Repo", request.repo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveWorkspaceCode"),
            new TeaPair("version", "2025-04-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveWorkspaceCodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Saves code in a workspace and optionally publishes it to a repository.</p>
     * 
     * <b>summary</b> : 
     * <p>Saves code in a workspace and creates the file if it does not exist.</p>
     * 
     * @param request SaveWorkspaceCodeRequest
     * @return SaveWorkspaceCodeResponse
     */
    public SaveWorkspaceCodeResponse saveWorkspaceCode(SaveWorkspaceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveWorkspaceCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The <code>agent_id</code> and <code>session_id</code> fields are required.</li>
     * <li>The <code>message_type</code> field defaults to <code>primary</code>. Set it to <code>additional</code> to append information or to <code>cancel</code> to end the session.</li>
     * <li>The <code>reply_to</code> field specifies which agent message the current message is a response to. It defaults to <code>0</code>.</li>
     * <li>When <code>message_type</code> is <code>additional</code>, the <code>question</code> field is required.</li>
     * <li>Use the <code>quoted_message</code> field to reference a previous user message.</li>
     * <li>The optional fields <code>data_source</code>, <code>dms_user</code>, <code>db_metadata</code>, and <code>session_config</code> provide more detailed context.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a user message to a specified session or ends the session.</p>
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
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>The <code>agent_id</code> and <code>session_id</code> fields are required.</li>
     * <li>The <code>message_type</code> field defaults to <code>primary</code>. Set it to <code>additional</code> to append information or to <code>cancel</code> to end the session.</li>
     * <li>The <code>reply_to</code> field specifies which agent message the current message is a response to. It defaults to <code>0</code>.</li>
     * <li>When <code>message_type</code> is <code>additional</code>, the <code>question</code> field is required.</li>
     * <li>Use the <code>quoted_message</code> field to reference a previous user message.</li>
     * <li>The optional fields <code>data_source</code>, <code>dms_user</code>, <code>db_metadata</code>, and <code>session_config</code> provide more detailed context.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a user message to a specified session or ends the session.</p>
     * 
     * @param request SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    public SendChatMessageResponse sendChatMessage(SendChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendChatMessageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets the default code deployment configuration for a workspace. This configuration includes the Git repository branch and the directories to exclude from deployment.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the code deployment configuration for a workspace. This is an asynchronous operation that returns a key. Use this key to query the operation\&quot;s status by calling the WorkspaceActionStatus operation.</p>
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
     * <b>description</b> :
     * <p>Sets the default code deployment configuration for a workspace. This configuration includes the Git repository branch and the directories to exclude from deployment.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the code deployment configuration for a workspace. This is an asynchronous operation that returns a key. Use this key to query the operation\&quot;s status by calling the WorkspaceActionStatus operation.</p>
     * 
     * @param request SetWorkspaceCodePublishSettingRequest
     * @return SetWorkspaceCodePublishSettingResponse
     */
    public SetWorkspaceCodePublishSettingResponse setWorkspaceCodePublishSetting(SetWorkspaceCodePublishSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWorkspaceCodePublishSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets the quota for a specific workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for a workspace.</p>
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
     * <b>description</b> :
     * <p>Sets the quota for a specific workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the quota for a workspace.</p>
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
     * <p>Updates the properties of an Airflow instance.</p>
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
     * <p>Updates the properties of an Airflow instance.</p>
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
     * <p>Updates workspace information.</p>
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
     * <p>Updates workspace information.</p>
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
     * <p>Changes the role of a workspace member.</p>
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
     * <p>Changes the role of a workspace member.</p>
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
     * <p>Updates the information of a data lakehouse database.</p>
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
     * <p>Updates the information of a data lakehouse database.</p>
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
     * <p>Update a user-defined function in a data lake.</p>
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
     * <p>Update a user-defined function in a data lake.</p>
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
     * <p>Updates the partition information of a data lake table.</p>
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
     * <p>Updates the partition information of a data lake table.</p>
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
     * <p>Updates the information of a data lake table.</p>
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
     * <p>Updates the information of a data lake table.</p>
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
     * <p>Updates the description of a document.</p>
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
     * <p>Updates the description of a document.</p>
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
     * <p>Updates a knowledge base.</p>
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
     * <p>Updates a knowledge base.</p>
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
     * <p>Uploads a document to a knowledge base.</p>
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
     * <p>Uploads a document to a knowledge base.</p>
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
     * <p>Upserts document chunks into a knowledge base.</p>
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
     * <p>Upserts document chunks into a knowledge base.</p>
     * 
     * @param request UpsertDocumentChunksRequest
     * @return UpsertDocumentChunksResponse
     */
    public UpsertDocumentChunksResponse upsertDocumentChunks(UpsertDocumentChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertDocumentChunksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Pass the <code>key</code> to view the execution log of the corresponding asynchronous task. Use this API for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an asynchronous task in a workspace.</p>
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
     * <b>description</b> :
     * <p>Pass the <code>key</code> to view the execution log of the corresponding asynchronous task. Use this API for troubleshooting.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the log of an asynchronous task in a workspace.</p>
     * 
     * @param request WorkspaceActionLogRequest
     * @return WorkspaceActionLogResponse
     */
    public WorkspaceActionLogResponse workspaceActionLog(WorkspaceActionLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceActionLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Provide the key returned by an asynchronous action, such as a deployment, to retrieve the task\&quot;s status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous task in a workspace. Operations such as a deployment return a key. Call this operation with the key to retrieve the task\&quot;s status.</p>
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
     * <b>description</b> :
     * <p>Provide the key returned by an asynchronous action, such as a deployment, to retrieve the task\&quot;s status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous task in a workspace. Operations such as a deployment return a key. Call this operation with the key to retrieve the task\&quot;s status.</p>
     * 
     * @param request WorkspaceActionStatusRequest
     * @return WorkspaceActionStatusResponse
     */
    public WorkspaceActionStatusResponse workspaceActionStatus(WorkspaceActionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceActionStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deploys the code in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>This asynchronous API returns a key. Use this key to query the WorkspaceActionStatus API for the code deployment status.</p>
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
     * <b>description</b> :
     * <p>Deploys the code in a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>This asynchronous API returns a key. Use this key to query the WorkspaceActionStatus API for the code deployment status.</p>
     * 
     * @param request WorkspaceCodePublishRequest
     * @return WorkspaceCodePublishResponse
     */
    public WorkspaceCodePublishResponse workspaceCodePublish(WorkspaceCodePublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.workspaceCodePublishWithOptions(request, runtime);
    }
}
