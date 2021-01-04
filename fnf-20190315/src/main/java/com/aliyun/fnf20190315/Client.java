// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315;

import com.aliyun.tea.*;
import com.aliyun.fnf20190315.models.*;
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

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlow", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public CreateScheduleResponse createScheduleWithOptions(CreateScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSchedule", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScheduleResponse());
    }

    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScheduleWithOptions(request, runtime);
    }

    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlow", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteFlowResponse());
    }

    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    public DeleteScheduleResponse deleteScheduleWithOptions(DeleteScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSchedule", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteScheduleResponse());
    }

    public DeleteScheduleResponse deleteSchedule(DeleteScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScheduleWithOptions(request, runtime);
    }

    public DescribeExecutionResponse describeExecutionWithOptions(DescribeExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExecution", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeExecutionResponse());
    }

    public DescribeExecutionResponse describeExecution(DescribeExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExecutionWithOptions(request, runtime);
    }

    public DescribeFlowResponse describeFlowWithOptions(DescribeFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlow", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeFlowResponse());
    }

    public DescribeFlowResponse describeFlow(DescribeFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowWithOptions(request, runtime);
    }

    public DescribeScheduleResponse describeScheduleWithOptions(DescribeScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSchedule", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeScheduleResponse());
    }

    public DescribeScheduleResponse describeSchedule(DescribeScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScheduleWithOptions(request, runtime);
    }

    public GetExecutionHistoryResponse getExecutionHistoryWithOptions(GetExecutionHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExecutionHistory", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetExecutionHistoryResponse());
    }

    public GetExecutionHistoryResponse getExecutionHistory(GetExecutionHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExecutionHistoryWithOptions(request, runtime);
    }

    public ListExecutionsResponse listExecutionsWithOptions(ListExecutionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListExecutions", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListExecutionsResponse());
    }

    public ListExecutionsResponse listExecutions(ListExecutionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listExecutionsWithOptions(request, runtime);
    }

    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlows", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListFlowsResponse());
    }

    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }

    public ListSchedulesResponse listSchedulesWithOptions(ListSchedulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSchedules", "2019-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListSchedulesResponse());
    }

    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSchedulesWithOptions(request, runtime);
    }

    public ReportTaskFailedResponse reportTaskFailedWithOptions(ReportTaskFailedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportTaskFailed", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReportTaskFailedResponse());
    }

    public ReportTaskFailedResponse reportTaskFailed(ReportTaskFailedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportTaskFailedWithOptions(request, runtime);
    }

    public ReportTaskSucceededResponse reportTaskSucceededWithOptions(ReportTaskSucceededRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportTaskSucceeded", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ReportTaskSucceededResponse());
    }

    public ReportTaskSucceededResponse reportTaskSucceeded(ReportTaskSucceededRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportTaskSucceededWithOptions(request, runtime);
    }

    public StartExecutionResponse startExecutionWithOptions(StartExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartExecution", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartExecutionResponse());
    }

    public StartExecutionResponse startExecution(StartExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startExecutionWithOptions(request, runtime);
    }

    public StopExecutionResponse stopExecutionWithOptions(StopExecutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopExecution", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new StopExecutionResponse());
    }

    public StopExecutionResponse stopExecution(StopExecutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopExecutionWithOptions(request, runtime);
    }

    public UpdateFlowResponse updateFlowWithOptions(UpdateFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlow", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlowResponse());
    }

    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlowWithOptions(request, runtime);
    }

    public UpdateScheduleResponse updateScheduleWithOptions(UpdateScheduleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSchedule", "2019-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScheduleResponse());
    }

    public UpdateScheduleResponse updateSchedule(UpdateScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScheduleWithOptions(request, runtime);
    }
}
