// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("SecurityGroupName")
    @Validation(required = true)
    public String securityGroupName;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("InnerAccessPolicy")
    @Validation(required = true)
    public String innerAccessPolicy;

    @NameInMap("Permissions")
    @Validation(required = true)
    public DescribeSecurityGroupAttributeResponsePermissions permissions;

    public static DescribeSecurityGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupAttributeResponse self = new DescribeSecurityGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupAttributeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityGroupAttributeResponse setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeSecurityGroupAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeSecurityGroupAttributeResponse setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public DescribeSecurityGroupAttributeResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeSecurityGroupAttributeResponse setInnerAccessPolicy(String innerAccessPolicy) {
        this.innerAccessPolicy = innerAccessPolicy;
        return this;
    }
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public DescribeSecurityGroupAttributeResponse setPermissions(DescribeSecurityGroupAttributeResponsePermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    public DescribeSecurityGroupAttributeResponsePermissions getPermissions() {
        return this.permissions;
    }

    public static class DescribeSecurityGroupAttributeResponsePermissionsPermission extends TeaModel {
        @NameInMap("IpProtocol")
        @Validation(required = true)
        public String ipProtocol;

        @NameInMap("PortRange")
        @Validation(required = true)
        public String portRange;

        @NameInMap("SourcePortRange")
        @Validation(required = true)
        public String sourcePortRange;

        @NameInMap("SourceGroupId")
        @Validation(required = true)
        public String sourceGroupId;

        @NameInMap("SourceGroupName")
        @Validation(required = true)
        public String sourceGroupName;

        @NameInMap("SourceCidrIp")
        @Validation(required = true)
        public String sourceCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        @Validation(required = true)
        public String ipv6SourceCidrIp;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("NicType")
        @Validation(required = true)
        public String nicType;

        @NameInMap("SourceGroupOwnerAccount")
        @Validation(required = true)
        public String sourceGroupOwnerAccount;

        @NameInMap("DestGroupId")
        @Validation(required = true)
        public String destGroupId;

        @NameInMap("DestGroupName")
        @Validation(required = true)
        public String destGroupName;

        @NameInMap("DestCidrIp")
        @Validation(required = true)
        public String destCidrIp;

        @NameInMap("Ipv6DestCidrIp")
        @Validation(required = true)
        public String ipv6DestCidrIp;

        @NameInMap("DestGroupOwnerAccount")
        @Validation(required = true)
        public String destGroupOwnerAccount;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        @NameInMap("Direction")
        @Validation(required = true)
        public String direction;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeSecurityGroupAttributeResponsePermissionsPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponsePermissionsPermission self = new DescribeSecurityGroupAttributeResponsePermissionsPermission();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDestGroupName(String destGroupName) {
            this.destGroupName = destGroupName;
            return this;
        }
        public String getDestGroupName() {
            return this.destGroupName;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeSecurityGroupAttributeResponsePermissions extends TeaModel {
        @NameInMap("Permission")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupAttributeResponsePermissionsPermission> permission;

        public static DescribeSecurityGroupAttributeResponsePermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponsePermissions self = new DescribeSecurityGroupAttributeResponsePermissions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponsePermissions setPermission(java.util.List<DescribeSecurityGroupAttributeResponsePermissionsPermission> permission) {
            this.permission = permission;
            return this;
        }
        public java.util.List<DescribeSecurityGroupAttributeResponsePermissionsPermission> getPermission() {
            return this.permission;
        }

    }

}
