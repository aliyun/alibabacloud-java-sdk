// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyvmsapi20170525.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyvmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddRtcAccountResponse addRtcAccountWithOptions(AddRtcAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRtcAccount", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddRtcAccountResponse());
    }

    public AddRtcAccountResponse addRtcAccount(AddRtcAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRtcAccountWithOptions(request, runtime);
    }

    public AddVirtualNumberRelationResponse addVirtualNumberRelationWithOptions(AddVirtualNumberRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVirtualNumberRelation", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new AddVirtualNumberRelationResponse());
    }

    public AddVirtualNumberRelationResponse addVirtualNumberRelation(AddVirtualNumberRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVirtualNumberRelationWithOptions(request, runtime);
    }

    public BatchRobotSmartCallResponse batchRobotSmartCallWithOptions(BatchRobotSmartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchRobotSmartCall", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BatchRobotSmartCallResponse());
    }

    public BatchRobotSmartCallResponse batchRobotSmartCall(BatchRobotSmartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRobotSmartCallWithOptions(request, runtime);
    }

    public BindNumberAndVoipIdResponse bindNumberAndVoipIdWithOptions(BindNumberAndVoipIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindNumberAndVoipId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new BindNumberAndVoipIdResponse());
    }

    public BindNumberAndVoipIdResponse bindNumberAndVoipId(BindNumberAndVoipIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindNumberAndVoipIdWithOptions(request, runtime);
    }

    public CancelCallResponse cancelCallWithOptions(CancelCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelCall", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CancelCallResponse());
    }

    public CancelCallResponse cancelCall(CancelCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCallWithOptions(request, runtime);
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTaskWithOptions(CancelOrderRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOrderRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOrderRobotTaskResponse());
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTask(CancelOrderRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderRobotTaskWithOptions(request, runtime);
    }

    public CancelRobotTaskResponse cancelRobotTaskWithOptions(CancelRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CancelRobotTaskResponse());
    }

    public CancelRobotTaskResponse cancelRobotTask(CancelRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRobotTaskWithOptions(request, runtime);
    }

    public ClickToDialResponse clickToDialWithOptions(ClickToDialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClickToDial", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ClickToDialResponse());
    }

    public ClickToDialResponse clickToDial(ClickToDialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clickToDialWithOptions(request, runtime);
    }

    public CloseSipAccountResponse closeSipAccountWithOptions(CloseSipAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseSipAccount", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CloseSipAccountResponse());
    }

    public CloseSipAccountResponse closeSipAccount(CloseSipAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeSipAccountWithOptions(request, runtime);
    }

    public CreateCallTaskResponse createCallTaskWithOptions(CreateCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCallTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCallTaskResponse());
    }

    public CreateCallTaskResponse createCallTask(CreateCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCallTaskWithOptions(request, runtime);
    }

    public CreateRobotTaskResponse createRobotTaskWithOptions(CreateRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRobotTaskResponse());
    }

    public CreateRobotTaskResponse createRobotTask(CreateRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRobotTaskWithOptions(request, runtime);
    }

    public CreateSipAccountResponse createSipAccountWithOptions(CreateSipAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSipAccount", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSipAccountResponse());
    }

    public CreateSipAccountResponse createSipAccount(CreateSipAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSipAccountWithOptions(request, runtime);
    }

    public DeleteRobotTaskResponse deleteRobotTaskWithOptions(DeleteRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRobotTaskResponse());
    }

    public DeleteRobotTaskResponse deleteRobotTask(DeleteRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRobotTaskWithOptions(request, runtime);
    }

    public DescribeRecordDataResponse describeRecordDataWithOptions(DescribeRecordDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordData", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordDataResponse());
    }

    public DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordDataWithOptions(request, runtime);
    }

    public DoRtcNumberAuthResponse doRtcNumberAuthWithOptions(DoRtcNumberAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoRtcNumberAuth", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DoRtcNumberAuthResponse());
    }

    public DoRtcNumberAuthResponse doRtcNumberAuth(DoRtcNumberAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doRtcNumberAuthWithOptions(request, runtime);
    }

    public DoubleCallSeatResponse doubleCallSeatWithOptions(DoubleCallSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DoubleCallSeat", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new DoubleCallSeatResponse());
    }

    public DoubleCallSeatResponse doubleCallSeat(DoubleCallSeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.doubleCallSeatWithOptions(request, runtime);
    }

    public ExecuteCallTaskResponse executeCallTaskWithOptions(ExecuteCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteCallTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteCallTaskResponse());
    }

    public ExecuteCallTaskResponse executeCallTask(ExecuteCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeCallTaskWithOptions(request, runtime);
    }

    public GetRtcTokenResponse getRtcTokenWithOptions(GetRtcTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRtcToken", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetRtcTokenResponse());
    }

    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetToken", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetTokenResponse());
    }

    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenWithOptions(request, runtime);
    }

    public IvrCallResponse ivrCallWithOptions(IvrCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IvrCall", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new IvrCallResponse());
    }

    public IvrCallResponse ivrCall(IvrCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ivrCallWithOptions(request, runtime);
    }

    public ListCallTaskResponse listCallTaskWithOptions(ListCallTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallTaskResponse());
    }

    public ListCallTaskResponse listCallTask(ListCallTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallTaskWithOptions(request, runtime);
    }

    public ListCallTaskDetailResponse listCallTaskDetailWithOptions(ListCallTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallTaskDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallTaskDetailResponse());
    }

    public ListCallTaskDetailResponse listCallTaskDetail(ListCallTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallTaskDetailWithOptions(request, runtime);
    }

    public ListOrderedNumbersResponse listOrderedNumbersWithOptions(ListOrderedNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrderedNumbers", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrderedNumbersResponse());
    }

    public ListOrderedNumbersResponse listOrderedNumbers(ListOrderedNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrderedNumbersWithOptions(request, runtime);
    }

    public ListOutboundStrategiesResponse listOutboundStrategiesWithOptions(ListOutboundStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundStrategies", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListOutboundStrategiesResponse());
    }

    public ListOutboundStrategiesResponse listOutboundStrategies(ListOutboundStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundStrategiesWithOptions(request, runtime);
    }

    public ListRobotTaskCallsResponse listRobotTaskCallsWithOptions(ListRobotTaskCallsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRobotTaskCalls", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListRobotTaskCallsResponse());
    }

    public ListRobotTaskCallsResponse listRobotTaskCalls(ListRobotTaskCallsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRobotTaskCallsWithOptions(request, runtime);
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallIdWithOptions(QueryCallDetailByCallIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCallDetailByCallId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCallDetailByCallIdResponse());
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallId(QueryCallDetailByCallIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallDetailByCallIdWithOptions(request, runtime);
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskIdWithOptions(QueryCallDetailByTaskIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCallDetailByTaskId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCallDetailByTaskIdResponse());
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallDetailByTaskIdWithOptions(request, runtime);
    }

    public QueryRobotInfoListResponse queryRobotInfoListWithOptions(QueryRobotInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotInfoList", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotInfoListResponse());
    }

    public QueryRobotInfoListResponse queryRobotInfoList(QueryRobotInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotInfoListWithOptions(request, runtime);
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetailWithOptions(QueryRobotTaskCallDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotTaskCallDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotTaskCallDetailResponse());
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskCallDetailWithOptions(request, runtime);
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallListWithOptions(QueryRobotTaskCallListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotTaskCallList", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotTaskCallListResponse());
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallList(QueryRobotTaskCallListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskCallListWithOptions(request, runtime);
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetailWithOptions(QueryRobotTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotTaskDetail", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotTaskDetailResponse());
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetail(QueryRobotTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskDetailWithOptions(request, runtime);
    }

    public QueryRobotTaskListResponse queryRobotTaskListWithOptions(QueryRobotTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotTaskList", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotTaskListResponse());
    }

    public QueryRobotTaskListResponse queryRobotTaskList(QueryRobotTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotTaskListWithOptions(request, runtime);
    }

    public QueryRobotv2AllListResponse queryRobotv2AllListWithOptions(QueryRobotv2AllListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRobotv2AllList", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRobotv2AllListResponse());
    }

    public QueryRobotv2AllListResponse queryRobotv2AllList(QueryRobotv2AllListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRobotv2AllListWithOptions(request, runtime);
    }

    public QueryRtcNumberAuthStatusResponse queryRtcNumberAuthStatusWithOptions(QueryRtcNumberAuthStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRtcNumberAuthStatus", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRtcNumberAuthStatusResponse());
    }

    public QueryRtcNumberAuthStatusResponse queryRtcNumberAuthStatus(QueryRtcNumberAuthStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRtcNumberAuthStatusWithOptions(request, runtime);
    }

    public QueryVirtualNumberResponse queryVirtualNumberWithOptions(QueryVirtualNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVirtualNumber", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVirtualNumberResponse());
    }

    public QueryVirtualNumberResponse queryVirtualNumber(QueryVirtualNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVirtualNumberWithOptions(request, runtime);
    }

    public QueryVirtualNumberRelationResponse queryVirtualNumberRelationWithOptions(QueryVirtualNumberRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVirtualNumberRelation", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVirtualNumberRelationResponse());
    }

    public QueryVirtualNumberRelationResponse queryVirtualNumberRelation(QueryVirtualNumberRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVirtualNumberRelationWithOptions(request, runtime);
    }

    public QueryVoipNumberBindInfosResponse queryVoipNumberBindInfosWithOptions(QueryVoipNumberBindInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryVoipNumberBindInfos", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new QueryVoipNumberBindInfosResponse());
    }

    public QueryVoipNumberBindInfosResponse queryVoipNumberBindInfos(QueryVoipNumberBindInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVoipNumberBindInfosWithOptions(request, runtime);
    }

    public ReportVoipProblemsResponse reportVoipProblemsWithOptions(ReportVoipProblemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReportVoipProblems", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new ReportVoipProblemsResponse());
    }

    public ReportVoipProblemsResponse reportVoipProblems(ReportVoipProblemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reportVoipProblemsWithOptions(request, runtime);
    }

    public SingleCallByTtsResponse singleCallByTtsWithOptions(SingleCallByTtsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SingleCallByTts", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SingleCallByTtsResponse());
    }

    public SingleCallByTtsResponse singleCallByTts(SingleCallByTtsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleCallByTtsWithOptions(request, runtime);
    }

    public SingleCallByVoiceResponse singleCallByVoiceWithOptions(SingleCallByVoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SingleCallByVoice", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SingleCallByVoiceResponse());
    }

    public SingleCallByVoiceResponse singleCallByVoice(SingleCallByVoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.singleCallByVoiceWithOptions(request, runtime);
    }

    public SmartCallResponse smartCallWithOptions(SmartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SmartCall", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SmartCallResponse());
    }

    public SmartCallResponse smartCall(SmartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smartCallWithOptions(request, runtime);
    }

    public SmartCallOperateResponse smartCallOperateWithOptions(SmartCallOperateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SmartCallOperate", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new SmartCallOperateResponse());
    }

    public SmartCallOperateResponse smartCallOperate(SmartCallOperateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.smartCallOperateWithOptions(request, runtime);
    }

    public StartMicroOutboundResponse startMicroOutboundWithOptions(StartMicroOutboundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartMicroOutbound", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new StartMicroOutboundResponse());
    }

    public StartMicroOutboundResponse startMicroOutbound(StartMicroOutboundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMicroOutboundWithOptions(request, runtime);
    }

    public StartRobotTaskResponse startRobotTaskWithOptions(StartRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new StartRobotTaskResponse());
    }

    public StartRobotTaskResponse startRobotTask(StartRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRobotTaskWithOptions(request, runtime);
    }

    public StopRobotTaskResponse stopRobotTaskWithOptions(StopRobotTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopRobotTask", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new StopRobotTaskResponse());
    }

    public StopRobotTaskResponse stopRobotTask(StopRobotTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRobotTaskWithOptions(request, runtime);
    }

    public UnbindNumberAndVoipIdResponse unbindNumberAndVoipIdWithOptions(UnbindNumberAndVoipIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindNumberAndVoipId", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindNumberAndVoipIdResponse());
    }

    public UnbindNumberAndVoipIdResponse unbindNumberAndVoipId(UnbindNumberAndVoipIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindNumberAndVoipIdWithOptions(request, runtime);
    }

    public UndoRtcNumberAuthResponse undoRtcNumberAuthWithOptions(UndoRtcNumberAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UndoRtcNumberAuth", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UndoRtcNumberAuthResponse());
    }

    public UndoRtcNumberAuthResponse undoRtcNumberAuth(UndoRtcNumberAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.undoRtcNumberAuthWithOptions(request, runtime);
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFileWithOptions(UploadRobotTaskCalledFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadRobotTaskCalledFile", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new UploadRobotTaskCalledFileResponse());
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadRobotTaskCalledFileWithOptions(request, runtime);
    }

    public VoipAddAccountResponse voipAddAccountWithOptions(VoipAddAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VoipAddAccount", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new VoipAddAccountResponse());
    }

    public VoipAddAccountResponse voipAddAccount(VoipAddAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.voipAddAccountWithOptions(request, runtime);
    }

    public VoipGetTokenResponse voipGetTokenWithOptions(VoipGetTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VoipGetToken", "2017-05-25", "HTTPS", "POST", "AK", "json", req, runtime), new VoipGetTokenResponse());
    }

    public VoipGetTokenResponse voipGetToken(VoipGetTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.voipGetTokenWithOptions(request, runtime);
    }
}
