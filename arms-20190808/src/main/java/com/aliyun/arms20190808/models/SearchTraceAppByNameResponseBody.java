// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the application monitoring job.
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

    public static class SearchTraceAppByNameResponseBodyTraceApps extends TeaModel {
        // The ID of the application.
        @NameInMap("AppId")
        public Long appId;

        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The timestamp when the application was created.
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

        // Indicates whether the application is displayed in the Application Real-Time Monitoring Service (ARMS) console. Valid values:
        // 
        // *   `true`: The application is displayed in the ARMS console.
        // *   `false`: The application is not displayed in the ARMS console.
        @NameInMap("Show")
        public Boolean show;

        // The type of the monitoring job. Valid values:
        // 
        // *   `TRACE`: application monitoring
        // *   `RETCODE`: frontend monitoring
        @NameInMap("Type")
        public String type;

        // The timestamp when the application was updated.
        @NameInMap("UpdateTime")
        public Long updateTime;

        // The ID of the user.
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

        public SearchTraceAppByNameResponseBodyTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
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
