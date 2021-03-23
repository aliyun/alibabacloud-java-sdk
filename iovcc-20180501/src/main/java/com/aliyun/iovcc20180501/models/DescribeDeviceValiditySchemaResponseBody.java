// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceValiditySchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ItemList")
    public java.util.List<DescribeDeviceValiditySchemaResponseBodyItemList> itemList;

    public static DescribeDeviceValiditySchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceValiditySchemaResponseBody self = new DescribeDeviceValiditySchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceValiditySchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceValiditySchemaResponseBody setItemList(java.util.List<DescribeDeviceValiditySchemaResponseBodyItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<DescribeDeviceValiditySchemaResponseBodyItemList> getItemList() {
        return this.itemList;
    }

    public static class DescribeDeviceValiditySchemaResponseBodyItemList extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Type")
        public String type;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Required")
        public String required;

        @NameInMap("Maximum")
        public Float maximum;

        @NameInMap("Minimum")
        public Float minimum;

        @NameInMap("ExclusiveMaximum")
        public Boolean exclusiveMaximum;

        @NameInMap("ExclusiveMinimum")
        public Boolean exclusiveMinimum;

        @NameInMap("EnumListStr")
        public String enumListStr;

        @NameInMap("MaxLength")
        public Integer maxLength;

        @NameInMap("MinLength")
        public Integer minLength;

        public static DescribeDeviceValiditySchemaResponseBodyItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceValiditySchemaResponseBodyItemList self = new DescribeDeviceValiditySchemaResponseBodyItemList();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setRequired(String required) {
            this.required = required;
            return this;
        }
        public String getRequired() {
            return this.required;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setMaximum(Float maximum) {
            this.maximum = maximum;
            return this;
        }
        public Float getMaximum() {
            return this.maximum;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setMinimum(Float minimum) {
            this.minimum = minimum;
            return this;
        }
        public Float getMinimum() {
            return this.minimum;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setExclusiveMaximum(Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }
        public Boolean getExclusiveMaximum() {
            return this.exclusiveMaximum;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setExclusiveMinimum(Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }
        public Boolean getExclusiveMinimum() {
            return this.exclusiveMinimum;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setEnumListStr(String enumListStr) {
            this.enumListStr = enumListStr;
            return this;
        }
        public String getEnumListStr() {
            return this.enumListStr;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public DescribeDeviceValiditySchemaResponseBodyItemList setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

    }

}
