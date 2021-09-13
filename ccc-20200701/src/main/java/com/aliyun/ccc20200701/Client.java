// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701;

import com.aliyun.tea.*;
import com.aliyun.ccc20200701.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-south-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "ccc.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "ccc.aliyuncs.com"),
            new TeaPair("cn-beijing", "ccc.aliyuncs.com"),
            new TeaPair("cn-chengdu", "ccc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ccc.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "ccc.aliyuncs.com"),
            new TeaPair("cn-qingdao", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ccc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "ccc.aliyuncs.com"),
            new TeaPair("eu-central-1", "ccc.aliyuncs.com"),
            new TeaPair("eu-west-1", "ccc.aliyuncs.com"),
            new TeaPair("me-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-east-1", "ccc.aliyuncs.com"),
            new TeaPair("us-west-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ccc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ccc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ccc.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ccc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddSkillGroupsToUserResponse addSkillGroupsToUserWithOptions(AddSkillGroupsToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSkillGroupsToUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddSkillGroupsToUserResponse());
    }

    public AddSkillGroupsToUserResponse addSkillGroupsToUser(AddSkillGroupsToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSkillGroupsToUserWithOptions(request, runtime);
    }

    public SaveWebRTCStatsResponse saveWebRTCStatsWithOptions(SaveWebRTCStatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWebRTCStats", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWebRTCStatsResponse());
    }

    public SaveWebRTCStatsResponse saveWebRTCStats(SaveWebRTCStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWebRTCStatsWithOptions(request, runtime);
    }

    public GetMonoRecordingResponse getMonoRecordingWithOptions(GetMonoRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMonoRecording", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMonoRecordingResponse());
    }

    public GetMonoRecordingResponse getMonoRecording(GetMonoRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMonoRecordingWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListAgentStateLogsResponse listAgentStateLogsWithOptions(ListAgentStateLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentStateLogs", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListAgentStateLogsResponse());
    }

    public ListAgentStateLogsResponse listAgentStateLogs(ListAgentStateLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentStateLogsWithOptions(request, runtime);
    }

    public RemovePhoneNumberFromSkillGroupsResponse removePhoneNumberFromSkillGroupsWithOptions(RemovePhoneNumberFromSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePhoneNumberFromSkillGroups", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePhoneNumberFromSkillGroupsResponse());
    }

    public RemovePhoneNumberFromSkillGroupsResponse removePhoneNumberFromSkillGroups(RemovePhoneNumberFromSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePhoneNumberFromSkillGroupsWithOptions(request, runtime);
    }

    public ListPhoneNumbersResponse listPhoneNumbersWithOptions(ListPhoneNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhoneNumbers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhoneNumbersResponse());
    }

    public ListPhoneNumbersResponse listPhoneNumbers(ListPhoneNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhoneNumbersWithOptions(request, runtime);
    }

    public AddNumbersToSkillGroupResponse addNumbersToSkillGroupWithOptions(AddNumbersToSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddNumbersToSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddNumbersToSkillGroupResponse());
    }

    public AddNumbersToSkillGroupResponse addNumbersToSkillGroup(AddNumbersToSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNumbersToSkillGroupWithOptions(request, runtime);
    }

    public ResetAgentStateResponse resetAgentStateWithOptions(ResetAgentStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAgentState", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAgentStateResponse());
    }

    public ResetAgentStateResponse resetAgentState(ResetAgentStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAgentStateWithOptions(request, runtime);
    }

    public ChangeWorkModeResponse changeWorkModeWithOptions(ChangeWorkModeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeWorkMode", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeWorkModeResponse());
    }

    public ChangeWorkModeResponse changeWorkMode(ChangeWorkModeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeWorkModeWithOptions(request, runtime);
    }

    public GetTurnCredentialsResponse getTurnCredentialsWithOptions(GetTurnCredentialsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTurnCredentials", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetTurnCredentialsResponse());
    }

    public GetTurnCredentialsResponse getTurnCredentials(GetTurnCredentialsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTurnCredentialsWithOptions(request, runtime);
    }

    public AddPhoneNumbersResponse addPhoneNumbersWithOptions(AddPhoneNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPhoneNumbers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddPhoneNumbersResponse());
    }

    public AddPhoneNumbersResponse addPhoneNumbers(AddPhoneNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPhoneNumbersWithOptions(request, runtime);
    }

    public SaveWebRtcInfoResponse saveWebRtcInfoWithOptions(SaveWebRtcInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveWebRtcInfo", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveWebRtcInfoResponse());
    }

    public SaveWebRtcInfoResponse saveWebRtcInfo(SaveWebRtcInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveWebRtcInfoWithOptions(request, runtime);
    }

    public ListIntervalSkillGroupReportResponse listIntervalSkillGroupReportWithOptions(ListIntervalSkillGroupReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIntervalSkillGroupReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIntervalSkillGroupReportResponse());
    }

    public ListIntervalSkillGroupReportResponse listIntervalSkillGroupReport(ListIntervalSkillGroupReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIntervalSkillGroupReportWithOptions(request, runtime);
    }

    public MonitorCallResponse monitorCallWithOptions(MonitorCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MonitorCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new MonitorCallResponse());
    }

    public MonitorCallResponse monitorCall(MonitorCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.monitorCallWithOptions(request, runtime);
    }

    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroupWithOptions(RemoveUsersFromSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsersFromSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersFromSkillGroupResponse());
    }

    public RemoveUsersFromSkillGroupResponse removeUsersFromSkillGroup(RemoveUsersFromSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersFromSkillGroupWithOptions(request, runtime);
    }

    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSkillGroupResponse());
    }

    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    public BlindTransferResponse blindTransferWithOptions(BlindTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BlindTransfer", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new BlindTransferResponse());
    }

    public BlindTransferResponse blindTransfer(BlindTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.blindTransferWithOptions(request, runtime);
    }

    public ListSkillLevelsOfUserResponse listSkillLevelsOfUserWithOptions(ListSkillLevelsOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillLevelsOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillLevelsOfUserResponse());
    }

    public ListSkillLevelsOfUserResponse listSkillLevelsOfUser(ListSkillLevelsOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillLevelsOfUserWithOptions(request, runtime);
    }

    public ListUnassignedNumbersResponse listUnassignedNumbersWithOptions(ListUnassignedNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUnassignedNumbers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUnassignedNumbersResponse());
    }

    public ListUnassignedNumbersResponse listUnassignedNumbers(ListUnassignedNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUnassignedNumbersWithOptions(request, runtime);
    }

    public GetInstanceTrendingReportResponse getInstanceTrendingReportWithOptions(GetInstanceTrendingReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceTrendingReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceTrendingReportResponse());
    }

    public GetInstanceTrendingReportResponse getInstanceTrendingReport(GetInstanceTrendingReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceTrendingReportWithOptions(request, runtime);
    }

    public ListInstancesOfUserResponse listInstancesOfUserWithOptions(ListInstancesOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstancesOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesOfUserResponse());
    }

    public ListInstancesOfUserResponse listInstancesOfUser(ListInstancesOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesOfUserWithOptions(request, runtime);
    }

    public LaunchSurveyResponse launchSurveyWithOptions(LaunchSurveyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LaunchSurvey", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new LaunchSurveyResponse());
    }

    public LaunchSurveyResponse launchSurvey(LaunchSurveyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.launchSurveyWithOptions(request, runtime);
    }

    public ListIvrTrackingDetailsResponse listIvrTrackingDetailsWithOptions(ListIvrTrackingDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIvrTrackingDetails", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIvrTrackingDetailsResponse());
    }

    public ListIvrTrackingDetailsResponse listIvrTrackingDetails(ListIvrTrackingDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIvrTrackingDetailsWithOptions(request, runtime);
    }

    public ListBriefSkillGroupsResponse listBriefSkillGroupsWithOptions(ListBriefSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBriefSkillGroups", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListBriefSkillGroupsResponse());
    }

    public ListBriefSkillGroupsResponse listBriefSkillGroups(ListBriefSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBriefSkillGroupsWithOptions(request, runtime);
    }

    public UnmuteCallResponse unmuteCallWithOptions(UnmuteCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnmuteCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnmuteCallResponse());
    }

    public UnmuteCallResponse unmuteCall(UnmuteCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unmuteCallWithOptions(request, runtime);
    }

    public ModifySkillLevelsOfUserResponse modifySkillLevelsOfUserWithOptions(ModifySkillLevelsOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySkillLevelsOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySkillLevelsOfUserResponse());
    }

    public ModifySkillLevelsOfUserResponse modifySkillLevelsOfUser(ModifySkillLevelsOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySkillLevelsOfUserWithOptions(request, runtime);
    }

    public AssignUsersResponse assignUsersWithOptions(AssignUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssignUsers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AssignUsersResponse());
    }

    public AssignUsersResponse assignUsers(AssignUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.assignUsersWithOptions(request, runtime);
    }

    public ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroupWithOptions(ListUserLevelsOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserLevelsOfSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserLevelsOfSkillGroupResponse());
    }

    public ListUserLevelsOfSkillGroupResponse listUserLevelsOfSkillGroup(ListUserLevelsOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public UpdateConfigItemsResponse updateConfigItemsWithOptions(UpdateConfigItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConfigItems", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConfigItemsResponse());
    }

    public UpdateConfigItemsResponse updateConfigItems(UpdateConfigItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigItemsWithOptions(request, runtime);
    }

    public GetCallDetailRecordResponse getCallDetailRecordWithOptions(GetCallDetailRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCallDetailRecord", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetCallDetailRecordResponse());
    }

    public GetCallDetailRecordResponse getCallDetailRecord(GetCallDetailRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCallDetailRecordWithOptions(request, runtime);
    }

    public ModifyPhoneNumberResponse modifyPhoneNumberWithOptions(ModifyPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPhoneNumber", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPhoneNumberResponse());
    }

    public ModifyPhoneNumberResponse modifyPhoneNumber(ModifyPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPhoneNumberWithOptions(request, runtime);
    }

    public CoachCallResponse coachCallWithOptions(CoachCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CoachCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CoachCallResponse());
    }

    public CoachCallResponse coachCall(CoachCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.coachCallWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public ListPrivilegesOfUserResponse listPrivilegesOfUserWithOptions(ListPrivilegesOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPrivilegesOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPrivilegesOfUserResponse());
    }

    public ListPrivilegesOfUserResponse listPrivilegesOfUser(ListPrivilegesOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrivilegesOfUserWithOptions(request, runtime);
    }

    public AddPersonalNumbersToUserResponse addPersonalNumbersToUserWithOptions(AddPersonalNumbersToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPersonalNumbersToUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddPersonalNumbersToUserResponse());
    }

    public AddPersonalNumbersToUserResponse addPersonalNumbersToUser(AddPersonalNumbersToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPersonalNumbersToUserWithOptions(request, runtime);
    }

    public ListHistoricalAgentReportResponse listHistoricalAgentReportWithOptions(ListHistoricalAgentReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHistoricalAgentReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListHistoricalAgentReportResponse());
    }

    public ListHistoricalAgentReportResponse listHistoricalAgentReport(ListHistoricalAgentReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHistoricalAgentReportWithOptions(request, runtime);
    }

    public InterceptCallResponse interceptCallWithOptions(InterceptCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InterceptCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new InterceptCallResponse());
    }

    public InterceptCallResponse interceptCall(InterceptCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.interceptCallWithOptions(request, runtime);
    }

    public ListContactFlowsResponse listContactFlowsWithOptions(ListContactFlowsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContactFlows", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListContactFlowsResponse());
    }

    public ListContactFlowsResponse listContactFlows(ListContactFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContactFlowsWithOptions(request, runtime);
    }

    public ListPersonalNumbersOfUserResponse listPersonalNumbersOfUserWithOptions(ListPersonalNumbersOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPersonalNumbersOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPersonalNumbersOfUserResponse());
    }

    public ListPersonalNumbersOfUserResponse listPersonalNumbersOfUser(ListPersonalNumbersOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPersonalNumbersOfUserWithOptions(request, runtime);
    }

    public StartPredictiveCallResponse startPredictiveCallWithOptions(StartPredictiveCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartPredictiveCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartPredictiveCallResponse());
    }

    public StartPredictiveCallResponse startPredictiveCall(StartPredictiveCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startPredictiveCallWithOptions(request, runtime);
    }

    public ListIntervalInstanceReportResponse listIntervalInstanceReportWithOptions(ListIntervalInstanceReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIntervalInstanceReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIntervalInstanceReportResponse());
    }

    public ListIntervalInstanceReportResponse listIntervalInstanceReport(ListIntervalInstanceReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIntervalInstanceReportWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUserWithOptions(RemoveSkillGroupsFromUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSkillGroupsFromUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSkillGroupsFromUserResponse());
    }

    public RemoveSkillGroupsFromUserResponse removeSkillGroupsFromUser(RemoveSkillGroupsFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupsFromUserWithOptions(request, runtime);
    }

    public ListRealtimeAgentStatesResponse listRealtimeAgentStatesWithOptions(ListRealtimeAgentStatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRealtimeAgentStates", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRealtimeAgentStatesResponse());
    }

    public ListRealtimeAgentStatesResponse listRealtimeAgentStates(ListRealtimeAgentStatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeAgentStatesWithOptions(request, runtime);
    }

    public LaunchAuthenticationResponse launchAuthenticationWithOptions(LaunchAuthenticationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LaunchAuthentication", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new LaunchAuthenticationResponse());
    }

    public LaunchAuthenticationResponse launchAuthentication(LaunchAuthenticationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.launchAuthenticationWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public GetHistoricalInstanceReportResponse getHistoricalInstanceReportWithOptions(GetHistoricalInstanceReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHistoricalInstanceReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetHistoricalInstanceReportResponse());
    }

    public GetHistoricalInstanceReportResponse getHistoricalInstanceReport(GetHistoricalInstanceReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHistoricalInstanceReportWithOptions(request, runtime);
    }

    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUsers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUsersResponse());
    }

    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    public StartBack2BackCallResponse startBack2BackCallWithOptions(StartBack2BackCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartBack2BackCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new StartBack2BackCallResponse());
    }

    public StartBack2BackCallResponse startBack2BackCall(StartBack2BackCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBack2BackCallWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroupWithOptions(RemovePhoneNumbersFromSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePhoneNumbersFromSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePhoneNumbersFromSkillGroupResponse());
    }

    public RemovePhoneNumbersFromSkillGroupResponse removePhoneNumbersFromSkillGroup(RemovePhoneNumbersFromSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePhoneNumbersFromSkillGroupWithOptions(request, runtime);
    }

    public CompleteAttendedTransferResponse completeAttendedTransferWithOptions(CompleteAttendedTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteAttendedTransfer", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteAttendedTransferResponse());
    }

    public CompleteAttendedTransferResponse completeAttendedTransfer(CompleteAttendedTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeAttendedTransferWithOptions(request, runtime);
    }

    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetUserPassword", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ResetUserPasswordResponse());
    }

    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    public GetTurnServerListResponse getTurnServerListWithOptions(GetTurnServerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTurnServerList", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetTurnServerListResponse());
    }

    public GetTurnServerListResponse getTurnServerList(GetTurnServerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTurnServerListWithOptions(request, runtime);
    }

    public GetNumberLocationResponse getNumberLocationWithOptions(GetNumberLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNumberLocation", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetNumberLocationResponse());
    }

    public GetNumberLocationResponse getNumberLocation(GetNumberLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNumberLocationWithOptions(request, runtime);
    }

    public ListRamUsersResponse listRamUsersWithOptions(ListRamUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRamUsers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRamUsersResponse());
    }

    public ListRamUsersResponse listRamUsers(ListRamUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRamUsersWithOptions(request, runtime);
    }

    public MuteCallResponse muteCallWithOptions(MuteCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MuteCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new MuteCallResponse());
    }

    public MuteCallResponse muteCall(MuteCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.muteCallWithOptions(request, runtime);
    }

    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AnswerCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AnswerCallResponse());
    }

    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    public ListIntervalAgentReportResponse listIntervalAgentReportWithOptions(ListIntervalAgentReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIntervalAgentReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIntervalAgentReportResponse());
    }

    public ListIntervalAgentReportResponse listIntervalAgentReport(ListIntervalAgentReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIntervalAgentReportWithOptions(request, runtime);
    }

    public ListCallDetailRecordsResponse listCallDetailRecordsWithOptions(ListCallDetailRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCallDetailRecords", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListCallDetailRecordsResponse());
    }

    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    public RemovePhoneNumbersResponse removePhoneNumbersWithOptions(RemovePhoneNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePhoneNumbers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePhoneNumbersResponse());
    }

    public RemovePhoneNumbersResponse removePhoneNumbers(RemovePhoneNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePhoneNumbersWithOptions(request, runtime);
    }

    public CancelAttendedTransferResponse cancelAttendedTransferWithOptions(CancelAttendedTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelAttendedTransfer", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CancelAttendedTransferResponse());
    }

    public CancelAttendedTransferResponse cancelAttendedTransfer(CancelAttendedTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelAttendedTransferWithOptions(request, runtime);
    }

    public TakeBreakResponse takeBreakWithOptions(TakeBreakRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TakeBreak", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new TakeBreakResponse());
    }

    public TakeBreakResponse takeBreak(TakeBreakRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.takeBreakWithOptions(request, runtime);
    }

    public ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReportWithOptions(ListHistoricalSkillGroupReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHistoricalSkillGroupReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListHistoricalSkillGroupReportResponse());
    }

    public ListHistoricalSkillGroupReportResponse listHistoricalSkillGroupReport(ListHistoricalSkillGroupReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHistoricalSkillGroupReportWithOptions(request, runtime);
    }

    public SendDtmfSignalingResponse sendDtmfSignalingWithOptions(SendDtmfSignalingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendDtmfSignaling", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendDtmfSignalingResponse());
    }

    public SendDtmfSignalingResponse sendDtmfSignaling(SendDtmfSignalingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendDtmfSignalingWithOptions(request, runtime);
    }

    public ListRecentCallDetailRecordsResponse listRecentCallDetailRecordsWithOptions(ListRecentCallDetailRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRecentCallDetailRecords", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRecentCallDetailRecordsResponse());
    }

    public ListRecentCallDetailRecordsResponse listRecentCallDetailRecords(ListRecentCallDetailRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRecentCallDetailRecordsWithOptions(request, runtime);
    }

    public InitiateAttendedTransferResponse initiateAttendedTransferWithOptions(InitiateAttendedTransferRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitiateAttendedTransfer", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new InitiateAttendedTransferResponse());
    }

    public InitiateAttendedTransferResponse initiateAttendedTransfer(InitiateAttendedTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initiateAttendedTransferWithOptions(request, runtime);
    }

    public MakeCallResponse makeCallWithOptions(MakeCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MakeCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new MakeCallResponse());
    }

    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public AddUsersToSkillGroupResponse addUsersToSkillGroupWithOptions(AddUsersToSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUsersToSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddUsersToSkillGroupResponse());
    }

    public AddUsersToSkillGroupResponse addUsersToSkillGroup(AddUsersToSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUsersToSkillGroupWithOptions(request, runtime);
    }

    public ListConfigItemsResponse listConfigItemsWithOptions(ListConfigItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConfigItems", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListConfigItemsResponse());
    }

    public ListConfigItemsResponse listConfigItems(ListConfigItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigItemsWithOptions(request, runtime);
    }

    public SignInGroupResponse signInGroupWithOptions(SignInGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SignInGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SignInGroupResponse());
    }

    public SignInGroupResponse signInGroup(SignInGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signInGroupWithOptions(request, runtime);
    }

    public GetRealtimeInstanceStatesResponse getRealtimeInstanceStatesWithOptions(GetRealtimeInstanceStatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRealtimeInstanceStates", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRealtimeInstanceStatesResponse());
    }

    public GetRealtimeInstanceStatesResponse getRealtimeInstanceStates(GetRealtimeInstanceStatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRealtimeInstanceStatesWithOptions(request, runtime);
    }

    public ModifySkillGroupResponse modifySkillGroupWithOptions(ModifySkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySkillGroupResponse());
    }

    public ModifySkillGroupResponse modifySkillGroup(ModifySkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySkillGroupWithOptions(request, runtime);
    }

    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserResponse());
    }

    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    public AddPhoneNumberToSkillGroupsResponse addPhoneNumberToSkillGroupsWithOptions(AddPhoneNumberToSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddPhoneNumberToSkillGroups", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddPhoneNumberToSkillGroupsResponse());
    }

    public AddPhoneNumberToSkillGroupsResponse addPhoneNumberToSkillGroups(AddPhoneNumberToSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPhoneNumberToSkillGroupsWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevices", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public RetrieveCallResponse retrieveCallWithOptions(RetrieveCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetrieveCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RetrieveCallResponse());
    }

    public RetrieveCallResponse retrieveCall(RetrieveCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retrieveCallWithOptions(request, runtime);
    }

    public ListSkillGroupsResponse listSkillGroupsWithOptions(ListSkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroups", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSkillGroupsResponse());
    }

    public ListSkillGroupsResponse listSkillGroups(ListSkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupsWithOptions(request, runtime);
    }

    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HoldCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new HoldCallResponse());
    }

    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterDevice", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUserWithOptions(RemovePersonalNumbersFromUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemovePersonalNumbersFromUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemovePersonalNumbersFromUserResponse());
    }

    public RemovePersonalNumbersFromUserResponse removePersonalNumbersFromUser(RemovePersonalNumbersFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removePersonalNumbersFromUserWithOptions(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstance", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    public ListOutboundNumbersOfUserResponse listOutboundNumbersOfUserWithOptions(ListOutboundNumbersOfUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundNumbersOfUser", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListOutboundNumbersOfUserResponse());
    }

    public ListOutboundNumbersOfUserResponse listOutboundNumbersOfUser(ListOutboundNumbersOfUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundNumbersOfUserWithOptions(request, runtime);
    }

    public PollUserStatusResponse pollUserStatusWithOptions(PollUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PollUserStatus", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new PollUserStatusResponse());
    }

    public PollUserStatusResponse pollUserStatus(PollUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pollUserStatusWithOptions(request, runtime);
    }

    public ReadyForServiceResponse readyForServiceWithOptions(ReadyForServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReadyForService", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReadyForServiceResponse());
    }

    public ReadyForServiceResponse readyForService(ReadyForServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.readyForServiceWithOptions(request, runtime);
    }

    public GetMultiChannelRecordingResponse getMultiChannelRecordingWithOptions(GetMultiChannelRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMultiChannelRecording", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMultiChannelRecordingResponse());
    }

    public GetMultiChannelRecordingResponse getMultiChannelRecording(GetMultiChannelRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMultiChannelRecordingWithOptions(request, runtime);
    }

    public BargeInCallResponse bargeInCallWithOptions(BargeInCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BargeInCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new BargeInCallResponse());
    }

    public BargeInCallResponse bargeInCall(BargeInCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bargeInCallWithOptions(request, runtime);
    }

    public ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroupWithOptions(ListPhoneNumbersOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhoneNumbersOfSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPhoneNumbersOfSkillGroupResponse());
    }

    public ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroup(ListPhoneNumbersOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhoneNumbersOfSkillGroupWithOptions(request, runtime);
    }

    public SignOutGroupResponse signOutGroupWithOptions(SignOutGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SignOutGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SignOutGroupResponse());
    }

    public SignOutGroupResponse signOutGroup(SignOutGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signOutGroupWithOptions(request, runtime);
    }

    public SaveRTCStatsV2Response saveRTCStatsV2WithOptions(SaveRTCStatsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveRTCStatsV2", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveRTCStatsV2Response());
    }

    public SaveRTCStatsV2Response saveRTCStatsV2(SaveRTCStatsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveRTCStatsV2WithOptions(request, runtime);
    }

    public GetHistoricalCallerReportResponse getHistoricalCallerReportWithOptions(GetHistoricalCallerReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHistoricalCallerReport", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetHistoricalCallerReportResponse());
    }

    public GetHistoricalCallerReportResponse getHistoricalCallerReport(GetHistoricalCallerReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHistoricalCallerReportWithOptions(request, runtime);
    }

    public ModifyUserLevelsOfSkillGroupResponse modifyUserLevelsOfSkillGroupWithOptions(ModifyUserLevelsOfSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUserLevelsOfSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUserLevelsOfSkillGroupResponse());
    }

    public ModifyUserLevelsOfSkillGroupResponse modifyUserLevelsOfSkillGroup(ModifyUserLevelsOfSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUserLevelsOfSkillGroupWithOptions(request, runtime);
    }

    public SaveTerminalLogResponse saveTerminalLogWithOptions(SaveTerminalLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTerminalLog", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTerminalLogResponse());
    }

    public SaveTerminalLogResponse saveTerminalLog(SaveTerminalLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTerminalLogWithOptions(request, runtime);
    }

    public ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStatesWithOptions(ListRealtimeSkillGroupStatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRealtimeSkillGroupStates", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRealtimeSkillGroupStatesResponse());
    }

    public ListRealtimeSkillGroupStatesResponse listRealtimeSkillGroupStates(ListRealtimeSkillGroupStatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRealtimeSkillGroupStatesWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroup", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public PickOutboundNumbersResponse pickOutboundNumbersWithOptions(PickOutboundNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PickOutboundNumbers", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new PickOutboundNumbersResponse());
    }

    public PickOutboundNumbersResponse pickOutboundNumbers(PickOutboundNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pickOutboundNumbersWithOptions(request, runtime);
    }

    public ReleaseCallResponse releaseCallWithOptions(ReleaseCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseCall", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseCallResponse());
    }

    public ReleaseCallResponse releaseCall(ReleaseCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseCallWithOptions(request, runtime);
    }

    public GetLoginDetailsResponse getLoginDetailsWithOptions(GetLoginDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoginDetails", "2020-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoginDetailsResponse());
    }

    public GetLoginDetailsResponse getLoginDetails(GetLoginDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginDetailsWithOptions(request, runtime);
    }
}
