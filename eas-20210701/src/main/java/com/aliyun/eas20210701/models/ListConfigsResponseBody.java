// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListConfigsResponseBody extends TeaModel {
    /**
     * <p>The list of dynamic parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;: &quot;rate_limit&quot;, &quot;Value&quot;: &quot;{\&quot;limit\&quot;: 100}&quot;, &quot;CreatedAt&quot;: &quot;2024-01-15T10:30:00Z&quot;, &quot;UpdatedAt&quot;: &quot;2024-01-15T10:30:00Z&quot;}]</p>
     */
    @NameInMap("Configs")
    public java.util.List<ListConfigsResponseBodyConfigs> configs;

    /**
     * <p>Indicates if more entries are available. <code>true</code> if more entries exist; otherwise, <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasMore")
    public Boolean hasMore;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-service</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The total number of entries found.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The configuration type.</p>
     * 
     * <strong>example:</strong>
     * <p>Service</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponseBody self = new ListConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponseBody setConfigs(java.util.List<ListConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<ListConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public ListConfigsResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListConfigsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListConfigsResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListConfigsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListConfigsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListConfigsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The time when the dynamic parameter was created, in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T10:00:00Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The name of the dynamic parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>rate_limit</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time when the dynamic parameter was last updated, in UTC and ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T10:00:00Z</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        /**
         * <p>The value of the dynamic parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListConfigsResponseBodyConfigs self = new ListConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public ListConfigsResponseBodyConfigs setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListConfigsResponseBodyConfigs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConfigsResponseBodyConfigs setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListConfigsResponseBodyConfigs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
