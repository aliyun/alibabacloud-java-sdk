// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The description of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription1</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Permissions")
    public DescribeSecurityGroupAttributeResponseBodyPermissions permissions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1gxw6bznjjvhu3****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the destination security group.</p>
     * 
     * <strong>example:</strong>
     * <p>testSecurityGroupName2</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

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

    public DescribeSecurityGroupAttributeResponseBody setPermissions(DescribeSecurityGroupAttributeResponseBodyPermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    public DescribeSecurityGroupAttributeResponseBodyPermissions getPermissions() {
        return this.permissions;
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

    public static class DescribeSecurityGroupAttributeResponseBodyPermissionsPermission extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DestCidrIp")
        public String destCidrIp;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        public static DescribeSecurityGroupAttributeResponseBodyPermissionsPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponseBodyPermissionsPermission self = new DescribeSecurityGroupAttributeResponseBodyPermissionsPermission();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }
        public String getSourcePortRange() {
            return this.sourcePortRange;
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
