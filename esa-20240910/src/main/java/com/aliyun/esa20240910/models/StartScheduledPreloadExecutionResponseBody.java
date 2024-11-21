// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class StartScheduledPreloadExecutionResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>15685865xxx14622</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The end time of the prefetch plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T18:10:48.849+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the prefetch plan.</p>
     * 
     * <strong>example:</strong>
     * <p>665d3b48621bccf3fe29e1a7</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The time interval between each batch execution. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The ID of the prefetch task.</p>
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
     * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of URLs prefetched in each batch.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SliceLen")
    public Integer sliceLen;

    /**
     * <p>The start time of the prefetch plan.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-31T17:10:48.849+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the prefetch plan. Valid values:</p>
     * <ul>
     * <li><strong>waiting</strong></li>
     * <li><strong>running</strong></li>
     * <li><strong>finished</strong></li>
     * <li><strong>failed</strong></li>
     * <li><strong>stopped</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>waiting</p>
     */
    @NameInMap("Status")
    public String status;

    public static StartScheduledPreloadExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartScheduledPreloadExecutionResponseBody self = new StartScheduledPreloadExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartScheduledPreloadExecutionResponseBody setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public StartScheduledPreloadExecutionResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public StartScheduledPreloadExecutionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartScheduledPreloadExecutionResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public StartScheduledPreloadExecutionResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StartScheduledPreloadExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartScheduledPreloadExecutionResponseBody setSliceLen(Integer sliceLen) {
        this.sliceLen = sliceLen;
        return this;
    }
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    public StartScheduledPreloadExecutionResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public StartScheduledPreloadExecutionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
