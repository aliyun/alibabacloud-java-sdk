// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RetcodeAppId")
    public String retcodeAppId;

    // The name of the application that is monitored by Browser Monitoring.
    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    @NameInMap("Tags")
    public java.util.List<SearchRetcodeAppByPageRequestTags> tags;

    public static SearchRetcodeAppByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageRequest self = new SearchRetcodeAppByPageRequest();
        return TeaModel.build(map, self);
    }

    public SearchRetcodeAppByPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchRetcodeAppByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchRetcodeAppByPageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchRetcodeAppByPageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SearchRetcodeAppByPageRequest setRetcodeAppId(String retcodeAppId) {
        this.retcodeAppId = retcodeAppId;
        return this;
    }
    public String getRetcodeAppId() {
        return this.retcodeAppId;
    }

    public SearchRetcodeAppByPageRequest setRetcodeAppName(String retcodeAppName) {
        this.retcodeAppName = retcodeAppName;
        return this;
    }
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    public SearchRetcodeAppByPageRequest setTags(java.util.List<SearchRetcodeAppByPageRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchRetcodeAppByPageRequestTags> getTags() {
        return this.tags;
    }

    public static class SearchRetcodeAppByPageRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchRetcodeAppByPageRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageRequestTags self = new SearchRetcodeAppByPageRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchRetcodeAppByPageRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
