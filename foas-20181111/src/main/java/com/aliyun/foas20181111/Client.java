// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111;

import com.aliyun.tea.*;
import com.aliyun.foas20181111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "foas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "foas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "foas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "foas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "foas.aliyuncs.com"),
            new TeaPair("cn-fujian", "foas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "foas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "foas.aliyuncs.com"),
            new TeaPair("cn-hongkong", "foas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "foas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "foas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "foas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "foas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "foas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "foas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "foas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "foas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "foas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "foas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "foas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "foas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "foas.aliyuncs.com"),
            new TeaPair("eu-central-1", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "foas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "foas.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("foas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddTaskJobResponse addTaskJobWithOptions(String projectName, String tasksId, AddTaskJobRequest request, AddTaskJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("nodeIds", request.nodeIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTaskJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(tasksId) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTaskJobResponse());
    }

    public AddTaskJobResponse addTaskJob(String projectName, String tasksId, AddTaskJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddTaskJobHeaders headers = new AddTaskJobHeaders();
        return this.addTaskJobWithOptions(projectName, tasksId, request, headers, runtime);
    }

    public AddWhitelistUserResponse addWhitelistUserWithOptions(AddWhitelistUserRequest request, AddWhitelistUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWhitelistUser"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/whitelist/add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWhitelistUserResponse());
    }

    public AddWhitelistUserResponse addWhitelistUser(AddWhitelistUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWhitelistUserHeaders headers = new AddWhitelistUserHeaders();
        return this.addWhitelistUserWithOptions(request, headers, runtime);
    }

    public BatchGetInstanceRunSummaryResponse batchGetInstanceRunSummaryWithOptions(String projectName, BatchGetInstanceRunSummaryRequest request, BatchGetInstanceRunSummaryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobNames)) {
            query.put("jobNames", request.jobNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetInstanceRunSummary"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/runsummary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetInstanceRunSummaryResponse());
    }

    public BatchGetInstanceRunSummaryResponse batchGetInstanceRunSummary(String projectName, BatchGetInstanceRunSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchGetInstanceRunSummaryHeaders headers = new BatchGetInstanceRunSummaryHeaders();
        return this.batchGetInstanceRunSummaryWithOptions(projectName, request, headers, runtime);
    }

    public BindQueueResponse bindQueueWithOptions(String projectName, BindQueueRequest request, BindQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/queue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindQueueResponse());
    }

    public BindQueueResponse bindQueue(String projectName, BindQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BindQueueHeaders headers = new BindQueueHeaders();
        return this.bindQueueWithOptions(projectName, request, headers, runtime);
    }

    public CalcPlanJsonResourceResponse calcPlanJsonResourceWithOptions(String projectName, String jobName, CalcPlanJsonResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CalcPlanJsonResource"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/planjson-resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CalcPlanJsonResourceResponse());
    }

    public CalcPlanJsonResourceResponse calcPlanJsonResource(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CalcPlanJsonResourceHeaders headers = new CalcPlanJsonResourceHeaders();
        return this.calcPlanJsonResourceWithOptions(projectName, jobName, headers, runtime);
    }

    public CheckRawPlanJsonResponse checkRawPlanJsonWithOptions(String projectName, String jobName, CheckRawPlanJsonRequest request, CheckRawPlanJsonHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRawPlanJson"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/planjson/check"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRawPlanJsonResponse());
    }

    public CheckRawPlanJsonResponse checkRawPlanJson(String projectName, String jobName, CheckRawPlanJsonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckRawPlanJsonHeaders headers = new CheckRawPlanJsonHeaders();
        return this.checkRawPlanJsonWithOptions(projectName, jobName, request, headers, runtime);
    }

    public CommitJobResponse commitJobWithOptions(String projectName, String jobName, CommitJobRequest request, CommitJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configure)) {
            body.put("configure", request.configure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOnOff)) {
            body.put("isOnOff", request.isOnOff);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCU)) {
            body.put("maxCU", request.maxCU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendOnly)) {
            body.put("recommendOnly", request.recommendOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspendPeriodParam)) {
            body.put("suspendPeriodParam", request.suspendPeriodParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspendPeriods)) {
            body.put("suspendPeriods", request.suspendPeriods);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommitJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/commit"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommitJobResponse());
    }

    public CommitJobResponse commitJob(String projectName, String jobName, CommitJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommitJobHeaders headers = new CommitJobHeaders();
        return this.commitJobWithOptions(projectName, jobName, request, headers, runtime);
    }

    public CreateCellClusterOrderResponse createCellClusterOrderWithOptions(CreateCellClusterOrderRequest request, CreateCellClusterOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.masterNum)) {
            body.put("masterNum", request.masterNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterSpec)) {
            body.put("masterSpec", request.masterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payModel)) {
            body.put("payModel", request.payModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveNum)) {
            body.put("slaveNum", request.slaveNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaveSpec)) {
            body.put("slaveSpec", request.slaveSpec);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCellClusterOrder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/realtime-compute/cell/buy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCellClusterOrderResponse());
    }

    public CreateCellClusterOrderResponse createCellClusterOrder(CreateCellClusterOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateCellClusterOrderHeaders headers = new CreateCellClusterOrderHeaders();
        return this.createCellClusterOrderWithOptions(request, headers, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, CreateClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("orderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userOssBucket)) {
            body.put("userOssBucket", request.userOssBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVSwitch)) {
            body.put("userVSwitch", request.userVSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpcId)) {
            body.put("userVpcId", request.userVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("zoneId", request.zoneId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateClusterHeaders headers = new CreateClusterHeaders();
        return this.createClusterWithOptions(request, headers, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(String projectName, CreateFolderRequest request, CreateFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/folders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolder(String projectName, CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateFolderHeaders headers = new CreateFolderHeaders();
        return this.createFolderWithOptions(projectName, request, headers, runtime);
    }

    public CreateJobResponse createJobWithOptions(String projectName, CreateJobRequest request, CreateJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            body.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            body.put("engineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("jobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packages)) {
            body.put("packages", request.packages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planJson)) {
            body.put("planJson", request.planJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    public CreateJobResponse createJob(String projectName, CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateJobHeaders headers = new CreateJobHeaders();
        return this.createJobWithOptions(projectName, request, headers, runtime);
    }

    public CreatePackageResponse createPackageWithOptions(String projectName, CreatePackageRequest request, CreatePackageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            body.put("md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originName)) {
            body.put("originName", request.originName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            body.put("ossBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            body.put("ossEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossOwner)) {
            body.put("ossOwner", request.ossOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            body.put("ossPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            body.put("packageName", request.packageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePackage"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePackageResponse());
    }

    public CreatePackageResponse createPackage(String projectName, CreatePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatePackageHeaders headers = new CreatePackageHeaders();
        return this.createPackageWithOptions(projectName, request, headers, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, CreateProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            body.put("deployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerIds)) {
            body.put("managerIds", request.managerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("orderId", request.orderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateProjectHeaders headers = new CreateProjectHeaders();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    public CreateQueueResponse createQueueWithOptions(String clusterId, CreateQueueRequest request, CreateQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gpu)) {
            body.put("gpu", request.gpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMemMB)) {
            body.put("maxMemMB", request.maxMemMB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxVcore)) {
            body.put("maxVcore", request.maxVcore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/queue"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueueResponse());
    }

    public CreateQueueResponse createQueue(String clusterId, CreateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateQueueHeaders headers = new CreateQueueHeaders();
        return this.createQueueWithOptions(clusterId, request, headers, runtime);
    }

    public CreateTaskResponse createTaskWithOptions(String projectName, CreateTaskRequest request, CreateTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNamespace)) {
            body.put("targetNamespace", request.targetNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            body.put("targetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWorkspace)) {
            body.put("targetWorkspace", request.targetWorkspace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferType)) {
            body.put("transferType", request.transferType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    public CreateTaskResponse createTask(String projectName, CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTaskHeaders headers = new CreateTaskHeaders();
        return this.createTaskWithOptions(projectName, request, headers, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(String projectName, DeleteFolderRequest request, DeleteFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/folders"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolder(String projectName, DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFolderHeaders headers = new DeleteFolderHeaders();
        return this.deleteFolderWithOptions(projectName, request, headers, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(String projectName, String jobName, DeleteJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
    }

    public DeleteJobResponse deleteJob(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteJobHeaders headers = new DeleteJobHeaders();
        return this.deleteJobWithOptions(projectName, jobName, headers, runtime);
    }

    public DeletePackageResponse deletePackageWithOptions(String projectName, String packageName, DeletePackageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePackage"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages/" + com.aliyun.openapiutil.Client.getEncodeParam(packageName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePackageResponse());
    }

    public DeletePackageResponse deletePackage(String projectName, String packageName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeletePackageHeaders headers = new DeletePackageHeaders();
        return this.deletePackageWithOptions(projectName, packageName, headers, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(String projectName, DeleteProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteProjectHeaders headers = new DeleteProjectHeaders();
        return this.deleteProjectWithOptions(projectName, headers, runtime);
    }

    public DeleteQueueResponse deleteQueueWithOptions(String clusterId, DeleteQueueRequest request, DeleteQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/queue"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueueResponse());
    }

    public DeleteQueueResponse deleteQueue(String clusterId, DeleteQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteQueueHeaders headers = new DeleteQueueHeaders();
        return this.deleteQueueWithOptions(clusterId, request, headers, runtime);
    }

    public DeleteTaskJobResponse deleteTaskJobWithOptions(String projectName, String tasksId, DeleteTaskJobRequest tmpReq, DeleteTaskJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTaskJobShrinkRequest request = new DeleteTaskJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "jobIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            query.put("jobIds", request.jobIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTaskJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(tasksId) + "/jobs"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskJobResponse());
    }

    public DeleteTaskJobResponse deleteTaskJob(String projectName, String tasksId, DeleteTaskJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTaskJobHeaders headers = new DeleteTaskJobHeaders();
        return this.deleteTaskJobWithOptions(projectName, tasksId, request, headers, runtime);
    }

    public DeleteWhitelistUserResponse deleteWhitelistUserWithOptions(DeleteWhitelistUserRequest request, DeleteWhitelistUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWhitelistUser"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/whitelist/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWhitelistUserResponse());
    }

    public DeleteWhitelistUserResponse deleteWhitelistUser(DeleteWhitelistUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWhitelistUserHeaders headers = new DeleteWhitelistUserHeaders();
        return this.deleteWhitelistUserWithOptions(request, headers, runtime);
    }

    public DestroyClusterResponse destroyClusterWithOptions(String clusterId, DestroyClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyCluster"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyClusterResponse());
    }

    public DestroyClusterResponse destroyCluster(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DestroyClusterHeaders headers = new DestroyClusterHeaders();
        return this.destroyClusterWithOptions(clusterId, headers, runtime);
    }

    public ExpandClusterResponse expandClusterWithOptions(String clusterId, ExpandClusterRequest request, ExpandClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVSwitch)) {
            body.put("userVSwitch", request.userVSwitch);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpandCluster"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/expand"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpandClusterResponse());
    }

    public ExpandClusterResponse expandCluster(String clusterId, ExpandClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExpandClusterHeaders headers = new ExpandClusterHeaders();
        return this.expandClusterWithOptions(clusterId, request, headers, runtime);
    }

    public GetClusterDetailsResponse getClusterDetailsWithOptions(String clusterId, GetClusterDetailsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterDetails"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterDetailsResponse());
    }

    public GetClusterDetailsResponse getClusterDetails(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetClusterDetailsHeaders headers = new GetClusterDetailsHeaders();
        return this.getClusterDetailsWithOptions(clusterId, headers, runtime);
    }

    public GetClusterEngineVersionsResponse getClusterEngineVersionsWithOptions(String clusterId, GetClusterEngineVersionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterEngineVersions"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/engineversions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterEngineVersionsResponse());
    }

    public GetClusterEngineVersionsResponse getClusterEngineVersions(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetClusterEngineVersionsHeaders headers = new GetClusterEngineVersionsHeaders();
        return this.getClusterEngineVersionsWithOptions(clusterId, headers, runtime);
    }

    public GetClusterMetricsResponse getClusterMetricsWithOptions(String clusterId, GetClusterMetricsRequest request, GetClusterMetricsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricJson)) {
            body.put("metricJson", request.metricJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterMetrics"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/metrics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterMetricsResponse());
    }

    public GetClusterMetricsResponse getClusterMetrics(String clusterId, GetClusterMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetClusterMetricsHeaders headers = new GetClusterMetricsHeaders();
        return this.getClusterMetricsWithOptions(clusterId, request, headers, runtime);
    }

    public GetClusterQueueInfoResponse getClusterQueueInfoWithOptions(String clusterId, GetClusterQueueInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterQueueInfo"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/queueinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterQueueInfoResponse());
    }

    public GetClusterQueueInfoResponse getClusterQueueInfo(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetClusterQueueInfoHeaders headers = new GetClusterQueueInfoHeaders();
        return this.getClusterQueueInfoWithOptions(clusterId, headers, runtime);
    }

    public GetClusterResourceResponse getClusterResourceWithOptions(String clusterId, GetClusterResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterResource"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResourceResponse());
    }

    public GetClusterResourceResponse getClusterResource(String clusterId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetClusterResourceHeaders headers = new GetClusterResourceHeaders();
        return this.getClusterResourceWithOptions(clusterId, headers, runtime);
    }

    public GetFolderResponse getFolderWithOptions(String projectName, GetFolderRequest request, GetFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/folders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolder(String projectName, GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFolderHeaders headers = new GetFolderHeaders();
        return this.getFolderWithOptions(projectName, request, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String projectName, String jobName, String instanceId, GetInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceHeaders headers = new GetInstanceHeaders();
        return this.getInstanceWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceCheckpointResponse getInstanceCheckpointWithOptions(String projectName, String jobName, String instanceId, GetInstanceCheckpointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceCheckpoint"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/checkpoints"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceCheckpointResponse());
    }

    public GetInstanceCheckpointResponse getInstanceCheckpoint(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceCheckpointHeaders headers = new GetInstanceCheckpointHeaders();
        return this.getInstanceCheckpointWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceConfigResponse getInstanceConfigWithOptions(String projectName, String jobName, String instanceId, GetInstanceConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceConfig"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/config"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceConfigResponse());
    }

    public GetInstanceConfigResponse getInstanceConfig(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceConfigHeaders headers = new GetInstanceConfigHeaders();
        return this.getInstanceConfigWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceDetailResponse getInstanceDetailWithOptions(String projectName, String jobName, String instanceId, GetInstanceDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceDetail"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/details"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceDetailResponse());
    }

    public GetInstanceDetailResponse getInstanceDetail(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceDetailHeaders headers = new GetInstanceDetailHeaders();
        return this.getInstanceDetailWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    /**
      * **1**
      *
      * @param headers GetInstanceExceptionsHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetInstanceExceptionsResponse
     */
    public GetInstanceExceptionsResponse getInstanceExceptionsWithOptions(String projectName, String jobName, String instanceId, GetInstanceExceptionsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceExceptions"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/exceptions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceExceptionsResponse());
    }

    /**
      * **1**
      *
      * @return GetInstanceExceptionsResponse
     */
    public GetInstanceExceptionsResponse getInstanceExceptions(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceExceptionsHeaders headers = new GetInstanceExceptionsHeaders();
        return this.getInstanceExceptionsWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceFinalStateResponse getInstanceFinalStateWithOptions(String projectName, String jobName, String instanceId, GetInstanceFinalStateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceFinalState"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/finalstate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceFinalStateResponse());
    }

    public GetInstanceFinalStateResponse getInstanceFinalState(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceFinalStateHeaders headers = new GetInstanceFinalStateHeaders();
        return this.getInstanceFinalStateWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceHistoryAutoScalePlanContentResponse getInstanceHistoryAutoScalePlanContentWithOptions(String projectName, String jobName, String instanceId, GetInstanceHistoryAutoScalePlanContentRequest request, GetInstanceHistoryAutoScalePlanContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("planName", request.planName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceHistoryAutoScalePlanContent"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/autoscale/plancontent"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceHistoryAutoScalePlanContentResponse());
    }

    public GetInstanceHistoryAutoScalePlanContentResponse getInstanceHistoryAutoScalePlanContent(String projectName, String jobName, String instanceId, GetInstanceHistoryAutoScalePlanContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceHistoryAutoScalePlanContentHeaders headers = new GetInstanceHistoryAutoScalePlanContentHeaders();
        return this.getInstanceHistoryAutoScalePlanContentWithOptions(projectName, jobName, instanceId, request, headers, runtime);
    }

    public GetInstanceHistoryAutoScalePlanListResponse getInstanceHistoryAutoScalePlanListWithOptions(String projectName, String jobName, String instanceId, GetInstanceHistoryAutoScalePlanListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceHistoryAutoScalePlanList"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/autoscale/planlist"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceHistoryAutoScalePlanListResponse());
    }

    public GetInstanceHistoryAutoScalePlanListResponse getInstanceHistoryAutoScalePlanList(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceHistoryAutoScalePlanListHeaders headers = new GetInstanceHistoryAutoScalePlanListHeaders();
        return this.getInstanceHistoryAutoScalePlanListWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceMetricResponse getInstanceMetricWithOptions(String projectName, String jobName, GetInstanceMetricRequest request, GetInstanceMetricHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricJson)) {
            body.put("metricJson", request.metricJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceMetric"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/metric"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceMetricResponse());
    }

    public GetInstanceMetricResponse getInstanceMetric(String projectName, String jobName, GetInstanceMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceMetricHeaders headers = new GetInstanceMetricHeaders();
        return this.getInstanceMetricWithOptions(projectName, jobName, request, headers, runtime);
    }

    public GetInstanceResourceResponse getInstanceResourceWithOptions(String projectName, String jobName, String instanceId, GetInstanceResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceResource"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResourceResponse());
    }

    public GetInstanceResourceResponse getInstanceResource(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceResourceHeaders headers = new GetInstanceResourceHeaders();
        return this.getInstanceResourceWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    public GetInstanceRunSummaryResponse getInstanceRunSummaryWithOptions(String projectName, String jobName, String instanceId, GetInstanceRunSummaryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceRunSummary"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/runsummary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceRunSummaryResponse());
    }

    public GetInstanceRunSummaryResponse getInstanceRunSummary(String projectName, String jobName, String instanceId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceRunSummaryHeaders headers = new GetInstanceRunSummaryHeaders();
        return this.getInstanceRunSummaryWithOptions(projectName, jobName, instanceId, headers, runtime);
    }

    /**
      * ********
      *
      * @param headers GetJobHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(String projectName, String jobName, GetJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
      * ********
      *
      * @return GetJobResponse
     */
    public GetJobResponse getJob(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobHeaders headers = new GetJobHeaders();
        return this.getJobWithOptions(projectName, jobName, headers, runtime);
    }

    public GetJobLatestAutoScalePlanResponse getJobLatestAutoScalePlanWithOptions(String projectName, String jobName, GetJobLatestAutoScalePlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobLatestAutoScalePlan"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/autoscale/latestplanjson"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobLatestAutoScalePlanResponse());
    }

    public GetJobLatestAutoScalePlanResponse getJobLatestAutoScalePlan(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJobLatestAutoScalePlanHeaders headers = new GetJobLatestAutoScalePlanHeaders();
        return this.getJobLatestAutoScalePlanWithOptions(projectName, jobName, headers, runtime);
    }

    public GetProjectResponse getProjectWithOptions(String projectName, GetProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    public GetProjectResponse getProject(String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProjectHeaders headers = new GetProjectHeaders();
        return this.getProjectWithOptions(projectName, headers, runtime);
    }

    public GetRawPlanJsonResponse getRawPlanJsonWithOptions(String projectName, String jobName, GetRawPlanJsonRequest request, GetRawPlanJsonHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advisorAction)) {
            query.put("AdvisorAction", request.advisorAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoconfEnable)) {
            query.put("autoconfEnable", request.autoconfEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedCore)) {
            query.put("expectedCore", request.expectedCore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedGB)) {
            query.put("expectedGB", request.expectedGB);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRawPlanJson"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/planjson"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRawPlanJsonResponse());
    }

    public GetRawPlanJsonResponse getRawPlanJson(String projectName, String jobName, GetRawPlanJsonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRawPlanJsonHeaders headers = new GetRawPlanJsonHeaders();
        return this.getRawPlanJsonWithOptions(projectName, jobName, request, headers, runtime);
    }

    public GetRefPackageJobResponse getRefPackageJobWithOptions(String projectName, String packageName, GetRefPackageJobRequest request, GetRefPackageJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRefPackageJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages/" + com.aliyun.openapiutil.Client.getEncodeParam(packageName) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRefPackageJobResponse());
    }

    public GetRefPackageJobResponse getRefPackageJob(String projectName, String packageName, GetRefPackageJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRefPackageJobHeaders headers = new GetRefPackageJobHeaders();
        return this.getRefPackageJobWithOptions(projectName, packageName, request, headers, runtime);
    }

    public GetTaskResponse getTaskWithOptions(String projectName, String tasksId, GetTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(tasksId) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(String projectName, String tasksId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTaskHeaders headers = new GetTaskHeaders();
        return this.getTaskWithOptions(projectName, tasksId, headers, runtime);
    }

    public ListChildFolderResponse listChildFolderWithOptions(String projectName, ListChildFolderRequest request, ListChildFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("path", request.path);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChildFolder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/folders/children"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChildFolderResponse());
    }

    public ListChildFolderResponse listChildFolder(String projectName, ListChildFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListChildFolderHeaders headers = new ListChildFolderHeaders();
        return this.listChildFolderWithOptions(projectName, request, headers, runtime);
    }

    public ListClusterResponse listClusterWithOptions(ListClusterRequest request, ListClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCluster"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterResponse());
    }

    public ListClusterResponse listCluster(ListClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListClusterHeaders headers = new ListClusterHeaders();
        return this.listClusterWithOptions(request, headers, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(String projectName, ListInstanceRequest request, ListInstanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualState)) {
            query.put("actualState", request.actualState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBeginTs)) {
            query.put("endBeginTs", request.endBeginTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEndTs)) {
            query.put("endEndTs", request.endEndTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectState)) {
            query.put("expectState", request.expectState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isArchived)) {
            query.put("isArchived", request.isArchived);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("jobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBeginTs)) {
            query.put("startBeginTs", request.startBeginTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEndTs)) {
            query.put("startEndTs", request.startEndTs);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstance"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceResponse());
    }

    public ListInstanceResponse listInstance(String projectName, ListInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListInstanceHeaders headers = new ListInstanceHeaders();
        return this.listInstanceWithOptions(projectName, request, headers, runtime);
    }

    public ListJobResponse listJobWithOptions(String projectName, ListJobRequest request, ListJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiType)) {
            query.put("apiType", request.apiType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("engineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShowFullField)) {
            query.put("isShowFullField", request.isShowFullField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("jobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobResponse());
    }

    public ListJobResponse listJob(String projectName, ListJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListJobHeaders headers = new ListJobHeaders();
        return this.listJobWithOptions(projectName, request, headers, runtime);
    }

    public ListNamespaceResponse listNamespaceWithOptions(ListNamespaceRequest request, ListNamespaceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("targetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferType)) {
            query.put("transferType", request.transferType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("workspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespace"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/namespaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespaceResponse());
    }

    public ListNamespaceResponse listNamespace(ListNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNamespaceHeaders headers = new ListNamespaceHeaders();
        return this.listNamespaceWithOptions(request, headers, runtime);
    }

    public ListNodeResponse listNodeWithOptions(String projectName, ListNodeRequest tmpReq, ListNodeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodeShrinkRequest request = new ListNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actualStates)) {
            request.actualStatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actualStates, "actualStates", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiType)) {
            request.apiTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiType, "apiType", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.creators)) {
            request.creatorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.creators, "creators", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualStatesShrink)) {
            query.put("actualStates", request.actualStatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.apiTypeShrink)) {
            query.put("apiType", request.apiTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorsShrink)) {
            query.put("creators", request.creatorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("jobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.migrateState)) {
            query.put("migrateState", request.migrateState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNode"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/node"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeResponse());
    }

    public ListNodeResponse listNode(String projectName, ListNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNodeHeaders headers = new ListNodeHeaders();
        return this.listNodeWithOptions(projectName, request, headers, runtime);
    }

    public ListPackageResponse listPackageWithOptions(String projectName, ListPackageRequest request, ListPackageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageName)) {
            query.put("packageName", request.packageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPackage"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPackageResponse());
    }

    public ListPackageResponse listPackage(String projectName, ListPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListPackageHeaders headers = new ListPackageHeaders();
        return this.listPackageWithOptions(projectName, request, headers, runtime);
    }

    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, ListProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            query.put("deployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectResponse());
    }

    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProjectHeaders headers = new ListProjectHeaders();
        return this.listProjectWithOptions(request, headers, runtime);
    }

    public ListProjectBindQueueResponse listProjectBindQueueWithOptions(String projectName, ListProjectBindQueueRequest request, ListProjectBindQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectBindQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/queues"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectBindQueueResponse());
    }

    public ListProjectBindQueueResponse listProjectBindQueue(String projectName, ListProjectBindQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProjectBindQueueHeaders headers = new ListProjectBindQueueHeaders();
        return this.listProjectBindQueueWithOptions(projectName, request, headers, runtime);
    }

    public ListProjectBindQueueResourceResponse listProjectBindQueueResourceWithOptions(String projectName, ListProjectBindQueueResourceRequest request, ListProjectBindQueueResourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectBindQueueResource"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/queueresource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectBindQueueResourceResponse());
    }

    public ListProjectBindQueueResourceResponse listProjectBindQueueResource(String projectName, ListProjectBindQueueResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProjectBindQueueResourceHeaders headers = new ListProjectBindQueueResourceHeaders();
        return this.listProjectBindQueueResourceWithOptions(projectName, request, headers, runtime);
    }

    public ListProjectUserResponse listProjectUserWithOptions(String projectName, ListProjectUserRequest request, ListProjectUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectUser"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectUserResponse());
    }

    public ListProjectUserResponse listProjectUser(String projectName, ListProjectUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListProjectUserHeaders headers = new ListProjectUserHeaders();
        return this.listProjectUserWithOptions(projectName, request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, ListTagResourcesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/cluster/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTagResourcesHeaders headers = new ListTagResourcesHeaders();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTaskResponse listTaskWithOptions(String projectName, ListTaskRequest request, ListTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTask"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskResponse());
    }

    public ListTaskResponse listTask(String projectName, ListTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTaskHeaders headers = new ListTaskHeaders();
        return this.listTaskWithOptions(projectName, request, headers, runtime);
    }

    public ListTaskJobResponse listTaskJobWithOptions(String projectName, String tasksId, ListTaskJobRequest tmpReq, ListTaskJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTaskJobShrinkRequest request = new ListTaskJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.state)) {
            request.stateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.state, "state", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateShrink)) {
            query.put("state", request.stateShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(tasksId) + "/jobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskJobResponse());
    }

    public ListTaskJobResponse listTaskJob(String projectName, String tasksId, ListTaskJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTaskJobHeaders headers = new ListTaskJobHeaders();
        return this.listTaskJobWithOptions(projectName, tasksId, request, headers, runtime);
    }

    public ListWhitelistUserResponse listWhitelistUserWithOptions(ListWhitelistUserRequest request, ListWhitelistUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWhitelistUser"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/whitelist/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWhitelistUserResponse());
    }

    public ListWhitelistUserResponse listWhitelistUser(ListWhitelistUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListWhitelistUserHeaders headers = new ListWhitelistUserHeaders();
        return this.listWhitelistUserWithOptions(request, headers, runtime);
    }

    public MVFolderResponse mVFolderWithOptions(String projectName, MVFolderRequest request, MVFolderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destPath)) {
            body.put("destPath", request.destPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPath)) {
            body.put("srcPath", request.srcPath);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MVFolder"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/folders"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MVFolderResponse());
    }

    public MVFolderResponse mVFolder(String projectName, MVFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MVFolderHeaders headers = new MVFolderHeaders();
        return this.mVFolderWithOptions(projectName, request, headers, runtime);
    }

    public ModifyInstanceStateResponse modifyInstanceStateWithOptions(String projectName, String jobName, String instanceId, ModifyInstanceStateRequest request, ModifyInstanceStateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expectState)) {
            body.put("expectState", request.expectState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFlush)) {
            body.put("isFlush", request.isFlush);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerCheckpoint)) {
            body.put("triggerCheckpoint", request.triggerCheckpoint);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceState"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/expectstate"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceStateResponse());
    }

    public ModifyInstanceStateResponse modifyInstanceState(String projectName, String jobName, String instanceId, ModifyInstanceStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ModifyInstanceStateHeaders headers = new ModifyInstanceStateHeaders();
        return this.modifyInstanceStateWithOptions(projectName, jobName, instanceId, request, headers, runtime);
    }

    public ModifyMasterSpecResponse modifyMasterSpecWithOptions(String clusterId, ModifyMasterSpecRequest request, ModifyMasterSpecHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.masterTargetModel)) {
            body.put("masterTargetModel", request.masterTargetModel);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMasterSpec"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/specification"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMasterSpecResponse());
    }

    public ModifyMasterSpecResponse modifyMasterSpec(String clusterId, ModifyMasterSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ModifyMasterSpecHeaders headers = new ModifyMasterSpecHeaders();
        return this.modifyMasterSpecWithOptions(clusterId, request, headers, runtime);
    }

    public OfflineJobResponse offlineJobWithOptions(String projectName, String jobName, OfflineJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/offline"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineJobResponse());
    }

    public OfflineJobResponse offlineJob(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OfflineJobHeaders headers = new OfflineJobHeaders();
        return this.offlineJobWithOptions(projectName, jobName, headers, runtime);
    }

    public RunTaskResponse runTaskWithOptions(String tasksId, String projectName, RunTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunTask"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/vvp/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/tasks/" + com.aliyun.openapiutil.Client.getEncodeParam(tasksId) + "/runTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunTaskResponse());
    }

    public RunTaskResponse runTask(String tasksId, String projectName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RunTaskHeaders headers = new RunTaskHeaders();
        return this.runTaskWithOptions(tasksId, projectName, headers, runtime);
    }

    public ShrinkClusterResponse shrinkClusterWithOptions(String clusterId, ShrinkClusterRequest request, ShrinkClusterHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("instanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTargetCount)) {
            body.put("modelTargetCount", request.modelTargetCount);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ShrinkCluster"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/shrink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ShrinkClusterResponse());
    }

    public ShrinkClusterResponse shrinkCluster(String clusterId, ShrinkClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ShrinkClusterHeaders headers = new ShrinkClusterHeaders();
        return this.shrinkClusterWithOptions(clusterId, request, headers, runtime);
    }

    public StartJobResponse startJobWithOptions(String projectName, String jobName, StartJobRequest request, StartJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parameterJson)) {
            body.put("parameterJson", request.parameterJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartJobResponse());
    }

    public StartJobResponse startJob(String projectName, String jobName, StartJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartJobHeaders headers = new StartJobHeaders();
        return this.startJobWithOptions(projectName, jobName, request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/cluster/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TagResourcesHeaders headers = new TagResourcesHeaders();
        return this.tagResourcesWithOptions(headers, runtime);
    }

    public UnbindQueueResponse unbindQueueWithOptions(String projectName, UnbindQueueRequest request, UnbindQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/queue"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindQueueResponse());
    }

    public UnbindQueueResponse unbindQueue(String projectName, UnbindQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnbindQueueHeaders headers = new UnbindQueueHeaders();
        return this.unbindQueueWithOptions(projectName, request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, UntagResourcesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/cluster/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UntagResourcesHeaders headers = new UntagResourcesHeaders();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UpdateAutoScaleConfigResponse updateAutoScaleConfigWithOptions(String projectName, String jobName, String instanceId, UpdateAutoScaleConfigRequest request, UpdateAutoScaleConfigHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configJson)) {
            body.put("configJson", request.configJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoScaleConfig"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/instance/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/autoscale/config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoScaleConfigResponse());
    }

    public UpdateAutoScaleConfigResponse updateAutoScaleConfig(String projectName, String jobName, String instanceId, UpdateAutoScaleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateAutoScaleConfigHeaders headers = new UpdateAutoScaleConfigHeaders();
        return this.updateAutoScaleConfigWithOptions(projectName, jobName, instanceId, request, headers, runtime);
    }

    public UpdateJobResponse updateJobWithOptions(String projectName, String jobName, UpdateJobRequest request, UpdateJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("clusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            body.put("engineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("folderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packages)) {
            body.put("packages", request.packages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planJson)) {
            body.put("planJson", request.planJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            body.put("properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    public UpdateJobResponse updateJob(String projectName, String jobName, UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateJobHeaders headers = new UpdateJobHeaders();
        return this.updateJobWithOptions(projectName, jobName, request, headers, runtime);
    }

    public UpdatePackageResponse updatePackageWithOptions(String projectName, String packageName, UpdatePackageRequest request, UpdatePackageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            body.put("md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originName)) {
            body.put("originName", request.originName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            body.put("ossBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            body.put("ossEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossOwner)) {
            body.put("ossOwner", request.ossOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossPath)) {
            body.put("ossPath", request.ossPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("tag", request.tag);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePackage"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/packages/" + com.aliyun.openapiutil.Client.getEncodeParam(packageName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePackageResponse());
    }

    public UpdatePackageResponse updatePackage(String projectName, String packageName, UpdatePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdatePackageHeaders headers = new UpdatePackageHeaders();
        return this.updatePackageWithOptions(projectName, packageName, request, headers, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(String projectName, UpdateProjectRequest request, UpdateProjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalJobConfig)) {
            body.put("globalJobConfig", request.globalJobConfig);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(String projectName, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateProjectHeaders headers = new UpdateProjectHeaders();
        return this.updateProjectWithOptions(projectName, request, headers, runtime);
    }

    public UpdateProjectConfigResponse updateProjectConfigWithOptions(UpdateProjectConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isOpenBatchSQL)) {
            query.put("IsOpenBatchSQL", request.isOpenBatchSQL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectConfig"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/project/config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectConfigResponse());
    }

    public UpdateProjectConfigResponse updateProjectConfig(UpdateProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectConfigWithOptions(request, headers, runtime);
    }

    public UpdateQueueResponse updateQueueWithOptions(String clusterId, UpdateQueueRequest request, UpdateQueueHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gpu)) {
            body.put("gpu", request.gpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMemMB)) {
            body.put("maxMemMB", request.maxMemMB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxVcore)) {
            body.put("maxVcore", request.maxVcore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            body.put("queueName", request.queueName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQueue"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/clusters/" + com.aliyun.openapiutil.Client.getEncodeParam(clusterId) + "/queue"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQueueResponse());
    }

    public UpdateQueueResponse updateQueue(String clusterId, UpdateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateQueueHeaders headers = new UpdateQueueHeaders();
        return this.updateQueueWithOptions(clusterId, request, headers, runtime);
    }

    public ValidateJobResponse validateJobWithOptions(String projectName, String jobName, ValidateJobHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", com.aliyun.teautil.Common.toJSONString(headers.regionId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateJob"),
            new TeaPair("version", "2018-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v2/projects/" + com.aliyun.openapiutil.Client.getEncodeParam(projectName) + "/jobs/" + com.aliyun.openapiutil.Client.getEncodeParam(jobName) + "/validate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateJobResponse());
    }

    public ValidateJobResponse validateJob(String projectName, String jobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ValidateJobHeaders headers = new ValidateJobHeaders();
        return this.validateJobWithOptions(projectName, jobName, headers, runtime);
    }
}
