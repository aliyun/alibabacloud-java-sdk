// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ListPropertyValueResponseBody extends TeaModel {
    /**
     * <p>Details about property values.</p>
     */
    @NameInMap("PropertyValueInfos")
    public java.util.List<ListPropertyValueResponseBodyPropertyValueInfos> propertyValueInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C52013A5-3422-5D1F-B22C-A57110972AD9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPropertyValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPropertyValueResponseBody self = new ListPropertyValueResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPropertyValueResponseBody setPropertyValueInfos(java.util.List<ListPropertyValueResponseBodyPropertyValueInfos> propertyValueInfos) {
        this.propertyValueInfos = propertyValueInfos;
        return this;
    }
    public java.util.List<ListPropertyValueResponseBodyPropertyValueInfos> getPropertyValueInfos() {
        return this.propertyValueInfos;
    }

    public ListPropertyValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPropertyValueResponseBodyPropertyValueInfos extends TeaModel {
        /**
         * <p>The value of the property.</p>
         * 
         * <strong>example:</strong>
         * <p>HR</p>
         */
        @NameInMap("PropertyValue")
        public String propertyValue;

        /**
         * <p>The ID of the property value.</p>
         * 
         * <strong>example:</strong>
         * <p>978</p>
         */
        @NameInMap("PropertyValueId")
        public Long propertyValueId;

        public static ListPropertyValueResponseBodyPropertyValueInfos build(java.util.Map<String, ?> map) throws Exception {
            ListPropertyValueResponseBodyPropertyValueInfos self = new ListPropertyValueResponseBodyPropertyValueInfos();
            return TeaModel.build(map, self);
        }

        public ListPropertyValueResponseBodyPropertyValueInfos setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public ListPropertyValueResponseBodyPropertyValueInfos setPropertyValueId(Long propertyValueId) {
            this.propertyValueId = propertyValueId;
            return this;
        }
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

    }

}
