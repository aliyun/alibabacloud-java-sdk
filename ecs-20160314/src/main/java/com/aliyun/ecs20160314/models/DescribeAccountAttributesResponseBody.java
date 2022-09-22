// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesResponseBody extends TeaModel {
    @NameInMap("AccountAttributeItems")
    public AccountAttributeItems accountAttributeItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesResponseBody self = new DescribeAccountAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesResponseBody setAccountAttributeItems(AccountAttributeItems accountAttributeItems) {
        this.accountAttributeItems = accountAttributeItems;
        return this;
    }
    public AccountAttributeItems getAccountAttributeItems() {
        return this.accountAttributeItems;
    }

    public DescribeAccountAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ValueItem extends TeaModel {
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

        public static ValueItem build(java.util.Map<String, ?> map) throws Exception {
            ValueItem self = new ValueItem();
            return TeaModel.build(map, self);
        }

        public ValueItem setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ValueItem setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public ValueItem setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ValueItem setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ValueItem setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ValueItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ValueItem setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class AttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        public java.util.List<ValueItem> valueItem;

        public static AttributeValues build(java.util.Map<String, ?> map) throws Exception {
            AttributeValues self = new AttributeValues();
            return TeaModel.build(map, self);
        }

        public AttributeValues setValueItem(java.util.List<ValueItem> valueItem) {
            this.valueItem = valueItem;
            return this;
        }
        public java.util.List<ValueItem> getValueItem() {
            return this.valueItem;
        }

    }

    public static class AccountAttributeItem extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValues")
        public AttributeValues attributeValues;

        public static AccountAttributeItem build(java.util.Map<String, ?> map) throws Exception {
            AccountAttributeItem self = new AccountAttributeItem();
            return TeaModel.build(map, self);
        }

        public AccountAttributeItem setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public AccountAttributeItem setAttributeValues(AttributeValues attributeValues) {
            this.attributeValues = attributeValues;
            return this;
        }
        public AttributeValues getAttributeValues() {
            return this.attributeValues;
        }

    }

    public static class AccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        public java.util.List<AccountAttributeItem> accountAttributeItem;

        public static AccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            AccountAttributeItems self = new AccountAttributeItems();
            return TeaModel.build(map, self);
        }

        public AccountAttributeItems setAccountAttributeItem(java.util.List<AccountAttributeItem> accountAttributeItem) {
            this.accountAttributeItem = accountAttributeItem;
            return this;
        }
        public java.util.List<AccountAttributeItem> getAccountAttributeItem() {
            return this.accountAttributeItem;
        }

    }

}
