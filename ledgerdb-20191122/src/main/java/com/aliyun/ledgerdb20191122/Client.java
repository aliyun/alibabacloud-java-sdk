// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122;

import com.aliyun.tea.*;
import com.aliyun.ledgerdb20191122.models.*;
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
        this._endpoint = this.getEndpoint("ledgerdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AcceptMemberResponse acceptMemberWithOptions(AcceptMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcceptMember", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new AcceptMemberResponse());
    }

    public AcceptMemberResponse acceptMember(AcceptMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptMemberWithOptions(request, runtime);
    }

    public CreateVpcEndpointResponse createVpcEndpointWithOptions(CreateVpcEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpcEndpoint", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpcEndpointResponse());
    }

    public CreateVpcEndpointResponse createVpcEndpoint(CreateVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcEndpointWithOptions(request, runtime);
    }

    public DeleteLedgerResponse deleteLedgerWithOptions(DeleteLedgerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLedger", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLedgerResponse());
    }

    public DeleteLedgerResponse deleteLedger(DeleteLedgerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLedgerWithOptions(request, runtime);
    }

    public DeleteMemberResponse deleteMemberWithOptions(DeleteMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMember", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMemberResponse());
    }

    public DeleteMemberResponse deleteMember(DeleteMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMemberWithOptions(request, runtime);
    }

    public DeleteVpcEndpointResponse deleteVpcEndpointWithOptions(DeleteVpcEndpointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpcEndpoint", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpcEndpointResponse());
    }

    public DeleteVpcEndpointResponse deleteVpcEndpoint(DeleteVpcEndpointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcEndpointWithOptions(request, runtime);
    }

    public DescribeLedgerResponse describeLedgerWithOptions(DescribeLedgerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLedger", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLedgerResponse());
    }

    public DescribeLedgerResponse describeLedger(DescribeLedgerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLedgerWithOptions(request, runtime);
    }

    public DescribeLedgersResponse describeLedgersWithOptions(DescribeLedgersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLedgers", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLedgersResponse());
    }

    public DescribeLedgersResponse describeLedgers(DescribeLedgersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLedgersWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeTSAResponse describeTSAWithOptions(DescribeTSARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTSA", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTSAResponse());
    }

    public DescribeTSAResponse describeTSA(DescribeTSARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTSAWithOptions(request, runtime);
    }

    public DisableMemberResponse disableMemberWithOptions(DisableMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableMember", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new DisableMemberResponse());
    }

    public DisableMemberResponse disableMember(DisableMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableMemberWithOptions(request, runtime);
    }

    public EnableMemberResponse enableMemberWithOptions(EnableMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableMember", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new EnableMemberResponse());
    }

    public EnableMemberResponse enableMember(EnableMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableMemberWithOptions(request, runtime);
    }

    public GetAccessAttributeResponse getAccessAttributeWithOptions(GetAccessAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccessAttribute", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new GetAccessAttributeResponse());
    }

    public GetAccessAttributeResponse getAccessAttribute(GetAccessAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccessAttributeWithOptions(request, runtime);
    }

    public GetIpWhiteListResponse getIpWhiteListWithOptions(GetIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpWhiteList", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new GetIpWhiteListResponse());
    }

    public GetIpWhiteListResponse getIpWhiteList(GetIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpWhiteListWithOptions(request, runtime);
    }

    public GetJournalResponse getJournalWithOptions(GetJournalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJournal", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new GetJournalResponse());
    }

    public GetJournalResponse getJournal(GetJournalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJournalWithOptions(request, runtime);
    }

    public GetMemberResponse getMemberWithOptions(GetMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMember", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new GetMemberResponse());
    }

    public GetMemberResponse getMember(GetMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMemberWithOptions(request, runtime);
    }

    public GrantServiceLinkedRoleResponse grantServiceLinkedRoleWithOptions(GrantServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantServiceLinkedRole", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new GrantServiceLinkedRoleResponse());
    }

    public GrantServiceLinkedRoleResponse grantServiceLinkedRole(GrantServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantServiceLinkedRoleWithOptions(request, runtime);
    }

    public InviteMembersResponse inviteMembersWithOptions(InviteMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InviteMembers", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new InviteMembersResponse());
    }

    public InviteMembersResponse inviteMembers(InviteMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inviteMembersWithOptions(request, runtime);
    }

    public ListJournalsResponse listJournalsWithOptions(ListJournalsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJournals", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new ListJournalsResponse());
    }

    public ListJournalsResponse listJournals(ListJournalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJournalsWithOptions(request, runtime);
    }

    public ListMembersResponse listMembersWithOptions(ListMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMembers", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new ListMembersResponse());
    }

    public ListMembersResponse listMembers(ListMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMembersWithOptions(request, runtime);
    }

    public ListTimeAnchorsResponse listTimeAnchorsWithOptions(ListTimeAnchorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTimeAnchors", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new ListTimeAnchorsResponse());
    }

    public ListTimeAnchorsResponse listTimeAnchors(ListTimeAnchorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTimeAnchorsWithOptions(request, runtime);
    }

    public ListVpcEndpointsResponse listVpcEndpointsWithOptions(ListVpcEndpointsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVpcEndpoints", "2019-11-22", "HTTPS", "GET", "AK", "json", req, runtime), new ListVpcEndpointsResponse());
    }

    public ListVpcEndpointsResponse listVpcEndpoints(ListVpcEndpointsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVpcEndpointsWithOptions(request, runtime);
    }

    public ModifyAccessAttributeResponse modifyAccessAttributeWithOptions(ModifyAccessAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccessAttribute", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccessAttributeResponse());
    }

    public ModifyAccessAttributeResponse modifyAccessAttribute(ModifyAccessAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccessAttributeWithOptions(request, runtime);
    }

    public ModifyIpWhiteListResponse modifyIpWhiteListWithOptions(ModifyIpWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyIpWhiteList", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyIpWhiteListResponse());
    }

    public ModifyIpWhiteListResponse modifyIpWhiteList(ModifyIpWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyIpWhiteListWithOptions(request, runtime);
    }

    public ModifyLedgerAttributeResponse modifyLedgerAttributeWithOptions(ModifyLedgerAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLedgerAttribute", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLedgerAttributeResponse());
    }

    public ModifyLedgerAttributeResponse modifyLedgerAttribute(ModifyLedgerAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLedgerAttributeWithOptions(request, runtime);
    }

    public ModifyMemberACLsResponse modifyMemberACLsWithOptions(ModifyMemberACLsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMemberACLs", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMemberACLsResponse());
    }

    public ModifyMemberACLsResponse modifyMemberACLs(ModifyMemberACLsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMemberACLsWithOptions(request, runtime);
    }

    public ModifyMemberKeyResponse modifyMemberKeyWithOptions(ModifyMemberKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMemberKey", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMemberKeyResponse());
    }

    public ModifyMemberKeyResponse modifyMemberKey(ModifyMemberKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMemberKeyWithOptions(request, runtime);
    }

    public UpdateMemberKeyByKMSResponse updateMemberKeyByKMSWithOptions(UpdateMemberKeyByKMSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMemberKeyByKMS", "2019-11-22", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMemberKeyByKMSResponse());
    }

    public UpdateMemberKeyByKMSResponse updateMemberKeyByKMS(UpdateMemberKeyByKMSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMemberKeyByKMSWithOptions(request, runtime);
    }
}
