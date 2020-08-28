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

    }

    public static class DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues extends TeaModel {
        @NameInMap("ValueItem")
        @Validation(required = true)
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValuesValueItem> valueItem;

        public static DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues self = new DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItemAttributeValues();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeAccountAttributesResponseAccountAttributeItems extends TeaModel {
        @NameInMap("AccountAttributeItem")
        @Validation(required = true)
        public java.util.List<DescribeAccountAttributesResponseAccountAttributeItemsAccountAttributeItem> accountAttributeItem;

        public static DescribeAccountAttributesResponseAccountAttributeItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAttributesResponseAccountAttributeItems self = new DescribeAccountAttributesResponseAccountAttributeItems();
            return TeaModel.build(map, self);
        }

    }

}
