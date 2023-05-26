// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceAppResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the array object.</p>
     */
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
        /**
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The timestamp generated when the task was created.</p>
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
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The region ID.</p>
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
         * <p>*   `true`: yes</p>
         * <p>*   `false`: no</p>
         */
        @NameInMap("Show")
        public Boolean show;

        /**
         * <p>The source of the application.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>A list of key-value pairs.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTraceAppResponseBodyTraceAppTags> tags;

        /**
         * <p>The type of the monitoring task. Valid values:</p>
         * <br>
         * <p>*   `TRACE`: Application Monitoring</p>
         * <p>*   `RETCODE`: Browser Monitoring</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The timestamp generated when the task information was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The user ID.</p>
         */
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
