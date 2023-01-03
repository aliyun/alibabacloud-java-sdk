// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The struct returned.
    @NameInMap("TraceApp")
    public GetTraceAppResponseBodyTraceApp traceApp;

    public static GetTraceAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceAppResponseBody self = new GetTraceAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceAppResponseBody setTraceApp(GetTraceAppResponseBodyTraceApp traceApp) {
        this.traceApp = traceApp;
        return this;
    }
    public GetTraceAppResponseBodyTraceApp getTraceApp() {
        return this.traceApp;
    }

    public static class GetTraceAppResponseBodyTraceAppTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetTraceAppResponseBodyTraceAppTags build(java.util.Map<String, ?> map) throws Exception {
            GetTraceAppResponseBodyTraceAppTags self = new GetTraceAppResponseBodyTraceAppTags();
            return TeaModel.build(map, self);
        }

        public GetTraceAppResponseBodyTraceAppTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceAppResponseBodyTraceAppTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceAppResponseBodyTraceApp extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public Long appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The timestamp generated when the monitoring task was created.
        @NameInMap("CreateTime")
        public Long createTime;

        // The labels of the application.
        @NameInMap("Labels")
        public java.util.List<String> labels;

        // The PID of the application.
        @NameInMap("Pid")
        public String pid;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether the application was displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:
        // 
        // *   `true`: The application was displayed in the ARMS console.
        // *   `false`: The application was not displayed in the ARMS console.
        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Source")
        public String source;

        // The tags of the application.
        @NameInMap("Tags")
        public java.util.List<GetTraceAppResponseBodyTraceAppTags> tags;

        // The type of the monitoring task. Valid values:
        // 
        // *   `TRACE`: application monitoring
        // *   `RETCODE`: browser monitoring
        @NameInMap("Type")
        public String type;

        // The timestamp generated when the monitoring task was updated.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the user.
        @NameInMap("UserId")
        public String userId;

        public static GetTraceAppResponseBodyTraceApp build(java.util.Map<String, ?> map) throws Exception {
            GetTraceAppResponseBodyTraceApp self = new GetTraceAppResponseBodyTraceApp();
            return TeaModel.build(map, self);
        }

        public GetTraceAppResponseBodyTraceApp setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetTraceAppResponseBodyTraceApp setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetTraceAppResponseBodyTraceApp setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetTraceAppResponseBodyTraceApp setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public GetTraceAppResponseBodyTraceApp setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetTraceAppResponseBodyTraceApp setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTraceAppResponseBodyTraceApp setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetTraceAppResponseBodyTraceApp setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public GetTraceAppResponseBodyTraceApp setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTraceAppResponseBodyTraceApp setTags(java.util.List<GetTraceAppResponseBodyTraceAppTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTraceAppResponseBodyTraceAppTags> getTags() {
            return this.tags;
        }

        public GetTraceAppResponseBodyTraceApp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetTraceAppResponseBodyTraceApp setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetTraceAppResponseBodyTraceApp setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
