// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class TimeFilter extends TeaModel {
    /**
     * <p>The time when the migration task ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-12-31T59:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the migration task started.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static TimeFilter build(java.util.Map<String, ?> map) throws Exception {
        TimeFilter self = new TimeFilter();
        return TeaModel.build(map, self);
    }

    public TimeFilter setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TimeFilter setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
