// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
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
     * <p>This parameter is deprecated. Use <code>Permissions.N.IpProtocol</code> to specify the protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("IpProtocol")
    @Deprecated
    public String ipProtocol;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Ipv6DestCidrIp</code> to specify the destination IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:250:6000::***</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Ipv6SourceCidrIp</code> to specify the source IPv6 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2001:250:6000::***</p>
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
     * <p>An array of security group rules. You can specify 1 to 100 security group rules in a request.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<AuthorizeSecurityGroupRequestPermissions> permissions;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.Policy</code> to specify whether to allow access.</p>
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
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourceCidrIp</code> to specify the source IPv4 CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourceGroupId</code> to specify the ID of the source security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp67acfmxazb4p****</p>
     */
    @NameInMap("SourceGroupId")
    @Deprecated
    public String sourceGroupId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourceGroupOwnerAccount</code> to specify the Alibaba Cloud account that manages the source security group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
     */
    @NameInMap("SourceGroupOwnerAccount")
    @Deprecated
    public String sourceGroupOwnerAccount;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourceGroupOwnerId</code> to specify the ID of the Alibaba Cloud account that manages the source security group.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SourceGroupOwnerId")
    @Deprecated
    public Long sourceGroupOwnerId;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourcePortRange</code> to specify the range of source ports.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
     */
    @NameInMap("SourcePortRange")
    @Deprecated
    public String sourcePortRange;

    /**
     * <p>This parameter is deprecated. Use <code>Permissions.N.SourcePrefixListId</code> to specify the ID of the source prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("SourcePrefixListId")
    @Deprecated
    public String sourcePrefixListId;

    public static AuthorizeSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupRequest self = new AuthorizeSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setNicType(String nicType) {
        this.nicType = nicType;
        return this;
    }
    public String getNicType() {
        return this.nicType;
    }

    public AuthorizeSecurityGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AuthorizeSecurityGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AuthorizeSecurityGroupRequest setPermissions(java.util.List<AuthorizeSecurityGroupRequestPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<AuthorizeSecurityGroupRequestPermissions> getPermissions() {
        return this.permissions;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public AuthorizeSecurityGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeSecurityGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AuthorizeSecurityGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AuthorizeSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    @Deprecated
    public AuthorizeSecurityGroupRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static class AuthorizeSecurityGroupRequestPermissions extends TeaModel {
        /**
         * <p>The description of the security group rule. The name must be 1 to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>Network Layer /transport layer protocol. Two types of assignments are supported:</p>
         * <ol>
         * <li>The case-insensitive protocol name. Valid value:</li>
         * </ol>
         * <ul>
         * <li>ICMP</li>
         * <li>GRE</li>
         * <li>TCP</li>
         * <li>UDP</li>
         * <li>ALL: supports all protocols.</li>
         * </ul>
         * <ol start="2">
         * <li>The value of the IANA-compliant protocol number, which is an integer from 0 to 255. List of regions currently available:</li>
         * </ol>
         * <ul>
         * <li>Philippines (Manila)</li>
         * <li>UK (London)</li>
         * <li>Malaysia (Kuala Lumpur)</li>
         * <li>China (Hohhot)</li>
         * <li>China (Qingdao)</li>
         * <li>US (Silicon Valley)</li>
         * <li>Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block. IP address ranges in the CIDR format and IPv6 format are supported.</p>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * <blockquote>
         * <p> This parameter is valid only for VPC-type ECS instances that support IPv6. This parameter and the <code>DestCidrIp</code> parameter cannot be set at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:250:6000::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block of the security group rule. IPv6 CIDR blocks and IPv6 addresses are supported.</p>
         * <blockquote>
         * <p> This parameter is valid only for Elastic Compute Service (ECS) instances that reside in virtual private clouds (VPCs) and support IPv6 CIDR blocks. You cannot specify both this parameter and <code>SourceCidrIp</code> in the same request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:250:6000::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of the security group rule if the security group resides in the classic network. Default value: Month. Valid values:</p>
         * <ul>
         * <li>internet: public NIC.</li>
         * <li>intranet: internal NIC.</li>
         * </ul>
         * <p>If the security group resides in a VPC, this parameter is set to intranet by default and cannot be modified.</p>
         * <p>If you specify only DestGroupId when you configure access permissions between security groups, you must set this parameter to intranet.</p>
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
         * <li>accept: allows inbound access.</li>
         * <li>drop: denies inbound access and returns no responses. In this case, the request times out or the connection cannot be established.</li>
         * </ul>
         * <p>Default value: accept.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination port numbers for the protocols specified in the security group rule. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: Valid values: 1 to 65535. Use a forward slash (/) to separate the start and end ports. Example: 1/200.</li>
         * <li>ICMP:-1/-1.</li>
         * <li>GRE:-1/-1.</li>
         * <li>Set the IpProtocol parameter to ALL:-1/-1.</li>
         * </ul>
         * <p>For more information about the application scenarios of ports, see <a href="https://help.aliyun.com/document_detail/40724.html">Common ports of typical applications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The ID of the port list. You can call the <code>DescribePortRangeLists</code> to query the ID of the port list that can be used.</p>
         * <ul>
         * <li>If you specify a <code>Permissions.N.PortRange</code> parameter, this parameter is ignored.</li>
         * <li>If the network type of the security group is classic network, you cannot set the port list. For more information about limits on security groups and ports, see <a href="~~25412#SecurityGroupQuota1~~">Limits on security groups</a>.</li>
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
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The ID of the source security group referenced in the security group rule.</p>
         * <ul>
         * <li>At least one of <code>SourceGroupId</code>, <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, and <code>SourcePrefixListId</code> must be specified.</li>
         * <li>If you specify <code>SourceGroupId</code> but do not specify <code>SourceCidrIp</code> or <code>Ipv6SourceCidrIp</code>, you must set <code>NicType</code> to <code>intranet</code>.</li>
         * <li>If both <code>SourceGroupId</code> and <code>SourceCidrIp</code> are specified, <code>SourceCidrIp</code> takes precedence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp67acfmxazb4p****</p>
         */
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the source security group referenced in the security group rule.</p>
         * <ul>
         * <li>If both <code>SourceGroupOwnerAccount</code> and <code>SourceGroupOwnerId</code> are empty, access permissions are configured for another security group in your Alibaba Cloud account.</li>
         * <li>If you specify <code>SourceCidrIp</code>, <code>SourceGroupOwnerAccount</code> becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the source security group referenced in the security group rule.</p>
         * <ul>
         * <li>If both <code>SourceGroupOwnerAccount</code> and <code>SourceGroupOwnerId</code> are empty, access permissions are configured for another security group in your Alibaba Cloud account.</li>
         * <li>If you specify <code>SourceCidrIp</code>, <code>SourceGroupOwnerAccount</code> becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("SourceGroupOwnerId")
        public Long sourceGroupOwnerId;

        /**
         * <p>The range of source port numbers for the protocols specified in the security group rule. Default value: Month. Valid values:</p>
         * <ul>
         * <li>TCP/UDP: Valid values: 1 to 65535. Use a forward slash (/) to separate the start and end ports. Example: 1/200.</li>
         * <li>ICMP protocol:-1/-1.</li>
         * <li>GRE protocol:-1/-1.</li>
         * <li>If you set IpProtocol to ALL, the port range is -1/-1.</li>
         * </ul>
         * <p>This parameter is used to support quintuple rules. For more information, see <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>7000/8000</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The ID of the source prefix list of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/205046.html">DescribePrefixLists</a> operation to query the IDs of available prefix lists.</p>
         * <p>Notes:</p>
         * <ul>
         * <li>If a security group resides in the classic network, you cannot specify prefix lists in the rules of the security group. For more information about limits on security groups and prefix lists, see <a href="~~25412#SecurityGroupQuota1~~">Limits on security groups</a>.</li>
         * <li>If you specify <code>SourceCidrIp</code>, <code>Ipv6SourceCidrIp</code>, or <code>SourceGroupId</code>, this parameter is ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        public static AuthorizeSecurityGroupRequestPermissions build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeSecurityGroupRequestPermissions self = new AuthorizeSecurityGroupRequestPermissions();
            return TeaModel.build(map, self);
        }

        public AuthorizeSecurityGroupRequestPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AuthorizeSecurityGroupRequestPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public AuthorizeSecurityGroupRequestPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public AuthorizeSecurityGroupRequestPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public AuthorizeSecurityGroupRequestPermissions setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        public AuthorizeSecurityGroupRequestPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }
        public Long getSourceGroupOwnerId() {
            return this.sourceGroupOwnerId;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public AuthorizeSecurityGroupRequestPermissions setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

    }

}
