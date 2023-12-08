// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116;

import com.aliyun.tea.*;
import com.aliyun.das20200116.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "das.cn-shanghai.aliyuncs.com")
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      *
      * @param request AddHDMInstanceRequest
      * @return AddHDMInstanceResponse
     */
    public AddHDMInstanceResponse addHDMInstance(AddHDMInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHDMInstanceWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. You use an ADAM stress testing task to check whether you need to scale up or scale out your database instance to handle workloads during peak hours. For more information, see [Intelligent Stress Testing](~~155068~~).
      * Make sure that your database instances meet the following requirements:
      * *   The source instance supports the following database engines: ApsaraDB RDS for MySQL on High-availability Edition or Enterprise Edition, and PolarDB for MySQL on Cluster Edition or X-Engine.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The database instance is connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is activated for the source and destination database instances. For more information, see [DAS Professional Edition](~~190912~~).
      *
      * @param request CreateAdamBenchTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAdamBenchTaskResponse
     */
    public CreateAdamBenchTaskResponse createAdamBenchTaskWithOptions(CreateAdamBenchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstInstanceId)) {
            query.put("DstInstanceId", request.dstInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSuperAccount)) {
            query.put("DstSuperAccount", request.dstSuperAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstSuperPassword)) {
            query.put("DstSuperPassword", request.dstSuperPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rate)) {
            query.put("Rate", request.rate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestDuration)) {
            query.put("RequestDuration", request.requestDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestStartTime)) {
            query.put("RequestStartTime", request.requestStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEngine)) {
            query.put("SrcEngine", request.srcEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcEngineVersion)) {
            query.put("SrcEngineVersion", request.srcEngineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMaxQps)) {
            query.put("SrcMaxQps", request.srcMaxQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcMeanQps)) {
            query.put("SrcMeanQps", request.srcMeanQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcSqlOssAddr)) {
            query.put("SrcSqlOssAddr", request.srcSqlOssAddr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdamBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdamBenchTaskResponse());
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. You use an ADAM stress testing task to check whether you need to scale up or scale out your database instance to handle workloads during peak hours. For more information, see [Intelligent Stress Testing](~~155068~~).
      * Make sure that your database instances meet the following requirements:
      * *   The source instance supports the following database engines: ApsaraDB RDS for MySQL on High-availability Edition or Enterprise Edition, and PolarDB for MySQL on Cluster Edition or X-Engine.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The database instance is connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is activated for the source and destination database instances. For more information, see [DAS Professional Edition](~~190912~~).
      *
      * @param request CreateAdamBenchTaskRequest
      * @return CreateAdamBenchTaskResponse
     */
    public CreateAdamBenchTaskResponse createAdamBenchTask(CreateAdamBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdamBenchTaskWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis Community Edition instances and performance-enhanced instances of the ApsaraDB for Redis Enhanced Edition (Tair).
      * >  Redis 7.0 is not supported. You are not allowed to use custom modules.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis Community Edition instances and performance-enhanced instances of the ApsaraDB for Redis Enhanced Edition (Tair).
      * >  Redis 7.0 is not supported. You are not allowed to use custom modules.
      *
      * @param request CreateCacheAnalysisJobRequest
      * @return CreateCacheAnalysisJobResponse
     */
    public CreateCacheAnalysisJobResponse createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCacheAnalysisJobWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~). Before you call this API operation, make sure that your database instances meet the following requirements:
      * *   The source database instance must be an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition or X-Engine Edition instance.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The source instance and the destination instance are connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is enabled for the source instance and the destination instance. For more information, see [DAS Professional Edition](~~190912~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~). Before you call this API operation, make sure that your database instances meet the following requirements:
      * *   The source database instance must be an ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance, or a PolarDB for MySQL Cluster Edition or X-Engine Edition instance.
      * *   The destination instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL instance.
      * *   The source instance and the destination instance are connected to DAS. For information about how to connect database instances to DAS, see [Connect an Alibaba Cloud database instance to DAS](~~65405~~).
      * *   DAS Professional Edition is enabled for the source instance and the destination instance. For more information, see [DAS Professional Edition](~~190912~~).
      *
      * @param request CreateCloudBenchTasksRequest
      * @return CreateCloudBenchTasksResponse
     */
    public CreateCloudBenchTasksResponse createCloudBenchTasks(CreateCloudBenchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudBenchTasksWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   RDS MySQL
      *     *   PolarDB for MySQL
      *     *   Redis
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.3 or later.
      * *   If you use an SDK to call DAS, you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   RDS MySQL
      *     *   PolarDB for MySQL
      *     *   Redis
      *
      * @param request CreateDiagnosticReportRequest
      * @return CreateDiagnosticReportResponse
     */
    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request CreateKillInstanceSessionTaskRequest
      * @return CreateKillInstanceSessionTaskResponse
     */
    public CreateKillInstanceSessionTaskResponse createKillInstanceSessionTask(CreateKillInstanceSessionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKillInstanceSessionTaskWithOptions(request, runtime);
    }

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

    public CreateKillInstanceSessionTaskWithMaintainUserResponse createKillInstanceSessionTaskWithMaintainUser(CreateKillInstanceSessionTaskWithMaintainUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKillInstanceSessionTaskWithMaintainUserWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request CreateQueryOptimizeTagRequest
      * @return CreateQueryOptimizeTagResponse
     */
    public CreateQueryOptimizeTagResponse createQueryOptimizeTag(CreateQueryOptimizeTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueryOptimizeTagWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call Database Autonomy Service (DAS), you must set the region to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of ApsaraDB RDS for PostgreSQL instances must be 20221230 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
      * @param request CreateRequestDiagnosisRequest
      * @return CreateRequestDiagnosisResponse
     */
    public CreateRequestDiagnosisResponse createRequestDiagnosis(CreateRequestDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRequestDiagnosisWithOptions(request, runtime);
    }

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

    public CreateStorageAnalysisTaskResponse createStorageAnalysisTask(CreateStorageAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStorageAnalysisTaskWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to handle traffic spikes in an effective manner. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request DeleteCloudBenchTaskRequest
      * @return DeleteCloudBenchTaskResponse
     */
    public DeleteCloudBenchTaskResponse deleteCloudBenchTask(DeleteCloudBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudBenchTaskWithOptions(request, runtime);
    }

    /**
      * *   This operation is used to delete the metadata of a DBGateway that is released in a stress testing task created by calling the [CreateCloudBenchTasks](~~230665~~) operation.
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  If the heartbeat is lost between a DBGateway and the access point for more than 20 seconds, the DBGateway is considered stopped.
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
      * *   This operation is used to delete the metadata of a DBGateway that is released in a stress testing task created by calling the [CreateCloudBenchTasks](~~230665~~) operation.
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  If the heartbeat is lost between a DBGateway and the access point for more than 20 seconds, the DBGateway is considered stopped.
      *
      * @param request DeleteStopGatewayRequest
      * @return DeleteStopGatewayResponse
     */
    public DeleteStopGatewayResponse deleteStopGateway(DeleteStopGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStopGatewayWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request DescribeAutoScalingConfigRequest
      * @return DescribeAutoScalingConfigResponse
     */
    public DescribeAutoScalingConfigResponse describeAutoScalingConfig(DescribeAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoScalingConfigWithOptions(request, runtime);
    }

    /**
      * *   You can query only the history of automatic performance scaling of ApsaraDB RDS for MySQL instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
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
      * *   You can query only the history of automatic performance scaling of ApsaraDB RDS for MySQL instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
      *
      * @param request DescribeAutoScalingHistoryRequest
      * @return DescribeAutoScalingHistoryResponse
     */
    public DescribeAutoScalingHistoryResponse describeAutoScalingHistory(DescribeAutoScalingHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoScalingHistoryWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
      *
      * @param request DescribeCacheAnalysisJobRequest
      * @return DescribeCacheAnalysisJobResponse
     */
    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis.
      *
      * @param request DescribeCacheAnalysisJobsRequest
      * @return DescribeCacheAnalysisJobsResponse
     */
    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobsWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request DescribeCloudBenchTasksRequest
      * @return DescribeCloudBenchTasksResponse
     */
    public DescribeCloudBenchTasksResponse describeCloudBenchTasks(DescribeCloudBenchTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudBenchTasksWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see [Intelligent stress testing](~~155068~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether you need to scale up your database instance to handle workloads during peak hours. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request DescribeCloudbenchTaskRequest
      * @return DescribeCloudbenchTaskResponse
     */
    public DescribeCloudbenchTaskResponse describeCloudbenchTask(DescribeCloudbenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudbenchTaskWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request DescribeCloudbenchTaskConfigRequest
      * @return DescribeCloudbenchTaskConfigResponse
     */
    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudbenchTaskConfigWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable to the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB for Redis
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable to the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB for Redis
      *
      * @param request DescribeDiagnosticReportListRequest
      * @return DescribeDiagnosticReportListResponse
     */
    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    /**
      * This operation sorts list, hash, set, and zset keys based on the number of elements contained in these keys. The top three keys that contain the most elements are considered large keys. If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for ApsaraDB for Redis instances that meet the following requirements:
      *     *   The instance is a Community Edition instance that uses a major version of 5.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
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
      * This operation sorts list, hash, set, and zset keys based on the number of elements contained in these keys. The top three keys that contain the most elements are considered large keys. If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for ApsaraDB for Redis instances that meet the following requirements:
      *     *   The instance is a Community Edition instance that uses a major version of 5.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
      * @param request DescribeHotBigKeysRequest
      * @return DescribeHotBigKeysResponse
     */
    public DescribeHotBigKeysResponse describeHotBigKeys(DescribeHotBigKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotBigKeysWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances that meet the following requirements:
      *     *   The ApsaraDB for Redis instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For more information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances that meet the following requirements:
      *     *   The ApsaraDB for Redis instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For more information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
      * @param request DescribeHotKeysRequest
      * @return DescribeHotKeysResponse
     */
    public DescribeHotKeysResponse describeHotKeys(DescribeHotKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotKeysWithOptions(request, runtime);
    }

    /**
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request DescribeInstanceDasProRequest
      * @return DescribeInstanceDasProResponse
     */
    public DescribeInstanceDasProResponse describeInstanceDasPro(DescribeInstanceDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDasProWithOptions(request, runtime);
    }

    /**
      * The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
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
      * The list, hash, set, and zset keys are sorted based on the number of elements in these keys. The top three keys that have the most elements are considered large keys.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is ApsaraDB for Redis Community Edition instances that use a major version of 5.0 or later or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [ModifyInstanceMinorVersion](~~129381~~) and [DescribeEngineVersion](~~95268~~).
      *
      * @param request DescribeTopBigKeysRequest
      * @return DescribeTopBigKeysResponse
     */
    public DescribeTopBigKeysResponse describeTopBigKeys(DescribeTopBigKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopBigKeysWithOptions(request, runtime);
    }

    /**
      * If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [DescribeEngineVersion](~~95268~~) and [ModifyInstanceMinorVersion](~~129381~~).
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
      * If the number of queries per second (QPS) of a key is greater than 3,000, the key is considered a hot key.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than 4.3.3. We recommend that you use the latest version.
      * *   The version of Database Autonomy Service (DAS) SDK must be 1.0.2 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is available only for an ApsaraDB for Redis instance of one of the following versions:
      *     *   The instance is a Community Edition instance that uses a major version of 4.0 or later or a performance-enhanced instance of the Enhanced Edition (Tair).
      *     *   The ApsaraDB for Redis instance is updated to the latest minor version.
      * >  For information about how to query and update the minor version of an instance, see [DescribeEngineVersion](~~95268~~) and [ModifyInstanceMinorVersion](~~129381~~).
      *
      * @param request DescribeTopHotKeysRequest
      * @return DescribeTopHotKeysResponse
     */
    public DescribeTopHotKeysResponse describeTopHotKeys(DescribeTopHotKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopHotKeysWithOptions(request, runtime);
    }

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request DisableAllSqlConcurrencyControlRulesRequest
      * @return DisableAllSqlConcurrencyControlRulesResponse
     */
    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAllSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    /**
      * If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
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
      * If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
      * @param request DisableAutoResourceOptimizeRulesRequest
      * @return DisableAutoResourceOptimizeRulesResponse
     */
    public DisableAutoResourceOptimizeRulesResponse disableAutoResourceOptimizeRules(DisableAutoResourceOptimizeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoResourceOptimizeRulesWithOptions(request, runtime);
    }

    /**
      * If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
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
      * If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
      * @param request DisableAutoThrottleRulesRequest
      * @return DisableAutoThrottleRulesResponse
     */
    public DisableAutoThrottleRulesResponse disableAutoThrottleRules(DisableAutoThrottleRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoThrottleRulesWithOptions(request, runtime);
    }

    /**
      * *   For information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request DisableDasProRequest
      * @return DisableDasProResponse
     */
    public DisableDasProResponse disableDasPro(DisableDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDasProWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances.
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
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation is applicable only to ApsaraDB for Redis instances.
      *
      * @param request DisableInstanceDasConfigRequest
      * @return DisableInstanceDasConfigResponse
     */
    public DisableInstanceDasConfigResponse disableInstanceDasConfig(DisableInstanceDasConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstanceDasConfigWithOptions(request, runtime);
    }

    /**
      * This operation is applicable to the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation is applicable to the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request DisableSqlConcurrencyControlRequest
      * @return DisableSqlConcurrencyControlResponse
     */
    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlConcurrencyControlWithOptions(request, runtime);
    }

    /**
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For more information about database instances that support DAS Professional Edition, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request EnableDasProRequest
      * @return EnableDasProResponse
     */
    public EnableDasProResponse enableDasPro(EnableDasProRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDasProWithOptions(request, runtime);
    }

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request EnableSqlConcurrencyControlRequest
      * @return EnableSqlConcurrencyControlResponse
     */
    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlConcurrencyControlWithOptions(request, runtime);
    }

    /**
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which DAS Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which DAS Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetAsyncErrorRequestListByCodeRequest
      * @return GetAsyncErrorRequestListByCodeResponse
     */
    public GetAsyncErrorRequestListByCodeResponse getAsyncErrorRequestListByCode(GetAsyncErrorRequestListByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestListByCodeWithOptions(request, runtime);
    }

    /**
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetAsyncErrorRequestStatByCodeRequest
      * @return GetAsyncErrorRequestStatByCodeResponse
     */
    public GetAsyncErrorRequestStatByCodeResponse getAsyncErrorRequestStatByCode(GetAsyncErrorRequestStatByCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestStatByCodeWithOptions(request, runtime);
    }

    /**
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  When an asynchronous call is made, the complete query results are not returned immediately. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This API operation supports only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetAsyncErrorRequestStatResultRequest
      * @return GetAsyncErrorRequestStatResultResponse
     */
    public GetAsyncErrorRequestStatResultResponse getAsyncErrorRequestStatResult(GetAsyncErrorRequestStatResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncErrorRequestStatResultWithOptions(request, runtime);
    }

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

    public GetAutoIncrementUsageStatisticResponse getAutoIncrementUsageStatistic(GetAutoIncrementUsageStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoIncrementUsageStatisticWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance for which you want to query automatic fragment recycling rules is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance for which you want to query automatic fragment recycling rules is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
      *
      * @param request GetAutoResourceOptimizeRulesRequest
      * @return GetAutoResourceOptimizeRulesResponse
     */
    public GetAutoResourceOptimizeRulesResponse getAutoResourceOptimizeRules(GetAutoResourceOptimizeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoResourceOptimizeRulesWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, or PolarDB for MySQL X-Engine Edition instance that runs MySQL 8.0.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition instance that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, or PolarDB for MySQL X-Engine Edition instance that runs MySQL 8.0.
      *
      * @param request GetAutoThrottleRulesRequest
      * @return GetAutoThrottleRulesResponse
     */
    public GetAutoThrottleRulesResponse getAutoThrottleRules(GetAutoThrottleRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoThrottleRulesWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
      *
      * @param request GetAutonomousNotifyEventContentRequest
      * @return GetAutonomousNotifyEventContentResponse
     */
    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventContentWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   After your instance is connected to DAS, notification events such as snapshot capture are triggered if DAS detects changes to database monitoring metrics during anomaly detection.
      * >  You can query the details of notification events only if the autonomy center is enabled. For more information, see [Autonomy center](~~152139~~).
      *
      * @param request GetAutonomousNotifyEventsInRangeRequest
      * @return GetAutonomousNotifyEventsInRangeResponse
     */
    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventsInRangeWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
      * @param request GetDBInstanceConnectivityDiagnosisRequest
      * @return GetDBInstanceConnectivityDiagnosisResponse
     */
    public GetDBInstanceConnectivityDiagnosisResponse getDBInstanceConnectivityDiagnosis(GetDBInstanceConnectivityDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBInstanceConnectivityDiagnosisWithOptions(request, runtime);
    }

    /**
      * *   For information about databases that are supported, see [Overview](~~190912~~).
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   For information about databases that are supported, see [Overview](~~190912~~).
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetDasProServiceUsageRequest
      * @return GetDasProServiceUsageResponse
     */
    public GetDasProServiceUsageResponse getDasProServiceUsage(GetDasProServiceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDasProServiceUsageWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL database or a PolarDB for MySQL database in the China (Shanghai) region is connected to DAS.
      * *   The new SQL Explorer and Audit feature is enabled for the database instance. For more information, see the [Enable the SQL Explorer and Audit feature](~~92561~~) section of the "Overview" topic.
      * >  You can query only the data that is generated after the new SQL Explorer and Audit feature is enabled. The start time can be up to seven days earlier than the current time. The interval between the start time and the end time cannot exceed 24 hours.
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
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL database or a PolarDB for MySQL database in the China (Shanghai) region is connected to DAS.
      * *   The new SQL Explorer and Audit feature is enabled for the database instance. For more information, see the [Enable the SQL Explorer and Audit feature](~~92561~~) section of the "Overview" topic.
      * >  You can query only the data that is generated after the new SQL Explorer and Audit feature is enabled. The start time can be up to seven days earlier than the current time. The interval between the start time and the end time cannot exceed 24 hours.
      *
      * @param request GetDasSQLLogHotDataRequest
      * @return GetDasSQLLogHotDataResponse
     */
    public GetDasSQLLogHotDataResponse getDasSQLLogHotData(GetDasSQLLogHotDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDasSQLLogHotDataWithOptions(request, runtime);
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTaskWithOptions(GetEndpointSwitchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAuth)) {
            query.put("skipAuth", request.skipAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEndpointSwitchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEndpointSwitchTaskResponse());
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTask(GetEndpointSwitchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEndpointSwitchTaskWithOptions(request, runtime);
    }

    /**
      * >  The complete query results are not immediately returned after an asynchronous request is sent. If the value of **isFinish** is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  The complete query results are not immediately returned after an asynchronous request is sent. If the value of **isFinish** is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of **isFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters for which Database Autonomy Service (DAS) Professional Edition is enabled. For more information, see [Purchase DAS Professional Edition](~~163298~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetErrorRequestSampleRequest
      * @return GetErrorRequestSampleResponse
     */
    public GetErrorRequestSampleResponse getErrorRequestSample(GetErrorRequestSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErrorRequestSampleWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
      * @param request GetEventSubscriptionRequest
      * @return GetEventSubscriptionResponse
     */
    public GetEventSubscriptionResponse getEventSubscription(GetEventSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventSubscriptionWithOptions(request, runtime);
    }

    /**
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetFullRequestOriginStatByInstanceIdRequest
      * @return GetFullRequestOriginStatByInstanceIdResponse
     */
    public GetFullRequestOriginStatByInstanceIdResponse getFullRequestOriginStatByInstanceId(GetFullRequestOriginStatByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestOriginStatByInstanceIdWithOptions(request, runtime);
    }

    /**
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about the database engines that support SQL Explorer, see [SQL Explorer](~~204096~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about the database engines that support SQL Explorer, see [SQL Explorer](~~204096~~).
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetFullRequestSampleByInstanceIdRequest
      * @return GetFullRequestSampleByInstanceIdResponse
     */
    public GetFullRequestSampleByInstanceIdResponse getFullRequestSampleByInstanceId(GetFullRequestSampleByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestSampleByInstanceIdWithOptions(request, runtime);
    }

    /**
      * >  The complete query results are not returned immediately after an asynchronous request is sent. If the value of isFinish is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of isFinish is **true**.
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
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
      * >  The complete query results are not returned immediately after an asynchronous request is sent. If the value of isFinish is **false** in the response, wait for 1 second and send the request again. The complete query results are returned until the value of isFinish is **true**.
      * The SQL Explorer feature allows you to check the health status of SQL statements and troubleshoot performance issues. For more information, see [SQL Explorer](~~204096~~).
      * *   For more information about database instances that support SQL Explorer, see [Overview](~~190912~~).
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      *
      * @param request GetFullRequestStatResultByInstanceIdRequest
      * @return GetFullRequestStatResultByInstanceIdResponse
     */
    public GetFullRequestStatResultByInstanceIdResponse getFullRequestStatResultByInstanceId(GetFullRequestStatResultByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFullRequestStatResultByInstanceIdWithOptions(request, runtime);
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultWithOptions(GetHDMAliyunResourceSyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAuth)) {
            query.put("skipAuth", request.skipAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHDMAliyunResourceSyncResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHDMAliyunResourceSyncResultResponse());
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHDMAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResultWithOptions(GetHDMLastAliyunResourceSyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAuth)) {
            query.put("skipAuth", request.skipAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHDMLastAliyunResourceSyncResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHDMLastAliyunResourceSyncResultResponse());
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHDMLastAliyunResourceSyncResultWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see [Inspection and scoring](~~205659~~).
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of DAS SDK must be V1.0.3 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * Database Autonomy Service (DAS) provides the inspection and scoring feature. This feature allows you to inspect and score the health status of your instance on a regular basis. This helps you obtain information about the status of your databases. For more information, see [Inspection and scoring](~~205659~~).
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable only to ApsaraDB RDS for MySQL databases, self-managed MySQL databases hosted on Elastic Compute Service (ECS) instances, self-managed MySQL databases in data centers, ApsaraDB for Redis databases, and PolarDB for MySQL databases.
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of DAS SDK must be V1.0.3 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetInstanceInspectionsRequest
      * @return GetInstanceInspectionsResponse
     */
    public GetInstanceInspectionsResponse getInstanceInspections(GetInstanceInspectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceInspectionsWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database engine is ApsaraDB RDS for MySQL or PolarDB for MySQL.
      *
      * @param request GetInstanceSqlOptimizeStatisticRequest
      * @return GetInstanceSqlOptimizeStatisticResponse
     */
    public GetInstanceSqlOptimizeStatisticResponse getInstanceSqlOptimizeStatistic(GetInstanceSqlOptimizeStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSqlOptimizeStatisticWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   This operation is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetKillInstanceSessionTaskResultRequest
      * @return GetKillInstanceSessionTaskResultResponse
     */
    public GetKillInstanceSessionTaskResultResponse getKillInstanceSessionTaskResult(GetKillInstanceSessionTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKillInstanceSessionTaskResultWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to MongoDB instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
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
      * *   This operation is applicable only to MongoDB instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region to cn-shanghai.
      *
      * @param request GetMongoDBCurrentOpRequest
      * @return GetMongoDBCurrentOpResponse
     */
    public GetMongoDBCurrentOpResponse getMongoDBCurrentOp(GetMongoDBCurrentOpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMongoDBCurrentOpWithOptions(request, runtime);
    }

    /**
      * >  Asynchronous calls do not immediately return the complete results. You must use the value of **ResultId** returned in the response to re-initiate the call. The complete results are returned only if the value of **IsFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * >  Asynchronous calls do not immediately return the complete results. You must use the value of **ResultId** returned in the response to re-initiate the call. The complete results are returned only if the value of **IsFinish** is **true**.
      * *   This operation is applicable only to ApsaraDB RDS for MySQL, PolarDB for MySQL, and PolarDB-X 2.0 instances.
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetMySQLAllSessionAsyncRequest
      * @return GetMySQLAllSessionAsyncResponse
     */
    public GetMySQLAllSessionAsyncResponse getMySQLAllSessionAsync(GetMySQLAllSessionAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMySQLAllSessionAsyncWithOptions(request, runtime);
    }

    /**
      * We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the [heatmap](~~470302~~) feature of Database Autonomy Service (DAS) to query the data.
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
      * We recommend that you do not call this operation. The data is returned in a special format and is complex to parse. You can use the [heatmap](~~470302~~) feature of Database Autonomy Service (DAS) to query the data.
      *
      * @param request GetPartitionsHeatmapRequest
      * @return GetPartitionsHeatmapResponse
     */
    public GetPartitionsHeatmapResponse getPartitionsHeatmap(GetPartitionsHeatmapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPartitionsHeatmapWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
      * @param request GetPfsMetricTrendsRequest
      * @return GetPfsMetricTrendsResponse
     */
    public GetPfsMetricTrendsResponse getPfsMetricTrends(GetPfsMetricTrendsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsMetricTrendsWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
      * @param request GetPfsSqlSampleRequest
      * @return GetPfsSqlSampleResponse
     */
    public GetPfsSqlSampleResponse getPfsSqlSample(GetPfsSqlSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsSqlSampleWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this API operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   An ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster is connected to DAS.
      * *   The new version of the performance insight feature is enabled for the database instance. For more information, see [Performance insight (new version)](~~469117~~).
      *
      * @param request GetPfsSqlSummariesRequest
      * @return GetPfsSqlSummariesResponse
     */
    public GetPfsSqlSummariesResponse getPfsSqlSummaries(GetPfsSqlSummariesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPfsSqlSummariesWithOptions(request, runtime);
    }

    /**
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeDataStatsRequest
      * @return GetQueryOptimizeDataStatsResponse
     */
    public GetQueryOptimizeDataStatsResponse getQueryOptimizeDataStats(GetQueryOptimizeDataStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataStatsWithOptions(request, runtime);
    }

    /**
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use an Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeDataTopRequest
      * @return GetQueryOptimizeDataTopResponse
     */
    public GetQueryOptimizeDataTopResponse getQueryOptimizeDataTop(GetQueryOptimizeDataTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataTopWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeDataTrendRequest
      * @return GetQueryOptimizeDataTrendResponse
     */
    public GetQueryOptimizeDataTrendResponse getQueryOptimizeDataTrend(GetQueryOptimizeDataTrendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeDataTrendWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeExecErrorSampleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetQueryOptimizeExecErrorSampleResponse
     */
    public GetQueryOptimizeExecErrorSampleResponse getQueryOptimizeExecErrorSampleWithOptions(GetQueryOptimizeExecErrorSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeExecErrorSample"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeExecErrorSampleResponse());
    }

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeExecErrorSampleRequest
      * @return GetQueryOptimizeExecErrorSampleResponse
     */
    public GetQueryOptimizeExecErrorSampleResponse getQueryOptimizeExecErrorSample(GetQueryOptimizeExecErrorSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeExecErrorSampleWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeExecErrorStatsRequest
      * @return GetQueryOptimizeExecErrorStatsResponse
     */
    public GetQueryOptimizeExecErrorStatsResponse getQueryOptimizeExecErrorStats(GetQueryOptimizeExecErrorStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeExecErrorStatsWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
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
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V2.1.8. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V2.1.8 or later.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeRuleListRequest
      * @return GetQueryOptimizeRuleListResponse
     */
    public GetQueryOptimizeRuleListResponse getQueryOptimizeRuleList(GetQueryOptimizeRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeRuleListWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeShareUrlRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetQueryOptimizeShareUrlResponse
     */
    public GetQueryOptimizeShareUrlResponse getQueryOptimizeShareUrlWithOptions(GetQueryOptimizeShareUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeShareUrl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeShareUrlResponse());
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeShareUrlRequest
      * @return GetQueryOptimizeShareUrlResponse
     */
    public GetQueryOptimizeShareUrlResponse getQueryOptimizeShareUrl(GetQueryOptimizeShareUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeShareUrlWithOptions(request, runtime);
    }

    /**
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeSolutionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetQueryOptimizeSolutionResponse
     */
    public GetQueryOptimizeSolutionResponse getQueryOptimizeSolutionWithOptions(GetQueryOptimizeSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeSolution"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeSolutionResponse());
    }

    /**
      * *   If you use an Alibaba Cloud SDK or a Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeSolutionRequest
      * @return GetQueryOptimizeSolutionResponse
     */
    public GetQueryOptimizeSolutionResponse getQueryOptimizeSolution(GetQueryOptimizeSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeSolutionWithOptions(request, runtime);
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeTagRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetQueryOptimizeTagResponse
     */
    public GetQueryOptimizeTagResponse getQueryOptimizeTagWithOptions(GetQueryOptimizeTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryOptimizeTag"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryOptimizeTagResponse());
    }

    /**
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   PolarDB for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *
      * @param request GetQueryOptimizeTagRequest
      * @return GetQueryOptimizeTagResponse
     */
    public GetQueryOptimizeTagResponse getQueryOptimizeTag(GetQueryOptimizeTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueryOptimizeTagWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to ApsaraDB for Redis instances.
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.
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
      * *   This operation is applicable only to ApsaraDB for Redis instances.
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * >  This operation cannot be used to query sessions generated in direct connection mode on ApsaraDB for Redis cluster instances.
      *
      * @param request GetRedisAllSessionRequest
      * @return GetRedisAllSessionResponse
     */
    public GetRedisAllSessionResponse getRedisAllSession(GetRedisAllSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRedisAllSessionWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (Compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call API operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (Compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
      * @param request GetRequestDiagnosisPageRequest
      * @return GetRequestDiagnosisPageResponse
     */
    public GetRequestDiagnosisPageResponse getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRequestDiagnosisPageWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL
      *     *   ApsaraDB RDS for PostgreSQL
      *     *   ApsaraDB RDS for SQL Server
      *     *   PolarDB for MySQL
      *     *   PolarDB for PostgreSQL (compatible with Oracle)
      *     *   ApsaraDB for MongoDB
      * >  The minor engine version of the Apsara RDS for PostgreSQL instance must be 20220130 or later. For more information about how to check and update the minor engine version of an ApsaraDB RDS for PostgreSQL instance, see [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      *
      * @param request GetRequestDiagnosisResultRequest
      * @return GetRequestDiagnosisResultResponse
     */
    public GetRequestDiagnosisResultResponse getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRequestDiagnosisResultWithOptions(request, runtime);
    }

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request GetRunningSqlConcurrencyControlRulesRequest
      * @return GetRunningSqlConcurrencyControlRulesResponse
     */
    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRunningSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request GetSqlConcurrencyControlKeywordsFromSqlTextRequest
      * @return GetSqlConcurrencyControlKeywordsFromSqlTextResponse
     */
    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlConcurrencyControlKeywordsFromSqlTextWithOptions(request, runtime);
    }

    /**
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
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
      * This operation supports the following database engines:
      * *   ApsaraDB RDS for MySQL
      * *   PolarDB for MySQL
      *
      * @param request GetSqlConcurrencyControlRulesHistoryRequest
      * @return GetSqlConcurrencyControlRulesHistoryResponse
     */
    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlConcurrencyControlRulesHistoryWithOptions(request, runtime);
    }

    /**
      * The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see [Automatic SQL optimization](~~167895~~).
      * >  You can call this operation to query only the optimization suggestions that are automatically generated by the SQL diagnostics feature.
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * The SQL diagnostics feature provides optimization suggestions for instances based on diagnostics results. You can use the optimization suggestions to optimize instance indexes. For more information, see [Automatic SQL optimization](~~167895~~).
      * >  You can call this operation to query only the optimization suggestions that are automatically generated by the SQL diagnostics feature.
      * Before you call this operation, take note of the following items:
      * *   This operation is applicable to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
      * *   If you use an Alibaba Cloud SDK or DAS SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request GetSqlOptimizeAdviceRequest
      * @return GetSqlOptimizeAdviceResponse
     */
    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSqlOptimizeAdviceWithOptions(request, runtime);
    }

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

    public GetStorageAnalysisResultResponse getStorageAnalysisResult(GetStorageAnalysisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStorageAnalysisResultWithOptions(request, runtime);
    }

    /**
      * *   This operation is applicable only to ApsaraDB for Redis.
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
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
      * *   This operation is applicable only to ApsaraDB for Redis.
      * *   If you use Alibaba Cloud SDK, make sure that the aliyun-sdk-core version is later than V4.3.3. We recommend that you use the latest version.
      * *   The version of your Database Autonomy Service (DAS) SDK must be V1.0.2 or later.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request KillInstanceAllSessionRequest
      * @return KillInstanceAllSessionResponse
     */
    public KillInstanceAllSessionResponse killInstanceAllSession(KillInstanceAllSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killInstanceAllSessionWithOptions(request, runtime);
    }

    /**
      * You can call this operation to modify the following auto scaling configurations of an instance: **auto scaling for specifications**, **automatic storage expansion**, **automatic bandwidth adjustment**, and **auto scaling for resources**.
      * *   You can modify the configurations of the **auto scaling feature for specifications** for the following types of database instances:
      *     *   PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   You can modify the configurations of the **automatic storage expansion** feature for the following types of database instances:
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see [Automatic space expansion](~~173345~~).
      * *   You can modify the configurations of the **automatic bandwidth adjustment** feature for the following types of database instances:
      *     *   ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see [Automatic bandwidth adjustment](~~216312~~).
      * *   You can modify the configurations of the **auto scaling feature for resources** for the following types of database instances:
      *     *   General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
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
      * You can call this operation to modify the following auto scaling configurations of an instance: **auto scaling for specifications**, **automatic storage expansion**, **automatic bandwidth adjustment**, and **auto scaling for resources**.
      * *   You can modify the configurations of the **auto scaling feature for specifications** for the following types of database instances:
      *     *   PolarDB for MySQL Cluster Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or enhanced SSDs (ESSDs). For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   You can modify the configurations of the **automatic storage expansion** feature for the following types of database instances:
      *     *   ApsaraDB RDS for MySQL High-availability Edition instances that use standard SSDs or ESSDs. For more information about the feature and the billing rules, see [Automatic space expansion](~~173345~~).
      * *   You can modify the configurations of the **automatic bandwidth adjustment** feature for the following types of database instances:
      *     *   ApsaraDB for Redis Classic (Local Disk-based) Edition instances. For more information about the feature and the billing rules, see [Automatic bandwidth adjustment](~~216312~~).
      * *   You can modify the configurations of the **auto scaling feature for resources** for the following types of database instances:
      *     *   General-purpose ApsaraDB RDS for MySQL Enterprise Edition instances. For more information about the feature and the billing rules, see [Automatic performance scaling](~~169686~~).
      * *   If you use an Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call API operations of DAS, you must set the region ID to cn-shanghai.
      *
      * @param request ModifyAutoScalingConfigRequest
      * @return ModifyAutoScalingConfigResponse
     */
    public ModifyAutoScalingConfigResponse modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoScalingConfigWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
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
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request RunCloudBenchTaskRequest
      * @return RunCloudBenchTaskResponse
     */
    public RunCloudBenchTaskResponse runCloudBenchTask(RunCloudBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCloudBenchTaskWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
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
      * Before you call this operation, take note of the following items:
      * *   If you use Alibaba Cloud SDK or Database Autonomy Service (DAS) SDK to call this operation, we recommend that you use the latest version of the SDK.
      * *   If you use an SDK to call operations of DAS, you must set the region ID to cn-shanghai.
      * *   The database instance that you want to manage is connected to DAS.
      *
      * @param request SetEventSubscriptionRequest
      * @return SetEventSubscriptionResponse
     */
    public SetEventSubscriptionResponse setEventSubscription(SetEventSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setEventSubscriptionWithOptions(request, runtime);
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request StopCloudBenchTaskRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StopCloudBenchTaskResponse
     */
    public StopCloudBenchTaskResponse stopCloudBenchTaskWithOptions(StopCloudBenchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCloudBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCloudBenchTaskResponse());
    }

    /**
      * Database Autonomy Service (DAS) provides the intelligent stress testing feature. This feature helps you check whether your instance needs to be scaled up to effectively handle traffic spikes. For more information, see [Intelligent stress testing](~~155068~~).
      *
      * @param request StopCloudBenchTaskRequest
      * @return StopCloudBenchTaskResponse
     */
    public StopCloudBenchTaskResponse stopCloudBenchTask(StopCloudBenchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCloudBenchTaskWithOptions(request, runtime);
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResourceWithOptions(SyncHDMAliyunResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.waitForModifySecurityIps)) {
            query.put("WaitForModifySecurityIps", request.waitForModifySecurityIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.context)) {
            query.put("__context", request.context);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("accessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipAuth)) {
            query.put("skipAuth", request.skipAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timestamp)) {
            query.put("timestamp", request.timestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncHDMAliyunResource"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncHDMAliyunResourceResponse());
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResource(SyncHDMAliyunResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncHDMAliyunResourceWithOptions(request, runtime);
    }

    /**
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   DAS Professional Edition is enabled for the database instance. You can call the [DescribeInstanceDasPro](~~413866~~) operation to check whether DAS Professional Edition is enabled for a database instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
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
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   The database instance is an ApsaraDB RDS for MySQL High-availability Edition instance.
      * *   DAS Professional Edition is enabled for the database instance. You can call the [DescribeInstanceDasPro](~~413866~~) operation to check whether DAS Professional Edition is enabled for a database instance.
      * *   The database instance has four or more cores, and **innodb_file_per_table** is set to **ON**.
      *
      * @param request UpdateAutoResourceOptimizeRulesAsyncRequest
      * @return UpdateAutoResourceOptimizeRulesAsyncResponse
     */
    public UpdateAutoResourceOptimizeRulesAsyncResponse updateAutoResourceOptimizeRulesAsync(UpdateAutoResourceOptimizeRulesAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoResourceOptimizeRulesAsyncWithOptions(request, runtime);
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   DAS Professional Edition is enabled for the database instance that you want to manage. To enable DAS Professional Edition for a database instance, you can call the [EnableDasPro](~~411645~~) operation.
      * *   The autonomy service is enabled for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL High-availability Edition and Enterprise Edition
      *     *   PolarDB for MySQL Cluster Edition and X-Engine Edition
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
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   DAS Professional Edition is enabled for the database instance that you want to manage. To enable DAS Professional Edition for a database instance, you can call the [EnableDasPro](~~411645~~) operation.
      * *   The autonomy service is enabled for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   This operation supports the following database engines:
      *     *   ApsaraDB RDS for MySQL High-availability Edition and Enterprise Edition
      *     *   PolarDB for MySQL Cluster Edition and X-Engine Edition
      *
      * @param request UpdateAutoSqlOptimizeStatusRequest
      * @return UpdateAutoSqlOptimizeStatusResponse
     */
    public UpdateAutoSqlOptimizeStatusResponse updateAutoSqlOptimizeStatus(UpdateAutoSqlOptimizeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoSqlOptimizeStatusWithOptions(request, runtime);
    }

    /**
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   Enable Autonomy Service is turned on for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, and PolarDB for MySQL X-Engine Edition that runs MySQL 8.0.
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
      * >  When an asynchronous call is made, the complete query results are not immediately returned. If the value of **isFinish** is **false** in the response, wait for 1 second and then re-initiate the call. The complete query results are returned until the value of **isFinish** is **true**.
      * Before you call this operation, take note of the following items:
      * *   If you use an SDK to call operations of Database Autonomy Service (DAS), you must set the region ID to cn-shanghai.
      * *   Enable Autonomy Service is turned on for the database instance. For more information, see [Autonomy center](~~152139~~).
      * *   The database instance that you want to manage is of one of the following types:
      *     *   ApsaraDB RDS for MySQL High-availability Edition or Enterprise Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0.
      *     *   PolarDB for MySQL Cluster Edition that runs MySQL 5.6, MySQL 5.7, or MySQL 8.0, and PolarDB for MySQL X-Engine Edition that runs MySQL 8.0.
      *
      * @param request UpdateAutoThrottleRulesAsyncRequest
      * @return UpdateAutoThrottleRulesAsyncResponse
     */
    public UpdateAutoThrottleRulesAsyncResponse updateAutoThrottleRulesAsync(UpdateAutoThrottleRulesAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoThrottleRulesAsyncWithOptions(request, runtime);
    }
}
