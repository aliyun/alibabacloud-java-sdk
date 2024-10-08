// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateScheduledPreloadExecutionsResponseBody extends TeaModel {
    @NameInMap("FailedExecutions")
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> failedExecutions;

    @NameInMap("FailedMessages")
    public java.util.List<String> failedMessages;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessCount")
    public Integer successCount;

    @NameInMap("SuccessExecutions")
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> successExecutions;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CreateScheduledPreloadExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPreloadExecutionsResponseBody self = new CreateScheduledPreloadExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPreloadExecutionsResponseBody setFailedExecutions(java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> failedExecutions) {
        this.failedExecutions = failedExecutions;
        return this;
    }
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodyFailedExecutions> getFailedExecutions() {
        return this.failedExecutions;
    }

    public CreateScheduledPreloadExecutionsResponseBody setFailedMessages(java.util.List<String> failedMessages) {
        this.failedMessages = failedMessages;
        return this;
    }
    public java.util.List<String> getFailedMessages() {
        return this.failedMessages;
    }

    public CreateScheduledPreloadExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduledPreloadExecutionsResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public CreateScheduledPreloadExecutionsResponseBody setSuccessExecutions(java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> successExecutions) {
        this.successExecutions = successExecutions;
        return this;
    }
    public java.util.List<CreateScheduledPreloadExecutionsResponseBodySuccessExecutions> getSuccessExecutions() {
        return this.successExecutions;
    }

    public CreateScheduledPreloadExecutionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CreateScheduledPreloadExecutionsResponseBodyFailedExecutions extends TeaModel {
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

        public static CreateScheduledPreloadExecutionsResponseBodyFailedExecutions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledPreloadExecutionsResponseBodyFailedExecutions self = new CreateScheduledPreloadExecutionsResponseBodyFailedExecutions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodyFailedExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateScheduledPreloadExecutionsResponseBodySuccessExecutions extends TeaModel {
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

        public static CreateScheduledPreloadExecutionsResponseBodySuccessExecutions build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduledPreloadExecutionsResponseBodySuccessExecutions self = new CreateScheduledPreloadExecutionsResponseBodySuccessExecutions();
            return TeaModel.build(map, self);
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setSliceLen(Integer sliceLen) {
            this.sliceLen = sliceLen;
            return this;
        }
        public Integer getSliceLen() {
            return this.sliceLen;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateScheduledPreloadExecutionsResponseBodySuccessExecutions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
