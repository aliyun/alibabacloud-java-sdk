// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/25693.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Description` to specify the description of security group rule N.</p>
     */
    @NameInMap("Description")
    @Deprecated
    public String description;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.</p>
     */
    @NameInMap("DestCidrIp")
    @Deprecated
    public String destCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupId` to specify the ID of the destination security group.</p>
     */
    @NameInMap("DestGroupId")
    @Deprecated
    public String destGroupId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupOwnerAccount` to specify the Alibaba Cloud account that manages the destination security group.</p>
     */
    @NameInMap("DestGroupOwnerAccount")
    @Deprecated
    public String destGroupOwnerAccount;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the destination security group.</p>
     */
    @NameInMap("DestGroupOwnerId")
    @Deprecated
    public Long destGroupOwnerId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.DestPrefixListId` to specify the ID of the destination prefix list.</p>
     */
    @NameInMap("DestPrefixListId")
    @Deprecated
    public String destPrefixListId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.</p>
     */
    @NameInMap("IpProtocol")
    @Deprecated
    public String ipProtocol;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Ipv6DestCidrIp` to specify the destination IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6DestCidrIp")
    @Deprecated
    public String ipv6DestCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.</p>
     */
    @NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    public String ipv6SourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.NicType` to specify the NIC type.</p>
     */
    @NameInMap("NicType")
    @Deprecated
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The security group rules. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("Permissions")
    public java.util.List<AuthorizeSecurityGroupEgressRequestPermissions> permissions;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Policy` to specify whether to allow outbound access.</p>
     */
    @NameInMap("Policy")
    @Deprecated
    public String policy;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.PortRange` to specify the range of destination ports.</p>
     */
    @NameInMap("PortRange")
    @Deprecated
    public String portRange;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.Priority` to specify the rule priority.</p>
     */
    @NameInMap("Priority")
    @Deprecated
    public String priority;

    /**
     * <p>The region ID of the source security group. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The security group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.</p>
     */
    @NameInMap("SourceCidrIp")
    @Deprecated
    public String sourceCidrIp;

    /**
     * <p>This parameter is deprecated. Use `Permissions.N.SourcePortRange` to specify the range of source ports.</p>
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

    public AuthorizeSecurityGroupEgressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthorizeSecurityGroupEgressRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupEgressRequest setDestGroupId(String destGroupId) {
        this.destGroupId = destGroupId;
        return this;
    }
    public String getDestGroupId() {
        return this.destGroupId;
    }

    public AuthorizeSecurityGroupEgressRequest setDestGroupOwnerAccount(String destGroupOwnerAccount) {
        this.destGroupOwnerAccount = destGroupOwnerAccount;
        return this;
    }
    public String getDestGroupOwnerAccount() {
        return this.destGroupOwnerAccount;
    }

    public AuthorizeSecurityGroupEgressRequest setDestGroupOwnerId(Long destGroupOwnerId) {
        this.destGroupOwnerId = destGroupOwnerId;
        return this;
    }
    public Long getDestGroupOwnerId() {
        return this.destGroupOwnerId;
    }

    public AuthorizeSecurityGroupEgressRequest setDestPrefixListId(String destPrefixListId) {
        this.destPrefixListId = destPrefixListId;
        return this;
    }
    public String getDestPrefixListId() {
        return this.destPrefixListId;
    }

    public AuthorizeSecurityGroupEgressRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupEgressRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public AuthorizeSecurityGroupEgressRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

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

    public AuthorizeSecurityGroupEgressRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupEgressRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

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

    public AuthorizeSecurityGroupEgressRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public AuthorizeSecurityGroupEgressRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class AuthorizeSecurityGroupEgressRequestPermissions extends TeaModel {
        /**
         * <p>The description of security group rule N. The description must be 1 to 512 characters in length.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the destination security group to be referenced in security group rule N.</p>
         * <br>
         * <p>*   At least one of `DestGroupId`, `DestCidrIp`, `Ipv6DestCidrIp`, and `DestPrefixListId` must be configured.</p>
         * <p>*   If `DestGroupId` is configured but `DestCidrIp` is not configured, the value of `NicType` must be set to intranet.</p>
         * <p>*   If both `DestGroupId` and `DestCidrIp` are configured, the value of `DestCidrIp` prevails by default.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   For advanced security groups, security groups cannot be used as authorization objects.</p>
         * <p>*   For each basic security group, a maximum of 20 security groups can be used as authorization objects.</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The Alibaba Cloud account that manages the destination security group when you configure security group rule N across accounts.</p>
         * <br>
         * <p>*   If both `DestGroupOwnerAccount` and `DestGroupOwnerId` are not configured, the rule is created to control access to another security group within your Alibaba Cloud account.</p>
         * <p>*   If `DestCidrIp` is configured, `DestGroupOwnerAccount` is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the Alibaba Cloud account that manages the destination security group when you configure security group rule N across accounts.</p>
         * <br>
         * <p>*   If both `DestGroupOwnerId` and `DestGroupOwnerAccount` are not configured, the rule is created to control access to another security group within your Alibaba Cloud account.</p>
         * <p>*   If `DestCidrIp` is configured, `DestGroupOwnerId` is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestGroupOwnerId")
        public Long destGroupOwnerId;

        /**
         * <p>The ID of the destination prefix list to be referenced in security group rule N. You can call the [DescribePrefixLists](https://help.aliyun.com/document_detail/205046.html) operation to query the IDs of available prefix lists.</p>
         * <br>
         * <p>Take note of the following items:</p>
         * <br>
         * <p>*   If a security group is in the classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).</p>
         * <p>*   If you configured `DestCidrIp`, `Ipv6DestCidrIp`, or `DestGroupId`, DestPrefixListId is ignored.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The transport layer protocol of security group rule N. The value of this parameter is case-insensitive. Valid values:</p>
         * <br>
         * <p>*   TCP.</p>
         * <p>*   UDP.</p>
         * <p>*   ICMP.</p>
         * <p>*   ICMPv6.</p>
         * <p>*   GRE.</p>
         * <p>*   ALL: All protocols are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter takes effect only when the destination is ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot configure both this parameter and `DestCidrIp`.</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](https://help.aliyun.com/document_detail/97439.html).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         * <br>
         * <p>> This parameter takes effect only when the source is ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot configure both this parameter and `SourceCidrIp`.</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network interface controller (NIC) type of security group rule N when the security group is in the classic network. Valid values:</p>
         * <br>
         * <p>*   internet: public NIC</p>
         * <br>
         * <p>*   intranet: internal NIC</p>
         * <br>
         * <p>    *   If the security group is in a VPC, this parameter is set to intranet by default and cannot be changed.</p>
         * <p>    *   If you configure only DestGroupId when you configure access between security groups, this parameter must be set to intranet.</p>
         * <br>
         * <p>Default value: internet.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The action of security group rule N that determines whether to allow outbound access. Valid values:</p>
         * <br>
         * <p>*   accept: allows access.</p>
         * <p>*   drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.</p>
         * <br>
         * <p>Default value: accept.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <br>
         * <p>*   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
         * <p>*   If you set IpProtocol to ICMP, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to GRE, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to ALL, the port number range is -1/-1.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of security group rule N. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * <br>
         * <p>Default value: 1.</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The source IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](https://help.aliyun.com/document_detail/97439.html).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The range of source ports that correspond to the transport layer protocol for security group rule N. Valid values:</p>
         * <br>
         * <p>*   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
         * <p>*   If you set IpProtocol to ICMP, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to GRE, the port number range is -1/-1.</p>
         * <p>*   If you set IpProtocol to ALL, the port number range is -1/-1.</p>
         * <br>
         * <p>This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](https://help.aliyun.com/document_detail/97439.html).</p>
         * <br>
         * <p>Valid values of N: 1 to 100.</p>
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
