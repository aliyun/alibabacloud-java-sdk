// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Description</code> to specify the rule description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    @Deprecated
    public String description;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.DestCidrIp</code> to specify the destination IPv4 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    @Deprecated
    public String destCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.DestGroupId</code> to specify the ID of the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxa123b****</p>
     */
    @NameInMap("DestGroupId")
    @Deprecated
    public String destGroupId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.DestGroupOwnerAccount</code> to specify the Alibaba Cloud account that manages the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
     */
    @NameInMap("DestGroupOwnerAccount")
    @Deprecated
    public String destGroupOwnerAccount;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.DestGroupOwnerId</code> to specify the ID of the Alibaba Cloud account that manages the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678910</p>
     */
    @NameInMap("DestGroupOwnerId")
    @Deprecated
    public Long destGroupOwnerId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.DestPrefixListId</code> to specify the ID of the destination prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("DestPrefixListId")
    @Deprecated
    public String destPrefixListId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.IpProtocol</code> to specify the transport layer protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    @Deprecated
    public String ipProtocol;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Ipv6DestCidrIp</code> to specify the destination IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1233:1a00::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    public String ipv6SourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.NicType</code> to specify the network interface type.</p>
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
     * <p>Security group rule N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<RevokeSecurityGroupEgressRequestPermissions> permissions;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Policy</code> to specify whether to allow outbound access.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    @Deprecated
    public String policy;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.PortRange</code> to specify the range of destination ports.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
     */
    @NameInMap("PortRange")
    @Deprecated
    public String portRange;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Priority</code> to specify the rule priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public String priority;

    /**
     * <p>The region ID of the security group. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
     * <p>The ID of security group rule N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("SecurityGroupRuleId")
    public java.util.List<String> securityGroupRuleId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourcePortRange</code> to specify the range of source ports.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
     */
    @NameInMap("SourcePortRange")
    @Deprecated
    public String sourcePortRange;

    public static RevokeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeSecurityGroupEgressRequest self = new RevokeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public RevokeSecurityGroupEgressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RevokeSecurityGroupEgressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RevokeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    public RevokeSecurityGroupEgressRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    public RevokeSecurityGroupEgressRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    public RevokeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public RevokeSecurityGroupEgressRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public RevokeSecurityGroupEgressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RevokeSecurityGroupEgressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RevokeSecurityGroupEgressRequest setPermissions(java.util.List<RevokeSecurityGroupEgressRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<RevokeSecurityGroupEgressRequestPermissions> getPermissions() {
        return this.permissions;
    }

    public RevokeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public RevokeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public RevokeSecurityGroupEgressRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public RevokeSecurityGroupEgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeSecurityGroupEgressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RevokeSecurityGroupEgressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RevokeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeSecurityGroupEgressRequest setSecurityGroupRuleId(java.util.List<String> securityGroupRuleId) {
        this.securityGroupRuleId = securityGroupRuleId;
        return this;
    }
    public java.util.List<String> getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    public RevokeSecurityGroupEgressRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public RevokeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class RevokeSecurityGroupEgressRequestPermissions extends TeaModel {
        /**
         * <p>The description of security group rule N. The description must be 1 to 512 characters in length.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the source security group that is referenced in security group rule N.</p>
         * <ul>
         * <li>At least one of <code>DestGroupId</code>, <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, and <code>DestPrefixListId</code> must be specified.</li>
         * <li>If <code>DestGroupId</code> is specified but <code>DestCidrIp</code> is not specified, the <code>NicType</code> parameter must be set to intranet.</li>
         * <li>If both <code>DestGroupId</code> and <code>DestCidrIp</code> are specified, <code>DestCidrIp</code> takes precedence.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>For advanced security groups, security groups cannot be used as authorization objects.</li>
         * <li>For each basic security group, a maximum of 20 security groups can be used as authorization objects.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxa123b****</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the destination security group when you delete security group rules N across accounts.</p>
         * <ul>
         * <li>If both <code>DestGroupOwnerAccount</code> and <code>DestGroupOwnerId</code> are not specified, the access control is revoked from another security group managed by your account.</li>
         * <li>If <code>DestCidrIp</code> is specified, <code>DestGroupOwnerAccount</code> is ignored.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the destination security group when you delete security group rule N across accounts.</p>
         * <ul>
         * <li>If both <code>DestGroupOwnerId</code> and <code>DestGroupOwnerAccount</code> are not specified, the access control is revoked from another security group managed by your account.</li>
         * <li>If <code>DestCidrIp</code> is specified, <code>DestGroupOwnerId</code> is invalid.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        @NameInMap("DestGroupOwnerId")
        public String destGroupOwnerId;

        /**
         * <p>The ID of the destination prefix list that is referenced in security group rule N. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>If a security group is in the classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
         * <li>If you specify <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, or <code>DestGroupId</code>, this parameter is ignored.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The transport layer protocol of security group rule N. The value of this parameter is case-insensitive. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ICMP</li>
         * <li>ICMPv6</li>
         * <li>GRE</li>
         * <li>ALL: All protocols are supported.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <blockquote>
         * <p>This parameter is valid only when the destination is Elastic Compute Service (ECS) instances that reside in virtual private clouds (VPCs) and support IPv6 CIDR blocks. You cannot specify both this parameter and the <code>DestCidrIp</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.</p>
         * <p>This parameter is specified to meet quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * <blockquote>
         * <p>This parameter is valid only when the source is ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify both this parameter and the <code>SourceCidrIp</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of security group rule N when the security group is in the classic network. Valid values:</p>
         * <ul>
         * <li>internet: public NIC.</li>
         * <li>intranet: internal NIC.</li>
         * </ul>
         * <p>If the security group is in a VPC, this parameter is set to intranet by default and cannot be modified.</p>
         * <p>If you specify only <code>SourceGroupId</code> when you configure access between security groups, this parameter must be set to intranet.</p>
         * <p>Default value: internet.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The action of security group rule N that determines whether to allow outbound access. Valid values:</p>
         * <ul>
         * <li>accept: allows access.</li>
         * <li>drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port number range is -1/-1.</li>
         * </ul>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of security group rule N. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * <p>Default value: 1.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is specified to meet quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port number range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port number range is -1/-1.</li>
         * </ul>
         * <p>This parameter is specified to meet quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <p>Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static RevokeSecurityGroupEgressRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            RevokeSecurityGroupEgressRequestPermissions self = new RevokeSecurityGroupEgressRequestPermissions();
            return TeaModel.build(map, self);
        }

        public RevokeSecurityGroupEgressRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestGroupOwnerId(String destGroupOwnerId) {
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }
        public String getDestGroupOwnerId() {
            return this.destGroupOwnerId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public RevokeSecurityGroupEgressRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public RevokeSecurityGroupEgressRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public RevokeSecurityGroupEgressRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
