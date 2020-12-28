// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Permissions")
    public java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissions> permissions;

    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeSecurityGroupAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeSecurityGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupAttributeResponseBody setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public DescribeSecurityGroupAttributeResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeSecurityGroupAttributeResponseBody setPermissions(java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<DescribeSecurityGroupAttributeResponseBodyPermissions> getPermissions() {
        return this.permissions;
    }

    public DescribeSecurityGroupAttributeResponseBody setInnerAccessPolicy(String innerAccessPolicy) {
        this.innerAccessPolicy = innerAccessPolicy;
        return this;
    }
    public String getInnerAccessPolicy() {
        return this.innerAccessPolicy;
    }

    public DescribeSecurityGroupAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeSecurityGroupAttributeResponseBodyPermissions extends TeaModel {
        @NameInMap("Direction")
        public String direction;

        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DestGroupId")
        public String destGroupId;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("DestGroupName")
        public String destGroupName;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Description")
        public String description;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static DescribeSecurityGroupAttributeResponseBodyPermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyPermissions self = new DescribeSecurityGroupAttributeResponseBodyPermissions();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setSourceGroupId(String sourceGroupId) {
            this.sourceGroupId = sourceGroupId;
            return this;
        }
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDestGroupOwnerAccount(String destGroupOwnerAccount) {
            this.destGroupOwnerAccount = destGroupOwnerAccount;
            return this;
        }
        public String getDestGroupOwnerAccount() {
            return this.destGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setIpv6DestCidrIp(String ipv6DestCidrIp) {
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setIpv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDestGroupId(String destGroupId) {
            this.destGroupId = destGroupId;
            return this;
        }
        public String getDestGroupId() {
            return this.destGroupId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDestGroupName(String destGroupName) {
            this.destGroupName = destGroupName;
            return this;
        }
        public String getDestGroupName() {
            return this.destGroupName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setSourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setSourceGroupName(String sourceGroupName) {
            this.sourceGroupName = sourceGroupName;
            return this;
        }
        public String getSourceGroupName() {
            return this.sourceGroupName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissions setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

    }

}
