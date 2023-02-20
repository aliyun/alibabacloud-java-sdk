// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The ID of the security group to be referenced as the destination in the security group rule. You must specify at least one of the `DestGroupId` and `DestCidrIp` parameters.</p>
     * <br>
     * <p>*   At least one of the DestGroupId, DestCidrIp, Ipv6DestCidrIp, or DestPrefixListId parameters must be specified.</p>
     * <p>*   If DestGroupId is specified but DestCidrIp is not specified, the NicType parameter must be set to intranet.</p>
     * <p>*   If both DestGroupId and DestCidrIp are specified, DestCidrIp takes precedence.</p>
     */
    @NameInMap("DestGroupId")
    public String destGroupId;

    /**
     * <p>The Alibaba Cloud account that manages the destination security group when you set a security group rule across accounts.</p>
     */
    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    /**
     * <p>The ID of the Alibaba Cloud account that manages the destination security group when you set a security group rule across accounts.</p>
     */
    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    /**
     * <p>The ID of the destination prefix list. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.</p>
     * <br>
     * <p>If you specify `DestCidrIp`, `Ipv6DestCidrIp`, or `DestGroupId`, this parameter is ignored.</p>
     */
    @NameInMap("DestPrefixListId")
    public String destPrefixListId;

    /**
     * <p>The transport layer protocol. The values of this parameter are case-insensitive. Valid values:</p>
     * <br>
     * <p>*   ICMP</p>
     * <p>*   GRE</p>
     * <p>*   TCP</p>
     * <p>*   UDP</p>
     * <p>*   ALL</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The destination IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.</p>
     * <br>
     * <p>> Only the IP addresses of the VPC type are supported. You cannot specify both the Ipv6DestCidrIp parameter and the `DestCidrIp` parameter.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    /**
     * <p>The source IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.</p>
     * <br>
     * <p>> Only the IP addresses of the VPC type are supported. You cannot specify both the Ipv6SourceCidrIp parameter and the `SourceCidrIp` parameter.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>You cannot modify this parameter when you modify a security group rule by specifying its ID.\</p>
     * <p>You can add a new rule that meets your requirements and delete the original rule.</p>
     */
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The action of a security group rule that determines whether to allow inbound access. Valid values:</p>
     * <br>
     * <p>*   accept: allows access.</p>
     * <p>*   drop: denies access and returns no responses.</p>
     * <br>
     * <p>Default value: accept.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that correspond to the transport layer protocol for the security group rule. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. The start port number and the end port number are separated by a forward slash (/). Example: 1/200.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The priority of the security group rule. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the security group rule.\</p>
     * <p>This parameter is required when you modify a security group rule based on the ID of the security group rule.</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    /**
     * <p>The source IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of source ports that correspond to the transport layer protocol for the security group rule. Valid values:</p>
     * <br>
     * <p>*   When the IpProtocol parameter is set to tcp or udp, the port number range is 1 to 65535. The start port number and the end port number are separated by a forward slash (/). Example: 1/200.</p>
     * <p>*   When the IpProtocol parameter is set to icmp, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to gre, the port number range is -1/-1, which indicates all ports.</p>
     * <p>*   When the IpProtocol parameter is set to all, the port number range is -1/-1, which indicates all ports.</p>
     */
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

    public ModifySecurityGroupEgressRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
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
