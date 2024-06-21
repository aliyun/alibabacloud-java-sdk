// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7781D4A-2818-41E7-B7BB-79D809E9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the monitoring task.</p>
     */
    @NameInMap("TraceApps")
    public java.util.List<SearchTraceAppByNameResponseBodyTraceApps> traceApps;

    public static SearchTraceAppByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameResponseBody self = new SearchTraceAppByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTraceAppByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTraceAppByNameResponseBody setTraceApps(java.util.List<SearchTraceAppByNameResponseBodyTraceApps> traceApps) {
        this.traceApps = traceApps;
        return this;
    }
    public java.util.List<SearchTraceAppByNameResponseBodyTraceApps> getTraceApps() {
        return this.traceApps;
    }

    public static class SearchTraceAppByNameResponseBodyTraceAppsTags extends TeaModel {
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

        public static SearchTraceAppByNameResponseBodyTraceAppsTags build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByNameResponseBodyTraceAppsTags self = new SearchTraceAppByNameResponseBodyTraceAppsTags();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByNameResponseBodyTraceAppsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTraceAppByNameResponseBodyTraceAppsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchTraceAppByNameResponseBodyTraceApps extends TeaModel {
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
         * <p>1593486786000</p>
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
         * <p>a5f9bdeb-2627-4dbe-9247-****</p>
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
         * <p>The ID of the resource group.</p>
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
        public java.util.List<SearchTraceAppByNameResponseBodyTraceAppsTags> tags;

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
         * <p>1593486786000</p>
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

        public static SearchTraceAppByNameResponseBodyTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByNameResponseBodyTraceApps self = new SearchTraceAppByNameResponseBodyTraceApps();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByNameResponseBodyTraceApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setTags(java.util.List<SearchTraceAppByNameResponseBodyTraceAppsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<SearchTraceAppByNameResponseBodyTraceAppsTags> getTags() {
            return this.tags;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
