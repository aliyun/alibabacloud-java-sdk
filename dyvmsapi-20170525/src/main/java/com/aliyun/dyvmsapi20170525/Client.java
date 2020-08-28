// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525;

import com.aliyun.tea.*;
import com.aliyun.dyvmsapi20170525.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dyvmsapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListRobotTaskCallsResponse listRobotTaskCallsWithOptions(ListRobotTaskCallsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRobotTaskCalls", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ListRobotTaskCallsResponse());
    }

    public ListRobotTaskCallsResponse listRobotTaskCalls(ListRobotTaskCallsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRobotTaskCallsWithOptions(request, runtime);
    }

    public DoRtcNumberAuthResponse doRtcNumberAuthWithOptions(DoRtcNumberAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DoRtcNumberAuth", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DoRtcNumberAuthResponse());
    }

    public DoRtcNumberAuthResponse doRtcNumberAuth(DoRtcNumberAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.doRtcNumberAuthWithOptions(request, runtime);
    }

    public UndoRtcNumberAuthResponse undoRtcNumberAuthWithOptions(UndoRtcNumberAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UndoRtcNumberAuth", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UndoRtcNumberAuthResponse());
    }

    public UndoRtcNumberAuthResponse undoRtcNumberAuth(UndoRtcNumberAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.undoRtcNumberAuthWithOptions(request, runtime);
    }

    public QueryRtcNumberAuthStatusResponse queryRtcNumberAuthStatusWithOptions(QueryRtcNumberAuthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRtcNumberAuthStatus", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRtcNumberAuthStatusResponse());
    }

    public QueryRtcNumberAuthStatusResponse queryRtcNumberAuthStatus(QueryRtcNumberAuthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRtcNumberAuthStatusWithOptions(request, runtime);
    }

    public ListOrderedNumbersResponse listOrderedNumbersWithOptions(ListOrderedNumbersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOrderedNumbers", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ListOrderedNumbersResponse());
    }

    public ListOrderedNumbersResponse listOrderedNumbers(ListOrderedNumbersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrderedNumbersWithOptions(request, runtime);
    }

    public StartMicroOutboundResponse startMicroOutboundWithOptions(StartMicroOutboundRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartMicroOutbound", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new StartMicroOutboundResponse());
    }

    public StartMicroOutboundResponse startMicroOutbound(StartMicroOutboundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMicroOutboundWithOptions(request, runtime);
    }

    public ListOutboundStrategiesResponse listOutboundStrategiesWithOptions(ListOutboundStrategiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOutboundStrategies", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ListOutboundStrategiesResponse());
    }

    public ListOutboundStrategiesResponse listOutboundStrategies(ListOutboundStrategiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundStrategiesWithOptions(request, runtime);
    }

    public DescribeRecordDataResponse describeRecordDataWithOptions(DescribeRecordDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecordData", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecordDataResponse());
    }

    public DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordDataWithOptions(request, runtime);
    }

    public QueryVoipNumberBindInfosResponse queryVoipNumberBindInfosWithOptions(QueryVoipNumberBindInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryVoipNumberBindInfos", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryVoipNumberBindInfosResponse());
    }

    public QueryVoipNumberBindInfosResponse queryVoipNumberBindInfos(QueryVoipNumberBindInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryVoipNumberBindInfosWithOptions(request, runtime);
    }

    public ReportVoipProblemsResponse reportVoipProblemsWithOptions(ReportVoipProblemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReportVoipProblems", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ReportVoipProblemsResponse());
    }

    public ReportVoipProblemsResponse reportVoipProblems(ReportVoipProblemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reportVoipProblemsWithOptions(request, runtime);
    }

    public UnbindNumberAndVoipIdResponse unbindNumberAndVoipIdWithOptions(UnbindNumberAndVoipIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindNumberAndVoipId", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UnbindNumberAndVoipIdResponse());
    }

    public UnbindNumberAndVoipIdResponse unbindNumberAndVoipId(UnbindNumberAndVoipIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindNumberAndVoipIdWithOptions(request, runtime);
    }

    public BindNumberAndVoipIdResponse bindNumberAndVoipIdWithOptions(BindNumberAndVoipIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindNumberAndVoipId", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BindNumberAndVoipIdResponse());
    }

    public BindNumberAndVoipIdResponse bindNumberAndVoipId(BindNumberAndVoipIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindNumberAndVoipIdWithOptions(request, runtime);
    }

    public CancelRobotTaskResponse cancelRobotTaskWithOptions(CancelRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CancelRobotTaskResponse());
    }

    public CancelRobotTaskResponse cancelRobotTask(CancelRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelRobotTaskWithOptions(request, runtime);
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFileWithOptions(UploadRobotTaskCalledFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadRobotTaskCalledFile", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new UploadRobotTaskCalledFileResponse());
    }

    public UploadRobotTaskCalledFileResponse uploadRobotTaskCalledFile(UploadRobotTaskCalledFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadRobotTaskCalledFileWithOptions(request, runtime);
    }

    public DeleteRobotTaskResponse deleteRobotTaskWithOptions(DeleteRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRobotTaskResponse());
    }

    public DeleteRobotTaskResponse deleteRobotTask(DeleteRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRobotTaskWithOptions(request, runtime);
    }

    public StopRobotTaskResponse stopRobotTaskWithOptions(StopRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new StopRobotTaskResponse());
    }

    public StopRobotTaskResponse stopRobotTask(StopRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRobotTaskWithOptions(request, runtime);
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetailWithOptions(QueryRobotTaskCallDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotTaskCallDetail", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotTaskCallDetailResponse());
    }

    public QueryRobotTaskCallDetailResponse queryRobotTaskCallDetail(QueryRobotTaskCallDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskCallDetailWithOptions(request, runtime);
    }

    public QueryRobotv2AllListResponse queryRobotv2AllListWithOptions(QueryRobotv2AllListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotv2AllList", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotv2AllListResponse());
    }

    public QueryRobotv2AllListResponse queryRobotv2AllList(QueryRobotv2AllListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotv2AllListWithOptions(request, runtime);
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetailWithOptions(QueryRobotTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotTaskDetail", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotTaskDetailResponse());
    }

    public QueryRobotTaskDetailResponse queryRobotTaskDetail(QueryRobotTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskDetailWithOptions(request, runtime);
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallListWithOptions(QueryRobotTaskCallListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotTaskCallList", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotTaskCallListResponse());
    }

    public QueryRobotTaskCallListResponse queryRobotTaskCallList(QueryRobotTaskCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskCallListWithOptions(request, runtime);
    }

    public StartRobotTaskResponse startRobotTaskWithOptions(StartRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new StartRobotTaskResponse());
    }

    public StartRobotTaskResponse startRobotTask(StartRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRobotTaskWithOptions(request, runtime);
    }

    public QueryRobotTaskListResponse queryRobotTaskListWithOptions(QueryRobotTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotTaskList", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotTaskListResponse());
    }

    public QueryRobotTaskListResponse queryRobotTaskList(QueryRobotTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotTaskListWithOptions(request, runtime);
    }

    public CreateRobotTaskResponse createRobotTaskWithOptions(CreateRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CreateRobotTaskResponse());
    }

    public CreateRobotTaskResponse createRobotTask(CreateRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRobotTaskWithOptions(request, runtime);
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTaskWithOptions(CancelOrderRobotTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOrderRobotTask", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CancelOrderRobotTaskResponse());
    }

    public CancelOrderRobotTaskResponse cancelOrderRobotTask(CancelOrderRobotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderRobotTaskWithOptions(request, runtime);
    }

    public SmartCallOperateResponse smartCallOperateWithOptions(SmartCallOperateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SmartCallOperate", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SmartCallOperateResponse());
    }

    public SmartCallOperateResponse smartCallOperate(SmartCallOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartCallOperateWithOptions(request, runtime);
    }

    public QueryRobotInfoListResponse queryRobotInfoListWithOptions(QueryRobotInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRobotInfoList", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryRobotInfoListResponse());
    }

    public QueryRobotInfoListResponse queryRobotInfoList(QueryRobotInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRobotInfoListWithOptions(request, runtime);
    }

    public BatchRobotSmartCallResponse batchRobotSmartCallWithOptions(BatchRobotSmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchRobotSmartCall", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new BatchRobotSmartCallResponse());
    }

    public BatchRobotSmartCallResponse batchRobotSmartCall(BatchRobotSmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchRobotSmartCallWithOptions(request, runtime);
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskIdWithOptions(QueryCallDetailByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCallDetailByTaskId", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryCallDetailByTaskIdResponse());
    }

    public QueryCallDetailByTaskIdResponse queryCallDetailByTaskId(QueryCallDetailByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallDetailByTaskIdWithOptions(request, runtime);
    }

    public GetRtcTokenResponse getRtcTokenWithOptions(GetRtcTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRtcToken", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new GetRtcTokenResponse());
    }

    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    public AddRtcAccountResponse addRtcAccountWithOptions(AddRtcAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddRtcAccount", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new AddRtcAccountResponse());
    }

    public AddRtcAccountResponse addRtcAccount(AddRtcAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRtcAccountWithOptions(request, runtime);
    }

    public VoipAddAccountResponse voipAddAccountWithOptions(VoipAddAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VoipAddAccount", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new VoipAddAccountResponse());
    }

    public VoipAddAccountResponse voipAddAccount(VoipAddAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voipAddAccountWithOptions(request, runtime);
    }

    public VoipGetTokenResponse voipGetTokenWithOptions(VoipGetTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("VoipGetToken", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new VoipGetTokenResponse());
    }

    public VoipGetTokenResponse voipGetToken(VoipGetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.voipGetTokenWithOptions(request, runtime);
    }

    public SmartCallResponse smartCallWithOptions(SmartCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SmartCall", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SmartCallResponse());
    }

    public SmartCallResponse smartCall(SmartCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartCallWithOptions(request, runtime);
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallIdWithOptions(QueryCallDetailByCallIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCallDetailByCallId", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new QueryCallDetailByCallIdResponse());
    }

    public QueryCallDetailByCallIdResponse queryCallDetailByCallId(QueryCallDetailByCallIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCallDetailByCallIdWithOptions(request, runtime);
    }

    public CancelCallResponse cancelCallWithOptions(CancelCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelCall", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new CancelCallResponse());
    }

    public CancelCallResponse cancelCall(CancelCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCallWithOptions(request, runtime);
    }

    public ClickToDialResponse clickToDialWithOptions(ClickToDialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClickToDial", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new ClickToDialResponse());
    }

    public ClickToDialResponse clickToDial(ClickToDialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clickToDialWithOptions(request, runtime);
    }

    public IvrCallResponse ivrCallWithOptions(IvrCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("IvrCall", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new IvrCallResponse());
    }

    public IvrCallResponse ivrCall(IvrCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ivrCallWithOptions(request, runtime);
    }

    public SingleCallByVoiceResponse singleCallByVoiceWithOptions(SingleCallByVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SingleCallByVoice", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SingleCallByVoiceResponse());
    }

    public SingleCallByVoiceResponse singleCallByVoice(SingleCallByVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleCallByVoiceWithOptions(request, runtime);
    }

    public SingleCallByTtsResponse singleCallByTtsWithOptions(SingleCallByTtsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SingleCallByTts", "HTTPS", "POST", "2017-05-25", "AK", null, TeaModel.buildMap(request), runtime), new SingleCallByTtsResponse());
    }

    public SingleCallByTtsResponse singleCallByTts(SingleCallByTtsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.singleCallByTtsWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
