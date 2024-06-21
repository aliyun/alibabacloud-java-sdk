// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can obtain the resource group ID in the <strong>Resource Management</strong> console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the application.</p>
     * <p>Log on to the <strong>ARMS console</strong>. In the left-side navigation pane, choose <strong>Browser Monitoring</strong> &gt; <strong>Browser Monitoring</strong>. On the Browser Monitoring page, click the name of an application. The URL in the browser address bar contains the pid of this application in the format of <code>pid=xxx</code>. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is <code>xxx%4074xxx</code>, you must replace <strong>%40</strong> with the at sign (@). The actual PID is <code>xxx@74xxx</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>eb4zdose6v@9781be0f44d****</p>
     */
    @NameInMap("RetcodeAppId")
    public String retcodeAppId;

    /**
     * <p>The name of the application that is monitored by Browser Monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p>App1</p>
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
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
