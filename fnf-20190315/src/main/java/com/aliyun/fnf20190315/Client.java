// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315;

import com.aliyun.tea.*;
import com.aliyun.fnf20190315.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "cn-beijing.fnf.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cn-hangzhou.fnf.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cn-shanghai.fnf.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "cn-shenzhen.fnf.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("fnf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The number of flows that each user can create is restricted by resources. For more information, see <a href="https://help.aliyun.com/document_detail/122093.html">Limits</a>. If you want to create more flows, submit a ticket.</li>
     * <li>At the user level, flows are distinguished by name. The name of a flow within one account must be unique.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param tmpReq CreateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowShrinkRequest request = new CreateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.environment)) {
            request.environmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.environment, "Environment", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentShrink)) {
            body.put("Environment", request.environmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            body.put("ExecutionMode", request.executionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalStorageLocation)) {
            body.put("ExternalStorageLocation", request.externalStorageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The number of flows that each user can create is restricted by resources. For more information, see <a href="https://help.aliyun.com/document_detail/122093.html">Limits</a>. If you want to create more flows, submit a ticket.</li>
     * <li>At the user level, flows are distinguished by name. The name of a flow within one account must be unique.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param request CreateFlowRequest
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建流程版本别名</p>
     * 
     * @param tmpReq CreateFlowAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowAliasResponse
     */
    public CreateFlowAliasResponse createFlowAliasWithOptions(CreateFlowAliasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowAliasShrinkRequest request = new CreateFlowAliasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.routingConfigurations)) {
            request.routingConfigurationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.routingConfigurations, "RoutingConfigurations", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingConfigurationsShrink)) {
            body.put("RoutingConfigurations", request.routingConfigurationsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowAlias"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建流程版本别名</p>
     * 
     * @param request CreateFlowAliasRequest
     * @return CreateFlowAliasResponse
     */
    public CreateFlowAliasResponse createFlowAlias(CreateFlowAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a time-based schedule.</p>
     * 
     * @param request CreateScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduleResponse
     */
    public CreateScheduleResponse createScheduleWithOptions(CreateScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.signatureVersion)) {
            query.put("SignatureVersion", request.signatureVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            body.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleName)) {
            body.put("ScheduleName", request.scheduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSchedule"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a time-based schedule.</p>
     * 
     * @param request CreateScheduleRequest
     * @return CreateScheduleResponse
     */
    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>A delete operation is asynchronous. If this operation is successful, the system returns a successful response. If an existing flow is pending to be deleted, a new flow of the same name will not be affected by the existing one. After you delete a flow, you cannot query its historical executions. All executions in progress will stop after their most recent steps are complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>A delete operation is asynchronous. If this operation is successful, the system returns a successful response. If an existing flow is pending to be deleted, a new flow of the same name will not be affected by the existing one. After you delete a flow, you cannot query its historical executions. All executions in progress will stop after their most recent steps are complete.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流程别名</p>
     * 
     * @param request DeleteFlowAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowAliasResponse
     */
    public DeleteFlowAliasResponse deleteFlowAliasWithOptions(DeleteFlowAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowAlias"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除流程别名</p>
     * 
     * @param request DeleteFlowAliasRequest
     * @return DeleteFlowAliasResponse
     */
    public DeleteFlowAliasResponse deleteFlowAlias(DeleteFlowAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除流程版本</p>
     * 
     * @param request DeleteFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersionWithOptions(DeleteFlowVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            body.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowVersion"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除流程版本</p>
     * 
     * @param request DeleteFlowVersionRequest
     * @return DeleteFlowVersionResponse
     */
    public DeleteFlowVersionResponse deleteFlowVersion(DeleteFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a time-based scheduling task.</p>
     * 
     * @param request DeleteScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduleResponse
     */
    public DeleteScheduleResponse deleteScheduleWithOptions(DeleteScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleName)) {
            body.put("ScheduleName", request.scheduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSchedule"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a time-based scheduling task.</p>
     * 
     * @param request DeleteScheduleRequest
     * @return DeleteScheduleResponse
     */
    public DeleteScheduleResponse deleteSchedule(DeleteScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an execution in a flow. The long polling mode is supported. The maximum waiting period for long polling depends on the value of the WaitTimeSeconds parameter.</p>
     * 
     * @param request DescribeExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExecutionResponse
     */
    public DescribeExecutionResponse describeExecutionWithOptions(DescribeExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExecution"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an execution in a flow. The long polling mode is supported. The maximum waiting period for long polling depends on the value of the WaitTimeSeconds parameter.</p>
     * 
     * @param request DescribeExecutionRequest
     * @return DescribeExecutionResponse
     */
    public DescribeExecutionResponse describeExecution(DescribeExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a flow.</p>
     * 
     * @param request DescribeFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowResponse
     */
    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlow"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a flow.</p>
     * 
     * @param request DescribeFlowRequest
     * @return DescribeFlowResponse
     */
    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本别名详情</p>
     * 
     * @param request DescribeFlowAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFlowAliasResponse
     */
    public DescribeFlowAliasResponse describeFlowAliasWithOptions(DescribeFlowAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFlowAlias"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFlowAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本别名详情</p>
     * 
     * @param request DescribeFlowAliasRequest
     * @return DescribeFlowAliasResponse
     */
    public DescribeFlowAliasResponse describeFlowAlias(DescribeFlowAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFlowAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 MapRun 详情</p>
     * 
     * @param request DescribeMapRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMapRunResponse
     */
    public DescribeMapRunResponse describeMapRunWithOptions(DescribeMapRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMapRun"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMapRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 MapRun 详情</p>
     * 
     * @param request DescribeMapRunRequest
     * @return DescribeMapRunResponse
     */
    public DescribeMapRunResponse describeMapRun(DescribeMapRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMapRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询地域信息列表</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a time-based schedule.</p>
     * 
     * @param request DescribeScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScheduleResponse
     */
    public DescribeScheduleResponse describeScheduleWithOptions(DescribeScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchedule"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a time-based schedule.</p>
     * 
     * @param request DescribeScheduleRequest
     * @return DescribeScheduleResponse
     */
    public DescribeScheduleResponse describeSchedule(DescribeScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about each step in an execution process.</p>
     * 
     * @param request GetExecutionHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecutionHistoryResponse
     */
    public GetExecutionHistoryResponse getExecutionHistoryWithOptions(GetExecutionHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecutionHistory"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecutionHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details about each step in an execution process.</p>
     * 
     * @param request GetExecutionHistoryRequest
     * @return GetExecutionHistoryResponse
     */
    public GetExecutionHistoryResponse getExecutionHistory(GetExecutionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExecutionHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you delete a flow, you cannot query its historical executions, even if you create a flow of the same name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all historical executions of a flow.</p>
     * 
     * @param request ListExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutionsResponse
     */
    public ListExecutionsResponse listExecutionsWithOptions(ListExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutions"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you delete a flow, you cannot query its historical executions, even if you create a flow of the same name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all historical executions of a flow.</p>
     * 
     * @param request ListExecutionsRequest
     * @return ListExecutionsResponse
     */
    public ListExecutionsResponse listExecutions(ListExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本别名列表</p>
     * 
     * @param request ListFlowAliasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowAliasesResponse
     */
    public ListFlowAliasesResponse listFlowAliasesWithOptions(ListFlowAliasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowAliases"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowAliasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本别名列表</p>
     * 
     * @param request ListFlowAliasesRequest
     * @return ListFlowAliasesResponse
     */
    public ListFlowAliasesResponse listFlowAliases(ListFlowAliasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowAliasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本列表</p>
     * 
     * @param request ListFlowVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowVersionsResponse
     */
    public ListFlowVersionsResponse listFlowVersionsWithOptions(ListFlowVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowVersions"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流程版本列表</p>
     * 
     * @param request ListFlowVersionsRequest
     * @return ListFlowVersionsResponse
     */
    public ListFlowVersionsResponse listFlowVersions(ListFlowVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of flows.</p>
     * 
     * @param request ListFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlows"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of flows.</p>
     * 
     * @param request ListFlowsRequest
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries time-based schedules in a flow.</p>
     * 
     * @param request ListSchedulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSchedulesResponse
     */
    public ListSchedulesResponse listSchedulesWithOptions(ListSchedulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSchedules"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSchedulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries time-based schedules in a flow.</p>
     * 
     * @param request ListSchedulesRequest
     * @return ListSchedulesResponse
     */
    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSchedulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布流程版本</p>
     * 
     * @param request PublishFlowVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishFlowVersionResponse
     */
    public PublishFlowVersionResponse publishFlowVersionWithOptions(PublishFlowVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishFlowVersion"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishFlowVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布流程版本</p>
     * 
     * @param request PublishFlowVersionRequest
     * @return PublishFlowVersionResponse
     */
    public PublishFlowVersionResponse publishFlowVersion(PublishFlowVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishFlowVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskFailed is used to call back <code>pattern: waitForCallback</code> indicates that the current task fails to be executed.
     * In the new service (CloudFlow), the task step that ReportTaskFailed is used to call back <code>TaskMode: WaitForCustomCallback</code> indicates that the current task fails to be executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Reports a failed task.</p>
     * 
     * @param request ReportTaskFailedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportTaskFailedResponse
     */
    public ReportTaskFailedResponse reportTaskFailedWithOptions(ReportTaskFailedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskToken)) {
            query.put("TaskToken", request.taskToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cause)) {
            body.put("Cause", request.cause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.error)) {
            body.put("Error", request.error);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportTaskFailed"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportTaskFailedResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskFailed is used to call back <code>pattern: waitForCallback</code> indicates that the current task fails to be executed.
     * In the new service (CloudFlow), the task step that ReportTaskFailed is used to call back <code>TaskMode: WaitForCustomCallback</code> indicates that the current task fails to be executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Reports a failed task.</p>
     * 
     * @param request ReportTaskFailedRequest
     * @return ReportTaskFailedResponse
     */
    public ReportTaskFailedResponse reportTaskFailed(ReportTaskFailedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportTaskFailedWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskSucceeded is used to call back pattern: waitForCallback indicates that the current task is successfully executed.
     * In the new service (CloudFlow), the task step that ReportTaskSucceeded is used to call back TaskMode: WaitForCustomCallback indicates that the current task is successfully executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Reports a successful task.</p>
     * 
     * @param request ReportTaskSucceededRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReportTaskSucceededResponse
     */
    public ReportTaskSucceededResponse reportTaskSucceededWithOptions(ReportTaskSucceededRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskToken)) {
            query.put("TaskToken", request.taskToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReportTaskSucceeded"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReportTaskSucceededResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In the previous service (Serverless Workflow), the task step that ReportTaskSucceeded is used to call back pattern: waitForCallback indicates that the current task is successfully executed.
     * In the new service (CloudFlow), the task step that ReportTaskSucceeded is used to call back TaskMode: WaitForCustomCallback indicates that the current task is successfully executed.</p>
     * 
     * <b>summary</b> : 
     * <p>Reports a successful task.</p>
     * 
     * @param request ReportTaskSucceededRequest
     * @return ReportTaskSucceededResponse
     */
    public ReportTaskSucceededResponse reportTaskSucceeded(ReportTaskSucceededRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportTaskSucceededWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The flow is created. A flow only in standard mode is supported.</li>
     * <li>If you do not specify an execution, the system automatically generates an execution and starts the execution.</li>
     * <li>If an ongoing execution has the same name as that of the execution to be started, the system directly returns the ongoing execution.</li>
     * <li>If the ongoing execution with the same name has ended (succeeded or failed), <code>ExecutionAlreadyExists</code> is returned.</li>
     * <li>If no execution with the same name exists, the system starts a new execution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the execution of a workflow.</p>
     * 
     * @param request StartExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartExecutionResponse
     */
    public StartExecutionResponse startExecutionWithOptions(StartExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackFnFTaskToken)) {
            body.put("CallbackFnFTaskToken", request.callbackFnFTaskToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionName)) {
            body.put("ExecutionName", request.executionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            body.put("Qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartExecution"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The flow is created. A flow only in standard mode is supported.</li>
     * <li>If you do not specify an execution, the system automatically generates an execution and starts the execution.</li>
     * <li>If an ongoing execution has the same name as that of the execution to be started, the system directly returns the ongoing execution.</li>
     * <li>If the ongoing execution with the same name has ended (succeeded or failed), <code>ExecutionAlreadyExists</code> is returned.</li>
     * <li>If no execution with the same name exists, the system starts a new execution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the execution of a workflow.</p>
     * 
     * @param request StartExecutionRequest
     * @return StartExecutionResponse
     */
    public StartExecutionResponse startExecution(StartExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startExecutionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only flows of the express execution mode are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronously starts an execution in a flow.</p>
     * 
     * @param request StartSyncExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSyncExecutionResponse
     */
    public StartSyncExecutionResponse startSyncExecutionWithOptions(StartSyncExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionName)) {
            body.put("ExecutionName", request.executionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualifier)) {
            body.put("Qualifier", request.qualifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSyncExecution"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSyncExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only flows of the express execution mode are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronously starts an execution in a flow.</p>
     * 
     * @param request StartSyncExecutionRequest
     * @return StartSyncExecutionResponse
     */
    public StartSyncExecutionResponse startSyncExecution(StartSyncExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSyncExecutionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The flow must be in progress.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an execution that is in progress in a flow.</p>
     * 
     * @param request StopExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopExecutionResponse
     */
    public StopExecutionResponse stopExecutionWithOptions(StopExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cause)) {
            body.put("Cause", request.cause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.error)) {
            body.put("Error", request.error);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionName)) {
            body.put("ExecutionName", request.executionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopExecution"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The flow must be in progress.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an execution that is in progress in a flow.</p>
     * 
     * @param request StopExecutionRequest
     * @return StopExecutionResponse
     */
    public StopExecutionResponse stopExecution(StopExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a flow.</p>
     * 
     * @param tmpReq UpdateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlowWithOptions(UpdateFlowRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFlowShrinkRequest request = new UpdateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.environment)) {
            request.environmentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.environment, "Environment", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definition)) {
            body.put("Definition", request.definition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentShrink)) {
            body.put("Environment", request.environmentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlow"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a flow.</p>
     * 
     * @param request UpdateFlowRequest
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新流程版本别名配置</p>
     * 
     * @param tmpReq UpdateFlowAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowAliasResponse
     */
    public UpdateFlowAliasResponse updateFlowAliasWithOptions(UpdateFlowAliasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFlowAliasShrinkRequest request = new UpdateFlowAliasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.routingConfigurations)) {
            request.routingConfigurationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.routingConfigurations, "RoutingConfigurations", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingConfigurationsShrink)) {
            body.put("RoutingConfigurations", request.routingConfigurationsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowAlias"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新流程版本别名配置</p>
     * 
     * @param request UpdateFlowAliasRequest
     * @return UpdateFlowAliasResponse
     */
    public UpdateFlowAliasResponse updateFlowAlias(UpdateFlowAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MapRun 配置</p>
     * 
     * @param request UpdateMapRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMapRunResponse
     */
    public UpdateMapRunResponse updateMapRunWithOptions(UpdateMapRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMapRun"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMapRunResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MapRun 配置</p>
     * 
     * @param request UpdateMapRunRequest
     * @return UpdateMapRunResponse
     */
    public UpdateMapRunResponse updateMapRun(UpdateMapRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMapRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a time-based schedule.</p>
     * 
     * @param request UpdateScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduleResponse
     */
    public UpdateScheduleResponse updateScheduleWithOptions(UpdateScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            body.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            body.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleName)) {
            body.put("ScheduleName", request.scheduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSchedule"),
            new TeaPair("version", "2019-03-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a time-based schedule.</p>
     * 
     * @param request UpdateScheduleRequest
     * @return UpdateScheduleResponse
     */
    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScheduleWithOptions(request, runtime);
    }
}
