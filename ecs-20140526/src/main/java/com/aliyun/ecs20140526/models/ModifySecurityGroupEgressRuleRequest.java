// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The description of the security group rule. The description must be 1 to 512 characters in length.
    @NameInMap("Description")
    public String description;

    // The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.
    // 
    // This parameter is empty by default.
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    // The ID of the destination security group. You must specify at least one of the `DestGroupId` and `DestCidrIp` parameters.
    // 
    // *   If `DestGroupId` is specified but `DestCidrIp` is not specified, the `NicType` parameter must be set to intranet.
    // *   If both `DestGroupId` and `DestCidrIp` are specified, `DestCidrIp` takes precedence.
    @NameInMap("DestGroupId")
    public String destGroupId;

    // The logon name of the Alibaba Cloud account that manages the destination security group.
    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    // The ID of the Alibaba Cloud account (UID) that manages the destination security group.
    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    // The ID of the destination prefix list. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
    // 
    // If you specify `DestCidrIp`, `Ipv6DestCidrIp`, or `DestGroupId`, this parameter is ignored.
    @NameInMap("DestPrefixListId")
    public String destPrefixListId;

    // The transport layer protocol. The values of this parameter are case-insensitive. Valid values:
    // 
    // *   icmp
    // *   gre
    // *   tcp
    // *   udp
    // *   all: All protocols are supported.
    @NameInMap("IpProtocol")
    public String ipProtocol;

    // The destination IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.
    // 
    // >  Only the IP addresses of instances in virtual private clouds (VPCs) are supported. You cannot specify both the Ipv6DestCidrIp parameter and the `DestCidrIp` parameter.
    // 
    // This parameter is empty by default.
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    // The source IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.
    // 
    // >  Only the IP addresses of instances in VPCs are supported. You cannot specify both the Ipv6SourceCidrIp parameter and the `SourceCidrIp` parameter.
    // 
    // This parameter is empty by default.
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    // The network interface controller (NIC) type of the security group rule when the security group is in the classic network. Valid values:
    // 
    // *   internet: public NIC
    // *   intranet: private NIC
    // 
    // Default value: internet.
    // 
    // The NicType parameter must be set to intranet in the following cases:
    // 
    // *   If the security group is in a VPC, this parameter is required and must be set to intranet.
    // *   If you specify only `DestGroupId` when you configure access between security groups, this parameter must be set to intranet.
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The authorization policy. Valid values:
    // 
    // *   accept: allows access.
    // *   drop: denies access and returns no responses.
    // 
    // Default value: accept.
    @NameInMap("Policy")
    public String policy;

    // The range of destination ports that correspond to the transport layer protocol. Valid values:
    // 
    // *   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
    // *   When the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.
    // *   When the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.
    // *   When the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.
    @NameInMap("PortRange")
    public String portRange;

    // The priority of the security group rule. Valid values: 1 to 100.
    // 
    // Default: 1.
    @NameInMap("Priority")
    public String priority;

    // The region ID of the source security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the source security group.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.
    // 
    // This parameter is empty by default.
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    // The range of source ports that correspond to the transport layer protocol. Valid values:
    // 
    // *   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
    // *   When the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.
    // *   When the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.
    // *   When the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static ModifySecurityGroupEgressRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupEgressRuleRequest self = new ModifySecurityGroupEgressRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupEgressRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityGroupEgressRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySecurityGroupEgressRuleRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    public ModifySecurityGroupEgressRuleRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    public ModifySecurityGroupEgressRuleRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    public ModifySecurityGroupEgressRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifySecurityGroupEgressRuleRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public ModifySecurityGroupEgressRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityGroupEgressRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityGroupEgressRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifySecurityGroupEgressRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifySecurityGroupEgressRuleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifySecurityGroupEgressRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupEgressRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityGroupEgressRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityGroupEgressRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityGroupEgressRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifySecurityGroupEgressRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

}
