// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    /**
     * <p>Details about the ECS security groups.</p>
     */
    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3C4A2494-85C4-45C5-93CF-548DB3375193</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponseBody self = new DescribeSecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponseBody setItems(DescribeSecurityGroupConfigurationResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSecurityGroupConfigurationResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeSecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel extends TeaModel {
        /**
         * <p>The network type of the ECS security group. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong></li>
         * <li><strong>classic</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID of the ECS security group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the ECS security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bpxxxxxxxx</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel self = new DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItems extends TeaModel {
        @NameInMap("RdsEcsSecurityGroupRel")
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

        public static DescribeSecurityGroupConfigurationResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItems self = new DescribeSecurityGroupConfigurationResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItems setRdsEcsSecurityGroupRel(java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel) {
            this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
            return this;
        }
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel> getRdsEcsSecurityGroupRel() {
            return this.rdsEcsSecurityGroupRel;
        }

    }

}
