// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageResponseBody extends TeaModel {
    /**
     * <p>The returned page information.</p>
     */
    @NameInMap("PageBean")
    public SearchRetcodeAppByPageResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchRetcodeAppByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageResponseBody self = new SearchRetcodeAppByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchRetcodeAppByPageResponseBody setPageBean(SearchRetcodeAppByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchRetcodeAppByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchRetcodeAppByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags extends TeaModel {
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

        public static SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags self = new SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps extends TeaModel {
        /**
         * <p>The ID of the application. The parameter is an auto-increment parameter.</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The alias of the application.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The PID of the application.</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the application. Valid values:</p>
         * <br>
         * <p>*   `web`: web application</p>
         * <p>*   `weex`: Weex mobile app</p>
         * <p>*   `mini_dd`: DingTalk mini program</p>
         * <p>*   `mini_alipay`: Alipay mini program</p>
         * <p>*   `mini_wx`: WeChat mini program</p>
         * <p>*   `mini_common`: mini program on other platforms</p>
         */
        @NameInMap("RetcodeAppType")
        public String retcodeAppType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags> tags;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <br>
         * <p>*   `TRACE`: Application Monitoring</p>
         * <p>*   `RETCODE`: Browser Monitoring</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps self = new SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setRetcodeAppType(String retcodeAppType) {
            this.retcodeAppType = retcodeAppType;
            return this;
        }
        public String getRetcodeAppType() {
            return this.retcodeAppType;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setTags(java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeAppsTags> getTags() {
            return this.tags;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchRetcodeAppByPageResponseBodyPageBean extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The Browser Monitoring tasks that are returned.</p>
         */
        @NameInMap("RetcodeApps")
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> retcodeApps;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SearchRetcodeAppByPageResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponseBodyPageBean self = new SearchRetcodeAppByPageResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setRetcodeApps(java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> getRetcodeApps() {
            return this.retcodeApps;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
