// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613;

import com.aliyun.tea.*;
import com.aliyun.elasticsearch20170613.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-chengdu", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-edge-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-fujian", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-wuhan", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "elasticsearch.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "elasticsearch.aliyuncs.com"),
            new TeaPair("me-east-1", "elasticsearch.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "elasticsearch.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("elasticsearch", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ActivateZonesResponse activateZones(String InstanceId, ActivateZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    public ActivateZonesResponse activateZonesWithOptions(String InstanceId, ActivateZonesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ActivateZones", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/recover-zones", "json", req, runtime), new ActivateZonesResponse());
    }

    public AddConnectableClusterResponse addConnectableCluster(String InstanceId, AddConnectableClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConnectableClusterWithOptions(InstanceId, request, headers, runtime);
    }

    public AddConnectableClusterResponse addConnectableClusterWithOptions(String InstanceId, AddConnectableClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddConnectableCluster", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/connected-clusters", "json", req, runtime), new AddConnectableClusterResponse());
    }

    public AddSnapshotRepoResponse addSnapshotRepo(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSnapshotRepoWithOptions(InstanceId, headers, runtime);
    }

    public AddSnapshotRepoResponse addSnapshotRepoWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("AddSnapshotRepo", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/snapshot-repos", "json", req, runtime), new AddSnapshotRepoResponse());
    }

    public CancelDeletionResponse cancelDeletion(String InstanceId, CancelDeletionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelDeletionResponse cancelDeletionWithOptions(String InstanceId, CancelDeletionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CancelDeletion", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/cancel-deletion", "json", req, runtime), new CancelDeletionResponse());
    }

    public CancelLogstashDeletionResponse cancelLogstashDeletion(String InstanceId, CancelLogstashDeletionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLogstashDeletionWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelLogstashDeletionResponse cancelLogstashDeletionWithOptions(String InstanceId, CancelLogstashDeletionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CancelLogstashDeletion", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/cancel-deletion", "json", req, runtime), new CancelLogstashDeletionResponse());
    }

    public CancelTaskResponse cancelTask(String InstanceId, CancelTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public CancelTaskResponse cancelTaskWithOptions(String InstanceId, CancelTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("taskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CancelTask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/cancel-task", "json", req, runtime), new CancelTaskResponse());
    }

    public CloseDiagnosisResponse closeDiagnosis(String InstanceId, CloseDiagnosisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    public CloseDiagnosisResponse closeDiagnosisWithOptions(String InstanceId, CloseDiagnosisRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CloseDiagnosis", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/actions/close-diagnosis", "json", req, runtime), new CloseDiagnosisResponse());
    }

    public CloseHttpsResponse closeHttps(String InstanceId, CloseHttpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    public CloseHttpsResponse closeHttpsWithOptions(String InstanceId, CloseHttpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CloseHttps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/close-https", "json", req, runtime), new CloseHttpsResponse());
    }

    public CloseManagedIndexResponse closeManagedIndex(String InstanceId, String Index, CloseManagedIndexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeManagedIndexWithOptions(InstanceId, Index, request, headers, runtime);
    }

    public CloseManagedIndexResponse closeManagedIndexWithOptions(String InstanceId, String Index, CloseManagedIndexRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        Index = com.aliyun.openapiutil.Client.getEncodeParam(Index);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CloseManagedIndex", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/indices/" + Index + "/close-managed", "json", req, runtime), new CloseManagedIndexResponse());
    }

    public CreateCollectorResponse createCollector(CreateCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCollectorWithOptions(request, headers, runtime);
    }

    public CreateCollectorResponse createCollectorWithOptions(CreateCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateCollector", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors", "json", req, runtime), new CreateCollectorResponse());
    }

    public CreateDataStreamResponse createDataStream(String InstanceId, CreateDataStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataStreamWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateDataStreamResponse createDataStreamWithOptions(String InstanceId, CreateDataStreamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateDataStream", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/data-streams", "json", req, runtime), new CreateDataStreamResponse());
    }

    public CreateDataTasksResponse createDataTasks(String InstanceId, CreateDataTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataTasksWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateDataTasksResponse createDataTasksWithOptions(String InstanceId, CreateDataTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateDataTasks", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/data-task", "json", req, runtime), new CreateDataTasksResponse());
    }

    public CreateILMPolicyResponse createILMPolicy(String InstanceId, CreateILMPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createILMPolicyWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateILMPolicyResponse createILMPolicyWithOptions(String InstanceId, CreateILMPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateILMPolicy", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/ilm-policies", "json", req, runtime), new CreateILMPolicyResponse());
    }

    public CreateIndexTemplateResponse createIndexTemplate(String InstanceId, CreateIndexTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexTemplateWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateIndexTemplateResponse createIndexTemplateWithOptions(String InstanceId, CreateIndexTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateIndexTemplate", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/index-templates", "json", req, runtime), new CreateIndexTemplateResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(request, headers, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("createInstance", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateLogstashResponse createLogstash(CreateLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogstashWithOptions(request, headers, runtime);
    }

    public CreateLogstashResponse createLogstashWithOptions(CreateLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateLogstash", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes", "json", req, runtime), new CreateLogstashResponse());
    }

    public CreatePipelinesResponse createPipelines(String InstanceId, CreatePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public CreatePipelinesResponse createPipelinesWithOptions(String InstanceId, CreatePipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreatePipelines", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines", "json", req, runtime), new CreatePipelinesResponse());
    }

    public CreateSnapshotResponse createSnapshot(String InstanceId, CreateSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSnapshotWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateSnapshotResponse createSnapshotWithOptions(String InstanceId, CreateSnapshotRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSnapshot", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/snapshots", "json", req, runtime), new CreateSnapshotResponse());
    }

    public CreateVpcEndpointResponse createVpcEndpoint(String InstanceId, CreateVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVpcEndpointWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateVpcEndpointResponse createVpcEndpointWithOptions(String InstanceId, CreateVpcEndpointRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateVpcEndpoint", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/vpc-endpoints", "json", req, runtime), new CreateVpcEndpointResponse());
    }

    public DeactivateZonesResponse deactivateZones(String InstanceId, DeactivateZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deactivateZonesWithOptions(InstanceId, request, headers, runtime);
    }

    public DeactivateZonesResponse deactivateZonesWithOptions(String InstanceId, DeactivateZonesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeactivateZones", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/down-zones", "json", req, runtime), new DeactivateZonesResponse());
    }

    public DeleteCollectorResponse deleteCollector(String ResId, DeleteCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCollectorWithOptions(ResId, request, headers, runtime);
    }

    public DeleteCollectorResponse deleteCollectorWithOptions(String ResId, DeleteCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteCollector", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/collectors/" + ResId + "", "json", req, runtime), new DeleteCollectorResponse());
    }

    public DeleteConnectedClusterResponse deleteConnectedCluster(String InstanceId, DeleteConnectedClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConnectedClusterWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteConnectedClusterResponse deleteConnectedClusterWithOptions(String InstanceId, DeleteConnectedClusterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectedInstanceId)) {
            query.put("connectedInstanceId", request.connectedInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteConnectedCluster", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/connected-clusters", "json", req, runtime), new DeleteConnectedClusterResponse());
    }

    public DeleteDataStreamResponse deleteDataStream(String InstanceId, String DataStream, DeleteDataStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    public DeleteDataStreamResponse deleteDataStreamWithOptions(String InstanceId, String DataStream, DeleteDataStreamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        DataStream = com.aliyun.openapiutil.Client.getEncodeParam(DataStream);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDataStream", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/data-streams/" + DataStream + "", "json", req, runtime), new DeleteDataStreamResponse());
    }

    public DeleteDataTaskResponse deleteDataTask(String InstanceId, DeleteDataTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteDataTaskResponse deleteDataTaskWithOptions(String InstanceId, DeleteDataTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDataTask", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/data-task", "json", req, runtime), new DeleteDataTaskResponse());
    }

    public DeleteILMPolicyResponse deleteILMPolicy(String InstanceId, String PolicyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    public DeleteILMPolicyResponse deleteILMPolicyWithOptions(String InstanceId, String PolicyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        PolicyName = com.aliyun.openapiutil.Client.getEncodeParam(PolicyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteILMPolicy", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/ilm-policies/" + PolicyName + "", "json", req, runtime), new DeleteILMPolicyResponse());
    }

    public DeleteIndexTemplateResponse deleteIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    public DeleteIndexTemplateResponse deleteIndexTemplateWithOptions(String InstanceId, String IndexTemplate, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        IndexTemplate = com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteIndexTemplate", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/index-templates/" + IndexTemplate + "", "json", req, runtime), new DeleteIndexTemplateResponse());
    }

    public DeleteInstanceResponse deleteInstance(String InstanceId, DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(String InstanceId, DeleteInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("deleteType", request.deleteType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteInstance", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteLogstashResponse deleteLogstash(String InstanceId, DeleteLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteLogstashResponse deleteLogstashWithOptions(String InstanceId, DeleteLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteType)) {
            query.put("deleteType", request.deleteType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteLogstash", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/logstashes/" + InstanceId + "", "json", req, runtime), new DeleteLogstashResponse());
    }

    public DeletePipelinesResponse deletePipelines(String InstanceId, DeletePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public DeletePipelinesResponse deletePipelinesWithOptions(String InstanceId, DeletePipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineIds)) {
            query.put("pipelineIds", request.pipelineIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeletePipelines", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines", "json", req, runtime), new DeletePipelinesResponse());
    }

    public DeleteSnapshotRepoResponse deleteSnapshotRepo(String InstanceId, DeleteSnapshotRepoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSnapshotRepoWithOptions(InstanceId, request, headers, runtime);
    }

    public DeleteSnapshotRepoResponse deleteSnapshotRepoWithOptions(String InstanceId, DeleteSnapshotRepoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.repoPath)) {
            query.put("repoPath", request.repoPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSnapshotRepo", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/snapshot-repos", "json", req, runtime), new DeleteSnapshotRepoResponse());
    }

    public DeleteVpcEndpointResponse deleteVpcEndpoint(String InstanceId, String EndpointId, DeleteVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteVpcEndpointWithOptions(InstanceId, EndpointId, request, headers, runtime);
    }

    public DeleteVpcEndpointResponse deleteVpcEndpointWithOptions(String InstanceId, String EndpointId, DeleteVpcEndpointRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        EndpointId = com.aliyun.openapiutil.Client.getEncodeParam(EndpointId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteVpcEndpoint", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/vpc-endpoints/" + EndpointId + "", "json", req, runtime), new DeleteVpcEndpointResponse());
    }

    public DescribeAckOperatorResponse describeAckOperator(String ClusterId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAckOperatorWithOptions(ClusterId, headers, runtime);
    }

    public DescribeAckOperatorResponse describeAckOperatorWithOptions(String ClusterId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAckOperator", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/ack-clusters/" + ClusterId + "/operator", "json", req, runtime), new DescribeAckOperatorResponse());
    }

    public DescribeCollectorResponse describeCollector(String ResId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCollectorWithOptions(ResId, headers, runtime);
    }

    public DescribeCollectorResponse describeCollectorWithOptions(String ResId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCollector", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/collectors/" + ResId + "", "json", req, runtime), new DescribeCollectorResponse());
    }

    public DescribeConnectableClustersResponse describeConnectableClusters(String InstanceId, DescribeConnectableClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConnectableClustersWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeConnectableClustersResponse describeConnectableClustersWithOptions(String InstanceId, DescribeConnectableClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alreadySetItems)) {
            query.put("alreadySetItems", request.alreadySetItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeConnectableClusters", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/connectable-clusters", "json", req, runtime), new DescribeConnectableClustersResponse());
    }

    public DescribeDiagnoseReportResponse describeDiagnoseReport(String InstanceId, String ReportId, DescribeDiagnoseReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnoseReportWithOptions(InstanceId, ReportId, request, headers, runtime);
    }

    public DescribeDiagnoseReportResponse describeDiagnoseReportWithOptions(String InstanceId, String ReportId, DescribeDiagnoseReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        ReportId = com.aliyun.openapiutil.Client.getEncodeParam(ReportId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDiagnoseReport", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/reports/" + ReportId + "", "json", req, runtime), new DescribeDiagnoseReportResponse());
    }

    public DescribeDiagnosisSettingsResponse describeDiagnosisSettings(String InstanceId, DescribeDiagnosisSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeDiagnosisSettingsResponse describeDiagnosisSettingsWithOptions(String InstanceId, DescribeDiagnosisSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDiagnosisSettings", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/settings", "json", req, runtime), new DescribeDiagnosisSettingsResponse());
    }

    public DescribeElasticsearchHealthResponse describeElasticsearchHealth(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeElasticsearchHealthWithOptions(InstanceId, headers, runtime);
    }

    public DescribeElasticsearchHealthResponse describeElasticsearchHealthWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeElasticsearchHealth", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/elasticsearch-health", "json", req, runtime), new DescribeElasticsearchHealthResponse());
    }

    public DescribeILMPolicyResponse describeILMPolicy(String InstanceId, String PolicyName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeILMPolicyWithOptions(InstanceId, PolicyName, headers, runtime);
    }

    public DescribeILMPolicyResponse describeILMPolicyWithOptions(String InstanceId, String PolicyName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        PolicyName = com.aliyun.openapiutil.Client.getEncodeParam(PolicyName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeILMPolicy", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/ilm-policies/" + PolicyName + "", "json", req, runtime), new DescribeILMPolicyResponse());
    }

    public DescribeIndexTemplateResponse describeIndexTemplate(String InstanceId, String IndexTemplate) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIndexTemplateWithOptions(InstanceId, IndexTemplate, headers, runtime);
    }

    public DescribeIndexTemplateResponse describeIndexTemplateWithOptions(String InstanceId, String IndexTemplate, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        IndexTemplate = com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeIndexTemplate", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/index-templates/" + IndexTemplate + "", "json", req, runtime), new DescribeIndexTemplateResponse());
    }

    public DescribeInstanceResponse describeInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceWithOptions(InstanceId, headers, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeInstance", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeKibanaSettingsResponse describeKibanaSettings(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeKibanaSettingsWithOptions(InstanceId, headers, runtime);
    }

    public DescribeKibanaSettingsResponse describeKibanaSettingsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeKibanaSettings", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/kibana-settings", "json", req, runtime), new DescribeKibanaSettingsResponse());
    }

    public DescribeLogstashResponse describeLogstash(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeLogstashWithOptions(InstanceId, headers, runtime);
    }

    public DescribeLogstashResponse describeLogstashWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeLogstash", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "", "json", req, runtime), new DescribeLogstashResponse());
    }

    public DescribePipelineResponse describePipeline(String InstanceId, String PipelineId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineWithOptions(InstanceId, PipelineId, headers, runtime);
    }

    public DescribePipelineResponse describePipelineWithOptions(String InstanceId, String PipelineId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        PipelineId = com.aliyun.openapiutil.Client.getEncodeParam(PipelineId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribePipeline", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines/" + PipelineId + "", "json", req, runtime), new DescribePipelineResponse());
    }

    public DescribePipelineManagementConfigResponse describePipelineManagementConfig(String InstanceId, DescribePipelineManagementConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribePipelineManagementConfigResponse describePipelineManagementConfigWithOptions(String InstanceId, DescribePipelineManagementConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribePipelineManagementConfig", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/pipeline-management-config", "json", req, runtime), new DescribePipelineManagementConfigResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRegions", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/regions", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeSnapshotSettingResponse describeSnapshotSetting(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSnapshotSettingWithOptions(InstanceId, headers, runtime);
    }

    public DescribeSnapshotSettingResponse describeSnapshotSettingWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSnapshotSetting", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/snapshot-setting", "json", req, runtime), new DescribeSnapshotSettingResponse());
    }

    public DescribeTemplatesResponse describeTemplates(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeTemplatesWithOptions(InstanceId, headers, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeTemplates", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/templates", "json", req, runtime), new DescribeTemplatesResponse());
    }

    public DescribeXpackMonitorConfigResponse describeXpackMonitorConfig(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeXpackMonitorConfigWithOptions(InstanceId, headers, runtime);
    }

    public DescribeXpackMonitorConfigResponse describeXpackMonitorConfigWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeXpackMonitorConfig", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/xpack-monitor-config", "json", req, runtime), new DescribeXpackMonitorConfigResponse());
    }

    public DiagnoseInstanceResponse diagnoseInstance(String InstanceId, DiagnoseInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.diagnoseInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public DiagnoseInstanceResponse diagnoseInstanceWithOptions(String InstanceId, DiagnoseInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DiagnoseInstance", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/actions/diagnose", "json", req, runtime), new DiagnoseInstanceResponse());
    }

    public EstimatedLogstashRestartTimeResponse estimatedLogstashRestartTime(String InstanceId, EstimatedLogstashRestartTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedLogstashRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    public EstimatedLogstashRestartTimeResponse estimatedLogstashRestartTimeWithOptions(String InstanceId, EstimatedLogstashRestartTimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EstimatedLogstashRestartTime", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/estimated-time/restart-time", "json", req, runtime), new EstimatedLogstashRestartTimeResponse());
    }

    public EstimatedRestartTimeResponse estimatedRestartTime(String InstanceId, EstimatedRestartTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.estimatedRestartTimeWithOptions(InstanceId, request, headers, runtime);
    }

    public EstimatedRestartTimeResponse estimatedRestartTimeWithOptions(String InstanceId, EstimatedRestartTimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("EstimatedRestartTime", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/estimated-time/restart-time", "json", req, runtime), new EstimatedRestartTimeResponse());
    }

    public GetClusterDataInformationResponse getClusterDataInformation() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getClusterDataInformationWithOptions(headers, runtime);
    }

    public GetClusterDataInformationResponse getClusterDataInformationWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetClusterDataInformation", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/cluster/data-information", "json", req, runtime), new GetClusterDataInformationResponse());
    }

    public GetElastictaskResponse getElastictask(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElastictaskWithOptions(InstanceId, headers, runtime);
    }

    public GetElastictaskResponse getElastictaskWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetElastictask", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/elastic-task", "json", req, runtime), new GetElastictaskResponse());
    }

    public GetEmonGrafanaAlertsResponse getEmonGrafanaAlerts(String ProjectId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaAlertsWithOptions(ProjectId, headers, runtime);
    }

    public GetEmonGrafanaAlertsResponse getEmonGrafanaAlertsWithOptions(String ProjectId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ProjectId = com.aliyun.openapiutil.Client.getEncodeParam(ProjectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEmonGrafanaAlerts", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/emon/projects/" + ProjectId + "/grafana/proxy/api/alerts", "json", req, runtime), new GetEmonGrafanaAlertsResponse());
    }

    public GetEmonGrafanaDashboardsResponse getEmonGrafanaDashboards(String ProjectId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonGrafanaDashboardsWithOptions(ProjectId, headers, runtime);
    }

    public GetEmonGrafanaDashboardsResponse getEmonGrafanaDashboardsWithOptions(String ProjectId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ProjectId = com.aliyun.openapiutil.Client.getEncodeParam(ProjectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEmonGrafanaDashboards", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/emon/projects/" + ProjectId + "/grafana/proxy/api/search", "json", req, runtime), new GetEmonGrafanaDashboardsResponse());
    }

    public GetEmonMonitorDataResponse getEmonMonitorData(String ProjectId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmonMonitorDataWithOptions(ProjectId, headers, runtime);
    }

    public GetEmonMonitorDataResponse getEmonMonitorDataWithOptions(String ProjectId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ProjectId = com.aliyun.openapiutil.Client.getEncodeParam(ProjectId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetEmonMonitorData", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/emon/projects/" + ProjectId + "/metrics/query", "json", req, runtime), new GetEmonMonitorDataResponse());
    }

    public GetOpenStoreUsageResponse getOpenStoreUsage(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOpenStoreUsageWithOptions(InstanceId, headers, runtime);
    }

    public GetOpenStoreUsageResponse getOpenStoreUsageWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetOpenStoreUsage", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/openstore/usage", "json", req, runtime), new GetOpenStoreUsageResponse());
    }

    public GetRegionConfigurationResponse getRegionConfiguration(GetRegionConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionConfigurationWithOptions(request, headers, runtime);
    }

    public GetRegionConfigurationResponse getRegionConfigurationWithOptions(GetRegionConfigurationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("zoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetRegionConfiguration", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/region", "json", req, runtime), new GetRegionConfigurationResponse());
    }

    public GetSuggestShrinkableNodesResponse getSuggestShrinkableNodes(String InstanceId, GetSuggestShrinkableNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSuggestShrinkableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public GetSuggestShrinkableNodesResponse getSuggestShrinkableNodesWithOptions(String InstanceId, GetSuggestShrinkableNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSuggestShrinkableNodes", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/suggest-shrinkable-nodes", "json", req, runtime), new GetSuggestShrinkableNodesResponse());
    }

    public GetTransferableNodesResponse getTransferableNodes(String InstanceId, GetTransferableNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public GetTransferableNodesResponse getTransferableNodesWithOptions(String InstanceId, GetTransferableNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTransferableNodes", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/transferable-nodes", "json", req, runtime), new GetTransferableNodesResponse());
    }

    public InitializeOperationRoleResponse initializeOperationRole(InitializeOperationRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initializeOperationRoleWithOptions(request, headers, runtime);
    }

    public InitializeOperationRoleResponse initializeOperationRoleWithOptions(InitializeOperationRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InitializeOperationRole", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/user/slr", "json", req, runtime), new InitializeOperationRoleResponse());
    }

    public InstallAckOperatorResponse installAckOperator(String ClusterId, InstallAckOperatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAckOperatorWithOptions(ClusterId, request, headers, runtime);
    }

    public InstallAckOperatorResponse installAckOperatorWithOptions(String ClusterId, InstallAckOperatorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InstallAckOperator", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/ack-clusters/" + ClusterId + "/operator", "json", req, runtime), new InstallAckOperatorResponse());
    }

    public InstallKibanaSystemPluginResponse installKibanaSystemPlugin(String InstanceId, InstallKibanaSystemPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installKibanaSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public InstallKibanaSystemPluginResponse installKibanaSystemPluginWithOptions(String InstanceId, InstallKibanaSystemPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InstallKibanaSystemPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/kibana-plugins/system/actions/install", "json", req, runtime), new InstallKibanaSystemPluginResponse());
    }

    public InstallLogstashSystemPluginResponse installLogstashSystemPlugin(String InstanceId, InstallLogstashSystemPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installLogstashSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public InstallLogstashSystemPluginResponse installLogstashSystemPluginWithOptions(String InstanceId, InstallLogstashSystemPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InstallLogstashSystemPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/plugins/system/actions/install", "json", req, runtime), new InstallLogstashSystemPluginResponse());
    }

    public InstallSystemPluginResponse installSystemPlugin(String InstanceId, InstallSystemPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installSystemPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public InstallSystemPluginResponse installSystemPluginWithOptions(String InstanceId, InstallSystemPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InstallSystemPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/plugins/system/actions/install", "json", req, runtime), new InstallSystemPluginResponse());
    }

    public InstallUserPluginsResponse installUserPlugins(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installUserPluginsWithOptions(InstanceId, headers, runtime);
    }

    public InstallUserPluginsResponse installUserPluginsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("InstallUserPlugins", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/plugins/user/actions/install", "json", req, runtime), new InstallUserPluginsResponse());
    }

    public InterruptElasticsearchTaskResponse interruptElasticsearchTask(String InstanceId, InterruptElasticsearchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public InterruptElasticsearchTaskResponse interruptElasticsearchTaskWithOptions(String InstanceId, InterruptElasticsearchTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InterruptElasticsearchTask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/interrupt", "json", req, runtime), new InterruptElasticsearchTaskResponse());
    }

    public InterruptLogstashTaskResponse interruptLogstashTask(String InstanceId, InterruptLogstashTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public InterruptLogstashTaskResponse interruptLogstashTaskWithOptions(String InstanceId, InterruptLogstashTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("InterruptLogstashTask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/interrupt", "json", req, runtime), new InterruptLogstashTaskResponse());
    }

    public ListAckClustersResponse listAckClusters(ListAckClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckClustersWithOptions(request, headers, runtime);
    }

    public ListAckClustersResponse listAckClustersWithOptions(ListAckClustersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAckClusters", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/ack-clusters", "json", req, runtime), new ListAckClustersResponse());
    }

    public ListAckNamespacesResponse listAckNamespaces(String ClusterId, ListAckNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAckNamespacesWithOptions(ClusterId, request, headers, runtime);
    }

    public ListAckNamespacesResponse listAckNamespacesWithOptions(String ClusterId, ListAckNamespacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ClusterId = com.aliyun.openapiutil.Client.getEncodeParam(ClusterId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAckNamespaces", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/ack-clusters/" + ClusterId + "/namespaces", "json", req, runtime), new ListAckNamespacesResponse());
    }

    public ListAllNodeResponse listAllNode(String InstanceId, ListAllNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public ListAllNodeResponse listAllNodeWithOptions(String InstanceId, ListAllNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extended)) {
            query.put("extended", request.extended);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAllNode", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/nodes", "json", req, runtime), new ListAllNodeResponse());
    }

    public ListAlternativeSnapshotReposResponse listAlternativeSnapshotRepos(String InstanceId, ListAlternativeSnapshotReposRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlternativeSnapshotReposWithOptions(InstanceId, request, headers, runtime);
    }

    public ListAlternativeSnapshotReposResponse listAlternativeSnapshotReposWithOptions(String InstanceId, ListAlternativeSnapshotReposRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alreadySetItems)) {
            query.put("alreadySetItems", request.alreadySetItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListAlternativeSnapshotRepos", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/alternative-snapshot-repos", "json", req, runtime), new ListAlternativeSnapshotReposResponse());
    }

    public ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIds(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableEsInstanceIdsWithOptions(InstanceId, headers, runtime);
    }

    public ListAvailableEsInstanceIdsResponse listAvailableEsInstanceIdsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListAvailableEsInstanceIds", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/available-elasticsearch-for-centralized-management", "json", req, runtime), new ListAvailableEsInstanceIdsResponse());
    }

    public ListCollectorsResponse listCollectors(ListCollectorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCollectorsWithOptions(request, headers, runtime);
    }

    public ListCollectorsResponse listCollectorsWithOptions(ListCollectorsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resId)) {
            query.put("resId", request.resId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListCollectors", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/collectors", "json", req, runtime), new ListCollectorsResponse());
    }

    public ListConnectedClustersResponse listConnectedClusters(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConnectedClustersWithOptions(InstanceId, headers, runtime);
    }

    public ListConnectedClustersResponse listConnectedClustersWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListConnectedClusters", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/connected-clusters", "json", req, runtime), new ListConnectedClustersResponse());
    }

    public ListDataStreamsResponse listDataStreams(String InstanceId, ListDataStreamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataStreamsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDataStreamsResponse listDataStreamsWithOptions(String InstanceId, ListDataStreamsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isManaged)) {
            query.put("isManaged", request.isManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDataStreams", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/data-streams", "json", req, runtime), new ListDataStreamsResponse());
    }

    public ListDataTasksResponse listDataTasks(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataTasksWithOptions(InstanceId, headers, runtime);
    }

    public ListDataTasksResponse listDataTasksWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDataTasks", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/data-task", "json", req, runtime), new ListDataTasksResponse());
    }

    public ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDefaultCollectorConfigurationsWithOptions(request, headers, runtime);
    }

    public ListDefaultCollectorConfigurationsResponse listDefaultCollectorConfigurationsWithOptions(ListDefaultCollectorConfigurationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resType)) {
            query.put("resType", request.resType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resVersion)) {
            query.put("resVersion", request.resVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("sourceType", request.sourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDefaultCollectorConfigurations", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/beats/default-configurations", "json", req, runtime), new ListDefaultCollectorConfigurationsResponse());
    }

    public ListDiagnoseIndicesResponse listDiagnoseIndices(String InstanceId, ListDiagnoseIndicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseIndicesResponse listDiagnoseIndicesWithOptions(String InstanceId, ListDiagnoseIndicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDiagnoseIndices", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/indices", "json", req, runtime), new ListDiagnoseIndicesResponse());
    }

    public ListDiagnoseReportResponse listDiagnoseReport(String InstanceId, ListDiagnoseReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseReportResponse listDiagnoseReportWithOptions(String InstanceId, ListDiagnoseReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detail)) {
            query.put("detail", request.detail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDiagnoseReport", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/reports", "json", req, runtime), new ListDiagnoseReportResponse());
    }

    public ListDiagnoseReportIdsResponse listDiagnoseReportIds(String InstanceId, ListDiagnoseReportIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnoseReportIdsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDiagnoseReportIdsResponse listDiagnoseReportIdsWithOptions(String InstanceId, ListDiagnoseReportIdsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDiagnoseReportIds", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/report-ids", "json", req, runtime), new ListDiagnoseReportIdsResponse());
    }

    public ListDictInformationResponse listDictInformation(String InstanceId, ListDictInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictInformationWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDictInformationResponse listDictInformationWithOptions(String InstanceId, ListDictInformationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("bucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.analyzerType)) {
            query.put("analyzerType", request.analyzerType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDictInformation", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dict/_info", "json", req, runtime), new ListDictInformationResponse());
    }

    public ListDictsResponse listDicts(String InstanceId, ListDictsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDictsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDictsResponse listDictsWithOptions(String InstanceId, ListDictsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyzerType)) {
            query.put("analyzerType", request.analyzerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDicts", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dicts", "json", req, runtime), new ListDictsResponse());
    }

    public ListEcsInstancesResponse listEcsInstances(ListEcsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcsInstancesWithOptions(request, headers, runtime);
    }

    public ListEcsInstancesResponse listEcsInstancesWithOptions(ListEcsInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceIds)) {
            query.put("ecsInstanceIds", request.ecsInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceName)) {
            query.put("ecsInstanceName", request.ecsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListEcsInstances", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/ecs", "json", req, runtime), new ListEcsInstancesResponse());
    }

    public ListExtendfilesResponse listExtendfiles(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExtendfilesWithOptions(InstanceId, headers, runtime);
    }

    public ListExtendfilesResponse listExtendfilesWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListExtendfiles", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/extendfiles", "json", req, runtime), new ListExtendfilesResponse());
    }

    public ListILMPoliciesResponse listILMPolicies(String InstanceId, ListILMPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listILMPoliciesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListILMPoliciesResponse listILMPoliciesWithOptions(String InstanceId, ListILMPoliciesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policyName", request.policyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListILMPolicies", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/ilm-policies", "json", req, runtime), new ListILMPoliciesResponse());
    }

    public ListIndexTemplatesResponse listIndexTemplates(String InstanceId, ListIndexTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIndexTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListIndexTemplatesResponse listIndexTemplatesWithOptions(String InstanceId, ListIndexTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indexTemplate)) {
            query.put("indexTemplate", request.indexTemplate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListIndexTemplates", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/index-templates", "json", req, runtime), new ListIndexTemplatesResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceWithOptions(request, headers, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.esVersion)) {
            query.put("esVersion", request.esVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("vpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("zoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("paymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCategory)) {
            query.put("instanceCategory", request.instanceCategory);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstance", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances", "json", req, runtime), new ListInstanceResponse());
    }

    public ListInstanceIndicesResponse listInstanceIndices(String InstanceId, ListInstanceIndicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceIndicesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListInstanceIndicesResponse listInstanceIndicesWithOptions(String InstanceId, ListInstanceIndicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isManaged)) {
            query.put("isManaged", request.isManaged);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpenstore)) {
            query.put("isOpenstore", request.isOpenstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstanceIndices", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/indices", "json", req, runtime), new ListInstanceIndicesResponse());
    }

    public ListKibanaPluginsResponse listKibanaPlugins(String InstanceId, ListKibanaPluginsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKibanaPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListKibanaPluginsResponse listKibanaPluginsWithOptions(String InstanceId, ListKibanaPluginsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListKibanaPlugins", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/kibana-plugins", "json", req, runtime), new ListKibanaPluginsResponse());
    }

    public ListLogstashResponse listLogstash(ListLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashWithOptions(request, headers, runtime);
    }

    public ListLogstashResponse listLogstashWithOptions(ListLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("ownerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLogstash", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes", "json", req, runtime), new ListLogstashResponse());
    }

    public ListLogstashLogResponse listLogstashLog(String InstanceId, ListLogstashLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashLogWithOptions(InstanceId, request, headers, runtime);
    }

    public ListLogstashLogResponse listLogstashLogWithOptions(String InstanceId, ListLogstashLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLogstashLog", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/search-log", "json", req, runtime), new ListLogstashLogResponse());
    }

    public ListLogstashPluginsResponse listLogstashPlugins(String InstanceId, ListLogstashPluginsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogstashPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListLogstashPluginsResponse listLogstashPluginsWithOptions(String InstanceId, ListLogstashPluginsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLogstashPlugins", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/plugins", "json", req, runtime), new ListLogstashPluginsResponse());
    }

    public ListNodesResponse listNodes(String ResId, ListNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodesWithOptions(ResId, request, headers, runtime);
    }

    public ListNodesResponse listNodesWithOptions(String ResId, ListNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceIds)) {
            query.put("ecsInstanceIds", request.ecsInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceName)) {
            query.put("ecsInstanceName", request.ecsInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListNodes", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/collectors/" + ResId + "/nodes", "json", req, runtime), new ListNodesResponse());
    }

    public ListPipelineResponse listPipeline(String InstanceId, ListPipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineWithOptions(InstanceId, request, headers, runtime);
    }

    public ListPipelineResponse listPipelineWithOptions(String InstanceId, ListPipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("pipelineId", request.pipelineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPipeline", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines", "json", req, runtime), new ListPipelineResponse());
    }

    public ListPipelineIdsResponse listPipelineIds(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPipelineIdsWithOptions(InstanceId, headers, runtime);
    }

    public ListPipelineIdsResponse listPipelineIdsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListPipelineIds", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/pipeline-ids", "json", req, runtime), new ListPipelineIdsResponse());
    }

    public ListPluginsResponse listPlugins(String InstanceId, ListPluginsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPluginsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListPluginsResponse listPluginsWithOptions(String InstanceId, ListPluginsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListPlugins", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/plugins", "json", req, runtime), new ListPluginsResponse());
    }

    public ListSearchLogResponse listSearchLog(String InstanceId, ListSearchLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSearchLogWithOptions(InstanceId, request, headers, runtime);
    }

    public ListSearchLogResponse listSearchLogWithOptions(String InstanceId, ListSearchLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("beginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSearchLog", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/search-log", "json", req, runtime), new ListSearchLogResponse());
    }

    public ListShardRecoveriesResponse listShardRecoveries(String InstanceId, ListShardRecoveriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardRecoveriesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListShardRecoveriesResponse listShardRecoveriesWithOptions(String InstanceId, ListShardRecoveriesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activeOnly)) {
            query.put("activeOnly", request.activeOnly);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListShardRecoveries", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/cat-recovery", "json", req, runtime), new ListShardRecoveriesResponse());
    }

    public ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceId(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotReposByInstanceIdWithOptions(InstanceId, headers, runtime);
    }

    public ListSnapshotReposByInstanceIdResponse listSnapshotReposByInstanceIdWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListSnapshotReposByInstanceId", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/snapshot-repos", "json", req, runtime), new ListSnapshotReposByInstanceIdResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTagResources", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/tags", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagsWithOptions(request, headers, runtime);
    }

    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTags", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/tags/all-tags", "json", req, runtime), new ListTagsResponse());
    }

    public ListVpcEndpointsResponse listVpcEndpoints(String InstanceId, ListVpcEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVpcEndpointsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListVpcEndpointsResponse listVpcEndpointsWithOptions(String InstanceId, ListVpcEndpointsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListVpcEndpoints", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/vpc-endpoints", "json", req, runtime), new ListVpcEndpointsResponse());
    }

    public MigrateToOtherZoneResponse migrateToOtherZone(String InstanceId, MigrateToOtherZoneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.migrateToOtherZoneWithOptions(InstanceId, request, headers, runtime);
    }

    public MigrateToOtherZoneResponse migrateToOtherZoneWithOptions(String InstanceId, MigrateToOtherZoneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MigrateToOtherZone", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/migrate-zones", "json", req, runtime), new MigrateToOtherZoneResponse());
    }

    public ModifyDeployMachineResponse modifyDeployMachine(String ResId, ModifyDeployMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDeployMachineWithOptions(ResId, request, headers, runtime);
    }

    public ModifyDeployMachineResponse modifyDeployMachineWithOptions(String ResId, ModifyDeployMachineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyDeployMachine", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/modify-deploy-machines", "json", req, runtime), new ModifyDeployMachineResponse());
    }

    public ModifyElastictaskResponse modifyElastictask(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyElastictaskWithOptions(InstanceId, headers, runtime);
    }

    public ModifyElastictaskResponse modifyElastictaskWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyElastictask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/elastic-task", "json", req, runtime), new ModifyElastictaskResponse());
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTime(String InstanceId, ModifyInstanceMaintainTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceMaintainTimeWithOptions(InstanceId, request, headers, runtime);
    }

    public ModifyInstanceMaintainTimeResponse modifyInstanceMaintainTimeWithOptions(String InstanceId, ModifyInstanceMaintainTimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ModifyInstanceMaintainTime", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/modify-maintaintime", "json", req, runtime), new ModifyInstanceMaintainTimeResponse());
    }

    public ModifyWhiteIpsResponse modifyWhiteIps(String InstanceId, ModifyWhiteIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public ModifyWhiteIpsResponse modifyWhiteIpsWithOptions(String InstanceId, ModifyWhiteIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            body.put("modifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpList)) {
            body.put("whiteIpList", request.whiteIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.whiteIpGroup))) {
            body.put("whiteIpGroup", request.whiteIpGroup);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ModifyWhiteIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/modify-white-ips", "json", req, runtime), new ModifyWhiteIpsResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(String InstanceId, MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveResourceGroupWithOptions(InstanceId, request, headers, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(String InstanceId, MoveResourceGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MoveResourceGroup", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/resourcegroup", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public OpenDiagnosisResponse openDiagnosis(String InstanceId, OpenDiagnosisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openDiagnosisWithOptions(InstanceId, request, headers, runtime);
    }

    public OpenDiagnosisResponse openDiagnosisWithOptions(String InstanceId, OpenDiagnosisRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("OpenDiagnosis", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/actions/open-diagnosis", "json", req, runtime), new OpenDiagnosisResponse());
    }

    public OpenHttpsResponse openHttps(String InstanceId, OpenHttpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openHttpsWithOptions(InstanceId, request, headers, runtime);
    }

    public OpenHttpsResponse openHttpsWithOptions(String InstanceId, OpenHttpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("OpenHttps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/open-https", "json", req, runtime), new OpenHttpsResponse());
    }

    public PostEmonTryAlarmRuleResponse postEmonTryAlarmRule(String ProjectId, String AlarmGroupId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postEmonTryAlarmRuleWithOptions(ProjectId, AlarmGroupId, headers, runtime);
    }

    public PostEmonTryAlarmRuleResponse postEmonTryAlarmRuleWithOptions(String ProjectId, String AlarmGroupId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ProjectId = com.aliyun.openapiutil.Client.getEncodeParam(ProjectId);
        AlarmGroupId = com.aliyun.openapiutil.Client.getEncodeParam(AlarmGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PostEmonTryAlarmRule", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/emon/projects/" + ProjectId + "/alarm-groups/" + AlarmGroupId + "/alarm-rules/_test", "json", req, runtime), new PostEmonTryAlarmRuleResponse());
    }

    public RecommendTemplatesResponse recommendTemplates(String InstanceId, RecommendTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recommendTemplatesWithOptions(InstanceId, request, headers, runtime);
    }

    public RecommendTemplatesResponse recommendTemplatesWithOptions(String InstanceId, RecommendTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.usageScenario)) {
            query.put("usageScenario", request.usageScenario);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RecommendTemplates", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/recommended-templates", "json", req, runtime), new RecommendTemplatesResponse());
    }

    public ReinstallCollectorResponse reinstallCollector(String ResId, ReinstallCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinstallCollectorWithOptions(ResId, request, headers, runtime);
    }

    public ReinstallCollectorResponse reinstallCollectorWithOptions(String ResId, ReinstallCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ReinstallCollector", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/reinstall", "json", req, runtime), new ReinstallCollectorResponse());
    }

    public RenewInstanceResponse renewInstance(String InstanceId, RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(String InstanceId, RenewInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RenewInstance", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/renew", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewLogstashResponse renewLogstash(String InstanceId, RenewLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public RenewLogstashResponse renewLogstashWithOptions(String InstanceId, RenewLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RenewLogstash", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/renew", "json", req, runtime), new RenewLogstashResponse());
    }

    public RestartCollectorResponse restartCollector(String ResId, RestartCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartCollectorWithOptions(ResId, request, headers, runtime);
    }

    public RestartCollectorResponse restartCollectorWithOptions(String ResId, RestartCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RestartCollector", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/restart", "json", req, runtime), new RestartCollectorResponse());
    }

    public RestartInstanceResponse restartInstance(String InstanceId, RestartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(String InstanceId, RestartInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RestartInstance", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/restart", "json", req, runtime), new RestartInstanceResponse());
    }

    public RestartLogstashResponse restartLogstash(String InstanceId, RestartLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public RestartLogstashResponse restartLogstashWithOptions(String InstanceId, RestartLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RestartLogstash", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/restart", "json", req, runtime), new RestartLogstashResponse());
    }

    public ResumeElasticsearchTaskResponse resumeElasticsearchTask(String InstanceId, ResumeElasticsearchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeElasticsearchTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public ResumeElasticsearchTaskResponse resumeElasticsearchTaskWithOptions(String InstanceId, ResumeElasticsearchTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ResumeElasticsearchTask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/resume", "json", req, runtime), new ResumeElasticsearchTaskResponse());
    }

    public ResumeLogstashTaskResponse resumeLogstashTask(String InstanceId, ResumeLogstashTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeLogstashTaskWithOptions(InstanceId, request, headers, runtime);
    }

    public ResumeLogstashTaskResponse resumeLogstashTaskWithOptions(String InstanceId, ResumeLogstashTaskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ResumeLogstashTask", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/resume", "json", req, runtime), new ResumeLogstashTaskResponse());
    }

    public RolloverDataStreamResponse rolloverDataStream(String InstanceId, String DataStream, RolloverDataStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rolloverDataStreamWithOptions(InstanceId, DataStream, request, headers, runtime);
    }

    public RolloverDataStreamResponse rolloverDataStreamWithOptions(String InstanceId, String DataStream, RolloverDataStreamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        DataStream = com.aliyun.openapiutil.Client.getEncodeParam(DataStream);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RolloverDataStream", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/data-streams/" + DataStream + "/rollover", "json", req, runtime), new RolloverDataStreamResponse());
    }

    public RunPipelinesResponse runPipelines(String InstanceId, RunPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public RunPipelinesResponse runPipelinesWithOptions(String InstanceId, RunPipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("RunPipelines", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines/action/run", "json", req, runtime), new RunPipelinesResponse());
    }

    public ShrinkNodeResponse shrinkNode(String InstanceId, ShrinkNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.shrinkNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public ShrinkNodeResponse shrinkNodeWithOptions(String InstanceId, ShrinkNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ShrinkNode", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/shrink", "json", req, runtime), new ShrinkNodeResponse());
    }

    public StartCollectorResponse startCollector(String ResId, StartCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startCollectorWithOptions(ResId, request, headers, runtime);
    }

    public StartCollectorResponse startCollectorWithOptions(String ResId, StartCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StartCollector", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/start", "json", req, runtime), new StartCollectorResponse());
    }

    public StopCollectorResponse stopCollector(String ResId, StopCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopCollectorWithOptions(ResId, request, headers, runtime);
    }

    public StopCollectorResponse stopCollectorWithOptions(String ResId, StopCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopCollector", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/stop", "json", req, runtime), new StopCollectorResponse());
    }

    public StopPipelinesResponse stopPipelines(String InstanceId, StopPipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopPipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public StopPipelinesResponse stopPipelinesWithOptions(String InstanceId, StopPipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("StopPipelines", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines/action/stop", "json", req, runtime), new StopPipelinesResponse());
    }

    public TagResourcesResponse tagResources() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("TagResources", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/tags", "json", req, runtime), new TagResourcesResponse());
    }

    public TransferNodeResponse transferNode(String InstanceId, TransferNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferNodeWithOptions(InstanceId, request, headers, runtime);
    }

    public TransferNodeResponse transferNodeWithOptions(String InstanceId, TransferNodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TransferNode", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/transfer", "json", req, runtime), new TransferNodeResponse());
    }

    public TriggerNetworkResponse triggerNetwork(String InstanceId, TriggerNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.triggerNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    public TriggerNetworkResponse triggerNetworkWithOptions(String InstanceId, TriggerNetworkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            body.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            body.put("actionType", request.actionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("TriggerNetwork", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/network-trigger", "json", req, runtime), new TriggerNetworkResponse());
    }

    public UninstallKibanaPluginResponse uninstallKibanaPlugin(String InstanceId, UninstallKibanaPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallKibanaPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallKibanaPluginResponse uninstallKibanaPluginWithOptions(String InstanceId, UninstallKibanaPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UninstallKibanaPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/kibana-plugins/actions/uninstall", "json", req, runtime), new UninstallKibanaPluginResponse());
    }

    public UninstallLogstashPluginResponse uninstallLogstashPlugin(String InstanceId, UninstallLogstashPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallLogstashPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallLogstashPluginResponse uninstallLogstashPluginWithOptions(String InstanceId, UninstallLogstashPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UninstallLogstashPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/plugins/actions/uninstall", "json", req, runtime), new UninstallLogstashPluginResponse());
    }

    public UninstallPluginResponse uninstallPlugin(String InstanceId, UninstallPluginRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallPluginWithOptions(InstanceId, request, headers, runtime);
    }

    public UninstallPluginResponse uninstallPluginWithOptions(String InstanceId, UninstallPluginRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UninstallPlugin", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/plugins/actions/uninstall", "json", req, runtime), new UninstallPluginResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UntagResources", "2017-06-13", "HTTPS", "DELETE", "AK", "/openapi/tags", "json", req, runtime), new UntagResourcesResponse());
    }

    public UpdateAdminPasswordResponse updateAdminPassword(String InstanceId, UpdateAdminPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdminPasswordWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateAdminPasswordResponse updateAdminPasswordWithOptions(String InstanceId, UpdateAdminPasswordRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAdminPassword", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/admin-pwd", "json", req, runtime), new UpdateAdminPasswordResponse());
    }

    public UpdateAdvancedSettingResponse updateAdvancedSetting(String InstanceId, UpdateAdvancedSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAdvancedSettingWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateAdvancedSettingResponse updateAdvancedSettingWithOptions(String InstanceId, UpdateAdvancedSettingRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAdvancedSetting", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/update-advanced-setting", "json", req, runtime), new UpdateAdvancedSettingResponse());
    }

    public UpdateAliwsDictResponse updateAliwsDict(String InstanceId, UpdateAliwsDictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAliwsDictWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateAliwsDictResponse updateAliwsDictWithOptions(String InstanceId, UpdateAliwsDictRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAliwsDict", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/aliws-dict", "json", req, runtime), new UpdateAliwsDictResponse());
    }

    public UpdateBlackIpsResponse updateBlackIps(String InstanceId, UpdateBlackIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlackIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateBlackIpsResponse updateBlackIpsWithOptions(String InstanceId, UpdateBlackIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.esIPBlacklist)) {
            body.put("esIPBlacklist", request.esIPBlacklist);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateBlackIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/black-ips", "json", req, runtime), new UpdateBlackIpsResponse());
    }

    public UpdateCollectorResponse updateCollector(String ResId, UpdateCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorWithOptions(ResId, request, headers, runtime);
    }

    public UpdateCollectorResponse updateCollectorWithOptions(String ResId, UpdateCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateCollector", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/collectors/" + ResId + "", "json", req, runtime), new UpdateCollectorResponse());
    }

    public UpdateCollectorNameResponse updateCollectorName(String ResId, UpdateCollectorNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCollectorNameWithOptions(ResId, request, headers, runtime);
    }

    public UpdateCollectorNameResponse updateCollectorNameWithOptions(String ResId, UpdateCollectorNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ResId = com.aliyun.openapiutil.Client.getEncodeParam(ResId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateCollectorName", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/collectors/" + ResId + "/actions/rename", "json", req, runtime), new UpdateCollectorNameResponse());
    }

    public UpdateDescriptionResponse updateDescription(String InstanceId, UpdateDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDescriptionWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateDescriptionResponse updateDescriptionWithOptions(String InstanceId, UpdateDescriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateDescription", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/description", "json", req, runtime), new UpdateDescriptionResponse());
    }

    public UpdateDiagnosisSettingsResponse updateDiagnosisSettings(String InstanceId, UpdateDiagnosisSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDiagnosisSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateDiagnosisSettingsResponse updateDiagnosisSettingsWithOptions(String InstanceId, UpdateDiagnosisSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("lang", request.lang);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateDiagnosisSettings", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/diagnosis/instances/" + InstanceId + "/settings", "json", req, runtime), new UpdateDiagnosisSettingsResponse());
    }

    public UpdateDictResponse updateDict(String InstanceId, UpdateDictRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDictWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateDictResponse updateDictWithOptions(String InstanceId, UpdateDictRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateDict", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/dict", "json", req, runtime), new UpdateDictResponse());
    }

    public UpdateExtendConfigResponse updateExtendConfig(String InstanceId, UpdateExtendConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExtendConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateExtendConfigResponse updateExtendConfigWithOptions(String InstanceId, UpdateExtendConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateExtendConfig", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/extend-configs/actions/update", "json", req, runtime), new UpdateExtendConfigResponse());
    }

    public UpdateExtendfilesResponse updateExtendfiles(String InstanceId, UpdateExtendfilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateExtendfilesWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateExtendfilesResponse updateExtendfilesWithOptions(String InstanceId, UpdateExtendfilesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateExtendfiles", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/logstashes/" + InstanceId + "/extendfiles", "json", req, runtime), new UpdateExtendfilesResponse());
    }

    public UpdateHotIkDictsResponse updateHotIkDicts(String InstanceId, UpdateHotIkDictsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateHotIkDictsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateHotIkDictsResponse updateHotIkDictsWithOptions(String InstanceId, UpdateHotIkDictsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateHotIkDicts", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/ik-hot-dict", "json", req, runtime), new UpdateHotIkDictsResponse());
    }

    public UpdateILMPolicyResponse updateILMPolicy(String InstanceId, String PolicyName, UpdateILMPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateILMPolicyWithOptions(InstanceId, PolicyName, request, headers, runtime);
    }

    public UpdateILMPolicyResponse updateILMPolicyWithOptions(String InstanceId, String PolicyName, UpdateILMPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        PolicyName = com.aliyun.openapiutil.Client.getEncodeParam(PolicyName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateILMPolicy", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/ilm-policies/" + PolicyName + "", "json", req, runtime), new UpdateILMPolicyResponse());
    }

    public UpdateIndexTemplateResponse updateIndexTemplate(String InstanceId, String IndexTemplate, UpdateIndexTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIndexTemplateWithOptions(InstanceId, IndexTemplate, request, headers, runtime);
    }

    public UpdateIndexTemplateResponse updateIndexTemplateWithOptions(String InstanceId, String IndexTemplate, UpdateIndexTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        IndexTemplate = com.aliyun.openapiutil.Client.getEncodeParam(IndexTemplate);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateIndexTemplate", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/index-templates/" + IndexTemplate + "", "json", req, runtime), new UpdateIndexTemplateResponse());
    }

    public UpdateInstanceResponse updateInstance(String InstanceId, UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(String InstanceId, UpdateInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderActionType)) {
            query.put("orderActionType", request.orderActionType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateInstance", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "", "json", req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceChargeTypeResponse updateInstanceChargeType(String InstanceId, UpdateInstanceChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateInstanceChargeTypeResponse updateInstanceChargeTypeWithOptions(String InstanceId, UpdateInstanceChargeTypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateInstanceChargeType", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/convert-pay-type", "json", req, runtime), new UpdateInstanceChargeTypeResponse());
    }

    public UpdateInstanceSettingsResponse updateInstanceSettings(String InstanceId, UpdateInstanceSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateInstanceSettingsResponse updateInstanceSettingsWithOptions(String InstanceId, UpdateInstanceSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateInstanceSettings", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/instance-settings", "json", req, runtime), new UpdateInstanceSettingsResponse());
    }

    public UpdateKibanaSettingsResponse updateKibanaSettings(String InstanceId, UpdateKibanaSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateKibanaSettingsResponse updateKibanaSettingsWithOptions(String InstanceId, UpdateKibanaSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateKibanaSettings", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/update-kibana-settings", "json", req, runtime), new UpdateKibanaSettingsResponse());
    }

    public UpdateKibanaWhiteIpsResponse updateKibanaWhiteIps(String InstanceId, UpdateKibanaWhiteIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKibanaWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateKibanaWhiteIpsResponse updateKibanaWhiteIpsWithOptions(String InstanceId, UpdateKibanaWhiteIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateKibanaWhiteIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/kibana-white-ips", "json", req, runtime), new UpdateKibanaWhiteIpsResponse());
    }

    public UpdateLogstashResponse updateLogstash(String InstanceId, UpdateLogstashRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashResponse updateLogstashWithOptions(String InstanceId, UpdateLogstashRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateLogstash", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/logstashes/" + InstanceId + "", "json", req, runtime), new UpdateLogstashResponse());
    }

    public UpdateLogstashChargeTypeResponse updateLogstashChargeType(String InstanceId, UpdateLogstashChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashChargeTypeWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashChargeTypeResponse updateLogstashChargeTypeWithOptions(String InstanceId, UpdateLogstashChargeTypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateLogstashChargeType", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/actions/convert-pay-type", "json", req, runtime), new UpdateLogstashChargeTypeResponse());
    }

    public UpdateLogstashDescriptionResponse updateLogstashDescription(String InstanceId, UpdateLogstashDescriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashDescriptionWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashDescriptionResponse updateLogstashDescriptionWithOptions(String InstanceId, UpdateLogstashDescriptionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateLogstashDescription", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/description", "json", req, runtime), new UpdateLogstashDescriptionResponse());
    }

    public UpdateLogstashSettingsResponse updateLogstashSettings(String InstanceId, UpdateLogstashSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogstashSettingsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateLogstashSettingsResponse updateLogstashSettingsWithOptions(String InstanceId, UpdateLogstashSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateLogstashSettings", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/instance-settings", "json", req, runtime), new UpdateLogstashSettingsResponse());
    }

    public UpdatePipelineManagementConfigResponse updatePipelineManagementConfig(String InstanceId, UpdatePipelineManagementConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelineManagementConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePipelineManagementConfigResponse updatePipelineManagementConfigWithOptions(String InstanceId, UpdatePipelineManagementConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePipelineManagementConfig", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/pipeline-management-config", "json", req, runtime), new UpdatePipelineManagementConfigResponse());
    }

    public UpdatePipelinesResponse updatePipelines(String InstanceId, UpdatePipelinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePipelinesWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePipelinesResponse updatePipelinesWithOptions(String InstanceId, UpdatePipelinesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("trigger", request.trigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePipelines", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/logstashes/" + InstanceId + "/pipelines", "json", req, runtime), new UpdatePipelinesResponse());
    }

    public UpdatePrivateNetworkWhiteIpsResponse updatePrivateNetworkWhiteIps(String InstanceId, UpdatePrivateNetworkWhiteIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivateNetworkWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePrivateNetworkWhiteIpsResponse updatePrivateNetworkWhiteIpsWithOptions(String InstanceId, UpdatePrivateNetworkWhiteIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePrivateNetworkWhiteIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/private-network-white-ips", "json", req, runtime), new UpdatePrivateNetworkWhiteIpsResponse());
    }

    public UpdatePublicNetworkResponse updatePublicNetwork(String InstanceId, UpdatePublicNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicNetworkWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePublicNetworkResponse updatePublicNetworkWithOptions(String InstanceId, UpdatePublicNetworkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePublicNetwork", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/public-network", "json", req, runtime), new UpdatePublicNetworkResponse());
    }

    public UpdatePublicWhiteIpsResponse updatePublicWhiteIps(String InstanceId, UpdatePublicWhiteIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePublicWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdatePublicWhiteIpsResponse updatePublicWhiteIpsWithOptions(String InstanceId, UpdatePublicWhiteIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdatePublicWhiteIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/public-white-ips", "json", req, runtime), new UpdatePublicWhiteIpsResponse());
    }

    public UpdateReadWritePolicyResponse updateReadWritePolicy(String InstanceId, UpdateReadWritePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReadWritePolicyWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateReadWritePolicyResponse updateReadWritePolicyWithOptions(String InstanceId, UpdateReadWritePolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateReadWritePolicy", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/update-read-write-policy", "json", req, runtime), new UpdateReadWritePolicyResponse());
    }

    public UpdateSnapshotSettingResponse updateSnapshotSetting(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSnapshotSettingWithOptions(InstanceId, headers, runtime);
    }

    public UpdateSnapshotSettingResponse updateSnapshotSettingWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSnapshotSetting", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/snapshot-setting", "json", req, runtime), new UpdateSnapshotSettingResponse());
    }

    public UpdateSynonymsDictsResponse updateSynonymsDicts(String InstanceId, UpdateSynonymsDictsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSynonymsDictsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateSynonymsDictsResponse updateSynonymsDictsWithOptions(String InstanceId, UpdateSynonymsDictsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateSynonymsDicts", "2017-06-13", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/synonymsDict", "json", req, runtime), new UpdateSynonymsDictsResponse());
    }

    public UpdateTemplateResponse updateTemplate(String InstanceId, String TemplateName, UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTemplateWithOptions(InstanceId, TemplateName, request, headers, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(String InstanceId, String TemplateName, UpdateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        TemplateName = com.aliyun.openapiutil.Client.getEncodeParam(TemplateName);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateTemplate", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/templates/" + TemplateName + "", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateWhiteIpsResponse updateWhiteIps(String InstanceId, UpdateWhiteIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWhiteIpsWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateWhiteIpsResponse updateWhiteIpsWithOptions(String InstanceId, UpdateWhiteIpsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("modifyMode", request.modifyMode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.esIPWhitelist)) {
            body.put("esIPWhitelist", request.esIPWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.whiteIpGroup))) {
            body.put("whiteIpGroup", request.whiteIpGroup);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpdateWhiteIps", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/white-ips", "json", req, runtime), new UpdateWhiteIpsResponse());
    }

    public UpdateXpackMonitorConfigResponse updateXpackMonitorConfig(String InstanceId, UpdateXpackMonitorConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXpackMonitorConfigWithOptions(InstanceId, request, headers, runtime);
    }

    public UpdateXpackMonitorConfigResponse updateXpackMonitorConfigWithOptions(String InstanceId, UpdateXpackMonitorConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateXpackMonitorConfig", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/xpack-monitor-config", "json", req, runtime), new UpdateXpackMonitorConfigResponse());
    }

    public UpgradeEngineVersionResponse upgradeEngineVersion(String InstanceId, UpgradeEngineVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeEngineVersionWithOptions(InstanceId, request, headers, runtime);
    }

    public UpgradeEngineVersionResponse upgradeEngineVersionWithOptions(String InstanceId, UpgradeEngineVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("dryRun", request.dryRun);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("UpgradeEngineVersion", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/upgrade-version", "json", req, runtime), new UpgradeEngineVersionResponse());
    }

    public ValidateConnectionResponse validateConnection(String InstanceId, ValidateConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateConnectionWithOptions(InstanceId, request, headers, runtime);
    }

    public ValidateConnectionResponse validateConnectionWithOptions(String InstanceId, ValidateConnectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateConnection", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/logstashes/" + InstanceId + "/validate-connection", "json", req, runtime), new ValidateConnectionResponse());
    }

    public ValidateShrinkNodesResponse validateShrinkNodes(String InstanceId, ValidateShrinkNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateShrinkNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public ValidateShrinkNodesResponse validateShrinkNodesWithOptions(String InstanceId, ValidateShrinkNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreStatus)) {
            query.put("ignoreStatus", request.ignoreStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateShrinkNodes", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/validate-shrink-nodes", "json", req, runtime), new ValidateShrinkNodesResponse());
    }

    public ValidateSlrPermissionResponse validateSlrPermission(ValidateSlrPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateSlrPermissionWithOptions(request, headers, runtime);
    }

    public ValidateSlrPermissionResponse validateSlrPermissionWithOptions(ValidateSlrPermissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolename)) {
            query.put("rolename", request.rolename);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateSlrPermission", "2017-06-13", "HTTPS", "GET", "AK", "/openapi/user/servicerolepermission", "json", req, runtime), new ValidateSlrPermissionResponse());
    }

    public ValidateTransferableNodesResponse validateTransferableNodes(String InstanceId, ValidateTransferableNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateTransferableNodesWithOptions(InstanceId, request, headers, runtime);
    }

    public ValidateTransferableNodesResponse validateTransferableNodesWithOptions(String InstanceId, ValidateTransferableNodesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        InstanceId = com.aliyun.openapiutil.Client.getEncodeParam(InstanceId);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("nodeType", request.nodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ValidateTransferableNodes", "2017-06-13", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/validate-transfer-nodes", "json", req, runtime), new ValidateTransferableNodesResponse());
    }
}
