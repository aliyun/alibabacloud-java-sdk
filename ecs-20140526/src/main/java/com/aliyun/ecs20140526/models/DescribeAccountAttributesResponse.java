// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccountAttributeItems")
    @Validation(required = true)
    public DescribeAccountAttributesResponseAccountAttributeItems accountAttributeItems;

    public static DescribeAccountAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponse self = new DescribeAccountAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountAttributesResponse setAccountAttributeItems(DescribeAccountAttributesResponseAccountAttributeItems accountAttributeItems) {
        this.accountAttributeItems = accountAttributeItems;
        return this;
    }
    public DescribeAccountAttributesResponseAccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public static class DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("DiskCategory")
        @Validation(required = true)
        public String diskCategory;

        public static DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem self = new DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

    }

    public static class DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        @Validation(required = true)
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem;

        public static DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues self = new DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues setValueItem(java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem) {
            this.valueItem = valueItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> getValueItem() {
            return this.valueItem;
        }

    }

    public static class DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem extends TeaModel {
        @NameInMap("AttributeName")
        @Validation(required = true)
        public String attributeName;

        @NameInMap("AttributeValues")
        @Validation(required = true)
        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues;

        public static DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem self = new DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem setAttributeValues(DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues getAttributeValues() {
            return this.attributeValues;
        }

    }

    public static class DescribeAccountAttributesResponseAccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        @Validation(required = true)
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem> accountAttributeItem;

        public static DescribeAccountAttributesResponseAccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItems self = new DescribeAccountAttributesResponseAccountAttributeItems();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAttributesResponseAccountAttributeItems setAccountAttributeItem(java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem> accountAttributeItem) {
            this.accountAttributeItem = accountAttributeItem;
            return this;
        }
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

    }

}
