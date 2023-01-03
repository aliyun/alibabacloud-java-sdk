// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageRequest extends TeaModel {
    // The number of the page to return. Default value: `1`.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Default value: `10`.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<SearchTraceAppByPageRequestTags> tags;

    // The name of the application.
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
        @NameInMap("Key")
        public String key;

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
