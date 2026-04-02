// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ScheduleConfigUnified extends TeaModel {
    /**
     * <p>调度间隔（秒），type=FIXED 时使用</p>
     */
    @NameInMap("intervalSecs")
    public Integer intervalSecs;

    /**
     * <p>调度类型</p>
     * <p>This parameter is required.</p>
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
