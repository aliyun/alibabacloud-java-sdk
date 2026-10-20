// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetPipelineStatsRequest extends TeaModel {
    /**
     * <p>The end time of the statistical window in UNIX seconds. Default value: now.</p>
     * 
     * <strong>example:</strong>
     * <p>1735660800</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The statistical granularity. Valid values: Hour, Day, Week, and Month. Default value: automatically inferred.</p>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The start time of the statistical window in UNIX seconds. Default value: now - 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>1735574400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static GetPipelineStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStatsRequest self = new GetPipelineStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineStatsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPipelineStatsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetPipelineStatsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
