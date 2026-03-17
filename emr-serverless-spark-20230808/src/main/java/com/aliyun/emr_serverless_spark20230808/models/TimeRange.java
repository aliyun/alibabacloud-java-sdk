// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TimeRange extends TeaModel {
    /**
     * <p>The end time of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1688370894339</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start time of the time range.</p>
     * 
     * <strong>example:</strong>
     * <p>1688370894339</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static TimeRange build(java.util.Map<String, ?> map) throws Exception {
        TimeRange self = new TimeRange();
        return TeaModel.build(map, self);
    }

    public TimeRange setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TimeRange setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
