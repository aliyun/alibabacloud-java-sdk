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

    }

    public static class DescribeSecurityGroupAttributeResponsePermissions extends TeaModel {
        @NameInMap("Permission")
        @Validation(required = true)
        public java.util.List<DescribeSecurityGroupAttributeResponsePermissionsPermission> permission;

        public static DescribeSecurityGroupAttributeResponsePermissions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupAttributeResponsePermissions self = new DescribeSecurityGroupAttributeResponsePermissions();
            return TeaModel.build(map, self);
        }

    }

}
