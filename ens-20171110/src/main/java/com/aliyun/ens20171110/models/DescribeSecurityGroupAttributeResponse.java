// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

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

    public DescribeSecurityGroupAttributeResponse setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeSecurityGroupAttributeResponse setPermissions(DescribeSecurityGroupAttributeResponsePermissions permissions) {
        this.permissions = permissions;
        return this;
    }
    public DescribeSecurityGroupAttributeResponsePermissions getPermissions() {
        return this.permissions;
    }

    public static class DescribeSecurityGroupAttributeResponsePermissionsPermission extends TeaModel {
        @NameInMap("DestCidrIp")
        @Validation(required = true)
        public String destCidrIp;

        @NameInMap("SourceCidrIp")
        @Validation(required = true)
        public String sourceCidrIp;

        @NameInMap("IpProtocol")
        @Validation(required = true)
        public String ipProtocol;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("Policy")
        @Validation(required = true)
        public String policy;

        @NameInMap("Direction")
        @Validation(required = true)
        public String direction;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("PortRange")
        @Validation(required = true)
        public String portRange;

        @NameInMap("SourcePortRange")
        @Validation(required = true)
        public String sourcePortRange;

        public static DescribeSecurityGroupAttributeResponsePermissionsPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponsePermissionsPermission self = new DescribeSecurityGroupAttributeResponsePermissionsPermission();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDestCidrIp(String destCidrIp) {
            this.destCidrIp = destCidrIp;
            return this;
        }
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeSecurityGroupAttributeResponsePermissionsPermission setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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
