// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Type")
        public String type;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Show")
        public Boolean show;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        public static SearchTraceAppByNameResponseBodyTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByNameResponseBodyTraceApps self = new SearchTraceAppByNameResponseBodyTraceApps();
            return TeaModel.build(map, self);
        }

        public SearchTraceAppByNameResponseBodyTraceApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchTraceAppByNameResponseBodyTraceApps setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

    }

}
