// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124;

import com.aliyun.tea.*;
import com.aliyun.dtsrs20151124.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dtsrs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConfigureMigrationJobResponse configureMigrationJobWithOptions(ConfigureMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationObject)) {
            query.put("MigrationObject", request.migrationObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.destinationEndpoint))) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.migrationMode))) {
            query.put("MigrationMode", request.migrationMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.sourceEndpoint))) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureMigrationJobResponse());
    }

    public ConfigureMigrationJobResponse configureMigrationJob(ConfigureMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configureMigrationJobWithOptions(request, runtime);
    }

    public CreateMigrationJobResponse createMigrationJobWithOptions(CreateMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobClass)) {
            query.put("MigrationJobClass", request.migrationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMigrationJobResponse());
    }

    public CreateMigrationJobResponse createMigrationJob(CreateMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMigrationJobWithOptions(request, runtime);
    }

    public CreateSynchronousJobResponse createSynchronousJobWithOptions(CreateSynchronousJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationInstanceId)) {
            query.put("DestinationInstanceId", request.destinationInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullDataIntialization)) {
            query.put("FullDataIntialization", request.fullDataIntialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceInstanceId)) {
            query.put("SourceInstanceId", request.sourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureIntialization)) {
            query.put("StructureIntialization", request.structureIntialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobName)) {
            query.put("SynchronousJobName", request.synchronousJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronousObjectList)) {
            query.put("SynchronousObjectList", request.synchronousObjectList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronousSpeedLimit)) {
            query.put("SynchronousSpeedLimit", request.synchronousSpeedLimit);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynchronousJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynchronousJobResponse());
    }

    public CreateSynchronousJobResponse createSynchronousJob(CreateSynchronousJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSynchronousJobWithOptions(request, runtime);
    }

    public DeleteMigrationJobResponse deleteMigrationJobWithOptions(DeleteMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMigrationJobResponse());
    }

    public DeleteMigrationJobResponse deleteMigrationJob(DeleteMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMigrationJobWithOptions(request, runtime);
    }

    public DeleteSynchronousJobResponse deleteSynchronousJobWithOptions(DeleteSynchronousJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobId)) {
            query.put("SynchronousJobId", request.synchronousJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSynchronousJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSynchronousJobResponse());
    }

    public DeleteSynchronousJobResponse deleteSynchronousJob(DeleteSynchronousJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSynchronousJobWithOptions(request, runtime);
    }

    public DescirbeMigrationJobsResponse descirbeMigrationJobsWithOptions(DescirbeMigrationJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobName)) {
            query.put("MigrationJobName", request.migrationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescirbeMigrationJobs"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescirbeMigrationJobsResponse());
    }

    public DescirbeMigrationJobsResponse descirbeMigrationJobs(DescirbeMigrationJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descirbeMigrationJobsWithOptions(request, runtime);
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatusWithOptions(DescribeMigrationJobStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMigrationJobStatus"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMigrationJobStatusResponse());
    }

    public DescribeMigrationJobStatusResponse describeMigrationJobStatus(DescribeMigrationJobStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMigrationJobStatusWithOptions(request, runtime);
    }

    public DescribeSynchronousJobConfigurationResponse describeSynchronousJobConfigurationWithOptions(DescribeSynchronousJobConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobId)) {
            query.put("SynchronousJobId", request.synchronousJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronousJobConfiguration"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronousJobConfigurationResponse());
    }

    public DescribeSynchronousJobConfigurationResponse describeSynchronousJobConfiguration(DescribeSynchronousJobConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronousJobConfigurationWithOptions(request, runtime);
    }

    public DescribeSynchronousJobDetailsResponse describeSynchronousJobDetailsWithOptions(DescribeSynchronousJobDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobId)) {
            query.put("SynchronousJobId", request.synchronousJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronousJobDetails"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronousJobDetailsResponse());
    }

    public DescribeSynchronousJobDetailsResponse describeSynchronousJobDetails(DescribeSynchronousJobDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronousJobDetailsWithOptions(request, runtime);
    }

    public DescribeSynchronousJobListResponse describeSynchronousJobListWithOptions(DescribeSynchronousJobListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobName)) {
            query.put("SynchronousJobName", request.synchronousJobName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronousJobList"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronousJobListResponse());
    }

    public DescribeSynchronousJobListResponse describeSynchronousJobList(DescribeSynchronousJobListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSynchronousJobListWithOptions(request, runtime);
    }

    public StartMigrationJobResponse startMigrationJobWithOptions(StartMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMigrationJobResponse());
    }

    public StartMigrationJobResponse startMigrationJob(StartMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMigrationJobWithOptions(request, runtime);
    }

    public StartSynchronousJobResponse startSynchronousJobWithOptions(StartSynchronousJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobId)) {
            query.put("SynchronousJobId", request.synchronousJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSynchronousJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSynchronousJobResponse());
    }

    public StartSynchronousJobResponse startSynchronousJob(StartSynchronousJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startSynchronousJobWithOptions(request, runtime);
    }

    public StopMigrationJobResponse stopMigrationJobWithOptions(StopMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMigrationJobResponse());
    }

    public StopMigrationJobResponse stopMigrationJob(StopMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMigrationJobWithOptions(request, runtime);
    }

    public SuspendMigrationJobResponse suspendMigrationJobWithOptions(SuspendMigrationJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.migrationJobId)) {
            query.put("MigrationJobId", request.migrationJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendMigrationJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendMigrationJobResponse());
    }

    public SuspendMigrationJobResponse suspendMigrationJob(SuspendMigrationJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendMigrationJobWithOptions(request, runtime);
    }

    public SuspendSynchronousJobResponse suspendSynchronousJobWithOptions(SuspendSynchronousJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronousJobId)) {
            query.put("SynchronousJobId", request.synchronousJobId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendSynchronousJob"),
            new TeaPair("version", "2015-11-24"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendSynchronousJobResponse());
    }

    public SuspendSynchronousJobResponse suspendSynchronousJob(SuspendSynchronousJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendSynchronousJobWithOptions(request, runtime);
    }
}
