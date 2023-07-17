// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListTraceAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public static class ListTraceAppsResponseBodyTraceApps extends TeaModel {
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

        public ListTraceAppsResponseBodyTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
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
