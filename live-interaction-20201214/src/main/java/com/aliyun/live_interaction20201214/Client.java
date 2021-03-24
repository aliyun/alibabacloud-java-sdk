// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214;

import com.aliyun.tea.*;
import com.aliyun.live_interaction20201214.models.*;
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
        this._endpoint = this.getEndpoint("live-interaction", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListAppInfosResponse listAppInfosWithOptions(ListAppInfosRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppInfosShrinkRequest request = new ListAppInfosShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAppInfos", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppInfosResponse());
    }

    public ListAppInfosResponse listAppInfos(ListAppInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppInfosWithOptions(request, runtime);
    }

    public RemoveSingleChatExtensionByKeysResponse removeSingleChatExtensionByKeysWithOptions(RemoveSingleChatExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveSingleChatExtensionByKeysShrinkRequest request = new RemoveSingleChatExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSingleChatExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSingleChatExtensionByKeysResponse());
    }

    public RemoveSingleChatExtensionByKeysResponse removeSingleChatExtensionByKeys(RemoveSingleChatExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSingleChatExtensionByKeysWithOptions(request, runtime);
    }

    public ImportMessageResponse importMessageWithOptions(ImportMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportMessageShrinkRequest request = new ImportMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportMessage", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ImportMessageResponse());
    }

    public ImportMessageResponse importMessage(ImportMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importMessageWithOptions(request, runtime);
    }

    public SilenceAllGroupMembersResponse silenceAllGroupMembersWithOptions(SilenceAllGroupMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SilenceAllGroupMembersShrinkRequest request = new SilenceAllGroupMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SilenceAllGroupMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SilenceAllGroupMembersResponse());
    }

    public SilenceAllGroupMembersResponse silenceAllGroupMembers(SilenceAllGroupMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.silenceAllGroupMembersWithOptions(request, runtime);
    }

    public SetGroupExtensionByKeysResponse setGroupExtensionByKeysWithOptions(SetGroupExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetGroupExtensionByKeysShrinkRequest request = new SetGroupExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGroupExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetGroupExtensionByKeysResponse());
    }

    public SetGroupExtensionByKeysResponse setGroupExtensionByKeys(SetGroupExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGroupExtensionByKeysWithOptions(request, runtime);
    }

    public RemoveGroupMemberExtensionByKeysResponse removeGroupMemberExtensionByKeysWithOptions(RemoveGroupMemberExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveGroupMemberExtensionByKeysShrinkRequest request = new RemoveGroupMemberExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGroupMemberExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGroupMemberExtensionByKeysResponse());
    }

    public RemoveGroupMemberExtensionByKeysResponse removeGroupMemberExtensionByKeys(RemoveGroupMemberExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGroupMemberExtensionByKeysWithOptions(request, runtime);
    }

    public AddGroupSilenceBlacklistResponse addGroupSilenceBlacklistWithOptions(AddGroupSilenceBlacklistRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGroupSilenceBlacklistShrinkRequest request = new AddGroupSilenceBlacklistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGroupSilenceBlacklist", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new AddGroupSilenceBlacklistResponse());
    }

    public AddGroupSilenceBlacklistResponse addGroupSilenceBlacklist(AddGroupSilenceBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGroupSilenceBlacklistWithOptions(request, runtime);
    }

    public RemoveGroupSilenceWhitelistResponse removeGroupSilenceWhitelistWithOptions(RemoveGroupSilenceWhitelistRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveGroupSilenceWhitelistShrinkRequest request = new RemoveGroupSilenceWhitelistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGroupSilenceWhitelist", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGroupSilenceWhitelistResponse());
    }

    public RemoveGroupSilenceWhitelistResponse removeGroupSilenceWhitelist(RemoveGroupSilenceWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGroupSilenceWhitelistWithOptions(request, runtime);
    }

    public ListDetailReportStatisticsResponse listDetailReportStatisticsWithOptions(ListDetailReportStatisticsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDetailReportStatisticsShrinkRequest request = new ListDetailReportStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDetailReportStatistics", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ListDetailReportStatisticsResponse());
    }

    public ListDetailReportStatisticsResponse listDetailReportStatistics(ListDetailReportStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDetailReportStatisticsWithOptions(request, runtime);
    }

    public SetUserConversationExtensionByKeysResponse setUserConversationExtensionByKeysWithOptions(SetUserConversationExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetUserConversationExtensionByKeysShrinkRequest request = new SetUserConversationExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetUserConversationExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetUserConversationExtensionByKeysResponse());
    }

    public SetUserConversationExtensionByKeysResponse setUserConversationExtensionByKeys(SetUserConversationExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setUserConversationExtensionByKeysWithOptions(request, runtime);
    }

    public GetGroupByIdResponse getGroupByIdWithOptions(GetGroupByIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetGroupByIdShrinkRequest request = new GetGroupByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGroupById", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetGroupByIdResponse());
    }

    public GetGroupByIdResponse getGroupById(GetGroupByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupByIdWithOptions(request, runtime);
    }

    public UpdateTenantStatusResponse updateTenantStatusWithOptions(UpdateTenantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTenantStatus", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTenantStatusResponse());
    }

    public UpdateTenantStatusResponse updateTenantStatus(UpdateTenantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTenantStatusWithOptions(request, runtime);
    }

    public GetCommonConfigResponse getCommonConfigWithOptions(GetCommonConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCommonConfig", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetCommonConfigResponse());
    }

    public GetCommonConfigResponse getCommonConfig(GetCommonConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCommonConfigWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendMessageShrinkRequest request = new SendMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessage", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageResponse());
    }

    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    public UpdateGroupMembersRoleResponse updateGroupMembersRoleWithOptions(UpdateGroupMembersRoleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGroupMembersRoleShrinkRequest request = new UpdateGroupMembersRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupMembersRole", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupMembersRoleResponse());
    }

    public UpdateGroupMembersRoleResponse updateGroupMembersRole(UpdateGroupMembersRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupMembersRoleWithOptions(request, runtime);
    }

    public CancelSilenceAllGroupMembersResponse cancelSilenceAllGroupMembersWithOptions(CancelSilenceAllGroupMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelSilenceAllGroupMembersShrinkRequest request = new CancelSilenceAllGroupMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelSilenceAllGroupMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CancelSilenceAllGroupMembersResponse());
    }

    public CancelSilenceAllGroupMembersResponse cancelSilenceAllGroupMembers(CancelSilenceAllGroupMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelSilenceAllGroupMembersWithOptions(request, runtime);
    }

    public UpdateGroupIconResponse updateGroupIconWithOptions(UpdateGroupIconRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGroupIconShrinkRequest request = new UpdateGroupIconShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupIcon", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupIconResponse());
    }

    public UpdateGroupIconResponse updateGroupIcon(UpdateGroupIconRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupIconWithOptions(request, runtime);
    }

    public RemoveGroupMembersResponse removeGroupMembersWithOptions(RemoveGroupMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveGroupMembersShrinkRequest request = new RemoveGroupMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGroupMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGroupMembersResponse());
    }

    public RemoveGroupMembersResponse removeGroupMembers(RemoveGroupMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGroupMembersWithOptions(request, runtime);
    }

    public ListGroupAllMembersResponse listGroupAllMembersWithOptions(ListGroupAllMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGroupAllMembersShrinkRequest request = new ListGroupAllMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroupAllMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupAllMembersResponse());
    }

    public ListGroupAllMembersResponse listGroupAllMembers(ListGroupAllMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupAllMembersWithOptions(request, runtime);
    }

    public GetUserMuteSettingResponse getUserMuteSettingWithOptions(GetUserMuteSettingRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserMuteSettingShrinkRequest request = new GetUserMuteSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserMuteSetting", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserMuteSettingResponse());
    }

    public GetUserMuteSettingResponse getUserMuteSetting(GetUserMuteSettingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserMuteSettingWithOptions(request, runtime);
    }

    public AddGroupMembersResponse addGroupMembersWithOptions(AddGroupMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGroupMembersShrinkRequest request = new AddGroupMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGroupMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new AddGroupMembersResponse());
    }

    public AddGroupMembersResponse addGroupMembers(AddGroupMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGroupMembersWithOptions(request, runtime);
    }

    public GetGroupMemberByIdsResponse getGroupMemberByIdsWithOptions(GetGroupMemberByIdsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetGroupMemberByIdsShrinkRequest request = new GetGroupMemberByIdsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGroupMemberByIds", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetGroupMemberByIdsResponse());
    }

    public GetGroupMemberByIdsResponse getGroupMemberByIds(GetGroupMemberByIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupMemberByIdsWithOptions(request, runtime);
    }

    public UpdateAppNameResponse updateAppNameWithOptions(UpdateAppNameRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppNameShrinkRequest request = new UpdateAppNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppName", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppNameResponse());
    }

    public UpdateAppNameResponse updateAppName(UpdateAppNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppNameWithOptions(request, runtime);
    }

    public GetIMConfigResponse getIMConfigWithOptions(GetIMConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIMConfig", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetIMConfigResponse());
    }

    public GetIMConfigResponse getIMConfig(GetIMConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIMConfigWithOptions(request, runtime);
    }

    public SetSingleChatExtensionByKeysResponse setSingleChatExtensionByKeysWithOptions(SetSingleChatExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSingleChatExtensionByKeysShrinkRequest request = new SetSingleChatExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetSingleChatExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetSingleChatExtensionByKeysResponse());
    }

    public SetSingleChatExtensionByKeysResponse setSingleChatExtensionByKeys(SetSingleChatExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSingleChatExtensionByKeysWithOptions(request, runtime);
    }

    public UpdateAppStatusResponse updateAppStatusWithOptions(UpdateAppStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppStatusShrinkRequest request = new UpdateAppStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppStatus", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppStatusResponse());
    }

    public UpdateAppStatusResponse updateAppStatus(UpdateAppStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppStatusWithOptions(request, runtime);
    }

    public MuteUsersResponse muteUsersWithOptions(MuteUsersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MuteUsersShrinkRequest request = new MuteUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MuteUsers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new MuteUsersResponse());
    }

    public MuteUsersResponse muteUsers(MuteUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.muteUsersWithOptions(request, runtime);
    }

    public RecallMessageResponse recallMessageWithOptions(RecallMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecallMessageShrinkRequest request = new RecallMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecallMessage", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RecallMessageResponse());
    }

    public RecallMessageResponse recallMessage(RecallMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recallMessageWithOptions(request, runtime);
    }

    public AddGroupSilenceWhitelistResponse addGroupSilenceWhitelistWithOptions(AddGroupSilenceWhitelistRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGroupSilenceWhitelistShrinkRequest request = new AddGroupSilenceWhitelistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGroupSilenceWhitelist", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new AddGroupSilenceWhitelistResponse());
    }

    public AddGroupSilenceWhitelistResponse addGroupSilenceWhitelist(AddGroupSilenceWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGroupSilenceWhitelistWithOptions(request, runtime);
    }

    public SetGroupOwnerResponse setGroupOwnerWithOptions(SetGroupOwnerRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetGroupOwnerShrinkRequest request = new SetGroupOwnerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGroupOwner", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetGroupOwnerResponse());
    }

    public SetGroupOwnerResponse setGroupOwner(SetGroupOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGroupOwnerWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public RemoveGroupSilenceBlacklistResponse removeGroupSilenceBlacklistWithOptions(RemoveGroupSilenceBlacklistRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveGroupSilenceBlacklistShrinkRequest request = new RemoveGroupSilenceBlacklistShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGroupSilenceBlacklist", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGroupSilenceBlacklistResponse());
    }

    public RemoveGroupSilenceBlacklistResponse removeGroupSilenceBlacklist(RemoveGroupSilenceBlacklistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGroupSilenceBlacklistWithOptions(request, runtime);
    }

    public RemoveMessageExtensionByKeysResponse removeMessageExtensionByKeysWithOptions(RemoveMessageExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveMessageExtensionByKeysShrinkRequest request = new RemoveMessageExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveMessageExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveMessageExtensionByKeysResponse());
    }

    public RemoveMessageExtensionByKeysResponse removeMessageExtensionByKeys(RemoveMessageExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMessageExtensionByKeysWithOptions(request, runtime);
    }

    public GetMediaUploadUrlResponse getMediaUploadUrlWithOptions(GetMediaUploadUrlRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMediaUploadUrlShrinkRequest request = new GetMediaUploadUrlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaUploadUrl", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaUploadUrlResponse());
    }

    public GetMediaUploadUrlResponse getMediaUploadUrl(GetMediaUploadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaUploadUrlWithOptions(request, runtime);
    }

    public GetMediaUrlResponse getMediaUrlWithOptions(GetMediaUrlRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMediaUrlShrinkRequest request = new GetMediaUrlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMediaUrl", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetMediaUrlResponse());
    }

    public GetMediaUrlResponse getMediaUrl(GetMediaUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMediaUrlWithOptions(request, runtime);
    }

    public ImportSingleConversationResponse importSingleConversationWithOptions(ImportSingleConversationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportSingleConversationShrinkRequest request = new ImportSingleConversationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportSingleConversation", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ImportSingleConversationResponse());
    }

    public ImportSingleConversationResponse importSingleConversation(ImportSingleConversationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importSingleConversationWithOptions(request, runtime);
    }

    public InitTenantResponse initTenantWithOptions(InitTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitTenant", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new InitTenantResponse());
    }

    public InitTenantResponse initTenant(InitTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initTenantWithOptions(request, runtime);
    }

    public ImportGroupChatMemberResponse importGroupChatMemberWithOptions(ImportGroupChatMemberRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportGroupChatMemberShrinkRequest request = new ImportGroupChatMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportGroupChatMember", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ImportGroupChatMemberResponse());
    }

    public ImportGroupChatMemberResponse importGroupChatMember(ImportGroupChatMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importGroupChatMemberWithOptions(request, runtime);
    }

    public ListGroupSilenceMembersResponse listGroupSilenceMembersWithOptions(ListGroupSilenceMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGroupSilenceMembersShrinkRequest request = new ListGroupSilenceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroupSilenceMembers", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupSilenceMembersResponse());
    }

    public ListGroupSilenceMembersResponse listGroupSilenceMembers(ListGroupSilenceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupSilenceMembersWithOptions(request, runtime);
    }

    public RemoveGroupExtensionByKeysResponse removeGroupExtensionByKeysWithOptions(RemoveGroupExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveGroupExtensionByKeysShrinkRequest request = new RemoveGroupExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGroupExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGroupExtensionByKeysResponse());
    }

    public RemoveGroupExtensionByKeysResponse removeGroupExtensionByKeys(RemoveGroupExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGroupExtensionByKeysWithOptions(request, runtime);
    }

    public SetGroupMemberExtensionByKeysResponse setGroupMemberExtensionByKeysWithOptions(SetGroupMemberExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetGroupMemberExtensionByKeysShrinkRequest request = new SetGroupMemberExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetGroupMemberExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetGroupMemberExtensionByKeysResponse());
    }

    public SetGroupMemberExtensionByKeysResponse setGroupMemberExtensionByKeys(SetGroupMemberExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setGroupMemberExtensionByKeysWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateGroupShrinkRequest request = new CreateGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroup", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupResponse());
    }

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public GetMessageByIdResponse getMessageByIdWithOptions(GetMessageByIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMessageByIdShrinkRequest request = new GetMessageByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMessageById", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetMessageByIdResponse());
    }

    public GetMessageByIdResponse getMessageById(GetMessageByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMessageByIdWithOptions(request, runtime);
    }

    public DestroyRoomResponse destroyRoomWithOptions(DestroyRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DestroyRoom", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DestroyRoomResponse());
    }

    public DestroyRoomResponse destroyRoom(DestroyRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyRoomWithOptions(request, runtime);
    }

    public KickOffResponse kickOffWithOptions(KickOffRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        KickOffShrinkRequest request = new KickOffShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KickOff", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new KickOffResponse());
    }

    public KickOffResponse kickOff(KickOffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.kickOffWithOptions(request, runtime);
    }

    public UpdateMsgRecallIntervalResponse updateMsgRecallIntervalWithOptions(UpdateMsgRecallIntervalRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMsgRecallIntervalShrinkRequest request = new UpdateMsgRecallIntervalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMsgRecallInterval", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMsgRecallIntervalResponse());
    }

    public UpdateMsgRecallIntervalResponse updateMsgRecallInterval(UpdateMsgRecallIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMsgRecallIntervalWithOptions(request, runtime);
    }

    public UpdateGroupTitleResponse updateGroupTitleWithOptions(UpdateGroupTitleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGroupTitleShrinkRequest request = new UpdateGroupTitleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupTitle", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupTitleResponse());
    }

    public UpdateGroupTitleResponse updateGroupTitle(UpdateGroupTitleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupTitleWithOptions(request, runtime);
    }

    public GetLoginTokenResponse getLoginTokenWithOptions(GetLoginTokenRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLoginTokenShrinkRequest request = new GetLoginTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoginToken", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoginTokenResponse());
    }

    public GetLoginTokenResponse getLoginToken(GetLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginTokenWithOptions(request, runtime);
    }

    public DismissGroupResponse dismissGroupWithOptions(DismissGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DismissGroupShrinkRequest request = new DismissGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DismissGroup", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DismissGroupResponse());
    }

    public DismissGroupResponse dismissGroup(DismissGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dismissGroupWithOptions(request, runtime);
    }

    public ImportGroupChatConversationResponse importGroupChatConversationWithOptions(ImportGroupChatConversationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportGroupChatConversationShrinkRequest request = new ImportGroupChatConversationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportGroupChatConversation", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ImportGroupChatConversationResponse());
    }

    public ImportGroupChatConversationResponse importGroupChatConversation(ImportGroupChatConversationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importGroupChatConversationWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRoom", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public RemoveUserConversationExtensionByKeysResponse removeUserConversationExtensionByKeysWithOptions(RemoveUserConversationExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveUserConversationExtensionByKeysShrinkRequest request = new RemoveUserConversationExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUserConversationExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUserConversationExtensionByKeysResponse());
    }

    public RemoveUserConversationExtensionByKeysResponse removeUserConversationExtensionByKeys(RemoveUserConversationExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUserConversationExtensionByKeysWithOptions(request, runtime);
    }

    public SetMessageExtensionByKeysResponse setMessageExtensionByKeysWithOptions(SetMessageExtensionByKeysRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetMessageExtensionByKeysShrinkRequest request = new SetMessageExtensionByKeysShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestParams))) {
            request.requestParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestParams), "RequestParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetMessageExtensionByKeys", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetMessageExtensionByKeysResponse());
    }

    public SetMessageExtensionByKeysResponse setMessageExtensionByKeys(SetMessageExtensionByKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setMessageExtensionByKeysWithOptions(request, runtime);
    }
}
