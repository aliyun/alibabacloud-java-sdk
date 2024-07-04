// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TimeConstraint extends TeaModel {
    /**
     * <p>结束时间。取值范围：00:00:00至23:59:59</p>
     * 
     * <strong>example:</strong>
     * <p>23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>开始时间。取值范围：00:00:00至23:59:59</p>
     * 
     * <strong>example:</strong>
     * <p>06:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static TimeConstraint build(java.util.Map<String, ?> map) throws Exception {
        TimeConstraint self = new TimeConstraint();
        return TeaModel.build(map, self);
    }

    public TimeConstraint setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TimeConstraint setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
