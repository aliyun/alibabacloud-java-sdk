// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceFilterAttributesResponseBody extends TeaModel {
    @NameInMap("FilterAttributes")
    public FilterAttributes filterAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceFilterAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceFilterAttributesResponseBody self = new DescribeResourceFilterAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceFilterAttributesResponseBody setFilterAttributes(FilterAttributes filterAttributes) {
        this.filterAttributes = filterAttributes;
        return this;
    }
    public FilterAttributes getFilterAttributes() {
        return this.filterAttributes;
    }

    public DescribeResourceFilterAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SupportOperations extends TeaModel {
        @NameInMap("SupportOperation")
        public java.util.List<String> supportOperation;

        public static SupportOperations build(java.util.Map<String, ?> map) throws Exception {
            SupportOperations self = new SupportOperations();
            return TeaModel.build(map, self);
        }

        public SupportOperations setSupportOperation(java.util.List<String> supportOperation) {
            this.supportOperation = supportOperation;
            return this;
        }
        public java.util.List<String> getSupportOperation() {
            return this.supportOperation;
        }

    }

    public static class Values extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        public static Values build(java.util.Map<String, ?> map) throws Exception {
            Values self = new Values();
            return TeaModel.build(map, self);
        }

        public Values setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class FilterAttribute extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("SupportOperations")
        public SupportOperations supportOperations;

        @NameInMap("Type")
        public String type;

        @NameInMap("Values")
        public Values values;

        public static FilterAttribute build(java.util.Map<String, ?> map) throws Exception {
            FilterAttribute self = new FilterAttribute();
            return TeaModel.build(map, self);
        }

        public FilterAttribute setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FilterAttribute setSupportOperations(SupportOperations supportOperations) {
            this.supportOperations = supportOperations;
            return this;
        }
        public SupportOperations getSupportOperations() {
            return this.supportOperations;
        }

        public FilterAttribute setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public FilterAttribute setValues(Values values) {
            this.values = values;
            return this;
        }
        public Values getValues() {
            return this.values;
        }

    }

    public static class FilterAttributes extends TeaModel {
        @NameInMap("FilterAttribute")
        public java.util.List<FilterAttribute> filterAttribute;

        public static FilterAttributes build(java.util.Map<String, ?> map) throws Exception {
            FilterAttributes self = new FilterAttributes();
            return TeaModel.build(map, self);
        }

        public FilterAttributes setFilterAttribute(java.util.List<FilterAttribute> filterAttribute) {
            this.filterAttribute = filterAttribute;
            return this;
        }
        public java.util.List<FilterAttribute> getFilterAttribute() {
            return this.filterAttribute;
        }

    }

}
