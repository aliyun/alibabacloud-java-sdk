// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gdb20190903.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupConfigurationResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Items")
    public DescribeSecurityGroupConfigurationResponseBodyItems items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityGroupConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupConfigurationResponseBody self = new DescribeSecurityGroupConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupConfigurationResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public static class DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation extends TeaModel {
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        public static DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation self = new DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

    }

    public static class DescribeSecurityGroupConfigurationResponseBodyItems extends TeaModel {
        @NameInMap("EcsSecurityGroupRelation")
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation;

        public static DescribeSecurityGroupConfigurationResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityGroupConfigurationResponseBodyItems self = new DescribeSecurityGroupConfigurationResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityGroupConfigurationResponseBodyItems setEcsSecurityGroupRelation(java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> ecsSecurityGroupRelation) {
            this.ecsSecurityGroupRelation = ecsSecurityGroupRelation;
            return this;
        }
        public java.util.List<DescribeSecurityGroupConfigurationResponseBodyItemsEcsSecurityGroupRelation> getEcsSecurityGroupRelation() {
            return this.ecsSecurityGroupRelation;
        }

    }

}
