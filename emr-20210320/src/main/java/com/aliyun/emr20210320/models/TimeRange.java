// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TimeRange extends TeaModel {
    /**
     * <p>结束时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1676441972000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>起始时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1676441971000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static TimeRange build(java.util.Map<String, ?> map) throws Exception {
        TimeRange self = new TimeRange();
        return TeaModel.build(map, self);
    }

    public TimeRange setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TimeRange setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
