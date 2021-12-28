// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116;

import com.aliyun.tea.*;
import com.aliyun.das20200116.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AddHDMInstanceResponse addHDMInstanceWithOptions(AddHDMInstanceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddHDMInstanceResponse addHDMInstance(AddHDMInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addHDMInstanceWithOptions(request, runtime);
    }

    public CreateAdamBenchTaskResponse createAdamBenchTaskWithOptions(CreateAdamBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAdamBenchTaskResponse createAdamBenchTask(CreateAdamBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAdamBenchTaskWithOptions(request, runtime);
    }

    public CreateCacheAnalysisJobResponse createCacheAnalysisJobWithOptions(CreateCacheAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateCacheAnalysisJobResponse createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCacheAnalysisJobWithOptions(request, runtime);
    }

    public CreateCloudBenchTasksResponse createCloudBenchTasksWithOptions(CreateCloudBenchTasksRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateCloudBenchTasksResponse createCloudBenchTasks(CreateCloudBenchTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudBenchTasksWithOptions(request, runtime);
    }

    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public CreateRequestDiagnosisResponse createRequestDiagnosisWithOptions(CreateRequestDiagnosisRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRequestDiagnosisResponse createRequestDiagnosis(CreateRequestDiagnosisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRequestDiagnosisWithOptions(request, runtime);
    }

    public DeleteCloudBenchTaskResponse deleteCloudBenchTaskWithOptions(DeleteCloudBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteCloudBenchTaskResponse deleteCloudBenchTask(DeleteCloudBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCloudBenchTaskWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJobWithOptions(DescribeCacheAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisJobWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobsWithOptions(DescribeCacheAnalysisJobsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisJobsWithOptions(request, runtime);
    }

    public DescribeCloudBenchTasksResponse describeCloudBenchTasksWithOptions(DescribeCloudBenchTasksRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCloudBenchTasksResponse describeCloudBenchTasks(DescribeCloudBenchTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudBenchTasksWithOptions(request, runtime);
    }

    public DescribeCloudbenchTaskResponse describeCloudbenchTaskWithOptions(DescribeCloudbenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCloudbenchTaskResponse describeCloudbenchTask(DescribeCloudbenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudbenchTaskWithOptions(request, runtime);
    }

    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfigWithOptions(DescribeCloudbenchTaskConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudbenchTaskConfigWithOptions(request, runtime);
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    public DescribeHotBigKeysResponse describeHotBigKeysWithOptions(DescribeHotBigKeysRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeHotBigKeysResponse describeHotBigKeys(DescribeHotBigKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHotBigKeysWithOptions(request, runtime);
    }

    public DescribeHotKeysResponse describeHotKeysWithOptions(DescribeHotKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeHotKeysResponse describeHotKeys(DescribeHotKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHotKeysWithOptions(request, runtime);
    }

    public DescribeTopBigKeysResponse describeTopBigKeysWithOptions(DescribeTopBigKeysRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeTopBigKeysResponse describeTopBigKeys(DescribeTopBigKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopBigKeysWithOptions(request, runtime);
    }

    public DescribeTopHotKeysResponse describeTopHotKeysWithOptions(DescribeTopHotKeysRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeTopHotKeysResponse describeTopHotKeys(DescribeTopHotKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopHotKeysWithOptions(request, runtime);
    }

    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRulesWithOptions(DisableAllSqlConcurrencyControlRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consoleContext)) {
            query.put("ConsoleContext", request.consoleContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAllSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControlWithOptions(DisableSqlConcurrencyControlRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSqlConcurrencyControlWithOptions(request, runtime);
    }

    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControlWithOptions(EnableSqlConcurrencyControlRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSqlConcurrencyControlWithOptions(request, runtime);
    }

    public GetAutoResourceOptimizeConfigResponse getAutoResourceOptimizeConfigWithOptions(GetAutoResourceOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoResourceOptimizeConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoResourceOptimizeConfigResponse());
    }

    public GetAutoResourceOptimizeConfigResponse getAutoResourceOptimizeConfig(GetAutoResourceOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoResourceOptimizeConfigWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContentWithOptions(GetAutonomousNotifyEventContentRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventContentWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRangeWithOptions(GetAutonomousNotifyEventsInRangeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventsInRangeWithOptions(request, runtime);
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTaskWithOptions(GetEndpointSwitchTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEndpointSwitchTaskWithOptions(request, runtime);
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultWithOptions(GetHDMAliyunResourceSyncResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHDMAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResultWithOptions(GetHDMLastAliyunResourceSyncResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHDMLastAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetInstanceInspectionsResponse getInstanceInspectionsWithOptions(GetInstanceInspectionsRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchMap)) {
            query.put("SearchMap", request.searchMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetInstanceInspectionsResponse getInstanceInspections(GetInstanceInspectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceInspectionsWithOptions(request, runtime);
    }

    public GetRequestDiagnosisPageResponse getRequestDiagnosisPageWithOptions(GetRequestDiagnosisPageRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRequestDiagnosisPageResponse getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRequestDiagnosisPageWithOptions(request, runtime);
    }

    public GetRequestDiagnosisResultResponse getRequestDiagnosisResultWithOptions(GetRequestDiagnosisResultRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRequestDiagnosisResultResponse getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRequestDiagnosisResultWithOptions(request, runtime);
    }

    public GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryListWithOptions(GetResourceOptimizeHistoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceOptimizeHistoryList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceOptimizeHistoryListResponse());
    }

    public GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryList(GetResourceOptimizeHistoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceOptimizeHistoryListWithOptions(request, runtime);
    }

    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRulesWithOptions(GetRunningSqlConcurrencyControlRulesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRunningSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse getSqlConcurrencyControlKeywordsFromSqlTextWithOptions(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSqlConcurrencyControlKeywordsFromSqlTextResponse getSqlConcurrencyControlKeywordsFromSqlText(GetSqlConcurrencyControlKeywordsFromSqlTextRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlConcurrencyControlKeywordsFromSqlTextWithOptions(request, runtime);
    }

    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistoryWithOptions(GetSqlConcurrencyControlRulesHistoryRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlConcurrencyControlRulesHistoryWithOptions(request, runtime);
    }

    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdviceWithOptions(GetSqlOptimizeAdviceRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.startDt)) {
            query.put("StartDt", request.startDt);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlOptimizeAdviceWithOptions(request, runtime);
    }

    public RunCloudBenchTaskResponse runCloudBenchTaskWithOptions(RunCloudBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RunCloudBenchTaskResponse runCloudBenchTask(RunCloudBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCloudBenchTaskWithOptions(request, runtime);
    }

    public StopCloudBenchTaskResponse stopCloudBenchTaskWithOptions(StopCloudBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopCloudBenchTaskResponse stopCloudBenchTask(StopCloudBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCloudBenchTaskWithOptions(request, runtime);
    }

    public StopOrRollbackOptimizeTaskResponse stopOrRollbackOptimizeTaskWithOptions(StopOrRollbackOptimizeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopOrRollback)) {
            query.put("StopOrRollback", request.stopOrRollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUuid)) {
            query.put("TaskUuid", request.taskUuid);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOrRollbackOptimizeTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopOrRollbackOptimizeTaskResponse());
    }

    public StopOrRollbackOptimizeTaskResponse stopOrRollbackOptimizeTask(StopOrRollbackOptimizeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopOrRollbackOptimizeTaskWithOptions(request, runtime);
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResourceWithOptions(SyncHDMAliyunResourceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncHDMAliyunResourceWithOptions(request, runtime);
    }

    public TurnOffAutoResourceOptimizeResponse turnOffAutoResourceOptimizeWithOptions(TurnOffAutoResourceOptimizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TurnOffAutoResourceOptimize"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TurnOffAutoResourceOptimizeResponse());
    }

    public TurnOffAutoResourceOptimizeResponse turnOffAutoResourceOptimize(TurnOffAutoResourceOptimizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.turnOffAutoResourceOptimizeWithOptions(request, runtime);
    }

    public UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfigWithOptions(UpdateAutoResourceOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDefragment)) {
            query.put("AutoDefragment", request.autoDefragment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDuplicateIndexDelete)) {
            query.put("AutoDuplicateIndexDelete", request.autoDuplicateIndexDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("Signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableFragmentationRatio)) {
            query.put("TableFragmentationRatio", request.tableFragmentationRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableSpaceSize)) {
            query.put("TableSpaceSize", request.tableSpaceSize);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoResourceOptimizeConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoResourceOptimizeConfigResponse());
    }

    public UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfig(UpdateAutoResourceOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoResourceOptimizeConfigWithOptions(request, runtime);
    }
}
