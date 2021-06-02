// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227;

import com.aliyun.tea.*;
import com.aliyun.cccxspaceinner20191227.models.*;
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
        this._endpoint = this.getEndpoint("cccxspaceinner", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetTotalGroupCountResponse getTotalGroupCountWithOptions(GetTotalGroupCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTotalGroupCount", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetTotalGroupCountResponse());
    }

    public GetTotalGroupCountResponse getTotalGroupCount(GetTotalGroupCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTotalGroupCountWithOptions(request, runtime);
    }

    public QueryTicketResponse queryTicketWithOptions(QueryTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTicket", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryTicketResponse());
    }

    public QueryTicketResponse queryTicket(QueryTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketWithOptions(request, runtime);
    }

    public UpdateTicketResponse updateTicketWithOptions(UpdateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTicket", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTicketResponse());
    }

    public UpdateTicketResponse updateTicket(UpdateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTicketWithOptions(request, runtime);
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdWithOptions(ListAgentBySkillGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentBySkillGroupId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new ListAgentBySkillGroupIdResponse());
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    public QueryManagedAgentGroupResponse queryManagedAgentGroupWithOptions(QueryManagedAgentGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryManagedAgentGroup", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryManagedAgentGroupResponse());
    }

    public QueryManagedAgentGroupResponse queryManagedAgentGroup(QueryManagedAgentGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryManagedAgentGroupWithOptions(request, runtime);
    }

    public GenerateTokenResponse generateTokenWithOptions(GenerateTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateToken", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GenerateTokenResponse());
    }

    public GenerateTokenResponse generateToken(GenerateTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateTokenWithOptions(request, runtime);
    }

    public GetTicketResponse getTicketWithOptions(GetTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTicket", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetTicketResponse());
    }

    public GetTicketResponse getTicket(GetTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketWithOptions(request, runtime);
    }

    public CreateMemberResponse createMemberWithOptions(CreateMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMember", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMemberResponse());
    }

    public CreateMemberResponse createMember(CreateMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMemberWithOptions(request, runtime);
    }

    public StartOnlineWorkResponse startOnlineWorkWithOptions(StartOnlineWorkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartOnlineWork", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new StartOnlineWorkResponse());
    }

    public StartOnlineWorkResponse startOnlineWork(StartOnlineWorkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startOnlineWorkWithOptions(request, runtime);
    }

    public ClearAgentGroupsResponse clearAgentGroupsWithOptions(ClearAgentGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearAgentGroups", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new ClearAgentGroupsResponse());
    }

    public ClearAgentGroupsResponse clearAgentGroups(ClearAgentGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearAgentGroupsWithOptions(request, runtime);
    }

    public ListGroupByIdResponse listGroupByIdWithOptions(ListGroupByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroupById", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupByIdResponse());
    }

    public ListGroupByIdResponse listGroupById(ListGroupByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupByIdWithOptions(request, runtime);
    }

    public UpdateOuterAgentResponse updateOuterAgentWithOptions(UpdateOuterAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOuterAgent", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new UpdateOuterAgentResponse());
    }

    public UpdateOuterAgentResponse updateOuterAgent(UpdateOuterAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOuterAgentWithOptions(request, runtime);
    }

    public KickOutAgentResponse kickOutAgentWithOptions(KickOutAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KickOutAgent", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new KickOutAgentResponse());
    }

    public KickOutAgentResponse kickOutAgent(KickOutAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.kickOutAgentWithOptions(request, runtime);
    }

    public InsertXspaceGroupResponse insertXspaceGroupWithOptions(InsertXspaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertXspaceGroup", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new InsertXspaceGroupResponse());
    }

    public InsertXspaceGroupResponse insertXspaceGroup(InsertXspaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertXspaceGroupWithOptions(request, runtime);
    }

    public SendMessageResponse sendMessageWithOptions(SendMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMessage", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new SendMessageResponse());
    }

    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMessageWithOptions(request, runtime);
    }

    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTicket", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTicketResponse());
    }

    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    public CustomActionsOrdersResponse customActionsOrdersWithOptions(CustomActionsOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CustomActionsOrders", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CustomActionsOrdersResponse());
    }

    public CustomActionsOrdersResponse customActionsOrders(CustomActionsOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.customActionsOrdersWithOptions(request, runtime);
    }

    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAgent", "2019-12-27", "HTTPS", "DELETE", "AK", "json", req, runtime), new DeleteAgentResponse());
    }

    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    public QueryTicketActionResponse queryTicketActionWithOptions(QueryTicketActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTicketAction", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTicketActionResponse());
    }

    public QueryTicketActionResponse queryTicketAction(QueryTicketActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketActionWithOptions(request, runtime);
    }

    public CreateCaseTicketResponse createCaseTicketWithOptions(CreateCaseTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCaseTicket", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCaseTicketResponse());
    }

    public CreateCaseTicketResponse createCaseTicket(CreateCaseTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCaseTicketWithOptions(request, runtime);
    }

    public GetAgentBusinessUnitByBuIdResponse getAgentBusinessUnitByBuIdWithOptions(GetAgentBusinessUnitByBuIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentBusinessUnitByBuId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentBusinessUnitByBuIdResponse());
    }

    public GetAgentBusinessUnitByBuIdResponse getAgentBusinessUnitByBuId(GetAgentBusinessUnitByBuIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentBusinessUnitByBuIdWithOptions(request, runtime);
    }

    public GetPageGroupsByChannelTypeResponse getPageGroupsByChannelTypeWithOptions(GetPageGroupsByChannelTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPageGroupsByChannelType", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetPageGroupsByChannelTypeResponse());
    }

    public GetPageGroupsByChannelTypeResponse getPageGroupsByChannelType(GetPageGroupsByChannelTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPageGroupsByChannelTypeWithOptions(request, runtime);
    }

    public TestUpdateAgentGroupResponse testUpdateAgentGroupWithOptions(TestUpdateAgentGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TestUpdateAgentGroup", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new TestUpdateAgentGroupResponse());
    }

    public TestUpdateAgentGroupResponse testUpdateAgentGroup(TestUpdateAgentGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testUpdateAgentGroupWithOptions(request, runtime);
    }

    public GetAgentBusinessUnitByOuterInfoResponse getAgentBusinessUnitByOuterInfoWithOptions(GetAgentBusinessUnitByOuterInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentBusinessUnitByOuterInfo", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentBusinessUnitByOuterInfoResponse());
    }

    public GetAgentBusinessUnitByOuterInfoResponse getAgentBusinessUnitByOuterInfo(GetAgentBusinessUnitByOuterInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentBusinessUnitByOuterInfoWithOptions(request, runtime);
    }

    public UpdateAgentGroupResponse updateAgentGroupWithOptions(UpdateAgentGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAgentGroup", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new UpdateAgentGroupResponse());
    }

    public UpdateAgentGroupResponse updateAgentGroup(UpdateAgentGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgentGroupWithOptions(request, runtime);
    }

    public CreateOuterAdminAgentResponse createOuterAdminAgentWithOptions(CreateOuterAdminAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOuterAdminAgent", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOuterAdminAgentResponse());
    }

    public CreateOuterAdminAgentResponse createOuterAdminAgent(CreateOuterAdminAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOuterAdminAgentWithOptions(request, runtime);
    }

    public GetAgentByAgentIdResponse getAgentByAgentIdWithOptions(GetAgentByAgentIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentByAgentId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentByAgentIdResponse());
    }

    public GetAgentByAgentIdResponse getAgentByAgentId(GetAgentByAgentIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentByAgentIdWithOptions(request, runtime);
    }

    public GetPageGroupsByBuIdResponse getPageGroupsByBuIdWithOptions(GetPageGroupsByBuIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPageGroupsByBuId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetPageGroupsByBuIdResponse());
    }

    public GetPageGroupsByBuIdResponse getPageGroupsByBuId(GetPageGroupsByBuIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPageGroupsByBuIdWithOptions(request, runtime);
    }

    public CreateTicketTypeResponse createTicketTypeWithOptions(CreateTicketTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTicketType", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTicketTypeResponse());
    }

    public CreateTicketTypeResponse createTicketType(CreateTicketTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketTypeWithOptions(request, runtime);
    }

    public ChangeAgentStatusResponse changeAgentStatusWithOptions(ChangeAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeAgentStatus", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new ChangeAgentStatusResponse());
    }

    public ChangeAgentStatusResponse changeAgentStatus(ChangeAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeAgentStatusWithOptions(request, runtime);
    }

    public GrantAdminRoleResponse grantAdminRoleWithOptions(GrantAdminRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantAdminRole", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new GrantAdminRoleResponse());
    }

    public GrantAdminRoleResponse grantAdminRole(GrantAdminRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantAdminRoleWithOptions(request, runtime);
    }

    public StartEvaluationRateResponse startEvaluationRateWithOptions(StartEvaluationRateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartEvaluationRate", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new StartEvaluationRateResponse());
    }

    public StartEvaluationRateResponse startEvaluationRate(StartEvaluationRateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startEvaluationRateWithOptions(request, runtime);
    }

    public SendChannelEventResponse sendChannelEventWithOptions(SendChannelEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendChannelEvent", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new SendChannelEventResponse());
    }

    public SendChannelEventResponse sendChannelEvent(SendChannelEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendChannelEventWithOptions(request, runtime);
    }

    public UpdateChatDispatchRuleResponse updateChatDispatchRuleWithOptions(UpdateChatDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateChatDispatchRule", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateChatDispatchRuleResponse());
    }

    public UpdateChatDispatchRuleResponse updateChatDispatchRule(UpdateChatDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChatDispatchRuleWithOptions(request, runtime);
    }

    public CreateEvaluationResponse createEvaluationWithOptions(CreateEvaluationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEvaluation", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEvaluationResponse());
    }

    public CreateEvaluationResponse createEvaluation(CreateEvaluationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEvaluationWithOptions(request, runtime);
    }

    public UpdateTicketTemplateResponse updateTicketTemplateWithOptions(UpdateTicketTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTicketTemplate", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTicketTemplateResponse());
    }

    public UpdateTicketTemplateResponse updateTicketTemplate(UpdateTicketTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTicketTemplateWithOptions(request, runtime);
    }

    public CloseTicketResponse closeTicketWithOptions(CloseTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseTicket", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CloseTicketResponse());
    }

    public CloseTicketResponse closeTicket(CloseTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeTicketWithOptions(request, runtime);
    }

    public QueryAutoTaskInfoResponse queryAutoTaskInfoWithOptions(QueryAutoTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAutoTaskInfo", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new QueryAutoTaskInfoResponse());
    }

    public QueryAutoTaskInfoResponse queryAutoTaskInfo(QueryAutoTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAutoTaskInfoWithOptions(request, runtime);
    }

    public CreateTicketTemplateResponse createTicketTemplateWithOptions(CreateTicketTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTicketTemplate", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTicketTemplateResponse());
    }

    public CreateTicketTemplateResponse createTicketTemplate(CreateTicketTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTicketTemplateWithOptions(request, runtime);
    }

    public RevokeRoleResponse revokeRoleWithOptions(RevokeRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeRole", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeRoleResponse());
    }

    public RevokeRoleResponse revokeRole(RevokeRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeRoleWithOptions(request, runtime);
    }

    public QueryServicerByPageResponse queryServicerByPageWithOptions(QueryServicerByPageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryServicerByPageShrinkRequest request = new QueryServicerByPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userStatusList)) {
            request.userStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userStatusList, "UserStatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.servicerIds)) {
            request.servicerIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.servicerIds, "ServicerIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryServicerByPage", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new QueryServicerByPageResponse());
    }

    public QueryServicerByPageResponse queryServicerByPage(QueryServicerByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryServicerByPageWithOptions(request, runtime);
    }

    public QueryListRobotResponse queryListRobotWithOptions(QueryListRobotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryListRobot", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryListRobotResponse());
    }

    public QueryListRobotResponse queryListRobot(QueryListRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryListRobotWithOptions(request, runtime);
    }

    public CreateOrUpdateRoleResponse createOrUpdateRoleWithOptions(CreateOrUpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrUpdateRole", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrUpdateRoleResponse());
    }

    public CreateOrUpdateRoleResponse createOrUpdateRole(CreateOrUpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateRoleWithOptions(request, runtime);
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchemaWithOptions(GetTicketTemplateSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTicketTemplateSchema", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new GetTicketTemplateSchemaResponse());
    }

    public GetTicketTemplateSchemaResponse getTicketTemplateSchema(GetTicketTemplateSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTicketTemplateSchemaWithOptions(request, runtime);
    }

    public GetRolesResponse getRolesWithOptions(GetRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRoles", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new GetRolesResponse());
    }

    public GetRolesResponse getRoles(GetRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRolesWithOptions(request, runtime);
    }

    public DeleteXspaceGroupResponse deleteXspaceGroupWithOptions(DeleteXspaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteXspaceGroup", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteXspaceGroupResponse());
    }

    public DeleteXspaceGroupResponse deleteXspaceGroup(DeleteXspaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteXspaceGroupWithOptions(request, runtime);
    }

    public FindActivityResponse findActivityWithOptions(FindActivityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindActivity", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new FindActivityResponse());
    }

    public FindActivityResponse findActivity(FindActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findActivityWithOptions(request, runtime);
    }

    public CreateOuterAgentResponse createOuterAgentWithOptions(CreateOuterAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOuterAgent", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOuterAgentResponse());
    }

    public CreateOuterAgentResponse createOuterAgent(CreateOuterAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOuterAgentWithOptions(request, runtime);
    }

    public ChangeRuleGroupValidStatusResponse changeRuleGroupValidStatusWithOptions(ChangeRuleGroupValidStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeRuleGroupValidStatus", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new ChangeRuleGroupValidStatusResponse());
    }

    public ChangeRuleGroupValidStatusResponse changeRuleGroupValidStatus(ChangeRuleGroupValidStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRuleGroupValidStatusWithOptions(request, runtime);
    }

    public GrantRolesResponse grantRolesWithOptions(GrantRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantRoles", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new GrantRolesResponse());
    }

    public GrantRolesResponse grantRoles(GrantRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantRolesWithOptions(request, runtime);
    }

    public EchoResponse echoWithOptions(EchoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("Echo", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new EchoResponse());
    }

    public EchoResponse echo(EchoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.echoWithOptions(request, runtime);
    }

    public EditXspaceGroupResponse editXspaceGroupWithOptions(EditXspaceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditXspaceGroup", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new EditXspaceGroupResponse());
    }

    public EditXspaceGroupResponse editXspaceGroup(EditXspaceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editXspaceGroupWithOptions(request, runtime);
    }

    public QueryAgentGroupByBuIdResponse queryAgentGroupByBuIdWithOptions(QueryAgentGroupByBuIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAgentGroupByBuId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryAgentGroupByBuIdResponse());
    }

    public QueryAgentGroupByBuIdResponse queryAgentGroupByBuId(QueryAgentGroupByBuIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgentGroupByBuIdWithOptions(request, runtime);
    }

    public DeleteChatDispatchRuleResponse deleteChatDispatchRuleWithOptions(DeleteChatDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChatDispatchRule", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChatDispatchRuleResponse());
    }

    public DeleteChatDispatchRuleResponse deleteChatDispatchRule(DeleteChatDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChatDispatchRuleWithOptions(request, runtime);
    }

    public GetAgentByOuterInfoResponse getAgentByOuterInfoWithOptions(GetAgentByOuterInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentByOuterInfo", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentByOuterInfoResponse());
    }

    public GetAgentByOuterInfoResponse getAgentByOuterInfo(GetAgentByOuterInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentByOuterInfoWithOptions(request, runtime);
    }

    public PageQueryTicketsResponse pageQueryTicketsWithOptions(PageQueryTicketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("PageQueryTickets", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new PageQueryTicketsResponse());
    }

    public PageQueryTicketsResponse pageQueryTickets(PageQueryTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageQueryTicketsWithOptions(request, runtime);
    }

    public GetTotalGroupCountByChannelTypeResponse getTotalGroupCountByChannelTypeWithOptions(GetTotalGroupCountByChannelTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTotalGroupCountByChannelType", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new GetTotalGroupCountByChannelTypeResponse());
    }

    public GetTotalGroupCountByChannelTypeResponse getTotalGroupCountByChannelType(GetTotalGroupCountByChannelTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTotalGroupCountByChannelTypeWithOptions(request, runtime);
    }

    public QueryAgentGroupResponse queryAgentGroupWithOptions(QueryAgentGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAgentGroup", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryAgentGroupResponse());
    }

    public QueryAgentGroupResponse queryAgentGroup(QueryAgentGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgentGroupWithOptions(request, runtime);
    }

    public CreateChatDispatchRuleResponse createChatDispatchRuleWithOptions(CreateChatDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateChatDispatchRule", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateChatDispatchRuleResponse());
    }

    public CreateChatDispatchRuleResponse createChatDispatchRule(CreateChatDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChatDispatchRuleWithOptions(request, runtime);
    }

    public QueryRolesByBuIdResponse queryRolesByBuIdWithOptions(QueryRolesByBuIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRolesByBuId", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new QueryRolesByBuIdResponse());
    }

    public QueryRolesByBuIdResponse queryRolesByBuId(QueryRolesByBuIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRolesByBuIdWithOptions(request, runtime);
    }

    public CreateAgentBusinessUnitResponse createAgentBusinessUnitWithOptions(CreateAgentBusinessUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAgentBusinessUnit", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAgentBusinessUnitResponse());
    }

    public CreateAgentBusinessUnitResponse createAgentBusinessUnit(CreateAgentBusinessUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgentBusinessUnitWithOptions(request, runtime);
    }

    public CreateOrUpdateAutoTaskResponse createOrUpdateAutoTaskWithOptions(CreateOrUpdateAutoTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrUpdateAutoTask", "2019-12-27", "HTTPS", "PUT", "AK", "json", req, runtime), new CreateOrUpdateAutoTaskResponse());
    }

    public CreateOrUpdateAutoTaskResponse createOrUpdateAutoTask(CreateOrUpdateAutoTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateAutoTaskWithOptions(request, runtime);
    }

    public QueryAllCategoryResponse queryAllCategoryWithOptions(QueryAllCategoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAllCategory", "2019-12-27", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAllCategoryResponse());
    }

    public QueryAllCategoryResponse queryAllCategory(QueryAllCategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllCategoryWithOptions(request, runtime);
    }

    public PageQueryTicketResponse pageQueryTicketWithOptions(PageQueryTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("PageQueryTicket", "2019-12-27", "HTTPS", "GET", "AK", "json", req, runtime), new PageQueryTicketResponse());
    }

    public PageQueryTicketResponse pageQueryTicket(PageQueryTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pageQueryTicketWithOptions(request, runtime);
    }
}
