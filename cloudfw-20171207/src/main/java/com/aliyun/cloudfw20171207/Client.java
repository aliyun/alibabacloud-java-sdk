// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207;

import com.aliyun.tea.*;
import com.aliyun.cloudfw20171207.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "cloudfw.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "cloudfw.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudfw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAddressBookResponse addAddressBookWithOptions(AddAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressList", request.addressList);
        query.put("AutoAddTagEcs", request.autoAddTagEcs);
        query.put("Description", request.description);
        query.put("GroupName", request.groupName);
        query.put("GroupType", request.groupType);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        query.put("TagList", request.tagList);
        query.put("TagRelation", request.tagRelation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressBookResponse());
    }

    public AddAddressBookResponse addAddressBook(AddAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAddressBookWithOptions(request, runtime);
    }

    public AddControlPolicyResponse addControlPolicyWithOptions(AddControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("ApplicationName", request.applicationName);
        query.put("Description", request.description);
        query.put("DestPort", request.destPort);
        query.put("DestPortGroup", request.destPortGroup);
        query.put("DestPortType", request.destPortType);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("Direction", request.direction);
        query.put("IpVersion", request.ipVersion);
        query.put("Lang", request.lang);
        query.put("NewOrder", request.newOrder);
        query.put("Proto", request.proto);
        query.put("Release", request.release);
        query.put("Source", request.source);
        query.put("SourceIp", request.sourceIp);
        query.put("SourceType", request.sourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddControlPolicyResponse());
    }

    public AddControlPolicyResponse addControlPolicy(AddControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addControlPolicyWithOptions(request, runtime);
    }

    public AddInstanceMembersResponse addInstanceMembersWithOptions(AddInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Members", request.members);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceMembersResponse());
    }

    public AddInstanceMembersResponse addInstanceMembers(AddInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceMembersWithOptions(request, runtime);
    }

    public BatchCopyVpcFirewallControlPolicyResponse batchCopyVpcFirewallControlPolicyWithOptions(BatchCopyVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        query.put("SourceVpcFirewallId", request.sourceVpcFirewallId);
        query.put("TargetVpcFirewallId", request.targetVpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCopyVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCopyVpcFirewallControlPolicyResponse());
    }

    public BatchCopyVpcFirewallControlPolicyResponse batchCopyVpcFirewallControlPolicy(BatchCopyVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCopyVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public CreateVpcFirewallCenConfigureResponse createVpcFirewallCenConfigureWithOptions(CreateVpcFirewallCenConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("FirewallSwitch", request.firewallSwitch);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("NetworkInstanceId", request.networkInstanceId);
        query.put("VpcFirewallName", request.vpcFirewallName);
        query.put("VpcRegion", request.vpcRegion);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallCenConfigureResponse());
    }

    public CreateVpcFirewallCenConfigureResponse createVpcFirewallCenConfigure(CreateVpcFirewallCenConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    public CreateVpcFirewallConfigureResponse createVpcFirewallConfigureWithOptions(CreateVpcFirewallConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FirewallSwitch", request.firewallSwitch);
        query.put("Lang", request.lang);
        query.put("LocalVpcCidrTableList", request.localVpcCidrTableList);
        query.put("LocalVpcId", request.localVpcId);
        query.put("LocalVpcRegion", request.localVpcRegion);
        query.put("MemberUid", request.memberUid);
        query.put("PeerVpcCidrTableList", request.peerVpcCidrTableList);
        query.put("PeerVpcId", request.peerVpcId);
        query.put("PeerVpcRegion", request.peerVpcRegion);
        query.put("VpcFirewallName", request.vpcFirewallName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallConfigureResponse());
    }

    public CreateVpcFirewallConfigureResponse createVpcFirewallConfigure(CreateVpcFirewallConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcFirewallConfigureWithOptions(request, runtime);
    }

    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicyWithOptions(CreateVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("ApplicationName", request.applicationName);
        query.put("Description", request.description);
        query.put("DestPort", request.destPort);
        query.put("DestPortGroup", request.destPortGroup);
        query.put("DestPortType", request.destPortType);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("NewOrder", request.newOrder);
        query.put("Proto", request.proto);
        query.put("Source", request.source);
        query.put("SourceType", request.sourceType);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpcFirewallControlPolicyResponse());
    }

    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DeleteAddressBookResponse deleteAddressBookWithOptions(DeleteAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("GroupUuid", request.groupUuid);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAddressBookResponse());
    }

    public DeleteAddressBookResponse deleteAddressBook(DeleteAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAddressBookWithOptions(request, runtime);
    }

    public DeleteControlPolicyResponse deleteControlPolicyWithOptions(DeleteControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclUuid", request.aclUuid);
        query.put("Direction", request.direction);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteControlPolicyResponse());
    }

    public DeleteControlPolicyResponse deleteControlPolicy(DeleteControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteControlPolicyWithOptions(request, runtime);
    }

    public DeleteInstanceMembersResponse deleteInstanceMembersWithOptions(DeleteInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MemberUids", request.memberUids);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceMembersResponse());
    }

    public DeleteInstanceMembersResponse deleteInstanceMembers(DeleteInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceMembersWithOptions(request, runtime);
    }

    public DeleteVpcFirewallCenConfigureResponse deleteVpcFirewallCenConfigureWithOptions(DeleteVpcFirewallCenConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallIdList", request.vpcFirewallIdList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallCenConfigureResponse());
    }

    public DeleteVpcFirewallCenConfigureResponse deleteVpcFirewallCenConfigure(DeleteVpcFirewallCenConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    public DeleteVpcFirewallConfigureResponse deleteVpcFirewallConfigureWithOptions(DeleteVpcFirewallConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallIdList", request.vpcFirewallIdList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallConfigureResponse());
    }

    public DeleteVpcFirewallConfigureResponse deleteVpcFirewallConfigure(DeleteVpcFirewallConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcFirewallConfigureWithOptions(request, runtime);
    }

    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicyWithOptions(DeleteVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclUuid", request.aclUuid);
        query.put("Lang", request.lang);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpcFirewallControlPolicyResponse());
    }

    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DescribeAddressBookResponse describeAddressBookWithOptions(DescribeAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ContainPort", request.containPort);
        query.put("CurrentPage", request.currentPage);
        query.put("GroupType", request.groupType);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("Query", request.query);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddressBookResponse());
    }

    public DescribeAddressBookResponse describeAddressBook(DescribeAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAddressBookWithOptions(request, runtime);
    }

    public DescribeAssetListResponse describeAssetListWithOptions(DescribeAssetListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("IpVersion", request.ipVersion);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("PageSize", request.pageSize);
        query.put("RegionNo", request.regionNo);
        query.put("ResourceType", request.resourceType);
        query.put("SearchItem", request.searchItem);
        query.put("SgStatus", request.sgStatus);
        query.put("SourceIp", request.sourceIp);
        query.put("Status", request.status);
        query.put("Type", request.type);
        query.put("UserType", request.userType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetListResponse());
    }

    public DescribeAssetListResponse describeAssetList(DescribeAssetListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetListWithOptions(request, runtime);
    }

    public DescribeControlPolicyResponse describeControlPolicyWithOptions(DescribeControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("AclUuid", request.aclUuid);
        query.put("CurrentPage", request.currentPage);
        query.put("Description", request.description);
        query.put("Destination", request.destination);
        query.put("Direction", request.direction);
        query.put("IpVersion", request.ipVersion);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("Proto", request.proto);
        query.put("Release", request.release);
        query.put("Source", request.source);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeControlPolicyResponse());
    }

    public DescribeControlPolicyResponse describeControlPolicy(DescribeControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeControlPolicyWithOptions(request, runtime);
    }

    public DescribeDomainResolveResponse describeDomainResolveWithOptions(DescribeDomainResolveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Domain", request.domain);
        query.put("IpVersion", request.ipVersion);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDomainResolve"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDomainResolveResponse());
    }

    public DescribeDomainResolveResponse describeDomainResolve(DescribeDomainResolveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainResolveWithOptions(request, runtime);
    }

    public DescribeInstanceMembersResponse describeInstanceMembersWithOptions(DescribeInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("MemberDesc", request.memberDesc);
        query.put("MemberDisplayName", request.memberDisplayName);
        query.put("MemberUid", request.memberUid);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMembers"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMembersResponse());
    }

    public DescribeInstanceMembersResponse describeInstanceMembers(DescribeInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMembersWithOptions(request, runtime);
    }

    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfigWithOptions(DescribePolicyAdvancedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyAdvancedConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyAdvancedConfigResponse());
    }

    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyAdvancedConfigWithOptions(request, runtime);
    }

    public DescribePolicyPriorUsedResponse describePolicyPriorUsedWithOptions(DescribePolicyPriorUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Direction", request.direction);
        query.put("IpVersion", request.ipVersion);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolicyPriorUsed"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolicyPriorUsedResponse());
    }

    public DescribePolicyPriorUsedResponse describePolicyPriorUsed(DescribePolicyPriorUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyPriorUsedWithOptions(request, runtime);
    }

    public DescribeRiskEventGroupResponse describeRiskEventGroupWithOptions(DescribeRiskEventGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AttackApp", request.attackApp);
        query.put("AttackType", request.attackType);
        query.put("CurrentPage", request.currentPage);
        query.put("DataType", request.dataType);
        query.put("Direction", request.direction);
        query.put("DstIP", request.dstIP);
        query.put("DstNetworkInstanceId", request.dstNetworkInstanceId);
        query.put("EndTime", request.endTime);
        query.put("FirewallType", request.firewallType);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("NoLocation", request.noLocation);
        query.put("PageSize", request.pageSize);
        query.put("RuleResult", request.ruleResult);
        query.put("RuleSource", request.ruleSource);
        query.put("SrcIP", request.srcIP);
        query.put("SrcNetworkInstanceId", request.srcNetworkInstanceId);
        query.put("StartTime", request.startTime);
        query.put("VulLevel", request.vulLevel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskEventGroup"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskEventGroupResponse());
    }

    public DescribeRiskEventGroupResponse describeRiskEventGroup(DescribeRiskEventGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskEventGroupWithOptions(request, runtime);
    }

    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupListWithOptions(DescribeVpcFirewallAclGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("FirewallConfigureStatus", request.firewallConfigureStatus);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallAclGroupList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallAclGroupListResponse());
    }

    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallAclGroupListWithOptions(request, runtime);
    }

    public DescribeVpcFirewallCenDetailResponse describeVpcFirewallCenDetailWithOptions(DescribeVpcFirewallCenDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("NetworkInstanceId", request.networkInstanceId);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallCenDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallCenDetailResponse());
    }

    public DescribeVpcFirewallCenDetailResponse describeVpcFirewallCenDetail(DescribeVpcFirewallCenDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallCenDetailWithOptions(request, runtime);
    }

    public DescribeVpcFirewallCenListResponse describeVpcFirewallCenListWithOptions(DescribeVpcFirewallCenListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CenId", request.cenId);
        query.put("CurrentPage", request.currentPage);
        query.put("FirewallSwitchStatus", request.firewallSwitchStatus);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("NetworkInstanceId", request.networkInstanceId);
        query.put("OwnerId", request.ownerId);
        query.put("PageSize", request.pageSize);
        query.put("RegionNo", request.regionNo);
        query.put("RouteMode", request.routeMode);
        query.put("VpcFirewallId", request.vpcFirewallId);
        query.put("VpcFirewallName", request.vpcFirewallName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallCenList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallCenListResponse());
    }

    public DescribeVpcFirewallCenListResponse describeVpcFirewallCenList(DescribeVpcFirewallCenListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallCenListWithOptions(request, runtime);
    }

    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicyWithOptions(DescribeVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("AclUuid", request.aclUuid);
        query.put("CurrentPage", request.currentPage);
        query.put("Description", request.description);
        query.put("Destination", request.destination);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("PageSize", request.pageSize);
        query.put("Proto", request.proto);
        query.put("Source", request.source);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallControlPolicyResponse());
    }

    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DescribeVpcFirewallDefaultIPSConfigResponse describeVpcFirewallDefaultIPSConfigWithOptions(DescribeVpcFirewallDefaultIPSConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDefaultIPSConfigResponse());
    }

    public DescribeVpcFirewallDefaultIPSConfigResponse describeVpcFirewallDefaultIPSConfig(DescribeVpcFirewallDefaultIPSConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallDefaultIPSConfigWithOptions(request, runtime);
    }

    public DescribeVpcFirewallDetailResponse describeVpcFirewallDetailWithOptions(DescribeVpcFirewallDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("LocalVpcId", request.localVpcId);
        query.put("PeerVpcId", request.peerVpcId);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallDetail"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallDetailResponse());
    }

    public DescribeVpcFirewallDetailResponse describeVpcFirewallDetail(DescribeVpcFirewallDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallDetailWithOptions(request, runtime);
    }

    public DescribeVpcFirewallListResponse describeVpcFirewallListWithOptions(DescribeVpcFirewallListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("FirewallSwitchStatus", request.firewallSwitchStatus);
        query.put("Lang", request.lang);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("PageSize", request.pageSize);
        query.put("RegionNo", request.regionNo);
        query.put("VpcFirewallId", request.vpcFirewallId);
        query.put("VpcFirewallName", request.vpcFirewallName);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallList"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallListResponse());
    }

    public DescribeVpcFirewallListResponse describeVpcFirewallList(DescribeVpcFirewallListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallListWithOptions(request, runtime);
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsedWithOptions(DescribeVpcFirewallPolicyPriorUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVpcFirewallPolicyPriorUsed"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVpcFirewallPolicyPriorUsedResponse());
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallPolicyPriorUsedWithOptions(request, runtime);
    }

    public ModifyAddressBookResponse modifyAddressBookWithOptions(ModifyAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressList", request.addressList);
        query.put("AutoAddTagEcs", request.autoAddTagEcs);
        query.put("Description", request.description);
        query.put("GroupName", request.groupName);
        query.put("GroupUuid", request.groupUuid);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        query.put("TagList", request.tagList);
        query.put("TagRelation", request.tagRelation);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAddressBook"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAddressBookResponse());
    }

    public ModifyAddressBookResponse modifyAddressBook(ModifyAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAddressBookWithOptions(request, runtime);
    }

    public ModifyControlPolicyResponse modifyControlPolicyWithOptions(ModifyControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("AclUuid", request.aclUuid);
        query.put("ApplicationName", request.applicationName);
        query.put("Description", request.description);
        query.put("DestPort", request.destPort);
        query.put("DestPortGroup", request.destPortGroup);
        query.put("DestPortType", request.destPortType);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("Direction", request.direction);
        query.put("Lang", request.lang);
        query.put("Proto", request.proto);
        query.put("Release", request.release);
        query.put("Source", request.source);
        query.put("SourceIp", request.sourceIp);
        query.put("SourceType", request.sourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlPolicyResponse());
    }

    public ModifyControlPolicyResponse modifyControlPolicy(ModifyControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyControlPolicyWithOptions(request, runtime);
    }

    public ModifyControlPolicyPositionResponse modifyControlPolicyPositionWithOptions(ModifyControlPolicyPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Direction", request.direction);
        query.put("Lang", request.lang);
        query.put("NewOrder", request.newOrder);
        query.put("OldOrder", request.oldOrder);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyControlPolicyPosition"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyControlPolicyPositionResponse());
    }

    public ModifyControlPolicyPositionResponse modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyControlPolicyPositionWithOptions(request, runtime);
    }

    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributesWithOptions(ModifyInstanceMemberAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Members", request.members);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceMemberAttributes"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceMemberAttributesResponse());
    }

    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMemberAttributesWithOptions(request, runtime);
    }

    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfigWithOptions(ModifyPolicyAdvancedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InternetSwitch", request.internetSwitch);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPolicyAdvancedConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPolicyAdvancedConfigResponse());
    }

    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPolicyAdvancedConfigWithOptions(request, runtime);
    }

    public ModifyVpcFirewallCenConfigureResponse modifyVpcFirewallCenConfigureWithOptions(ModifyVpcFirewallCenConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallId", request.vpcFirewallId);
        query.put("VpcFirewallName", request.vpcFirewallName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallCenConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallCenConfigureResponse());
    }

    public ModifyVpcFirewallCenConfigureResponse modifyVpcFirewallCenConfigure(ModifyVpcFirewallCenConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallCenConfigureWithOptions(request, runtime);
    }

    public ModifyVpcFirewallCenSwitchStatusResponse modifyVpcFirewallCenSwitchStatusWithOptions(ModifyVpcFirewallCenSwitchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FirewallSwitch", request.firewallSwitch);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallCenSwitchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallCenSwitchStatusResponse());
    }

    public ModifyVpcFirewallCenSwitchStatusResponse modifyVpcFirewallCenSwitchStatus(ModifyVpcFirewallCenSwitchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallCenSwitchStatusWithOptions(request, runtime);
    }

    public ModifyVpcFirewallConfigureResponse modifyVpcFirewallConfigureWithOptions(ModifyVpcFirewallConfigureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("LocalVpcCidrTableList", request.localVpcCidrTableList);
        query.put("MemberUid", request.memberUid);
        query.put("PeerVpcCidrTableList", request.peerVpcCidrTableList);
        query.put("VpcFirewallId", request.vpcFirewallId);
        query.put("VpcFirewallName", request.vpcFirewallName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallConfigure"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallConfigureResponse());
    }

    public ModifyVpcFirewallConfigureResponse modifyVpcFirewallConfigure(ModifyVpcFirewallConfigureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallConfigureWithOptions(request, runtime);
    }

    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicyWithOptions(ModifyVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclAction", request.aclAction);
        query.put("AclUuid", request.aclUuid);
        query.put("ApplicationName", request.applicationName);
        query.put("Description", request.description);
        query.put("DestPort", request.destPort);
        query.put("DestPortGroup", request.destPortGroup);
        query.put("DestPortType", request.destPortType);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("Lang", request.lang);
        query.put("Proto", request.proto);
        query.put("Source", request.source);
        query.put("SourceType", request.sourceType);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallControlPolicy"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallControlPolicyResponse());
    }

    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPositionWithOptions(ModifyVpcFirewallControlPolicyPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("NewOrder", request.newOrder);
        query.put("OldOrder", request.oldOrder);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallControlPolicyPosition"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallControlPolicyPositionResponse());
    }

    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyPositionWithOptions(request, runtime);
    }

    public ModifyVpcFirewallDefaultIPSConfigResponse modifyVpcFirewallDefaultIPSConfigWithOptions(ModifyVpcFirewallDefaultIPSConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BasicRules", request.basicRules);
        query.put("EnableAllPatch", request.enableAllPatch);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("RunMode", request.runMode);
        query.put("SourceIp", request.sourceIp);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallDefaultIPSConfig"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallDefaultIPSConfigResponse());
    }

    public ModifyVpcFirewallDefaultIPSConfigResponse modifyVpcFirewallDefaultIPSConfig(ModifyVpcFirewallDefaultIPSConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallDefaultIPSConfigWithOptions(request, runtime);
    }

    public ModifyVpcFirewallSwitchStatusResponse modifyVpcFirewallSwitchStatusWithOptions(ModifyVpcFirewallSwitchStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FirewallSwitch", request.firewallSwitch);
        query.put("Lang", request.lang);
        query.put("MemberUid", request.memberUid);
        query.put("VpcFirewallId", request.vpcFirewallId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVpcFirewallSwitchStatus"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVpcFirewallSwitchStatusResponse());
    }

    public ModifyVpcFirewallSwitchStatusResponse modifyVpcFirewallSwitchStatus(ModifyVpcFirewallSwitchStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallSwitchStatusWithOptions(request, runtime);
    }

    public PutDisableAllFwSwitchResponse putDisableAllFwSwitchWithOptions(PutDisableAllFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDisableAllFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDisableAllFwSwitchResponse());
    }

    public PutDisableAllFwSwitchResponse putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDisableAllFwSwitchWithOptions(request, runtime);
    }

    public PutDisableFwSwitchResponse putDisableFwSwitchWithOptions(PutDisableFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpaddrList", request.ipaddrList);
        query.put("Lang", request.lang);
        query.put("RegionList", request.regionList);
        query.put("ResourceTypeList", request.resourceTypeList);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutDisableFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutDisableFwSwitchResponse());
    }

    public PutDisableFwSwitchResponse putDisableFwSwitch(PutDisableFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDisableFwSwitchWithOptions(request, runtime);
    }

    public PutEnableAllFwSwitchResponse putEnableAllFwSwitchWithOptions(PutEnableAllFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnableAllFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnableAllFwSwitchResponse());
    }

    public PutEnableAllFwSwitchResponse putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEnableAllFwSwitchWithOptions(request, runtime);
    }

    public PutEnableFwSwitchResponse putEnableFwSwitchWithOptions(PutEnableFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IpaddrList", request.ipaddrList);
        query.put("Lang", request.lang);
        query.put("RegionList", request.regionList);
        query.put("ResourceTypeList", request.resourceTypeList);
        query.put("SourceIp", request.sourceIp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnableFwSwitch"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnableFwSwitchResponse());
    }

    public PutEnableFwSwitchResponse putEnableFwSwitch(PutEnableFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEnableFwSwitchWithOptions(request, runtime);
    }

    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCountWithOptions(ResetVpcFirewallRuleHitCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AclUuid", request.aclUuid);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetVpcFirewallRuleHitCount"),
            new TeaPair("version", "2017-12-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetVpcFirewallRuleHitCountResponse());
    }

    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetVpcFirewallRuleHitCountWithOptions(request, runtime);
    }
}
