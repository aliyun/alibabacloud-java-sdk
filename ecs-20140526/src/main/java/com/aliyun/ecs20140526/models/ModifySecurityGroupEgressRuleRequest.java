// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupEgressRuleRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a new securitygroup rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination IPv4 Classless Inter-Domain Routing. IPv4 address ranges in CIDR format and IPv4 format are supported.</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    /**
     * <p>The ID of the destination security group for which you want to configure the access permissions. You must specify at least one of the Settings for <code>DestGroupId</code> or <code>DestCidrIp</code>.</p>
     * <ul>
     * <li>You must specify at least one of the DestGroupId, DestCidrIp, Ipv6DestCidrIp, and DestPrefixListId parameters.</li>
     * <li>If you specify DestGroupId but do not specify DestCidrIp, the NicType parameter can only be set to intranet.</li>
     * <li>If you specify both DestGroupId and DestCidrIp, DestCidrIp takes precedence by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxa123b****</p>
     */
    @NameInMap("DestGroupId")
    public String destGroupId;

    /**
     * <p>The Alibaba Cloud account to which the destination security group belongs when you configure the security group rule across accounts.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:EcsforCloud@Alibaba.com">EcsforCloud@Alibaba.com</a></p>
     */
    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    /**
     * <p>The ID of the Alibaba Cloud account to which the destination security group belongs when you configure the security group rule across accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    /**
     * <p>The ID of the destination prefix list. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
     * <p>If you specify one of the <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, or <code>DestGroupId</code> parameters, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("DestPrefixListId")
    public String destPrefixListId;

    /**
     * <p>The network layer or transport layer protocol. Two types of values are supported:</p>
     * <ol>
     * <li>Case-insensitive protocol names. Valid values:</li>
     * </ol>
     * <ul>
     * <li>ICMP</li>
     * <li>GRE</li>
     * <li>TCP</li>
     * <li>UDP</li>
     * <li>ALL: all protocols.</li>
     * </ul>
     * <ol start="2">
     * <li>Protocol numbers that comply with the IANA standard, which are integers from 0 to 255. Available regions:</li>
     * </ol>
     * <ul>
     * <li>Philippines</li>
     * <li>UK</li>
     * <li>Malaysia</li>
     * <li>Hohhot</li>
     * <li>Qingdao</li>
     * <li>US West</li>
     * <li>Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The destination IPv6 Classless Inter-Domain Routing. IPv6 address ranges in CIDR format and IPv6 format are supported.</p>
     * <blockquote>
     * <p>Only VPC-type IP addresses are supported. This parameter and the <code>DestCidrIp</code> parameter cannot be specified in Settings at the same time.</p>
     * </blockquote>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1233:1a00::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    /**
     * <p>The source IPv6 Classless Inter-Domain Routing. IPv6 address ranges in CIDR format and IPv6 format are supported.</p>
     * <blockquote>
     * <p>Only VPC-type IP addresses are supported. This parameter and the <code>SourceCidrIp</code> parameter cannot be specified in Settings at the same time.</p>
     * </blockquote>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The network interface controller (NIC) type.</p>
     * <blockquote>
     * <p>This parameter cannot be modified when you modify a rule by specifying the security group rule ID. To modify this parameter, add a new rule and then delete the current rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>intranet</p>
     */
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The access permissions. Valid values:</p>
     * <ul>
     * <li>accept: Allows access.</li>
     * <li>drop: deny access and does not return a rejection message.</li>
     * </ul>
     * <p>Default value: accept.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that are open for the transport layer protocol. Valid values:</p>
     * <ul>
     * <li>For the TCP or UDP protocol: 1 to 65535. Use a forward slash (/) to separate the start port and the end port. Example: 1/200.</li>
     * <li>For the ICMP protocol: -1/-1.</li>
     * <li>For the GRE protocol: -1/-1.</li>
     * <li>For ALL: -1/-1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The ID of the port list.
     * You can call the <code>DescribePortRangeLists</code> operation to query the IDs of available port lists.</p>
     * <p>If you specify the PortRange parameter, this parameter is ignored.</p>
     * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>prl-2ze9743****</p>
     */
    @NameInMap("PortRangeListId")
    public String portRangeListId;

    /**
     * <p>The priority of the security group rule. Valid values: 1 to 100.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The region ID of the source security group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/2679845.html">DescribeSecurityGroupAttribute</a> operation to query the ID of the security group rule.</p>
     * 
     * <strong>example:</strong>
     * <p>sgr-bp67acfmxazb4q****</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    /**
     * <p>The source IPv4 Classless Inter-Domain Routing. IPv4 address ranges in CIDR format and IPv4 format are supported.</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The range of source ports that are open for the transport layer protocol. Valid values:</p>
     * <ul>
     * <li>For the TCP or UDP protocol: 1 to 65535. Use a forward slash (/) to separate the start port and the end port. Example: 1/200.</li>
     * <li>For the ICMP protocol: -1/-1.</li>
     * <li>For the GRE protocol: -1/-1.</li>
     * <li>For ALL: -1/-1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
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

    public ModifySecurityGroupEgressRuleRequest setPortRangeListId(String portRangeListId) {
        this.portRangeListId = portRangeListId;
        return this;
    }
    public String getPortRangeListId() {
        return this.portRangeListId;
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
