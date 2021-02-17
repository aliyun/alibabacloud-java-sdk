// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    public static DescribeSecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponseBody self = new DescribeSecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityGroupConfigurationResponseBody setItems(DescribeSecurityGroupConfigurationResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeSecurityGroupConfigurationResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel extends TeaModel {
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel self = new DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsRdsEcsSecurityGroupRel setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
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
