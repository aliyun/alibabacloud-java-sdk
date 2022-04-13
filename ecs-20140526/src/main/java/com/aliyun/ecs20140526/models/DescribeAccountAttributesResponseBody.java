// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    @NameInMap("AccountAttributeItems")
    public DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponseBody self = new DescribeAccountAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponseBody setAccountAttributeItems(DescribeAccountAttributesResponseBodyAccountAttributeItems accountAttributeItems) {
        this.accountAttributeItems = accountAttributeItems;
        return this;
    }
    public DescribeAccountAttributesResponseBodyAccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public DescribeAccountAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("DiskCategory")
        public String diskCategory;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Value")
        public String value;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues setValueItem(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem) {
            this.valueItem = valueItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> getValueItem() {
            return this.valueItem;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValues")
        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem self = new DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem setAttributeValues(DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItemAttributeValues getAttributeValues() {
            return this.attributeValues;
        }

    }

    public static class DescribeAccountAttributesResponseBodyAccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> accountAttributeItem;

        public static DescribeAccountAttributesResponseBodyAccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseBodyAccountAttributeItems self = new DescribeAccountAttributesResponseBodyAccountAttributeItems();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseBodyAccountAttributeItems setAccountAttributeItem(java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> accountAttributeItem) {
            this.accountAttributeItem = accountAttributeItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseBodyAccountAttributeItemsAccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

    }

}
