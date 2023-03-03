// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <br>
     * <p>*   `2XX: The request is successful.`</p>
     * <p>*   `3XX: A redirection message is returned.`</p>
     * <p>*   `4XX: The request is invalid.`</p>
     * <p>*   `5XX: A server error occurs.`</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The error message returned if the request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of application monitoring tasks.</p>
     */
    @NameInMap("TraceApps")
    public java.util.List<ListTraceAppsResponseBodyTraceApps> traceApps;

    public static ListTraceAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsResponseBody self = new ListTraceAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTraceAppsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTraceAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTraceAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTraceAppsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTraceAppsResponseBody setTraceApps(java.util.List<ListTraceAppsResponseBodyTraceApps> traceApps) {
        this.traceApps = traceApps;
        return this;
    }
    public java.util.List<ListTraceAppsResponseBodyTraceApps> getTraceApps() {
        return this.traceApps;
    }

    public static class ListTraceAppsResponseBodyTraceAppsTags extends TeaModel {
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

        public static ListTraceAppsResponseBodyTraceAppsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTraceAppsResponseBodyTraceAppsTags self = new ListTraceAppsResponseBodyTraceAppsTags();
            return TeaModel.build(map, self);
        }

        public ListTraceAppsResponseBodyTraceAppsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTraceAppsResponseBodyTraceAppsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTraceAppsResponseBodyTraceApps extends TeaModel {
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
         * <p>The time when the monitoring task was created. The value is a timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The tags of the application.</p>
         */
        @NameInMap("Labels")
        public java.util.List<String> labels;

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
         * <p>Indicates whether the application was displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:</p>
         * <br>
         * <p>*   `true`: yes</p>
         * <p>*   `false`: no</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>The application source.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTraceAppsResponseBodyTraceAppsTags> tags;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <br>
         * <p>*   `TRACE`: Application Monitoring</p>
         * <p>*   `RETCODE`: Browser Monitoring</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The time when the monitoring task was updated. The value is a timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListTraceAppsResponseBodyTraceApps build(java.util.Map<String, ?> map) throws Exception {
            ListTraceAppsResponseBodyTraceApps self = new ListTraceAppsResponseBodyTraceApps();
            return TeaModel.build(map, self);
        }

        public ListTraceAppsResponseBodyTraceApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListTraceAppsResponseBodyTraceApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListTraceAppsResponseBodyTraceApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListTraceAppsResponseBodyTraceApps setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public ListTraceAppsResponseBodyTraceApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListTraceAppsResponseBodyTraceApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTraceAppsResponseBodyTraceApps setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTraceAppsResponseBodyTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public ListTraceAppsResponseBodyTraceApps setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListTraceAppsResponseBodyTraceApps setTags(java.util.List<ListTraceAppsResponseBodyTraceAppsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTraceAppsResponseBodyTraceAppsTags> getTags() {
            return this.tags;
        }

        public ListTraceAppsResponseBodyTraceApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTraceAppsResponseBodyTraceApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListTraceAppsResponseBodyTraceApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
