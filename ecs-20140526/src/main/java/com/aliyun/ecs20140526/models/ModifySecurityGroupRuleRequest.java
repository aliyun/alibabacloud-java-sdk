// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupRuleRequest extends TeaModel {
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
     * <p>This is a new security group rule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination IPv4 CIDR block. CIDR format and IPv4 format IP address ranges are supported.</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    public String destCidrIp;

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
     * <li>Protocol numbers that comply with the IANA standard, which are integers from 0 to 255. Supported regions:</li>
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
     * <p>ALL</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The destination IPv6 CIDR block. CIDR format and IPv6 format IP address ranges are supported.</p>
     * <blockquote>
     * <p>Only VPC-type IP addresses are supported. This parameter and the DestCidrIp parameter cannot be specified at the same time.</p>
     * </blockquote>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    /**
     * <p>The source IPv6 CIDR block. CIDR format and IPv6 format IP address ranges are supported.</p>
     * <blockquote>
     * <p>Only VPC-type IP addresses are supported. This parameter and the SourceCidrIp parameter cannot be specified at the same time.</p>
     * </blockquote>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1233:1a00::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    /**
     * <p>The NIC type.</p>
     * <blockquote>
     * <p>You cannot modify this parameter when you modify a rule by specifying the security group rule ID. To modify this parameter, add a new rule and then delete the current rule.</p>
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
     * <p>The access permission. Valid values: </p>
     * <ul>
     * <li>accept: allows access.</li>
     * <li>drop: denies access and does not return a rejection message.</li>
     * </ul>
     * <p>Default value: accept.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The range of destination ports that are open for the transport layer protocol in the destination security group. Valid values: </p>
     * <ul>
     * <li>For TCP and UDP: 1 to 65535. Use a forward slash (/) to separate the start port and the end port. Example: 1/200.</li>
     * <li>For ICMP: -1/-1.</li>
     * <li>For GRE: -1/-1.</li>
     * <li>For ALL: -1/-1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The ID of the port list.</p>
     * <p>You can call the DescribePortRangeLists operation to query the IDs of available port lists.</p>
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
     * <p>The region ID of the target security group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The ID of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/2679845.html">DescribeSecurityGroupAttribute</a> operation to query the security group rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sgr-bp67acfmxa123b***</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public String securityGroupRuleId;

    /**
     * <p>The source IPv4 CIDR block. CIDR format and IPv4 format IP address ranges are supported.</p>
     * <p>Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    /**
     * <p>The ID of the source security group. You must specify at least one of the SourceGroupId and SourceCidrIp parameters.</p>
     * <ul>
     * <li>If you specify SourceGroupId but do not specify SourceCidrIp, the NicType parameter can only be set to intranet.</li>
     * <li>If you specify both SourceGroupId and SourceCidrIp, SourceCidrIp takes precedence by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxa123b****</p>
     */
    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    /**
     * <p>The Alibaba Cloud account to which the source security group belongs when you configure a security group rule across accounts. </p>
     * <ul>
     * <li>If neither SourceGroupOwnerAccount nor SourceGroupOwnerId is specified, the rule is considered to configure the access permissions for another security group of your own.</li>
     * <li>If the SourceCidrIp parameter is specified, the SourceGroupOwnerAccount parameter is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:EcsforCloud@Alibaba.com">EcsforCloud@Alibaba.com</a></p>
     */
    @NameInMap("SourceGroupOwnerAccount")
    public String sourceGroupOwnerAccount;

    /**
     * <p>The Alibaba Cloud account to which the source security group belongs when you configure a security group rule across accounts. </p>
     * <ul>
     * <li>If neither SourceGroupOwnerId nor SourceGroupOwnerAccount is specified, the rule is considered to configure the access permissions for another security group of your own.</li>
     * <li>If the SourceCidrIp parameter is specified, the SourceGroupOwnerId parameter is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>12345678910</p>
     */
    @NameInMap("SourceGroupOwnerId")
    public Long sourceGroupOwnerId;

    /**
     * <p>The range of source ports that are open for the transport layer protocol in the source security group. Valid values: </p>
     * <ul>
     * <li>For TCP and UDP: 1 to 65535. Use a forward slash (/) to separate the start port and the end port. Example: 1/200.</li>
     * <li>For ICMP: -1/-1.</li>
     * <li>For GRE: -1/-1.</li>
     * <li>For ALL: -1/-1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The ID of the source prefix list. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
     * <p>If you specify one of the SourceCidrIp, Ipv6SourceCidrIp, or SourceGroupId parameters, this parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("SourcePrefixListId")
    public String sourcePrefixListId;

    public static ModifySecurityGroupRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupRuleRequest self = new ModifySecurityGroupRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifySecurityGroupRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySecurityGroupRuleRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public ModifySecurityGroupRuleRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifySecurityGroupRuleRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public ModifySecurityGroupRuleRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public ModifySecurityGroupRuleRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public ModifySecurityGroupRuleRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySecurityGroupRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySecurityGroupRuleRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifySecurityGroupRuleRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ModifySecurityGroupRuleRequest setPortRangeListId(String portRangeListId) {
        this.portRangeListId = portRangeListId;
        return this;
    }
    public String getPortRangeListId() {
        return this.portRangeListId;
    }

    public ModifySecurityGroupRuleRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ModifySecurityGroupRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySecurityGroupRuleRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySecurityGroupRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityGroupRuleRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityGroupRuleRequest setSecurityGroupRuleId(String securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public ModifySecurityGroupRuleRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public ModifySecurityGroupRuleRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    public ModifySecurityGroupRuleRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public ModifySecurityGroupRuleRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

}
