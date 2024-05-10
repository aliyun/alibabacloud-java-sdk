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

    /**
     * @summary 添加日程参与者
     *
     * @param tmpReq AddAttendeeRequest
     * @param tmpHeader AddAttendeeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAttendeeResponse
     */
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

    /**
     * @summary 添加日程参与者
     *
     * @param request AddAttendeeRequest
     * @return AddAttendeeResponse
     */
    public AddAttendeeResponse addAttendee(AddAttendeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAttendeeHeaders headers = new AddAttendeeHeaders();
        return this.addAttendeeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 预定会议室
     *
     * @param tmpReq AddMeetingRoomsRequest
     * @param tmpHeader AddMeetingRoomsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMeetingRoomsResponse
     */
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

    /**
     * @summary 预定会议室
     *
     * @param request AddMeetingRoomsRequest
     * @return AddMeetingRoomsResponse
     */
    public AddMeetingRoomsResponse addMeetingRooms(AddMeetingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMeetingRoomsHeaders headers = new AddMeetingRoomsHeaders();
        return this.addMeetingRoomsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 新增群成员
     *
     * @param request AddScenegroupMemberRequest
     * @param tmpHeader AddScenegroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddScenegroupMemberResponse
     */
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

    /**
     * @summary 新增群成员
     *
     * @param request AddScenegroupMemberRequest
     * @return AddScenegroupMemberResponse
     */
    public AddScenegroupMemberResponse addScenegroupMember(AddScenegroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddScenegroupMemberHeaders headers = new AddScenegroupMemberHeaders();
        return this.addScenegroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * @summary 新建知识库
     *
     * @param tmpReq AddWorkspaceRequest
     * @param tmpHeader AddWorkspaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWorkspaceResponse
     */
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

    /**
     * @summary 新建知识库
     *
     * @param request AddWorkspaceRequest
     * @return AddWorkspaceResponse
     */
    public AddWorkspaceResponse addWorkspace(AddWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceHeaders headers = new AddWorkspaceHeaders();
        return this.addWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 添加知识库文档成员
     *
     * @param tmpReq AddWorkspaceDocMembersRequest
     * @param tmpHeader AddWorkspaceDocMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWorkspaceDocMembersResponse
     */
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

    /**
     * @summary 添加知识库文档成员
     *
     * @param request AddWorkspaceDocMembersRequest
     * @return AddWorkspaceDocMembersResponse
     */
    public AddWorkspaceDocMembersResponse addWorkspaceDocMembers(AddWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceDocMembersHeaders headers = new AddWorkspaceDocMembersHeaders();
        return this.addWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 添加知识库成员
     *
     * @param tmpReq AddWorkspaceMembersRequest
     * @param tmpHeader AddWorkspaceMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWorkspaceMembersResponse
     */
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

    /**
     * @summary 添加知识库成员
     *
     * @param request AddWorkspaceMembersRequest
     * @return AddWorkspaceMembersResponse
     */
    public AddWorkspaceMembersResponse addWorkspaceMembers(AddWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddWorkspaceMembersHeaders headers = new AddWorkspaceMembersHeaders();
        return this.addWorkspaceMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量获取表单实例数据
     *
     * @param tmpReq BatchGetFormDataByIdListRequest
     * @param tmpHeader BatchGetFormDataByIdListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetFormDataByIdListResponse
     */
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

    /**
     * @summary 批量获取表单实例数据
     *
     * @param request BatchGetFormDataByIdListRequest
     * @return BatchGetFormDataByIdListResponse
     */
    public BatchGetFormDataByIdListResponse batchGetFormDataByIdList(BatchGetFormDataByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchGetFormDataByIdListHeaders headers = new BatchGetFormDataByIdListHeaders();
        return this.batchGetFormDataByIdListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量删除表单实例
     *
     * @param tmpReq BatchRemovalByFormInstanceIdListRequest
     * @param tmpHeader BatchRemovalByFormInstanceIdListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRemovalByFormInstanceIdListResponse
     */
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

    /**
     * @summary 批量删除表单实例
     *
     * @param request BatchRemovalByFormInstanceIdListRequest
     * @return BatchRemovalByFormInstanceIdListResponse
     */
    public BatchRemovalByFormInstanceIdListResponse batchRemovalByFormInstanceIdList(BatchRemovalByFormInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchRemovalByFormInstanceIdListHeaders headers = new BatchRemovalByFormInstanceIdListHeaders();
        return this.batchRemovalByFormInstanceIdListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量创建表单实例
     *
     * @param tmpReq BatchSaveFormDataRequest
     * @param tmpHeader BatchSaveFormDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSaveFormDataResponse
     */
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

    /**
     * @summary 批量创建表单实例
     *
     * @param request BatchSaveFormDataRequest
     * @return BatchSaveFormDataResponse
     */
    public BatchSaveFormDataResponse batchSaveFormData(BatchSaveFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchSaveFormDataHeaders headers = new BatchSaveFormDataHeaders();
        return this.batchSaveFormDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量更新表单实例内的组件值
     *
     * @param tmpReq BatchUpdateFormDataByInstanceIdRequest
     * @param tmpHeader BatchUpdateFormDataByInstanceIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateFormDataByInstanceIdResponse
     */
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

    /**
     * @summary 批量更新表单实例内的组件值
     *
     * @param request BatchUpdateFormDataByInstanceIdRequest
     * @return BatchUpdateFormDataByInstanceIdResponse
     */
    public BatchUpdateFormDataByInstanceIdResponse batchUpdateFormDataByInstanceId(BatchUpdateFormDataByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchUpdateFormDataByInstanceIdHeaders headers = new BatchUpdateFormDataByInstanceIdHeaders();
        return this.batchUpdateFormDataByInstanceIdWithOptions(request, headers, runtime);
    }

    /**
     * @summary 通过表单实例数据批量更新表单实例
     *
     * @param tmpReq BatchUpdateFormDataByInstanceMapRequest
     * @param tmpHeader BatchUpdateFormDataByInstanceMapHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateFormDataByInstanceMapResponse
     */
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

    /**
     * @summary 通过表单实例数据批量更新表单实例
     *
     * @param request BatchUpdateFormDataByInstanceMapRequest
     * @return BatchUpdateFormDataByInstanceMapResponse
     */
    public BatchUpdateFormDataByInstanceMapResponse batchUpdateFormDataByInstanceMap(BatchUpdateFormDataByInstanceMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchUpdateFormDataByInstanceMapHeaders headers = new BatchUpdateFormDataByInstanceMapHeaders();
        return this.batchUpdateFormDataByInstanceMapWithOptions(request, headers, runtime);
    }

    /**
     * @summary 取消预约会议
     *
     * @param tmpReq CancelScheduleConferenceRequest
     * @param tmpHeader CancelScheduleConferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelScheduleConferenceResponse
     */
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

    /**
     * @summary 取消预约会议
     *
     * @param request CancelScheduleConferenceRequest
     * @return CancelScheduleConferenceResponse
     */
    public CancelScheduleConferenceResponse cancelScheduleConference(CancelScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CancelScheduleConferenceHeaders headers = new CancelScheduleConferenceHeaders();
        return this.cancelScheduleConferenceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询用户是否为企业内部群成员
     *
     * @param request CheckUserIsGroupMemberRequest
     * @param tmpHeader CheckUserIsGroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserIsGroupMemberResponse
     */
    public CheckUserIsGroupMemberResponse checkUserIsGroupMemberWithOptions(CheckUserIsGroupMemberRequest request, CheckUserIsGroupMemberHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        CheckUserIsGroupMemberShrinkHeaders headers = new CheckUserIsGroupMemberShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
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
            new TeaPair("action", "CheckUserIsGroupMember"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/checkUserIsGroupMember"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserIsGroupMemberResponse());
    }

    /**
     * @summary 查询用户是否为企业内部群成员
     *
     * @param request CheckUserIsGroupMemberRequest
     * @return CheckUserIsGroupMemberResponse
     */
    public CheckUserIsGroupMemberResponse checkUserIsGroupMember(CheckUserIsGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckUserIsGroupMemberHeaders headers = new CheckUserIsGroupMemberHeaders();
        return this.checkUserIsGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * @summary 清除单元格所有内容
     *
     * @param tmpReq ClearRequest
     * @param tmpHeader ClearHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearResponse
     */
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

    /**
     * @summary 清除单元格所有内容
     *
     * @param request ClearRequest
     * @return ClearResponse
     */
    public ClearResponse clear(ClearRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ClearHeaders headers = new ClearHeaders();
        return this.clearWithOptions(request, headers, runtime);
    }

    /**
     * @summary 清除单元格数据
     *
     * @param tmpReq ClearDataRequest
     * @param tmpHeader ClearDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearDataResponse
     */
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

    /**
     * @summary 清除单元格数据
     *
     * @param request ClearDataRequest
     * @return ClearDataResponse
     */
    public ClearDataResponse clearData(ClearDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ClearDataHeaders headers = new ClearDataHeaders();
        return this.clearDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取日志评论列表
     *
     * @param tmpReq CommentListReportRequest
     * @param tmpHeader CommentListReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CommentListReportResponse
     */
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

    /**
     * @summary 获取日志评论列表
     *
     * @param request CommentListReportRequest
     * @return CommentListReportResponse
     */
    public CommentListReportResponse commentListReport(CommentListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommentListReportHeaders headers = new CommentListReportHeaders();
        return this.commentListReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发布钉钉投放活动
     *
     * @param tmpReq CreateDeliveryPlanRequest
     * @param tmpHeader CreateDeliveryPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeliveryPlanResponse
     */
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

    /**
     * @summary 发布钉钉投放活动
     *
     * @param request CreateDeliveryPlanRequest
     * @return CreateDeliveryPlanResponse
     */
    public CreateDeliveryPlanResponse createDeliveryPlan(CreateDeliveryPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDeliveryPlanHeaders headers = new CreateDeliveryPlanHeaders();
        return this.createDeliveryPlanWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建日程
     *
     * @param tmpReq CreateEventRequest
     * @param tmpHeader CreateEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.richTextDescription)) {
            request.richTextDescriptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.richTextDescription, "RichTextDescription", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.richTextDescriptionShrink)) {
            body.put("RichTextDescription", request.richTextDescriptionShrink);
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

    /**
     * @summary 创建日程
     *
     * @param request CreateEventRequest
     * @return CreateEventResponse
     */
    public CreateEventResponse createEvent(CreateEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateEventHeaders headers = new CreateEventHeaders();
        return this.createEventWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建直播
     *
     * @param tmpReq CreateLiveRequest
     * @param tmpHeader CreateLiveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLiveResponse
     */
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

    /**
     * @summary 创建直播
     *
     * @param request CreateLiveRequest
     * @return CreateLiveResponse
     */
    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateLiveHeaders headers = new CreateLiveHeaders();
        return this.createLiveWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建会议室
     *
     * @param tmpReq CreateMeetingRoomRequest
     * @param tmpHeader CreateMeetingRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMeetingRoomResponse
     */
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

    /**
     * @summary 创建会议室
     *
     * @param request CreateMeetingRoomRequest
     * @return CreateMeetingRoomResponse
     */
    public CreateMeetingRoomResponse createMeetingRoom(CreateMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateMeetingRoomHeaders headers = new CreateMeetingRoomHeaders();
        return this.createMeetingRoomWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建会议室分组
     *
     * @param tmpReq CreateMeetingRoomGroupRequest
     * @param tmpHeader CreateMeetingRoomGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMeetingRoomGroupResponse
     */
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

    /**
     * @summary 创建会议室分组
     *
     * @param request CreateMeetingRoomGroupRequest
     * @return CreateMeetingRoomGroupResponse
     */
    public CreateMeetingRoomGroupResponse createMeetingRoomGroup(CreateMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateMeetingRoomGroupHeaders headers = new CreateMeetingRoomGroupHeaders();
        return this.createMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 新增或更新表单实例
     *
     * @param request CreateOrUpdateFormDataRequest
     * @param tmpHeader CreateOrUpdateFormDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateFormDataResponse
     */
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

    /**
     * @summary 新增或更新表单实例
     *
     * @param request CreateOrUpdateFormDataRequest
     * @return CreateOrUpdateFormDataResponse
     */
    public CreateOrUpdateFormDataResponse createOrUpdateFormData(CreateOrUpdateFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrUpdateFormDataHeaders headers = new CreateOrUpdateFormDataHeaders();
        return this.createOrUpdateFormDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建荣誉勋章模板
     *
     * @param tmpReq CreateOrgHonorTemplateRequest
     * @param tmpHeader CreateOrgHonorTemplateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrgHonorTemplateResponse
     */
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

    /**
     * @summary 创建荣誉勋章模板
     *
     * @param request CreateOrgHonorTemplateRequest
     * @return CreateOrgHonorTemplateResponse
     */
    public CreateOrgHonorTemplateResponse createOrgHonorTemplate(CreateOrgHonorTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrgHonorTemplateHeaders headers = new CreateOrgHonorTemplateHeaders();
        return this.createOrgHonorTemplateWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建钉钉个人待办任务
     *
     * @param tmpReq CreatePersonalTodoTaskRequest
     * @param tmpHeader CreatePersonalTodoTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalTodoTaskResponse
     */
    public CreatePersonalTodoTaskResponse createPersonalTodoTaskWithOptions(CreatePersonalTodoTaskRequest tmpReq, CreatePersonalTodoTaskHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePersonalTodoTaskShrinkRequest request = new CreatePersonalTodoTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreatePersonalTodoTaskShrinkHeaders headers = new CreatePersonalTodoTaskShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.executorIds)) {
            request.executorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.executorIds, "ExecutorIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyConfigs)) {
            request.notifyConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyConfigs, "NotifyConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.participantIds)) {
            request.participantIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.participantIds, "ParticipantIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dueTime)) {
            body.put("DueTime", request.dueTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorIdsShrink)) {
            body.put("ExecutorIds", request.executorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyConfigsShrink)) {
            body.put("NotifyConfigs", request.notifyConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.participantIdsShrink)) {
            body.put("ParticipantIds", request.participantIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("Subject", request.subject);
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
            new TeaPair("action", "CreatePersonalTodoTask"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/task/createPersonalTodoTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalTodoTaskResponse());
    }

    /**
     * @summary 创建钉钉个人待办任务
     *
     * @param request CreatePersonalTodoTaskRequest
     * @return CreatePersonalTodoTaskResponse
     */
    public CreatePersonalTodoTaskResponse createPersonalTodoTask(CreatePersonalTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatePersonalTodoTaskHeaders headers = new CreatePersonalTodoTaskHeaders();
        return this.createPersonalTodoTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建日志
     *
     * @param tmpReq CreateReportRequest
     * @param tmpHeader CreateReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReportResponse
     */
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

    /**
     * @summary 创建日志
     *
     * @param request CreateReportRequest
     * @return CreateReportResponse
     */
    public CreateReportResponse createReport(CreateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateReportHeaders headers = new CreateReportHeaders();
        return this.createReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建场景群
     *
     * @param request CreateScenegroupRequest
     * @param tmpHeader CreateScenegroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScenegroupResponse
     */
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

    /**
     * @summary 创建场景群
     *
     * @param request CreateScenegroupRequest
     * @return CreateScenegroupResponse
     */
    public CreateScenegroupResponse createScenegroup(CreateScenegroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScenegroupHeaders headers = new CreateScenegroupHeaders();
        return this.createScenegroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建预约会议
     *
     * @param tmpReq CreateScheduleConferenceRequest
     * @param tmpHeader CreateScheduleConferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduleConferenceResponse
     */
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

    /**
     * @summary 创建预约会议
     *
     * @param request CreateScheduleConferenceRequest
     * @return CreateScheduleConferenceResponse
     */
    public CreateScheduleConferenceResponse createScheduleConference(CreateScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScheduleConferenceHeaders headers = new CreateScheduleConferenceHeaders();
        return this.createScheduleConferenceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发布钉钉搜索穹顶
     *
     * @param tmpReq CreateSearchDomeRequest
     * @param tmpHeader CreateSearchDomeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSearchDomeResponse
     */
    public CreateSearchDomeResponse createSearchDomeWithOptions(CreateSearchDomeRequest tmpReq, CreateSearchDomeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSearchDomeShrinkRequest request = new CreateSearchDomeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSearchDomeShrinkHeaders headers = new CreateSearchDomeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "UserIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
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
            new TeaPair("action", "CreateSearchDome"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/createSearchDome"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchDomeResponse());
    }

    /**
     * @summary 发布钉钉搜索穹顶
     *
     * @param request CreateSearchDomeRequest
     * @return CreateSearchDomeResponse
     */
    public CreateSearchDomeResponse createSearchDome(CreateSearchDomeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSearchDomeHeaders headers = new CreateSearchDomeHeaders();
        return this.createSearchDomeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发布钉钉搜索关键词
     *
     * @param tmpReq CreateSearchKeywordRequest
     * @param tmpHeader CreateSearchKeywordHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSearchKeywordResponse
     */
    public CreateSearchKeywordResponse createSearchKeywordWithOptions(CreateSearchKeywordRequest tmpReq, CreateSearchKeywordHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSearchKeywordShrinkRequest request = new CreateSearchKeywordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        CreateSearchKeywordShrinkHeaders headers = new CreateSearchKeywordShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdList)) {
            request.userIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdList, "UserIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
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
            new TeaPair("action", "CreateSearchKeyword"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/watt/createSearchKeyword"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSearchKeywordResponse());
    }

    /**
     * @summary 发布钉钉搜索关键词
     *
     * @param request CreateSearchKeywordRequest
     * @return CreateSearchKeywordResponse
     */
    public CreateSearchKeywordResponse createSearchKeyword(CreateSearchKeywordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSearchKeywordHeaders headers = new CreateSearchKeywordHeaders();
        return this.createSearchKeywordWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建工作表
     *
     * @param tmpReq CreateSheetRequest
     * @param tmpHeader CreateSheetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSheetResponse
     */
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

    /**
     * @summary 创建工作表
     *
     * @param request CreateSheetRequest
     * @return CreateSheetResponse
     */
    public CreateSheetResponse createSheet(CreateSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSheetHeaders headers = new CreateSheetHeaders();
        return this.createSheetWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建订阅日历
     *
     * @param tmpReq CreateSubscribedCalendarRequest
     * @param tmpHeader CreateSubscribedCalendarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubscribedCalendarResponse
     */
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

    /**
     * @summary 创建订阅日历
     *
     * @param request CreateSubscribedCalendarRequest
     * @return CreateSubscribedCalendarResponse
     */
    public CreateSubscribedCalendarResponse createSubscribedCalendar(CreateSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSubscribedCalendarHeaders headers = new CreateSubscribedCalendarHeaders();
        return this.createSubscribedCalendarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建代办
     *
     * @param tmpReq CreateTodoTaskRequest
     * @param tmpHeader CreateTodoTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTodoTaskResponse
     */
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

    /**
     * @summary 创建代办
     *
     * @param request CreateTodoTaskRequest
     * @return CreateTodoTaskResponse
     */
    public CreateTodoTaskResponse createTodoTask(CreateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateTodoTaskHeaders headers = new CreateTodoTaskHeaders();
        return this.createTodoTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建视频会议
     *
     * @param tmpReq CreateVideoConferenceRequest
     * @param tmpHeader CreateVideoConferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoConferenceResponse
     */
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

    /**
     * @summary 创建视频会议
     *
     * @param request CreateVideoConferenceRequest
     * @return CreateVideoConferenceResponse
     */
    public CreateVideoConferenceResponse createVideoConference(CreateVideoConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateVideoConferenceHeaders headers = new CreateVideoConferenceHeaders();
        return this.createVideoConferenceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建知识库
     *
     * @param tmpReq CreateWorkspaceRequest
     * @param tmpHeader CreateWorkspaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
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

    /**
     * @summary 创建知识库
     *
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceHeaders headers = new CreateWorkspaceHeaders();
        return this.createWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建知识库文档
     *
     * @param tmpReq CreateWorkspaceDocRequest
     * @param tmpHeader CreateWorkspaceDocHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceDocResponse
     */
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

    /**
     * @summary 创建知识库文档
     *
     * @param request CreateWorkspaceDocRequest
     * @return CreateWorkspaceDocResponse
     */
    public CreateWorkspaceDocResponse createWorkspaceDoc(CreateWorkspaceDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateWorkspaceDocHeaders headers = new CreateWorkspaceDocHeaders();
        return this.createWorkspaceDocWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除指定列
     *
     * @param tmpReq DeleteColumnsRequest
     * @param tmpHeader DeleteColumnsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteColumnsResponse
     */
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

    /**
     * @summary 删除指定列
     *
     * @param request DeleteColumnsRequest
     * @return DeleteColumnsResponse
     */
    public DeleteColumnsResponse deleteColumns(DeleteColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteColumnsHeaders headers = new DeleteColumnsHeaders();
        return this.deleteColumnsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除日程
     *
     * @param request DeleteEventRequest
     * @param tmpHeader DeleteEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventResponse
     */
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

    /**
     * @summary 删除日程
     *
     * @param request DeleteEventRequest
     * @return DeleteEventResponse
     */
    public DeleteEventResponse deleteEvent(DeleteEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteEventHeaders headers = new DeleteEventHeaders();
        return this.deleteEventWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除表单数据
     *
     * @param request DeleteFormDataRequest
     * @param tmpHeader DeleteFormDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFormDataResponse
     */
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

    /**
     * @summary 删除表单数据
     *
     * @param request DeleteFormDataRequest
     * @return DeleteFormDataResponse
     */
    public DeleteFormDataResponse deleteFormData(DeleteFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteFormDataHeaders headers = new DeleteFormDataHeaders();
        return this.deleteFormDataWithOptions(request, headers, runtime);
    }

    /**
     * @param request DeleteInstanceRequest
     * @param tmpHeader DeleteInstanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
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

    /**
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteInstanceHeaders headers = new DeleteInstanceHeaders();
        return this.deleteInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除直播
     *
     * @param tmpReq DeleteLiveRequest
     * @param tmpHeader DeleteLiveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLiveResponse
     */
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

    /**
     * @summary 删除直播
     *
     * @param request DeleteLiveRequest
     * @return DeleteLiveResponse
     */
    public DeleteLiveResponse deleteLive(DeleteLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteLiveHeaders headers = new DeleteLiveHeaders();
        return this.deleteLiveWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除会议室
     *
     * @param tmpReq DeleteMeetingRoomRequest
     * @param tmpHeader DeleteMeetingRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMeetingRoomResponse
     */
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

    /**
     * @summary 删除会议室
     *
     * @param request DeleteMeetingRoomRequest
     * @return DeleteMeetingRoomResponse
     */
    public DeleteMeetingRoomResponse deleteMeetingRoom(DeleteMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMeetingRoomHeaders headers = new DeleteMeetingRoomHeaders();
        return this.deleteMeetingRoomWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除会议室分组
     *
     * @param tmpReq DeleteMeetingRoomGroupRequest
     * @param tmpHeader DeleteMeetingRoomGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMeetingRoomGroupResponse
     */
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

    /**
     * @summary 删除会议室分组
     *
     * @param request DeleteMeetingRoomGroupRequest
     * @return DeleteMeetingRoomGroupResponse
     */
    public DeleteMeetingRoomGroupResponse deleteMeetingRoomGroup(DeleteMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMeetingRoomGroupHeaders headers = new DeleteMeetingRoomGroupHeaders();
        return this.deleteMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除指定行
     *
     * @param tmpReq DeleteRowsRequest
     * @param tmpHeader DeleteRowsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRowsResponse
     */
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

    /**
     * @summary 删除指定行
     *
     * @param request DeleteRowsRequest
     * @return DeleteRowsResponse
     */
    public DeleteRowsResponse deleteRows(DeleteRowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteRowsHeaders headers = new DeleteRowsHeaders();
        return this.deleteRowsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除群成员
     *
     * @param request DeleteScenegroupMemberRequest
     * @param tmpHeader DeleteScenegroupMemberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScenegroupMemberResponse
     */
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

    /**
     * @summary 删除群成员
     *
     * @param request DeleteScenegroupMemberRequest
     * @return DeleteScenegroupMemberResponse
     */
    public DeleteScenegroupMemberResponse deleteScenegroupMember(DeleteScenegroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteScenegroupMemberHeaders headers = new DeleteScenegroupMemberHeaders();
        return this.deleteScenegroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除一个工作表
     *
     * @param tmpReq DeleteSheetRequest
     * @param tmpHeader DeleteSheetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSheetResponse
     */
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

    /**
     * @summary 删除一个工作表
     *
     * @param request DeleteSheetRequest
     * @return DeleteSheetResponse
     */
    public DeleteSheetResponse deleteSheet(DeleteSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSheetHeaders headers = new DeleteSheetHeaders();
        return this.deleteSheetWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除订阅日历
     *
     * @param request DeleteSubscribedCalendarRequest
     * @param tmpHeader DeleteSubscribedCalendarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubscribedCalendarResponse
     */
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

    /**
     * @summary 删除订阅日历
     *
     * @param request DeleteSubscribedCalendarRequest
     * @return DeleteSubscribedCalendarResponse
     */
    public DeleteSubscribedCalendarResponse deleteSubscribedCalendar(DeleteSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSubscribedCalendarHeaders headers = new DeleteSubscribedCalendarHeaders();
        return this.deleteSubscribedCalendarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除代办
     *
     * @param tmpReq DeleteTodoTaskRequest
     * @param tmpHeader DeleteTodoTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTodoTaskResponse
     */
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

    /**
     * @summary 删除代办
     *
     * @param request DeleteTodoTaskRequest
     * @return DeleteTodoTaskResponse
     */
    public DeleteTodoTaskResponse deleteTodoTask(DeleteTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteTodoTaskHeaders headers = new DeleteTodoTaskHeaders();
        return this.deleteTodoTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除知识库文档成员
     *
     * @param tmpReq DeleteWorkspaceDocMembersRequest
     * @param tmpHeader DeleteWorkspaceDocMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceDocMembersResponse
     */
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

    /**
     * @summary 删除知识库文档成员
     *
     * @param request DeleteWorkspaceDocMembersRequest
     * @return DeleteWorkspaceDocMembersResponse
     */
    public DeleteWorkspaceDocMembersResponse deleteWorkspaceDocMembers(DeleteWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceDocMembersHeaders headers = new DeleteWorkspaceDocMembersHeaders();
        return this.deleteWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除知识库成员
     *
     * @param tmpReq DeleteWorkspaceMembersRequest
     * @param tmpHeader DeleteWorkspaceMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkspaceMembersResponse
     */
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

    /**
     * @summary 删除知识库成员
     *
     * @param request DeleteWorkspaceMembersRequest
     * @return DeleteWorkspaceMembersResponse
     */
    public DeleteWorkspaceMembersResponse deleteWorkspaceMembers(DeleteWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteWorkspaceMembersHeaders headers = new DeleteWorkspaceMembersHeaders();
        return this.deleteWorkspaceMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量执行宜搭审批任务
     *
     * @param request ExecuteBatchTaskRequest
     * @param tmpHeader ExecuteBatchTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteBatchTaskResponse
     */
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

    /**
     * @summary 批量执行宜搭审批任务
     *
     * @param request ExecuteBatchTaskRequest
     * @return ExecuteBatchTaskResponse
     */
    public ExecuteBatchTaskResponse executeBatchTask(ExecuteBatchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteBatchTaskHeaders headers = new ExecuteBatchTaskHeaders();
        return this.executeBatchTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 执行宜搭的审批任务
     *
     * @param request ExecutePlatformTaskRequest
     * @param tmpHeader ExecutePlatformTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecutePlatformTaskResponse
     */
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

    /**
     * @summary 执行宜搭的审批任务
     *
     * @param request ExecutePlatformTaskRequest
     * @return ExecutePlatformTaskResponse
     */
    public ExecutePlatformTaskResponse executePlatformTask(ExecutePlatformTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecutePlatformTaskHeaders headers = new ExecutePlatformTaskHeaders();
        return this.executePlatformTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 同意或拒绝宜搭审批任务(执行审批任务)
     *
     * @param request ExecuteTaskRequest
     * @param tmpHeader ExecuteTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteTaskResponse
     */
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

    /**
     * @summary 同意或拒绝宜搭审批任务(执行审批任务)
     *
     * @param request ExecuteTaskRequest
     * @return ExecuteTaskResponse
     */
    public ExecuteTaskResponse executeTask(ExecuteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExecuteTaskHeaders headers = new ExecuteTaskHeaders();
        return this.executeTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 群扩容
     *
     * @param tmpReq ExpandGroupCapacityRequest
     * @param tmpHeader ExpandGroupCapacityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExpandGroupCapacityResponse
     */
    public ExpandGroupCapacityResponse expandGroupCapacityWithOptions(ExpandGroupCapacityRequest tmpReq, ExpandGroupCapacityHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExpandGroupCapacityShrinkRequest request = new ExpandGroupCapacityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ExpandGroupCapacityShrinkHeaders headers = new ExpandGroupCapacityShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
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
            new TeaPair("action", "ExpandGroupCapacity"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/im/expandGroupCapacity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpandGroupCapacityResponse());
    }

    /**
     * @summary 群扩容
     *
     * @param request ExpandGroupCapacityRequest
     * @return ExpandGroupCapacityResponse
     */
    public ExpandGroupCapacityResponse expandGroupCapacity(ExpandGroupCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExpandGroupCapacityHeaders headers = new ExpandGroupCapacityHeaders();
        return this.expandGroupCapacityWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取流程设计的节点信息
     *
     * @param request GetActivityListRequest
     * @param tmpHeader GetActivityListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetActivityListResponse
     */
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

    /**
     * @summary 获取流程设计的节点信息
     *
     * @param request GetActivityListRequest
     * @return GetActivityListResponse
     */
    public GetActivityListResponse getActivityList(GetActivityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetActivityListHeaders headers = new GetActivityListHeaders();
        return this.getActivityListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取所有工作表
     *
     * @param tmpReq GetAllSheetsRequest
     * @param tmpHeader GetAllSheetsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAllSheetsResponse
     */
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

    /**
     * @summary 获取所有工作表
     *
     * @param request GetAllSheetsRequest
     * @return GetAllSheetsResponse
     */
    public GetAllSheetsResponse getAllSheets(GetAllSheetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAllSheetsHeaders headers = new GetAllSheetsHeaders();
        return this.getAllSheetsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取群存储空间信息
     *
     * @param tmpReq GetConversaionSpaceRequest
     * @param tmpHeader GetConversaionSpaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversaionSpaceResponse
     */
    public GetConversaionSpaceResponse getConversaionSpaceWithOptions(GetConversaionSpaceRequest tmpReq, GetConversaionSpaceHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetConversaionSpaceShrinkRequest request = new GetConversaionSpaceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetConversaionSpaceShrinkHeaders headers = new GetConversaionSpaceShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
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
            new TeaPair("action", "GetConversaionSpace"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getConversaionSpace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConversaionSpaceResponse());
    }

    /**
     * @summary 获取群存储空间信息
     *
     * @param request GetConversaionSpaceRequest
     * @return GetConversaionSpaceResponse
     */
    public GetConversaionSpaceResponse getConversaionSpace(GetConversaionSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetConversaionSpaceHeaders headers = new GetConversaionSpaceHeaders();
        return this.getConversaionSpaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取组织内已完成的审批任务
     *
     * @param request GetCorpAccomplishmentTasksRequest
     * @param tmpHeader GetCorpAccomplishmentTasksHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCorpAccomplishmentTasksResponse
     */
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

    /**
     * @summary 获取组织内已完成的审批任务
     *
     * @param request GetCorpAccomplishmentTasksRequest
     * @return GetCorpAccomplishmentTasksResponse
     */
    public GetCorpAccomplishmentTasksResponse getCorpAccomplishmentTasks(GetCorpAccomplishmentTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCorpAccomplishmentTasksHeaders headers = new GetCorpAccomplishmentTasksHeaders();
        return this.getCorpAccomplishmentTasksWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取任务列表（组织维度）
     *
     * @param request GetCorpTasksRequest
     * @param tmpHeader GetCorpTasksHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCorpTasksResponse
     */
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

    /**
     * @summary 获取任务列表（组织维度）
     *
     * @param request GetCorpTasksRequest
     * @return GetCorpTasksResponse
     */
    public GetCorpTasksResponse getCorpTasks(GetCorpTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCorpTasksHeaders headers = new GetCorpTasksHeaders();
        return this.getCorpTasksWithOptions(request, headers, runtime);
    }

    /**
     * @summary 委托权限获取文档内容
     *
     * @param tmpReq GetDocContentRequest
     * @param tmpHeader GetDocContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocContentResponse
     */
    public GetDocContentResponse getDocContentWithOptions(GetDocContentRequest tmpReq, GetDocContentHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDocContentShrinkRequest request = new GetDocContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetDocContentShrinkHeaders headers = new GetDocContentShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dentryUuid)) {
            body.put("DentryUuid", request.dentryUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFormat)) {
            body.put("TargetFormat", request.targetFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userToken)) {
            body.put("userToken", request.userToken);
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
            new TeaPair("action", "GetDocContent"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getDocContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocContentResponse());
    }

    /**
     * @summary 委托权限获取文档内容
     *
     * @param request GetDocContentRequest
     * @return GetDocContentResponse
     */
    public GetDocContentResponse getDocContent(GetDocContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDocContentHeaders headers = new GetDocContentHeaders();
        return this.getDocContentWithOptions(request, headers, runtime);
    }

    /**
     * @summary 委托权限获取文档内容taskId
     *
     * @param tmpReq GetDocContentTakIdRequest
     * @param tmpHeader GetDocContentTakIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocContentTakIdResponse
     */
    public GetDocContentTakIdResponse getDocContentTakIdWithOptions(GetDocContentTakIdRequest tmpReq, GetDocContentTakIdHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDocContentTakIdShrinkRequest request = new GetDocContentTakIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetDocContentTakIdShrinkHeaders headers = new GetDocContentTakIdShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dentryUuid)) {
            body.put("DentryUuid", request.dentryUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFormat)) {
            body.put("TargetFormat", request.targetFormat);
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
            new TeaPair("action", "GetDocContentTakId"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v2/documents/getDocContentTakId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDocContentTakIdResponse());
    }

    /**
     * @summary 委托权限获取文档内容taskId
     *
     * @param request GetDocContentTakIdRequest
     * @return GetDocContentTakIdResponse
     */
    public GetDocContentTakIdResponse getDocContentTakId(GetDocContentTakIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDocContentTakIdHeaders headers = new GetDocContentTakIdHeaders();
        return this.getDocContentTakIdWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询单个日程详情
     *
     * @param request GetEventRequest
     * @param tmpHeader GetEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEventResponse
     */
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

    /**
     * @summary 查询单个日程详情
     *
     * @param request GetEventRequest
     * @return GetEventResponse
     */
    public GetEventResponse getEvent(GetEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetEventHeaders headers = new GetEventHeaders();
        return this.getEventWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取表单内的组件信息
     *
     * @param request GetFieldDefByUuidRequest
     * @param tmpHeader GetFieldDefByUuidHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFieldDefByUuidResponse
     */
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

    /**
     * @summary 获取表单内的组件信息
     *
     * @param request GetFieldDefByUuidRequest
     * @return GetFieldDefByUuidResponse
     */
    public GetFieldDefByUuidResponse getFieldDefByUuid(GetFieldDefByUuidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFieldDefByUuidHeaders headers = new GetFieldDefByUuidHeaders();
        return this.getFieldDefByUuidWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取文件下载信息
     *
     * @param tmpReq GetFileDownloadInfoRequest
     * @param tmpHeader GetFileDownloadInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileDownloadInfoResponse
     */
    public GetFileDownloadInfoResponse getFileDownloadInfoWithOptions(GetFileDownloadInfoRequest tmpReq, GetFileDownloadInfoHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetFileDownloadInfoShrinkRequest request = new GetFileDownloadInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetFileDownloadInfoShrinkHeaders headers = new GetFileDownloadInfoShrinkHeaders();
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
        if (!com.aliyun.teautil.Common.isUnset(request.dentryId)) {
            body.put("DentryId", request.dentryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionShrink)) {
            body.put("Option", request.optionShrink);
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
            new TeaPair("action", "GetFileDownloadInfo"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getFileDownloadInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileDownloadInfoResponse());
    }

    /**
     * @summary 获取文件下载信息
     *
     * @param request GetFileDownloadInfoRequest
     * @return GetFileDownloadInfoResponse
     */
    public GetFileDownloadInfoResponse getFileDownloadInfo(GetFileDownloadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFileDownloadInfoHeaders headers = new GetFileDownloadInfoHeaders();
        return this.getFileDownloadInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取表单组件定义列表
     *
     * @param request GetFormComponentDefinitionListRequest
     * @param tmpHeader GetFormComponentDefinitionListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFormComponentDefinitionListResponse
     */
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

    /**
     * @summary 获取表单组件定义列表
     *
     * @param request GetFormComponentDefinitionListRequest
     * @return GetFormComponentDefinitionListResponse
     */
    public GetFormComponentDefinitionListResponse getFormComponentDefinitionList(GetFormComponentDefinitionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormComponentDefinitionListHeaders headers = new GetFormComponentDefinitionListHeaders();
        return this.getFormComponentDefinitionListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询表单数据
     *
     * @param request GetFormDataByIDRequest
     * @param tmpHeader GetFormDataByIDHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFormDataByIDResponse
     */
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

    /**
     * @summary 查询表单数据
     *
     * @param request GetFormDataByIDRequest
     * @return GetFormDataByIDResponse
     */
    public GetFormDataByIDResponse getFormDataByID(GetFormDataByIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormDataByIDHeaders headers = new GetFormDataByIDHeaders();
        return this.getFormDataByIDWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取指定应用下的表单列表
     *
     * @param request GetFormListInAppRequest
     * @param tmpHeader GetFormListInAppHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFormListInAppResponse
     */
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

    /**
     * @summary 获取指定应用下的表单列表
     *
     * @param request GetFormListInAppRequest
     * @return GetFormListInAppResponse
     */
    public GetFormListInAppResponse getFormListInApp(GetFormListInAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetFormListInAppHeaders headers = new GetFormListInAppHeaders();
        return this.getFormListInAppWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询企业内部群成员
     *
     * @param request GetInnerGroupMembersRequest
     * @param tmpHeader GetInnerGroupMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInnerGroupMembersResponse
     */
    public GetInnerGroupMembersResponse getInnerGroupMembersWithOptions(GetInnerGroupMembersRequest request, GetInnerGroupMembersHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        GetInnerGroupMembersShrinkHeaders headers = new GetInnerGroupMembersShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openConversationId)) {
            body.put("OpenConversationId", request.openConversationId);
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
            new TeaPair("action", "GetInnerGroupMembers"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/getInnerGroupMembers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInnerGroupMembersResponse());
    }

    /**
     * @summary 查询企业内部群成员
     *
     * @param request GetInnerGroupMembersRequest
     * @return GetInnerGroupMembersResponse
     */
    public GetInnerGroupMembersResponse getInnerGroupMembers(GetInnerGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInnerGroupMembersHeaders headers = new GetInnerGroupMembersHeaders();
        return this.getInnerGroupMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 根据流程实例ID获取流程实例
     *
     * @param request GetInstanceByIdRequest
     * @param tmpHeader GetInstanceByIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceByIdResponse
     */
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

    /**
     * @summary 根据流程实例ID获取流程实例
     *
     * @param request GetInstanceByIdRequest
     * @return GetInstanceByIdResponse
     */
    public GetInstanceByIdResponse getInstanceById(GetInstanceByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceByIdHeaders headers = new GetInstanceByIdHeaders();
        return this.getInstanceByIdWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取实例ID列表
     *
     * @param request GetInstanceIdListRequest
     * @param tmpHeader GetInstanceIdListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceIdListResponse
     */
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

    /**
     * @summary 获取实例ID列表
     *
     * @param request GetInstanceIdListRequest
     * @return GetInstanceIdListResponse
     */
    public GetInstanceIdListResponse getInstanceIdList(GetInstanceIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstanceIdListHeaders headers = new GetInstanceIdListHeaders();
        return this.getInstanceIdListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取流程实例
     *
     * @param request GetInstancesRequest
     * @param tmpHeader GetInstancesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstancesResponse
     */
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

    /**
     * @summary 获取流程实例
     *
     * @param request GetInstancesRequest
     * @return GetInstancesResponse
     */
    public GetInstancesResponse getInstances(GetInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstancesHeaders headers = new GetInstancesHeaders();
        return this.getInstancesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 根据实例 ID 列表批量获取流程实例详情(批量获取流程实例列表)
     *
     * @param request GetInstancesByIdListRequest
     * @param tmpHeader GetInstancesByIdListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstancesByIdListResponse
     */
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

    /**
     * @summary 根据实例 ID 列表批量获取流程实例详情(批量获取流程实例列表)
     *
     * @param request GetInstancesByIdListRequest
     * @return GetInstancesByIdListResponse
     */
    public GetInstancesByIdListResponse getInstancesByIdList(GetInstancesByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetInstancesByIdListHeaders headers = new GetInstancesByIdListHeaders();
        return this.getInstancesByIdListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取直播的可下载回放地址
     *
     * @param tmpReq GetLiveReplayUrlRequest
     * @param tmpHeader GetLiveReplayUrlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLiveReplayUrlResponse
     */
    public GetLiveReplayUrlResponse getLiveReplayUrlWithOptions(GetLiveReplayUrlRequest tmpReq, GetLiveReplayUrlHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLiveReplayUrlShrinkRequest request = new GetLiveReplayUrlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetLiveReplayUrlShrinkHeaders headers = new GetLiveReplayUrlShrinkHeaders();
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
            new TeaPair("action", "GetLiveReplayUrl"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/getLiveReplayUrl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLiveReplayUrlResponse());
    }

    /**
     * @summary 获取直播的可下载回放地址
     *
     * @param request GetLiveReplayUrlRequest
     * @return GetLiveReplayUrlResponse
     */
    public GetLiveReplayUrlResponse getLiveReplayUrl(GetLiveReplayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLiveReplayUrlHeaders headers = new GetLiveReplayUrlHeaders();
        return this.getLiveReplayUrlWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取组织内某人提交的任务
     *
     * @param request GetMeCorpSubmissionRequest
     * @param tmpHeader GetMeCorpSubmissionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMeCorpSubmissionResponse
     */
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

    /**
     * @summary 获取组织内某人提交的任务
     *
     * @param request GetMeCorpSubmissionRequest
     * @return GetMeCorpSubmissionResponse
     */
    public GetMeCorpSubmissionResponse getMeCorpSubmission(GetMeCorpSubmissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMeCorpSubmissionHeaders headers = new GetMeCorpSubmissionHeaders();
        return this.getMeCorpSubmissionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取会议室忙闲信息
     *
     * @param tmpReq GetMeetingRoomsScheduleRequest
     * @param tmpHeader GetMeetingRoomsScheduleHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMeetingRoomsScheduleResponse
     */
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

    /**
     * @summary 获取会议室忙闲信息
     *
     * @param request GetMeetingRoomsScheduleRequest
     * @return GetMeetingRoomsScheduleResponse
     */
    public GetMeetingRoomsScheduleResponse getMeetingRoomsSchedule(GetMeetingRoomsScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMeetingRoomsScheduleHeaders headers = new GetMeetingRoomsScheduleHeaders();
        return this.getMeetingRoomsScheduleWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取我的文档知识库信息
     *
     * @param tmpReq GetMineWorkspaceRequest
     * @param tmpHeader GetMineWorkspaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMineWorkspaceResponse
     */
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

    /**
     * @summary 获取我的文档知识库信息
     *
     * @param request GetMineWorkspaceRequest
     * @return GetMineWorkspaceResponse
     */
    public GetMineWorkspaceResponse getMineWorkspace(GetMineWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMineWorkspaceHeaders headers = new GetMineWorkspaceHeaders();
        return this.getMineWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询最近活跃的企业内部群列表
     *
     * @param tmpReq GetNewestInnerGroupsRequest
     * @param tmpHeader GetNewestInnerGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNewestInnerGroupsResponse
     */
    public GetNewestInnerGroupsResponse getNewestInnerGroupsWithOptions(GetNewestInnerGroupsRequest tmpReq, GetNewestInnerGroupsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNewestInnerGroupsShrinkRequest request = new GetNewestInnerGroupsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetNewestInnerGroupsShrinkHeaders headers = new GetNewestInnerGroupsShrinkHeaders();
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
            new TeaPair("action", "GetNewestInnerGroups"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/getNewestInnerGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNewestInnerGroupsResponse());
    }

    /**
     * @summary 查询最近活跃的企业内部群列表
     *
     * @param request GetNewestInnerGroupsRequest
     * @return GetNewestInnerGroupsResponse
     */
    public GetNewestInnerGroupsResponse getNewestInnerGroups(GetNewestInnerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNewestInnerGroupsHeaders headers = new GetNewestInnerGroupsHeaders();
        return this.getNewestInnerGroupsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取节点
     *
     * @param tmpReq GetNodeRequest
     * @param tmpHeader GetNodeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeResponse
     */
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

    /**
     * @summary 获取节点
     *
     * @param request GetNodeRequest
     * @return GetNodeResponse
     */
    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodeHeaders headers = new GetNodeHeaders();
        return this.getNodeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 通过链接获取节点
     *
     * @param tmpReq GetNodeByUrlRequest
     * @param tmpHeader GetNodeByUrlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeByUrlResponse
     */
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

    /**
     * @summary 通过链接获取节点
     *
     * @param request GetNodeByUrlRequest
     * @return GetNodeByUrlResponse
     */
    public GetNodeByUrlResponse getNodeByUrl(GetNodeByUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodeByUrlHeaders headers = new GetNodeByUrlHeaders();
        return this.getNodeByUrlWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量获取节点
     *
     * @param tmpReq GetNodesRequest
     * @param tmpHeader GetNodesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodesResponse
     */
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

    /**
     * @summary 批量获取节点
     *
     * @param request GetNodesRequest
     * @return GetNodesResponse
     */
    public GetNodesResponse getNodes(GetNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNodesHeaders headers = new GetNodesHeaders();
        return this.getNodesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取发送给用户的通知
     *
     * @param request GetNotifyMeRequest
     * @param tmpHeader GetNotifyMeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotifyMeResponse
     */
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

    /**
     * @summary 获取发送给用户的通知
     *
     * @param request GetNotifyMeRequest
     * @return GetNotifyMeResponse
     */
    public GetNotifyMeResponse getNotifyMe(GetNotifyMeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetNotifyMeHeaders headers = new GetNotifyMeHeaders();
        return this.getNotifyMeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取宜搭附件临时免登地址
     *
     * @param request GetOpenUrlRequest
     * @param tmpHeader GetOpenUrlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenUrlResponse
     */
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

    /**
     * @summary 获取宜搭附件临时免登地址
     *
     * @param request GetOpenUrlRequest
     * @return GetOpenUrlResponse
     */
    public GetOpenUrlResponse getOpenUrl(GetOpenUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOpenUrlHeaders headers = new GetOpenUrlHeaders();
        return this.getOpenUrlWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取审批记录
     *
     * @param request GetOperationRecordsRequest
     * @param tmpHeader GetOperationRecordsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOperationRecordsResponse
     */
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

    /**
     * @summary 获取审批记录
     *
     * @param request GetOperationRecordsRequest
     * @return GetOperationRecordsResponse
     */
    public GetOperationRecordsResponse getOperationRecords(GetOperationRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOperationRecordsHeaders headers = new GetOperationRecordsHeaders();
        return this.getOperationRecordsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取流程定义
     *
     * @param request GetProcessDefinitionRequest
     * @param tmpHeader GetProcessDefinitionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProcessDefinitionResponse
     */
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

    /**
     * @summary 获取流程定义
     *
     * @param request GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    public GetProcessDefinitionResponse getProcessDefinition(GetProcessDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetProcessDefinitionHeaders headers = new GetProcessDefinitionHeaders();
        return this.getProcessDefinitionWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取单元格区域
     *
     * @param tmpReq GetRangeRequest
     * @param tmpHeader GetRangeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRangeResponse
     */
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

    /**
     * @summary 获取单元格区域
     *
     * @param request GetRangeRequest
     * @return GetRangeResponse
     */
    public GetRangeResponse getRange(GetRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRangeHeaders headers = new GetRangeHeaders();
        return this.getRangeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询用户有权限的知识库列表(旧)
     *
     * @param tmpReq GetRelatedWorkspacesRequest
     * @param tmpHeader GetRelatedWorkspacesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRelatedWorkspacesResponse
     */
    public GetRelatedWorkspacesResponse getRelatedWorkspacesWithOptions(GetRelatedWorkspacesRequest tmpReq, GetRelatedWorkspacesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetRelatedWorkspacesShrinkRequest request = new GetRelatedWorkspacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetRelatedWorkspacesShrinkHeaders headers = new GetRelatedWorkspacesShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeRecent)) {
            body.put("IncludeRecent", request.includeRecent);
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
            new TeaPair("action", "GetRelatedWorkspaces"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/getRelatedWorkspaces"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRelatedWorkspacesResponse());
    }

    /**
     * @summary 查询用户有权限的知识库列表(旧)
     *
     * @param request GetRelatedWorkspacesRequest
     * @return GetRelatedWorkspacesResponse
     */
    public GetRelatedWorkspacesResponse getRelatedWorkspaces(GetRelatedWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRelatedWorkspacesHeaders headers = new GetRelatedWorkspacesHeaders();
        return this.getRelatedWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取模板详情
     *
     * @param tmpReq GetReportTemplateByNameRequest
     * @param tmpHeader GetReportTemplateByNameHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportTemplateByNameResponse
     */
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

    /**
     * @summary 获取模板详情
     *
     * @param request GetReportTemplateByNameRequest
     * @return GetReportTemplateByNameResponse
     */
    public GetReportTemplateByNameResponse getReportTemplateByName(GetReportTemplateByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetReportTemplateByNameHeaders headers = new GetReportTemplateByNameHeaders();
        return this.getReportTemplateByNameWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取员工有多少数量的日志（一个月内）是未读状态
     *
     * @param tmpReq GetReportUnReadCountRequest
     * @param tmpHeader GetReportUnReadCountHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportUnReadCountResponse
     */
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

    /**
     * @summary 获取员工有多少数量的日志（一个月内）是未读状态
     *
     * @param request GetReportUnReadCountRequest
     * @return GetReportUnReadCountResponse
     */
    public GetReportUnReadCountResponse getReportUnReadCount(GetReportUnReadCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetReportUnReadCountHeaders headers = new GetReportUnReadCountHeaders();
        return this.getReportUnReadCountWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询流程运行任务（VPC）
     *
     * @param request GetRunningTasksRequest
     * @param tmpHeader GetRunningTasksHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRunningTasksResponse
     */
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

    /**
     * @summary 查询流程运行任务（VPC）
     *
     * @param request GetRunningTasksRequest
     * @return GetRunningTasksResponse
     */
    public GetRunningTasksResponse getRunningTasks(GetRunningTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetRunningTasksHeaders headers = new GetRunningTasksHeaders();
        return this.getRunningTasksWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取工作表
     *
     * @param tmpReq GetSheetRequest
     * @param tmpHeader GetSheetHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSheetResponse
     */
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

    /**
     * @summary 获取工作表
     *
     * @param request GetSheetRequest
     * @return GetSheetResponse
     */
    public GetSheetResponse getSheet(GetSheetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSheetHeaders headers = new GetSheetHeaders();
        return this.getSheetWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询知识库下的目录结构
     *
     * @param tmpReq GetSpaceDirectoriesRequest
     * @param tmpHeader GetSpaceDirectoriesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpaceDirectoriesResponse
     */
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

    /**
     * @summary 查询知识库下的目录结构
     *
     * @param request GetSpaceDirectoriesRequest
     * @return GetSpaceDirectoriesResponse
     */
    public GetSpaceDirectoriesResponse getSpaceDirectories(GetSpaceDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSpaceDirectoriesHeaders headers = new GetSpaceDirectoriesHeaders();
        return this.getSpaceDirectoriesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询单个订阅日历详情
     *
     * @param request GetSubscribedCalendarRequest
     * @param tmpHeader GetSubscribedCalendarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscribedCalendarResponse
     */
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

    /**
     * @summary 查询单个订阅日历详情
     *
     * @param request GetSubscribedCalendarRequest
     * @return GetSubscribedCalendarResponse
     */
    public GetSubscribedCalendarResponse getSubscribedCalendar(GetSubscribedCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetSubscribedCalendarHeaders headers = new GetSubscribedCalendarHeaders();
        return this.getSubscribedCalendarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询抄送我的任务列表（应用维度）
     *
     * @param request GetTaskCopiesRequest
     * @param tmpHeader GetTaskCopiesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskCopiesResponse
     */
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

    /**
     * @summary 查询抄送我的任务列表（应用维度）
     *
     * @param request GetTaskCopiesRequest
     * @return GetTaskCopiesResponse
     */
    public GetTaskCopiesResponse getTaskCopies(GetTaskCopiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTaskCopiesHeaders headers = new GetTaskCopiesHeaders();
        return this.getTaskCopiesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取用户可见的日志模板
     *
     * @param tmpReq GetTemplateListByUserIdRequest
     * @param tmpHeader GetTemplateListByUserIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateListByUserIdResponse
     */
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

    /**
     * @summary 获取用户可见的日志模板
     *
     * @param request GetTemplateListByUserIdRequest
     * @return GetTemplateListByUserIdResponse
     */
    public GetTemplateListByUserIdResponse getTemplateListByUserId(GetTemplateListByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetTemplateListByUserIdHeaders headers = new GetTemplateListByUserIdHeaders();
        return this.getTemplateListByUserIdWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取专属账号信息
     *
     * @param tmpReq GetUserRequest
     * @param tmpHeader GetUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
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

    /**
     * @summary 获取专属账号信息
     *
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserHeaders headers = new GetUserHeaders();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取用户最新的有效的专属账号迁移方案
     *
     * @param tmpReq GetUserLatestPlanRequest
     * @param tmpHeader GetUserLatestPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserLatestPlanResponse
     */
    public GetUserLatestPlanResponse getUserLatestPlanWithOptions(GetUserLatestPlanRequest tmpReq, GetUserLatestPlanHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserLatestPlanShrinkRequest request = new GetUserLatestPlanShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        GetUserLatestPlanShrinkHeaders headers = new GetUserLatestPlanShrinkHeaders();
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
            new TeaPair("action", "GetUserLatestPlan"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/indepding/getUserLatestPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserLatestPlanResponse());
    }

    /**
     * @summary 获取用户最新的有效的专属账号迁移方案
     *
     * @param request GetUserLatestPlanRequest
     * @return GetUserLatestPlanResponse
     */
    public GetUserLatestPlanResponse getUserLatestPlan(GetUserLatestPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserLatestPlanHeaders headers = new GetUserLatestPlanHeaders();
        return this.getUserLatestPlanWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取知识库
     *
     * @param tmpReq GetWorkspaceRequest
     * @param tmpHeader GetWorkspaceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspaceResponse
     */
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

    /**
     * @summary 获取知识库
     *
     * @param request GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWorkspaceHeaders headers = new GetWorkspaceHeaders();
        return this.getWorkspaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量获取知识库
     *
     * @param tmpReq GetWorkspacesRequest
     * @param tmpHeader GetWorkspacesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkspacesResponse
     */
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

    /**
     * @summary 批量获取知识库
     *
     * @param request GetWorkspacesRequest
     * @return GetWorkspacesResponse
     */
    public GetWorkspacesResponse getWorkspaces(GetWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWorkspacesHeaders headers = new GetWorkspacesHeaders();
        return this.getWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 授予勋章
     *
     * @param tmpReq GrantHonorRequest
     * @param tmpHeader GrantHonorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantHonorResponse
     */
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

    /**
     * @summary 授予勋章
     *
     * @param request GrantHonorRequest
     * @return GrantHonorResponse
     */
    public GrantHonorResponse grantHonor(GrantHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GrantHonorHeaders headers = new GrantHonorHeaders();
        return this.grantHonorWithOptions(request, headers, runtime);
    }

    /**
     * @summary 在指定列左侧插入若干列
     *
     * @param tmpReq InsertColumnsBeforeRequest
     * @param tmpHeader InsertColumnsBeforeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertColumnsBeforeResponse
     */
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

    /**
     * @summary 在指定列左侧插入若干列
     *
     * @param request InsertColumnsBeforeRequest
     * @return InsertColumnsBeforeResponse
     */
    public InsertColumnsBeforeResponse insertColumnsBefore(InsertColumnsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertColumnsBeforeHeaders headers = new InsertColumnsBeforeHeaders();
        return this.insertColumnsBeforeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 在指定行上方插入若干行
     *
     * @param tmpReq InsertRowsBeforeRequest
     * @param tmpHeader InsertRowsBeforeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InsertRowsBeforeResponse
     */
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

    /**
     * @summary 在指定行上方插入若干行
     *
     * @param request InsertRowsBeforeRequest
     * @return InsertRowsBeforeResponse
     */
    public InsertRowsBeforeResponse insertRowsBefore(InsertRowsBeforeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsertRowsBeforeHeaders headers = new InsertRowsBeforeHeaders();
        return this.insertRowsBeforeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 邀请用户入会
     *
     * @param tmpReq InviteUsersRequest
     * @param tmpHeader InviteUsersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InviteUsersResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneInviteeList)) {
            request.phoneInviteeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneInviteeList, "phoneInviteeList", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.phoneInviteeListShrink)) {
            body.put("phoneInviteeList", request.phoneInviteeListShrink);
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

    /**
     * @summary 邀请用户入会
     *
     * @param request InviteUsersRequest
     * @return InviteUsersResponse
     */
    public InviteUsersResponse inviteUsers(InviteUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InviteUsersHeaders headers = new InviteUsersHeaders();
        return this.inviteUsersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询宜搭应用列表
     *
     * @param request ListApplicationRequest
     * @param tmpHeader ListApplicationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationResponse
     */
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

    /**
     * @summary 查询宜搭应用列表
     *
     * @param request ListApplicationRequest
     * @return ListApplicationResponse
     */
    public ListApplicationResponse listApplication(ListApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListApplicationHeaders headers = new ListApplicationHeaders();
        return this.listApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询日历
     *
     * @param tmpReq ListCalendarsRequest
     * @param tmpHeader ListCalendarsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCalendarsResponse
     */
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

    /**
     * @summary 查询日历
     *
     * @param request ListCalendarsRequest
     * @return ListCalendarsResponse
     */
    public ListCalendarsResponse listCalendars(ListCalendarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCalendarsHeaders headers = new ListCalendarsHeaders();
        return this.listCalendarsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取文件或文件夹列表
     *
     * @param tmpReq ListDentriesRequest
     * @param tmpHeader ListDentriesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDentriesResponse
     */
    public ListDentriesResponse listDentriesWithOptions(ListDentriesRequest tmpReq, ListDentriesHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDentriesShrinkRequest request = new ListDentriesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        ListDentriesShrinkHeaders headers = new ListDentriesShrinkHeaders();
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            body.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withThumbnail)) {
            body.put("WithThumbnail", request.withThumbnail);
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
            new TeaPair("action", "ListDentries"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/documents/listDentries"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDentriesResponse());
    }

    /**
     * @summary 获取文件或文件夹列表
     *
     * @param request ListDentriesRequest
     * @return ListDentriesResponse
     */
    public ListDentriesResponse listDentries(ListDentriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDentriesHeaders headers = new ListDentriesHeaders();
        return this.listDentriesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询日程列表
     *
     * @param request ListEventsRequest
     * @param tmpHeader ListEventsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventsResponse
     */
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

    /**
     * @summary 查询日程列表
     *
     * @param request ListEventsRequest
     * @return ListEventsResponse
     */
    public ListEventsResponse listEvents(ListEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventsHeaders headers = new ListEventsHeaders();
        return this.listEventsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询日程视图
     *
     * @param request ListEventsViewRequest
     * @param tmpHeader ListEventsViewHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventsViewResponse
     */
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

    /**
     * @summary 查询日程视图
     *
     * @param request ListEventsViewRequest
     * @return ListEventsViewResponse
     */
    public ListEventsViewResponse listEventsView(ListEventsViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListEventsViewHeaders headers = new ListEventsViewHeaders();
        return this.listEventsViewWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量查询宜搭表单实例的评论
     *
     * @param tmpReq ListFormRemarksRequest
     * @param tmpHeader ListFormRemarksHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFormRemarksResponse
     */
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

    /**
     * @summary 批量查询宜搭表单实例的评论
     *
     * @param request ListFormRemarksRequest
     * @return ListFormRemarksResponse
     */
    public ListFormRemarksResponse listFormRemarks(ListFormRemarksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListFormRemarksHeaders headers = new ListFormRemarksHeaders();
        return this.listFormRemarksWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取应用下的页面列表
     *
     * @param request ListNavigationByFormTypeRequest
     * @param tmpHeader ListNavigationByFormTypeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNavigationByFormTypeResponse
     */
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

    /**
     * @summary 获取应用下的页面列表
     *
     * @param request ListNavigationByFormTypeRequest
     * @return ListNavigationByFormTypeResponse
     */
    public ListNavigationByFormTypeResponse listNavigationByFormType(ListNavigationByFormTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNavigationByFormTypeHeaders headers = new ListNavigationByFormTypeHeaders();
        return this.listNavigationByFormTypeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取节点列表
     *
     * @param tmpReq ListNodesRequest
     * @param tmpHeader ListNodesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
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

    /**
     * @summary 获取节点列表
     *
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListNodesHeaders headers = new ListNodesHeaders();
        return this.listNodesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取用户发出的日志列表
     *
     * @param tmpReq ListReportRequest
     * @param tmpHeader ListReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReportResponse
     */
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

    /**
     * @summary 获取用户发出的日志列表
     *
     * @param request ListReportRequest
     * @return ListReportResponse
     */
    public ListReportResponse listReport(ListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListReportHeaders headers = new ListReportHeaders();
        return this.listReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取子表组件数据
     *
     * @param request ListTableDataByFormInstanceIdTableIdRequest
     * @param tmpHeader ListTableDataByFormInstanceIdTableIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableDataByFormInstanceIdTableIdResponse
     */
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

    /**
     * @summary 获取子表组件数据
     *
     * @param request ListTableDataByFormInstanceIdTableIdRequest
     * @return ListTableDataByFormInstanceIdTableIdResponse
     */
    public ListTableDataByFormInstanceIdTableIdResponse listTableDataByFormInstanceIdTableId(ListTableDataByFormInstanceIdTableIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTableDataByFormInstanceIdTableIdHeaders headers = new ListTableDataByFormInstanceIdTableIdHeaders();
        return this.listTableDataByFormInstanceIdTableIdWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取知识小组列表
     *
     * @param tmpReq ListTeamsRequest
     * @param tmpHeader ListTeamsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTeamsResponse
     */
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

    /**
     * @summary 获取知识小组列表
     *
     * @param request ListTeamsRequest
     * @return ListTeamsResponse
     */
    public ListTeamsResponse listTeams(ListTeamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListTeamsHeaders headers = new ListTeamsHeaders();
        return this.listTeamsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取知识库列表
     *
     * @param tmpReq ListWorkspacesRequest
     * @param tmpHeader ListWorkspacesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
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

    /**
     * @summary 获取知识库列表
     *
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListWorkspacesHeaders headers = new ListWorkspacesHeaders();
        return this.listWorkspacesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 修改日程
     *
     * @param tmpReq PatchEventRequest
     * @param tmpHeader PatchEventHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PatchEventResponse
     */
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

    /**
     * @summary 修改日程
     *
     * @param request PatchEventRequest
     * @return PatchEventResponse
     */
    public PatchEventResponse patchEvent(PatchEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PatchEventHeaders headers = new PatchEventHeaders();
        return this.patchEventWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议录制中的文本信息
     *
     * @param tmpReq QueryCloudRecordTextRequest
     * @param tmpHeader QueryCloudRecordTextHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCloudRecordTextResponse
     */
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

    /**
     * @summary 查询会议录制中的文本信息
     *
     * @param request QueryCloudRecordTextRequest
     * @return QueryCloudRecordTextResponse
     */
    public QueryCloudRecordTextResponse queryCloudRecordText(QueryCloudRecordTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordTextHeaders headers = new QueryCloudRecordTextHeaders();
        return this.queryCloudRecordTextWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议录制的详情信息
     *
     * @param tmpReq QueryCloudRecordVideoRequest
     * @param tmpHeader QueryCloudRecordVideoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCloudRecordVideoResponse
     */
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

    /**
     * @summary 查询会议录制的详情信息
     *
     * @param request QueryCloudRecordVideoRequest
     * @return QueryCloudRecordVideoResponse
     */
    public QueryCloudRecordVideoResponse queryCloudRecordVideo(QueryCloudRecordVideoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordVideoHeaders headers = new QueryCloudRecordVideoHeaders();
        return this.queryCloudRecordVideoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议录制中的视频信息
     *
     * @param tmpReq QueryCloudRecordVideoPlayInfoRequest
     * @param tmpHeader QueryCloudRecordVideoPlayInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCloudRecordVideoPlayInfoResponse
     */
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

    /**
     * @summary 查询会议录制中的视频信息
     *
     * @param request QueryCloudRecordVideoPlayInfoRequest
     * @return QueryCloudRecordVideoPlayInfoResponse
     */
    public QueryCloudRecordVideoPlayInfoResponse queryCloudRecordVideoPlayInfo(QueryCloudRecordVideoPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryCloudRecordVideoPlayInfoHeaders headers = new QueryCloudRecordVideoPlayInfoHeaders();
        return this.queryCloudRecordVideoPlayInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询视频会议信息
     *
     * @param request QueryConferenceInfoRequest
     * @param tmpHeader QueryConferenceInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConferenceInfoResponse
     */
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

    /**
     * @summary 查询视频会议信息
     *
     * @param request QueryConferenceInfoRequest
     * @return QueryConferenceInfoResponse
     */
    public QueryConferenceInfoResponse queryConferenceInfo(QueryConferenceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryConferenceInfoHeaders headers = new QueryConferenceInfoHeaders();
        return this.queryConferenceInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询视频会议成员
     *
     * @param tmpReq QueryConferenceMembersRequest
     * @param tmpHeader QueryConferenceMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConferenceMembersResponse
     */
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

    /**
     * @summary 查询视频会议成员
     *
     * @param request QueryConferenceMembersRequest
     * @return QueryConferenceMembersResponse
     */
    public QueryConferenceMembersResponse queryConferenceMembers(QueryConferenceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryConferenceMembersHeaders headers = new QueryConferenceMembersHeaders();
        return this.queryConferenceMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询知识库节点信息
     *
     * @param tmpReq QueryDentryRequest
     * @param tmpHeader QueryDentryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDentryResponse
     */
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

    /**
     * @summary 查询知识库节点信息
     *
     * @param request QueryDentryRequest
     * @return QueryDentryResponse
     */
    public QueryDentryResponse queryDentry(QueryDentryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryDentryHeaders headers = new QueryDentryHeaders();
        return this.queryDentryWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询直播信息
     *
     * @param tmpReq QueryLiveInfoRequest
     * @param tmpHeader QueryLiveInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLiveInfoResponse
     */
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

    /**
     * @summary 查询直播信息
     *
     * @param request QueryLiveInfoRequest
     * @return QueryLiveInfoResponse
     */
    public QueryLiveInfoResponse queryLiveInfo(QueryLiveInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveInfoHeaders headers = new QueryLiveInfoHeaders();
        return this.queryLiveInfoWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询直播的观看数据
     *
     * @param tmpReq QueryLiveWatchDetailRequest
     * @param tmpHeader QueryLiveWatchDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLiveWatchDetailResponse
     */
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

    /**
     * @summary 查询直播的观看数据
     *
     * @param request QueryLiveWatchDetailRequest
     * @return QueryLiveWatchDetailResponse
     */
    public QueryLiveWatchDetailResponse queryLiveWatchDetail(QueryLiveWatchDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveWatchDetailHeaders headers = new QueryLiveWatchDetailHeaders();
        return this.queryLiveWatchDetailWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询直播观看人员信息
     *
     * @param tmpReq QueryLiveWatchUserListRequest
     * @param tmpHeader QueryLiveWatchUserListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLiveWatchUserListResponse
     */
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

    /**
     * @summary 查询直播观看人员信息
     *
     * @param request QueryLiveWatchUserListRequest
     * @return QueryLiveWatchUserListResponse
     */
    public QueryLiveWatchUserListResponse queryLiveWatchUserList(QueryLiveWatchUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryLiveWatchUserListHeaders headers = new QueryLiveWatchUserListHeaders();
        return this.queryLiveWatchUserListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议室详情
     *
     * @param tmpReq QueryMeetingRoomRequest
     * @param tmpHeader QueryMeetingRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMeetingRoomResponse
     */
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

    /**
     * @summary 查询会议室详情
     *
     * @param request QueryMeetingRoomRequest
     * @return QueryMeetingRoomResponse
     */
    public QueryMeetingRoomResponse queryMeetingRoom(QueryMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomHeaders headers = new QueryMeetingRoomHeaders();
        return this.queryMeetingRoomWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议室分组信息
     *
     * @param tmpReq QueryMeetingRoomGroupRequest
     * @param tmpHeader QueryMeetingRoomGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMeetingRoomGroupResponse
     */
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

    /**
     * @summary 查询会议室分组信息
     *
     * @param request QueryMeetingRoomGroupRequest
     * @return QueryMeetingRoomGroupResponse
     */
    public QueryMeetingRoomGroupResponse queryMeetingRoomGroup(QueryMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomGroupHeaders headers = new QueryMeetingRoomGroupHeaders();
        return this.queryMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议室分组列表
     *
     * @param tmpReq QueryMeetingRoomGroupListRequest
     * @param tmpHeader QueryMeetingRoomGroupListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMeetingRoomGroupListResponse
     */
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

    /**
     * @summary 查询会议室分组列表
     *
     * @param request QueryMeetingRoomGroupListRequest
     * @return QueryMeetingRoomGroupListResponse
     */
    public QueryMeetingRoomGroupListResponse queryMeetingRoomGroupList(QueryMeetingRoomGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomGroupListHeaders headers = new QueryMeetingRoomGroupListHeaders();
        return this.queryMeetingRoomGroupListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询会议室列表
     *
     * @param tmpReq QueryMeetingRoomListRequest
     * @param tmpHeader QueryMeetingRoomListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMeetingRoomListResponse
     */
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

    /**
     * @summary 查询会议室列表
     *
     * @param request QueryMeetingRoomListRequest
     * @return QueryMeetingRoomListResponse
     */
    public QueryMeetingRoomListResponse queryMeetingRoomList(QueryMeetingRoomListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMeetingRoomListHeaders headers = new QueryMeetingRoomListHeaders();
        return this.queryMeetingRoomListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询企业荣誉
     *
     * @param tmpReq QueryOrgHonorsRequest
     * @param tmpHeader QueryOrgHonorsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrgHonorsResponse
     */
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

    /**
     * @summary 查询企业荣誉
     *
     * @param request QueryOrgHonorsRequest
     * @return QueryOrgHonorsResponse
     */
    public QueryOrgHonorsResponse queryOrgHonors(QueryOrgHonorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrgHonorsHeaders headers = new QueryOrgHonorsHeaders();
        return this.queryOrgHonorsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询企业代办
     *
     * @param tmpReq QueryOrgTodoTasksRequest
     * @param tmpHeader QueryOrgTodoTasksHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrgTodoTasksResponse
     */
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

    /**
     * @summary 查询企业代办
     *
     * @param request QueryOrgTodoTasksRequest
     * @return QueryOrgTodoTasksResponse
     */
    public QueryOrgTodoTasksResponse queryOrgTodoTasks(QueryOrgTodoTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrgTodoTasksHeaders headers = new QueryOrgTodoTasksHeaders();
        return this.queryOrgTodoTasksWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询预约会议
     *
     * @param tmpReq QueryScheduleConferenceRequest
     * @param tmpHeader QueryScheduleConferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryScheduleConferenceResponse
     */
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
        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConferenceId)) {
            body.put("scheduleConferenceId", request.scheduleConferenceId);
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

    /**
     * @summary 查询预约会议
     *
     * @param request QueryScheduleConferenceRequest
     * @return QueryScheduleConferenceResponse
     */
    public QueryScheduleConferenceResponse queryScheduleConference(QueryScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryScheduleConferenceHeaders headers = new QueryScheduleConferenceHeaders();
        return this.queryScheduleConferenceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询员工勋章列表
     *
     * @param tmpReq QueryUserHonorsRequest
     * @param tmpHeader QueryUserHonorsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserHonorsResponse
     */
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

    /**
     * @summary 查询员工勋章列表
     *
     * @param request QueryUserHonorsRequest
     * @return QueryUserHonorsResponse
     */
    public QueryUserHonorsResponse queryUserHonors(QueryUserHonorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUserHonorsHeaders headers = new QueryUserHonorsHeaders();
        return this.queryUserHonorsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 收回勋章
     *
     * @param tmpReq RecallHonorRequest
     * @param tmpHeader RecallHonorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecallHonorResponse
     */
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

    /**
     * @summary 收回勋章
     *
     * @param request RecallHonorRequest
     * @return RecallHonorResponse
     */
    public RecallHonorResponse recallHonor(RecallHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RecallHonorHeaders headers = new RecallHonorHeaders();
        return this.recallHonorWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取日志接收人员列表
     *
     * @param tmpReq ReceiverListReportRequest
     * @param tmpHeader ReceiverListReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReceiverListReportResponse
     */
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

    /**
     * @summary 获取日志接收人员列表
     *
     * @param request ReceiverListReportRequest
     * @return ReceiverListReportResponse
     */
    public ReceiverListReportResponse receiverListReport(ReceiverListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ReceiverListReportHeaders headers = new ReceiverListReportHeaders();
        return this.receiverListReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 转交任务
     *
     * @param request RedirectTaskRequest
     * @param tmpHeader RedirectTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RedirectTaskResponse
     */
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

    /**
     * @summary 转交任务
     *
     * @param request RedirectTaskRequest
     * @return RedirectTaskResponse
     */
    public RedirectTaskResponse redirectTask(RedirectTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RedirectTaskHeaders headers = new RedirectTaskHeaders();
        return this.redirectTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 删除日程参与者
     *
     * @param tmpReq RemoveAttendeeRequest
     * @param tmpHeader RemoveAttendeeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAttendeeResponse
     */
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

    /**
     * @summary 删除日程参与者
     *
     * @param request RemoveAttendeeRequest
     * @return RemoveAttendeeResponse
     */
    public RemoveAttendeeResponse removeAttendee(RemoveAttendeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveAttendeeHeaders headers = new RemoveAttendeeHeaders();
        return this.removeAttendeeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 取消预定会议室
     *
     * @param tmpReq RemoveMeetingRoomsRequest
     * @param tmpHeader RemoveMeetingRoomsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveMeetingRoomsResponse
     */
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

    /**
     * @summary 取消预定会议室
     *
     * @param request RemoveMeetingRoomsRequest
     * @return RemoveMeetingRoomsResponse
     */
    public RemoveMeetingRoomsResponse removeMeetingRooms(RemoveMeetingRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveMeetingRoomsHeaders headers = new RemoveMeetingRoomsHeaders();
        return this.removeMeetingRoomsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 保存日志内容
     *
     * @param tmpReq SaveContentRequest
     * @param tmpHeader SaveContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveContentResponse
     */
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

    /**
     * @summary 保存日志内容
     *
     * @param request SaveContentRequest
     * @return SaveContentResponse
     */
    public SaveContentResponse saveContent(SaveContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveContentHeaders headers = new SaveContentHeaders();
        return this.saveContentWithOptions(request, headers, runtime);
    }

    /**
     * @summary 保存表单数据
     *
     * @param request SaveFormDataRequest
     * @param tmpHeader SaveFormDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveFormDataResponse
     */
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

    /**
     * @summary 保存表单数据
     *
     * @param request SaveFormDataRequest
     * @return SaveFormDataResponse
     */
    public SaveFormDataResponse saveFormData(SaveFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveFormDataHeaders headers = new SaveFormDataHeaders();
        return this.saveFormDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary 提交表单或流程实例下的评论
     *
     * @param request SaveFormRemarkRequest
     * @param tmpHeader SaveFormRemarkHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveFormRemarkResponse
     */
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

    /**
     * @summary 提交表单或流程实例下的评论
     *
     * @param request SaveFormRemarkRequest
     * @return SaveFormRemarkResponse
     */
    public SaveFormRemarkResponse saveFormRemark(SaveFormRemarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveFormRemarkHeaders headers = new SaveFormRemarkHeaders();
        return this.saveFormRemarkWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取员工组件的值
     *
     * @param request SearchEmployeeFieldValuesRequest
     * @param tmpHeader SearchEmployeeFieldValuesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchEmployeeFieldValuesResponse
     */
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

    /**
     * @summary 获取员工组件的值
     *
     * @param request SearchEmployeeFieldValuesRequest
     * @return SearchEmployeeFieldValuesResponse
     */
    public SearchEmployeeFieldValuesResponse searchEmployeeFieldValues(SearchEmployeeFieldValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchEmployeeFieldValuesHeaders headers = new SearchEmployeeFieldValuesHeaders();
        return this.searchEmployeeFieldValuesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取多个表单实例ID
     *
     * @param request SearchFormDataIdListRequest
     * @param tmpHeader SearchFormDataIdListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFormDataIdListResponse
     */
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

    /**
     * @summary 获取多个表单实例ID
     *
     * @param request SearchFormDataIdListRequest
     * @return SearchFormDataIdListResponse
     */
    public SearchFormDataIdListResponse searchFormDataIdList(SearchFormDataIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataIdListHeaders headers = new SearchFormDataIdListHeaders();
        return this.searchFormDataIdListWithOptions(request, headers, runtime);
    }

    /**
     * @summary 通过高级查询条件获取表单实例数据（包括子表单组件数据）
     *
     * @param request SearchFormDataSecondGenerationRequest
     * @param tmpHeader SearchFormDataSecondGenerationHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFormDataSecondGenerationResponse
     */
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

    /**
     * @summary 通过高级查询条件获取表单实例数据（包括子表单组件数据）
     *
     * @param request SearchFormDataSecondGenerationRequest
     * @return SearchFormDataSecondGenerationResponse
     */
    public SearchFormDataSecondGenerationResponse searchFormDataSecondGeneration(SearchFormDataSecondGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataSecondGenerationHeaders headers = new SearchFormDataSecondGenerationHeaders();
        return this.searchFormDataSecondGenerationWithOptions(request, headers, runtime);
    }

    /**
     * @summary 通过高级查询条件获取表单实例数据（不包括子表单组件数据）
     *
     * @param request SearchFormDataSecondGenerationNoTableFieldRequest
     * @param tmpHeader SearchFormDataSecondGenerationNoTableFieldHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFormDataSecondGenerationNoTableFieldResponse
     */
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

    /**
     * @summary 通过高级查询条件获取表单实例数据（不包括子表单组件数据）
     *
     * @param request SearchFormDataSecondGenerationNoTableFieldRequest
     * @return SearchFormDataSecondGenerationNoTableFieldResponse
     */
    public SearchFormDataSecondGenerationNoTableFieldResponse searchFormDataSecondGenerationNoTableField(SearchFormDataSecondGenerationNoTableFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDataSecondGenerationNoTableFieldHeaders headers = new SearchFormDataSecondGenerationNoTableFieldHeaders();
        return this.searchFormDataSecondGenerationNoTableFieldWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询表单实例数据
     *
     * @param request SearchFormDatasRequest
     * @param tmpHeader SearchFormDatasHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFormDatasResponse
     */
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

    /**
     * @summary 查询表单实例数据
     *
     * @param request SearchFormDatasRequest
     * @return SearchFormDatasResponse
     */
    public SearchFormDatasResponse searchFormDatas(SearchFormDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchFormDatasHeaders headers = new SearchFormDatasHeaders();
        return this.searchFormDatasWithOptions(request, headers, runtime);
    }

    /**
     * @summary 根据关键词搜索企业内部群
     *
     * @param request SearchInnerGroupsRequest
     * @param tmpHeader SearchInnerGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchInnerGroupsResponse
     */
    public SearchInnerGroupsResponse searchInnerGroupsWithOptions(SearchInnerGroupsRequest request, SearchInnerGroupsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        SearchInnerGroupsShrinkHeaders headers = new SearchInnerGroupsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
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
            new TeaPair("action", "SearchInnerGroups"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/im/searchInnerGroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchInnerGroupsResponse());
    }

    /**
     * @summary 根据关键词搜索企业内部群
     *
     * @param request SearchInnerGroupsRequest
     * @return SearchInnerGroupsResponse
     */
    public SearchInnerGroupsResponse searchInnerGroups(SearchInnerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchInnerGroupsHeaders headers = new SearchInnerGroupsHeaders();
        return this.searchInnerGroupsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发送钉钉Banner通知
     *
     * @param tmpReq SendBannerRequest
     * @param tmpHeader SendBannerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendBannerResponse
     */
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

    /**
     * @summary 发送钉钉Banner通知
     *
     * @param request SendBannerRequest
     * @return SendBannerResponse
     */
    public SendBannerResponse sendBanner(SendBannerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendBannerHeaders headers = new SendBannerHeaders();
        return this.sendBannerWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发送钉钉封屏弹窗
     *
     * @param tmpReq SendPopupRequest
     * @param tmpHeader SendPopupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendPopupResponse
     */
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

    /**
     * @summary 发送钉钉封屏弹窗
     *
     * @param request SendPopupRequest
     * @return SendPopupResponse
     */
    public SendPopupResponse sendPopup(SendPopupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendPopupHeaders headers = new SendPopupHeaders();
        return this.sendPopupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发送钉钉搜索底纹
     *
     * @param tmpReq SendSearchShadeRequest
     * @param tmpHeader SendSearchShadeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendSearchShadeResponse
     */
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

    /**
     * @summary 发送钉钉搜索底纹
     *
     * @param request SendSearchShadeRequest
     * @return SendSearchShadeResponse
     */
    public SendSearchShadeResponse sendSearchShade(SendSearchShadeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendSearchShadeHeaders headers = new SendSearchShadeHeaders();
        return this.sendSearchShadeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 指定列隐藏
     *
     * @param tmpReq SetColumnsVisibilityRequest
     * @param tmpHeader SetColumnsVisibilityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetColumnsVisibilityResponse
     */
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

    /**
     * @summary 指定列隐藏
     *
     * @param request SetColumnsVisibilityRequest
     * @return SetColumnsVisibilityResponse
     */
    public SetColumnsVisibilityResponse setColumnsVisibility(SetColumnsVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetColumnsVisibilityHeaders headers = new SetColumnsVisibilityHeaders();
        return this.setColumnsVisibilityWithOptions(request, headers, runtime);
    }

    /**
     * @summary 指定行隐藏
     *
     * @param tmpReq SetRowsVisibilityRequest
     * @param tmpHeader SetRowsVisibilityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRowsVisibilityResponse
     */
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

    /**
     * @summary 指定行隐藏
     *
     * @param request SetRowsVisibilityRequest
     * @return SetRowsVisibilityResponse
     */
    public SetRowsVisibilityResponse setRowsVisibility(SetRowsVisibilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetRowsVisibilityHeaders headers = new SetRowsVisibilityHeaders();
        return this.setRowsVisibilityWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取用户发送日志的概要信息
     *
     * @param tmpReq SimpleListReportRequest
     * @param tmpHeader SimpleListReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SimpleListReportResponse
     */
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

    /**
     * @summary 获取用户发送日志的概要信息
     *
     * @param request SimpleListReportRequest
     * @return SimpleListReportResponse
     */
    public SimpleListReportResponse simpleListReport(SimpleListReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SimpleListReportHeaders headers = new SimpleListReportHeaders();
        return this.simpleListReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 开启视频会议云录制
     *
     * @param tmpReq StartCloudRecordRequest
     * @param tmpHeader StartCloudRecordHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCloudRecordResponse
     */
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

    /**
     * @summary 开启视频会议云录制
     *
     * @param request StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    public StartCloudRecordResponse startCloudRecord(StartCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartCloudRecordHeaders headers = new StartCloudRecordHeaders();
        return this.startCloudRecordWithOptions(request, headers, runtime);
    }

    /**
     * @summary 发起宜搭审批流程
     *
     * @param request StartInstanceRequest
     * @param tmpHeader StartInstanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.processData)) {
            body.put("ProcessData", request.processData);
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

    /**
     * @summary 发起宜搭审批流程
     *
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StartInstanceHeaders headers = new StartInstanceHeaders();
        return this.startInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取日志相关人员列表
     *
     * @param tmpReq StatisticsListByTypeReportRequest
     * @param tmpHeader StatisticsListByTypeReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StatisticsListByTypeReportResponse
     */
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

    /**
     * @summary 获取日志相关人员列表
     *
     * @param request StatisticsListByTypeReportRequest
     * @return StatisticsListByTypeReportResponse
     */
    public StatisticsListByTypeReportResponse statisticsListByTypeReport(StatisticsListByTypeReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StatisticsListByTypeReportHeaders headers = new StatisticsListByTypeReportHeaders();
        return this.statisticsListByTypeReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 获取日志统计数据
     *
     * @param tmpReq StatisticsReportRequest
     * @param tmpHeader StatisticsReportHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StatisticsReportResponse
     */
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

    /**
     * @summary 获取日志统计数据
     *
     * @param request StatisticsReportRequest
     * @return StatisticsReportResponse
     */
    public StatisticsReportResponse statisticsReport(StatisticsReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StatisticsReportHeaders headers = new StatisticsReportHeaders();
        return this.statisticsReportWithOptions(request, headers, runtime);
    }

    /**
     * @summary 停止视频会议云录制
     *
     * @param tmpReq StopCloudRecordRequest
     * @param tmpHeader StopCloudRecordHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCloudRecordResponse
     */
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

    /**
     * @summary 停止视频会议云录制
     *
     * @param request StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    public StopCloudRecordResponse stopCloudRecord(StopCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StopCloudRecordHeaders headers = new StopCloudRecordHeaders();
        return this.stopCloudRecordWithOptions(request, headers, runtime);
    }

    /**
     * @summary 订阅公共日历
     *
     * @param request SubscribeCalendarRequest
     * @param tmpHeader SubscribeCalendarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscribeCalendarResponse
     */
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

    /**
     * @summary 订阅公共日历
     *
     * @param request SubscribeCalendarRequest
     * @return SubscribeCalendarResponse
     */
    public SubscribeCalendarResponse subscribeCalendar(SubscribeCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubscribeCalendarHeaders headers = new SubscribeCalendarHeaders();
        return this.subscribeCalendarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 同步钉钉账号类型
     *
     * @param tmpReq SyncDingTypeRequest
     * @param tmpHeader SyncDingTypeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDingTypeResponse
     */
    public SyncDingTypeResponse syncDingTypeWithOptions(SyncDingTypeRequest tmpReq, SyncDingTypeHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncDingTypeShrinkRequest request = new SyncDingTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        SyncDingTypeShrinkHeaders headers = new SyncDingTypeShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingType)) {
            body.put("DingType", request.dingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDimission)) {
            body.put("IsDimission", request.isDimission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantContextShrink)) {
            body.put("TenantContext", request.tenantContextShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workNo)) {
            body.put("WorkNo", request.workNo);
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
            new TeaPair("action", "SyncDingType"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/aliding/v1/indepding/syncDingType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDingTypeResponse());
    }

    /**
     * @summary 同步钉钉账号类型
     *
     * @param request SyncDingTypeRequest
     * @return SyncDingTypeResponse
     */
    public SyncDingTypeResponse syncDingType(SyncDingTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncDingTypeHeaders headers = new SyncDingTypeHeaders();
        return this.syncDingTypeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 终止流程实例
     *
     * @param request TerminateInstanceRequest
     * @param tmpHeader TerminateInstanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TerminateInstanceResponse
     */
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

    /**
     * @summary 终止流程实例
     *
     * @param request TerminateInstanceRequest
     * @return TerminateInstanceResponse
     */
    public TerminateInstanceResponse terminateInstance(TerminateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TerminateInstanceHeaders headers = new TerminateInstanceHeaders();
        return this.terminateInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 取消订阅公共日历
     *
     * @param request UnsubscribeCalendarRequest
     * @param tmpHeader UnsubscribeCalendarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnsubscribeCalendarResponse
     */
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

    /**
     * @summary 取消订阅公共日历
     *
     * @param request UnsubscribeCalendarRequest
     * @return UnsubscribeCalendarResponse
     */
    public UnsubscribeCalendarResponse unsubscribeCalendar(UnsubscribeCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnsubscribeCalendarHeaders headers = new UnsubscribeCalendarHeaders();
        return this.unsubscribeCalendarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新表单数据
     *
     * @param request UpdateFormDataRequest
     * @param tmpHeader UpdateFormDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFormDataResponse
     */
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

    /**
     * @summary 更新表单数据
     *
     * @param request UpdateFormDataRequest
     * @return UpdateFormDataResponse
     */
    public UpdateFormDataResponse updateFormData(UpdateFormDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateFormDataHeaders headers = new UpdateFormDataHeaders();
        return this.updateFormDataWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新流程实例
     *
     * @param request UpdateInstanceRequest
     * @param tmpHeader UpdateInstanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
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

    /**
     * @summary 更新流程实例
     *
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateInstanceHeaders headers = new UpdateInstanceHeaders();
        return this.updateInstanceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 修改直播属性信息
     *
     * @param tmpReq UpdateLiveRequest
     * @param tmpHeader UpdateLiveHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLiveResponse
     */
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

    /**
     * @summary 修改直播属性信息
     *
     * @param request UpdateLiveRequest
     * @return UpdateLiveResponse
     */
    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateLiveHeaders headers = new UpdateLiveHeaders();
        return this.updateLiveWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新会议室信息
     *
     * @param tmpReq UpdateMeetingRoomRequest
     * @param tmpHeader UpdateMeetingRoomHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMeetingRoomResponse
     */
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

    /**
     * @summary 更新会议室信息
     *
     * @param request UpdateMeetingRoomRequest
     * @return UpdateMeetingRoomResponse
     */
    public UpdateMeetingRoomResponse updateMeetingRoom(UpdateMeetingRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMeetingRoomHeaders headers = new UpdateMeetingRoomHeaders();
        return this.updateMeetingRoomWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新会议室分组信息
     *
     * @param tmpReq UpdateMeetingRoomGroupRequest
     * @param tmpHeader UpdateMeetingRoomGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMeetingRoomGroupResponse
     */
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

    /**
     * @summary 更新会议室分组信息
     *
     * @param request UpdateMeetingRoomGroupRequest
     * @return UpdateMeetingRoomGroupResponse
     */
    public UpdateMeetingRoomGroupResponse updateMeetingRoomGroup(UpdateMeetingRoomGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateMeetingRoomGroupHeaders headers = new UpdateMeetingRoomGroupHeaders();
        return this.updateMeetingRoomGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新单元格区域
     *
     * @param tmpReq UpdateRangeRequest
     * @param tmpHeader UpdateRangeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRangeResponse
     */
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

    /**
     * @summary 更新单元格区域
     *
     * @param request UpdateRangeRequest
     * @return UpdateRangeResponse
     */
    public UpdateRangeResponse updateRange(UpdateRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateRangeHeaders headers = new UpdateRangeHeaders();
        return this.updateRangeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新预约会议设置
     *
     * @param tmpReq UpdateScheduleConfSettingsRequest
     * @param tmpHeader UpdateScheduleConfSettingsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduleConfSettingsResponse
     */
    public UpdateScheduleConfSettingsResponse updateScheduleConfSettingsWithOptions(UpdateScheduleConfSettingsRequest tmpReq, UpdateScheduleConfSettingsHeaders tmpHeader, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScheduleConfSettingsShrinkRequest request = new UpdateScheduleConfSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        UpdateScheduleConfSettingsShrinkHeaders headers = new UpdateScheduleConfSettingsShrinkHeaders();
        com.aliyun.openapiutil.Client.convert(tmpHeader, headers);
        if (!com.aliyun.teautil.Common.isUnset(tmpHeader.accountContext)) {
            headers.accountContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpHeader.accountContext, "AccountContext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleConfSettingModel)) {
            request.scheduleConfSettingModelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleConfSettingModel, "ScheduleConfSettingModel", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantContext)) {
            request.tenantContextShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantContext, "TenantContext", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scheduleConfSettingModelShrink)) {
            body.put("ScheduleConfSettingModel", request.scheduleConfSettingModelShrink);
        }

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
            new TeaPair("action", "UpdateScheduleConfSettings"),
            new TeaPair("version", "2023-04-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dingtalk/v1/ysp/updateScheduleConfSettings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduleConfSettingsResponse());
    }

    /**
     * @summary 更新预约会议设置
     *
     * @param request UpdateScheduleConfSettingsRequest
     * @return UpdateScheduleConfSettingsResponse
     */
    public UpdateScheduleConfSettingsResponse updateScheduleConfSettings(UpdateScheduleConfSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateScheduleConfSettingsHeaders headers = new UpdateScheduleConfSettingsHeaders();
        return this.updateScheduleConfSettingsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新预约会议
     *
     * @param tmpReq UpdateScheduleConferenceRequest
     * @param tmpHeader UpdateScheduleConferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduleConferenceResponse
     */
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

    /**
     * @summary 更新预约会议
     *
     * @param request UpdateScheduleConferenceRequest
     * @return UpdateScheduleConferenceResponse
     */
    public UpdateScheduleConferenceResponse updateScheduleConference(UpdateScheduleConferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateScheduleConferenceHeaders headers = new UpdateScheduleConferenceHeaders();
        return this.updateScheduleConferenceWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新状态
     *
     * @param tmpReq UpdateStatusRequest
     * @param tmpHeader UpdateStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStatusResponse
     */
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

    /**
     * @summary 更新状态
     *
     * @param request UpdateStatusRequest
     * @return UpdateStatusResponse
     */
    public UpdateStatusResponse updateStatus(UpdateStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateStatusHeaders headers = new UpdateStatusHeaders();
        return this.updateStatusWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新订阅日历
     *
     * @param tmpReq UpdateSubscribedCalendarsRequest
     * @param tmpHeader UpdateSubscribedCalendarsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscribedCalendarsResponse
     */
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

    /**
     * @summary 更新订阅日历
     *
     * @param request UpdateSubscribedCalendarsRequest
     * @return UpdateSubscribedCalendarsResponse
     */
    public UpdateSubscribedCalendarsResponse updateSubscribedCalendars(UpdateSubscribedCalendarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateSubscribedCalendarsHeaders headers = new UpdateSubscribedCalendarsHeaders();
        return this.updateSubscribedCalendarsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新代办
     *
     * @param tmpReq UpdateTodoTaskRequest
     * @param tmpHeader UpdateTodoTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTodoTaskResponse
     */
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

    /**
     * @summary 更新代办
     *
     * @param request UpdateTodoTaskRequest
     * @return UpdateTodoTaskResponse
     */
    public UpdateTodoTaskResponse updateTodoTask(UpdateTodoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskHeaders headers = new UpdateTodoTaskHeaders();
        return this.updateTodoTaskWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新代办执行者状态
     *
     * @param tmpReq UpdateTodoTaskExecutorStatusRequest
     * @param tmpHeader UpdateTodoTaskExecutorStatusHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTodoTaskExecutorStatusResponse
     */
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

    /**
     * @summary 更新代办执行者状态
     *
     * @param request UpdateTodoTaskExecutorStatusRequest
     * @return UpdateTodoTaskExecutorStatusResponse
     */
    public UpdateTodoTaskExecutorStatusResponse updateTodoTaskExecutorStatus(UpdateTodoTaskExecutorStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateTodoTaskExecutorStatusHeaders headers = new UpdateTodoTaskExecutorStatusHeaders();
        return this.updateTodoTaskExecutorStatusWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新企业账号用户头像
     *
     * @param request UpdateUserAvatarRequest
     * @param tmpHeader UpdateUserAvatarHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserAvatarResponse
     */
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

    /**
     * @summary 更新企业账号用户头像
     *
     * @param request UpdateUserAvatarRequest
     * @return UpdateUserAvatarResponse
     */
    public UpdateUserAvatarResponse updateUserAvatar(UpdateUserAvatarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateUserAvatarHeaders headers = new UpdateUserAvatarHeaders();
        return this.updateUserAvatarWithOptions(request, headers, runtime);
    }

    /**
     * @summary 修改知识库文档成员权限
     *
     * @param tmpReq UpdateWorkspaceDocMembersRequest
     * @param tmpHeader UpdateWorkspaceDocMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceDocMembersResponse
     */
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

    /**
     * @summary 修改知识库文档成员权限
     *
     * @param request UpdateWorkspaceDocMembersRequest
     * @return UpdateWorkspaceDocMembersResponse
     */
    public UpdateWorkspaceDocMembersResponse updateWorkspaceDocMembers(UpdateWorkspaceDocMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceDocMembersHeaders headers = new UpdateWorkspaceDocMembersHeaders();
        return this.updateWorkspaceDocMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新知识库成员权限
     *
     * @param tmpReq UpdateWorkspaceMembersRequest
     * @param tmpHeader UpdateWorkspaceMembersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceMembersResponse
     */
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

    /**
     * @summary 更新知识库成员权限
     *
     * @param request UpdateWorkspaceMembersRequest
     * @return UpdateWorkspaceMembersResponse
     */
    public UpdateWorkspaceMembersResponse updateWorkspaceMembers(UpdateWorkspaceMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateWorkspaceMembersHeaders headers = new UpdateWorkspaceMembersHeaders();
        return this.updateWorkspaceMembersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 上传媒体<br/>
     *
     * @param tmpReq UploadMediaRequest
     * @param tmpHeader UploadMediaHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadMediaResponse
     */
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

    /**
     * @summary 上传媒体<br/>
     *
     * @param request UploadMediaRequest
     * @return UploadMediaResponse
     */
    public UploadMediaResponse uploadMedia(UploadMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadMediaHeaders headers = new UploadMediaHeaders();
        return this.uploadMediaWithOptions(request, headers, runtime);
    }

    /**
     * @summary 穿戴勋章
     *
     * @param tmpReq WearOrgHonorRequest
     * @param tmpHeader WearOrgHonorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return WearOrgHonorResponse
     */
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

    /**
     * @summary 穿戴勋章
     *
     * @param request WearOrgHonorRequest
     * @return WearOrgHonorResponse
     */
    public WearOrgHonorResponse wearOrgHonor(WearOrgHonorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WearOrgHonorHeaders headers = new WearOrgHonorHeaders();
        return this.wearOrgHonorWithOptions(request, headers, runtime);
    }
}
