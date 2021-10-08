// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806;

import com.aliyun.tea.*;
import com.aliyun.aiops20200806.models.*;
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
        this._endpoint = this.getEndpoint("aiops", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListAuthResponse listAuthWithOptions(ListAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuth", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthResponse());
    }

    public ListAuthResponse listAuth(ListAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthWithOptions(request, runtime);
    }

    public GetEventStatisticsResponse getEventStatisticsWithOptions(GetEventStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventStatistics", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventStatisticsResponse());
    }

    public GetEventStatisticsResponse getEventStatistics(GetEventStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventStatisticsWithOptions(request, runtime);
    }

    public GetSynCloudResourceListResponse getSynCloudResourceListWithOptions(GetSynCloudResourceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSynCloudResourceList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetSynCloudResourceListResponse());
    }

    public GetSynCloudResourceListResponse getSynCloudResourceList(GetSynCloudResourceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSynCloudResourceListWithOptions(request, runtime);
    }

    public PutAlertContactGroupResponse putAlertContactGroupWithOptions(PutAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertContactGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertContactGroupResponse());
    }

    public PutAlertContactGroupResponse putAlertContactGroup(PutAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertContactGroupWithOptions(request, runtime);
    }

    public DescribeReportDataResponse describeReportDataWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeReportData", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeReportDataResponse());
    }

    public DescribeReportDataResponse describeReportData() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeReportDataWithOptions(runtime);
    }

    public GetResourceTypeListResponse getResourceTypeListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetResourceTypeList", "2020-08-06", "HTTPS", "GET", "AK", "json", req, runtime), new GetResourceTypeListResponse());
    }

    public GetResourceTypeListResponse getResourceTypeList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceTypeListWithOptions(runtime);
    }

    public DeleteAlertSettingResponse deleteAlertSettingWithOptions(DeleteAlertSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertSetting", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertSettingResponse());
    }

    public DeleteAlertSettingResponse deleteAlertSetting(DeleteAlertSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertSettingWithOptions(request, runtime);
    }

    public CreateAlertContactGroupResponse createAlertContactGroupWithOptions(CreateAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlertContactGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlertContactGroupResponse());
    }

    public CreateAlertContactGroupResponse createAlertContactGroup(CreateAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlertContactGroupWithOptions(request, runtime);
    }

    public GetEventSequentialTrentResponse getEventSequentialTrentWithOptions(GetEventSequentialTrentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventSequentialTrent", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventSequentialTrentResponse());
    }

    public GetEventSequentialTrentResponse getEventSequentialTrent(GetEventSequentialTrentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventSequentialTrentWithOptions(request, runtime);
    }

    public RunCommandResponse runCommandWithOptions(RunCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunCommand", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new RunCommandResponse());
    }

    public RunCommandResponse runCommand(RunCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCommandWithOptions(request, runtime);
    }

    public GetCidInfoResponse getCidInfoWithOptions(GetCidInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCidInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetCidInfoResponse());
    }

    public GetCidInfoResponse getCidInfo(GetCidInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCidInfoWithOptions(request, runtime);
    }

    public GetBusinessGroupInfoResponse getBusinessGroupInfoWithOptions(GetBusinessGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBusinessGroupInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetBusinessGroupInfoResponse());
    }

    public GetBusinessGroupInfoResponse getBusinessGroupInfo(GetBusinessGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBusinessGroupInfoWithOptions(request, runtime);
    }

    public GetAlertListResponse getAlertListWithOptions(GetAlertListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlertList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlertListResponse());
    }

    public GetAlertListResponse getAlertList(GetAlertListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlertListWithOptions(request, runtime);
    }

    public DescribeDiagnoseResponse describeDiagnoseWithOptions(DescribeDiagnoseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiagnose", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiagnoseResponse());
    }

    public DescribeDiagnoseResponse describeDiagnose(DescribeDiagnoseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiagnoseWithOptions(request, runtime);
    }

    public DeleteAlertContactFromGroupResponse deleteAlertContactFromGroupWithOptions(DeleteAlertContactFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertContactFromGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertContactFromGroupResponse());
    }

    public DeleteAlertContactFromGroupResponse deleteAlertContactFromGroup(DeleteAlertContactFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertContactFromGroupWithOptions(request, runtime);
    }

    public DescribeAlertDetailDataResponse describeAlertDetailDataWithOptions(DescribeAlertDetailDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertDetailData", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertDetailDataResponse());
    }

    public DescribeAlertDetailDataResponse describeAlertDetailData(DescribeAlertDetailDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertDetailDataWithOptions(request, runtime);
    }

    public PutAlertSettingResponse putAlertSettingWithOptions(PutAlertSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertSetting", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertSettingResponse());
    }

    public PutAlertSettingResponse putAlertSetting(PutAlertSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertSettingWithOptions(request, runtime);
    }

    public GetEventRootCauseResponse getEventRootCauseWithOptions(GetEventRootCauseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventRootCause", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventRootCauseResponse());
    }

    public GetEventRootCauseResponse getEventRootCause(GetEventRootCauseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventRootCauseWithOptions(request, runtime);
    }

    public ListAuthorizedUidResponse listAuthorizedUidWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListAuthorizedUid", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthorizedUidResponse());
    }

    public ListAuthorizedUidResponse listAuthorizedUid() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthorizedUidWithOptions(runtime);
    }

    public GetBusinessGroupListResponse getBusinessGroupListWithOptions(GetBusinessGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBusinessGroupList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetBusinessGroupListResponse());
    }

    public GetBusinessGroupListResponse getBusinessGroupList(GetBusinessGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBusinessGroupListWithOptions(request, runtime);
    }

    public DeleteAlertContactResponse deleteAlertContactWithOptions(DeleteAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertContact", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertContactResponse());
    }

    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertContactWithOptions(request, runtime);
    }

    public CloseEventResponse closeEventWithOptions(CloseEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseEvent", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CloseEventResponse());
    }

    public CloseEventResponse closeEvent(CloseEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeEventWithOptions(request, runtime);
    }

    public DescribeDiagnoseResultResponse describeDiagnoseResultWithOptions(DescribeDiagnoseResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiagnoseResult", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiagnoseResultResponse());
    }

    public DescribeDiagnoseResultResponse describeDiagnoseResult(DescribeDiagnoseResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiagnoseResultWithOptions(request, runtime);
    }

    public ConfirmAuthorizationResponse confirmAuthorizationWithOptions(ConfirmAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmAuthorizationResponse());
    }

    public ConfirmAuthorizationResponse confirmAuthorization(ConfirmAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmAuthorizationWithOptions(request, runtime);
    }

    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCommand", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCommandResponse());
    }

    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    public GetUserLoginInfoResponse getUserLoginInfoWithOptions(GetUserLoginInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserLoginInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserLoginInfoResponse());
    }

    public GetUserLoginInfoResponse getUserLoginInfo(GetUserLoginInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserLoginInfoWithOptions(request, runtime);
    }

    public GetConnectInstancesResponse getConnectInstancesWithOptions(GetConnectInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConnectInstances", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetConnectInstancesResponse());
    }

    public GetConnectInstancesResponse getConnectInstances(GetConnectInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectInstancesWithOptions(request, runtime);
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroupWithOptions(DeleteAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertContactGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertContactGroupResponse());
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertContactGroupWithOptions(request, runtime);
    }

    public AddBusinessGroupResponse addBusinessGroupWithOptions(AddBusinessGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddBusinessGroupShrinkRequest request = new AddBusinessGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceList)) {
            request.instanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceList, "InstanceList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddBusinessGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new AddBusinessGroupResponse());
    }

    public AddBusinessGroupResponse addBusinessGroup(AddBusinessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBusinessGroupWithOptions(request, runtime);
    }

    public DescribeAlertContactGroupResponse describeAlertContactGroupWithOptions(DescribeAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertContactGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertContactGroupResponse());
    }

    public DescribeAlertContactGroupResponse describeAlertContactGroup(DescribeAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertContactGroupWithOptions(request, runtime);
    }

    public GetSlsReportListResponse getSlsReportListWithOptions(GetSlsReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSlsReportList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetSlsReportListResponse());
    }

    public GetSlsReportListResponse getSlsReportList(GetSlsReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSlsReportListWithOptions(request, runtime);
    }

    public FeedbackAlertAlgorithmResponse feedbackAlertAlgorithmWithOptions(FeedbackAlertAlgorithmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FeedbackAlertAlgorithm", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new FeedbackAlertAlgorithmResponse());
    }

    public FeedbackAlertAlgorithmResponse feedbackAlertAlgorithm(FeedbackAlertAlgorithmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.feedbackAlertAlgorithmWithOptions(request, runtime);
    }

    public GetAlertTrentResponse getAlertTrentWithOptions(GetAlertTrentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlertTrent", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlertTrentResponse());
    }

    public GetAlertTrentResponse getAlertTrent(GetAlertTrentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlertTrentWithOptions(request, runtime);
    }

    public GetCloudAllResourceListResponse getCloudAllResourceListWithOptions(GetCloudAllResourceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCloudAllResourceList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetCloudAllResourceListResponse());
    }

    public GetCloudAllResourceListResponse getCloudAllResourceList(GetCloudAllResourceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCloudAllResourceListWithOptions(request, runtime);
    }

    public ListCausePlanResponse listCausePlanWithOptions(ListCausePlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCausePlan", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListCausePlanResponse());
    }

    public ListCausePlanResponse listCausePlan(ListCausePlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCausePlanWithOptions(request, runtime);
    }

    public CreateMessageResponse createMessageWithOptions(CreateMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMessage", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMessageResponse());
    }

    public CreateMessageResponse createMessage(CreateMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMessageWithOptions(request, runtime);
    }

    public PutAlertSettingStatusResponse putAlertSettingStatusWithOptions(PutAlertSettingStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertSettingStatus", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertSettingStatusResponse());
    }

    public PutAlertSettingStatusResponse putAlertSettingStatus(PutAlertSettingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertSettingStatusWithOptions(request, runtime);
    }

    public ListNotAuthorizedUidResponse listNotAuthorizedUidWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListNotAuthorizedUid", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListNotAuthorizedUidResponse());
    }

    public ListNotAuthorizedUidResponse listNotAuthorizedUid() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotAuthorizedUidWithOptions(runtime);
    }

    public ListConfirmAuthorizationResponse listConfirmAuthorizationWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListConfirmAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListConfirmAuthorizationResponse());
    }

    public ListConfirmAuthorizationResponse listConfirmAuthorization() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfirmAuthorizationWithOptions(runtime);
    }

    public GetRegionListResponse getRegionListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetRegionList", "2020-08-06", "HTTPS", "GET", "AK", "json", req, runtime), new GetRegionListResponse());
    }

    public GetRegionListResponse getRegionList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRegionListWithOptions(runtime);
    }

    public DescribeAlertSettingByIdResponse describeAlertSettingByIdWithOptions(DescribeAlertSettingByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertSettingById", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertSettingByIdResponse());
    }

    public DescribeAlertSettingByIdResponse describeAlertSettingById(DescribeAlertSettingByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertSettingByIdWithOptions(request, runtime);
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse describeAlertBusinessGroupWithAlertSettingIdWithOptions(DescribeAlertBusinessGroupWithAlertSettingIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertBusinessGroupWithAlertSettingId", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertBusinessGroupWithAlertSettingIdResponse());
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdResponse describeAlertBusinessGroupWithAlertSettingId(DescribeAlertBusinessGroupWithAlertSettingIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertBusinessGroupWithAlertSettingIdWithOptions(request, runtime);
    }

    public GetAvgRepairTimeResponse getAvgRepairTimeWithOptions(GetAvgRepairTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAvgRepairTime", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAvgRepairTimeResponse());
    }

    public GetAvgRepairTimeResponse getAvgRepairTime(GetAvgRepairTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAvgRepairTimeWithOptions(request, runtime);
    }

    public GetAiopsEventListResponse getAiopsEventListWithOptions(GetAiopsEventListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAiopsEventList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAiopsEventListResponse());
    }

    public GetAiopsEventListResponse getAiopsEventList(GetAiopsEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAiopsEventListWithOptions(request, runtime);
    }

    public GetRealDataResponse getRealDataWithOptions(GetRealDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRealData", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetRealDataResponse());
    }

    public GetRealDataResponse getRealData(GetRealDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRealDataWithOptions(request, runtime);
    }

    public GetCloudResourceListResponse getCloudResourceListWithOptions(GetCloudResourceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCloudResourceList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetCloudResourceListResponse());
    }

    public GetCloudResourceListResponse getCloudResourceList(GetCloudResourceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCloudResourceListWithOptions(request, runtime);
    }

    public DescribeAllAlertContactGroupResponse describeAllAlertContactGroupWithOptions(DescribeAllAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllAlertContactGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllAlertContactGroupResponse());
    }

    public DescribeAllAlertContactGroupResponse describeAllAlertContactGroup(DescribeAllAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllAlertContactGroupWithOptions(request, runtime);
    }

    public DelBusinessGroupResponse delBusinessGroupWithOptions(DelBusinessGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DelBusinessGroup", "2020-08-06", "HTTPS", "GET", "AK", "json", req, runtime), new DelBusinessGroupResponse());
    }

    public DelBusinessGroupResponse delBusinessGroup(DelBusinessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delBusinessGroupWithOptions(request, runtime);
    }

    public ApplyAuthorizationResponse applyAuthorizationWithOptions(ApplyAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyAuthorizationResponse());
    }

    public ApplyAuthorizationResponse applyAuthorization(ApplyAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAuthorizationWithOptions(request, runtime);
    }

    public PutAlertSettingListResponse putAlertSettingListWithOptions(PutAlertSettingListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertSettingList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertSettingListResponse());
    }

    public PutAlertSettingListResponse putAlertSettingList(PutAlertSettingListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertSettingListWithOptions(request, runtime);
    }

    public ListSlsReportsResponse listSlsReportsWithOptions(ListSlsReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSlsReports", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListSlsReportsResponse());
    }

    public ListSlsReportsResponse listSlsReports(ListSlsReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSlsReportsWithOptions(request, runtime);
    }

    public DescribeAlertContactResponse describeAlertContactWithOptions(DescribeAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertContact", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertContactResponse());
    }

    public DescribeAlertContactResponse describeAlertContact(DescribeAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertContactWithOptions(request, runtime);
    }

    public CreateAlertContactResponse createAlertContactWithOptions(CreateAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlertContact", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlertContactResponse());
    }

    public CreateAlertContactResponse createAlertContact(CreateAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlertContactWithOptions(request, runtime);
    }

    public PutDiagInfoResponse putDiagInfoWithOptions(PutDiagInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutDiagInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutDiagInfoResponse());
    }

    public PutDiagInfoResponse putDiagInfo(PutDiagInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDiagInfoWithOptions(request, runtime);
    }

    public GetBusinessGroupOverviewListResponse getBusinessGroupOverviewListWithOptions(GetBusinessGroupOverviewListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBusinessGroupOverviewList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetBusinessGroupOverviewListResponse());
    }

    public GetBusinessGroupOverviewListResponse getBusinessGroupOverviewList(GetBusinessGroupOverviewListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBusinessGroupOverviewListWithOptions(request, runtime);
    }

    public CreateDumpResponse createDumpWithOptions(CreateDumpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDump", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDumpResponse());
    }

    public CreateDumpResponse createDump(CreateDumpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDumpWithOptions(request, runtime);
    }

    public IgnoreAlarmsResponse ignoreAlarmsWithOptions(IgnoreAlarmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IgnoreAlarms", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new IgnoreAlarmsResponse());
    }

    public IgnoreAlarmsResponse ignoreAlarms(IgnoreAlarmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ignoreAlarmsWithOptions(request, runtime);
    }

    public DescribeAllBusinessGroupInfoResponse describeAllBusinessGroupInfoWithOptions(DescribeAllBusinessGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllBusinessGroupInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllBusinessGroupInfoResponse());
    }

    public DescribeAllBusinessGroupInfoResponse describeAllBusinessGroupInfo(DescribeAllBusinessGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllBusinessGroupInfoWithOptions(request, runtime);
    }

    public CountLatestReportsResponse countLatestReportsWithOptions(CountLatestReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CountLatestReports", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new CountLatestReportsResponse());
    }

    public CountLatestReportsResponse countLatestReports(CountLatestReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countLatestReportsWithOptions(request, runtime);
    }

    public DescribeRiskResponse describeRiskWithOptions(DescribeRiskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRisk", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskResponse());
    }

    public DescribeRiskResponse describeRisk(DescribeRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskWithOptions(request, runtime);
    }

    public ListReportsResponse listReportsWithOptions(ListReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListReports", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListReportsResponse());
    }

    public ListReportsResponse listReports(ListReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listReportsWithOptions(request, runtime);
    }

    public GetAiopsEventNewListResponse getAiopsEventNewListWithOptions(GetAiopsEventNewListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAiopsEventNewList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAiopsEventNewListResponse());
    }

    public GetAiopsEventNewListResponse getAiopsEventNewList(GetAiopsEventNewListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAiopsEventNewListWithOptions(request, runtime);
    }

    public GetEventDetailResponse getEventDetailWithOptions(GetEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventDetail", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventDetailResponse());
    }

    public GetEventDetailResponse getEventDetail(GetEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventDetailWithOptions(request, runtime);
    }

    public PutAlertContactToGroupResponse putAlertContactToGroupWithOptions(PutAlertContactToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertContactToGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertContactToGroupResponse());
    }

    public PutAlertContactToGroupResponse putAlertContactToGroup(PutAlertContactToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertContactToGroupWithOptions(request, runtime);
    }

    public GetRootCauseResponse getRootCauseWithOptions(GetRootCauseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRootCause", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetRootCauseResponse());
    }

    public GetRootCauseResponse getRootCause(GetRootCauseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRootCauseWithOptions(request, runtime);
    }

    public DescribeAllAlertContactResponse describeAllAlertContactWithOptions(DescribeAllAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllAlertContact", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllAlertContactResponse());
    }

    public DescribeAllAlertContactResponse describeAllAlertContact(DescribeAllAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllAlertContactWithOptions(request, runtime);
    }

    public UpdateAuthorizationResponse updateAuthorizationWithOptions(UpdateAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAuthorizationResponse());
    }

    public UpdateAuthorizationResponse updateAuthorization(UpdateAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAuthorizationWithOptions(request, runtime);
    }

    public DescribeAlertContactWithAlertSettingIdResponse describeAlertContactWithAlertSettingIdWithOptions(DescribeAlertContactWithAlertSettingIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertContactWithAlertSettingId", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertContactWithAlertSettingIdResponse());
    }

    public DescribeAlertContactWithAlertSettingIdResponse describeAlertContactWithAlertSettingId(DescribeAlertContactWithAlertSettingIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertContactWithAlertSettingIdWithOptions(request, runtime);
    }

    public GetAuthorizationResponse getAuthorizationWithOptions(GetAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthorizationResponse());
    }

    public GetAuthorizationResponse getAuthorization(GetAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationWithOptions(request, runtime);
    }

    public GetRoleResponse getRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetRole", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoleResponse());
    }

    public GetRoleResponse getRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoleWithOptions(runtime);
    }

    public ListRootCauseResponse listRootCauseWithOptions(ListRootCauseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRootCause", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListRootCauseResponse());
    }

    public ListRootCauseResponse listRootCause(ListRootCauseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRootCauseWithOptions(request, runtime);
    }

    public DescribeAlertContactWithGroupIdResponse describeAlertContactWithGroupIdWithOptions(DescribeAlertContactWithGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertContactWithGroupId", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertContactWithGroupIdResponse());
    }

    public DescribeAlertContactWithGroupIdResponse describeAlertContactWithGroupId(DescribeAlertContactWithGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertContactWithGroupIdWithOptions(request, runtime);
    }

    public DeleteAlertSettingListResponse deleteAlertSettingListWithOptions(DeleteAlertSettingListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertSettingList", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertSettingListResponse());
    }

    public DeleteAlertSettingListResponse deleteAlertSettingList(DeleteAlertSettingListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertSettingListWithOptions(request, runtime);
    }

    public GetTrendSlsReportsResponse getTrendSlsReportsWithOptions(GetTrendSlsReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrendSlsReports", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetTrendSlsReportsResponse());
    }

    public GetTrendSlsReportsResponse getTrendSlsReports(GetTrendSlsReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTrendSlsReportsWithOptions(request, runtime);
    }

    public ListEventResponse listEventWithOptions(ListEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEvent", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListEventResponse());
    }

    public ListEventResponse listEvent(ListEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventWithOptions(request, runtime);
    }

    public GetDiagInfoResponse getDiagInfoWithOptions(GetDiagInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDiagInfo", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetDiagInfoResponse());
    }

    public GetDiagInfoResponse getDiagInfo(GetDiagInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiagInfoWithOptions(request, runtime);
    }

    public DescribeInvocationResultsResponse describeInvocationResultsWithOptions(DescribeInvocationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInvocationResults", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInvocationResultsResponse());
    }

    public DescribeInvocationResultsResponse describeInvocationResults(DescribeInvocationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInvocationResultsWithOptions(request, runtime);
    }

    public GetEventTrentResponse getEventTrentWithOptions(GetEventTrentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventTrent", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventTrentResponse());
    }

    public GetEventTrentResponse getEventTrent(GetEventTrentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventTrentWithOptions(request, runtime);
    }

    public ListApplyAuthorizationResponse listApplyAuthorizationWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListApplyAuthorization", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new ListApplyAuthorizationResponse());
    }

    public ListApplyAuthorizationResponse listApplyAuthorization() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplyAuthorizationWithOptions(runtime);
    }

    public DescribeAlertSettingResponse describeAlertSettingWithOptions(DescribeAlertSettingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertSetting", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertSettingResponse());
    }

    public DescribeAlertSettingResponse describeAlertSetting(DescribeAlertSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertSettingWithOptions(request, runtime);
    }

    public UpdBusinessGroupResponse updBusinessGroupWithOptions(UpdBusinessGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdBusinessGroupShrinkRequest request = new UpdBusinessGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceList)) {
            request.instanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceList, "InstanceList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdBusinessGroup", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new UpdBusinessGroupResponse());
    }

    public UpdBusinessGroupResponse updBusinessGroup(UpdBusinessGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updBusinessGroupWithOptions(request, runtime);
    }

    public PutAlertContactResponse putAlertContactWithOptions(PutAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutAlertContact", "2020-08-06", "HTTPS", "POST", "AK", "json", req, runtime), new PutAlertContactResponse());
    }

    public PutAlertContactResponse putAlertContact(PutAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putAlertContactWithOptions(request, runtime);
    }
}
