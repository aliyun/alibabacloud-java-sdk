// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The description of the security group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Details about the rules.</p>
     */
    @NameInMap("Permissions")
    public DescribeSecurityGroupAttributeResponseBodyPermissions permissions;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the destination security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the destination security group.</p>
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
        /**
         * <p>The time at which the security group rule was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The range of destination IP addresses for outbound access control.</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The direction in which the security group rule is applied.</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The transport layer protocol.</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The policy.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The source port range.</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The priority of the rule.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The range of source IP addresses for inbound access control.</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The source port number range for the security group.</p>
         */
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
