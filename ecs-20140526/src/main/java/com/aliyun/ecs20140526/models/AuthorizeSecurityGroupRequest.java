// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // This parameter is discontinued. Use `Permissions.N.Description` to specify the description of security group rule N.
    @NameInMap("Description")
    public String description;

    // This parameter is discontinued. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    // This parameter is discontinued. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.
    @NameInMap("IpProtocol")
    public String ipProtocol;

    // This parameter is discontinued. Use `Permissions.N.Ipv6DestCidrIp` to specify the destination IPv6 CIDR block.
    @NameInMap("Ipv6DestCidrIp")
    public String ipv6DestCidrIp;

    // This parameter is discontinued. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.
    @NameInMap("Ipv6SourceCidrIp")
    public String ipv6SourceCidrIp;

    // This parameter is discontinued. Use `Permissions.N.NicType` to specify the NIC type.
    @NameInMap("NicType")
    public String nicType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // Details about the security group rules.
    @NameInMap("Permissions")
    public java.util.List<AuthorizeSecurityGroupRequestPermissions> permissions;

    // This parameter is discontinued. Use `Permissions.N.Policy` to specify whether to allow inbound access.
    @NameInMap("Policy")
    public String policy;

    // This parameter is discontinued. Use `Permissions.N.PortRange` to specify the range of destination ports.
    @NameInMap("PortRange")
    public String portRange;

    // This parameter is discontinued. Use `Permissions.N.Priority` to specify the rule priority.
    @NameInMap("Priority")
    public String priority;

    // The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The ID of the security group.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // This parameter is discontinued. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.
    @NameInMap("SourceCidrIp")
    public String sourceCidrIp;

    // This parameter is discontinued. Use `Permissions.N.SourceGroupId` to specify the ID of the source security group.
    @NameInMap("SourceGroupId")
    public String sourceGroupId;

    // This parameter is discontinued. Use `Permissions.N.SourceGroupOwnerAccount` to specify the Alibaba Cloud account that manages the source security group.
    @NameInMap("SourceGroupOwnerAccount")
    public String sourceGroupOwnerAccount;

    // This parameter is discontinued. Use `Permissions.N.SourceGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the source security group.
    @NameInMap("SourceGroupOwnerId")
    public Long sourceGroupOwnerId;

    // This parameter is discontinued. Use `Permissions.N.SourcePortRange` to specify the range of source ports.
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    // This parameter is discontinued. Use `Permissions.N.SourcePrefixListId` to specify the ID of the source prefix list.
    @NameInMap("SourcePrefixListId")
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

    public AuthorizeSecurityGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthorizeSecurityGroupRequest setDestCidrIp(String destCidrIp) {
        this.destCidrIp = destCidrIp;
        return this;
    }
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AuthorizeSecurityGroupRequest setIpv6DestCidrIp(String ipv6DestCidrIp) {
        this.ipv6DestCidrIp = ipv6DestCidrIp;
        return this;
    }
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    public AuthorizeSecurityGroupRequest setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
        this.ipv6SourceCidrIp = ipv6SourceCidrIp;
        return this;
    }
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

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

    public AuthorizeSecurityGroupRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AuthorizeSecurityGroupRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

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

    public AuthorizeSecurityGroupRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupId(String sourceGroupId) {
        this.sourceGroupId = sourceGroupId;
        return this;
    }
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
        this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
        return this;
    }
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    public AuthorizeSecurityGroupRequest setSourceGroupOwnerId(Long sourceGroupOwnerId) {
        this.sourceGroupOwnerId = sourceGroupOwnerId;
        return this;
    }
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    public AuthorizeSecurityGroupRequest setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AuthorizeSecurityGroupRequest setSourcePrefixListId(String sourcePrefixListId) {
        this.sourcePrefixListId = sourcePrefixListId;
        return this;
    }
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static class AuthorizeSecurityGroupRequestPermissions extends TeaModel {
        // The description of security group rule N. The description must be 1 to 512 characters in length.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("Description")
        public String description;

        // The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.
        // 
        // This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        // The transport layer protocol of security group rule N. The value of this parameter is case-insensitive. Valid values:
        // 
        // *   TCP
        // *   UDP
        // *   ICMP
        // *   ICMPv6
        // *   GRE
        // *   ALL: All protocols are supported.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The destination IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.
        // 
        // This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
        // 
        // Valid values of N: 1 to 100.
        // 
        // >  The Permissions.N.Ipv6DestCidrIp parameter is valid only when the destination is ECS instances that reside in VPCs and that support IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        // The source IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.
        // 
        // Valid values of N: 1 to 100.
        // 
        // >  The Permissions.N.Ipv6SourceCidrIp parameter is valid only when the source is ECS instances that reside in VPCs and that support IPv6 CIDR blocks. You cannot specify both this parameter and the `SourceCidrIp` parameter.
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        // The network interface controller (NIC) type of security group rule N when the security group is in the classic network. Valid values:
        // 
        // *   internet: public NIC
        // *   intranet: internal NIC
        // 
        // If the security group is in a VPC, this parameter is set to intranet by default and cannot be modified.
        // 
        // If you specify only DestGroupId when you configure access between security groups, this parameter must be set to intranet.
        // 
        // Default value: internet.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("NicType")
        public String nicType;

        // The action of security group rule N that determines whether to allow inbound access. Valid values:
        // 
        // *   accept: allows access.
        // *   drop: denies access and returns no responses. In this case, the request times out or the connection cannot be established.
        // 
        // Default value: accept.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("Policy")
        public String policy;

        // The range of destination ports that correspond to the transport layer protocol for security group rule N. Valid values:
        // 
        // *   When the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.
        // *   When the Permissions.N.IpProtocol parameter is set to ICMP, the port number range is -1/-1, which indicates all ports.
        // *   When the Permissions.N.IpProtocol parameter is set to GRE, the port number range is -1/-1, which indicates all ports.
        // *   When the Permissions.N.IpProtocol parameter is set to ALL, the port number range is -1/-1, which indicates all ports.
        // 
        // For more information, see [Typical applications of commonly used ports](~~40724~~).
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("PortRange")
        public String portRange;

        // The priority of security group rule N. A smaller value indicates a higher priority. Valid values: 1 to 100.
        // 
        // Default value: 1.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("Priority")
        public String priority;

        // The source IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        // The ID of the source security group to be referenced in security group rule N.
        // 
        // *   At least one of `SourceGroupId`, `SourceCidrIp`, `Ipv6SourceCidrIp`, and `SourcePrefixListId` must be specified.
        // *   If `SourceGroupId` is specified but `SourceCidrIp` or `Ipv6SourceCidrIp` is not specified, `NicType` must be set to `intranet`.
        // *   If both `SourceGroupId` and `SourceCidrIp` are specified, `SourceCidrIp` takes precedence.
        // 
        // Valid values of N: 1 to 100.
        // 
        // Take note of the following items:
        // 
        // *   For advanced security groups, security groups cannot be used as authorization objects.
        // *   For each basic security group, a maximum of 20 security groups can be used as authorization objects.
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        // The Alibaba Cloud account that manages the source security group when you set security group rule N across accounts.
        // 
        // *   If both `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are not specified, access permissions are configured for another security group managed by your account.
        // *   If `SourceCidrIp` is specified, the `SourceGroupOwnerAccount` parameter is invalid.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        // The ID of the Alibaba Cloud account that manages the source security group when you set security group rule N across accounts.
        // 
        // *   If both `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are not specified, access permissions are configured for another security group managed by your account.
        // *   If `SourceCidrIp` is specified, the `SourceGroupOwnerAccount` parameter is invalid.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("SourceGroupOwnerId")
        public Long sourceGroupOwnerId;

        // The range of source ports that correspond to the transport layer protocol for security group rule N. Valid values:
        // 
        // *   When the Permissions.N.IpProtocol parameter is set to TCP or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.
        // *   When the Permissions.N.IpProtocol parameter is set to ICMP, the port number range is -1/-1, which indicates all ports.
        // *   When the Permissions.N.IpProtocol parameter is set to GRE, the port number range is -1/-1, which indicates all ports.
        // *   When the Permissions.N.IpProtocol parameter is set to ALL, the port number range is -1/-1, which indicates all ports.
        // 
        // This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        // The ID of the source prefix list to be referenced in security group rule N. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
        // 
        // Valid values of N: 1 to 100.
        // 
        // Take note of the following items:
        // 
        // *   If a security group is in the classic network, prefix lists cannot be referenced in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
        // *   If you specify the `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId` parameter, this parameter is ignored.
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
