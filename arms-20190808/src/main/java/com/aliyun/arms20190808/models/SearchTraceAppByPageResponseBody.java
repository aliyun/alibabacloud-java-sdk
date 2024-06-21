// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponseBody extends TeaModel {
    /**
     * <p>The information about the array object.</p>
     */
    @NameInMap("PageBean")
    public SearchTraceAppByPageResponseBodyPageBean pageBean;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B446DF2-3DDD-4B5B-8E3F-D5225120****</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The timestamp generated when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1531291867000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The aliases of the application.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

        /**
         * <p>The process identifier (PID) of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>atc889zkcf@d8deedfa9bf****</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes</li>
         * <li><code>false</code>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<SearchTraceAppByPageResponseBodyPageBeanTraceAppsTags> tags;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <ul>
         * <li><code>TRACE</code>: Application Monitoring</li>
         * <li><code>RETCODE</code>: Browser Monitoring</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TRACE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The timestamp generated when the task information was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1531291867000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>113197164949****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The information about the monitoring task.</p>
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
