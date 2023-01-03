// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsResponseBody extends TeaModel {
    // The HTTP status code returned for the request. Valid values:
    // 
    // *   `2XX`: The request is successful.
    // *   `3XX`: A redirection message is returned.
    // *   `4XX`: The request is invalid.
    // *   `5XX`: A server error occurs.
    @NameInMap("Code")
    public Integer code;

    // The error message returned when the request parameters are invalid.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the call is successful. Valid values:
    // 
    // *   `true`: The call is successful.
    // *   `false`: The call fails.
    @NameInMap("Success")
    public Boolean success;

    // The list of application monitoring tasks.
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
        @NameInMap("Key")
        public String key;

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
        // The ID of the application.
        @NameInMap("AppId")
        public Long appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The timestamp when the application was created. Unit: milliseconds.
        @NameInMap("CreateTime")
        public Long createTime;

        // The tag of the application.
        @NameInMap("Labels")
        public java.util.List<String> labels;

        // The process identifier (PID) of the application.
        @NameInMap("Pid")
        public String pid;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:
        // 
        // *   `true`: The application is displayed in the ARMS console.
        // *   `false`: The application is not displayed in the ARMS console.
        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Source")
        public String source;

        @NameInMap("Tags")
        public java.util.List<ListTraceAppsResponseBodyTraceAppsTags> tags;

        // The type of the monitoring task. Valid values:
        // 
        // *   `TRACE`: application monitoring
        // *   `RETCODE`: frontend monitoring
        @NameInMap("Type")
        public String type;

        // The timestamp when the task was updated. Unit: milliseconds.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the user.
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
