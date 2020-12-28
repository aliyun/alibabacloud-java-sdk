// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccountAttributeItems")
    public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItems> accountAttributeItems;

    public static DescribeAccountAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponseBody self = new DescribeAccountAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountAttributesResponseBody setAccountAttributeItems(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItems> accountAttributeItems) {
        this.accountAttributeItems = accountAttributeItems;
        return this;
    }
    public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItems> getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues extends TeaModel {
        @NameInMap("DiskCategory")
        public String diskCategory;

        @NameInMap("Value")
        public String value;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItems extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValues")
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues> attributeValues;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItems self = new DescribeAccountAttributesResponseBodyAccountAttributeItems();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItems setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItems setAttributeValues(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues> attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAttributeValues> getAttributeValues() {
            return this.attributeValues;
        }

    }

}
