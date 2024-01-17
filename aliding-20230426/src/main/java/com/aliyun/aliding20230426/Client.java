// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426;

import com.aliyun.tea.*;
import com.aliyun.aliding20230426.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aliding", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAttendeeResponse addAttendeeWithOptions(AddAttendeeRequest tmpReq, AddAttendeeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAttendeeShrinkRequest request = new AddAttendeeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddAttendeeShrinkHeaders headers = new AddAttendeeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attendeesToAdd)) {
            request.attendeesToAddShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attendeesToAdd, "AttendeesToAdd", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attendeesToAddShrink)) {
            body.put("AttendeesToAdd", request.attendeesToAddShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatNotification)) {
            body.put("chatNotification", request.chatNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushNotification)) {
            body.put("pushNotification", request.pushNotification);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAttendee"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/addAttendee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAttendeeResponse());
    }

    public AddAttendeeResponse addAttendee(AddAttendeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAttendeeHeaders headers = new AddAttendeeHeaders();
        return this.addAttendeeWithOptions(request, headers, runtime);
    }

    public AddMeetingRoomsResponse addMeetingRoomsWithOptions(AddMeetingRoomsRequest tmpReq, AddMeetingRoomsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddMeetingRoomsShrinkRequest request = new AddMeetingRoomsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddMeetingRoomsShrinkHeaders headers = new AddMeetingRoomsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.meetingRoomsToAdd)) {
            request.meetingRoomsToAddShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.meetingRoomsToAdd, "MeetingRoomsToAdd", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingRoomsToAddShrink)) {
            body.put("MeetingRoomsToAdd", request.meetingRoomsToAddShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMeetingRooms"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/addMeetingRooms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMeetingRoomsResponse());
    }

    public AddMeetingRoomsResponse addMeetingRooms(AddMeetingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMeetingRoomsHeaders headers = new AddMeetingRoomsHeaders();
        return this.addMeetingRoomsWithOptions(request, headers, runtime);
    }

    public AddScenegroupMemberResponse addScenegroupMemberWithOptions(AddScenegroupMemberRequest request, AddScenegroupMemberHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        AddScenegroupMemberShrinkHeaders headers = new AddScenegroupMemberShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("UserIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddScenegroupMember"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/addScenegroupMember"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddScenegroupMemberResponse());
    }

    public AddScenegroupMemberResponse addScenegroupMember(AddScenegroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddScenegroupMemberHeaders headers = new AddScenegroupMemberHeaders();
        return this.addScenegroupMemberWithOptions(request, headers, runtime);
    }

    public AddWorkspaceResponse addWorkspaceWithOptions(AddWorkspaceRequest tmpReq, AddWorkspaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddWorkspaceShrinkRequest request = new AddWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddWorkspaceShrinkHeaders headers = new AddWorkspaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.option)) {
            request.optionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.option, "Option", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("Option", request.optionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/addWorkspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceResponse());
    }

    public AddWorkspaceResponse addWorkspace(AddWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceHeaders headers = new AddWorkspaceHeaders();
        return this.addWorkspaceWithOptions(request, headers, runtime);
    }

    public AddWorkspaceDocMembersResponse addWorkspaceDocMembersWithOptions(AddWorkspaceDocMembersRequest tmpReq, AddWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddWorkspaceDocMembersShrinkRequest request = new AddWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddWorkspaceDocMembersShrinkHeaders headers = new AddWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/addWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceDocMembersResponse());
    }

    public AddWorkspaceDocMembersResponse addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceDocMembersHeaders headers = new AddWorkspaceDocMembersHeaders();
        return this.addWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public AddWorkspaceMembersResponse addWorkspaceMembersWithOptions(AddWorkspaceMembersRequest tmpReq, AddWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddWorkspaceMembersShrinkRequest request = new AddWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        AddWorkspaceMembersShrinkHeaders headers = new AddWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/addWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceMembersResponse());
    }

    public AddWorkspaceMembersResponse addWorkspaceMembers(AddWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceMembersHeaders headers = new AddWorkspaceMembersHeaders();
        return this.addWorkspaceMembersWithOptions(request, headers, runtime);
    }

    public BatchGetFormDataByIdListResponse batchGetFormDataByIdListWithOptions(BatchGetFormDataByIdListRequest tmpReq, BatchGetFormDataByIdListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetFormDataByIdListShrinkRequest request = new BatchGetFormDataByIdListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        BatchGetFormDataByIdListShrinkHeaders headers = new BatchGetFormDataByIdListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.formInstanceIdList)) {
            request.formInstanceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.formInstanceIdList, "FormInstanceIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceIdListShrink)) {
            body.put("FormInstanceIdList", request.formInstanceIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needFormInstanceValue)) {
            body.put("NeedFormInstanceValue", request.needFormInstanceValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetFormDataByIdList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/batchGetFormDataByIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetFormDataByIdListResponse());
    }

    public BatchGetFormDataByIdListResponse batchGetFormDataByIdList(BatchGetFormDataByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchGetFormDataByIdListHeaders headers = new BatchGetFormDataByIdListHeaders();
        return this.batchGetFormDataByIdListWithOptions(request, headers, runtime);
    }

    public BatchRemovalByFormInstanceIdListResponse batchRemovalByFormInstanceIdListWithOptions(BatchRemovalByFormInstanceIdListRequest tmpReq, BatchRemovalByFormInstanceIdListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchRemovalByFormInstanceIdListShrinkRequest request = new BatchRemovalByFormInstanceIdListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        BatchRemovalByFormInstanceIdListShrinkHeaders headers = new BatchRemovalByFormInstanceIdListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.formInstanceIdList)) {
            request.formInstanceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.formInstanceIdList, "FormInstanceIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asynchronousExecution)) {
            body.put("AsynchronousExecution", request.asynchronousExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeExpression)) {
            body.put("ExecuteExpression", request.executeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceIdListShrink)) {
            body.put("FormInstanceIdList", request.formInstanceIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRemovalByFormInstanceIdList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/batchRemovalByFormInstanceIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRemovalByFormInstanceIdListResponse());
    }

    public BatchRemovalByFormInstanceIdListResponse batchRemovalByFormInstanceIdList(BatchRemovalByFormInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchRemovalByFormInstanceIdListHeaders headers = new BatchRemovalByFormInstanceIdListHeaders();
        return this.batchRemovalByFormInstanceIdListWithOptions(request, headers, runtime);
    }

    public BatchSaveFormDataResponse batchSaveFormDataWithOptions(BatchSaveFormDataRequest tmpReq, BatchSaveFormDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchSaveFormDataShrinkRequest request = new BatchSaveFormDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        BatchSaveFormDataShrinkHeaders headers = new BatchSaveFormDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.formDataJsonList)) {
            request.formDataJsonListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.formDataJsonList, "FormDataJsonList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asynchronousExecution)) {
            body.put("AsynchronousExecution", request.asynchronousExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJsonListShrink)) {
            body.put("FormDataJsonList", request.formDataJsonListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepRunningAfterException)) {
            body.put("KeepRunningAfterException", request.keepRunningAfterException);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpression)) {
            body.put("NoExecuteExpression", request.noExecuteExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSaveFormData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/batchSaveFormData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSaveFormDataResponse());
    }

    public BatchSaveFormDataResponse batchSaveFormData(BatchSaveFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchSaveFormDataHeaders headers = new BatchSaveFormDataHeaders();
        return this.batchSaveFormDataWithOptions(request, headers, runtime);
    }

    public BatchUpdateFormDataByInstanceIdResponse batchUpdateFormDataByInstanceIdWithOptions(BatchUpdateFormDataByInstanceIdRequest tmpReq, BatchUpdateFormDataByInstanceIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFormDataByInstanceIdShrinkRequest request = new BatchUpdateFormDataByInstanceIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        BatchUpdateFormDataByInstanceIdShrinkHeaders headers = new BatchUpdateFormDataByInstanceIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.formInstanceIdList)) {
            request.formInstanceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.formInstanceIdList, "FormInstanceIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asynchronousExecution)) {
            body.put("AsynchronousExecution", request.asynchronousExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceIdListShrink)) {
            body.put("FormInstanceIdList", request.formInstanceIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreEmpty)) {
            body.put("IgnoreEmpty", request.ignoreEmpty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpression)) {
            body.put("NoExecuteExpression", request.noExecuteExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFormDataJson)) {
            body.put("UpdateFormDataJson", request.updateFormDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useLatestFormSchemaVersion)) {
            body.put("UseLatestFormSchemaVersion", request.useLatestFormSchemaVersion);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateFormDataByInstanceId"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/batchUpdateFormDataByInstanceId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateFormDataByInstanceIdResponse());
    }

    public BatchUpdateFormDataByInstanceIdResponse batchUpdateFormDataByInstanceId(BatchUpdateFormDataByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchUpdateFormDataByInstanceIdHeaders headers = new BatchUpdateFormDataByInstanceIdHeaders();
        return this.batchUpdateFormDataByInstanceIdWithOptions(request, headers, runtime);
    }

    public BatchUpdateFormDataByInstanceMapResponse batchUpdateFormDataByInstanceMapWithOptions(BatchUpdateFormDataByInstanceMapRequest tmpReq, BatchUpdateFormDataByInstanceMapHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchUpdateFormDataByInstanceMapShrinkRequest request = new BatchUpdateFormDataByInstanceMapShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        BatchUpdateFormDataByInstanceMapShrinkHeaders headers = new BatchUpdateFormDataByInstanceMapShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateFormDataJsonMap)) {
            request.updateFormDataJsonMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateFormDataJsonMap, "UpdateFormDataJsonMap", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asynchronousExecution)) {
            body.put("AsynchronousExecution", request.asynchronousExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreEmpty)) {
            body.put("IgnoreEmpty", request.ignoreEmpty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpression)) {
            body.put("NoExecuteExpression", request.noExecuteExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFormDataJsonMapShrink)) {
            body.put("UpdateFormDataJsonMap", request.updateFormDataJsonMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useLatestFormSchemaVersion)) {
            body.put("UseLatestFormSchemaVersion", request.useLatestFormSchemaVersion);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateFormDataByInstanceMap"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/batchUpdateFormDataByInstanceMap"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateFormDataByInstanceMapResponse());
    }

    public BatchUpdateFormDataByInstanceMapResponse batchUpdateFormDataByInstanceMap(BatchUpdateFormDataByInstanceMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchUpdateFormDataByInstanceMapHeaders headers = new BatchUpdateFormDataByInstanceMapHeaders();
        return this.batchUpdateFormDataByInstanceMapWithOptions(request, headers, runtime);
    }

    public CancelScheduleConferenceResponse cancelScheduleConferenceWithOptions(CancelScheduleConferenceRequest tmpReq, CancelScheduleConferenceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CancelScheduleConferenceShrinkRequest request = new CancelScheduleConferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CancelScheduleConferenceShrinkHeaders headers = new CancelScheduleConferenceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConferenceId)) {
            body.put("ScheduleConferenceId", request.scheduleConferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelScheduleConference"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/cancelScheduleConference"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelScheduleConferenceResponse());
    }

    public CancelScheduleConferenceResponse cancelScheduleConference(CancelScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CancelScheduleConferenceHeaders headers = new CancelScheduleConferenceHeaders();
        return this.cancelScheduleConferenceWithOptions(request, headers, runtime);
    }

    public ClearResponse clearWithOptions(ClearRequest tmpReq, ClearHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ClearShrinkRequest request = new ClearShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ClearShrinkHeaders headers = new ClearShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rangeAddress)) {
            body.put("RangeAddress", request.rangeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Clear"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/clear"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearResponse());
    }

    public ClearResponse clear(ClearRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ClearHeaders headers = new ClearHeaders();
        return this.clearWithOptions(request, headers, runtime);
    }

    public ClearDataResponse clearDataWithOptions(ClearDataRequest tmpReq, ClearDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ClearDataShrinkRequest request = new ClearDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ClearDataShrinkHeaders headers = new ClearDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rangeAddress)) {
            body.put("RangeAddress", request.rangeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/clearData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearDataResponse());
    }

    public ClearDataResponse clearData(ClearDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ClearDataHeaders headers = new ClearDataHeaders();
        return this.clearDataWithOptions(request, headers, runtime);
    }

    public CommentListReportResponse commentListReportWithOptions(CommentListReportRequest tmpReq, CommentListReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CommentListReportShrinkRequest request = new CommentListReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CommentListReportShrinkHeaders headers = new CommentListReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommentListReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/commentListReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommentListReportResponse());
    }

    public CommentListReportResponse commentListReport(CommentListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommentListReportHeaders headers = new CommentListReportHeaders();
        return this.commentListReportWithOptions(request, headers, runtime);
    }

    public CreateDeliveryPlanResponse createDeliveryPlanWithOptions(CreateDeliveryPlanRequest tmpReq, CreateDeliveryPlanHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeliveryPlanShrinkRequest request = new CreateDeliveryPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateDeliveryPlanShrinkHeaders headers = new CreateDeliveryPlanShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "UserIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            body.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resId)) {
            body.put("ResId", request.resId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdListShrink)) {
            body.put("UserIdList", request.userIdListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryPlan"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/createDeliveryPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryPlanResponse());
    }

    public CreateDeliveryPlanResponse createDeliveryPlan(CreateDeliveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeliveryPlanHeaders headers = new CreateDeliveryPlanHeaders();
        return this.createDeliveryPlanWithOptions(request, headers, runtime);
    }

    public CreateEventResponse createEventWithOptions(CreateEventRequest tmpReq, CreateEventHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEventShrinkRequest request = new CreateEventShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateEventShrinkHeaders headers = new CreateEventShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attendees)) {
            request.attendeesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attendees, "Attendees", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.end)) {
            request.endShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.end, "End", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.location)) {
            request.locationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.location, "Location", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.onlineMeetingInfo)) {
            request.onlineMeetingInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.onlineMeetingInfo, "OnlineMeetingInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recurrence)) {
            request.recurrenceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recurrence, "Recurrence", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reminders)) {
            request.remindersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reminders, "Reminders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uiConfigs)) {
            request.uiConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uiConfigs, "UiConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.start)) {
            request.startShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.start, "start", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attendeesShrink)) {
            body.put("Attendees", request.attendeesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endShrink)) {
            body.put("End", request.endShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAllDay)) {
            body.put("IsAllDay", request.isAllDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationShrink)) {
            body.put("Location", request.locationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlineMeetingInfoShrink)) {
            body.put("OnlineMeetingInfo", request.onlineMeetingInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceShrink)) {
            body.put("Recurrence", request.recurrenceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindersShrink)) {
            body.put("Reminders", request.remindersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            body.put("Summary", request.summary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uiConfigsShrink)) {
            body.put("UiConfigs", request.uiConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("calendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startShrink)) {
            body.put("start", request.startShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEvent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/createEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventResponse());
    }

    public CreateEventResponse createEvent(CreateEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateEventHeaders headers = new CreateEventHeaders();
        return this.createEventWithOptions(request, headers, runtime);
    }

    public CreateLiveResponse createLiveWithOptions(CreateLiveRequest tmpReq, CreateLiveHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLiveShrinkRequest request = new CreateLiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateLiveShrinkHeaders headers = new CreateLiveShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            body.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            body.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preEndTime)) {
            body.put("PreEndTime", request.preEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStartTime)) {
            body.put("PreStartTime", request.preStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicType)) {
            body.put("PublicType", request.publicType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLive"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/createLive"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLiveResponse());
    }

    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateLiveHeaders headers = new CreateLiveHeaders();
        return this.createLiveWithOptions(request, headers, runtime);
    }

    public CreateMeetingRoomResponse createMeetingRoomWithOptions(CreateMeetingRoomRequest tmpReq, CreateMeetingRoomHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMeetingRoomShrinkRequest request = new CreateMeetingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateMeetingRoomShrinkHeaders headers = new CreateMeetingRoomShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reservationAuthority)) {
            request.reservationAuthorityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reservationAuthority, "ReservationAuthority", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomLabelIds)) {
            request.roomLabelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomLabelIds, "RoomLabelIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomLocation)) {
            request.roomLocationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomLocation, "RoomLocation", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCycleReservation)) {
            body.put("EnableCycleReservation", request.enableCycleReservation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvRoomId)) {
            body.put("IsvRoomId", request.isvRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservationAuthorityShrink)) {
            body.put("ReservationAuthority", request.reservationAuthorityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCapacity)) {
            body.put("RoomCapacity", request.roomCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomLabelIdsShrink)) {
            body.put("RoomLabelIds", request.roomLabelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomLocationShrink)) {
            body.put("RoomLocation", request.roomLocationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomName)) {
            body.put("RoomName", request.roomName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomPicture)) {
            body.put("RoomPicture", request.roomPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomStatus)) {
            body.put("RoomStatus", request.roomStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMeetingRoom"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/createMeetingRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMeetingRoomResponse());
    }

    public CreateMeetingRoomResponse createMeetingRoom(CreateMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateMeetingRoomHeaders headers = new CreateMeetingRoomHeaders();
        return this.createMeetingRoomWithOptions(request, headers, runtime);
    }

    public CreateMeetingRoomGroupResponse createMeetingRoomGroupWithOptions(CreateMeetingRoomGroupRequest tmpReq, CreateMeetingRoomGroupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMeetingRoomGroupShrinkRequest request = new CreateMeetingRoomGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateMeetingRoomGroupShrinkHeaders headers = new CreateMeetingRoomGroupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentGroupId)) {
            body.put("ParentGroupId", request.parentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMeetingRoomGroup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/createMeetingRoomGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMeetingRoomGroupResponse());
    }

    public CreateMeetingRoomGroupResponse createMeetingRoomGroup(CreateMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateMeetingRoomGroupHeaders headers = new CreateMeetingRoomGroupHeaders();
        return this.createMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    public CreateOrUpdateFormDataResponse createOrUpdateFormDataWithOptions(CreateOrUpdateFormDataRequest request, CreateOrUpdateFormDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        CreateOrUpdateFormDataShrinkHeaders headers = new CreateOrUpdateFormDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJson)) {
            body.put("FormDataJson", request.formDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpression)) {
            body.put("NoExecuteExpression", request.noExecuteExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchCondition)) {
            body.put("SearchCondition", request.searchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateFormData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/createOrUpdateFormData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateFormDataResponse());
    }

    public CreateOrUpdateFormDataResponse createOrUpdateFormData(CreateOrUpdateFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrUpdateFormDataHeaders headers = new CreateOrUpdateFormDataHeaders();
        return this.createOrUpdateFormDataWithOptions(request, headers, runtime);
    }

    public CreateOrgHonorTemplateResponse createOrgHonorTemplateWithOptions(CreateOrgHonorTemplateRequest tmpReq, CreateOrgHonorTemplateHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrgHonorTemplateShrinkRequest request = new CreateOrgHonorTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateOrgHonorTemplateShrinkHeaders headers = new CreateOrgHonorTemplateShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarFrameMediaId)) {
            body.put("avatarFrameMediaId", request.avatarFrameMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultBgColor)) {
            body.put("defaultBgColor", request.defaultBgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.medalDesc)) {
            body.put("medalDesc", request.medalDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.medalMediaId)) {
            body.put("medalMediaId", request.medalMediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.medalName)) {
            body.put("medalName", request.medalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrgHonorTemplate"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/createOrgHonorTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrgHonorTemplateResponse());
    }

    public CreateOrgHonorTemplateResponse createOrgHonorTemplate(CreateOrgHonorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrgHonorTemplateHeaders headers = new CreateOrgHonorTemplateHeaders();
        return this.createOrgHonorTemplateWithOptions(request, headers, runtime);
    }

    public CreateReportResponse createReportWithOptions(CreateReportRequest tmpReq, CreateReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateReportShrinkRequest request = new CreateReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateReportShrinkHeaders headers = new CreateReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contents)) {
            request.contentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contents, "Contents", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toCids)) {
            request.toCidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toCids, "ToCids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toUserids)) {
            request.toUseridsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toUserids, "ToUserids", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentsShrink)) {
            body.put("Contents", request.contentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddFrom)) {
            body.put("DdFrom", request.ddFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toChat)) {
            body.put("ToChat", request.toChat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toCidsShrink)) {
            body.put("ToCids", request.toCidsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUseridsShrink)) {
            body.put("ToUserids", request.toUseridsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/createReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReportResponse());
    }

    public CreateReportResponse createReport(CreateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateReportHeaders headers = new CreateReportHeaders();
        return this.createReportWithOptions(request, headers, runtime);
    }

    public CreateScenegroupResponse createScenegroupWithOptions(CreateScenegroupRequest request, CreateScenegroupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        CreateScenegroupShrinkHeaders headers = new CreateScenegroupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addFriendForbidden)) {
            body.put("AddFriendForbidden", request.addFriendForbidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allMembersCanCreateCalendar)) {
            body.put("AllMembersCanCreateCalendar", request.allMembersCanCreateCalendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allMembersCanCreateMcsConf)) {
            body.put("AllMembersCanCreateMcsConf", request.allMembersCanCreateMcsConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatBannedType)) {
            body.put("ChatBannedType", request.chatBannedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupEmailDisabled)) {
            body.put("GroupEmailDisabled", request.groupEmailDisabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupLiveSwitch)) {
            body.put("GroupLiveSwitch", request.groupLiveSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            body.put("Icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managementType)) {
            body.put("ManagementType", request.managementType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.membersToAdminChat)) {
            body.put("MembersToAdminChat", request.membersToAdminChat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mentionAllAuthority)) {
            body.put("MentionAllAuthority", request.mentionAllAuthority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyAdminCanDing)) {
            body.put("OnlyAdminCanDing", request.onlyAdminCanDing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyAdminCanSetMsgTop)) {
            body.put("OnlyAdminCanSetMsgTop", request.onlyAdminCanSetMsgTop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchable)) {
            body.put("Searchable", request.searchable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showHistoryType)) {
            body.put("ShowHistoryType", request.showHistoryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subadminIds)) {
            body.put("SubadminIds", request.subadminIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("UserIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validationType)) {
            body.put("ValidationType", request.validationType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScenegroup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/createScenegroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScenegroupResponse());
    }

    public CreateScenegroupResponse createScenegroup(CreateScenegroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScenegroupHeaders headers = new CreateScenegroupHeaders();
        return this.createScenegroupWithOptions(request, headers, runtime);
    }

    public CreateScheduleConferenceResponse createScheduleConferenceWithOptions(CreateScheduleConferenceRequest tmpReq, CreateScheduleConferenceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduleConferenceShrinkRequest request = new CreateScheduleConferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateScheduleConferenceShrinkHeaders headers = new CreateScheduleConferenceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduleConference"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/createScheduleConference"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduleConferenceResponse());
    }

    public CreateScheduleConferenceResponse createScheduleConference(CreateScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScheduleConferenceHeaders headers = new CreateScheduleConferenceHeaders();
        return this.createScheduleConferenceWithOptions(request, headers, runtime);
    }

    public CreateSheetResponse createSheetWithOptions(CreateSheetRequest tmpReq, CreateSheetHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSheetShrinkRequest request = new CreateSheetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSheetShrinkHeaders headers = new CreateSheetShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSheet"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createSheet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSheetResponse());
    }

    public CreateSheetResponse createSheet(CreateSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSheetHeaders headers = new CreateSheetHeaders();
        return this.createSheetWithOptions(request, headers, runtime);
    }

    public CreateSubscribedCalendarResponse createSubscribedCalendarWithOptions(CreateSubscribedCalendarRequest tmpReq, CreateSubscribedCalendarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSubscribedCalendarShrinkRequest request = new CreateSubscribedCalendarShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSubscribedCalendarShrinkHeaders headers = new CreateSubscribedCalendarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managers)) {
            request.managersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managers, "Managers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subscribeScope)) {
            request.subscribeScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subscribeScope, "SubscribeScope", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managersShrink)) {
            body.put("Managers", request.managersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeScopeShrink)) {
            body.put("SubscribeScope", request.subscribeScopeShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubscribedCalendar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/createSubscribedCalendar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubscribedCalendarResponse());
    }

    public CreateSubscribedCalendarResponse createSubscribedCalendar(CreateSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSubscribedCalendarHeaders headers = new CreateSubscribedCalendarHeaders();
        return this.createSubscribedCalendarWithOptions(request, headers, runtime);
    }

    public CreateTodoTaskResponse createTodoTaskWithOptions(CreateTodoTaskRequest tmpReq, CreateTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTodoTaskShrinkRequest request = new CreateTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateTodoTaskShrinkHeaders headers = new CreateTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contentFieldList)) {
            request.contentFieldListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contentFieldList, "contentFieldList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.detailUrl)) {
            request.detailUrlShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.detailUrl, "detailUrl", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "executorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyConfigs)) {
            request.notifyConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyConfigs, "notifyConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.participantIds)) {
            request.participantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.participantIds, "participantIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("operatorId", request.operatorId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentFieldListShrink)) {
            body.put("contentFieldList", request.contentFieldListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorId)) {
            body.put("creatorId", request.creatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailUrlShrink)) {
            body.put("detailUrl", request.detailUrlShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            body.put("executorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOnlyShowExecutor)) {
            body.put("isOnlyShowExecutor", request.isOnlyShowExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfigsShrink)) {
            body.put("notifyConfigs", request.notifyConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantIdsShrink)) {
            body.put("participantIds", request.participantIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/createTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTodoTaskResponse());
    }

    public CreateTodoTaskResponse createTodoTask(CreateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTodoTaskHeaders headers = new CreateTodoTaskHeaders();
        return this.createTodoTaskWithOptions(request, headers, runtime);
    }

    public CreateVideoConferenceResponse createVideoConferenceWithOptions(CreateVideoConferenceRequest tmpReq, CreateVideoConferenceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVideoConferenceShrinkRequest request = new CreateVideoConferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateVideoConferenceShrinkHeaders headers = new CreateVideoConferenceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inviteUserIds)) {
            request.inviteUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inviteUserIds, "InviteUserIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confTitle)) {
            body.put("ConfTitle", request.confTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inviteCaller)) {
            body.put("InviteCaller", request.inviteCaller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inviteUserIdsShrink)) {
            body.put("InviteUserIds", request.inviteUserIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoConference"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/createVideoConference"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVideoConferenceResponse());
    }

    public CreateVideoConferenceResponse createVideoConference(CreateVideoConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVideoConferenceHeaders headers = new CreateVideoConferenceHeaders();
        return this.createVideoConferenceWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest tmpReq, CreateWorkspaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkspaceShrinkRequest request = new CreateWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateWorkspaceShrinkHeaders headers = new CreateWorkspaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createWorkspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceHeaders headers = new CreateWorkspaceHeaders();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    public CreateWorkspaceDocResponse createWorkspaceDocWithOptions(CreateWorkspaceDocRequest tmpReq, CreateWorkspaceDocHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkspaceDocShrinkRequest request = new CreateWorkspaceDocShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateWorkspaceDocShrinkHeaders headers = new CreateWorkspaceDocShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docType)) {
            body.put("DocType", request.docType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentNodeId)) {
            body.put("ParentNodeId", request.parentNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            body.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkspaceDoc"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/createWorkspaceDoc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceDocResponse());
    }

    public CreateWorkspaceDocResponse createWorkspaceDoc(CreateWorkspaceDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceDocHeaders headers = new CreateWorkspaceDocHeaders();
        return this.createWorkspaceDocWithOptions(request, headers, runtime);
    }

    public DeleteColumnsResponse deleteColumnsWithOptions(DeleteColumnsRequest tmpReq, DeleteColumnsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteColumnsShrinkRequest request = new DeleteColumnsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteColumnsShrinkHeaders headers = new DeleteColumnsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnCount)) {
            body.put("ColumnCount", request.columnCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteColumns"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteColumns"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteColumnsResponse());
    }

    public DeleteColumnsResponse deleteColumns(DeleteColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteColumnsHeaders headers = new DeleteColumnsHeaders();
        return this.deleteColumnsWithOptions(request, headers, runtime);
    }

    public DeleteEventResponse deleteEventWithOptions(DeleteEventRequest request, DeleteEventHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        DeleteEventShrinkHeaders headers = new DeleteEventShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushNotification)) {
            body.put("pushNotification", request.pushNotification);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEvent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/deleteEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventResponse());
    }

    public DeleteEventResponse deleteEvent(DeleteEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteEventHeaders headers = new DeleteEventHeaders();
        return this.deleteEventWithOptions(request, headers, runtime);
    }

    public DeleteFormDataResponse deleteFormDataWithOptions(DeleteFormDataRequest request, DeleteFormDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        DeleteFormDataShrinkHeaders headers = new DeleteFormDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceId)) {
            body.put("FormInstanceId", request.formInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFormData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/deleteFormData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFormDataResponse());
    }

    public DeleteFormDataResponse deleteFormData(DeleteFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFormDataHeaders headers = new DeleteFormDataHeaders();
        return this.deleteFormDataWithOptions(request, headers, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, DeleteInstanceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        DeleteInstanceShrinkHeaders headers = new DeleteInstanceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/deleteInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteInstanceHeaders headers = new DeleteInstanceHeaders();
        return this.deleteInstanceWithOptions(request, headers, runtime);
    }

    public DeleteLiveResponse deleteLiveWithOptions(DeleteLiveRequest tmpReq, DeleteLiveHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteLiveShrinkRequest request = new DeleteLiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteLiveShrinkHeaders headers = new DeleteLiveShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLive"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/deleteLive"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLiveResponse());
    }

    public DeleteLiveResponse deleteLive(DeleteLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteLiveHeaders headers = new DeleteLiveHeaders();
        return this.deleteLiveWithOptions(request, headers, runtime);
    }

    public DeleteMeetingRoomResponse deleteMeetingRoomWithOptions(DeleteMeetingRoomRequest tmpReq, DeleteMeetingRoomHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteMeetingRoomShrinkRequest request = new DeleteMeetingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteMeetingRoomShrinkHeaders headers = new DeleteMeetingRoomShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMeetingRoom"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/deleteMeetingRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMeetingRoomResponse());
    }

    public DeleteMeetingRoomResponse deleteMeetingRoom(DeleteMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMeetingRoomHeaders headers = new DeleteMeetingRoomHeaders();
        return this.deleteMeetingRoomWithOptions(request, headers, runtime);
    }

    public DeleteMeetingRoomGroupResponse deleteMeetingRoomGroupWithOptions(DeleteMeetingRoomGroupRequest tmpReq, DeleteMeetingRoomGroupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteMeetingRoomGroupShrinkRequest request = new DeleteMeetingRoomGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteMeetingRoomGroupShrinkHeaders headers = new DeleteMeetingRoomGroupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMeetingRoomGroup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/deleteMeetingRoomGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMeetingRoomGroupResponse());
    }

    public DeleteMeetingRoomGroupResponse deleteMeetingRoomGroup(DeleteMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMeetingRoomGroupHeaders headers = new DeleteMeetingRoomGroupHeaders();
        return this.deleteMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    public DeleteRowsResponse deleteRowsWithOptions(DeleteRowsRequest tmpReq, DeleteRowsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRowsShrinkRequest request = new DeleteRowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteRowsShrinkHeaders headers = new DeleteRowsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            body.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            body.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRows"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteRows"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRowsResponse());
    }

    public DeleteRowsResponse deleteRows(DeleteRowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteRowsHeaders headers = new DeleteRowsHeaders();
        return this.deleteRowsWithOptions(request, headers, runtime);
    }

    public DeleteScenegroupMemberResponse deleteScenegroupMemberWithOptions(DeleteScenegroupMemberRequest request, DeleteScenegroupMemberHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        DeleteScenegroupMemberShrinkHeaders headers = new DeleteScenegroupMemberShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("UserIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScenegroupMember"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/deleteScenegroupMember"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScenegroupMemberResponse());
    }

    public DeleteScenegroupMemberResponse deleteScenegroupMember(DeleteScenegroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteScenegroupMemberHeaders headers = new DeleteScenegroupMemberHeaders();
        return this.deleteScenegroupMemberWithOptions(request, headers, runtime);
    }

    public DeleteSheetResponse deleteSheetWithOptions(DeleteSheetRequest tmpReq, DeleteSheetHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSheetShrinkRequest request = new DeleteSheetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteSheetShrinkHeaders headers = new DeleteSheetShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSheet"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteSheet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSheetResponse());
    }

    public DeleteSheetResponse deleteSheet(DeleteSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSheetHeaders headers = new DeleteSheetHeaders();
        return this.deleteSheetWithOptions(request, headers, runtime);
    }

    public DeleteSubscribedCalendarResponse deleteSubscribedCalendarWithOptions(DeleteSubscribedCalendarRequest request, DeleteSubscribedCalendarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        DeleteSubscribedCalendarShrinkHeaders headers = new DeleteSubscribedCalendarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubscribedCalendar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/deleteSubscribedCalendar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubscribedCalendarResponse());
    }

    public DeleteSubscribedCalendarResponse deleteSubscribedCalendar(DeleteSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSubscribedCalendarHeaders headers = new DeleteSubscribedCalendarHeaders();
        return this.deleteSubscribedCalendarWithOptions(request, headers, runtime);
    }

    public DeleteTodoTaskResponse deleteTodoTaskWithOptions(DeleteTodoTaskRequest tmpReq, DeleteTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTodoTaskShrinkRequest request = new DeleteTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteTodoTaskShrinkHeaders headers = new DeleteTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/deleteTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTodoTaskResponse());
    }

    public DeleteTodoTaskResponse deleteTodoTask(DeleteTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTodoTaskHeaders headers = new DeleteTodoTaskHeaders();
        return this.deleteTodoTaskWithOptions(request, headers, runtime);
    }

    public DeleteWorkspaceDocMembersResponse deleteWorkspaceDocMembersWithOptions(DeleteWorkspaceDocMembersRequest tmpReq, DeleteWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWorkspaceDocMembersShrinkRequest request = new DeleteWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteWorkspaceDocMembersShrinkHeaders headers = new DeleteWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceDocMembersResponse());
    }

    public DeleteWorkspaceDocMembersResponse deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceDocMembersHeaders headers = new DeleteWorkspaceDocMembersHeaders();
        return this.deleteWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public DeleteWorkspaceMembersResponse deleteWorkspaceMembersWithOptions(DeleteWorkspaceMembersRequest tmpReq, DeleteWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWorkspaceMembersShrinkRequest request = new DeleteWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        DeleteWorkspaceMembersShrinkHeaders headers = new DeleteWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/deleteWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkspaceMembersResponse());
    }

    public DeleteWorkspaceMembersResponse deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceMembersHeaders headers = new DeleteWorkspaceMembersHeaders();
        return this.deleteWorkspaceMembersWithOptions(request, headers, runtime);
    }

    public ExecuteBatchTaskResponse executeBatchTaskWithOptions(ExecuteBatchTaskRequest request, ExecuteBatchTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExecuteBatchTaskShrinkHeaders headers = new ExecuteBatchTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outResult)) {
            body.put("OutResult", request.outResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskInformationList)) {
            body.put("TaskInformationList", request.taskInformationList);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteBatchTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/executeBatchTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteBatchTaskResponse());
    }

    public ExecuteBatchTaskResponse executeBatchTask(ExecuteBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteBatchTaskHeaders headers = new ExecuteBatchTaskHeaders();
        return this.executeBatchTaskWithOptions(request, headers, runtime);
    }

    public ExecutePlatformTaskResponse executePlatformTaskWithOptions(ExecutePlatformTaskRequest request, ExecutePlatformTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExecutePlatformTaskShrinkHeaders headers = new ExecutePlatformTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJson)) {
            body.put("FormDataJson", request.formDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpressions)) {
            body.put("NoExecuteExpressions", request.noExecuteExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outResult)) {
            body.put("OutResult", request.outResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecutePlatformTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/executePlatformTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecutePlatformTaskResponse());
    }

    public ExecutePlatformTaskResponse executePlatformTask(ExecutePlatformTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecutePlatformTaskHeaders headers = new ExecutePlatformTaskHeaders();
        return this.executePlatformTaskWithOptions(request, headers, runtime);
    }

    public ExecuteTaskResponse executeTaskWithOptions(ExecuteTaskRequest request, ExecuteTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ExecuteTaskShrinkHeaders headers = new ExecuteTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalSignUrl)) {
            body.put("DigitalSignUrl", request.digitalSignUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJson)) {
            body.put("FormDataJson", request.formDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noExecuteExpressions)) {
            body.put("NoExecuteExpressions", request.noExecuteExpressions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outResult)) {
            body.put("OutResult", request.outResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/executeTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteTaskResponse());
    }

    public ExecuteTaskResponse executeTask(ExecuteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteTaskHeaders headers = new ExecuteTaskHeaders();
        return this.executeTaskWithOptions(request, headers, runtime);
    }

    public GetActivityListResponse getActivityListWithOptions(GetActivityListRequest request, GetActivityListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetActivityListShrinkHeaders headers = new GetActivityListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCode)) {
            body.put("ProcessCode", request.processCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActivityList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getActivityList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActivityListResponse());
    }

    public GetActivityListResponse getActivityList(GetActivityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetActivityListHeaders headers = new GetActivityListHeaders();
        return this.getActivityListWithOptions(request, headers, runtime);
    }

    public GetAllSheetsResponse getAllSheetsWithOptions(GetAllSheetsRequest tmpReq, GetAllSheetsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAllSheetsShrinkRequest request = new GetAllSheetsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetAllSheetsShrinkHeaders headers = new GetAllSheetsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllSheets"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getAllSheets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllSheetsResponse());
    }

    public GetAllSheetsResponse getAllSheets(GetAllSheetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAllSheetsHeaders headers = new GetAllSheetsHeaders();
        return this.getAllSheetsWithOptions(request, headers, runtime);
    }

    public GetCorpAccomplishmentTasksResponse getCorpAccomplishmentTasksWithOptions(GetCorpAccomplishmentTasksRequest request, GetCorpAccomplishmentTasksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetCorpAccomplishmentTasksShrinkHeaders headers = new GetCorpAccomplishmentTasksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTypes)) {
            body.put("AppTypes", request.appTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpAccomplishmentTasks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getCorpAccomplishmentTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpAccomplishmentTasksResponse());
    }

    public GetCorpAccomplishmentTasksResponse getCorpAccomplishmentTasks(GetCorpAccomplishmentTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCorpAccomplishmentTasksHeaders headers = new GetCorpAccomplishmentTasksHeaders();
        return this.getCorpAccomplishmentTasksWithOptions(request, headers, runtime);
    }

    public GetCorpTasksResponse getCorpTasksWithOptions(GetCorpTasksRequest request, GetCorpTasksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetCorpTasksShrinkHeaders headers = new GetCorpTasksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTypes)) {
            body.put("AppTypes", request.appTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCorpTasks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getCorpTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCorpTasksResponse());
    }

    public GetCorpTasksResponse getCorpTasks(GetCorpTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCorpTasksHeaders headers = new GetCorpTasksHeaders();
        return this.getCorpTasksWithOptions(request, headers, runtime);
    }

    public GetEventResponse getEventWithOptions(GetEventRequest request, GetEventHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetEventShrinkHeaders headers = new GetEventShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxAttendees)) {
            query.put("MaxAttendees", request.maxAttendees);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEvent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/getEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEventResponse());
    }

    public GetEventResponse getEvent(GetEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEventHeaders headers = new GetEventHeaders();
        return this.getEventWithOptions(request, headers, runtime);
    }

    public GetFieldDefByUuidResponse getFieldDefByUuidWithOptions(GetFieldDefByUuidRequest request, GetFieldDefByUuidHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetFieldDefByUuidShrinkHeaders headers = new GetFieldDefByUuidShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFieldDefByUuid"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getFieldDefByUuid"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFieldDefByUuidResponse());
    }

    public GetFieldDefByUuidResponse getFieldDefByUuid(GetFieldDefByUuidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFieldDefByUuidHeaders headers = new GetFieldDefByUuidHeaders();
        return this.getFieldDefByUuidWithOptions(request, headers, runtime);
    }

    public GetFormComponentDefinitionListResponse getFormComponentDefinitionListWithOptions(GetFormComponentDefinitionListRequest request, GetFormComponentDefinitionListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetFormComponentDefinitionListShrinkHeaders headers = new GetFormComponentDefinitionListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFormComponentDefinitionList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getFormComponentDefinitionList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFormComponentDefinitionListResponse());
    }

    public GetFormComponentDefinitionListResponse getFormComponentDefinitionList(GetFormComponentDefinitionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormComponentDefinitionListHeaders headers = new GetFormComponentDefinitionListHeaders();
        return this.getFormComponentDefinitionListWithOptions(request, headers, runtime);
    }

    public GetFormDataByIDResponse getFormDataByIDWithOptions(GetFormDataByIDRequest request, GetFormDataByIDHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetFormDataByIDShrinkHeaders headers = new GetFormDataByIDShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFormDataByID"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getFormDataByID"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFormDataByIDResponse());
    }

    public GetFormDataByIDResponse getFormDataByID(GetFormDataByIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormDataByIDHeaders headers = new GetFormDataByIDHeaders();
        return this.getFormDataByIDWithOptions(request, headers, runtime);
    }

    public GetFormListInAppResponse getFormListInAppWithOptions(GetFormListInAppRequest request, GetFormListInAppHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetFormListInAppShrinkHeaders headers = new GetFormListInAppShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formTypes)) {
            body.put("FormTypes", request.formTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFormListInApp"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getFormListInApp"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFormListInAppResponse());
    }

    public GetFormListInAppResponse getFormListInApp(GetFormListInAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormListInAppHeaders headers = new GetFormListInAppHeaders();
        return this.getFormListInAppWithOptions(request, headers, runtime);
    }

    public GetInstanceByIdResponse getInstanceByIdWithOptions(GetInstanceByIdRequest request, GetInstanceByIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetInstanceByIdShrinkHeaders headers = new GetInstanceByIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceById"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getInstanceById"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceByIdResponse());
    }

    public GetInstanceByIdResponse getInstanceById(GetInstanceByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceByIdHeaders headers = new GetInstanceByIdHeaders();
        return this.getInstanceByIdWithOptions(request, headers, runtime);
    }

    public GetInstanceIdListResponse getInstanceIdListWithOptions(GetInstanceIdListRequest request, GetInstanceIdListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetInstanceIdListShrinkHeaders headers = new GetInstanceIdListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedResult)) {
            body.put("ApprovedResult", request.approvedResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            body.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFieldJson)) {
            body.put("SearchFieldJson", request.searchFieldJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceIdList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getInstanceIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceIdListResponse());
    }

    public GetInstanceIdListResponse getInstanceIdList(GetInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceIdListHeaders headers = new GetInstanceIdListHeaders();
        return this.getInstanceIdListWithOptions(request, headers, runtime);
    }

    public GetInstancesResponse getInstancesWithOptions(GetInstancesRequest request, GetInstancesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetInstancesShrinkHeaders headers = new GetInstancesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedResult)) {
            body.put("ApprovedResult", request.approvedResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStatus)) {
            body.put("InstanceStatus", request.instanceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderConfigJson)) {
            body.put("OrderConfigJson", request.orderConfigJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFieldJson)) {
            body.put("SearchFieldJson", request.searchFieldJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstances"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getInstances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstancesResponse());
    }

    public GetInstancesResponse getInstances(GetInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstancesHeaders headers = new GetInstancesHeaders();
        return this.getInstancesWithOptions(request, headers, runtime);
    }

    public GetInstancesByIdListResponse getInstancesByIdListWithOptions(GetInstancesByIdListRequest request, GetInstancesByIdListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetInstancesByIdListShrinkHeaders headers = new GetInstancesByIdListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceIds)) {
            body.put("ProcessInstanceIds", request.processInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstancesByIdList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getInstancesByIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstancesByIdListResponse());
    }

    public GetInstancesByIdListResponse getInstancesByIdList(GetInstancesByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstancesByIdListHeaders headers = new GetInstancesByIdListHeaders();
        return this.getInstancesByIdListWithOptions(request, headers, runtime);
    }

    public GetMeCorpSubmissionResponse getMeCorpSubmissionWithOptions(GetMeCorpSubmissionRequest request, GetMeCorpSubmissionHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetMeCorpSubmissionShrinkHeaders headers = new GetMeCorpSubmissionShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTypes)) {
            body.put("AppTypes", request.appTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMeCorpSubmission"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getMeCorpSubmission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMeCorpSubmissionResponse());
    }

    public GetMeCorpSubmissionResponse getMeCorpSubmission(GetMeCorpSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMeCorpSubmissionHeaders headers = new GetMeCorpSubmissionHeaders();
        return this.getMeCorpSubmissionWithOptions(request, headers, runtime);
    }

    public GetMeetingRoomsScheduleResponse getMeetingRoomsScheduleWithOptions(GetMeetingRoomsScheduleRequest tmpReq, GetMeetingRoomsScheduleHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMeetingRoomsScheduleShrinkRequest request = new GetMeetingRoomsScheduleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetMeetingRoomsScheduleShrinkHeaders headers = new GetMeetingRoomsScheduleShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomIds)) {
            request.roomIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomIds, "RoomIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomIdsShrink)) {
            body.put("RoomIds", request.roomIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMeetingRoomsSchedule"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/getMeetingRoomsSchedule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMeetingRoomsScheduleResponse());
    }

    public GetMeetingRoomsScheduleResponse getMeetingRoomsSchedule(GetMeetingRoomsScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMeetingRoomsScheduleHeaders headers = new GetMeetingRoomsScheduleHeaders();
        return this.getMeetingRoomsScheduleWithOptions(request, headers, runtime);
    }

    public GetMineWorkspaceResponse getMineWorkspaceWithOptions(GetMineWorkspaceRequest tmpReq, GetMineWorkspaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetMineWorkspaceShrinkRequest request = new GetMineWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetMineWorkspaceShrinkHeaders headers = new GetMineWorkspaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMineWorkspace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getMineWorkspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMineWorkspaceResponse());
    }

    public GetMineWorkspaceResponse getMineWorkspace(GetMineWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMineWorkspaceHeaders headers = new GetMineWorkspaceHeaders();
        return this.getMineWorkspaceWithOptions(request, headers, runtime);
    }

    public GetNodeResponse getNodeWithOptions(GetNodeRequest tmpReq, GetNodeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNodeShrinkRequest request = new GetNodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetNodeShrinkHeaders headers = new GetNodeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPermissionRole)) {
            body.put("WithPermissionRole", request.withPermissionRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withStatisticalInfo)) {
            body.put("WithStatisticalInfo", request.withStatisticalInfo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNode"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getNode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeResponse());
    }

    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodeHeaders headers = new GetNodeHeaders();
        return this.getNodeWithOptions(request, headers, runtime);
    }

    public GetNodeByUrlResponse getNodeByUrlWithOptions(GetNodeByUrlRequest tmpReq, GetNodeByUrlHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNodeByUrlShrinkRequest request = new GetNodeByUrlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetNodeByUrlShrinkHeaders headers = new GetNodeByUrlShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.option)) {
            request.optionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.option, "Option", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("Option", request.optionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeByUrl"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getNodeByUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeByUrlResponse());
    }

    public GetNodeByUrlResponse getNodeByUrl(GetNodeByUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodeByUrlHeaders headers = new GetNodeByUrlHeaders();
        return this.getNodeByUrlWithOptions(request, headers, runtime);
    }

    public GetNodesResponse getNodesWithOptions(GetNodesRequest tmpReq, GetNodesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNodesShrinkRequest request = new GetNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetNodesShrinkHeaders headers = new GetNodesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodeIds)) {
            request.nodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodeIds, "NodeIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.option)) {
            request.optionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.option, "Option", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdsShrink)) {
            body.put("NodeIds", request.nodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("Option", request.optionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodes"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getNodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodesResponse());
    }

    public GetNodesResponse getNodes(GetNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodesHeaders headers = new GetNodesHeaders();
        return this.getNodesWithOptions(request, headers, runtime);
    }

    public GetNotifyMeResponse getNotifyMeWithOptions(GetNotifyMeRequest request, GetNotifyMeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetNotifyMeShrinkHeaders headers = new GetNotifyMeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appTypes)) {
            body.put("AppTypes", request.appTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCreateFromTimeGMT)) {
            body.put("InstanceCreateFromTimeGMT", request.instanceCreateFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCreateToTimeGMT)) {
            body.put("InstanceCreateToTimeGMT", request.instanceCreateToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotifyMe"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getNotifyMe"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotifyMeResponse());
    }

    public GetNotifyMeResponse getNotifyMe(GetNotifyMeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNotifyMeHeaders headers = new GetNotifyMeHeaders();
        return this.getNotifyMeWithOptions(request, headers, runtime);
    }

    public GetOpenUrlResponse getOpenUrlWithOptions(GetOpenUrlRequest request, GetOpenUrlHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetOpenUrlShrinkHeaders headers = new GetOpenUrlShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("Timeout", request.timeout);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenUrl"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getOpenUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenUrlResponse());
    }

    public GetOpenUrlResponse getOpenUrl(GetOpenUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOpenUrlHeaders headers = new GetOpenUrlHeaders();
        return this.getOpenUrlWithOptions(request, headers, runtime);
    }

    public GetOperationRecordsResponse getOperationRecordsWithOptions(GetOperationRecordsRequest request, GetOperationRecordsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetOperationRecordsShrinkHeaders headers = new GetOperationRecordsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOperationRecords"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getOperationRecords"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOperationRecordsResponse());
    }

    public GetOperationRecordsResponse getOperationRecords(GetOperationRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOperationRecordsHeaders headers = new GetOperationRecordsHeaders();
        return this.getOperationRecordsWithOptions(request, headers, runtime);
    }

    public GetProcessDefinitionResponse getProcessDefinitionWithOptions(GetProcessDefinitionRequest request, GetProcessDefinitionHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetProcessDefinitionShrinkHeaders headers = new GetProcessDefinitionShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSpace)) {
            body.put("NameSpace", request.nameSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNumber)) {
            body.put("OrderNumber", request.orderNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            body.put("SystemType", request.systemType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProcessDefinition"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getProcessDefinition"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProcessDefinitionResponse());
    }

    public GetProcessDefinitionResponse getProcessDefinition(GetProcessDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProcessDefinitionHeaders headers = new GetProcessDefinitionHeaders();
        return this.getProcessDefinitionWithOptions(request, headers, runtime);
    }

    public GetRangeResponse getRangeWithOptions(GetRangeRequest tmpReq, GetRangeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetRangeShrinkRequest request = new GetRangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetRangeShrinkHeaders headers = new GetRangeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rangeAddress)) {
            body.put("RangeAddress", request.rangeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.select)) {
            body.put("Select", request.select);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRange"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getRange"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRangeResponse());
    }

    public GetRangeResponse getRange(GetRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRangeHeaders headers = new GetRangeHeaders();
        return this.getRangeWithOptions(request, headers, runtime);
    }

    public GetReportTemplateByNameResponse getReportTemplateByNameWithOptions(GetReportTemplateByNameRequest tmpReq, GetReportTemplateByNameHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetReportTemplateByNameShrinkRequest request = new GetReportTemplateByNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetReportTemplateByNameShrinkHeaders headers = new GetReportTemplateByNameShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportTemplateByName"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/getReportTemplateByName"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportTemplateByNameResponse());
    }

    public GetReportTemplateByNameResponse getReportTemplateByName(GetReportTemplateByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetReportTemplateByNameHeaders headers = new GetReportTemplateByNameHeaders();
        return this.getReportTemplateByNameWithOptions(request, headers, runtime);
    }

    public GetReportUnReadCountResponse getReportUnReadCountWithOptions(GetReportUnReadCountRequest tmpReq, GetReportUnReadCountHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetReportUnReadCountShrinkRequest request = new GetReportUnReadCountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetReportUnReadCountShrinkHeaders headers = new GetReportUnReadCountShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportUnReadCount"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/getReportUnReadCount"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportUnReadCountResponse());
    }

    public GetReportUnReadCountResponse getReportUnReadCount(GetReportUnReadCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetReportUnReadCountHeaders headers = new GetReportUnReadCountHeaders();
        return this.getReportUnReadCountWithOptions(request, headers, runtime);
    }

    public GetRunningTasksResponse getRunningTasksWithOptions(GetRunningTasksRequest request, GetRunningTasksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetRunningTasksShrinkHeaders headers = new GetRunningTasksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRunningTasks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getRunningTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunningTasksResponse());
    }

    public GetRunningTasksResponse getRunningTasks(GetRunningTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRunningTasksHeaders headers = new GetRunningTasksHeaders();
        return this.getRunningTasksWithOptions(request, headers, runtime);
    }

    public GetSheetResponse getSheetWithOptions(GetSheetRequest tmpReq, GetSheetHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSheetShrinkRequest request = new GetSheetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetSheetShrinkHeaders headers = new GetSheetShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSheet"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getSheet"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSheetResponse());
    }

    public GetSheetResponse getSheet(GetSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSheetHeaders headers = new GetSheetHeaders();
        return this.getSheetWithOptions(request, headers, runtime);
    }

    public GetSpaceDirectoriesResponse getSpaceDirectoriesWithOptions(GetSpaceDirectoriesRequest tmpReq, GetSpaceDirectoriesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSpaceDirectoriesShrinkRequest request = new GetSpaceDirectoriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetSpaceDirectoriesShrinkHeaders headers = new GetSpaceDirectoriesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dentryId)) {
            body.put("DentryId", request.dentryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            body.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpaceDirectories"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getSpaceDirectories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpaceDirectoriesResponse());
    }

    public GetSpaceDirectoriesResponse getSpaceDirectories(GetSpaceDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSpaceDirectoriesHeaders headers = new GetSpaceDirectoriesHeaders();
        return this.getSpaceDirectoriesWithOptions(request, headers, runtime);
    }

    public GetSubscribedCalendarResponse getSubscribedCalendarWithOptions(GetSubscribedCalendarRequest request, GetSubscribedCalendarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetSubscribedCalendarShrinkHeaders headers = new GetSubscribedCalendarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscribedCalendar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/getSubscribedCalendar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscribedCalendarResponse());
    }

    public GetSubscribedCalendarResponse getSubscribedCalendar(GetSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSubscribedCalendarHeaders headers = new GetSubscribedCalendarHeaders();
        return this.getSubscribedCalendarWithOptions(request, headers, runtime);
    }

    public GetTaskCopiesResponse getTaskCopiesWithOptions(GetTaskCopiesRequest request, GetTaskCopiesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetTaskCopiesShrinkHeaders headers = new GetTaskCopiesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCodes)) {
            body.put("ProcessCodes", request.processCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskCopies"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/getTaskCopies"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskCopiesResponse());
    }

    public GetTaskCopiesResponse getTaskCopies(GetTaskCopiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTaskCopiesHeaders headers = new GetTaskCopiesHeaders();
        return this.getTaskCopiesWithOptions(request, headers, runtime);
    }

    public GetTemplateListByUserIdResponse getTemplateListByUserIdWithOptions(GetTemplateListByUserIdRequest tmpReq, GetTemplateListByUserIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTemplateListByUserIdShrinkRequest request = new GetTemplateListByUserIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetTemplateListByUserIdShrinkHeaders headers = new GetTemplateListByUserIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplateListByUserId"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/getTemplateListByUserId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateListByUserIdResponse());
    }

    public GetTemplateListByUserIdResponse getTemplateListByUserId(GetTemplateListByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTemplateListByUserIdHeaders headers = new GetTemplateListByUserIdHeaders();
        return this.getTemplateListByUserIdWithOptions(request, headers, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest tmpReq, GetUserHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserShrinkRequest request = new GetUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetUserShrinkHeaders headers = new GetUserShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/getUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserHeaders headers = new GetUserHeaders();
        return this.getUserWithOptions(request, headers, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(GetWorkspaceRequest tmpReq, GetWorkspaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWorkspaceShrinkRequest request = new GetWorkspaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetWorkspaceShrinkHeaders headers = new GetWorkspaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPermissionRole)) {
            body.put("WithPermissionRole", request.withPermissionRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getWorkspace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspaceResponse());
    }

    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWorkspaceHeaders headers = new GetWorkspaceHeaders();
        return this.getWorkspaceWithOptions(request, headers, runtime);
    }

    public GetWorkspacesResponse getWorkspacesWithOptions(GetWorkspacesRequest tmpReq, GetWorkspacesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWorkspacesShrinkRequest request = new GetWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetWorkspacesShrinkHeaders headers = new GetWorkspacesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.option)) {
            request.optionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.option, "Option", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workspaceIds)) {
            request.workspaceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workspaceIds, "WorkspaceIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("Option", request.optionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIdsShrink)) {
            body.put("WorkspaceIds", request.workspaceIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkspaces"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getWorkspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkspacesResponse());
    }

    public GetWorkspacesResponse getWorkspaces(GetWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWorkspacesHeaders headers = new GetWorkspacesHeaders();
        return this.getWorkspacesWithOptions(request, headers, runtime);
    }

    public GrantHonorResponse grantHonorWithOptions(GrantHonorRequest tmpReq, GrantHonorHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantHonorShrinkRequest request = new GrantHonorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GrantHonorShrinkHeaders headers = new GrantHonorShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openConversationIds)) {
            request.openConversationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openConversationIds, "openConversationIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.receiverUserIds)) {
            request.receiverUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.receiverUserIds, "receiverUserIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            body.put("expirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantReason)) {
            body.put("grantReason", request.grantReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granterName)) {
            body.put("granterName", request.granterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.honorId)) {
            body.put("honorId", request.honorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeAnnouncer)) {
            body.put("noticeAnnouncer", request.noticeAnnouncer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeSingle)) {
            body.put("noticeSingle", request.noticeSingle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationIdsShrink)) {
            body.put("openConversationIds", request.openConversationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverUserIdsShrink)) {
            body.put("receiverUserIds", request.receiverUserIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderUserId)) {
            body.put("senderUserId", request.senderUserId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantHonor"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/grantHonor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantHonorResponse());
    }

    public GrantHonorResponse grantHonor(GrantHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GrantHonorHeaders headers = new GrantHonorHeaders();
        return this.grantHonorWithOptions(request, headers, runtime);
    }

    public InsertColumnsBeforeResponse insertColumnsBeforeWithOptions(InsertColumnsBeforeRequest tmpReq, InsertColumnsBeforeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertColumnsBeforeShrinkRequest request = new InsertColumnsBeforeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        InsertColumnsBeforeShrinkHeaders headers = new InsertColumnsBeforeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnCount)) {
            body.put("ColumnCount", request.columnCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertColumnsBefore"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/insertColumnsBefore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertColumnsBeforeResponse());
    }

    public InsertColumnsBeforeResponse insertColumnsBefore(InsertColumnsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertColumnsBeforeHeaders headers = new InsertColumnsBeforeHeaders();
        return this.insertColumnsBeforeWithOptions(request, headers, runtime);
    }

    public InsertRowsBeforeResponse insertRowsBeforeWithOptions(InsertRowsBeforeRequest tmpReq, InsertRowsBeforeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertRowsBeforeShrinkRequest request = new InsertRowsBeforeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        InsertRowsBeforeShrinkHeaders headers = new InsertRowsBeforeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            body.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            body.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertRowsBefore"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/insertRowsBefore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertRowsBeforeResponse());
    }

    public InsertRowsBeforeResponse insertRowsBefore(InsertRowsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertRowsBeforeHeaders headers = new InsertRowsBeforeHeaders();
        return this.insertRowsBeforeWithOptions(request, headers, runtime);
    }

    public InviteUsersResponse inviteUsersWithOptions(InviteUsersRequest tmpReq, InviteUsersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InviteUsersShrinkRequest request = new InviteUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        InviteUsersShrinkHeaders headers = new InviteUsersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inviteeList)) {
            request.inviteeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inviteeList, "InviteeList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inviteeListShrink)) {
            body.put("InviteeList", request.inviteeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteUsers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/inviteUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteUsersResponse());
    }

    public InviteUsersResponse inviteUsers(InviteUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InviteUsersHeaders headers = new InviteUsersHeaders();
        return this.inviteUsersWithOptions(request, headers, runtime);
    }

    public ListApplicationResponse listApplicationWithOptions(ListApplicationRequest request, ListApplicationHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ListApplicationShrinkHeaders headers = new ListApplicationShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appFilter)) {
            body.put("AppFilter", request.appFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appNameSearchKeyword)) {
            body.put("AppNameSearchKeyword", request.appNameSearchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("CorpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplication"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/listApplication"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationResponse());
    }

    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListApplicationHeaders headers = new ListApplicationHeaders();
        return this.listApplicationWithOptions(request, headers, runtime);
    }

    public ListCalendarsResponse listCalendarsWithOptions(ListCalendarsRequest tmpReq, ListCalendarsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCalendarsShrinkRequest request = new ListCalendarsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListCalendarsShrinkHeaders headers = new ListCalendarsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalendars"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/listCalendars"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalendarsResponse());
    }

    public ListCalendarsResponse listCalendars(ListCalendarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCalendarsHeaders headers = new ListCalendarsHeaders();
        return this.listCalendarsWithOptions(request, headers, runtime);
    }

    public ListEventsResponse listEventsWithOptions(ListEventsRequest request, ListEventsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ListEventsShrinkHeaders headers = new ListEventsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttendees)) {
            body.put("MaxAttendees", request.maxAttendees);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seriesMasterId)) {
            body.put("SeriesMasterId", request.seriesMasterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDeleted)) {
            body.put("ShowDeleted", request.showDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncToken)) {
            body.put("SyncToken", request.syncToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMax)) {
            body.put("TimeMax", request.timeMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMin)) {
            body.put("TimeMin", request.timeMin);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvents"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/listEvents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventsResponse());
    }

    public ListEventsResponse listEvents(ListEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventsHeaders headers = new ListEventsHeaders();
        return this.listEventsWithOptions(request, headers, runtime);
    }

    public ListEventsViewResponse listEventsViewWithOptions(ListEventsViewRequest request, ListEventsViewHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ListEventsViewShrinkHeaders headers = new ListEventsViewShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttendees)) {
            body.put("MaxAttendees", request.maxAttendees);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMax)) {
            body.put("TimeMax", request.timeMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeMin)) {
            body.put("TimeMin", request.timeMin);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventsView"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/listEventsView"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventsViewResponse());
    }

    public ListEventsViewResponse listEventsView(ListEventsViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventsViewHeaders headers = new ListEventsViewHeaders();
        return this.listEventsViewWithOptions(request, headers, runtime);
    }

    public ListFormRemarksResponse listFormRemarksWithOptions(ListFormRemarksRequest tmpReq, ListFormRemarksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFormRemarksShrinkRequest request = new ListFormRemarksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListFormRemarksShrinkHeaders headers = new ListFormRemarksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.formInstanceIdList)) {
            request.formInstanceIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.formInstanceIdList, "FormInstanceIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceIdListShrink)) {
            body.put("FormInstanceIdList", request.formInstanceIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFormRemarks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/listFormRemarks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFormRemarksResponse());
    }

    public ListFormRemarksResponse listFormRemarks(ListFormRemarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFormRemarksHeaders headers = new ListFormRemarksHeaders();
        return this.listFormRemarksWithOptions(request, headers, runtime);
    }

    public ListNavigationByFormTypeResponse listNavigationByFormTypeWithOptions(ListNavigationByFormTypeRequest request, ListNavigationByFormTypeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ListNavigationByFormTypeShrinkHeaders headers = new ListNavigationByFormTypeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formType)) {
            body.put("FormType", request.formType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNavigationByFormType"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/listNavigationByFormType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNavigationByFormTypeResponse());
    }

    public ListNavigationByFormTypeResponse listNavigationByFormType(ListNavigationByFormTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNavigationByFormTypeHeaders headers = new ListNavigationByFormTypeHeaders();
        return this.listNavigationByFormTypeWithOptions(request, headers, runtime);
    }

    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, ListNodesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListNodesShrinkHeaders headers = new ListNodesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentNodeId)) {
            body.put("ParentNodeId", request.parentNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPermissionRole)) {
            body.put("WithPermissionRole", request.withPermissionRole);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/listNodes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNodesHeaders headers = new ListNodesHeaders();
        return this.listNodesWithOptions(request, headers, runtime);
    }

    public ListReportResponse listReportWithOptions(ListReportRequest tmpReq, ListReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListReportShrinkRequest request = new ListReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListReportShrinkHeaders headers = new ListReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedEndTime)) {
            body.put("ModifiedEndTime", request.modifiedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedStartTime)) {
            body.put("ModifiedStartTime", request.modifiedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/listReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReportResponse());
    }

    public ListReportResponse listReport(ListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListReportHeaders headers = new ListReportHeaders();
        return this.listReportWithOptions(request, headers, runtime);
    }

    public ListTableDataByFormInstanceIdTableIdResponse listTableDataByFormInstanceIdTableIdWithOptions(ListTableDataByFormInstanceIdTableIdRequest request, ListTableDataByFormInstanceIdTableIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        ListTableDataByFormInstanceIdTableIdShrinkHeaders headers = new ListTableDataByFormInstanceIdTableIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceId)) {
            body.put("FormInstanceId", request.formInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableFieldId)) {
            body.put("TableFieldId", request.tableFieldId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableDataByFormInstanceIdTableId"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/listTableDataByFormInstanceIdTableId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableDataByFormInstanceIdTableIdResponse());
    }

    public ListTableDataByFormInstanceIdTableIdResponse listTableDataByFormInstanceIdTableId(ListTableDataByFormInstanceIdTableIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTableDataByFormInstanceIdTableIdHeaders headers = new ListTableDataByFormInstanceIdTableIdHeaders();
        return this.listTableDataByFormInstanceIdTableIdWithOptions(request, headers, runtime);
    }

    public ListTeamsResponse listTeamsWithOptions(ListTeamsRequest tmpReq, ListTeamsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTeamsShrinkRequest request = new ListTeamsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListTeamsShrinkHeaders headers = new ListTeamsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTeams"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/listTeams"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTeamsResponse());
    }

    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTeamsHeaders headers = new ListTeamsHeaders();
        return this.listTeamsWithOptions(request, headers, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest tmpReq, ListWorkspacesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkspacesShrinkRequest request = new ListWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListWorkspacesShrinkHeaders headers = new ListWorkspacesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamId)) {
            body.put("TeamId", request.teamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withPermissionRole)) {
            body.put("WithPermissionRole", request.withPermissionRole);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/listWorkspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListWorkspacesHeaders headers = new ListWorkspacesHeaders();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    public PatchEventResponse patchEventWithOptions(PatchEventRequest tmpReq, PatchEventHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PatchEventShrinkRequest request = new PatchEventShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        PatchEventShrinkHeaders headers = new PatchEventShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attendees)) {
            request.attendeesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attendees, "Attendees", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.end)) {
            request.endShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.end, "End", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.location)) {
            request.locationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.location, "Location", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recurrence)) {
            request.recurrenceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recurrence, "Recurrence", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reminders)) {
            request.remindersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reminders, "Reminders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.start)) {
            request.startShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.start, "Start", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attendeesShrink)) {
            body.put("Attendees", request.attendeesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endShrink)) {
            body.put("End", request.endShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("Extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAllDay)) {
            body.put("IsAllDay", request.isAllDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationShrink)) {
            body.put("Location", request.locationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recurrenceShrink)) {
            body.put("Recurrence", request.recurrenceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remindersShrink)) {
            body.put("Reminders", request.remindersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startShrink)) {
            body.put("Start", request.startShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summary)) {
            body.put("Summary", request.summary);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchEvent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/patchEvent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PatchEventResponse());
    }

    public PatchEventResponse patchEvent(PatchEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PatchEventHeaders headers = new PatchEventHeaders();
        return this.patchEventWithOptions(request, headers, runtime);
    }

    public QueryCloudRecordTextResponse queryCloudRecordTextWithOptions(QueryCloudRecordTextRequest tmpReq, QueryCloudRecordTextHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCloudRecordTextShrinkRequest request = new QueryCloudRecordTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryCloudRecordTextShrinkHeaders headers = new QueryCloudRecordTextShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            body.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCloudRecordText"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryCloudRecordText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCloudRecordTextResponse());
    }

    public QueryCloudRecordTextResponse queryCloudRecordText(QueryCloudRecordTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordTextHeaders headers = new QueryCloudRecordTextHeaders();
        return this.queryCloudRecordTextWithOptions(request, headers, runtime);
    }

    public QueryCloudRecordVideoResponse queryCloudRecordVideoWithOptions(QueryCloudRecordVideoRequest tmpReq, QueryCloudRecordVideoHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCloudRecordVideoShrinkRequest request = new QueryCloudRecordVideoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryCloudRecordVideoShrinkHeaders headers = new QueryCloudRecordVideoShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCloudRecordVideo"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryCloudRecordVideo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCloudRecordVideoResponse());
    }

    public QueryCloudRecordVideoResponse queryCloudRecordVideo(QueryCloudRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordVideoHeaders headers = new QueryCloudRecordVideoHeaders();
        return this.queryCloudRecordVideoWithOptions(request, headers, runtime);
    }

    public QueryCloudRecordVideoPlayInfoResponse queryCloudRecordVideoPlayInfoWithOptions(QueryCloudRecordVideoPlayInfoRequest tmpReq, QueryCloudRecordVideoPlayInfoHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCloudRecordVideoPlayInfoShrinkRequest request = new QueryCloudRecordVideoPlayInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryCloudRecordVideoPlayInfoShrinkHeaders headers = new QueryCloudRecordVideoPlayInfoShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("ConferenceId", request.conferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            body.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCloudRecordVideoPlayInfo"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryCloudRecordVideoPlayInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCloudRecordVideoPlayInfoResponse());
    }

    public QueryCloudRecordVideoPlayInfoResponse queryCloudRecordVideoPlayInfo(QueryCloudRecordVideoPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordVideoPlayInfoHeaders headers = new QueryCloudRecordVideoPlayInfoHeaders();
        return this.queryCloudRecordVideoPlayInfoWithOptions(request, headers, runtime);
    }

    public QueryConferenceInfoResponse queryConferenceInfoWithOptions(QueryConferenceInfoRequest request, QueryConferenceInfoHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        QueryConferenceInfoShrinkHeaders headers = new QueryConferenceInfoShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConferenceInfo"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryConferenceInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConferenceInfoResponse());
    }

    public QueryConferenceInfoResponse queryConferenceInfo(QueryConferenceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryConferenceInfoHeaders headers = new QueryConferenceInfoHeaders();
        return this.queryConferenceInfoWithOptions(request, headers, runtime);
    }

    public QueryConferenceMembersResponse queryConferenceMembersWithOptions(QueryConferenceMembersRequest tmpReq, QueryConferenceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryConferenceMembersShrinkRequest request = new QueryConferenceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryConferenceMembersShrinkHeaders headers = new QueryConferenceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConferenceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryConferenceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConferenceMembersResponse());
    }

    public QueryConferenceMembersResponse queryConferenceMembers(QueryConferenceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryConferenceMembersHeaders headers = new QueryConferenceMembersHeaders();
        return this.queryConferenceMembersWithOptions(request, headers, runtime);
    }

    public QueryDentryResponse queryDentryWithOptions(QueryDentryRequest tmpReq, QueryDentryHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryDentryShrinkRequest request = new QueryDentryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryDentryShrinkHeaders headers = new QueryDentryShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dentryId)) {
            body.put("DentryId", request.dentryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSpace)) {
            body.put("IncludeSpace", request.includeSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            body.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDentry"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/queryDentry"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDentryResponse());
    }

    public QueryDentryResponse queryDentry(QueryDentryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryDentryHeaders headers = new QueryDentryHeaders();
        return this.queryDentryWithOptions(request, headers, runtime);
    }

    public QueryLiveInfoResponse queryLiveInfoWithOptions(QueryLiveInfoRequest tmpReq, QueryLiveInfoHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryLiveInfoShrinkRequest request = new QueryLiveInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryLiveInfoShrinkHeaders headers = new QueryLiveInfoShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLiveInfo"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryLiveInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLiveInfoResponse());
    }

    public QueryLiveInfoResponse queryLiveInfo(QueryLiveInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveInfoHeaders headers = new QueryLiveInfoHeaders();
        return this.queryLiveInfoWithOptions(request, headers, runtime);
    }

    public QueryLiveWatchDetailResponse queryLiveWatchDetailWithOptions(QueryLiveWatchDetailRequest tmpReq, QueryLiveWatchDetailHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryLiveWatchDetailShrinkRequest request = new QueryLiveWatchDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryLiveWatchDetailShrinkHeaders headers = new QueryLiveWatchDetailShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLiveWatchDetail"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryLiveWatchDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLiveWatchDetailResponse());
    }

    public QueryLiveWatchDetailResponse queryLiveWatchDetail(QueryLiveWatchDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveWatchDetailHeaders headers = new QueryLiveWatchDetailHeaders();
        return this.queryLiveWatchDetailWithOptions(request, headers, runtime);
    }

    public QueryLiveWatchUserListResponse queryLiveWatchUserListWithOptions(QueryLiveWatchUserListRequest tmpReq, QueryLiveWatchUserListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryLiveWatchUserListShrinkRequest request = new QueryLiveWatchUserListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryLiveWatchUserListShrinkHeaders headers = new QueryLiveWatchUserListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLiveWatchUserList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryLiveWatchUserList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLiveWatchUserListResponse());
    }

    public QueryLiveWatchUserListResponse queryLiveWatchUserList(QueryLiveWatchUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveWatchUserListHeaders headers = new QueryLiveWatchUserListHeaders();
        return this.queryLiveWatchUserListWithOptions(request, headers, runtime);
    }

    public QueryMeetingRoomResponse queryMeetingRoomWithOptions(QueryMeetingRoomRequest tmpReq, QueryMeetingRoomHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMeetingRoomShrinkRequest request = new QueryMeetingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryMeetingRoomShrinkHeaders headers = new QueryMeetingRoomShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMeetingRoom"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryMeetingRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMeetingRoomResponse());
    }

    public QueryMeetingRoomResponse queryMeetingRoom(QueryMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomHeaders headers = new QueryMeetingRoomHeaders();
        return this.queryMeetingRoomWithOptions(request, headers, runtime);
    }

    public QueryMeetingRoomGroupResponse queryMeetingRoomGroupWithOptions(QueryMeetingRoomGroupRequest tmpReq, QueryMeetingRoomGroupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMeetingRoomGroupShrinkRequest request = new QueryMeetingRoomGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryMeetingRoomGroupShrinkHeaders headers = new QueryMeetingRoomGroupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMeetingRoomGroup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryMeetingRoomGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMeetingRoomGroupResponse());
    }

    public QueryMeetingRoomGroupResponse queryMeetingRoomGroup(QueryMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomGroupHeaders headers = new QueryMeetingRoomGroupHeaders();
        return this.queryMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    public QueryMeetingRoomGroupListResponse queryMeetingRoomGroupListWithOptions(QueryMeetingRoomGroupListRequest tmpReq, QueryMeetingRoomGroupListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMeetingRoomGroupListShrinkRequest request = new QueryMeetingRoomGroupListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryMeetingRoomGroupListShrinkHeaders headers = new QueryMeetingRoomGroupListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMeetingRoomGroupList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryMeetingRoomGroupList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMeetingRoomGroupListResponse());
    }

    public QueryMeetingRoomGroupListResponse queryMeetingRoomGroupList(QueryMeetingRoomGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomGroupListHeaders headers = new QueryMeetingRoomGroupListHeaders();
        return this.queryMeetingRoomGroupListWithOptions(request, headers, runtime);
    }

    public QueryMeetingRoomListResponse queryMeetingRoomListWithOptions(QueryMeetingRoomListRequest tmpReq, QueryMeetingRoomListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMeetingRoomListShrinkRequest request = new QueryMeetingRoomListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryMeetingRoomListShrinkHeaders headers = new QueryMeetingRoomListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMeetingRoomList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryMeetingRoomList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMeetingRoomListResponse());
    }

    public QueryMeetingRoomListResponse queryMeetingRoomList(QueryMeetingRoomListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomListHeaders headers = new QueryMeetingRoomListHeaders();
        return this.queryMeetingRoomListWithOptions(request, headers, runtime);
    }

    public QueryOrgHonorsResponse queryOrgHonorsWithOptions(QueryOrgHonorsRequest tmpReq, QueryOrgHonorsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryOrgHonorsShrinkRequest request = new QueryOrgHonorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryOrgHonorsShrinkHeaders headers = new QueryOrgHonorsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrgHonors"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/queryOrgHonors"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrgHonorsResponse());
    }

    public QueryOrgHonorsResponse queryOrgHonors(QueryOrgHonorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrgHonorsHeaders headers = new QueryOrgHonorsHeaders();
        return this.queryOrgHonorsWithOptions(request, headers, runtime);
    }

    public QueryOrgTodoTasksResponse queryOrgTodoTasksWithOptions(QueryOrgTodoTasksRequest tmpReq, QueryOrgTodoTasksHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryOrgTodoTasksShrinkRequest request = new QueryOrgTodoTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryOrgTodoTasksShrinkHeaders headers = new QueryOrgTodoTasksShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDone)) {
            body.put("isDone", request.isDone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrgTodoTasks"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/queryOrgTodoTasks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrgTodoTasksResponse());
    }

    public QueryOrgTodoTasksResponse queryOrgTodoTasks(QueryOrgTodoTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrgTodoTasksHeaders headers = new QueryOrgTodoTasksHeaders();
        return this.queryOrgTodoTasksWithOptions(request, headers, runtime);
    }

    public QueryScheduleConferenceResponse queryScheduleConferenceWithOptions(QueryScheduleConferenceRequest tmpReq, QueryScheduleConferenceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryScheduleConferenceShrinkRequest request = new QueryScheduleConferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryScheduleConferenceShrinkHeaders headers = new QueryScheduleConferenceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestUnionId)) {
            body.put("RequestUnionId", request.requestUnionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryScheduleConference"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/queryScheduleConference"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryScheduleConferenceResponse());
    }

    public QueryScheduleConferenceResponse queryScheduleConference(QueryScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryScheduleConferenceHeaders headers = new QueryScheduleConferenceHeaders();
        return this.queryScheduleConferenceWithOptions(request, headers, runtime);
    }

    public QueryUserHonorsResponse queryUserHonorsWithOptions(QueryUserHonorsRequest tmpReq, QueryUserHonorsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserHonorsShrinkRequest request = new QueryUserHonorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        QueryUserHonorsShrinkHeaders headers = new QueryUserHonorsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserHonors"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/queryUserHonors"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserHonorsResponse());
    }

    public QueryUserHonorsResponse queryUserHonors(QueryUserHonorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUserHonorsHeaders headers = new QueryUserHonorsHeaders();
        return this.queryUserHonorsWithOptions(request, headers, runtime);
    }

    public RecallHonorResponse recallHonorWithOptions(RecallHonorRequest tmpReq, RecallHonorHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecallHonorShrinkRequest request = new RecallHonorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        RecallHonorShrinkHeaders headers = new RecallHonorShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.honorId)) {
            body.put("honorId", request.honorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecallHonor"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/recallHonor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecallHonorResponse());
    }

    public RecallHonorResponse recallHonor(RecallHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RecallHonorHeaders headers = new RecallHonorHeaders();
        return this.recallHonorWithOptions(request, headers, runtime);
    }

    public ReceiverListReportResponse receiverListReportWithOptions(ReceiverListReportRequest tmpReq, ReceiverListReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReceiverListReportShrinkRequest request = new ReceiverListReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ReceiverListReportShrinkHeaders headers = new ReceiverListReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReceiverListReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/receiverListReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReceiverListReportResponse());
    }

    public ReceiverListReportResponse receiverListReport(ReceiverListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ReceiverListReportHeaders headers = new ReceiverListReportHeaders();
        return this.receiverListReportWithOptions(request, headers, runtime);
    }

    public RedirectTaskResponse redirectTaskWithOptions(RedirectTaskRequest request, RedirectTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        RedirectTaskShrinkHeaders headers = new RedirectTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.byManager)) {
            body.put("ByManager", request.byManager);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nowActionExecutorId)) {
            body.put("NowActionExecutorId", request.nowActionExecutorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RedirectTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/redirectTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RedirectTaskResponse());
    }

    public RedirectTaskResponse redirectTask(RedirectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RedirectTaskHeaders headers = new RedirectTaskHeaders();
        return this.redirectTaskWithOptions(request, headers, runtime);
    }

    public RemoveAttendeeResponse removeAttendeeWithOptions(RemoveAttendeeRequest tmpReq, RemoveAttendeeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveAttendeeShrinkRequest request = new RemoveAttendeeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        RemoveAttendeeShrinkHeaders headers = new RemoveAttendeeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attendeesToRemove)) {
            request.attendeesToRemoveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attendeesToRemove, "AttendeesToRemove", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attendeesToRemoveShrink)) {
            body.put("AttendeesToRemove", request.attendeesToRemoveShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAttendee"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/removeAttendee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAttendeeResponse());
    }

    public RemoveAttendeeResponse removeAttendee(RemoveAttendeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveAttendeeHeaders headers = new RemoveAttendeeHeaders();
        return this.removeAttendeeWithOptions(request, headers, runtime);
    }

    public RemoveMeetingRoomsResponse removeMeetingRoomsWithOptions(RemoveMeetingRoomsRequest tmpReq, RemoveMeetingRoomsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveMeetingRoomsShrinkRequest request = new RemoveMeetingRoomsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        RemoveMeetingRoomsShrinkHeaders headers = new RemoveMeetingRoomsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.meetingRoomsToRemove)) {
            request.meetingRoomsToRemoveShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.meetingRoomsToRemove, "MeetingRoomsToRemove", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingRoomsToRemoveShrink)) {
            body.put("MeetingRoomsToRemove", request.meetingRoomsToRemoveShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMeetingRooms"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/removeMeetingRooms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMeetingRoomsResponse());
    }

    public RemoveMeetingRoomsResponse removeMeetingRooms(RemoveMeetingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveMeetingRoomsHeaders headers = new RemoveMeetingRoomsHeaders();
        return this.removeMeetingRoomsWithOptions(request, headers, runtime);
    }

    public SaveContentResponse saveContentWithOptions(SaveContentRequest tmpReq, SaveContentHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveContentShrinkRequest request = new SaveContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SaveContentShrinkHeaders headers = new SaveContentShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contents)) {
            request.contentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contents, "Contents", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentsShrink)) {
            body.put("Contents", request.contentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddFrom)) {
            body.put("DdFrom", request.ddFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveContent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/saveContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveContentResponse());
    }

    public SaveContentResponse saveContent(SaveContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveContentHeaders headers = new SaveContentHeaders();
        return this.saveContentWithOptions(request, headers, runtime);
    }

    public SaveFormDataResponse saveFormDataWithOptions(SaveFormDataRequest request, SaveFormDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SaveFormDataShrinkHeaders headers = new SaveFormDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJson)) {
            body.put("FormDataJson", request.formDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveFormData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/saveFormData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveFormDataResponse());
    }

    public SaveFormDataResponse saveFormData(SaveFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveFormDataHeaders headers = new SaveFormDataHeaders();
        return this.saveFormDataWithOptions(request, headers, runtime);
    }

    public SaveFormRemarkResponse saveFormRemarkWithOptions(SaveFormRemarkRequest request, SaveFormRemarkHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SaveFormRemarkShrinkHeaders headers = new SaveFormRemarkShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.atUserId)) {
            body.put("AtUserId", request.atUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceId)) {
            body.put("FormInstanceId", request.formInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replyId)) {
            body.put("ReplyId", request.replyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveFormRemark"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/saveFormRemark"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveFormRemarkResponse());
    }

    public SaveFormRemarkResponse saveFormRemark(SaveFormRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveFormRemarkHeaders headers = new SaveFormRemarkHeaders();
        return this.saveFormRemarkWithOptions(request, headers, runtime);
    }

    public SearchEmployeeFieldValuesResponse searchEmployeeFieldValuesWithOptions(SearchEmployeeFieldValuesRequest request, SearchEmployeeFieldValuesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchEmployeeFieldValuesShrinkHeaders headers = new SearchEmployeeFieldValuesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFieldJson)) {
            body.put("SearchFieldJson", request.searchFieldJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFieldJson)) {
            body.put("TargetFieldJson", request.targetFieldJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchEmployeeFieldValues"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/searchEmployeeFieldValues"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchEmployeeFieldValuesResponse());
    }

    public SearchEmployeeFieldValuesResponse searchEmployeeFieldValues(SearchEmployeeFieldValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchEmployeeFieldValuesHeaders headers = new SearchEmployeeFieldValuesHeaders();
        return this.searchEmployeeFieldValuesWithOptions(request, headers, runtime);
    }

    public SearchFormDataIdListResponse searchFormDataIdListWithOptions(SearchFormDataIdListRequest request, SearchFormDataIdListHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchFormDataIdListShrinkHeaders headers = new SearchFormDataIdListShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFieldJson)) {
            body.put("SearchFieldJson", request.searchFieldJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFormDataIdList"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/searchFormDataIdList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFormDataIdListResponse());
    }

    public SearchFormDataIdListResponse searchFormDataIdList(SearchFormDataIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataIdListHeaders headers = new SearchFormDataIdListHeaders();
        return this.searchFormDataIdListWithOptions(request, headers, runtime);
    }

    public SearchFormDataSecondGenerationResponse searchFormDataSecondGenerationWithOptions(SearchFormDataSecondGenerationRequest request, SearchFormDataSecondGenerationHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchFormDataSecondGenerationShrinkHeaders headers = new SearchFormDataSecondGenerationShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderConfigJson)) {
            body.put("OrderConfigJson", request.orderConfigJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchCondition)) {
            body.put("SearchCondition", request.searchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFormDataSecondGeneration"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/searchFormDataSecondGeneration"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFormDataSecondGenerationResponse());
    }

    public SearchFormDataSecondGenerationResponse searchFormDataSecondGeneration(SearchFormDataSecondGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataSecondGenerationHeaders headers = new SearchFormDataSecondGenerationHeaders();
        return this.searchFormDataSecondGenerationWithOptions(request, headers, runtime);
    }

    public SearchFormDataSecondGenerationNoTableFieldResponse searchFormDataSecondGenerationNoTableFieldWithOptions(SearchFormDataSecondGenerationNoTableFieldRequest request, SearchFormDataSecondGenerationNoTableFieldHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchFormDataSecondGenerationNoTableFieldShrinkHeaders headers = new SearchFormDataSecondGenerationNoTableFieldShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderConfigJson)) {
            body.put("OrderConfigJson", request.orderConfigJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchCondition)) {
            body.put("SearchCondition", request.searchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFormDataSecondGenerationNoTableField"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/searchFormDataSecondGenerationNoTableField"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFormDataSecondGenerationNoTableFieldResponse());
    }

    public SearchFormDataSecondGenerationNoTableFieldResponse searchFormDataSecondGenerationNoTableField(SearchFormDataSecondGenerationNoTableFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataSecondGenerationNoTableFieldHeaders headers = new SearchFormDataSecondGenerationNoTableFieldHeaders();
        return this.searchFormDataSecondGenerationNoTableFieldWithOptions(request, headers, runtime);
    }

    public SearchFormDatasResponse searchFormDatasWithOptions(SearchFormDatasRequest request, SearchFormDatasHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchFormDatasShrinkHeaders headers = new SearchFormDatasShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createFromTimeGMT)) {
            body.put("CreateFromTimeGMT", request.createFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createToTimeGMT)) {
            body.put("CreateToTimeGMT", request.createToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicOrder)) {
            body.put("DynamicOrder", request.dynamicOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedFromTimeGMT)) {
            body.put("ModifiedFromTimeGMT", request.modifiedFromTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifiedToTimeGMT)) {
            body.put("ModifiedToTimeGMT", request.modifiedToTimeGMT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originatorId)) {
            body.put("OriginatorId", request.originatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchFieldJson)) {
            body.put("SearchFieldJson", request.searchFieldJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFormDatas"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/searchFormDatas"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchFormDatasResponse());
    }

    public SearchFormDatasResponse searchFormDatas(SearchFormDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDatasHeaders headers = new SearchFormDatasHeaders();
        return this.searchFormDatasWithOptions(request, headers, runtime);
    }

    public SendBannerResponse sendBannerWithOptions(SendBannerRequest tmpReq, SendBannerHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendBannerShrinkRequest request = new SendBannerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SendBannerShrinkHeaders headers = new SendBannerShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            body.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendBanner"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/sendBanner"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendBannerResponse());
    }

    public SendBannerResponse sendBanner(SendBannerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendBannerHeaders headers = new SendBannerHeaders();
        return this.sendBannerWithOptions(request, headers, runtime);
    }

    public SendPopupResponse sendPopupWithOptions(SendPopupRequest tmpReq, SendPopupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendPopupShrinkRequest request = new SendPopupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SendPopupShrinkHeaders headers = new SendPopupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            body.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendPopup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/sendPopup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendPopupResponse());
    }

    public SendPopupResponse sendPopup(SendPopupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendPopupHeaders headers = new SendPopupHeaders();
        return this.sendPopupWithOptions(request, headers, runtime);
    }

    public SendSearchShadeResponse sendSearchShadeWithOptions(SendSearchShadeRequest tmpReq, SendSearchShadeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendSearchShadeShrinkRequest request = new SendSearchShadeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SendSearchShadeShrinkHeaders headers = new SendSearchShadeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            body.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendSearchShade"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/sendSearchShade"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendSearchShadeResponse());
    }

    public SendSearchShadeResponse sendSearchShade(SendSearchShadeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendSearchShadeHeaders headers = new SendSearchShadeHeaders();
        return this.sendSearchShadeWithOptions(request, headers, runtime);
    }

    public SetColumnsVisibilityResponse setColumnsVisibilityWithOptions(SetColumnsVisibilityRequest tmpReq, SetColumnsVisibilityHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetColumnsVisibilityShrinkRequest request = new SetColumnsVisibilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SetColumnsVisibilityShrinkHeaders headers = new SetColumnsVisibilityShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.column)) {
            body.put("Column", request.column);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnCount)) {
            body.put("ColumnCount", request.columnCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetColumnsVisibility"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/setColumnsVisibility"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetColumnsVisibilityResponse());
    }

    public SetColumnsVisibilityResponse setColumnsVisibility(SetColumnsVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetColumnsVisibilityHeaders headers = new SetColumnsVisibilityHeaders();
        return this.setColumnsVisibilityWithOptions(request, headers, runtime);
    }

    public SetRowsVisibilityResponse setRowsVisibilityWithOptions(SetRowsVisibilityRequest tmpReq, SetRowsVisibilityHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetRowsVisibilityShrinkRequest request = new SetRowsVisibilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SetRowsVisibilityShrinkHeaders headers = new SetRowsVisibilityShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            body.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowCount)) {
            body.put("RowCount", request.rowCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("Visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRowsVisibility"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/setRowsVisibility"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRowsVisibilityResponse());
    }

    public SetRowsVisibilityResponse setRowsVisibility(SetRowsVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetRowsVisibilityHeaders headers = new SetRowsVisibilityHeaders();
        return this.setRowsVisibilityWithOptions(request, headers, runtime);
    }

    public SimpleListReportResponse simpleListReportWithOptions(SimpleListReportRequest tmpReq, SimpleListReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SimpleListReportShrinkRequest request = new SimpleListReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SimpleListReportShrinkHeaders headers = new SimpleListReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SimpleListReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/simpleListReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SimpleListReportResponse());
    }

    public SimpleListReportResponse simpleListReport(SimpleListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SimpleListReportHeaders headers = new SimpleListReportHeaders();
        return this.simpleListReportWithOptions(request, headers, runtime);
    }

    public StartCloudRecordResponse startCloudRecordWithOptions(StartCloudRecordRequest tmpReq, StartCloudRecordHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartCloudRecordShrinkRequest request = new StartCloudRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        StartCloudRecordShrinkHeaders headers = new StartCloudRecordShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smallWindowPosition)) {
            body.put("SmallWindowPosition", request.smallWindowPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCloudRecord"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/startCloudRecord"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCloudRecordResponse());
    }

    public StartCloudRecordResponse startCloudRecord(StartCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartCloudRecordHeaders headers = new StartCloudRecordHeaders();
        return this.startCloudRecordWithOptions(request, headers, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, StartInstanceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        StartInstanceShrinkHeaders headers = new StartInstanceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentId)) {
            body.put("DepartmentId", request.departmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formDataJson)) {
            body.put("FormDataJson", request.formDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formUuid)) {
            body.put("FormUuid", request.formUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processCode)) {
            body.put("ProcessCode", request.processCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/startInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartInstanceHeaders headers = new StartInstanceHeaders();
        return this.startInstanceWithOptions(request, headers, runtime);
    }

    public StatisticsListByTypeReportResponse statisticsListByTypeReportWithOptions(StatisticsListByTypeReportRequest tmpReq, StatisticsListByTypeReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StatisticsListByTypeReportShrinkRequest request = new StatisticsListByTypeReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        StatisticsListByTypeReportShrinkHeaders headers = new StatisticsListByTypeReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StatisticsListByTypeReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/statisticsListByTypeReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StatisticsListByTypeReportResponse());
    }

    public StatisticsListByTypeReportResponse statisticsListByTypeReport(StatisticsListByTypeReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StatisticsListByTypeReportHeaders headers = new StatisticsListByTypeReportHeaders();
        return this.statisticsListByTypeReportWithOptions(request, headers, runtime);
    }

    public StatisticsReportResponse statisticsReportWithOptions(StatisticsReportRequest tmpReq, StatisticsReportHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StatisticsReportShrinkRequest request = new StatisticsReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        StatisticsReportShrinkHeaders headers = new StatisticsReportShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StatisticsReport"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/log/statisticsReport"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StatisticsReportResponse());
    }

    public StatisticsReportResponse statisticsReport(StatisticsReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StatisticsReportHeaders headers = new StatisticsReportHeaders();
        return this.statisticsReportWithOptions(request, headers, runtime);
    }

    public StopCloudRecordResponse stopCloudRecordWithOptions(StopCloudRecordRequest tmpReq, StopCloudRecordHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopCloudRecordShrinkRequest request = new StopCloudRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        StopCloudRecordShrinkHeaders headers = new StopCloudRecordShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conferenceId)) {
            body.put("conferenceId", request.conferenceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCloudRecord"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/stopCloudRecord"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCloudRecordResponse());
    }

    public StopCloudRecordResponse stopCloudRecord(StopCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopCloudRecordHeaders headers = new StopCloudRecordHeaders();
        return this.stopCloudRecordWithOptions(request, headers, runtime);
    }

    public SubscribeCalendarResponse subscribeCalendarWithOptions(SubscribeCalendarRequest request, SubscribeCalendarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SubscribeCalendarShrinkHeaders headers = new SubscribeCalendarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribeCalendar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/subscribeCalendar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeCalendarResponse());
    }

    public SubscribeCalendarResponse subscribeCalendar(SubscribeCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubscribeCalendarHeaders headers = new SubscribeCalendarHeaders();
        return this.subscribeCalendarWithOptions(request, headers, runtime);
    }

    public TerminateInstanceResponse terminateInstanceWithOptions(TerminateInstanceRequest request, TerminateInstanceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        TerminateInstanceShrinkHeaders headers = new TerminateInstanceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TerminateInstance"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/terminateInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TerminateInstanceResponse());
    }

    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TerminateInstanceHeaders headers = new TerminateInstanceHeaders();
        return this.terminateInstanceWithOptions(request, headers, runtime);
    }

    public UnsubscribeCalendarResponse unsubscribeCalendarWithOptions(UnsubscribeCalendarRequest request, UnsubscribeCalendarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        UnsubscribeCalendarShrinkHeaders headers = new UnsubscribeCalendarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnsubscribeCalendar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/unsubscribeCalendar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsubscribeCalendarResponse());
    }

    public UnsubscribeCalendarResponse unsubscribeCalendar(UnsubscribeCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnsubscribeCalendarHeaders headers = new UnsubscribeCalendarHeaders();
        return this.unsubscribeCalendarWithOptions(request, headers, runtime);
    }

    public UpdateFormDataResponse updateFormDataWithOptions(UpdateFormDataRequest request, UpdateFormDataHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        UpdateFormDataShrinkHeaders headers = new UpdateFormDataShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formInstanceId)) {
            body.put("FormInstanceId", request.formInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFormDataJson)) {
            body.put("UpdateFormDataJson", request.updateFormDataJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useLatestVersion)) {
            body.put("UseLatestVersion", request.useLatestVersion);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFormData"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/updateFormData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFormDataResponse());
    }

    public UpdateFormDataResponse updateFormData(UpdateFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateFormDataHeaders headers = new UpdateFormDataHeaders();
        return this.updateFormDataWithOptions(request, headers, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, UpdateInstanceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        UpdateInstanceShrinkHeaders headers = new UpdateInstanceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceId)) {
            body.put("ProcessInstanceId", request.processInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFormDataJson)) {
            body.put("UpdateFormDataJson", request.updateFormDataJson);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/updateInstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInstanceHeaders headers = new UpdateInstanceHeaders();
        return this.updateInstanceWithOptions(request, headers, runtime);
    }

    public UpdateLiveResponse updateLiveWithOptions(UpdateLiveRequest tmpReq, UpdateLiveHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLiveShrinkRequest request = new UpdateLiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateLiveShrinkHeaders headers = new UpdateLiveShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            body.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.introduction)) {
            body.put("Introduction", request.introduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveId)) {
            body.put("LiveId", request.liveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preEndTime)) {
            body.put("PreEndTime", request.preEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStartTime)) {
            body.put("PreStartTime", request.preStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLive"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/updateLive"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLiveResponse());
    }

    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateLiveHeaders headers = new UpdateLiveHeaders();
        return this.updateLiveWithOptions(request, headers, runtime);
    }

    public UpdateMeetingRoomResponse updateMeetingRoomWithOptions(UpdateMeetingRoomRequest tmpReq, UpdateMeetingRoomHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMeetingRoomShrinkRequest request = new UpdateMeetingRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateMeetingRoomShrinkHeaders headers = new UpdateMeetingRoomShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reservationAuthority)) {
            request.reservationAuthorityShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reservationAuthority, "ReservationAuthority", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomLabelIds)) {
            request.roomLabelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomLabelIds, "RoomLabelIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomLocation)) {
            request.roomLocationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomLocation, "RoomLocation", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableCycleReservation)) {
            body.put("EnableCycleReservation", request.enableCycleReservation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isvRoomId)) {
            body.put("IsvRoomId", request.isvRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservationAuthorityShrink)) {
            body.put("ReservationAuthority", request.reservationAuthorityShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCapacity)) {
            body.put("RoomCapacity", request.roomCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("RoomId", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomLabelIdsShrink)) {
            body.put("RoomLabelIds", request.roomLabelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomLocationShrink)) {
            body.put("RoomLocation", request.roomLocationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomName)) {
            body.put("RoomName", request.roomName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomPicture)) {
            body.put("RoomPicture", request.roomPicture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomStatus)) {
            body.put("RoomStatus", request.roomStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMeetingRoom"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/updateMeetingRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMeetingRoomResponse());
    }

    public UpdateMeetingRoomResponse updateMeetingRoom(UpdateMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMeetingRoomHeaders headers = new UpdateMeetingRoomHeaders();
        return this.updateMeetingRoomWithOptions(request, headers, runtime);
    }

    public UpdateMeetingRoomGroupResponse updateMeetingRoomGroupWithOptions(UpdateMeetingRoomGroupRequest tmpReq, UpdateMeetingRoomGroupHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMeetingRoomGroupShrinkRequest request = new UpdateMeetingRoomGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateMeetingRoomGroupShrinkHeaders headers = new UpdateMeetingRoomGroupShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMeetingRoomGroup"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/updateMeetingRoomGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMeetingRoomGroupResponse());
    }

    public UpdateMeetingRoomGroupResponse updateMeetingRoomGroup(UpdateMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMeetingRoomGroupHeaders headers = new UpdateMeetingRoomGroupHeaders();
        return this.updateMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    public UpdateRangeResponse updateRangeWithOptions(UpdateRangeRequest tmpReq, UpdateRangeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRangeShrinkRequest request = new UpdateRangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateRangeShrinkHeaders headers = new UpdateRangeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backgroundColors)) {
            request.backgroundColorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backgroundColors, "BackgroundColors", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hyperlinks)) {
            request.hyperlinksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hyperlinks, "Hyperlinks", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.values)) {
            request.valuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.values, "Values", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColorsShrink)) {
            body.put("BackgroundColors", request.backgroundColorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperlinksShrink)) {
            body.put("Hyperlinks", request.hyperlinksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberFormat)) {
            body.put("NumberFormat", request.numberFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rangeAddress)) {
            body.put("RangeAddress", request.rangeAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sheetId)) {
            body.put("SheetId", request.sheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valuesShrink)) {
            body.put("Values", request.valuesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workbookId)) {
            body.put("WorkbookId", request.workbookId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRange"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/updateRange"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRangeResponse());
    }

    public UpdateRangeResponse updateRange(UpdateRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateRangeHeaders headers = new UpdateRangeHeaders();
        return this.updateRangeWithOptions(request, headers, runtime);
    }

    public UpdateScheduleConferenceResponse updateScheduleConferenceWithOptions(UpdateScheduleConferenceRequest tmpReq, UpdateScheduleConferenceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScheduleConferenceShrinkRequest request = new UpdateScheduleConferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateScheduleConferenceShrinkHeaders headers = new UpdateScheduleConferenceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConferenceId)) {
            body.put("ScheduleConferenceId", request.scheduleConferenceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduleConference"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/updateScheduleConference"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduleConferenceResponse());
    }

    public UpdateScheduleConferenceResponse updateScheduleConference(UpdateScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateScheduleConferenceHeaders headers = new UpdateScheduleConferenceHeaders();
        return this.updateScheduleConferenceWithOptions(request, headers, runtime);
    }

    public UpdateStatusResponse updateStatusWithOptions(UpdateStatusRequest tmpReq, UpdateStatusHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStatusShrinkRequest request = new UpdateStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateStatusShrinkHeaders headers = new UpdateStatusShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.errorLines)) {
            request.errorLinesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.errorLines, "ErrorLines", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorLinesShrink)) {
            body.put("ErrorLines", request.errorLinesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importSequence)) {
            body.put("ImportSequence", request.importSequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemToken)) {
            body.put("SystemToken", request.systemToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStatus"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/yida/updateStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStatusResponse());
    }

    public UpdateStatusResponse updateStatus(UpdateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateStatusHeaders headers = new UpdateStatusHeaders();
        return this.updateStatusWithOptions(request, headers, runtime);
    }

    public UpdateSubscribedCalendarsResponse updateSubscribedCalendarsWithOptions(UpdateSubscribedCalendarsRequest tmpReq, UpdateSubscribedCalendarsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSubscribedCalendarsShrinkRequest request = new UpdateSubscribedCalendarsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateSubscribedCalendarsShrinkHeaders headers = new UpdateSubscribedCalendarsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.managers)) {
            request.managersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.managers, "Managers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subscribeScope)) {
            request.subscribeScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subscribeScope, "SubscribeScope", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarId)) {
            body.put("CalendarId", request.calendarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managersShrink)) {
            body.put("Managers", request.managersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeScopeShrink)) {
            body.put("SubscribeScope", request.subscribeScopeShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscribedCalendars"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/calendar/updateSubscribedCalendars"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscribedCalendarsResponse());
    }

    public UpdateSubscribedCalendarsResponse updateSubscribedCalendars(UpdateSubscribedCalendarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateSubscribedCalendarsHeaders headers = new UpdateSubscribedCalendarsHeaders();
        return this.updateSubscribedCalendarsWithOptions(request, headers, runtime);
    }

    public UpdateTodoTaskResponse updateTodoTaskWithOptions(UpdateTodoTaskRequest tmpReq, UpdateTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTodoTaskShrinkRequest request = new UpdateTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateTodoTaskShrinkHeaders headers = new UpdateTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "executorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.participantIds)) {
            request.participantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.participantIds, "participantIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.done)) {
            body.put("done", request.done);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("dueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            body.put("executorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantIdsShrink)) {
            body.put("participantIds", request.participantIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/updateTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTodoTaskResponse());
    }

    public UpdateTodoTaskResponse updateTodoTask(UpdateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskHeaders headers = new UpdateTodoTaskHeaders();
        return this.updateTodoTaskWithOptions(request, headers, runtime);
    }

    public UpdateTodoTaskExecutorStatusResponse updateTodoTaskExecutorStatusWithOptions(UpdateTodoTaskExecutorStatusRequest tmpReq, UpdateTodoTaskExecutorStatusHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTodoTaskExecutorStatusShrinkRequest request = new UpdateTodoTaskExecutorStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateTodoTaskExecutorStatusShrinkHeaders headers = new UpdateTodoTaskExecutorStatusShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorStatusList)) {
            request.executorStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorStatusList, "executorStatusList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorStatusListShrink)) {
            body.put("executorStatusList", request.executorStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            body.put("operatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTodoTaskExecutorStatus"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/updateTodoTaskExecutorStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTodoTaskExecutorStatusResponse());
    }

    public UpdateTodoTaskExecutorStatusResponse updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskExecutorStatusHeaders headers = new UpdateTodoTaskExecutorStatusHeaders();
        return this.updateTodoTaskExecutorStatusWithOptions(request, headers, runtime);
    }

    public UpdateUserAvatarResponse updateUserAvatarWithOptions(UpdateUserAvatarRequest request, UpdateUserAvatarHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        UpdateUserAvatarShrinkHeaders headers = new UpdateUserAvatarShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatarMediaId)) {
            body.put("AvatarMediaId", request.avatarMediaId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserAvatar"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/contact/updateUserAvatar"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserAvatarResponse());
    }

    public UpdateUserAvatarResponse updateUserAvatar(UpdateUserAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateUserAvatarHeaders headers = new UpdateUserAvatarHeaders();
        return this.updateUserAvatarWithOptions(request, headers, runtime);
    }

    public UpdateWorkspaceDocMembersResponse updateWorkspaceDocMembersWithOptions(UpdateWorkspaceDocMembersRequest tmpReq, UpdateWorkspaceDocMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkspaceDocMembersShrinkRequest request = new UpdateWorkspaceDocMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateWorkspaceDocMembersShrinkHeaders headers = new UpdateWorkspaceDocMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceDocMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/updateWorkspaceDocMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceDocMembersResponse());
    }

    public UpdateWorkspaceDocMembersResponse updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceDocMembersHeaders headers = new UpdateWorkspaceDocMembersHeaders();
        return this.updateWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    public UpdateWorkspaceMembersResponse updateWorkspaceMembersWithOptions(UpdateWorkspaceMembersRequest tmpReq, UpdateWorkspaceMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkspaceMembersShrinkRequest request = new UpdateWorkspaceMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateWorkspaceMembersShrinkHeaders headers = new UpdateWorkspaceMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/updateWorkspaceMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceMembersResponse());
    }

    public UpdateWorkspaceMembersResponse updateWorkspaceMembers(UpdateWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceMembersHeaders headers = new UpdateWorkspaceMembersHeaders();
        return this.updateWorkspaceMembersWithOptions(request, headers, runtime);
    }

    public UploadMediaResponse uploadMediaWithOptions(UploadMediaRequest tmpReq, UploadMediaHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadMediaShrinkRequest request = new UploadMediaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UploadMediaShrinkHeaders headers = new UploadMediaShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaName)) {
            body.put("mediaName", request.mediaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            body.put("mediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMedia"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/documents/uploadMedia"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMediaResponse());
    }

    public UploadMediaResponse uploadMedia(UploadMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadMediaHeaders headers = new UploadMediaHeaders();
        return this.uploadMediaWithOptions(request, headers, runtime);
    }

    public WearOrgHonorResponse wearOrgHonorWithOptions(WearOrgHonorRequest tmpReq, WearOrgHonorHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WearOrgHonorShrinkRequest request = new WearOrgHonorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        WearOrgHonorShrinkHeaders headers = new WearOrgHonorShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.honorId)) {
            body.put("honorId", request.honorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("orgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wear)) {
            body.put("wear", request.wear);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accountContextShrink)) {
            realHeaders.put("AccountContext", com.aliyun.teautil.Common.toJSONString(headers.accountContextShrink));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WearOrgHonor"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/honor/wearOrgHonor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WearOrgHonorResponse());
    }

    public WearOrgHonorResponse wearOrgHonor(WearOrgHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WearOrgHonorHeaders headers = new WearOrgHonorHeaders();
        return this.wearOrgHonorWithOptions(request, headers, runtime);
    }
}
