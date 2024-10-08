// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListScheduledPreloadExecutionsResponseBody extends TeaModel {
    @NameInMap("Executions")
    public java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> executions;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListScheduledPreloadExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPreloadExecutionsResponseBody self = new ListScheduledPreloadExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledPreloadExecutionsResponseBody setExecutions(java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> executions) {
        this.executions = executions;
        return this;
    }
    public java.util.List<ListScheduledPreloadExecutionsResponseBodyExecutions> getExecutions() {
        return this.executions;
    }

    public ListScheduledPreloadExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledPreloadExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListScheduledPreloadExecutionsResponseBodyExecutions extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SliceLen")
        public Integer sliceLen;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static ListScheduledPreloadExecutionsResponseBodyExecutions build(java.util.Map<String, ?> map) throws Exception {
            ListScheduledPreloadExecutionsResponseBodyExecutions self = new ListScheduledPreloadExecutionsResponseBodyExecutions();
            return TeaModel.build(map, self);
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListScheduledPreloadExecutionsResponseBodyExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
