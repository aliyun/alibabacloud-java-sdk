// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StopScheduledPreloadExecutionResponseBody extends TeaModel {
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

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SliceLen")
    public Integer sliceLen;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static StopScheduledPreloadExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopScheduledPreloadExecutionResponseBody self = new StopScheduledPreloadExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopScheduledPreloadExecutionResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public StopScheduledPreloadExecutionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public StopScheduledPreloadExecutionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopScheduledPreloadExecutionResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public StopScheduledPreloadExecutionResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StopScheduledPreloadExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopScheduledPreloadExecutionResponseBody setSliceLen(Integer sliceLen) {
        this.sliceLen = sliceLen;
        return this;
    }
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    public StopScheduledPreloadExecutionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public StopScheduledPreloadExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
