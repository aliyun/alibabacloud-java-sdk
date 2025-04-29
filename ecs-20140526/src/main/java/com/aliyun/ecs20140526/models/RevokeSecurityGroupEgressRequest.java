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
     * <p>This parameter is deprecated. Use <code>Permissions.N.IpProtocol</code> to specify the protocol.</p>
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
     * <p>The security group rules. You can specify up to 100 security group rules.</p>
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
     * <p>An array of security group rule IDs. You can specify 1 to 100 security group rules.</p>
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

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    @Deprecated
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

    @Deprecated
    public RevokeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    @Deprecated
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

    @Deprecated
    public RevokeSecurityGroupEgressRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    @Deprecated
    public RevokeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class RevokeSecurityGroupEgressRequestPermissions extends TeaModel {
        /**
         * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block of the security group rule. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the destination security group of the security group rule.</p>
         * <ul>
         * <li>You must specify at least one of the following parameters: <code>DestGroupId</code>, <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, and <code>DestPrefixListId</code>.</li>
         * <li>If you specify <code>DestGroupId</code> but do not specify <code>DestCidrIp</code>, you must set <code>NicType</code> to intranet.</li>
         * <li>If you specify both <code>DestGroupId</code> and <code>DestCidrIp</code>, <code>DestCidrIp</code> takes precedence.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>Advanced security groups do not support security group rules that reference security groups as authorization objects.</li>
         * <li>Each basic security group can contain up to 20 security group rules that reference security groups as authorization objects.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxa123b****</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the destination security group specified in the security group rule.</p>
         * <ul>
         * <li>If you leave <code>DestGroupOwnerAccount</code> and <code>DestGroupOwnerId</code> empty, access control configurations are removed from another security group managed by your Alibaba Cloud account.</li>
         * <li>If you specify <code>DestCidrIp</code>, <code>DestGroupOwnerAccount</code> is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the destination security group specified in the security group rule.</p>
         * <ul>
         * <li>If you leave <code>DestGroupOwnerId</code> and <code>DestGroupOwnerAccount</code> empty, access control configurations are removed from another security group managed by your Alibaba Cloud account.</li>
         * <li>If you specify <code>DestCidrIp</code>, <code>DestGroupOwnerId</code> is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        @NameInMap("DestGroupOwnerId")
        public String destGroupOwnerId;

        /**
         * <p>The ID of the destination prefix list of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>If a security group resides in the classic network, you cannot reference prefix lists in the rules of the security group. For information about the limits on security groups and prefix lists, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section of the &quot;Limits and quotas&quot; topic.</li>
         * <li>If you specify <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, or <code>DestGroupId</code>, this parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The protocol type. The values of this parameter are case-insensitive. Valid values:</p>
         * <ul>
         * <li>TCP.</li>
         * <li>UDP.</li>
         * <li>ICMP.</li>
         * <li>ICMPv6.</li>
         * <li>GRE.</li>
         * <li>ALL: All protocols are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block of the security group rule. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
         * <blockquote>
         * <p> This parameter is valid only for Elastic Compute Service (ECS) instances that reside in virtual private clouds (VPCs) and support IPv6 CIDR blocks. You cannot specify both this parameter and <code>DestCidrIp</code> in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block of the security group rule. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <blockquote>
         * <p> This parameter is valid only for ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify both this parameter and <code>DestCidrIp</code> in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of the security group rule if the security group resides in the classic network. Valid values:</p>
         * <ul>
         * <li>internet: public NIC.</li>
         * <li>intranet: internal NIC.</li>
         * </ul>
         * <p>If the security group resides in a VPC, this parameter is set to intranet by default and cannot be modified.</p>
         * <p>If you specify <code>DestGroupId</code> to delete outbound security group rules that reference the specified security group as an authorization object, you must set this parameter to intranet.</p>
         * <p>Default value: internet.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The action of the security group rule. Valid values:</p>
         * <ul>
         * <li>accept: allows access.</li>
         * <li>drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The destination port range of the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port range is -1/-1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22/22</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The ID of the port list. You can call the <code>DescribePortRangeLists</code> operation to query the IDs of available prefix lists.</p>
         * <ul>
         * <li>If you specify <code>Permissions.N.PortRange</code>, this parameter is ignored.</li>
         * <li>If a security group resides in the classic network, you cannot reference port lists in the rules of the security group. For information about the limits on security groups and port lists, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section of the &quot;Limits and quotas&quot; topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prl-2ze9743****</p>
         */
        @NameInMap("PortRangeListId")
        public String portRangeListId;

        /**
         * <p>The priority of the security group rule. A smaller value specifies a higher priority. Valid values: 1 to 100.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 CIDR block of the security group rule. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The source port range of the security group rule. Valid values:</p>
         * <ul>
         * <li>If you set IpProtocol to TCP or UDP, the valid values of this parameter are 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.</li>
         * <li>If you set IpProtocol to ICMP, the port range is -1/-1.</li>
         * <li>If you set IpProtocol to GRE, the port range is -1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port range is -1/-1.</li>
         * </ul>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
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

        public RevokeSecurityGroupEgressRequestPermissions setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
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
