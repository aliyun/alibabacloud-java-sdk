// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupRequest extends TeaModel {
    /**
     * <p>A client token used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Description</code> to specify the rule description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    @Deprecated
    public String description;

    /**
     * <p>Deprecated. Use <code>Permissions.N.DestCidrIp</code> to specify the destination IPv4 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    @Deprecated
    public String destCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.IpProtocol</code> to specify the protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("IpProtocol")
    @Deprecated
    public String ipProtocol;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Ipv6DestCidrIp</code> to specify the destination IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1233:1a00::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 Classless Inter-Domain Routing (CIDR) block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    public String ipv6SourceCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.NicType</code> to specify the network interface type.</p>
     * 
     * <strong>example:</strong>
     * <p>intranet</p>
     */
    @NameInMap("NicType")
    @Deprecated
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The security group rules. Array length: 0 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<RevokeSecurityGroupRequestPermissions> permissions;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Policy</code> to set the access permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    @Deprecated
    public String policy;

    /**
     * <p>Deprecated. Use <code>Permissions.N.PortRange</code> to specify the port range.</p>
     * 
     * <strong>example:</strong>
     * <p>1/200</p>
     */
    @NameInMap("PortRange")
    @Deprecated
    public String portRange;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Priority</code> to specify the rule priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public String priority;

    /**
     * <p>The region ID of the security group. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The security group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of security group rules. Array length: 0 to 100.</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public java.util.List<String> securityGroupRuleId;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 Classless Inter-Domain Routing (CIDR) block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourceGroupId</code> to specify the source security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxa123b****</p>
     */
    @NameInMap("SourceGroupId")
    @Deprecated
    public String sourceGroupId;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourceGroupOwnerAccount</code> to specify the Alibaba Cloud account that owns the source security group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
     */
    @NameInMap("SourceGroupOwnerAccount")
    @Deprecated
    public String sourceGroupOwnerAccount;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourceGroupOwnerId</code> to specify the ID of the Alibaba Cloud account that owns the source security group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678910</p>
     */
    @NameInMap("SourceGroupOwnerId")
    @Deprecated
    public Long sourceGroupOwnerId;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourcePortRange</code> to specify the source port range.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    @Deprecated
    public String sourcePortRange;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourcePrefixListId</code> to specify the source prefix list ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("SourcePrefixListId")
    @Deprecated
    public String sourcePrefixListId;

    public static RevokeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupRequest self = new RevokeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public RevokeSecurityGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RevokeSecurityGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RevokeSecurityGroupRequest setPermissions(java.util.List<RevokeSecurityGroupRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<RevokeSecurityGroupRequestPermissions> getPermissions() {
        return this.permissions;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeSecurityGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RevokeSecurityGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RevokeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeSecurityGroupRequest setSecurityGroupRuleId(java.util.List<String> securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public java.util.List<String> getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    @Deprecated
    public RevokeSecurityGroupRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static class RevokeSecurityGroupRequestPermissions extends TeaModel {
        /**
         * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block. CIDR blocks and IPv4 address range are supported.</p>
         * <p>This parameter is used for quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The protocol type. The value is case-insensitive. Valid values: </p>
         * <ul>
         * <li>TCP.</li>
         * <li>UDP.</li>
         * <li>ICMP.</li>
         * <li>ICMPv6.</li>
         * <li>GRE.</li>
         * <li>ALL: all protocols.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block. CIDR blocks and IPv6 address range are supported.</p>
         * <p>This parameter is used for quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <blockquote>
         * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify both this parameter and <code>DestCidrIp</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 Classless Inter-Domain Routing (CIDR) block from which you want to revoke access permissions. CIDR format and IPv6 address range are supported.</p>
         * <blockquote>
         * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. You cannot specify both this parameter and <code>SourceCidrIp</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of the security group rule. For VPC-type security groups, you do not need to set the network type. The default value is intranet, and only intranet is supported.</p>
         * <blockquote>
         * <p>The classic network feature has been taken offline. For details, see <a href="https://help.aliyun.com/document_detail/2833134.html">Retirement notice</a>. For classic network-type security group rules, valid values are:</p>
         * <ul>
         * <li>internet: public network interface controller (NIC).</li>
         * <li>intranet: internal network interface controller (NIC).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The access permissions. Valid values: </p>
         * <ul>
         * <li>accept: Accepts access.</li>
         * <li>drop: Deny access without returning any denial information. The request appears to timeout or the connection cannot be established.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1/200</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The port list ID.</p>
         * <p>You can call <code>DescribePortRangeLists</code> to query available port list IDs.</p>
         * <p>If you specify <code>Permissions.N.PortRange</code>, this parameter is ignored.</p>
         * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>prl-2ze9743****</p>
         */
        @NameInMap("PortRangeListId")
        public String portRangeListId;

        /**
         * <p>The priority of the security group rule. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 Classless Inter-Domain Routing (CIDR) block from which you want to revoke access permissions. CIDR format and IPv4 address range are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The ID of the source security group from which you want to revoke access permissions.</p>
         * <ul>
         * <li><p>Set at least one of <code>SourceGroupId</code>, <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourcePrefixListId</code>.</p>
         * </li>
         * <li><p>If you specify <code>SourceGroupId</code> but do not specify the <code>SourceCidrIp</code> or <code>Ipv6SourceCidrIp</code> parameter, set NicType to intranet.</p>
         * </li>
         * <li><p>If you specify both <code>SourceGroupId</code> and <code>SourceCidrIp</code>, <code>SourceCidrIp</code> takes precedence by default.</p>
         * </li>
         * </ul>
         * <p>Note:</p>
         * <ul>
         * <li><p>Advanced security groups do not support authorization by security group access.</p>
         * </li>
         * <li><p>A maximum of 20 security groups can be authorized for a basic security group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxa123b****</p>
         */
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        /**
         * <p>The Alibaba Cloud account that owns the source security group when you revoke a cross-account authorization security group rule.</p>
         * <ul>
         * <li>If neither <code>SourceGroupOwnerAccount</code> nor <code>SourceGroupOwnerId</code> is set, the access permissions for another security group within your account are revoked.</li>
         * <li>If the <code>SourceCidrIp</code> parameter is set, the <code>SourceGroupOwnerAccount</code> parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the source security group when you revoke a cross-account authorization security group rule.</p>
         * <ul>
         * <li>If neither <code>SourceGroupOwnerId</code> nor <code>SourceGroupOwnerAccount</code> is set, the access permissions for another security group within your account are revoked.</li>
         * <li>If the <code>SourceCidrIp</code> parameter is set, the <code>SourceGroupOwnerId</code> parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        @NameInMap("SourceGroupOwnerId")
        public Long sourceGroupOwnerId;

        /**
         * <p>The range of source ports that correspond to the transport layer protocol. Valid values: </p>
         * <ul>
         * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
         * </ul>
         * <p>This parameter is used for quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The ID of the source prefix list from which you want to revoke access permissions. You can invoke <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> to query available prefix list IDs.</p>
         * <p>Note:</p>
         * <p>If you specify <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourceGroupId</code>, this parameter is ignored.</p>
         * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        public static RevokeSecurityGroupRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            RevokeSecurityGroupRequestPermissions self = new RevokeSecurityGroupRequestPermissions();
            return TeaModel.build(map, self);
        }

        public RevokeSecurityGroupRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RevokeSecurityGroupRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public RevokeSecurityGroupRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public RevokeSecurityGroupRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public RevokeSecurityGroupRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public RevokeSecurityGroupRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public RevokeSecurityGroupRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public RevokeSecurityGroupRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public RevokeSecurityGroupRequestPermissions setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        public RevokeSecurityGroupRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public RevokeSecurityGroupRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public RevokeSecurityGroupRequestPermissions setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public RevokeSecurityGroupRequestPermissions setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public RevokeSecurityGroupRequestPermissions setSourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }
        public Long getSourceGroupOwnerId() {
            return this.sourceGroupOwnerId;
        }

        public RevokeSecurityGroupRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public RevokeSecurityGroupRequestPermissions setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

    }

}
