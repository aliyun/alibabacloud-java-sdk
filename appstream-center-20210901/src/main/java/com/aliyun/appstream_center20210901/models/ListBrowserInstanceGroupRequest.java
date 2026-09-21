// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserInstanceGroupRequest extends TeaModel {
    /**
     * <p>The browser group set ID for exact match queries of active members in the set.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("AppInstanceGroupSetId")
    public String appInstanceGroupSetId;

    /**
     * <p>Filters browser groups by business region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The cloud browser group ID for exact match queries.</p>
     * 
     * <strong>example:</strong>
     * <p>big-0c7loey7fzjq****</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    /**
     * <p>The browser group name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Office</p>
     */
    @NameInMap("BrowserInstanceGroupName")
    public String browserInstanceGroupName;

    /**
     * <p>Performs a contains match by browser group name or ID.</p>
     * 
     * <strong>example:</strong>
     * <p>Office</p>
     */
    @NameInMap("CloudBrowserName")
    public String cloudBrowserName;

    /**
     * <p>Excludes browser groups that are authorized to the specified user groups.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludedUserGroupIds")
    public java.util.List<String> excludedUserGroupIds;

    /**
     * <p>Filters browser groups by office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-843734****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The page number, starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by browser group status.</p>
     * <p><strong>Limit:</strong> Only one status value can be specified at a time.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tag filter parameters. This parameter is not supported in customer-facing scenarios. Do not specify this parameter.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListBrowserInstanceGroupRequestTag> tag;

    /**
     * <p>Filters by version of the browser.</p>
     * <ul>
     * <li><code>Basic</code>: Basic Edition.</li>
     * <li><code>Pro</code>: Premium Edition.</li>
     * </ul>
     * <p>Use <code>Pro</code> to query MAU browser groups.</p>
     * 
     * <strong>example:</strong>
     * <p>Pro</p>
     */
    @NameInMap("Tier")
    public String tier;

    /**
     * <p>Filters by authorized user group IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static ListBrowserInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserInstanceGroupRequest self = new ListBrowserInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListBrowserInstanceGroupRequest setAppInstanceGroupSetId(String appInstanceGroupSetId) {
        this.appInstanceGroupSetId = appInstanceGroupSetId;
        return this;
    }
    public String getAppInstanceGroupSetId() {
        return this.appInstanceGroupSetId;
    }

    public ListBrowserInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public ListBrowserInstanceGroupRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public ListBrowserInstanceGroupRequest setBrowserInstanceGroupName(String browserInstanceGroupName) {
        this.browserInstanceGroupName = browserInstanceGroupName;
        return this;
    }
    public String getBrowserInstanceGroupName() {
        return this.browserInstanceGroupName;
    }

    public ListBrowserInstanceGroupRequest setCloudBrowserName(String cloudBrowserName) {
        this.cloudBrowserName = cloudBrowserName;
        return this;
    }
    public String getCloudBrowserName() {
        return this.cloudBrowserName;
    }

    public ListBrowserInstanceGroupRequest setExcludedUserGroupIds(java.util.List<String> excludedUserGroupIds) {
        this.excludedUserGroupIds = excludedUserGroupIds;
        return this;
    }
    public java.util.List<String> getExcludedUserGroupIds() {
        return this.excludedUserGroupIds;
    }

    public ListBrowserInstanceGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ListBrowserInstanceGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserInstanceGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowserInstanceGroupRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListBrowserInstanceGroupRequest setTag(java.util.List<ListBrowserInstanceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListBrowserInstanceGroupRequestTag> getTag() {
        return this.tag;
    }

    public ListBrowserInstanceGroupRequest setTier(String tier) {
        this.tier = tier;
        return this;
    }
    public String getTier() {
        return this.tier;
    }

    public ListBrowserInstanceGroupRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public static class ListBrowserInstanceGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key. Do not specify this parameter in customer-facing scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Do not specify this parameter in customer-facing scenarios.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Value")
        public String value;

        public static ListBrowserInstanceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListBrowserInstanceGroupRequestTag self = new ListBrowserInstanceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public ListBrowserInstanceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBrowserInstanceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
