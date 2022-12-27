// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    // The description of the security group.
    @NameInMap("Description")
    public String description;

    // The access control policy of the security group. Valid values:
    // 
    // *   Accept: All instances in the security group can communicate with each other.
    // *   drop: All instances in the security group are isolated from each other.
    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    // Details about the security group rules.
    @NameInMap("Permissions")
    public DescribeSecurityGroupAttributeResponseBodyPermissions permissions;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The ID of the destination security group.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The name of the destination security group.
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    // The ID of the VPC. If a VPC ID is returned, the network type of the security group is VPC. If no VPC ID is returned, the network type of the security group is classic network.
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeSecurityGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeResponseBody self = new DescribeSecurityGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSecurityGroupAttributeResponseBody setInnerAccessPolicy(String innerAccessPolicy) {
        this.innerAccessPolicy = innerAccessPolicy;
        return this;
    }
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public DescribeSecurityGroupAttributeResponseBody setPermissions(DescribeSecurityGroupAttributeResponseBodyPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    public DescribeSecurityGroupAttributeResponseBodyPermissions getPermissions() {
        return this.permissions;
    }

    public DescribeSecurityGroupAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupAttributeResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeSecurityGroupAttributeResponseBody setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public DescribeSecurityGroupAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeSecurityGroupAttributeResponseBodyPermissionsPermission extends TeaModel {
        // The time when the security group rule was created. The time is displayed in UTC.
        @NameInMap("CreateTime")
        public String createTime;

        // The description of the security group.
        @NameInMap("Description")
        public String description;

        // The destination CIDR blocks for outbound access control
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        // The ID of the destination security group for outbound access control.
        @NameInMap("DestGroupId")
        public String destGroupId;

        // The name of the destination security group.
        @NameInMap("DestGroupName")
        public String destGroupName;

        // The Alibaba Cloud account that manages the destination security group.
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        // The ID of the destination prefix list for outbound access control.
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        // The name of the destination prefix list.
        @NameInMap("DestPrefixListName")
        public String destPrefixListName;

        // The direction in which the security group rule is applied.
        @NameInMap("Direction")
        public String direction;

        // The transport layer protocol.
        @NameInMap("IpProtocol")
        public String ipProtocol;

        // The destination IPv6 CIDR block.
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        // The source IPv6 CIDR block.
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        // The NIC type of the security group rule.
        @NameInMap("NicType")
        public String nicType;

        // The access control policy.
        @NameInMap("Policy")
        public String policy;

        // The port number range.
        @NameInMap("PortRange")
        public String portRange;

        // The priority of the rule.
        @NameInMap("Priority")
        public String priority;

        // The source CIDR block for inbound access control.
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        // The source security group for inbound access control.
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        // The name of the source security group.
        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        // The Alibaba Cloud account that manages the source security group.
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        // The source port number range.
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        // The ID of the source prefix list for inbound access control.
        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        // The name of the source prefix list.
        @NameInMap("SourcePrefixListName")
        public String sourcePrefixListName;

        public static DescribeSecurityGroupAttributeResponseBodyPermissionsPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyPermissionsPermission self = new DescribeSecurityGroupAttributeResponseBodyPermissionsPermission();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestGroupName(String destGroupName) {
            this.destGroupName = destGroupName;
            return this;
        }
        public String getDestGroupName() {
            return this.destGroupName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestPrefixListId(String destPrefixListId) {
            this.destPrefixListId = destPrefixListId;
            return this;
        }
        public String getDestPrefixListId() {
            return this.destPrefixListId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDestPrefixListName(String destPrefixListName) {
            this.destPrefixListName = destPrefixListName;
            return this;
        }
        public String getDestPrefixListName() {
            return this.destPrefixListName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourcePrefixListId(String sourcePrefixListId) {
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourcePrefixListName(String sourcePrefixListName) {
            this.sourcePrefixListName = sourcePrefixListName;
            return this;
        }
        public String getSourcePrefixListName() {
            return this.sourcePrefixListName;
        }

    }

    public static class DescribeSecurityGroupAttributeResponseBodyPermissions extends TeaModel {
        @NameInMap("Permission")
        public java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissionsPermission> permission;

        public static DescribeSecurityGroupAttributeResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyPermissions self = new DescribeSecurityGroupAttributeResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setPermission(java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissionsPermission> permission) {
            this.permission = permission;
            return this;
        }
        public java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissionsPermission> getPermission() {
            return this.permission;
        }

    }

}
