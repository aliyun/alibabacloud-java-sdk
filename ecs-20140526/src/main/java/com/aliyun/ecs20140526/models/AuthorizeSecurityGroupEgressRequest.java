// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The <strong>ClientToken</strong> value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
     * <p>Deprecated. Use <code>Permissions.N.DestCidrIp</code> to specify the destination IPv4 Classless Inter-Domain Routing (CIDR) block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("DestCidrIp")
    @Deprecated
    public String destCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.DestGroupId</code> to specify the destination security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("DestGroupId")
    @Deprecated
    public String destGroupId;

    /**
     * <p>Deprecated. Use <code>Permissions.N.DestGroupOwnerAccount</code> to specify the Alibaba Cloud account that manages the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
     */
    @NameInMap("DestGroupOwnerAccount")
    @Deprecated
    public String destGroupOwnerAccount;

    /**
     * <p>Deprecated. Use <code>Permissions.N.DestGroupOwnerId</code> to specify the ID of the Alibaba Cloud account that manages the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678910</p>
     */
    @NameInMap("DestGroupOwnerId")
    @Deprecated
    public Long destGroupOwnerId;

    /**
     * <p>Deprecated. Use <code>Permissions.N.DestPrefixListId</code> to specify the source prefix list ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("DestPrefixListId")
    @Deprecated
    public String destPrefixListId;

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
     * <p>Deprecated. Use <code>Permissions.N.Ipv6DestCidrIp</code> to specify the destination IPv6 Classless Inter-Domain Routing (CIDR) block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1233:1a00::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:db8:1234:1a00::***</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    public String ipv6SourceCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.NicType</code> to specify the NIC type.</p>
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
     * <p>The security group rules. Array length: 1 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<AuthorizeSecurityGroupEgressRequestPermissions> permissions;

    /**
     * <p>Deprecated. Use <code>Permissions.N.Policy</code> to configure the access permission settings.</p>
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
     * <p>80/80</p>
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
     * <p>The region ID of the source security group. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>Deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>Deprecated. Use <code>Permissions.N.SourcePortRange</code> to specify the source port range.</p>
     * 
     * <strong>example:</strong>
     * <p>80/80</p>
     */
    @NameInMap("SourcePortRange")
    @Deprecated
    public String sourcePortRange;

    public static AuthorizeSecurityGroupEgressRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressRequest self = new AuthorizeSecurityGroupEgressRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public AuthorizeSecurityGroupEgressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AuthorizeSecurityGroupEgressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AuthorizeSecurityGroupEgressRequest setPermissions(java.util.List<AuthorizeSecurityGroupEgressRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<AuthorizeSecurityGroupEgressRequestPermissions> getPermissions() {
        return this.permissions;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupEgressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeSecurityGroupEgressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AuthorizeSecurityGroupEgressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AuthorizeSecurityGroupEgressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class AuthorizeSecurityGroupEgressRequestPermissions extends TeaModel {
        /**
         * <p>The description of the security group rule. The description must be 1 to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 Classless Inter-Domain Routing (CIDR) block for which you want to configure access permission settings. Both CIDR format and IPv4 format address ranges are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the destination security group for which you want to set access permissions.</p>
         * <ul>
         * <li><p>You must specify at least one of the following parameters: <code>DestGroupId</code>, <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, or <code>DestPrefixListId</code>.</p>
         * </li>
         * <li><p>If <code>DestGroupId</code> is specified but <code>DestCidrIp</code> is not, the <code>NicType</code> parameter can only be set to intranet.</p>
         * </li>
         * <li><p>If both <code>DestGroupId</code> and <code>DestCidrIp</code> are specified, <code>DestCidrIp</code> takes precedence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the destination security group when you configure a cross-account security group rule settings. </p>
         * <ul>
         * <li>If neither <code>DestGroupOwnerAccount</code> nor <code>DestGroupOwnerId</code> is specified, the access permissions are configured for another security group within your account.</li>
         * <li>If the <code>DestCidrIp</code> parameter is specified, the <code>DestGroupOwnerAccount</code> parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Test@aliyun.com">Test@aliyun.com</a></p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the destination security group when you configure a cross-account security group rule settings. </p>
         * <ul>
         * <li>If neither <code>DestGroupOwnerId</code> nor <code>DestGroupOwnerAccount</code> is specified, the access permissions are configured for another security group within your account.</li>
         * <li>If the <code>DestCidrIp</code> parameter is specified, the <code>DestGroupOwnerId</code> parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12345678910</p>
         */
        @NameInMap("DestGroupOwnerId")
        public Long destGroupOwnerId;

        /**
         * <p>The ID of the destination prefix list for which you want to set access permissions. You can call <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> to query available prefix list IDs.</p>
         * <p>Notes:</p>
         * <p>If you specify one of the <code>DestCidrIp</code>, <code>Ipv6DestCidrIp</code>, or <code>DestGroupId</code> parameters, this parameter is ignored.</p>
         * <p>For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The network-layer or transport-layer protocol. Two types of values are supported:</p>
         * <ol>
         * <li>Case-insensitive protocol names. Valid values:</li>
         * </ol>
         * <ul>
         * <li>ICMP</li>
         * <li>GRE</li>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ALL: All protocols are supported.</li>
         * </ul>
         * <ol start="2">
         * <li>Protocol numbers that comply with IANA specifications, which are integers from 0 to 255. The following regions currently support this feature:</li>
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
         * <p>The destination IPv6 Classless Inter-Domain Routing (CIDR) block for which you want to configure access permission settings. Both CIDR format and IPv6 format address ranges are supported.</p>
         * <blockquote>
         * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. This parameter and <code>DestCidrIp</code> cannot be specified at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block. Both CIDR format and IPv6 format address ranges are supported. </p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <blockquote>
         * <p>This parameter is valid only for VPC-type ECS instances that support IPv6. This parameter and <code>DestCidrIp</code> cannot be specified at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type settings for a classic network security group rule. Valid values: </p>
         * <ul>
         * <li>internet: public network interface controller (NIC).</li>
         * <li>intranet: internal network interface controller (NIC).<ul>
         * <li>For VPC-type security group rules, you do not need to configure the network interface controller (NIC) type settings. The default value is intranet.</li>
         * <li>When you configure security groups to access each other, meaning only the DestGroupId parameter is specified, the value can only be intranet.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>Default value: internet.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The access permission settings. Valid values: </p>
         * <ul>
         * <li>accept: Accepts access.</li>
         * <li>drop: Denies access and does not return a deny message. The request times out or a timeout error similar to a connection failure is returned.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the protocol for the security group. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The port list ID.
         * You can invoke <code>DescribePortRangeLists</code> to query available port list IDs.</p>
         * <ul>
         * <li>If you specify <code>Permissions.N.PortRange</code>, this parameter is ignored.</li>
         * <li>Port lists are not supported for classic network security group settings. For more information about security group and port list limits, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
         * </ul>
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
         * <p>The source IPv4 CIDR block. Both CIDR format and IPv4 format address ranges are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports that correspond to the protocol for the security group. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: Valid values are 1 to 65535. Separate the start port and the end port with a forward slash (/). Example: 1/200.</li>
         * <li>ICMP: -1/-1.</li>
         * <li>GRE: -1/-1.</li>
         * <li>ALL: -1/-1.</li>
         * </ul>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static AuthorizeSecurityGroupEgressRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeSecurityGroupEgressRequestPermissions self = new AuthorizeSecurityGroupEgressRequestPermissions();
            return TeaModel.build(map, self);
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDestGroupOwnerId(Long destGroupOwnerId) {
            this.destGroupOwnerId = destGroupOwnerId;
            return this;
        }
        public Long getDestGroupOwnerId() {
            return this.destGroupOwnerId;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public AuthorizeSecurityGroupEgressRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
