// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: `1`.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: `10`.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<SearchTraceAppByPageRequestTags> tags;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("TraceAppName")
    public String traceAppName;

    public static SearchTraceAppByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageRequest self = new SearchTraceAppByPageRequest();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTraceAppByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTraceAppByPageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTraceAppByPageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SearchTraceAppByPageRequest setTags(java.util.List<SearchTraceAppByPageRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchTraceAppByPageRequestTags> getTags() {
        return this.tags;
    }

    public SearchTraceAppByPageRequest setTraceAppName(String traceAppName) {
        this.traceAppName = traceAppName;
        return this;
    }
    public String getTraceAppName() {
        return this.traceAppName;
    }

    public static class SearchTraceAppByPageRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchTraceAppByPageRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageRequestTags self = new SearchTraceAppByPageRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTraceAppByPageRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
