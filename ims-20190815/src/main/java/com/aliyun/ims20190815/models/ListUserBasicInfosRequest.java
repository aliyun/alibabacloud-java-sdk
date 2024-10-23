// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosRequest extends TeaModel {
    /**
     * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be <code>true</code>.</p>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag value.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListUserBasicInfosRequestTag> tag;

    public static ListUserBasicInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosRequest self = new ListUserBasicInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUserBasicInfosRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListUserBasicInfosRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserBasicInfosRequest setTag(java.util.List<ListUserBasicInfosRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListUserBasicInfosRequestTag> getTag() {
        return this.tag;
    }

    public static class ListUserBasicInfosRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListUserBasicInfosRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosRequestTag self = new ListUserBasicInfosRequestTag();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListUserBasicInfosRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
