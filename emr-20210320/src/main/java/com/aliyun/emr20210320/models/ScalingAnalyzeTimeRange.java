// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ScalingAnalyzeTimeRange extends TeaModel {
    /**
     * <p>结束时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1676441972000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>起始时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1676441971000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>峰谷类型。 peak/valley</p>
     * 
     * <strong>example:</strong>
     * <p>peak</p>
     */
    @NameInMap("Type")
    public String type;

    public static ScalingAnalyzeTimeRange build(java.util.Map<String, ?> map) throws Exception {
        ScalingAnalyzeTimeRange self = new ScalingAnalyzeTimeRange();
        return TeaModel.build(map, self);
    }

    public ScalingAnalyzeTimeRange setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ScalingAnalyzeTimeRange setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ScalingAnalyzeTimeRange setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
