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

    public AccessHDMInstanceResponse accessHDMInstanceWithOptions(AccessHDMInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallerBid", request.callerBid);
        query.put("CallerType", request.callerType);
        query.put("CallerUid", request.callerUid);
        query.put("Engine", request.engine);
        query.put("External", request.external);
        query.put("InstanceAlias", request.instanceAlias);
        query.put("InstanceArea", request.instanceArea);
        query.put("InstanceId", request.instanceId);
        query.put("Ip", request.ip);
        query.put("NetworkType", request.networkType);
        query.put("OwnerId", request.ownerId);
        query.put("OwnerIdSignature", request.ownerIdSignature);
        query.put("Password", request.password);
        query.put("Port", request.port);
        query.put("Product", request.product);
        query.put("Region", request.region);
        query.put("Target", request.target);
        query.put("TenantId", request.tenantId);
        query.put("Username", request.username);
        query.put("VpcId", request.vpcId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessHDMInstance"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessHDMInstanceResponse());
    }

    public AccessHDMInstanceResponse accessHDMInstance(AccessHDMInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.accessHDMInstanceWithOptions(request, runtime);
    }

    public AddHDMInstanceResponse addHDMInstanceWithOptions(AddHDMInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Engine", request.engine);
        query.put("FlushAccount", request.flushAccount);
        query.put("InstanceAlias", request.instanceAlias);
        query.put("InstanceArea", request.instanceArea);
        query.put("InstanceId", request.instanceId);
        query.put("Ip", request.ip);
        query.put("NetworkType", request.networkType);
        query.put("Password", request.password);
        query.put("Port", request.port);
        query.put("Region", request.region);
        query.put("Username", request.username);
        query.put("VpcId", request.vpcId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHDMInstance"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("Description", request.description);
        query.put("DstInstanceId", request.dstInstanceId);
        query.put("DstSuperAccount", request.dstSuperAccount);
        query.put("DstSuperPassword", request.dstSuperPassword);
        query.put("Rate", request.rate);
        query.put("RequestDuration", request.requestDuration);
        query.put("RequestStartTime", request.requestStartTime);
        query.put("SrcEngine", request.srcEngine);
        query.put("SrcEngineVersion", request.srcEngineVersion);
        query.put("SrcMaxQps", request.srcMaxQps);
        query.put("SrcMeanQps", request.srcMeanQps);
        query.put("SrcSqlOssAddr", request.srcSqlOssAddr);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdamBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("BackupSetId", request.backupSetId);
        query.put("InstanceId", request.instanceId);
        query.put("NodeId", request.nodeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCacheAnalysisJob"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("Amount", request.amount);
        query.put("BackupId", request.backupId);
        query.put("BackupTime", request.backupTime);
        query.put("ClientType", request.clientType);
        query.put("Description", request.description);
        query.put("DstConnectionString", request.dstConnectionString);
        query.put("DstInstanceId", request.dstInstanceId);
        query.put("DstPort", request.dstPort);
        query.put("DstSuperAccount", request.dstSuperAccount);
        query.put("DstSuperPassword", request.dstSuperPassword);
        query.put("DstType", request.dstType);
        query.put("DtsJobClass", request.dtsJobClass);
        query.put("DtsJobId", request.dtsJobId);
        query.put("EndState", request.endState);
        query.put("GatewayVpcId", request.gatewayVpcId);
        query.put("GatewayVpcIp", request.gatewayVpcIp);
        query.put("Rate", request.rate);
        query.put("RequestDuration", request.requestDuration);
        query.put("RequestEndTime", request.requestEndTime);
        query.put("RequestStartTime", request.requestStartTime);
        query.put("SmartPressureTime", request.smartPressureTime);
        query.put("SrcInstanceId", request.srcInstanceId);
        query.put("SrcPublicIp", request.srcPublicIp);
        query.put("SrcSuperAccount", request.srcSuperAccount);
        query.put("SrcSuperPassword", request.srcSuperPassword);
        query.put("TaskType", request.taskType);
        query.put("WorkDir", request.workDir);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudBenchTasks"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("DBInstanceId", request.DBInstanceId);
        query.put("EndTime", request.endTime);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDiagnosticReport"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiagnosticReportResponse());
    }

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJobWithOptions(DescribeCacheAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("JobId", request.jobId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCacheAnalysisJob"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCacheAnalysisJobs"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("EndTime", request.endTime);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudBenchTasks"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudbenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudbenchTaskConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("DBInstanceId", request.DBInstanceId);
        query.put("EndTime", request.endTime);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosticReportList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        query.put("NodeId", request.nodeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHotBigKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("InstanceId", request.instanceId);
        query.put("NodeId", request.nodeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHotKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("NodeId", request.nodeId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopBigKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("NodeId", request.nodeId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopHotKeys"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAllSqlConcurrencyControlRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        query.put("ItemId", request.itemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSqlConcurrencyControl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConcurrencyControlTime", request.concurrencyControlTime);
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        query.put("MaxConcurrency", request.maxConcurrency);
        query.put("SqlKeywords", request.sqlKeywords);
        query.put("SqlType", request.sqlType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSqlConcurrencyControl"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AccessKey", request.accessKey);
        query.put("InstanceId", request.instanceId);
        query.put("Signature", request.signature);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoResourceOptimizeConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("InstanceId", request.instanceId);
        query.put("SpanId", request.spanId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEventContent"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutonomousNotifyEventContentResponse());
    }

    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventContentWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetailWithOptions(GetAutonomousNotifyEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("SpanId", request.spanId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEventDetail"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutonomousNotifyEventDetailResponse());
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetail(GetAutonomousNotifyEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventDetailWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEventsWithOptions(GetAutonomousNotifyEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("EventContext", request.eventContext);
        query.put("InstanceId", request.instanceId);
        query.put("Level", request.level);
        query.put("MinLevel", request.minLevel);
        query.put("NodeId", request.nodeId);
        query.put("PageOffset", request.pageOffset);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEvents"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutonomousNotifyEventsResponse());
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEvents(GetAutonomousNotifyEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventsWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRangeWithOptions(GetAutonomousNotifyEventsInRangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("EventContext", request.eventContext);
        query.put("InstanceId", request.instanceId);
        query.put("Level", request.level);
        query.put("MinLevel", request.minLevel);
        query.put("NodeId", request.nodeId);
        query.put("PageOffset", request.pageOffset);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutonomousNotifyEventsInRange"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("TaskId", request.taskId);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        query.put("accessKey", request.accessKey);
        query.put("signature", request.signature);
        query.put("skipAuth", request.skipAuth);
        query.put("timestamp", request.timestamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEndpointSwitchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEndpointSwitchTaskResponse());
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTask(GetEndpointSwitchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEndpointSwitchTaskWithOptions(request, runtime);
    }

    public GetEventOverviewResponse getEventOverviewWithOptions(GetEventOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("MinLevel", request.minLevel);
        query.put("StartTime", request.startTime);
        query.put("Tags", request.tags);
        query.put("TicketId", request.ticketId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEventOverview"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventOverviewResponse());
    }

    public GetEventOverviewResponse getEventOverview(GetEventOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventOverviewWithOptions(request, runtime);
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultWithOptions(GetHDMAliyunResourceSyncResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TaskId", request.taskId);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        query.put("accessKey", request.accessKey);
        query.put("signature", request.signature);
        query.put("skipAuth", request.skipAuth);
        query.put("timestamp", request.timestamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHDMAliyunResourceSyncResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        query.put("accessKey", request.accessKey);
        query.put("signature", request.signature);
        query.put("skipAuth", request.skipAuth);
        query.put("timestamp", request.timestamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHDMLastAliyunResourceSyncResult"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("EndTime", request.endTime);
        query.put("Engine", request.engine);
        query.put("InstanceArea", request.instanceArea);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("SearchMap", request.searchMap);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceInspections"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceInspectionsResponse());
    }

    public GetInstanceInspectionsResponse getInstanceInspections(GetInstanceInspectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceInspectionsWithOptions(request, runtime);
    }

    public GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryListWithOptions(GetResourceOptimizeHistoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessKey", request.accessKey);
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("Page", request.page);
        query.put("PageSize", request.pageSize);
        query.put("Signature", request.signature);
        query.put("StartTime", request.startTime);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceOptimizeHistoryList"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRunningSqlConcurrencyControlRules"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunningSqlConcurrencyControlRulesResponse());
    }

    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRunningSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistoryWithOptions(GetSqlConcurrencyControlRulesHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConsoleContext", request.consoleContext);
        query.put("InstanceId", request.instanceId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlConcurrencyControlRulesHistory"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("EndDt", request.endDt);
        query.put("Engine", request.engine);
        query.put("InstanceIds", request.instanceIds);
        query.put("StartDt", request.startDt);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlOptimizeAdvice"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("ConsoleContext", request.consoleContext);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCloudBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCloudBenchTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AccessKey", request.accessKey);
        query.put("InstanceId", request.instanceId);
        query.put("Signature", request.signature);
        query.put("StopOrRollback", request.stopOrRollback);
        query.put("TaskType", request.taskType);
        query.put("TaskUuid", request.taskUuid);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOrRollbackOptimizeTask"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("Async", request.async);
        query.put("ResourceTypes", request.resourceTypes);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("WaitForModifySecurityIps", request.waitForModifySecurityIps);
        query.put("__context", request.context);
        query.put("accessKey", request.accessKey);
        query.put("signature", request.signature);
        query.put("skipAuth", request.skipAuth);
        query.put("timestamp", request.timestamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncHDMAliyunResource"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AccessKey", request.accessKey);
        query.put("InstanceId", request.instanceId);
        query.put("Signature", request.signature);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TurnOffAutoResourceOptimize"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AccessKey", request.accessKey);
        query.put("AutoDefragment", request.autoDefragment);
        query.put("AutoDuplicateIndexDelete", request.autoDuplicateIndexDelete);
        query.put("InstanceId", request.instanceId);
        query.put("Signature", request.signature);
        query.put("TableFragmentationRatio", request.tableFragmentationRatio);
        query.put("TableSpaceSize", request.tableSpaceSize);
        query.put("Uid", request.uid);
        query.put("UserId", request.userId);
        query.put("__context", request.context);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoResourceOptimizeConfig"),
            new TeaPair("version", "2020-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoResourceOptimizeConfigResponse());
    }

    public UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfig(UpdateAutoResourceOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoResourceOptimizeConfigWithOptions(request, runtime);
    }
}
