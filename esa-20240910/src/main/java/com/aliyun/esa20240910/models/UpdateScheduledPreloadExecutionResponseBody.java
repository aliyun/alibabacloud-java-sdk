// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateScheduledPreloadExecutionResponseBody extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15685865xxx14622</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The end time of the scheduled prefetch plan, in ISO 8601 format (such as 2024-01-01T00:00:00+Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T18:10:48.849+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The prefetch plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66599bd7397885b43804901c</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The execution interval between each batch of the scheduled prefetch plan, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The prefetch task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3af3621bccf3fe29e1a4</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A123425345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of URLs to prefetch per batch.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SliceLen")
    public Integer sliceLen;

    /**
     * <p>The start time of the scheduled prefetch plan, in ISO 8601 format (such as 2024-01-01T00:00:00+Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T17:10:48.849+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the scheduled prefetch plan. Valid values:</p>
     * <ul>
     * <li><strong>waiting</strong>: Waiting to be executed.</li>
     * <li><strong>running</strong>: Being executed.</li>
     * <li><strong>finished</strong>: Execution completed.</li>
     * <li><strong>failed</strong>: Execution failed.</li>
     * <li><strong>stopped</strong>: Execution paused.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateScheduledPreloadExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPreloadExecutionResponseBody self = new UpdateScheduledPreloadExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPreloadExecutionResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public UpdateScheduledPreloadExecutionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateScheduledPreloadExecutionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateScheduledPreloadExecutionResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateScheduledPreloadExecutionResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateScheduledPreloadExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScheduledPreloadExecutionResponseBody setSliceLen(Integer sliceLen) {
        this.sliceLen = sliceLen;
        return this;
    }
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    public UpdateScheduledPreloadExecutionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateScheduledPreloadExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
