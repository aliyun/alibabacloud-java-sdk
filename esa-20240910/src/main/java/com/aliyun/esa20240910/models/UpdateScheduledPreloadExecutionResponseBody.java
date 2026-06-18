// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateScheduledPreloadExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>15685865xxx14622</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The end time of the scheduled preload plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T18:10:48.849+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the preload plan.</p>
     * 
     * <strong>example:</strong>
     * <p>66599bd7397885b43804901c</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The execution interval for each batch in the scheduled preload plan, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The ID of the preload task.</p>
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
     * <p>The number of URLs in each scheduled preload batch.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SliceLen")
    public Integer sliceLen;

    /**
     * <p>The start time of the scheduled preload plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T17:10:48.849+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the scheduled preload plan. Valid values:</p>
     * <ul>
     * <li><p><strong>waiting</strong>: The plan is waiting to be executed.</p>
     * </li>
     * <li><p><strong>running</strong>: The plan is being executed.</p>
     * </li>
     * <li><p><strong>finished</strong>: The plan is executed.</p>
     * </li>
     * <li><p><strong>failed</strong>: The execution failed.</p>
     * </li>
     * <li><p><strong>stopped</strong>: The execution is paused.</p>
     * </li>
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
