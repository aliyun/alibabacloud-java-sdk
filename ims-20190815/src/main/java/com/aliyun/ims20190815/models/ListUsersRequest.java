// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries per page. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be true.</p>
     * <p>Valid values: 1 to 1000. Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags. A maximum number of 20 tags are supported.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListUsersRequestTag> tag;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public ListUsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUsersRequest setTag(java.util.List<ListUsersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListUsersRequestTag> getTag() {
        return this.tag;
    }

    public static class ListUsersRequestTag extends TeaModel {
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

        public static ListUsersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListUsersRequestTag self = new ListUsersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListUsersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListUsersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
