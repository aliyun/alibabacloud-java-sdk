// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The description of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The access control policy of the security group. Valid values:</p>
     * <ul>
     * <li>Accept: All instances in the security group can communicate with each other.</li>
     * <li>Drop: All instances in the security group are isolated from each other.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Accept</p>
     */
    @NameInMap("InnerAccessPolicy")
    public String innerAccessPolicy;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If the return value of this parameter is empty when you specify <code>MaxResults</code> and <code>NextToken</code> for a paged query, no more results are to be returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Details about the security group rules.</p>
     */
    @NameInMap("Permissions")
    public DescribeSecurityGroupAttributeResponseBodyPermissions permissions;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1gxw6bznjjvhu3****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>SecurityGroupName Sample</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    /**
     * <p>The ID of the VPC. If a VPC ID is returned, the network type of the security group is VPC. If no VPC ID is returned, the network type of the security group is classic network.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
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

    public DescribeSecurityGroupAttributeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The time when the security group rule was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-12T07:28:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>Description Sample 01</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The destination CIDR block for outbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("DestCidrIp")
        public String destCidrIp;

        /**
         * <p>The ID of the destination security group for outbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1czdx84jd88i7v****</p>
         */
        @NameInMap("DestGroupId")
        public String destGroupId;

        /**
         * <p>The name of the destination security group.</p>
         * 
         * <strong>example:</strong>
         * <p>testDestGroupName</p>
         */
        @NameInMap("DestGroupName")
        public String destGroupName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the destination security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("DestGroupOwnerAccount")
        public String destGroupOwnerAccount;

        /**
         * <p>The ID of the destination prefix list for outbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixabc****</p>
         */
        @NameInMap("DestPrefixListId")
        public String destPrefixListId;

        /**
         * <p>The name of the destination prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>DestPrefixListName Sample</p>
         */
        @NameInMap("DestPrefixListName")
        public String destPrefixListName;

        /**
         * <p>The direction in which the security group rule is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The transport layer protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The destination IPv6 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1233:1a00::***</p>
         */
        @NameInMap("Ipv6DestCidrIp")
        public String ipv6DestCidrIp;

        /**
         * <p>The source IPv6 CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:db8:1234:1a00::***</p>
         */
        @NameInMap("Ipv6SourceCidrIp")
        public String ipv6SourceCidrIp;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("NicType")
        public String nicType;

        /**
         * <p>The access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Accept</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("PortRange")
        public String portRange;

        /**
         * <p>The ID of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>prl-2ze9743****</p>
         */
        @NameInMap("PortRangeListId")
        public String portRangeListId;

        /**
         * <p>The name of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>PortRangeListNameSample</p>
         */
        @NameInMap("PortRangeListName")
        public String portRangeListName;

        /**
         * <p>The priority of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The ID of the security group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>sgr-bp12kewq32dfwrdi****</p>
         */
        @NameInMap("SecurityGroupRuleId")
        public String securityGroupRuleId;

        /**
         * <p>The source CIDR block for inbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        /**
         * <p>The source security group for inbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp12kc4rqohaf2js****</p>
         */
        @NameInMap("SourceGroupId")
        public String sourceGroupId;

        /**
         * <p>The name of the source security group.</p>
         * 
         * <strong>example:</strong>
         * <p>testSourceGroupName1</p>
         */
        @NameInMap("SourceGroupName")
        public String sourceGroupName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the source security group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("SourceGroupOwnerAccount")
        public String sourceGroupOwnerAccount;

        /**
         * <p>The source port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        @NameInMap("SourcePortRange")
        public String sourcePortRange;

        /**
         * <p>The ID of the source prefix list for inbound access control.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-x1j1k5ykzqlixdcy****</p>
         */
        @NameInMap("SourcePrefixListId")
        public String sourcePrefixListId;

        /**
         * <p>The name of the source prefix list.</p>
         * 
         * <strong>example:</strong>
         * <p>SourcePrefixListName Sample</p>
         */
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

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPortRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPortRangeListName(String portRangeListName) {
            this.portRangeListName = portRangeListName;
            return this;
        }
        public String getPortRangeListName() {
            return this.portRangeListName;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeSecurityGroupAttributeResponseBodyPermissionsPermission setSecurityGroupRuleId(String securityGroupRuleId) {
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }
        public String getSecurityGroupRuleId() {
            return this.securityGroupRuleId;
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
