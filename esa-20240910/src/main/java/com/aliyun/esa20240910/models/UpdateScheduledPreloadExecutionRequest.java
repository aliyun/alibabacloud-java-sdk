// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateScheduledPreloadExecutionRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateScheduledPreloadExecution</p>
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

    public static UpdateScheduledPreloadExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPreloadExecutionRequest self = new UpdateScheduledPreloadExecutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPreloadExecutionRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateScheduledPreloadExecutionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateScheduledPreloadExecutionRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateScheduledPreloadExecutionRequest setSliceLen(Integer sliceLen) {
        this.sliceLen = sliceLen;
        return this;
    }
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    public UpdateScheduledPreloadExecutionRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
