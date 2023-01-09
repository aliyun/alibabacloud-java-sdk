// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourceFilterAttributesResponseBody extends TeaModel {
    @NameInMap("FilterAttributes")
    public DescribeResourceFilterAttributesResponseBodyFilterAttributes filterAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceFilterAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceFilterAttributesResponseBody self = new DescribeResourceFilterAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceFilterAttributesResponseBody setFilterAttributes(DescribeResourceFilterAttributesResponseBodyFilterAttributes filterAttributes) {
        this.filterAttributes = filterAttributes;
        return this;
    }
    public DescribeResourceFilterAttributesResponseBodyFilterAttributes getFilterAttributes() {
        return this.filterAttributes;
    }

    public DescribeResourceFilterAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations extends TeaModel {
        @NameInMap("SupportOperation")
        public java.util.List<String> supportOperation;

        public static DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations self = new DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations();
            return TeaModel.build(map, self);
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations setSupportOperation(java.util.List<String> supportOperation) {
            this.supportOperation = supportOperation;
            return this;
        }
        public java.util.List<String> getSupportOperation() {
            return this.supportOperation;
        }

    }

    public static class DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues self = new DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues();
            return TeaModel.build(map, self);
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("SupportOperations")
        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations supportOperations;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues values;

        public static DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute self = new DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute setSupportOperations(DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations supportOperations) {
            this.supportOperations = supportOperations;
            return this;
        }
        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeSupportOperations getSupportOperations() {
            return this.supportOperations;
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute setValues(DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues values) {
            this.values = values;
            return this;
        }
        public DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttributeValues getValues() {
            return this.values;
        }

    }

    public static class DescribeResourceFilterAttributesResponseBodyFilterAttributes extends TeaModel {
        @NameInMap("FilterAttribute")
        public java.util.List<DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute> filterAttribute;

        public static DescribeResourceFilterAttributesResponseBodyFilterAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceFilterAttributesResponseBodyFilterAttributes self = new DescribeResourceFilterAttributesResponseBodyFilterAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeResourceFilterAttributesResponseBodyFilterAttributes setFilterAttribute(java.util.List<DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute> filterAttribute) {
            this.filterAttribute = filterAttribute;
            return this;
        }
        public java.util.List<DescribeResourceFilterAttributesResponseBodyFilterAttributesFilterAttribute> getFilterAttribute() {
            return this.filterAttribute;
        }

    }

}
