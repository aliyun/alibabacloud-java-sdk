// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeHostSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecGroupPermission")
    public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission secGroupPermission;

    @NameInMap("Success")
    public Integer success;

    public static DescribeHostSecurityGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostSecurityGroupAttributeResponseBody self = new DescribeHostSecurityGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostSecurityGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostSecurityGroupAttributeResponseBody setSecGroupPermission(DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission secGroupPermission) {
        this.secGroupPermission = secGroupPermission;
        return this;
    }
    public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission getSecGroupPermission() {
        return this.secGroupPermission;
    }

    public DescribeHostSecurityGroupAttributeResponseBody setSuccess(Integer success) {
        this.success = success;
        return this;
    }
    public Integer getSuccess() {
        return this.success;
    }

    public static class DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("IpProtocol")
        public String ipProtocol;

        @NameInMap("NicType")
        public String nicType;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission self = new DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission();
            return TeaModel.build(map, self);
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setNicType(String nicType) {
            this.nicType = nicType;
            return this;
        }
        public String getNicType() {
            return this.nicType;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission extends TeaModel {
        @NameInMap("SecGroupPermission")
        public java.util.List<DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission> secGroupPermission;

        public static DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission self = new DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission();
            return TeaModel.build(map, self);
        }

        public DescribeHostSecurityGroupAttributeResponseBodySecGroupPermission setSecGroupPermission(java.util.List<DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission> secGroupPermission) {
            this.secGroupPermission = secGroupPermission;
            return this;
        }
        public java.util.List<DescribeHostSecurityGroupAttributeResponseBodySecGroupPermissionSecGroupPermission> getSecGroupPermission() {
            return this.secGroupPermission;
        }

    }

}
