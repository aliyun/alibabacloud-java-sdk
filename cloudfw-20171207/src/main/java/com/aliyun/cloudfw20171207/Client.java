// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207;

import com.aliyun.tea.*;
import com.aliyun.cloudfw20171207.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAddressBook", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new AddAddressBookResponse());
    }

    public AddAddressBookResponse addAddressBook(AddAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAddressBookWithOptions(request, runtime);
    }

    public AddControlPolicyResponse addControlPolicyWithOptions(AddControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new AddControlPolicyResponse());
    }

    public AddControlPolicyResponse addControlPolicy(AddControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addControlPolicyWithOptions(request, runtime);
    }

    public AddInstanceMembersResponse addInstanceMembersWithOptions(AddInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddInstanceMembers", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new AddInstanceMembersResponse());
    }

    public AddInstanceMembersResponse addInstanceMembers(AddInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addInstanceMembersWithOptions(request, runtime);
    }

    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicyWithOptions(CreateVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVpcFirewallControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVpcFirewallControlPolicyResponse());
    }

    public CreateVpcFirewallControlPolicyResponse createVpcFirewallControlPolicy(CreateVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DeleteAddressBookResponse deleteAddressBookWithOptions(DeleteAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAddressBook", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAddressBookResponse());
    }

    public DeleteAddressBookResponse deleteAddressBook(DeleteAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAddressBookWithOptions(request, runtime);
    }

    public DeleteControlPolicyResponse deleteControlPolicyWithOptions(DeleteControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteControlPolicyResponse());
    }

    public DeleteControlPolicyResponse deleteControlPolicy(DeleteControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteControlPolicyWithOptions(request, runtime);
    }

    public DeleteInstanceMembersResponse deleteInstanceMembersWithOptions(DeleteInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstanceMembers", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceMembersResponse());
    }

    public DeleteInstanceMembersResponse deleteInstanceMembers(DeleteInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceMembersWithOptions(request, runtime);
    }

    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicyWithOptions(DeleteVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpcFirewallControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpcFirewallControlPolicyResponse());
    }

    public DeleteVpcFirewallControlPolicyResponse deleteVpcFirewallControlPolicy(DeleteVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DescribeAddressBookResponse describeAddressBookWithOptions(DescribeAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAddressBook", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAddressBookResponse());
    }

    public DescribeAddressBookResponse describeAddressBook(DescribeAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAddressBookWithOptions(request, runtime);
    }

    public DescribeAssetListResponse describeAssetListWithOptions(DescribeAssetListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssetList", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAssetListResponse());
    }

    public DescribeAssetListResponse describeAssetList(DescribeAssetListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetListWithOptions(request, runtime);
    }

    public DescribeControlPolicyResponse describeControlPolicyWithOptions(DescribeControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeControlPolicyResponse());
    }

    public DescribeControlPolicyResponse describeControlPolicy(DescribeControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeControlPolicyWithOptions(request, runtime);
    }

    public DescribeDomainResolveResponse describeDomainResolveWithOptions(DescribeDomainResolveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainResolve", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainResolveResponse());
    }

    public DescribeDomainResolveResponse describeDomainResolve(DescribeDomainResolveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainResolveWithOptions(request, runtime);
    }

    public DescribeInstanceMembersResponse describeInstanceMembersWithOptions(DescribeInstanceMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceMembers", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceMembersResponse());
    }

    public DescribeInstanceMembersResponse describeInstanceMembers(DescribeInstanceMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceMembersWithOptions(request, runtime);
    }

    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfigWithOptions(DescribePolicyAdvancedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolicyAdvancedConfig", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolicyAdvancedConfigResponse());
    }

    public DescribePolicyAdvancedConfigResponse describePolicyAdvancedConfig(DescribePolicyAdvancedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyAdvancedConfigWithOptions(request, runtime);
    }

    public DescribePolicyPriorUsedResponse describePolicyPriorUsedWithOptions(DescribePolicyPriorUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePolicyPriorUsed", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePolicyPriorUsedResponse());
    }

    public DescribePolicyPriorUsedResponse describePolicyPriorUsed(DescribePolicyPriorUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePolicyPriorUsedWithOptions(request, runtime);
    }

    public DescribeRiskEventGroupResponse describeRiskEventGroupWithOptions(DescribeRiskEventGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskEventGroup", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskEventGroupResponse());
    }

    public DescribeRiskEventGroupResponse describeRiskEventGroup(DescribeRiskEventGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskEventGroupWithOptions(request, runtime);
    }

    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupListWithOptions(DescribeVpcFirewallAclGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcFirewallAclGroupList", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcFirewallAclGroupListResponse());
    }

    public DescribeVpcFirewallAclGroupListResponse describeVpcFirewallAclGroupList(DescribeVpcFirewallAclGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallAclGroupListWithOptions(request, runtime);
    }

    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicyWithOptions(DescribeVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcFirewallControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcFirewallControlPolicyResponse());
    }

    public DescribeVpcFirewallControlPolicyResponse describeVpcFirewallControlPolicy(DescribeVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsedWithOptions(DescribeVpcFirewallPolicyPriorUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcFirewallPolicyPriorUsed", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcFirewallPolicyPriorUsedResponse());
    }

    public DescribeVpcFirewallPolicyPriorUsedResponse describeVpcFirewallPolicyPriorUsed(DescribeVpcFirewallPolicyPriorUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcFirewallPolicyPriorUsedWithOptions(request, runtime);
    }

    public ModifyAddressBookResponse modifyAddressBookWithOptions(ModifyAddressBookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAddressBook", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAddressBookResponse());
    }

    public ModifyAddressBookResponse modifyAddressBook(ModifyAddressBookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAddressBookWithOptions(request, runtime);
    }

    public ModifyControlPolicyResponse modifyControlPolicyWithOptions(ModifyControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyControlPolicyResponse());
    }

    public ModifyControlPolicyResponse modifyControlPolicy(ModifyControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyControlPolicyWithOptions(request, runtime);
    }

    public ModifyControlPolicyPositionResponse modifyControlPolicyPositionWithOptions(ModifyControlPolicyPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyControlPolicyPosition", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyControlPolicyPositionResponse());
    }

    public ModifyControlPolicyPositionResponse modifyControlPolicyPosition(ModifyControlPolicyPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyControlPolicyPositionWithOptions(request, runtime);
    }

    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributesWithOptions(ModifyInstanceMemberAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceMemberAttributes", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceMemberAttributesResponse());
    }

    public ModifyInstanceMemberAttributesResponse modifyInstanceMemberAttributes(ModifyInstanceMemberAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceMemberAttributesWithOptions(request, runtime);
    }

    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfigWithOptions(ModifyPolicyAdvancedConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPolicyAdvancedConfig", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPolicyAdvancedConfigResponse());
    }

    public ModifyPolicyAdvancedConfigResponse modifyPolicyAdvancedConfig(ModifyPolicyAdvancedConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPolicyAdvancedConfigWithOptions(request, runtime);
    }

    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicyWithOptions(ModifyVpcFirewallControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpcFirewallControlPolicy", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpcFirewallControlPolicyResponse());
    }

    public ModifyVpcFirewallControlPolicyResponse modifyVpcFirewallControlPolicy(ModifyVpcFirewallControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyWithOptions(request, runtime);
    }

    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPositionWithOptions(ModifyVpcFirewallControlPolicyPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpcFirewallControlPolicyPosition", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpcFirewallControlPolicyPositionResponse());
    }

    public ModifyVpcFirewallControlPolicyPositionResponse modifyVpcFirewallControlPolicyPosition(ModifyVpcFirewallControlPolicyPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcFirewallControlPolicyPositionWithOptions(request, runtime);
    }

    public PutDisableAllFwSwitchResponse putDisableAllFwSwitchWithOptions(PutDisableAllFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutDisableAllFwSwitch", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new PutDisableAllFwSwitchResponse());
    }

    public PutDisableAllFwSwitchResponse putDisableAllFwSwitch(PutDisableAllFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDisableAllFwSwitchWithOptions(request, runtime);
    }

    public PutDisableFwSwitchResponse putDisableFwSwitchWithOptions(PutDisableFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutDisableFwSwitch", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new PutDisableFwSwitchResponse());
    }

    public PutDisableFwSwitchResponse putDisableFwSwitch(PutDisableFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putDisableFwSwitchWithOptions(request, runtime);
    }

    public PutEnableAllFwSwitchResponse putEnableAllFwSwitchWithOptions(PutEnableAllFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutEnableAllFwSwitch", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new PutEnableAllFwSwitchResponse());
    }

    public PutEnableAllFwSwitchResponse putEnableAllFwSwitch(PutEnableAllFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEnableAllFwSwitchWithOptions(request, runtime);
    }

    public PutEnableFwSwitchResponse putEnableFwSwitchWithOptions(PutEnableFwSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutEnableFwSwitch", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new PutEnableFwSwitchResponse());
    }

    public PutEnableFwSwitchResponse putEnableFwSwitch(PutEnableFwSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEnableFwSwitchWithOptions(request, runtime);
    }

    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCountWithOptions(ResetVpcFirewallRuleHitCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetVpcFirewallRuleHitCount", "2017-12-07", "HTTPS", "POST", "AK", "json", req, runtime), new ResetVpcFirewallRuleHitCountResponse());
    }

    public ResetVpcFirewallRuleHitCountResponse resetVpcFirewallRuleHitCount(ResetVpcFirewallRuleHitCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetVpcFirewallRuleHitCountWithOptions(request, runtime);
    }
}
