// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateScheduledPreloadExecutionRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateScheduledPreloadExecution</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("SliceLen")
    public Integer sliceLen;

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
