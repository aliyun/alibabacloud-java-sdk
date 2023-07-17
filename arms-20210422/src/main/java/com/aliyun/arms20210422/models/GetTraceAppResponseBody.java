// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class GetTraceAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class GetTraceAppResponseBodyTraceApp extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public Long updateTime;

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

        public GetTraceAppResponseBodyTraceApp setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
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
