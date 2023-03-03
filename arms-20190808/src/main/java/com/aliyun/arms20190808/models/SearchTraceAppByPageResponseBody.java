// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponseBody extends TeaModel {
    /**
     * <p>The returned page information.</p>
     */
    @NameInMap("PageBean")
    public SearchTraceAppByPageResponseBodyPageBean pageBean;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchTraceAppByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageResponseBody self = new SearchTraceAppByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByPageResponseBody setPageBean(SearchTraceAppByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchTraceAppByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public SearchTraceAppByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags self = new SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchTraceAppByPageResponseBodyPageBeanTraceApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The timestamp generated when the monitoring task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The list of application aliases.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The process identifier (PID) of the application.</p>
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
         * <p>Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:</p>
         * <br>
         * <p>*   `true`: The application is displayed in the ARMS console.</p>
         * <p>*   `false`: The application is not displayed in the ARMS console.</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags> tags;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <br>
         * <p>*   `TRACE`: application monitoring</p>
         * <p>*   `RETCODE`: browser monitoring</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The timestamp generated when the monitoring task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static SearchTraceAppByPageResponseBodyPageBeanTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponseBodyPageBeanTraceApps self = new SearchTraceAppByPageResponseBodyPageBeanTraceApps();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setTags(java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags> getTags() {
            return this.tags;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchTraceAppByPageResponseBodyPageBeanTraceApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchTraceAppByPageResponseBodyPageBean extends TeaModel {
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
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The information about the task that monitors the application.</p>
         */
        @NameInMap("TraceApps")
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> traceApps;

        public static SearchTraceAppByPageResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponseBodyPageBean self = new SearchTraceAppByPageResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByPageResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchTraceAppByPageResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchTraceAppByPageResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchTraceAppByPageResponseBodyPageBean setTraceApps(java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> traceApps) {
            this.traceApps = traceApps;
            return this;
        }
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceApps> getTraceApps() {
            return this.traceApps;
        }

    }

}
