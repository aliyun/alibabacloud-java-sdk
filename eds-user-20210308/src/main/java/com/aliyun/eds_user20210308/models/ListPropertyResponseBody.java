// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ListPropertyResponseBody extends TeaModel {
    /**
     * <p>The information about the properties.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Properties")
    public java.util.List<ListPropertyResponseBodyProperties> properties;

    /**
     * <p>The ID of the property.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPropertyResponseBody self = new ListPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPropertyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPropertyResponseBody setProperties(java.util.List<ListPropertyResponseBodyProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<ListPropertyResponseBodyProperties> getProperties() {
        return this.properties;
    }

    public ListPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPropertyResponseBodyPropertiesPropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        public String propertyValue;

        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static ListPropertyResponseBodyPropertiesPropertyValues build(java.util.Map<String, ?> map) throws Exception {
            ListPropertyResponseBodyPropertiesPropertyValues self = new ListPropertyResponseBodyPropertiesPropertyValues();
            return TeaModel.build(map, self);
        }

        public ListPropertyResponseBodyPropertiesPropertyValues setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public ListPropertyResponseBodyPropertiesPropertyValues setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

    public static class ListPropertyResponseBodyProperties extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **ListProperty**.</p>
         */
        @NameInMap("PropertyId")
        public Long propertyId;

        /**
         * <p>Queries all user properties within an Alibaba Cloud account.</p>
         */
        @NameInMap("PropertyKey")
        public String propertyKey;

        /**
         * <p>ListProperty</p>
         */
        @NameInMap("PropertyValues")
        public java.util.List<ListPropertyResponseBodyPropertiesPropertyValues> propertyValues;

        public static ListPropertyResponseBodyProperties build(java.util.Map<String, ?> map) throws Exception {
            ListPropertyResponseBodyProperties self = new ListPropertyResponseBodyProperties();
            return TeaModel.build(map, self);
        }

        public ListPropertyResponseBodyProperties setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public ListPropertyResponseBodyProperties setPropertyKey(String propertyKey) {
            this.propertyKey = propertyKey;
            return this;
        }
        public String getPropertyKey() {
            return this.propertyKey;
        }

        public ListPropertyResponseBodyProperties setPropertyValues(java.util.List<ListPropertyResponseBodyPropertiesPropertyValues> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }
        public java.util.List<ListPropertyResponseBodyPropertiesPropertyValues> getPropertyValues() {
            return this.propertyValues;
        }

    }

}
