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
     * <p>创建Airflow</p>
     * 
     * @param request CreateAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAirflowResponse
     */
    public CreateAirflowResponse createAirflowWithOptions(CreateAirflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageType)) {
            query.put("MessageType", request.messageType);
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
     * <p>更新UpdateAirflow</p>
     * 
     * @param request UpdateAirflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAirflowResponse
     */
    public UpdateAirflowResponse updateAirflowWithOptions(UpdateAirflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
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
}
