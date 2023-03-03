// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>Log on to the **ARMS console**. In the left-side navigation pane, choose **Browser Monitoring** > **Browser Monitoring**. On the Browser Monitoring page, click the name of an application. The URL in the browser address bar contains the pid of this application in the format of `pid=xxx`. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is `xxx%4074xxx`, you must replace **%40** with the at sign (@). The actual PID is `xxx@74xxx`.</p>
     */
    @NameInMap("RetcodeAppId")
    public String retcodeAppId;

    /**
     * <p>The name of the application that is monitored by Browser Monitoring.</p>
     */
    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    /**
     * <p>The tags.</p>
     */
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
