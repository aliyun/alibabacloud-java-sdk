// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116;

import com.aliyun.tea.*;
import com.aliyun.das20200116.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "das.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "das.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("das", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a database instance to Database Autonomy Service (DAS).</p>
     * 
     * @param request AddHDMInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddHDMInstanceResponse
     */
    public AddHDMInstanceResponse addHDMInstanceWithOptions(AddHDMInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flushAccount)) {
            query.put("FlushAccount", request.flushAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceArea)) {
            query.put("InstanceArea", request.instanceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHDMInstance"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddHDMInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a database instance to Database Autonomy Service (DAS).</p>
     * 
     * @param request AddHDMInstanceRequest
     * @return AddHDMInstanceResponse
     */
    public AddHDMInstanceResponse addHDMInstance(AddHDMInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHDMInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, you must specify the region as cn-shanghai.</li>
     * <li>You can create offline tasks only for database instances that have DAS Enterprise Edition enabled. For information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS product editions and features</a>.
     * For more information about using the Chat API with DAS Agent, see <a href="https://help.aliyun.com/zh/das/developer-reference/chat-api-best-practice">Best practices for DAS Agent interaction (integrating with the Chat API)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An asynchronous API to access the large language model capabilities of DAS.</p>
     * 
     * @param request ChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            query.put("Summary", request.summary);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, you must specify the region as cn-shanghai.</li>
     * <li>You can create offline tasks only for database instances that have DAS Enterprise Edition enabled. For information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS product editions and features</a>.
     * For more information about using the Chat API with DAS Agent, see <a href="https://help.aliyun.com/zh/das/developer-reference/chat-api-best-practice">Best practices for DAS Agent interaction (integrating with the Chat API)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>An asynchronous API to access the large language model capabilities of DAS.</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only Redis data structures and the following Tair-developed data structures are supported for analysis: TairString, TairHash, TairGIS, TairBloom, TairDoc, TairCpc, and TairZset. Other Tair-developed data structures are not supported.</li>
     * <li>If the specifications of the target instance have been changed, backup files generated before the change cannot be analyzed.</li>
     * <li>Tair ESSD-based instances are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cache analysis task by calling the CreateCacheAnalysisJob operation.</p>
     * 
     * @param request CreateCacheAnalysisJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCacheAnalysisJobResponse
     */
    public CreateCacheAnalysisJobResponse createCacheAnalysisJobWithOptions(CreateCacheAnalysisJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separators)) {
            query.put("Separators", request.separators);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCacheAnalysisJob"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCacheAnalysisJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only Redis data structures and the following Tair-developed data structures are supported for analysis: TairString, TairHash, TairGIS, TairBloom, TairDoc, TairCpc, and TairZset. Other Tair-developed data structures are not supported.</li>
     * <li>If the specifications of the target instance have been changed, backup files generated before the change cannot be analyzed.</li>
     * <li>Tair ESSD-based instances are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cache analysis task by calling the CreateCacheAnalysisJob operation.</p>
     * 
     * @param request CreateCacheAnalysisJobRequest
     * @return CreateCacheAnalysisJobResponse
     */
    public CreateCacheAnalysisJobResponse createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCacheAnalysisJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing to help you verify whether your instance type needs to be scaled out to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>. The database must meet the following prerequisites:</p>
     * <ul>
     * <li>The source database only supports RDS MySQL High Availability Edition or RDS Enterprise Edition, and PolarDB MySQL cluster edition.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The instance is connected to DAS. For more information, see <a href="https://help.aliyun.com/document_detail/65405.html">Connect to Alibaba Cloud database instances</a>.</li>
     * <li>DAS Enterprise Edition must be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateCloudBenchTasks operation to create a stress testing task.</p>
     * 
     * @param request CreateCloudBenchTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudBenchTasksResponse
     */
    public CreateCloudBenchTasksResponse createCloudBenchTasksWithOptions(CreateCloudBenchTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupTime)) {
            query.put("BackupTime", request.backupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstConnectionString)) {
            query.put("DstConnectionString", request.dstConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstInstanceId)) {
            query.put("DstInstanceId", request.dstInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstPort)) {
            query.put("DstPort", request.dstPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSuperAccount)) {
            query.put("DstSuperAccount", request.dstSuperAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSuperPassword)) {
            query.put("DstSuperPassword", request.dstSuperPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstType)) {
            query.put("DstType", request.dstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobClass)) {
            query.put("DtsJobClass", request.dtsJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dtsJobId)) {
            query.put("DtsJobId", request.dtsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endState)) {
            query.put("EndState", request.endState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayVpcId)) {
            query.put("GatewayVpcId", request.gatewayVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayVpcIp)) {
            query.put("GatewayVpcIp", request.gatewayVpcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rate)) {
            query.put("Rate", request.rate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestDuration)) {
            query.put("RequestDuration", request.requestDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestEndTime)) {
            query.put("RequestEndTime", request.requestEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestStartTime)) {
            query.put("RequestStartTime", request.requestStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartPressureTime)) {
            query.put("SmartPressureTime", request.smartPressureTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcInstanceId)) {
            query.put("SrcInstanceId", request.srcInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPublicIp)) {
            query.put("SrcPublicIp", request.srcPublicIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSuperAccount)) {
            query.put("SrcSuperAccount", request.srcSuperAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSuperPassword)) {
            query.put("SrcSuperPassword", request.srcSuperPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workDir)) {
            query.put("WorkDir", request.workDir);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudBenchTasks"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudBenchTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing to help you verify whether your instance type needs to be scaled out to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>. The database must meet the following prerequisites:</p>
     * <ul>
     * <li>The source database only supports RDS MySQL High Availability Edition or RDS Enterprise Edition, and PolarDB MySQL cluster edition.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The instance is connected to DAS. For more information, see <a href="https://help.aliyun.com/document_detail/65405.html">Connect to Alibaba Cloud database instances</a>.</li>
     * <li>DAS Enterprise Edition must be enabled. For more information, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateCloudBenchTasks operation to create a stress testing task.</p>
     * 
     * @param request CreateCloudBenchTasksRequest
     * @return CreateCloudBenchTasksResponse
     */
    public CreateCloudBenchTasksResponse createCloudBenchTasks(CreateCloudBenchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudBenchTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a diagnostic report.</p>
     * 
     * @param request CreateDiagnosticReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiagnosticReportResponse
     */
    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "CreateDiagnosticReport"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosticReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a diagnostic report.</p>
     * 
     * @param request CreateDiagnosticReportRequest
     * @return CreateDiagnosticReportResponse
     */
    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateKillInstanceSessionTask operation to create a task that terminates sessions.</p>
     * 
     * @param request CreateKillInstanceSessionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKillInstanceSessionTaskResponse
     */
    public CreateKillInstanceSessionTaskResponse createKillInstanceSessionTaskWithOptions(CreateKillInstanceSessionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbUser)) {
            query.put("DbUser", request.dbUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbUserPassword)) {
            query.put("DbUserPassword", request.dbUserPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoredUsers)) {
            query.put("IgnoredUsers", request.ignoredUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.killAllSessions)) {
            query.put("KillAllSessions", request.killAllSessions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionIds)) {
            query.put("SessionIds", request.sessionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKillInstanceSessionTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKillInstanceSessionTaskResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateKillInstanceSessionTask operation to create a task that terminates sessions.</p>
     * 
     * @param request CreateKillInstanceSessionTaskRequest
     * @return CreateKillInstanceSessionTaskResponse
     */
    public CreateKillInstanceSessionTaskResponse createKillInstanceSessionTask(CreateKillInstanceSessionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKillInstanceSessionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建结束会话的任务</p>
     * 
     * @param request CreateKillInstanceSessionTaskWithMaintainUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKillInstanceSessionTaskWithMaintainUserResponse
     */
    public CreateKillInstanceSessionTaskWithMaintainUserResponse createKillInstanceSessionTaskWithMaintainUserWithOptions(CreateKillInstanceSessionTaskWithMaintainUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ignoredUsers)) {
            query.put("IgnoredUsers", request.ignoredUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.killAllSessions)) {
            query.put("KillAllSessions", request.killAllSessions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionIds)) {
            query.put("SessionIds", request.sessionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKillInstanceSessionTaskWithMaintainUser"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKillInstanceSessionTaskWithMaintainUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建结束会话的任务</p>
     * 
     * @param request CreateKillInstanceSessionTaskWithMaintainUserRequest
     * @return CreateKillInstanceSessionTaskWithMaintainUserResponse
     */
    public CreateKillInstanceSessionTaskWithMaintainUserResponse createKillInstanceSessionTaskWithMaintainUser(CreateKillInstanceSessionTaskWithMaintainUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKillInstanceSessionTaskWithMaintainUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a recent deadlock analysis task. Database Autonomy Service (DAS) analyzes the most recent deadlock log returned by SHOW ENGINE INNODB STATUS. If multiple deadlocks have occurred, DAS analyzes only the most recent one. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Recent deadlock analysis</a>.
     * Before you begin, make sure the following prerequisites are met:</p>
     * <ul>
     * <li>The database engine is one of the following: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>If you use the China site (Chinese) or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a recent deadlock analysis task.</p>
     * 
     * @param request CreateLatestDeadLockAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLatestDeadLockAnalysisResponse
     */
    public CreateLatestDeadLockAnalysisResponse createLatestDeadLockAnalysisWithOptions(CreateLatestDeadLockAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLatestDeadLockAnalysis"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLatestDeadLockAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a recent deadlock analysis task. Database Autonomy Service (DAS) analyzes the most recent deadlock log returned by SHOW ENGINE INNODB STATUS. If multiple deadlocks have occurred, DAS analyzes only the most recent one. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Recent deadlock analysis</a>.
     * Before you begin, make sure the following prerequisites are met:</p>
     * <ul>
     * <li>The database engine is one of the following: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>If you use the China site (Chinese) or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a recent deadlock analysis task.</p>
     * 
     * @param request CreateLatestDeadLockAnalysisRequest
     * @return CreateLatestDeadLockAnalysisResponse
     */
    public CreateLatestDeadLockAnalysisResponse createLatestDeadLockAnalysis(CreateLatestDeadLockAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLatestDeadLockAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a SQL template.</p>
     * 
     * @param request CreateQueryOptimizeTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueryOptimizeTagResponse
     */
    public CreateQueryOptimizeTagResponse createQueryOptimizeTagWithOptions(CreateQueryOptimizeTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlIds)) {
            query.put("SqlIds", request.sqlIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueryOptimizeTag"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueryOptimizeTagResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a tag to a SQL template.</p>
     * 
     * @param request CreateQueryOptimizeTagRequest
     * @return CreateQueryOptimizeTagResponse
     */
    public CreateQueryOptimizeTagResponse createQueryOptimizeTag(CreateQueryOptimizeTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueryOptimizeTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates an SQL statement diagnostics request.</p>
     * 
     * @param request CreateRequestDiagnosisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRequestDiagnosisResponse
     */
    public CreateRequestDiagnosisResponse createRequestDiagnosisWithOptions(CreateRequestDiagnosisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRequestDiagnosis"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRequestDiagnosisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Initiates an SQL statement diagnostics request.</p>
     * 
     * @param request CreateRequestDiagnosisRequest
     * @return CreateRequestDiagnosisResponse
     */
    public CreateRequestDiagnosisResponse createRequestDiagnosis(CreateRequestDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRequestDiagnosisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>If you use the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition activated support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Limits:
     * The maximum number of concurrent executions is 10.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cross-service whitelist template for a user.</p>
     * 
     * @param request CreateSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityIPGroupResponse
     */
    public CreateSecurityIPGroupResponse createSecurityIPGroupWithOptions(CreateSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityIPGroup"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityIPGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>If you use the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you call DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition activated support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Limits:
     * The maximum number of concurrent executions is 10.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cross-service whitelist template for a user.</p>
     * 
     * @param request CreateSecurityIPGroupRequest
     * @return CreateSecurityIPGroupResponse
     */
    public CreateSecurityIPGroupResponse createSecurityIPGroup(CreateSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When you call DAS operations by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition enabled support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Rate limit:
     * The maximum number of concurrent tasks is 10.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous task for detailed data.</p>
     * 
     * @param request CreateSqlLogTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSqlLogTaskResponse
     */
    public CreateSqlLogTaskResponse createSqlLogTaskWithOptions(CreateSqlLogTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlLogTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSqlLogTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When you call DAS operations by using the SDK, set the region to cn-shanghai.</li>
     * <li>Only database instances with DAS Enterprise Edition enabled support creating batch tasks. For information about the databases and regions supported by each DAS Enterprise Edition version, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.
     * Rate limit:
     * The maximum number of concurrent tasks is 10.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an asynchronous task for detailed data.</p>
     * 
     * @param request CreateSqlLogTaskRequest
     * @return CreateSqlLogTaskResponse
     */
    public CreateSqlLogTaskResponse createSqlLogTask(CreateSqlLogTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSqlLogTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a storage analysis task to query the usage details of one or more databases and tables.</p>
     * 
     * @param request CreateStorageAnalysisTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStorageAnalysisTaskResponse
     */
    public CreateStorageAnalysisTaskResponse createStorageAnalysisTaskWithOptions(CreateStorageAnalysisTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStorageAnalysisTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStorageAnalysisTaskResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a storage analysis task to query the usage details of one or more databases and tables.</p>
     * 
     * @param request CreateStorageAnalysisTaskRequest
     * @return CreateStorageAnalysisTaskResponse
     */
    public CreateStorageAnalysisTaskResponse createStorageAnalysisTask(CreateStorageAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStorageAnalysisTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this API to delete a stress testing task. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stress testing task.</p>
     * 
     * @param request DeleteCloudBenchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudBenchTaskResponse
     */
    public DeleteCloudBenchTaskResponse deleteCloudBenchTaskWithOptions(DeleteCloudBenchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudBenchTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this API to delete a stress testing task. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stress testing task.</p>
     * 
     * @param request DeleteCloudBenchTaskRequest
     * @return DeleteCloudBenchTaskResponse
     */
    public DeleteCloudBenchTaskResponse deleteCloudBenchTask(DeleteCloudBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudBenchTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is used to delete the released DBgateway metadata from intelligent stress testing tasks created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.</li>
     * <li>When using the SDK to call DAS, specify the region as cn-shanghai.<blockquote>
     * <p>When a DBGateway has no heartbeat with the access point for more than 20 seconds, the DBGateway is in the stopped state.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cross-product whitelist template for a user.</p>
     * 
     * @param request DeleteSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityIPGroupResponse
     */
    public DeleteSecurityIPGroupResponse deleteSecurityIPGroupWithOptions(DeleteSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityIPGroup"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityIPGroupResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is used to delete the released DBgateway metadata from intelligent stress testing tasks created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.</li>
     * <li>When using the SDK to call DAS, specify the region as cn-shanghai.<blockquote>
     * <p>When a DBGateway has no heartbeat with the access point for more than 20 seconds, the DBGateway is in the stopped state.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cross-product whitelist template for a user.</p>
     * 
     * @param request DeleteSecurityIPGroupRequest
     * @return DeleteSecurityIPGroupResponse
     */
    public DeleteSecurityIPGroupResponse deleteSecurityIPGroup(DeleteSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this API to delete metadata for inactive database gateway instances that were created during stress testing created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.
     * When you use an SDK to call the DAS service, you must specify the region as <code>cn-shanghai</code>.</p>
     * <blockquote>
     * <p>A database gateway is considered &quot;stopped&quot; if it has not sent a heartbeat to the DAS service for more than 20 seconds.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the metadata of a stopped database gateway.</p>
     * 
     * @param request DeleteStopGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStopGatewayResponse
     */
    public DeleteStopGatewayResponse deleteStopGatewayWithOptions(DeleteStopGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStopGateway"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStopGatewayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this API to delete metadata for inactive database gateway instances that were created during stress testing created by the <a href="https://help.aliyun.com/document_detail/230665.html">CreateCloudBenchTasks</a> operation.
     * When you use an SDK to call the DAS service, you must specify the region as <code>cn-shanghai</code>.</p>
     * <blockquote>
     * <p>A database gateway is considered &quot;stopped&quot; if it has not sent a heartbeat to the DAS service for more than 20 seconds.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes the metadata of a stopped database gateway.</p>
     * 
     * @param request DeleteStopGatewayRequest
     * @return DeleteStopGatewayResponse
     */
    public DeleteStopGatewayResponse deleteStopGateway(DeleteStopGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStopGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of audit alert logs for alert search and alert handling.</p>
     * 
     * @param request DescribeAuditLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditLogsResponse
     */
    public DescribeAuditLogsResponse describeAuditLogsWithOptions(DescribeAuditLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncRequestId)) {
            query.put("AsyncRequestId", request.asyncRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUa)) {
            query.put("ClientUa", request.clientUa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectRowRange)) {
            query.put("EffectRowRange", request.effectRowRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTimeRange)) {
            query.put("ExecuteTimeRange", request.executeTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadWhiteList)) {
            query.put("LoadWhiteList", request.loadWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logQueryOpJson)) {
            query.put("LogQueryOpJson", request.logQueryOpJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            query.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectKey)) {
            query.put("OssObjectKey", request.ossObjectKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAggQuery)) {
            query.put("RuleAggQuery", request.ruleAggQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleCategory)) {
            query.put("RuleCategory", request.ruleCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleID)) {
            query.put("RuleID", request.ruleID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlText)) {
            query.put("SqlText", request.sqlText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditLogs"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of audit alert logs for alert search and alert handling.</p>
     * 
     * @param request DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     */
    public DescribeAuditLogsResponse describeAuditLogs(DescribeAuditLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of the auto scaling feature for an instance.</p>
     * 
     * @param request DescribeAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoScalingConfigResponse
     */
    public DescribeAutoScalingConfigResponse describeAutoScalingConfigWithOptions(DescribeAutoScalingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoScalingConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoScalingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of the auto scaling feature for an instance.</p>
     * 
     * @param request DescribeAutoScalingConfigRequest
     * @return DescribeAutoScalingConfigResponse
     */
    public DescribeAutoScalingConfigResponse describeAutoScalingConfig(DescribeAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, only the automatic performance scaling history of ApsaraDB RDS for MySQL instances in the high-availability series with cloud disks is supported.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic scaling history of an instance.</p>
     * 
     * @param request DescribeAutoScalingHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoScalingHistoryResponse
     */
    public DescribeAutoScalingHistoryResponse describeAutoScalingHistoryWithOptions(DescribeAutoScalingHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoScalingHistory"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoScalingHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, only the automatic performance scaling history of ApsaraDB RDS for MySQL instances in the high-availability series with cloud disks is supported.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the elastic scaling history of an instance.</p>
     * 
     * @param request DescribeAutoScalingHistoryRequest
     * @return DescribeAutoScalingHistoryResponse
     */
    public DescribeAutoScalingHistoryResponse describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoScalingHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.<blockquote>
     * <p>Returns the top 500 keys in a cache analysis task.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of a cache analysis task.</p>
     * 
     * @param request DescribeCacheAnalysisJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCacheAnalysisJobResponse
     */
    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJobWithOptions(DescribeCacheAnalysisJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCacheAnalysisJob"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCacheAnalysisJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.<blockquote>
     * <p>Returns the top 500 keys in a cache analysis task.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of a cache analysis task.</p>
     * 
     * @param request DescribeCacheAnalysisJobRequest
     * @return DescribeCacheAnalysisJobResponse
     */
    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of cache analysis tasks.</p>
     * 
     * @param request DescribeCacheAnalysisJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCacheAnalysisJobsResponse
     */
    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobsWithOptions(DescribeCacheAnalysisJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCacheAnalysisJobs"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCacheAnalysisJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of cache analysis tasks.</p>
     * 
     * @param request DescribeCacheAnalysisJobsRequest
     * @return DescribeCacheAnalysisJobsResponse
     */
    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stress testing tasks.</p>
     * 
     * @param request DescribeCloudBenchTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudBenchTasksResponse
     */
    public DescribeCloudBenchTasksResponse describeCloudBenchTasksWithOptions(DescribeCloudBenchTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudBenchTasks"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudBenchTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides intelligent stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of stress testing tasks.</p>
     * 
     * @param request DescribeCloudBenchTasksRequest
     * @return DescribeCloudBenchTasksResponse
     */
    public DescribeCloudBenchTasksResponse describeCloudBenchTasks(DescribeCloudBenchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudBenchTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a stress testing task.</p>
     * 
     * @param request DescribeCloudbenchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudbenchTaskResponse
     */
    public DescribeCloudbenchTaskResponse describeCloudbenchTaskWithOptions(DescribeCloudbenchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudbenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudbenchTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides stress testing features to help you verify whether your instance specifications need to be scaled up to effectively handle service traffic peaks. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a stress testing task.</p>
     * 
     * @param request DescribeCloudbenchTaskRequest
     * @return DescribeCloudbenchTaskResponse
     */
    public DescribeCloudbenchTaskResponse describeCloudbenchTask(DescribeCloudbenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudbenchTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this API to get the configuration details of a stress testing task for advanced debugging, or to understand how the Database Autonomy Service (DAS) stress testing feature operates. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration, file paths, and execution commands for a specific stress test task.</p>
     * 
     * @param request DescribeCloudbenchTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudbenchTaskConfigResponse
     */
    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfigWithOptions(DescribeCloudbenchTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudbenchTaskConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudbenchTaskConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this API to get the configuration details of a stress testing task for advanced debugging, or to understand how the Database Autonomy Service (DAS) stress testing feature operates. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration, file paths, and execution commands for a specific stress test task.</p>
     * 
     * @param request DescribeCloudbenchTaskConfigRequest
     * @return DescribeCloudbenchTaskConfigResponse
     */
    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudbenchTaskConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable to the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB for Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries diagnostics reports.</p>
     * 
     * @param request DescribeDiagnosticReportListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosticReportListResponse
     */
    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosticReportList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosticReportListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable to the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB for Redis</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries diagnostics reports.</p>
     * 
     * @param request DescribeDiagnosticReportListRequest
     * @return DescribeDiagnosticReportListResponse
     */
    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the error log details of an instance within a specified time range.
     * Before you begin:</p>
     * <ul>
     * <li>The target database engine must be one of the following: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for MySQL, PolarDB for PostgreSQL, PolarDB for PostgreSQL (Compatible with Oracle), or ApsaraDB for MongoDB.</li>
     * <li>If you use the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you call DAS operations by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the error log details of an instance within a specified time range.</p>
     * 
     * @param request DescribeErrorLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeErrorLogRecordsResponse
     */
    public DescribeErrorLogRecordsResponse describeErrorLogRecordsWithOptions(DescribeErrorLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeErrorLogRecords"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeErrorLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the error log details of an instance within a specified time range.
     * Before you begin:</p>
     * <ul>
     * <li>The target database engine must be one of the following: ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for MySQL, PolarDB for PostgreSQL, PolarDB for PostgreSQL (Compatible with Oracle), or ApsaraDB for MongoDB.</li>
     * <li>If you use the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When you call DAS operations by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the error log details of an instance within a specified time range.</p>
     * 
     * @param request DescribeErrorLogRecordsRequest
     * @return DescribeErrorLogRecordsResponse
     */
    public DescribeErrorLogRecordsResponse describeErrorLogRecords(DescribeErrorLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeErrorLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For keys with data structures of List, Hash, Set, or Zset, the top 3 keys are sorted and displayed by the number of elements in the key, and are recorded as big keys. If the QPS of a key exceeds 5,000, the key is recorded as a hot key. For more information about the definitions of big keys and hot keys, see <a href="https://www.alibabacloud.com/help/en/das/user-guide/key-analysis">Top Key statistics</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For instances running Redis Community Edition 7.0.18, 6.0.2.9, 5.5.2.9, or earlier versions, or Tair (Enhanced Edition) in-memory instances running version 5.0.50, 25.2.0.0, or earlier versions, a key with a QPS greater than 3,000 is recorded as a hot key. This threshold cannot be adjusted.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>Use DAS SDK 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is Redis Community Edition or Tair (Redis® OSS-Compatible) in-memory.</li>
     * <li>The minor version of the instance is the latest.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DescribeHotBigKeys operation to retrieve the hot keys and big keys in the current memory in real time.</p>
     * 
     * @param request DescribeHotBigKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHotBigKeysResponse
     */
    public DescribeHotBigKeysResponse describeHotBigKeysWithOptions(DescribeHotBigKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHotBigKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHotBigKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>For keys with data structures of List, Hash, Set, or Zset, the top 3 keys are sorted and displayed by the number of elements in the key, and are recorded as big keys. If the QPS of a key exceeds 5,000, the key is recorded as a hot key. For more information about the definitions of big keys and hot keys, see <a href="https://www.alibabacloud.com/help/en/das/user-guide/key-analysis">Top Key statistics</a>.</p>
     * <blockquote>
     * <ul>
     * <li>For instances running Redis Community Edition 7.0.18, 6.0.2.9, 5.5.2.9, or earlier versions, or Tair (Enhanced Edition) in-memory instances running version 5.0.50, 25.2.0.0, or earlier versions, a key with a QPS greater than 3,000 is recorded as a hot key. This threshold cannot be adjusted.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>Use DAS SDK 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is Redis Community Edition or Tair (Redis® OSS-Compatible) in-memory.</li>
     * <li>The minor version of the instance is the latest.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls the DescribeHotBigKeys operation to retrieve the hot keys and big keys in the current memory in real time.</p>
     * 
     * @param request DescribeHotBigKeysRequest
     * @return DescribeHotBigKeysResponse
     */
    public DescribeHotBigKeysResponse describeHotBigKeys(DescribeHotBigKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotBigKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>The version of the DAS SDK must be 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is a Redis Community Edition instance or a Tair (Redis® OSS-Compatible) memory-optimized instance.</li>
     * <li>The minor engine version of the instance is the latest.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the hot keys of a Redis instance by calling the DescribeHotKeys operation.</p>
     * 
     * @param request DescribeHotKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHotKeysResponse
     */
    public DescribeHotKeysResponse describeHotKeysWithOptions(DescribeHotKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHotKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHotKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>When using the Alibaba Cloud SDK, make sure the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>The version of the DAS SDK must be 1.0.2 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is a Redis Community Edition instance or a Tair (Redis® OSS-Compatible) memory-optimized instance.</li>
     * <li>The minor engine version of the instance is the latest.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the hot keys of a Redis instance by calling the DescribeHotKeys operation.</p>
     * 
     * @param request DescribeHotKeysRequest
     * @return DescribeHotKeysResponse
     */
    public DescribeHotKeysResponse describeHotKeys(DescribeHotKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation to query the DAS Enterprise Edition configurations of a database instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Database Autonomy Service (DAS) Enterprise Edition V1 or V2 is enabled for a database instance.</p>
     * 
     * @param request DescribeInstanceDasProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDasProResponse
     */
    public DescribeInstanceDasProResponse describeInstanceDasProWithOptions(DescribeInstanceDasProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDasPro"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDasProResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778837.html">DescribeSqlLogConfig</a> operation to query the DAS Enterprise Edition configurations of a database instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether Database Autonomy Service (DAS) Enterprise Edition V1 or V2 is enabled for a database instance.</p>
     * 
     * @param request DescribeInstanceDasProRequest
     * @return DescribeInstanceDasProResponse
     */
    public DescribeInstanceDasProResponse describeInstanceDasPro(DescribeInstanceDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDasProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation supports only ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling the DAS service with the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the execution plan for an SQL statement.</p>
     * 
     * @param request DescribeQueryExplainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQueryExplainResponse
     */
    public DescribeQueryExplainResponse describeQueryExplainWithOptions(DescribeQueryExplainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQueryExplain"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQueryExplainResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation supports only ApsaraDB RDS for MySQL and PolarDB for MySQL instances.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling the DAS service with the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain the execution plan for an SQL statement.</p>
     * 
     * @param request DescribeQueryExplainRequest
     * @return DescribeQueryExplainResponse
     */
    public DescribeQueryExplainResponse describeQueryExplain(DescribeQueryExplainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQueryExplainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Displays the details of a cross-engine whitelist template for a user.</p>
     * 
     * @param request DescribeSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityIPGroupResponse
     */
    public DescribeSecurityIPGroupResponse describeSecurityIPGroupWithOptions(DescribeSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityIPGroup"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityIPGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Displays the details of a cross-engine whitelist template for a user.</p>
     * 
     * @param request DescribeSecurityIPGroupRequest
     * @return DescribeSecurityIPGroupResponse
     */
    public DescribeSecurityIPGroupResponse describeSecurityIPGroup(DescribeSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Displays the binding information between a cross-engine whitelist template and instances for a user.</p>
     * 
     * @param request DescribeSecurityIPGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityIPGroupRelationResponse
     */
    public DescribeSecurityIPGroupRelationResponse describeSecurityIPGroupRelationWithOptions(DescribeSecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityIPGroupRelation"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityIPGroupRelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Displays the binding information between a cross-engine whitelist template and instances for a user.</p>
     * 
     * @param request DescribeSecurityIPGroupRelationRequest
     * @return DescribeSecurityIPGroupRelationResponse
     */
    public DescribeSecurityIPGroupRelationResponse describeSecurityIPGroupRelation(DescribeSecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityIPGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/156195.html">billing methods and pricing</a> of DAS.</em>*
     * Before you begin:</p>
     * <ul>
     * <li>DAS Enterprise Edition or the Alibaba Cloud Managed Services (not yet online) is enabled for the requested instance.</li>
     * <li>If you use the Alibaba Cloud SDK or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.
     * This operation uses asynchronous calls and does not immediately return complete results. If the value of isFinish in the response is false, wait 1 second and invoke the operation again until the value of isFinish is true, which indicates that complete results are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously retrieves slow log trends data for an instance.</p>
     * 
     * @param request DescribeSlowLogHistogramAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogHistogramAsyncResponse
     */
    public DescribeSlowLogHistogramAsyncResponse describeSlowLogHistogramAsyncWithOptions(DescribeSlowLogHistogramAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogHistogramAsync"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogHistogramAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/156195.html">billing methods and pricing</a> of DAS.</em>*
     * Before you begin:</p>
     * <ul>
     * <li>DAS Enterprise Edition or the Alibaba Cloud Managed Services (not yet online) is enabled for the requested instance.</li>
     * <li>If you use the Alibaba Cloud SDK or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.
     * This operation uses asynchronous calls and does not immediately return complete results. If the value of isFinish in the response is false, wait 1 second and invoke the operation again until the value of isFinish is true, which indicates that complete results are returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously retrieves slow log trends data for an instance.</p>
     * 
     * @param request DescribeSlowLogHistogramAsyncRequest
     * @return DescribeSlowLogHistogramAsyncResponse
     */
    public DescribeSlowLogHistogramAsyncResponse describeSlowLogHistogramAsync(DescribeSlowLogHistogramAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogHistogramAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>InstanceId</code> specifies the instance ID. This parameter is required.</li>
     * <li><code>StartTime</code> and <code>EndTime</code> specify the time range for the query. These parameters are required.</li>
     * <li>Set <code>PageNumber</code> and <code>PageSize</code> to retrieve results by paging.</li>
     * <li>Use the <code>OrderBy</code> parameter to sort results. For sortable fields, refer to the References.</li>
     * <li>Use the <code>Filters</code> parameter to further refine query conditions, such as filtering by host address or SQL ID.
     * <notice>Certain database types (such as PostgreSQL and PolarDB for PostgreSQL) do not support specific sorting methods. Settings appropriate parameters as needed.</notice></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries slow query log records of a database instance with support for filtering and sorting by multiple conditions.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogRecords"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>InstanceId</code> specifies the instance ID. This parameter is required.</li>
     * <li><code>StartTime</code> and <code>EndTime</code> specify the time range for the query. These parameters are required.</li>
     * <li>Set <code>PageNumber</code> and <code>PageSize</code> to retrieve results by paging.</li>
     * <li>Use the <code>OrderBy</code> parameter to sort results. For sortable fields, refer to the References.</li>
     * <li>Use the <code>Filters</code> parameter to further refine query conditions, such as filtering by host address or SQL ID.
     * <notice>Certain database types (such as PostgreSQL and PolarDB for PostgreSQL) do not support specific sorting methods. Settings appropriate parameters as needed.</notice></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries slow query log records of a database instance with support for filtering and sorting by multiple conditions.</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the <a href="https://help.aliyun.com/document_detail/156195.html">billing methods and pricing</a> of Database Autonomy Service (DAS).</em>*
     * Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Alibaba Cloud Managed Services is enabled for the instance.</li>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, set the region to cn-shanghai.
     * This operation is asynchronous and does not return the complete result immediately. If the \<code>isFinish\\</code> parameter in the response is \<code>false\\</code>, wait 1 second and send the request again. Repeat the request until the \<code>isFinish\\</code> parameter is \<code>true\\</code> to retrieve the complete result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves slow query log statistics.</p>
     * 
     * @param request DescribeSlowLogStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogStatisticResponse
     */
    public DescribeSlowLogStatisticResponse describeSlowLogStatisticWithOptions(DescribeSlowLogStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            body.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogStatistic"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the <a href="https://help.aliyun.com/document_detail/156195.html">billing methods and pricing</a> of Database Autonomy Service (DAS).</em>*
     * Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>Alibaba Cloud Managed Services is enabled for the instance.</li>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, set the region to cn-shanghai.
     * This operation is asynchronous and does not return the complete result immediately. If the \<code>isFinish\\</code> parameter in the response is \<code>false\\</code>, wait 1 second and send the request again. Repeat the request until the \<code>isFinish\\</code> parameter is \<code>true\\</code> to retrieve the complete result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves slow query log statistics.</p>
     * 
     * @param request DescribeSlowLogStatisticRequest
     * @return DescribeSlowLogStatisticResponse
     */
    public DescribeSlowLogStatisticResponse describeSlowLogStatistic(DescribeSlowLogStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogStatisticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the DAS Enterprise Edition configuration of a database instance.</p>
     * 
     * @param request DescribeSqlLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlLogConfigResponse
     */
    public DescribeSqlLogConfigResponse describeSqlLogConfigWithOptions(DescribeSqlLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlLogConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the DAS Enterprise Edition configuration of a database instance.</p>
     * 
     * @param request DescribeSqlLogConfigRequest
     * @return DescribeSqlLogConfigResponse
     */
    public DescribeSqlLogConfigResponse describeSqlLogConfig(DescribeSqlLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, note the following:</p>
     * <ul>
     * <li>When you use an Alibaba Cloud or Database Autonomy Service (DAS) SDK, we recommend that you use the latest version.</li>
     * <li>When you call the DAS service by using an SDK, you must set the region to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeSqlLogRecords to query log details in DAS Enterprise Edition.</p>
     * 
     * @param request DescribeSqlLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlLogRecordsResponse
     */
    public DescribeSqlLogRecordsResponse describeSqlLogRecordsWithOptions(DescribeSqlLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlLogRecords"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, note the following:</p>
     * <ul>
     * <li>When you use an Alibaba Cloud or Database Autonomy Service (DAS) SDK, we recommend that you use the latest version.</li>
     * <li>When you call the DAS service by using an SDK, you must set the region to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeSqlLogRecords to query log details in DAS Enterprise Edition.</p>
     * 
     * @param request DescribeSqlLogRecordsRequest
     * @return DescribeSqlLogRecordsResponse
     */
    public DescribeSqlLogRecordsResponse describeSqlLogRecords(DescribeSqlLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the DescribeSqlLogStatistic operation to query the statistics information of DAS Enterprise Edition.</p>
     * 
     * @param request DescribeSqlLogStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlLogStatisticResponse
     */
    public DescribeSqlLogStatisticResponse describeSqlLogStatisticWithOptions(DescribeSqlLogStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlLogStatistic"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlLogStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Use the latest version of Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invokes the DescribeSqlLogStatistic operation to query the statistics information of DAS Enterprise Edition.</p>
     * 
     * @param request DescribeSqlLogStatisticRequest
     * @return DescribeSqlLogStatisticResponse
     */
    public DescribeSqlLogStatisticResponse describeSqlLogStatistic(DescribeSqlLogStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlLogStatisticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note the following before you call this operation:</p>
     * <ul>
     * <li>We recommend using the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the <code>DescribeSqlLogTask</code> operation to query the details of an offline task in DAS enterprise edition.</p>
     * 
     * @param request DescribeSqlLogTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlLogTaskResponse
     */
    public DescribeSqlLogTaskResponse describeSqlLogTaskWithOptions(DescribeSqlLogTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlLogTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlLogTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Note the following before you call this operation:</p>
     * <ul>
     * <li>We recommend using the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the <code>DescribeSqlLogTask</code> operation to query the details of an offline task in DAS enterprise edition.</p>
     * 
     * @param request DescribeSqlLogTaskRequest
     * @return DescribeSqlLogTaskResponse
     */
    public DescribeSqlLogTaskResponse describeSqlLogTask(DescribeSqlLogTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlLogTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following prerequisites must be met to call this operation:</p>
     * <ul>
     * <li>We recommend that you use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, you must set the region to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the audit log tasks for an instance.</p>
     * 
     * @param request DescribeSqlLogTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlLogTasksResponse
     */
    public DescribeSqlLogTasksResponse describeSqlLogTasksWithOptions(DescribeSqlLogTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            body.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlLogTasks"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlLogTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>The following prerequisites must be met to call this operation:</p>
     * <ul>
     * <li>We recommend that you use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, you must set the region to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists the audit log tasks for an instance.</p>
     * 
     * @param request DescribeSqlLogTasksRequest
     * @return DescribeSqlLogTasksResponse
     */
    public DescribeSqlLogTasksResponse describeSqlLogTasks(DescribeSqlLogTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlLogTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for an ApsaraDB for Redis instance of one of the following versions:<ul>
     * <li>The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top 100 large keys over a period of time.</p>
     * 
     * @param request DescribeTopBigKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopBigKeysResponse
     */
    public DescribeTopBigKeysResponse describeTopBigKeysWithOptions(DescribeTopBigKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopBigKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopBigKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is available only for an ApsaraDB for Redis instance of one of the following versions:<ul>
     * <li>The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).</li>
     * <li>The ApsaraDB for Redis instance is updated to the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top 100 large keys over a period of time.</p>
     * 
     * @param request DescribeTopBigKeysRequest
     * @return DescribeTopBigKeysResponse
     */
    public DescribeTopBigKeysResponse describeTopBigKeys(DescribeTopBigKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopBigKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A key is identified as a hot key if its QPS exceeds 3,000.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is 4.3.3 or later. We recommend using the latest version.</li>
     * <li>The DAS SDK version must be 1.0.2 or later.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is an open source Redis instance or a Tair (Enterprise Edition) memory-optimized instance.</li>
     * <li>The instance runs on the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top 100 hot keys within a specified time period.</p>
     * 
     * @param request DescribeTopHotKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopHotKeysResponse
     */
    public DescribeTopHotKeysResponse describeTopHotKeysWithOptions(DescribeTopHotKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopHotKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopHotKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>A key is identified as a hot key if its QPS exceeds 3,000.</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is 4.3.3 or later. We recommend using the latest version.</li>
     * <li>The DAS SDK version must be 1.0.2 or later.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to the following Redis instances:<ul>
     * <li>The instance is an open source Redis instance or a Tair (Enterprise Edition) memory-optimized instance.</li>
     * <li>The instance runs on the latest minor version.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top 100 hot keys within a specified time period.</p>
     * 
     * @param request DescribeTopHotKeysRequest
     * @return DescribeTopHotKeysResponse
     */
    public DescribeTopHotKeysResponse describeTopHotKeys(DescribeTopHotKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopHotKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables all throttling rules that are in effect.</p>
     * 
     * @param request DisableAllSqlConcurrencyControlRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAllSqlConcurrencyControlRulesResponse
     */
    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRulesWithOptions(DisableAllSqlConcurrencyControlRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAllSqlConcurrencyControlRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAllSqlConcurrencyControlRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables all throttling rules that are in effect.</p>
     * 
     * @param request DisableAllSqlConcurrencyControlRulesRequest
     * @return DisableAllSqlConcurrencyControlRulesResponse
     */
    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAllSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic tablespace fragment recycling feature for database instances at a time.</p>
     * 
     * @param request DisableAutoResourceOptimizeRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAutoResourceOptimizeRulesResponse
     */
    public DisableAutoResourceOptimizeRulesResponse disableAutoResourceOptimizeRulesWithOptions(DisableAutoResourceOptimizeRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoResourceOptimizeRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAutoResourceOptimizeRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic tablespace fragment recycling feature for database instances at a time.</p>
     * 
     * @param request DisableAutoResourceOptimizeRulesRequest
     * @return DisableAutoResourceOptimizeRulesResponse
     */
    public DisableAutoResourceOptimizeRulesResponse disableAutoResourceOptimizeRules(DisableAutoResourceOptimizeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoResourceOptimizeRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic SQL throttling feature for multiple database instances at a time.</p>
     * 
     * @param request DisableAutoThrottleRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAutoThrottleRulesResponse
     */
    public DisableAutoThrottleRulesResponse disableAutoThrottleRulesWithOptions(DisableAutoThrottleRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoThrottleRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAutoThrottleRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic SQL throttling feature for multiple database instances at a time.</p>
     * 
     * @param request DisableAutoThrottleRulesRequest
     * @return DisableAutoThrottleRulesResponse
     */
    public DisableAutoThrottleRulesResponse disableAutoThrottleRules(DisableAutoThrottleRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoThrottleRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to enable or disable DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deactivates Database Autonomy Service (DAS) Professional Edition.</p>
     * 
     * @param request DisableDasProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDasProResponse
     */
    public DisableDasProResponse disableDasProWithOptions(DisableDasProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDasPro"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDasProResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about the database instances that support DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to enable or disable DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">Editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deactivates Database Autonomy Service (DAS) Professional Edition.</p>
     * 
     * @param request DisableDasProRequest
     * @return DisableDasProResponse
     */
    public DisableDasProResponse disableDasPro(DisableDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDasProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the auto scaling feature for a database instance.</p>
     * 
     * @param request DisableInstanceDasConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInstanceDasConfigResponse
     */
    public DisableInstanceDasConfigResponse disableInstanceDasConfigWithOptions(DisableInstanceDasConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            query.put("ScaleType", request.scaleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInstanceDasConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInstanceDasConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables the auto scaling feature for a database instance.</p>
     * 
     * @param request DisableInstanceDasConfigRequest
     * @return DisableInstanceDasConfigResponse
     */
    public DisableInstanceDasConfigResponse disableInstanceDasConfig(DisableInstanceDasConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstanceDasConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable to the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a throttling rule.</p>
     * 
     * @param request DisableSqlConcurrencyControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSqlConcurrencyControlResponse
     */
    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControlWithOptions(DisableSqlConcurrencyControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSqlConcurrencyControl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSqlConcurrencyControlResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is applicable to the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a throttling rule.</p>
     * 
     * @param request DisableSqlConcurrencyControlRequest
     * @return DisableSqlConcurrencyControlResponse
     */
    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlConcurrencyControlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to activate or deactivate DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Database Autonomy Service (DAS) Professional Edition.</p>
     * 
     * @param request EnableDasProRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDasProResponse
     */
    public EnableDasProResponse enableDasProWithOptions(EnableDasProRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlRetention)) {
            query.put("SqlRetention", request.sqlRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDasPro"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDasProResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation is applicable only to DAS Enterprise Edition V1.<blockquote>
     * <p>We recommend that you call the <a href="https://help.aliyun.com/document_detail/2778835.html">ModifySqlLogConfig</a> operation to activate or deactivate DAS Enterprise Edition for a database instance. For more information about the databases and regions supported by each version of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Activates Database Autonomy Service (DAS) Professional Edition.</p>
     * 
     * @param request EnableDasProRequest
     * @return EnableDasProResponse
     */
    public EnableDasProResponse enableDasPro(EnableDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDasProWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables SQL throttling to control the numbers of database access requests and concurrent SQL statements.</p>
     * 
     * @param request EnableSqlConcurrencyControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSqlConcurrencyControlResponse
     */
    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControlWithOptions(EnableSqlConcurrencyControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrencyControlTime)) {
            query.put("ConcurrencyControlTime", request.concurrencyControlTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlKeywords)) {
            query.put("SqlKeywords", request.sqlKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSqlConcurrencyControl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSqlConcurrencyControlResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables SQL throttling to control the numbers of database access requests and concurrent SQL statements.</p>
     * 
     * @param request EnableSqlConcurrencyControlRequest
     * @return EnableSqlConcurrencyControlResponse
     */
    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlConcurrencyControlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetAsyncErrorRequestListByCode is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the <strong>isFinish</strong> parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the <strong>isFinish</strong> parameter is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Enable and manage DAS Economy Edition and DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the IDs of SQL statements that generate a MySQL error code in the SQL Explorer results of a database instance.</p>
     * 
     * @param request GetAsyncErrorRequestListByCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncErrorRequestListByCodeResponse
     */
    public GetAsyncErrorRequestListByCodeResponse getAsyncErrorRequestListByCodeWithOptions(GetAsyncErrorRequestListByCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorCode)) {
            query.put("ErrorCode", request.errorCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncErrorRequestListByCode"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncErrorRequestListByCodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetAsyncErrorRequestListByCode is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the <strong>isFinish</strong> parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the <strong>isFinish</strong> parameter is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Enable and manage DAS Economy Edition and DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the IDs of SQL statements that generate a MySQL error code in the SQL Explorer results of a database instance.</p>
     * 
     * @param request GetAsyncErrorRequestListByCodeRequest
     * @return GetAsyncErrorRequestListByCodeResponse
     */
    public GetAsyncErrorRequestListByCodeResponse getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestListByCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetAsyncErrorRequestStatByCode is an asynchronous operation After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the MySQL error codes in SQL Explorer data and the number of SQL queries corresponding to each error code.</p>
     * 
     * @param request GetAsyncErrorRequestStatByCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncErrorRequestStatByCodeResponse
     */
    public GetAsyncErrorRequestStatByCodeResponse getAsyncErrorRequestStatByCodeWithOptions(GetAsyncErrorRequestStatByCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncErrorRequestStatByCode"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncErrorRequestStatByCodeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetAsyncErrorRequestStatByCode is an asynchronous operation After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the MySQL error codes in SQL Explorer data and the number of SQL queries corresponding to each error code.</p>
     * 
     * @param request GetAsyncErrorRequestStatByCodeRequest
     * @return GetAsyncErrorRequestStatByCodeResponse
     */
    public GetAsyncErrorRequestStatByCodeResponse getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestStatByCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This is an asynchronous call, so the complete results are not returned immediately. If the <strong>isFinish</strong> field in the response is <strong>false</strong>, wait 1s and retry the call. The complete results are returned when <strong>isFinish</strong> is <strong>true</strong>.</p>
     * </blockquote>
     * <ul>
     * <li>This operation supports only RDS MySQL and PolarDB for MySQL instances. Before you call this operation, ensure that DAS Enterprise Edition is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>When you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call GetAsyncErrorRequestStatResult to asynchronously get the execution error count for a specific SQL statement from the SQL Insight results of a database instance.</p>
     * 
     * @param request GetAsyncErrorRequestStatResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncErrorRequestStatResultResponse
     */
    public GetAsyncErrorRequestStatResultResponse getAsyncErrorRequestStatResultWithOptions(GetAsyncErrorRequestStatResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlIdList)) {
            query.put("SqlIdList", request.sqlIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncErrorRequestStatResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncErrorRequestStatResultResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This is an asynchronous call, so the complete results are not returned immediately. If the <strong>isFinish</strong> field in the response is <strong>false</strong>, wait 1s and retry the call. The complete results are returned when <strong>isFinish</strong> is <strong>true</strong>.</p>
     * </blockquote>
     * <ul>
     * <li>This operation supports only RDS MySQL and PolarDB for MySQL instances. Before you call this operation, ensure that DAS Enterprise Edition is enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>When you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call GetAsyncErrorRequestStatResult to asynchronously get the execution error count for a specific SQL statement from the SQL Insight results of a database instance.</p>
     * 
     * @param request GetAsyncErrorRequestStatResultRequest
     * @return GetAsyncErrorRequestStatResultResponse
     */
    public GetAsyncErrorRequestStatResultResponse getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestStatResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of auto-increment table IDs.</p>
     * 
     * @param request GetAutoIncrementUsageStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoIncrementUsageStatisticResponse
     */
    public GetAutoIncrementUsageStatisticResponse getAutoIncrementUsageStatisticWithOptions(GetAutoIncrementUsageStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbNames)) {
            query.put("DbNames", request.dbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratioFilter)) {
            query.put("RatioFilter", request.ratioFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realTime)) {
            query.put("RealTime", request.realTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoIncrementUsageStatistic"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoIncrementUsageStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of auto-increment table IDs.</p>
     * 
     * @param request GetAutoIncrementUsageStatisticRequest
     * @return GetAutoIncrementUsageStatisticResponse
     */
    public GetAutoIncrementUsageStatisticResponse getAutoIncrementUsageStatistic(GetAutoIncrementUsageStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoIncrementUsageStatisticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance is an ApsaraDB RDS for MySQL instance of High-availability Edition.</li>
     * <li>The database instance has four or more cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic fragment recycling rules of database instances.</p>
     * 
     * @param request GetAutoResourceOptimizeRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoResourceOptimizeRulesResponse
     */
    public GetAutoResourceOptimizeRulesResponse getAutoResourceOptimizeRulesWithOptions(GetAutoResourceOptimizeRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoResourceOptimizeRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoResourceOptimizeRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance is an ApsaraDB RDS for MySQL instance of High-availability Edition.</li>
     * <li>The database instance has four or more cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic fragment recycling rules of database instances.</p>
     * 
     * @param request GetAutoResourceOptimizeRulesRequest
     * @return GetAutoResourceOptimizeRulesResponse
     */
    public GetAutoResourceOptimizeRulesResponse getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoResourceOptimizeRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic SQL throttling rules of a database instance.</p>
     * 
     * @param request GetAutoThrottleRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoThrottleRulesResponse
     */
    public GetAutoThrottleRulesResponse getAutoThrottleRulesWithOptions(GetAutoThrottleRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoThrottleRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoThrottleRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic SQL throttling rules of a database instance.</p>
     * 
     * @param request GetAutoThrottleRulesRequest
     * @return GetAutoThrottleRulesResponse
     */
    public GetAutoThrottleRulesResponse getAutoThrottleRules(GetAutoThrottleRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoThrottleRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of autonomous notification events for a database instance.</p>
     * 
     * @param request GetAutonomousNotifyEventContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutonomousNotifyEventContentResponse
     */
    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContentWithOptions(GetAutonomousNotifyEventContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spanId)) {
            query.put("SpanId", request.spanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEventContent"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutonomousNotifyEventContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of autonomous notification events for a database instance.</p>
     * 
     * @param request GetAutonomousNotifyEventContentRequest
     * @return GetAutonomousNotifyEventContentResponse
     */
    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the notification events of one or more urgency levels within a period.</p>
     * 
     * @param request GetAutonomousNotifyEventsInRangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutonomousNotifyEventsInRangeResponse
     */
    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRangeWithOptions(GetAutonomousNotifyEventsInRangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventContext)) {
            query.put("EventContext", request.eventContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minLevel)) {
            query.put("MinLevel", request.minLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageOffset)) {
            query.put("PageOffset", request.pageOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEventsInRange"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutonomousNotifyEventsInRangeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.<blockquote>
     * <p>You can query the details of notification events only if the autonomy center is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the notification events of one or more urgency levels within a period.</p>
     * 
     * @param request GetAutonomousNotifyEventsInRangeRequest
     * @return GetAutonomousNotifyEventsInRangeResponse
     */
    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventsInRangeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the blocking data of an ApsaraDB RDS for SQL Server instance.</p>
     * 
     * @param request GetBlockingDetailListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBlockingDetailListResponse
     */
    public GetBlockingDetailListResponse getBlockingDetailListWithOptions(GetBlockingDetailListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbNameList)) {
            query.put("DbNameList", request.dbNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryHash)) {
            query.put("QueryHash", request.queryHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlockingDetailList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlockingDetailListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the blocking data of an ApsaraDB RDS for SQL Server instance.</p>
     * 
     * @param request GetBlockingDetailListRequest
     * @return GetBlockingDetailListResponse
     */
    public GetBlockingDetailListResponse getBlockingDetailList(GetBlockingDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBlockingDetailListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnosis of network connectivity when a user accesses a specific database instance by specifying an IP address.</p>
     * 
     * @param request GetDBInstanceConnectivityDiagnosisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDBInstanceConnectivityDiagnosisResponse
     */
    public GetDBInstanceConnectivityDiagnosisResponse getDBInstanceConnectivityDiagnosisWithOptions(GetDBInstanceConnectivityDiagnosisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDBInstanceConnectivityDiagnosis"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDBInstanceConnectivityDiagnosisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnosis of network connectivity when a user accesses a specific database instance by specifying an IP address.</p>
     * 
     * @param request GetDBInstanceConnectivityDiagnosisRequest
     * @return GetDBInstanceConnectivityDiagnosisResponse
     */
    public GetDBInstanceConnectivityDiagnosisResponse getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBInstanceConnectivityDiagnosisWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This is a paid API. You are charged based on the number of output characters. Before you use this API, ensure that you understand the billing methods and <a href="https://help.aliyun.com/zh/das/product-overview/billing-details-of-the-previous-version?spm=a2c4g.11186623.help-menu-63907.d_0_1_0.b7203b87MDNqHO%5C&scm=20140722.H_156195._.OR_help-T_cn~zh-V_1#cad160563fbkd">pricing</a> of the DAS Agent product.</p>
     * 
     * <b>summary</b> : 
     * <p>This API uses Server-Sent Events (SSE) to interact with the DAS agent. You can use this API for features such as Q&amp;A and performance diagnostics.</p>
     * 
     * @param request GetDasAgentSSERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDasAgentSSEResponse
     */
    public GetDasAgentSSEResponse getDasAgentSSEWithOptions(GetDasAgentSSERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDasAgentSSE"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDasAgentSSEResponse());
    }

    /**
     * <b>description</b> :
     * <p>This is a paid API. You are charged based on the number of output characters. Before you use this API, ensure that you understand the billing methods and <a href="https://help.aliyun.com/zh/das/product-overview/billing-details-of-the-previous-version?spm=a2c4g.11186623.help-menu-63907.d_0_1_0.b7203b87MDNqHO%5C&scm=20140722.H_156195._.OR_help-T_cn~zh-V_1#cad160563fbkd">pricing</a> of the DAS Agent product.</p>
     * 
     * <b>summary</b> : 
     * <p>This API uses Server-Sent Events (SSE) to interact with the DAS agent. You can use this API for features such as Q&amp;A and performance diagnostics.</p>
     * 
     * @param request GetDasAgentSSERequest
     * @return GetDasAgentSSEResponse
     */
    public GetDasAgentSSEResponse getDasAgentSSE(GetDasAgentSSERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDasAgentSSEWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the supported databases, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When invoking DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>Use the <a href="https://help.aliyun.com/document_detail/2778836.html">DescribeSqlLogStatistic</a> operation to query the statistics information of DAS Enterprise Edition.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage usage of DAS Enterprise Edition V1 or V2 for a database instance.</p>
     * 
     * @param request GetDasProServiceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDasProServiceUsageResponse
     */
    public GetDasProServiceUsageResponse getDasProServiceUsageWithOptions(GetDasProServiceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDasProServiceUsage"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDasProServiceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the supported databases, see <a href="https://help.aliyun.com/document_detail/190912.html">DAS Enterprise Edition</a>.</li>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When invoking DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation applies only to DAS Enterprise Edition V1 and V2.<blockquote>
     * <p>Use the <a href="https://help.aliyun.com/document_detail/2778836.html">DescribeSqlLogStatistic</a> operation to query the statistics information of DAS Enterprise Edition.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage usage of DAS Enterprise Edition V1 or V2 for a database instance.</p>
     * 
     * @param request GetDasProServiceUsageRequest
     * @return GetDasProServiceUsageResponse
     */
    public GetDasProServiceUsageResponse getDasProServiceUsage(GetDasProServiceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDasProServiceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, ensure that you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When using an SDK to call the DAS service, specify the region as <code>cn-shanghai</code>.</li>
     * <li>Supported engines: PolarDB MySQL, ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQLServer.</li>
     * <li>Enable log indexing for the instance.<blockquote>
     * <p>The query start time must be within the last 7 days. The query duration cannot exceed 1 day. The API returns up to 10,000 records.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves hot data from SQL audit logs.</p>
     * 
     * @param request GetDasSQLLogHotDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDasSQLLogHotDataResponse
     */
    public GetDasSQLLogHotDataResponse getDasSQLLogHotDataWithOptions(GetDasSQLLogHotDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            body.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childDBInstanceIDs)) {
            body.put("ChildDBInstanceIDs", request.childDBInstanceIDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            body.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            body.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fail)) {
            body.put("Fail", request.fail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            body.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalOperator)) {
            body.put("LogicalOperator", request.logicalOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLatancy)) {
            body.put("MaxLatancy", request.maxLatancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRecordsPerPage)) {
            body.put("MaxRecordsPerPage", request.maxRecordsPerPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRows)) {
            body.put("MaxRows", request.maxRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxScanRows)) {
            body.put("MaxScanRows", request.maxScanRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSpillCnt)) {
            body.put("MaxSpillCnt", request.maxSpillCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minLatancy)) {
            body.put("MinLatancy", request.minLatancy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRows)) {
            body.put("MinRows", request.minRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minScanRows)) {
            body.put("MinScanRows", request.minScanRows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSpillCnt)) {
            body.put("MinSpillCnt", request.minSpillCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumbers)) {
            body.put("PageNumbers", request.pageNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyword)) {
            body.put("QueryKeyword", request.queryKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKey)) {
            body.put("SortKey", request.sortKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortMethod)) {
            body.put("SortMethod", request.sortMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            body.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            body.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadID)) {
            body.put("ThreadID", request.threadID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            body.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDasSQLLogHotData"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDasSQLLogHotDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this API, ensure that you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When using an SDK to call the DAS service, specify the region as <code>cn-shanghai</code>.</li>
     * <li>Supported engines: PolarDB MySQL, ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQLServer.</li>
     * <li>Enable log indexing for the instance.<blockquote>
     * <p>The query start time must be within the last 7 days. The query duration cannot exceed 1 day. The API returns up to 10,000 records.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves hot data from SQL audit logs.</p>
     * 
     * @param request GetDasSQLLogHotDataRequest
     * @return GetDasSQLLogHotDataResponse
     */
    public GetDasSQLLogHotDataResponse getDasSQLLogHotData(GetDasSQLLogHotDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDasSQLLogHotDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API fetches the full details of a specific deadlock, including the transactions involved, the SQL statements, and the locks held and waited for. The deadlock can be from either a recent analysis or a full historical analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * Before you call this operation, ensure the following:</p>
     * <ul>
     * <li><strong>Supported engines</strong>:<ul>
     * <li>For recent deadlock analysis: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, PolarDB-X 2.0.</li>
     * <li>For full deadlock analysis: ApsaraDB RDS for MySQL or PolarDB for MySQL with <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Economy Edition</a> or <a href="https://help.aliyun.com/document_detail/190912.html">DAS Professional Edition</a> enabled.</li>
     * </ul>
     * </li>
     * <li><strong>SDK version</strong>: Use the latest version of the Alibaba Cloud SDK.</li>
     * <li><strong>Region</strong>: If you call the API via the SDK, set the region ID to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed information for a single deadlock event.</p>
     * 
     * @param request GetDeadLockDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeadLockDetailResponse
     */
    public GetDeadLockDetailResponse getDeadLockDetailWithOptions(GetDeadLockDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textId)) {
            query.put("TextId", request.textId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeadLockDetail"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeadLockDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API fetches the full details of a specific deadlock, including the transactions involved, the SQL statements, and the locks held and waited for. The deadlock can be from either a recent analysis or a full historical analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * Before you call this operation, ensure the following:</p>
     * <ul>
     * <li><strong>Supported engines</strong>:<ul>
     * <li>For recent deadlock analysis: ApsaraDB RDS for MySQL, self-managed MySQL, PolarDB for MySQL, PolarDB-X 2.0.</li>
     * <li>For full deadlock analysis: ApsaraDB RDS for MySQL or PolarDB for MySQL with <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Economy Edition</a> or <a href="https://help.aliyun.com/document_detail/190912.html">DAS Professional Edition</a> enabled.</li>
     * </ul>
     * </li>
     * <li><strong>SDK version</strong>: Use the latest version of the Alibaba Cloud SDK.</li>
     * <li><strong>Region</strong>: If you call the API via the SDK, set the region ID to <code>cn-shanghai</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed information for a single deadlock event.</p>
     * 
     * @param request GetDeadLockDetailRequest
     * @return GetDeadLockDetailResponse
     */
    public GetDeadLockDetailResponse getDeadLockDetail(GetDeadLockDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeadLockDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deadlock details of an ApsaraDB RDS for SQL Server instance.</p>
     * 
     * @param request GetDeadLockDetailListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeadLockDetailListResponse
     */
    public GetDeadLockDetailListResponse getDeadLockDetailListWithOptions(GetDeadLockDetailListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbNameList)) {
            query.put("DbNameList", request.dbNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeadLockDetailList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeadLockDetailListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deadlock details of an ApsaraDB RDS for SQL Server instance.</p>
     * 
     * @param request GetDeadLockDetailListRequest
     * @return GetDeadLockDetailListResponse
     */
    public GetDeadLockDetailListResponse getDeadLockDetailList(GetDeadLockDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeadLockDetailListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the historical analysis records for recent and full deadlock analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * The following requirements must be met before you call this operation:</p>
     * <ul>
     * <li>To query historical analysis records of recent deadlocks, the destination database engine must be RDS MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>To query historical analysis records of full deadlocks, the destination database engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly known as Economy Edition)</a> must be enabled.</li>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the historical analysis tasks for recent and full deadlock analysis.</p>
     * 
     * @param request GetDeadLockHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeadLockHistoryResponse
     */
    public GetDeadLockHistoryResponse getDeadLockHistoryWithOptions(GetDeadLockHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeadLockHistory"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeadLockHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the historical analysis records for recent and full deadlock analysis. For more information, see <a href="https://help.aliyun.com/document_detail/2858236.html">Deadlock analysis</a>.
     * The following requirements must be met before you call this operation:</p>
     * <ul>
     * <li>To query historical analysis records of recent deadlocks, the destination database engine must be RDS MySQL, self-managed MySQL, PolarDB for MySQL, or PolarDB-X 2.0.</li>
     * <li>To query historical analysis records of full deadlocks, the destination database engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly known as Economy Edition)</a> must be enabled.</li>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the historical analysis tasks for recent and full deadlock analysis.</p>
     * 
     * @param request GetDeadLockHistoryRequest
     * @return GetDeadLockHistoryResponse
     */
    public GetDeadLockHistoryResponse getDeadLockHistory(GetDeadLockHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeadLockHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the deadlock count from full deadlock analysis within a specified time range. DAS periodically analyzes fault logs, parses deadlock information, and collects statistics on deadlock count trends. For details, see <a href="https://help.aliyun.com/document_detail/2858236.html">Full deadlock analysis</a>.
     * Before you begin:</p>
     * <ul>
     * <li>The database DPI engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly DAS Economy Edition)</a> must be enabled.</li>
     * <li>If you use the China site (aliyun.com) or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deadlock count trend based on full deadlock analysis of error logs within a specified time range.</p>
     * 
     * @param request GetDeadlockHistogramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeadlockHistogramResponse
     */
    public GetDeadlockHistogramResponse getDeadlockHistogramWithOptions(GetDeadlockHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeadlockHistogram"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeadlockHistogramResponse());
    }

    /**
     * <b>description</b> :
     * <p>Invokes this operation to query the deadlock count from full deadlock analysis within a specified time range. DAS periodically analyzes fault logs, parses deadlock information, and collects statistics on deadlock count trends. For details, see <a href="https://help.aliyun.com/document_detail/2858236.html">Full deadlock analysis</a>.
     * Before you begin:</p>
     * <ul>
     * <li>The database DPI engine must be RDS MySQL or PolarDB for MySQL, and <a href="https://help.aliyun.com/document_detail/2666482.html">DAS Alibaba Cloud Managed Services (formerly DAS Economy Edition)</a> must be enabled.</li>
     * <li>If you use the China site (aliyun.com) or DAS SDK, use the latest version.</li>
     * <li>When you invoke DAS by using the SDK, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the deadlock count trend based on full deadlock analysis of error logs within a specified time range.</p>
     * 
     * @param request GetDeadlockHistogramRequest
     * @return GetDeadlockHistogramResponse
     */
    public GetDeadlockHistogramResponse getDeadlockHistogram(GetDeadlockHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeadlockHistogramWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetErrorRequestSample is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries information about failed SQL queries in SQL Explorer data. You can query up to 20 failed SQL queries within the specific time range.</p>
     * 
     * @param request GetErrorRequestSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErrorRequestSampleResponse
     */
    public GetErrorRequestSampleResponse getErrorRequestSampleWithOptions(GetErrorRequestSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErrorRequestSample"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetErrorRequestSampleResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetErrorRequestSample is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of <strong>isFinish</strong> is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of <strong>isFinish</strong> is <strong>true</strong>, the complete results are returned.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Enterprise Edition is enabled. For more information, see <a href="https://help.aliyun.com/document_detail/163298.html">Purchase DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries information about failed SQL queries in SQL Explorer data. You can query up to 20 failed SQL queries within the specific time range.</p>
     * 
     * @param request GetErrorRequestSampleRequest
     * @return GetErrorRequestSampleResponse
     */
    public GetErrorRequestSampleResponse getErrorRequestSample(GetErrorRequestSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErrorRequestSampleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the event subscription settings of a database instance.</p>
     * 
     * @param request GetEventSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventSubscriptionResponse
     */
    public GetEventSubscriptionResponse getEventSubscriptionWithOptions(GetEventSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventSubscription"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventSubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the event subscription settings of a database instance.</p>
     * 
     * @param request GetEventSubscriptionRequest
     * @return GetEventSubscriptionResponse
     */
    public GetEventSubscriptionResponse getEventSubscription(GetEventSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Collects the full request statistics in the SQL Explorer results of a database instance by access source.</p>
     * 
     * @param request GetFullRequestOriginStatByInstanceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFullRequestOriginStatByInstanceIdResponse
     */
    public GetFullRequestOriginStatByInstanceIdResponse getFullRequestOriginStatByInstanceIdWithOptions(GetFullRequestOriginStatByInstanceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFullRequestOriginStatByInstanceId"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFullRequestOriginStatByInstanceIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview</a>.</li>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Collects the full request statistics in the SQL Explorer results of a database instance by access source.</p>
     * 
     * @param request GetFullRequestOriginStatByInstanceIdRequest
     * @return GetFullRequestOriginStatByInstanceIdResponse
     */
    public GetFullRequestOriginStatByInstanceIdResponse getFullRequestOriginStatByInstanceId(GetFullRequestOriginStatByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestOriginStatByInstanceIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about the database engines that support SQL Explorer, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries sample SQL statements in the SQL Explorer data of a database instance by SQL ID. You can query up to 20 sample SQL statements.</p>
     * 
     * @param request GetFullRequestSampleByInstanceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFullRequestSampleByInstanceIdResponse
     */
    public GetFullRequestSampleByInstanceIdResponse getFullRequestSampleByInstanceIdWithOptions(GetFullRequestSampleByInstanceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            body.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFullRequestSampleByInstanceId"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFullRequestSampleByInstanceIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * <ul>
     * <li>For more information about the database engines that support SQL Explorer, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries sample SQL statements in the SQL Explorer data of a database instance by SQL ID. You can query up to 20 sample SQL statements.</p>
     * 
     * @param request GetFullRequestSampleByInstanceIdRequest
     * @return GetFullRequestSampleByInstanceIdResponse
     */
    public GetFullRequestSampleByInstanceIdResponse getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestSampleByInstanceIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetFullRequestStatResultByInstanceId is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the isFinish parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the isFinish parameter is <strong>true</strong>, the complete results are returned.
     * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously collects the full request statistics in the SQL Explorer results of a database instance by SQL ID.</p>
     * 
     * @param request GetFullRequestStatResultByInstanceIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFullRequestStatResultByInstanceIdResponse
     */
    public GetFullRequestStatResultByInstanceIdResponse getFullRequestStatResultByInstanceIdWithOptions(GetFullRequestStatResultByInstanceIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originHost)) {
            query.put("OriginHost", request.originHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFullRequestStatResultByInstanceId"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFullRequestStatResultByInstanceIdResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetFullRequestStatResultByInstanceId is an asynchronous operation. After a request is sent, the complete results are not returned immediately. If the value of the isFinish parameter is <strong>false</strong> in the response, wait for 1 second and then send a request again. If the value of the isFinish parameter is <strong>true</strong>, the complete results are returned.
     * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see <a href="https://help.aliyun.com/document_detail/204096.html">SQL Explorer</a>.</p>
     * </blockquote>
     * <ul>
     * <li>For more information about database instances that support this feature, see <a href="https://help.aliyun.com/document_detail/190912.html">Overview of DAS Enterprise Edition</a>.</li>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>When you call this operation, the value of the SqlId parameter changes due to the optimization of the SQL template algorithm starting from September 1, 2024. For more information, see <a href="~~2845725~~">[Notice] Optimization of the SQL template algorithm</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously collects the full request statistics in the SQL Explorer results of a database instance by SQL ID.</p>
     * 
     * @param request GetFullRequestStatResultByInstanceIdRequest
     * @return GetFullRequestStatResultByInstanceIdResponse
     */
    public GetFullRequestStatResultByInstanceIdResponse getFullRequestStatResultByInstanceId(GetFullRequestStatResultByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestStatResultByInstanceIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enabling the automated operations report feature for DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported. This operation is used to query report details.
     * Before using this operation, ensure that the following prerequisites are met:</p>
     * <ul>
     * <li>DAS Agent is activated and the agent is still within its validity period.</li>
     * <li>The daily report feature is enabled on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of the DAS SDK is 1.0.3 or later.</li>
     * <li>When using the SDK to call DAS, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a DAS Agent automated operations report.</p>
     * 
     * @param request GetInstanceGroupInspectReportDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceGroupInspectReportDetailResponse
     */
    public GetInstanceGroupInspectReportDetailResponse getInstanceGroupInspectReportDetailWithOptions(GetInstanceGroupInspectReportDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceGroupInspectReportDetail"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceGroupInspectReportDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enabling the automated operations report feature for DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported. This operation is used to query report details.
     * Before using this operation, ensure that the following prerequisites are met:</p>
     * <ul>
     * <li>DAS Agent is activated and the agent is still within its validity period.</li>
     * <li>The daily report feature is enabled on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of the DAS SDK is 1.0.3 or later.</li>
     * <li>When using the SDK to call DAS, set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a DAS Agent automated operations report.</p>
     * 
     * @param request GetInstanceGroupInspectReportDetailRequest
     * @return GetInstanceGroupInspectReportDetailResponse
     */
    public GetInstanceGroupInspectReportDetailResponse getInstanceGroupInspectReportDetail(GetInstanceGroupInspectReportDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceGroupInspectReportDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enabling the O&amp;M report feature of DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported.
     * Before you begin:</p>
     * <ul>
     * <li>Activate DAS Agent and ensure that the Agent is still within its validity period.</li>
     * <li>Enable the daily report feature on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>Use DAS SDK 1.0.3 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to ap-southeast-1.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of O&amp;M reports generated by DAS Agent.</p>
     * 
     * @param request GetInstanceGroupInspectReportListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceGroupInspectReportListResponse
     */
    public GetInstanceGroupInspectReportListResponse getInstanceGroupInspectReportListWithOptions(GetInstanceGroupInspectReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceGroupInspectReportList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceGroupInspectReportListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enabling the O&amp;M report feature of DAS Agent allows the system to perform periodic inspections on target instances and generate reports. Currently, only daily reports are supported.
     * Before you begin:</p>
     * <ul>
     * <li>Activate DAS Agent and ensure that the Agent is still within its validity period.</li>
     * <li>Enable the daily report feature on the DAS Agent configuration page.</li>
     * <li>When using the Alibaba Cloud SDK, ensure that the version of aliyun-sdk-core is later than 4.3.3. Use the latest version.</li>
     * <li>Use DAS SDK 1.0.3 or later.</li>
     * <li>When calling DAS by using the SDK, set the region to ap-southeast-1.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of O&amp;M reports generated by DAS Agent.</p>
     * 
     * @param request GetInstanceGroupInspectReportListRequest
     * @return GetInstanceGroupInspectReportListResponse
     */
    public GetInstanceGroupInspectReportListResponse getInstanceGroupInspectReportList(GetInstanceGroupInspectReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceGroupInspectReportListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see <a href="https://help.aliyun.com/document_detail/205659.html">Inspection and scoring</a>.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.</li>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of DAS SDK must be V1.0.3 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an inspection that is performed on a database instance by using the inspection and scoring feature.</p>
     * 
     * @param request GetInstanceInspectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceInspectionsResponse
     */
    public GetInstanceInspectionsResponse getInstanceInspectionsWithOptions(GetInstanceInspectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceArea)) {
            query.put("InstanceArea", request.instanceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchMap)) {
            query.put("SearchMap", request.searchMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceInspections"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceInspectionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see <a href="https://help.aliyun.com/document_detail/205659.html">Inspection and scoring</a>.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.</li>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of DAS SDK must be V1.0.3 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an inspection that is performed on a database instance by using the inspection and scoring feature.</p>
     * 
     * @param request GetInstanceInspectionsRequest
     * @return GetInstanceInspectionsResponse
     */
    public GetInstanceInspectionsResponse getInstanceInspections(GetInstanceInspectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceInspectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of all missing indexes for an instance.</p>
     * 
     * @param request GetInstanceMissingIndexListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceMissingIndexListResponse
     */
    public GetInstanceMissingIndexListResponse getInstanceMissingIndexListWithOptions(GetInstanceMissingIndexListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avgTotalUserCost)) {
            query.put("AvgTotalUserCost", request.avgTotalUserCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avgUserImpact)) {
            query.put("AvgUserImpact", request.avgUserImpact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexCount)) {
            query.put("IndexCount", request.indexCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectName)) {
            query.put("ObjectName", request.objectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedPages)) {
            query.put("ReservedPages", request.reservedPages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedSize)) {
            query.put("ReservedSize", request.reservedSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            query.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueCompiles)) {
            query.put("UniqueCompiles", request.uniqueCompiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userScans)) {
            query.put("UserScans", request.userScans);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSeeks)) {
            query.put("UserSeeks", request.userSeeks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceMissingIndexList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceMissingIndexListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for SQL Server instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns details of all missing indexes for an instance.</p>
     * 
     * @param request GetInstanceMissingIndexListRequest
     * @return GetInstanceMissingIndexListResponse
     */
    public GetInstanceMissingIndexListResponse getInstanceMissingIndexList(GetInstanceMissingIndexListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceMissingIndexListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics on automatic SQL optimization events within a period of time, such as the total number of optimization events and the maximum improvement.</p>
     * 
     * @param request GetInstanceSqlOptimizeStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSqlOptimizeStatisticResponse
     */
    public GetInstanceSqlOptimizeStatisticResponse getInstanceSqlOptimizeStatisticWithOptions(GetInstanceSqlOptimizeStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterEnable)) {
            query.put("FilterEnable", request.filterEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useMerging)) {
            query.put("UseMerging", request.useMerging);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSqlOptimizeStatistic"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSqlOptimizeStatisticResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics on automatic SQL optimization events within a period of time, such as the total number of optimization events and the maximum improvement.</p>
     * 
     * @param request GetInstanceSqlOptimizeStatisticRequest
     * @return GetInstanceSqlOptimizeStatisticResponse
     */
    public GetInstanceSqlOptimizeStatisticResponse getInstanceSqlOptimizeStatistic(GetInstanceSqlOptimizeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSqlOptimizeStatisticWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a task that terminates sessions.</p>
     * 
     * @param request GetKillInstanceSessionTaskResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKillInstanceSessionTaskResultResponse
     */
    public GetKillInstanceSessionTaskResultResponse getKillInstanceSessionTaskResultWithOptions(GetKillInstanceSessionTaskResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKillInstanceSessionTaskResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKillInstanceSessionTaskResultResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a task that terminates sessions.</p>
     * 
     * @param request GetKillInstanceSessionTaskResultRequest
     * @return GetKillInstanceSessionTaskResultResponse
     */
    public GetKillInstanceSessionTaskResultResponse getKillInstanceSessionTaskResult(GetKillInstanceSessionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKillInstanceSessionTaskResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to MongoDB instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current sessions of an ApsaraDB for MongoDB (MongoDB) instance.</p>
     * 
     * @param request GetMongoDBCurrentOpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMongoDBCurrentOpResponse
     */
    public GetMongoDBCurrentOpResponse getMongoDBCurrentOpWithOptions(GetMongoDBCurrentOpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterDoc)) {
            query.put("FilterDoc", request.filterDoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMongoDBCurrentOp"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMongoDBCurrentOpResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to MongoDB instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current sessions of an ApsaraDB for MongoDB (MongoDB) instance.</p>
     * 
     * @param request GetMongoDBCurrentOpRequest
     * @return GetMongoDBCurrentOpResponse
     */
    public GetMongoDBCurrentOpResponse getMongoDBCurrentOp(GetMongoDBCurrentOpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMongoDBCurrentOpWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a request ID. You need to use the request ID to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and PolarDB-X 2.0 instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the sessions of an instance and collects statistics on the sessions based on dimensions.</p>
     * 
     * @param request GetMySQLAllSessionAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMySQLAllSessionAsyncResponse
     */
    public GetMySQLAllSessionAsyncResponse getMySQLAllSessionAsyncWithOptions(GetMySQLAllSessionAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultId)) {
            query.put("ResultId", request.resultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMySQLAllSessionAsync"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMySQLAllSessionAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>GetMySQLAllSessionAsync is an asynchronous operation. After a request is sent, the system does not return complete results but returns a request ID. You need to use the request ID to initiate requests until the value of the <strong>isFinish</strong> field in the returned results is <strong>true</strong>, the complete results are returned. This indicates that to obtain complete data, you must call this operation at least twice.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and PolarDB-X 2.0 instances.</li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously queries the sessions of an instance and collects statistics on the sessions based on dimensions.</p>
     * 
     * @param request GetMySQLAllSessionAsyncRequest
     * @return GetMySQLAllSessionAsyncResponse
     */
    public GetMySQLAllSessionAsyncResponse getMySQLAllSessionAsync(GetMySQLAllSessionAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMySQLAllSessionAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the <a href="https://help.aliyun.com/document_detail/470302.html">heatmap</a> feature of Database Autonomy Service (DAS) to query the data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access frequency statistics and hot data on partitions of a PolarDB-X 2.0 instance.</p>
     * 
     * @param request GetPartitionsHeatmapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPartitionsHeatmapResponse
     */
    public GetPartitionsHeatmapResponse getPartitionsHeatmapWithOptions(GetPartitionsHeatmapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPartitionsHeatmap"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPartitionsHeatmapResponse());
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the <a href="https://help.aliyun.com/document_detail/470302.html">heatmap</a> feature of Database Autonomy Service (DAS) to query the data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access frequency statistics and hot data on partitions of a PolarDB-X 2.0 instance.</p>
     * 
     * @param request GetPartitionsHeatmapRequest
     * @return GetPartitionsHeatmapResponse
     */
    public GetPartitionsHeatmapResponse getPartitionsHeatmap(GetPartitionsHeatmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPartitionsHeatmapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trend of a metric for the new version of the performance insight feature of a database instance.</p>
     * 
     * @param request GetPfsMetricTrendsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPfsMetricTrendsResponse
     */
    public GetPfsMetricTrendsResponse getPfsMetricTrendsWithOptions(GetPfsMetricTrendsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPfsMetricTrends"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPfsMetricTrendsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the trend of a metric for the new version of the performance insight feature of a database instance.</p>
     * 
     * @param request GetPfsMetricTrendsRequest
     * @return GetPfsMetricTrendsResponse
     */
    public GetPfsMetricTrendsResponse getPfsMetricTrends(GetPfsMetricTrendsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsMetricTrendsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL sample data for the new version of the performance insight feature of a database instance.</p>
     * 
     * @param request GetPfsSqlSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPfsSqlSampleResponse
     */
    public GetPfsSqlSampleResponse getPfsSqlSampleWithOptions(GetPfsSqlSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPfsSqlSample"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPfsSqlSampleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.</li>
     * <li>The new version of the performance insight feature is enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance insight (new version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL sample data for the new version of the performance insight feature of a database instance.</p>
     * 
     * @param request GetPfsSqlSampleRequest
     * @return GetPfsSqlSampleResponse
     */
    public GetPfsSqlSampleResponse getPfsSqlSample(GetPfsSqlSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsSqlSampleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites for using this API:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling the DAS service using the SDK, specify the region as cn-shanghai.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The target database instance has Performance Insight (New Version) enabled. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance Insight (New Version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the GetPfsSqlSummaries API to query all request data using the SQL ID dimension in Performance Insight (New Version) for a database instance.</p>
     * 
     * @param request GetPfsSqlSummariesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPfsSqlSummariesResponse
     */
    public GetPfsSqlSummariesResponse getPfsSqlSummariesWithOptions(GetPfsSqlSummariesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            body.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            body.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPfsSqlSummaries"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPfsSqlSummariesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites for using this API:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS SDK.</li>
     * <li>When calling the DAS service using the SDK, specify the region as cn-shanghai.</li>
     * <li>The target database instance is RDS MySQL or PolarDB MySQL.</li>
     * <li>The target database instance has Performance Insight (New Version) enabled. For more information, see <a href="https://help.aliyun.com/document_detail/469117.html">Performance Insight (New Version)</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the GetPfsSqlSummaries API to query all request data using the SQL ID dimension in Performance Insight (New Version) for a database instance.</p>
     * 
     * @param request GetPfsSqlSummariesRequest
     * @return GetPfsSqlSummariesResponse
     */
    public GetPfsSqlSummariesResponse getPfsSqlSummaries(GetPfsSqlSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsSqlSummariesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns SQL template statistics from query governance data.</p>
     * 
     * @param request GetQueryOptimizeDataStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeDataStatsResponse
     */
    public GetQueryOptimizeDataStatsResponse getQueryOptimizeDataStatsWithOptions(GetQueryOptimizeDataStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeDataStats"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeDataStatsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns SQL template statistics from query governance data.</p>
     * 
     * @param request GetQueryOptimizeDataStatsRequest
     * @return GetQueryOptimizeDataStatsResponse
     */
    public GetQueryOptimizeDataStatsResponse getQueryOptimizeDataStats(GetQueryOptimizeDataStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataStatsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns the best- and worst-performing instances based on query governance data.</p>
     * 
     * @param request GetQueryOptimizeDataTopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeDataTopResponse
     */
    public GetQueryOptimizeDataTopResponse getQueryOptimizeDataTopWithOptions(GetQueryOptimizeDataTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeDataTop"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeDataTopResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Returns the best- and worst-performing instances based on query governance data.</p>
     * 
     * @param request GetQueryOptimizeDataTopRequest
     * @return GetQueryOptimizeDataTopResponse
     */
    public GetQueryOptimizeDataTopResponse getQueryOptimizeDataTop(GetQueryOptimizeDataTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataTopWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries query governance trend data.</p>
     * 
     * @param request GetQueryOptimizeDataTrendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeDataTrendResponse
     */
    public GetQueryOptimizeDataTrendResponse getQueryOptimizeDataTrendWithOptions(GetQueryOptimizeDataTrendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeDataTrend"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeDataTrendResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries query governance trend data.</p>
     * 
     * @param request GetQueryOptimizeDataTrendRequest
     * @return GetQueryOptimizeDataTrendResponse
     */
    public GetQueryOptimizeDataTrendResponse getQueryOptimizeDataTrend(GetQueryOptimizeDataTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataTrendWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the failed SQL statements under a SQL template.</p>
     * 
     * @param request GetQueryOptimizeExecErrorSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeExecErrorSampleResponse
     */
    public GetQueryOptimizeExecErrorSampleResponse getQueryOptimizeExecErrorSampleWithOptions(GetQueryOptimizeExecErrorSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeExecErrorSample"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeExecErrorSampleResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the failed SQL statements under a SQL template.</p>
     * 
     * @param request GetQueryOptimizeExecErrorSampleRequest
     * @return GetQueryOptimizeExecErrorSampleResponse
     */
    public GetQueryOptimizeExecErrorSampleResponse getQueryOptimizeExecErrorSample(GetQueryOptimizeExecErrorSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeExecErrorSampleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL templates that failed to be executed.</p>
     * 
     * @param request GetQueryOptimizeExecErrorStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeExecErrorStatsResponse
     */
    public GetQueryOptimizeExecErrorStatsResponse getQueryOptimizeExecErrorStatsWithOptions(GetQueryOptimizeExecErrorStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeExecErrorStats"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeExecErrorStatsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL templates that failed to be executed.</p>
     * 
     * @param request GetQueryOptimizeExecErrorStatsRequest
     * @return GetQueryOptimizeExecErrorStatsResponse
     */
    public GetQueryOptimizeExecErrorStatsResponse getQueryOptimizeExecErrorStats(GetQueryOptimizeExecErrorStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeExecErrorStatsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags added by the query governance feature to specified database instances.</p>
     * 
     * @param request GetQueryOptimizeRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeRuleListResponse
     */
    public GetQueryOptimizeRuleListResponse getQueryOptimizeRuleListWithOptions(GetQueryOptimizeRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeRuleList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeRuleListResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags added by the query governance feature to specified database instances.</p>
     * 
     * @param request GetQueryOptimizeRuleListRequest
     * @return GetQueryOptimizeRuleListResponse
     */
    public GetQueryOptimizeRuleListResponse getQueryOptimizeRuleList(GetQueryOptimizeRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a share URL provided by the query governance feature.</p>
     * 
     * @param request GetQueryOptimizeShareUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeShareUrlResponse
     */
    public GetQueryOptimizeShareUrlResponse getQueryOptimizeShareUrlWithOptions(GetQueryOptimizeShareUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbNames)) {
            query.put("DbNames", request.dbNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalOperator)) {
            query.put("LogicalOperator", request.logicalOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyOptimizedSql)) {
            query.put("OnlyOptimizedSql", request.onlyOptimizedSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlIds)) {
            query.put("SqlIds", request.sqlIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagNames)) {
            query.put("TagNames", request.tagNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeShareUrl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeShareUrlResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a share URL provided by the query governance feature.</p>
     * 
     * @param request GetQueryOptimizeShareUrlRequest
     * @return GetQueryOptimizeShareUrlResponse
     */
    public GetQueryOptimizeShareUrlResponse getQueryOptimizeShareUrl(GetQueryOptimizeShareUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeShareUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries suggestions provided by query governance for optimizing an SQL template.</p>
     * 
     * @param request GetQueryOptimizeSolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeSolutionResponse
     */
    public GetQueryOptimizeSolutionResponse getQueryOptimizeSolutionWithOptions(GetQueryOptimizeSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeSolution"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeSolutionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries suggestions provided by query governance for optimizing an SQL template.</p>
     * 
     * @param request GetQueryOptimizeSolutionRequest
     * @return GetQueryOptimizeSolutionResponse
     */
    public GetQueryOptimizeSolutionResponse getQueryOptimizeSolution(GetQueryOptimizeSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeSolutionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of a specified SQL statement by calling the GetQueryOptimizeTag operation.</p>
     * 
     * @param request GetQueryOptimizeTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryOptimizeTagResponse
     */
    public GetQueryOptimizeTagResponse getQueryOptimizeTagWithOptions(GetQueryOptimizeTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeTag"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeTagResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When using the Alibaba Cloud or DAS SDK, use the latest version.</li>
     * <li>When calling DAS by using the SDK, set the region to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>PolarDB for MySQL</li>
     * <li>RDS PostgreSQL</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags of a specified SQL statement by calling the GetQueryOptimizeTag operation.</p>
     * 
     * @param request GetQueryOptimizeTagRequest
     * @return GetQueryOptimizeTagResponse
     */
    public GetQueryOptimizeTagResponse getQueryOptimizeTag(GetQueryOptimizeTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeTagWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * <li>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.<blockquote>
     * <p>This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current session on an ApsaraDB for Redis instance.</p>
     * 
     * @param request GetRedisAllSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRedisAllSessionResponse
     */
    public GetRedisAllSessionResponse getRedisAllSessionWithOptions(GetRedisAllSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRedisAllSession"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRedisAllSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB for Redis instances.</li>
     * <li>If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.<blockquote>
     * <p>This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the current session on an ApsaraDB for Redis instance.</p>
     * 
     * @param request GetRedisAllSessionRequest
     * @return GetRedisAllSessionResponse
     */
    public GetRedisAllSessionResponse getRedisAllSession(GetRedisAllSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRedisAllSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL diagnostics records by pages.</p>
     * 
     * @param request GetRequestDiagnosisPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRequestDiagnosisPageResponse
     */
    public GetRequestDiagnosisPageResponse getRequestDiagnosisPageWithOptions(GetRequestDiagnosisPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRequestDiagnosisPage"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRequestDiagnosisPageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>ApsaraDB RDS for PostgreSQL</li>
     * <li>ApsaraDB RDS for SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Compatible with Oracle)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see <a href="https://help.aliyun.com/document_detail/146895.html">Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL diagnostics records by pages.</p>
     * 
     * @param request GetRequestDiagnosisPageRequest
     * @return GetRequestDiagnosisPageResponse
     */
    public GetRequestDiagnosisPageResponse getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRequestDiagnosisPageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API has the following prerequisites:</p>
     * <ul>
     * <li>When you use an SDK to call the DAS service, you must set the region to cn-shanghai.</li>
     * <li>This API does not support querying diagnosis results for automatic SQL optimization.</li>
     * <li>This API supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Oracle-Compatible)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>RDS PostgreSQL instances require minor kernel version 20220130 or later. To view and upgrade the minor kernel version, see <a href="https://help.aliyun.com/document_detail/146895.html">Upgrade the minor kernel version</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call GetRequestDiagnosisResult to retrieve the SQL diagnosis results.</p>
     * 
     * @param request GetRequestDiagnosisResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRequestDiagnosisResultResponse
     */
    public GetRequestDiagnosisResultResponse getRequestDiagnosisResultWithOptions(GetRequestDiagnosisResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRequestDiagnosisResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRequestDiagnosisResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API has the following prerequisites:</p>
     * <ul>
     * <li>When you use an SDK to call the DAS service, you must set the region to cn-shanghai.</li>
     * <li>This API does not support querying diagnosis results for automatic SQL optimization.</li>
     * <li>This API supports the following database engines:<ul>
     * <li>RDS MySQL</li>
     * <li>RDS PostgreSQL</li>
     * <li>RDS SQL Server</li>
     * <li>PolarDB for MySQL</li>
     * <li>PolarDB for PostgreSQL (Oracle-Compatible)</li>
     * <li>ApsaraDB for MongoDB<blockquote>
     * <p>RDS PostgreSQL instances require minor kernel version 20220130 or later. To view and upgrade the minor kernel version, see <a href="https://help.aliyun.com/document_detail/146895.html">Upgrade the minor kernel version</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call GetRequestDiagnosisResult to retrieve the SQL diagnosis results.</p>
     * 
     * @param request GetRequestDiagnosisResultRequest
     * @return GetRequestDiagnosisResultResponse
     */
    public GetRequestDiagnosisResultResponse getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRequestDiagnosisResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the throttling rules that are in effect.</p>
     * 
     * @param request GetRunningSqlConcurrencyControlRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRunningSqlConcurrencyControlRulesResponse
     */
    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRulesWithOptions(GetRunningSqlConcurrencyControlRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRunningSqlConcurrencyControlRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunningSqlConcurrencyControlRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the throttling rules that are in effect.</p>
     * 
     * @param request GetRunningSqlConcurrencyControlRulesRequest
     * @return GetRunningSqlConcurrencyControlRulesResponse
     */
    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRunningSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a throttling keyword string based on an SQL statement.</p>
     * 
     * @param request GetSqlConcurrencyControlKeywordsFromSqlTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlConcurrencyControlKeywordsFromSqlTextResponse
     */
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse getSqlConcurrencyControlKeywordsFromSqlTextWithOptions(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlText)) {
            query.put("SqlText", request.sqlText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlConcurrencyControlKeywordsFromSqlText"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlConcurrencyControlKeywordsFromSqlTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a throttling keyword string based on an SQL statement.</p>
     * 
     * @param request GetSqlConcurrencyControlKeywordsFromSqlTextRequest
     * @return GetSqlConcurrencyControlKeywordsFromSqlTextResponse
     */
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlConcurrencyControlKeywordsFromSqlTextWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the throttling rules that are being executed or have been triggered.</p>
     * 
     * @param request GetSqlConcurrencyControlRulesHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlConcurrencyControlRulesHistoryResponse
     */
    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistoryWithOptions(GetSqlConcurrencyControlRulesHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlConcurrencyControlRulesHistory"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlConcurrencyControlRulesHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following database engines:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL</li>
     * <li>PolarDB for MySQL</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the throttling rules that are being executed or have been triggered.</p>
     * 
     * @param request GetSqlConcurrencyControlRulesHistoryRequest
     * @return GetSqlConcurrencyControlRulesHistoryResponse
     */
    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlConcurrencyControlRulesHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see <a href="https://help.aliyun.com/document_detail/167895.html">Automatic SQL optimization</a>.</p>
     * <blockquote>
     * <p>Returns only optimization suggestions that the SQL diagnostics feature automatically generates.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries optimization suggestions that are generated by the SQL diagnostics feature of Database Autonomy Service (DAS).</p>
     * 
     * @param request GetSqlOptimizeAdviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlOptimizeAdviceResponse
     */
    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdviceWithOptions(GetSqlOptimizeAdviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDt)) {
            query.put("EndDt", request.endDt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDt)) {
            query.put("StartDt", request.startDt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlOptimizeAdvice"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSqlOptimizeAdviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see <a href="https://help.aliyun.com/document_detail/167895.html">Automatic SQL optimization</a>.</p>
     * <blockquote>
     * <p>Returns only optimization suggestions that the SQL diagnostics feature automatically generates.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries optimization suggestions that are generated by the SQL diagnostics feature of Database Autonomy Service (DAS).</p>
     * 
     * @param request GetSqlOptimizeAdviceRequest
     * @return GetSqlOptimizeAdviceResponse
     */
    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlOptimizeAdviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The physical file size indicates the actual size of an obtained file. Only specific deployment modes of database instances support the display of physical file sizes. The statistics on tables are obtained from <code>information_schema.tables</code>. Statistics in MySQL are not updated in real time. Therefore, the statistics may be different from the physical file sizes. If you want to obtain the latest data, you can execute the <code>ANALYZE TABLE</code> statement on the relevant tables during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of a storage analysis task.</p>
     * 
     * @param request GetStorageAnalysisResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStorageAnalysisResultResponse
     */
    public GetStorageAnalysisResultResponse getStorageAnalysisResultWithOptions(GetStorageAnalysisResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageAnalysisResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageAnalysisResultResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The physical file size indicates the actual size of an obtained file. Only specific deployment modes of database instances support the display of physical file sizes. The statistics on tables are obtained from <code>information_schema.tables</code>. Statistics in MySQL are not updated in real time. Therefore, the statistics may be different from the physical file sizes. If you want to obtain the latest data, you can execute the <code>ANALYZE TABLE</code> statement on the relevant tables during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to ApsaraDB RDS for MySQL instances, PolarDB for MySQL clusters, and ApsaraDB for MongoDB instances.</li>
     * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this operation works the same as the storage analysis feature of the previous version. Tasks generated by this operation cannot be viewed on the Storage Analysis page of the new version in the Database Autonomy Service (DAS) console. If you want to view the tasks and results, call the related API operation to obtain data and save data to your computer.</li>
     * <li>If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status and results of a storage analysis task.</p>
     * 
     * @param request GetStorageAnalysisResultRequest
     * @return GetStorageAnalysisResultResponse
     */
    public GetStorageAnalysisResultResponse getStorageAnalysisResult(GetStorageAnalysisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageAnalysisResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Provides the Alibaba Cloud ApsaraDB Agent foundation model capability interface for AI chat, performance diagnostics, and other features.</p>
     * 
     * @param request GetYaoChiAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYaoChiAgentResponse
     */
    public GetYaoChiAgentResponse getYaoChiAgentWithOptions(GetYaoChiAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageKeys)) {
            query.put("ImageKeys", request.imageKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYaoChiAgent"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYaoChiAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Provides the Alibaba Cloud ApsaraDB Agent foundation model capability interface for AI chat, performance diagnostics, and other features.</p>
     * 
     * @param request GetYaoChiAgentRequest
     * @return GetYaoChiAgentResponse
     */
    public GetYaoChiAgentResponse getYaoChiAgent(GetYaoChiAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYaoChiAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB for Redis.</li>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates all sessions on an instance.</p>
     * 
     * @param request KillInstanceAllSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillInstanceAllSessionResponse
     */
    public KillInstanceAllSessionResponse killInstanceAllSessionWithOptions(KillInstanceAllSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillInstanceAllSession"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillInstanceAllSessionResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to ApsaraDB for Redis.</li>
     * <li>If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.</li>
     * <li>The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates all sessions on an instance.</p>
     * 
     * @param request KillInstanceAllSessionRequest
     * @return KillInstanceAllSessionResponse
     */
    public KillInstanceAllSessionResponse killInstanceAllSession(KillInstanceAllSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killInstanceAllSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies the following auto scaling configurations for an instance: <strong>auto scaling for specifications</strong>, <strong>automatic storage expansion</strong>, <strong>automatic bandwidth adjustment</strong>, and <strong>auto scaling for resources</strong>.</p>
     * <ul>
     * <li>You can modify the configurations of the <strong>auto scaling feature for specifications</strong> for the following types of database instances:<ul>
     * <li>PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic storage expansion</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/173345.html">Automatic space expansion</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic bandwidth adjustment</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/216312.html">Automatic bandwidth adjustment</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>auto scaling feature for resources</strong> for the following types of database instances:<ul>
     * <li>General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the auto scaling configurations of an instance.</p>
     * 
     * @param request ModifyAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoScalingConfigResponse
     */
    public ModifyAutoScalingConfigResponse modifyAutoScalingConfigWithOptions(ModifyAutoScalingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shard)) {
            query.put("Shard", request.shard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storage)) {
            query.put("Storage", request.storage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoScalingConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoScalingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the following auto scaling configurations for an instance: <strong>auto scaling for specifications</strong>, <strong>automatic storage expansion</strong>, <strong>automatic bandwidth adjustment</strong>, and <strong>auto scaling for resources</strong>.</p>
     * <ul>
     * <li>You can modify the configurations of the <strong>auto scaling feature for specifications</strong> for the following types of database instances:<ul>
     * <li>PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic storage expansion</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/173345.html">Automatic space expansion</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>automatic bandwidth adjustment</strong> feature for the following types of database instances:<ul>
     * <li>ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/216312.html">Automatic bandwidth adjustment</a>.</li>
     * </ul>
     * </li>
     * <li>You can modify the configurations of the <strong>auto scaling feature for resources</strong> for the following types of database instances:<ul>
     * <li>General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see <a href="https://help.aliyun.com/document_detail/169686.html">Automatic performance scaling</a>.</li>
     * </ul>
     * </li>
     * <li>If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the auto scaling configurations of an instance.</p>
     * 
     * @param request ModifyAutoScalingConfigRequest
     * @return ModifyAutoScalingConfigResponse
     */
    public ModifyAutoScalingConfigResponse modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, note the following:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, specify the cn-shanghai region.</li>
     * <li>This operation uses the latest supported version by default. For more information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a cross-product whitelist template.</p>
     * 
     * @param request ModifySecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityIPGroupResponse
     */
    public ModifySecurityIPGroupResponse modifySecurityIPGroupWithOptions(ModifySecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIPGroup"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIPGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, note the following:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or DAS SDK.</li>
     * <li>When you use an SDK to call the DAS service, specify the cn-shanghai region.</li>
     * <li>This operation uses the latest supported version by default. For more information about the databases and regions that are supported by different versions of DAS Enterprise Edition, see <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a cross-product whitelist template.</p>
     * 
     * @param request ModifySecurityIPGroupRequest
     * @return ModifySecurityIPGroupResponse
     */
    public ModifySecurityIPGroupResponse modifySecurityIPGroup(ModifySecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS software development kit (SDK).</li>
     * <li>When you use the SDK to call the DAS service, set the region to cn-shanghai.</li>
     * <li>For more information about the supported database instances, see <a href="https://help.aliyun.com/document_detail/92561.html">Overview of features</a> for SQL Insight and Audit.</li>
     * <li>The SQL Insight and Audit (Legacy) feature is enabled for the destination database instance. For more information about how to enable this feature, see <a href="https://help.aliyun.com/document_detail/92561.html">Enable SQL Insight and Audit</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches or detaches a cross-product whitelist template.</p>
     * 
     * @param request ModifySecurityIPGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityIPGroupRelationResponse
     */
    public ModifySecurityIPGroupRelationResponse modifySecurityIPGroupRelationWithOptions(ModifySecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionName)) {
            query.put("RegionName", request.regionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIPGroupRelation"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIPGroupRelationResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud or DAS software development kit (SDK).</li>
     * <li>When you use the SDK to call the DAS service, set the region to cn-shanghai.</li>
     * <li>For more information about the supported database instances, see <a href="https://help.aliyun.com/document_detail/92561.html">Overview of features</a> for SQL Insight and Audit.</li>
     * <li>The SQL Insight and Audit (Legacy) feature is enabled for the destination database instance. For more information about how to enable this feature, see <a href="https://help.aliyun.com/document_detail/92561.html">Enable SQL Insight and Audit</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches or detaches a cross-product whitelist template.</p>
     * 
     * @param request ModifySecurityIPGroupRelationRequest
     * @return ModifySecurityIPGroupRelationResponse
     */
    public ModifySecurityIPGroupRelationResponse modifySecurityIPGroupRelation(ModifySecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIPGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation enables the latest supported version of DAS Enterprise Edition by default. See <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a> for the databases and regions supported by each version of DAS Enterprise Edition.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Use the <code>ModifySqlLogConfig</code> operation to enable or configure DAS Enterprise Edition for a database instance.</p>
     * 
     * @param request ModifySqlLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySqlLogConfigResponse
     */
    public ModifySqlLogConfigResponse modifySqlLogConfigWithOptions(ModifySqlLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableAudit)) {
            query.put("EnableAudit", request.enableAudit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotRetention)) {
            body.put("HotRetention", request.hotRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestEnable)) {
            body.put("RequestEnable", request.requestEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            body.put("Retention", request.retention);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySqlLogConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySqlLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure you meet the following requirements:</p>
     * <ul>
     * <li>Use the latest version of the Alibaba Cloud SDK or the DAS SDK.</li>
     * <li>When calling the DAS service with an SDK, set the region to cn-shanghai.</li>
     * <li>This operation enables the latest supported version of DAS Enterprise Edition by default. See <a href="https://help.aliyun.com/document_detail/156204.html">DAS editions and supported features</a> for the databases and regions supported by each version of DAS Enterprise Edition.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Use the <code>ModifySqlLogConfig</code> operation to enable or configure DAS Enterprise Edition for a database instance.</p>
     * 
     * @param request ModifySqlLogConfigRequest
     * @return ModifySqlLogConfigResponse
     */
    public ModifySqlLogConfigResponse modifySqlLogConfig(ModifySqlLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySqlLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you determine whether your instance type needs to be scaled out to handle peak service traffic. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the RunCloudBenchTask operation to execute a stress testing task.</p>
     * 
     * @param request RunCloudBenchTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCloudBenchTaskResponse
     */
    public RunCloudBenchTaskResponse runCloudBenchTaskWithOptions(RunCloudBenchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCloudBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCloudBenchTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you determine whether your instance type needs to be scaled out to handle peak service traffic. For more information, see <a href="https://help.aliyun.com/document_detail/155068.html">Intelligent stress testing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the RunCloudBenchTask operation to execute a stress testing task.</p>
     * 
     * @param request RunCloudBenchTaskRequest
     * @return RunCloudBenchTaskResponse
     */
    public RunCloudBenchTaskResponse runCloudBenchTask(RunCloudBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCloudBenchTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>Make sure that the database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the event subscription settings for a database instance.</p>
     * 
     * @param request SetEventSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetEventSubscriptionResponse
     */
    public SetEventSubscriptionResponse setEventSubscriptionWithOptions(SetEventSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.active)) {
            query.put("Active", request.active);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatchRule)) {
            query.put("DispatchRule", request.dispatchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventContext)) {
            query.put("EventContext", request.eventContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minInterval)) {
            query.put("MinInterval", request.minInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetEventSubscription"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetEventSubscriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.</li>
     * <li>If you use an SDK to call the API operations of DAS, you must set the region ID to cn-shanghai.</li>
     * <li>Make sure that the database instance that you want to manage is connected to DAS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures the event subscription settings for a database instance.</p>
     * 
     * @param request SetEventSubscriptionRequest
     * @return SetEventSubscriptionResponse
     */
    public SetEventSubscriptionResponse setEventSubscription(SetEventSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEventSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.\<em>\</em>\<em>\</em> In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instances must be an ApsaraDB RDS for MySQL High-availability Edition instance.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance. You can call the call <a href="https://help.aliyun.com/document_detail/413866.html">DescribeInstanceDasPro</a> operation to query whether DAS Enterprise Edition is enabled.</li>
     * <li>The database instance has four or more CPU cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously configures parameters related to the automatic fragment recycling feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoResourceOptimizeRulesAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoResourceOptimizeRulesAsyncResponse
     */
    public UpdateAutoResourceOptimizeRulesAsyncResponse updateAutoResourceOptimizeRulesAsyncWithOptions(UpdateAutoResourceOptimizeRulesAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultId)) {
            query.put("ResultId", request.resultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableFragmentationRatio)) {
            query.put("TableFragmentationRatio", request.tableFragmentationRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableSpaceSize)) {
            query.put("TableSpaceSize", request.tableSpaceSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoResourceOptimizeRulesAsync"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoResourceOptimizeRulesAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.\<em>\</em>\<em>\</em> In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call the API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The database instances must be an ApsaraDB RDS for MySQL High-availability Edition instance.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance. You can call the call <a href="https://help.aliyun.com/document_detail/413866.html">DescribeInstanceDasPro</a> operation to query whether DAS Enterprise Edition is enabled.</li>
     * <li>The database instance has four or more CPU cores, and <strong>innodb_file_per_table</strong> is set to <strong>ON</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously configures parameters related to the automatic fragment recycling feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoResourceOptimizeRulesAsyncRequest
     * @return UpdateAutoResourceOptimizeRulesAsyncResponse
     */
    public UpdateAutoResourceOptimizeRulesAsyncResponse updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoResourceOptimizeRulesAsyncWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance that you want to manage. To enable DAS Enterprise Edition for a database instance, you can call the <a href="https://help.aliyun.com/document_detail/411645.html">EnableDasPro</a> operation.</li>
     * <li>The autonomy service must be enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition</li>
     * <li>PolarDB for MySQL Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables, modifies, or disables the automatic SQL optimization feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoSqlOptimizeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoSqlOptimizeStatusResponse
     */
    public UpdateAutoSqlOptimizeStatusResponse updateAutoSqlOptimizeStatusWithOptions(UpdateAutoSqlOptimizeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoSqlOptimizeStatus"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoSqlOptimizeStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>DAS Enterprise Edition must be enabled for the database instance that you want to manage. To enable DAS Enterprise Edition for a database instance, you can call the <a href="https://help.aliyun.com/document_detail/411645.html">EnableDasPro</a> operation.</li>
     * <li>The autonomy service must be enabled for the database instance. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>This operation supports the following database engines:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition</li>
     * <li>PolarDB for MySQL Cluster Edition</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables, modifies, or disables the automatic SQL optimization feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoSqlOptimizeStatusRequest
     * @return UpdateAutoSqlOptimizeStatusResponse
     */
    public UpdateAutoSqlOptimizeStatusResponse updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoSqlOptimizeStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.\<em>\</em>\<em>\</em> In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The autonomy service must be enabled for the database instance that you want to manage. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously configures parameters related to the automatic SQL throttling feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoThrottleRulesAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoThrottleRulesAsyncResponse
     */
    public UpdateAutoThrottleRulesAsyncResponse updateAutoThrottleRulesAsyncWithOptions(UpdateAutoThrottleRulesAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abnormalDuration)) {
            query.put("AbnormalDuration", request.abnormalDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.activeSessions)) {
            query.put("ActiveSessions", request.activeSessions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowThrottleEndTime)) {
            query.put("AllowThrottleEndTime", request.allowThrottleEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowThrottleStartTime)) {
            query.put("AllowThrottleStartTime", request.allowThrottleStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoKillSession)) {
            query.put("AutoKillSession", request.autoKillSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuSessionRelation)) {
            query.put("CpuSessionRelation", request.cpuSessionRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuUsage)) {
            query.put("CpuUsage", request.cpuUsage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxThrottleTime)) {
            query.put("MaxThrottleTime", request.maxThrottleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultId)) {
            query.put("ResultId", request.resultId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoThrottleRulesAsync"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoThrottleRulesAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.\<em>\</em>\<em>\</em> In this case, you must call this operation at least twice.
     * Before you call this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.</li>
     * <li>The autonomy service must be enabled for the database instance that you want to manage. For more information, see <a href="https://help.aliyun.com/document_detail/152139.html">Autonomy center</a>.</li>
     * <li>The database instance that you want to manage must be of one of the following types:<ul>
     * <li>ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * <li>PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously configures parameters related to the automatic SQL throttling feature for multiple database instances at a time.</p>
     * 
     * @param request UpdateAutoThrottleRulesAsyncRequest
     * @return UpdateAutoThrottleRulesAsyncResponse
     */
    public UpdateAutoThrottleRulesAsyncResponse updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoThrottleRulesAsyncWithOptions(request, runtime);
    }
}
