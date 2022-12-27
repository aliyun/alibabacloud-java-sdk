// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RevokeSecurityGroupEgressRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // This parameter is discontinued. Use `Permissions.N.Description` to specify the description of security group rule N.
    @NameInMap("Description")
    public String description;

    // This parameter is discontinued. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.
    @NameInMap("DestCidrIp")
    public String destCidrIp;

    // This parameter is discontinued. Use `Permissions.N.DestGroupId` to specify the ID of the destination security group.
    @NameInMap("DestGroupId")
    public String destGroupId;

    // This parameter is discontinued. Use `Permissions.N.DestGroupOwnerAccount` to specify the Alibaba Cloud account that manages the destination security group.
    @NameInMap("DestGroupOwnerAccount")
    public String destGroupOwnerAccount;

    // This parameter is discontinued. Use `Permissions.N.DestGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the destination security group.
    @NameInMap("DestGroupOwnerId")
    public Long destGroupOwnerId;

    // This parameter is discontinued. Use `Permissions.N.DestPrefixListId` to specify the ID of the destination prefix list.
    @NameInMap("DestPrefixListId")
    public String destPrefixListId;

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
    public java.util.List<RevokeSecurityGroupEgressRequestPermissions> permissions;

    // This parameter is discontinued. Use `Permissions.N.Policy` to specify whether to allow outbound access.
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

    // This parameter is discontinued. Use `Permissions.N.SourcePortRange` to specify the range of source ports.
    @NameInMap("SourcePortRange")
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
        // The description of security group rule N. The description must be 1 to 512 characters in length.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("Description")
        public String description;

        // The destination IPv4 CIDR block for security group rule N. CIDR blocks and IPv4 addresses are supported.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        // The ID of the source security group that is referenced in security group rule N.
        // 
        // *   At least one of `DestGroupId`, `DestCidrIp`, `Ipv6DestCidrIp`, and `DestPrefixListId` must be specified.
        // *   If `DestGroupId` is specified but `DestCidrIp` is not specified, the `NicType` parameter must be set to intranet.
        // *   If both `DestGroupId` and `DestCidrIp` are specified, `DestCidrIp` takes precedence.
        // 
        // Take note of the following items:
        // 
        // *   For advanced security groups, security groups cannot be used as authorization objects.
        // *   For each basic security group, a maximum of 20 security groups can be used as authorization objects.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestGroupId")
        public String destGroupId;

        // The Alibaba Cloud account that manages the destination security group when you delete security group rules N across accounts.
        // 
        // *   If both `DestGroupOwnerAccount` and `DestGroupOwnerId` are not specified, the access control is revoked from another security group managed by your account.
        // *   If `DestCidrIp` is specified, `DestGroupOwnerAccount` is ignored.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        // The Alibaba Cloud account that manages the destination security group when you delete security group rule N across accounts.
        // 
        // *   If both `DestGroupOwnerId` and `DestGroupOwnerAccount` are not specified, the access control is revoked from another security group managed by your account.
        // *   If `DestCidrIp` is specified, `DestGroupOwnerId` is invalid.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestGroupOwnerId")
        public String destGroupOwnerId;

        // The ID of the destination prefix list that is referenced in security group rule N. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
        // 
        // Take note of the following items:
        // 
        // *   If a security group is in the classic network, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
        // *   If you specify `DestCidrIp`, `Ipv6DestCidrIp`, or `DestGroupId`, Permissions.N.DestPrefixListId is ignored.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

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
        // Valid values of N: 1 to 100.
        // 
        // >  The Permissions.N.Ipv6DestCidrIp parameter is valid only when the destination is ECS instances that reside in virtual private clouds (VPCs) and that support IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        // The source IPv6 CIDR block for security group rule N. CIDR blocks and IPv6 addresses are supported.
        // 
        // This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
        // 
        // Valid values of N: 1 to 100.
        // 
        // >  The Permissions.N.Ipv6SourceCidrIp parameter is valid only when the source is ECS instances that reside in VPCs and that support IPv6 CIDR blocks. You cannot specify both this parameter and the `DestCidrIp` parameter.
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        // The network interface controller (NIC) type of security group rule N when the security group is in the classic network. Valid values:
        // 
        // *   internet: public NIC
        // *   intranet: internal NIC
        // 
        // If the security group is in a VPC, this parameter is set to intranet by default and cannot be modified.
        // 
        // If you specify only `SourceGroupId` when you configure access between security groups, this parameter must be set to intranet.
        // 
        // Default value: internet.
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("NicType")
        public String nicType;

        // The action of security group rule N that determines whether to allow outbound access. Valid values:
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
        // This parameter is specified to meet quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
        // 
        // Valid values of N: 1 to 100.
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

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
