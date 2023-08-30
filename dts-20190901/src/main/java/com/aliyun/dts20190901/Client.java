// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901;

import com.aliyun.tea.*;
import com.aliyun.dts20190901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dts.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-west-1", "dts.aliyuncs.com"),
            new TeaPair("us-east-1", "dts.aliyuncs.com"),
            new TeaPair("eu-central-1", "dts.aliyuncs.com"),
            new TeaPair("me-east-1", "dts.aliyuncs.com"),
            new TeaPair("ap-south-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dts.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dts.aliyuncs.com"),
            new TeaPair("cn-fujian", "dts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dts.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ConfigureSynchronizationJobResponse configureSynchronizationJobWithOptions(ConfigureSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            query.put("Checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataInitialization)) {
            query.put("DataInitialization", request.dataInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrationReserved)) {
            query.put("MigrationReserved", request.migrationReserved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structureInitialization)) {
            query.put("StructureInitialization", request.structureInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            query.put("SynchronizationObjects", request.synchronizationObjects);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionKey)) {
            query.put("PartitionKey", request.partitionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobResponse());
    }

    public ConfigureSynchronizationJobResponse configureSynchronizationJob(ConfigureSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobWithOptions(request, runtime);
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlertWithOptions(ConfigureSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertPhone)) {
            query.put("DelayAlertPhone", request.delayAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayAlertStatus)) {
            query.put("DelayAlertStatus", request.delayAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayOverSeconds)) {
            query.put("DelayOverSeconds", request.delayOverSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertPhone)) {
            query.put("ErrorAlertPhone", request.errorAlertPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorAlertStatus)) {
            query.put("ErrorAlertStatus", request.errorAlertStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureSynchronizationJobAlert"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureSynchronizationJobAlertResponse());
    }

    public ConfigureSynchronizationJobAlertResponse configureSynchronizationJobAlert(ConfigureSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureSynchronizationJobAlertWithOptions(request, runtime);
    }

    public CreateSynchronizationJobResponse createSynchronizationJobWithOptions(CreateSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destRegion)) {
            query.put("DestRegion", request.destRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            query.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobClass)) {
            query.put("SynchronizationJobClass", request.synchronizationJobClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topology)) {
            query.put("Topology", request.topology);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpoint)) {
            query.put("DestinationEndpoint", request.destinationEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpoint)) {
            query.put("SourceEndpoint", request.sourceEndpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSynchronizationJobResponse());
    }

    public CreateSynchronizationJobResponse createSynchronizationJob(CreateSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSynchronizationJobWithOptions(request, runtime);
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJobWithOptions(DeleteSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSynchronizationJobResponse());
    }

    public DeleteSynchronizationJobResponse deleteSynchronizationJob(DeleteSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSynchronizationJobWithOptions(request, runtime);
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatusWithOptions(DescribeEndpointSwitchStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndpointSwitchStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndpointSwitchStatusResponse());
    }

    public DescribeEndpointSwitchStatusResponse describeEndpointSwitchStatus(DescribeEndpointSwitchStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndpointSwitchStatusWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlertWithOptions(DescribeSynchronizationJobAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobAlert"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobAlertResponse());
    }

    public DescribeSynchronizationJobAlertResponse describeSynchronizationJobAlert(DescribeSynchronizationJobAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobAlertWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatusWithOptions(DescribeSynchronizationJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobStatusResponse());
    }

    public DescribeSynchronizationJobStatusResponse describeSynchronizationJobStatus(DescribeSynchronizationJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobStatusWithOptions(request, runtime);
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobsWithOptions(DescribeSynchronizationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobName)) {
            query.put("SynchronizationJobName", request.synchronizationJobName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationJobs"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationJobsResponse());
    }

    public DescribeSynchronizationJobsResponse describeSynchronizationJobs(DescribeSynchronizationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationJobsWithOptions(request, runtime);
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatusWithOptions(DescribeSynchronizationObjectModifyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSynchronizationObjectModifyStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSynchronizationObjectModifyStatusResponse());
    }

    public DescribeSynchronizationObjectModifyStatusResponse describeSynchronizationObjectModifyStatus(DescribeSynchronizationObjectModifyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSynchronizationObjectModifyStatusWithOptions(request, runtime);
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObjectWithOptions(ModifySynchronizationObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationObjects)) {
            query.put("SynchronizationObjects", request.synchronizationObjects);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySynchronizationObject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySynchronizationObjectResponse());
    }

    public ModifySynchronizationObjectResponse modifySynchronizationObject(ModifySynchronizationObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySynchronizationObjectWithOptions(request, runtime);
    }

    public ResetSynchronizationJobResponse resetSynchronizationJobWithOptions(ResetSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetSynchronizationJobResponse());
    }

    public ResetSynchronizationJobResponse resetSynchronizationJob(ResetSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetSynchronizationJobWithOptions(request, runtime);
    }

    public StartSynchronizationJobResponse startSynchronizationJobWithOptions(StartSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSynchronizationJobResponse());
    }

    public StartSynchronizationJobResponse startSynchronizationJob(StartSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSynchronizationJobWithOptions(request, runtime);
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJobWithOptions(SuspendSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendSynchronizationJob"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendSynchronizationJobResponse());
    }

    public SuspendSynchronizationJobResponse suspendSynchronizationJob(SuspendSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendSynchronizationJobWithOptions(request, runtime);
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpointWithOptions(SwitchSynchronizationEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationDirection)) {
            query.put("SynchronizationDirection", request.synchronizationDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            query.put("Endpoint", request.endpoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchSynchronizationEndpoint"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchSynchronizationEndpointResponse());
    }

    public SwitchSynchronizationEndpointResponse switchSynchronizationEndpoint(SwitchSynchronizationEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchSynchronizationEndpointWithOptions(request, runtime);
    }
}
