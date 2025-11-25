// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallAclGroupListResponseBody extends TeaModel {
    @NameInMap("NatFirewalls")
    public java.util.List<DescribeNatFirewallAclGroupListResponseBodyNatFirewalls> natFirewalls;

    /**
     * <strong>example:</strong>
     * <p>F06DE24D-6EB9-5F55-B588-7BB946DF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNatFirewallAclGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallAclGroupListResponseBody self = new DescribeNatFirewallAclGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallAclGroupListResponseBody setNatFirewalls(java.util.List<DescribeNatFirewallAclGroupListResponseBodyNatFirewalls> natFirewalls) {
        this.natFirewalls = natFirewalls;
        return this;
    }
    public java.util.List<DescribeNatFirewallAclGroupListResponseBodyNatFirewalls> getNatFirewalls() {
        return this.natFirewalls;
    }

    public DescribeNatFirewallAclGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNatFirewallAclGroupListResponseBodyNatFirewalls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("AclRuleCount")
        public Integer aclRuleCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>ngw-2zed6z6qkd7ogc****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <strong>example:</strong>
         * <p>ngw-test</p>
         */
        @NameInMap("NatGatewayName")
        public String natGatewayName;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribeNatFirewallAclGroupListResponseBodyNatFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatFirewallAclGroupListResponseBodyNatFirewalls self = new DescribeNatFirewallAclGroupListResponseBodyNatFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeNatFirewallAclGroupListResponseBodyNatFirewalls setAclRuleCount(Integer aclRuleCount) {
            this.aclRuleCount = aclRuleCount;
            return this;
        }
        public Integer getAclRuleCount() {
            return this.aclRuleCount;
        }

        public DescribeNatFirewallAclGroupListResponseBodyNatFirewalls setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeNatFirewallAclGroupListResponseBodyNatFirewalls setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatFirewallAclGroupListResponseBodyNatFirewalls setNatGatewayName(String natGatewayName) {
            this.natGatewayName = natGatewayName;
            return this;
        }
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        public DescribeNatFirewallAclGroupListResponseBodyNatFirewalls setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
