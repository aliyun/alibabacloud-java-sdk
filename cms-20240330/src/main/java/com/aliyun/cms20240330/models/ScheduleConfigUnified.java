// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ScheduleConfigUnified extends TeaModel {
    /**
     * <p>The scheduling interval in seconds. This parameter is used when type is set to FIXED.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("intervalSecs")
    public Integer intervalSecs;

    /**
     * <p>The type of the scheduling configuration. FIXED indicates fixed-interval scheduling, which executes periodically based on the interval specified by intervalSecs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("type")
    public String type;

    public static ScheduleConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        ScheduleConfigUnified self = new ScheduleConfigUnified();
        return TeaModel.build(map, self);
    }

    public ScheduleConfigUnified setIntervalSecs(Integer intervalSecs) {
        this.intervalSecs = intervalSecs;
        return this;
    }
    public Integer getIntervalSecs() {
        return this.intervalSecs;
    }

    public ScheduleConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
