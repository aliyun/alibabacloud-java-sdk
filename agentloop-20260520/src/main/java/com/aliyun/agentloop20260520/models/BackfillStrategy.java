// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class BackfillStrategy extends TeaModel {
    /**
     * <p>Specifies whether the backfill policy is enabled. If this parameter is not specified or is set to true, the policy is enabled. If this parameter is set to false, the policy is disabled but the configuration is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The end of the backfill time range, in UNIX millisecond timestamp. Provide a complete time range when you need to manually start a backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>1782902400000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start of the backfill time range, in UNIX millisecond timestamp. Provide a complete time range when you need to manually start a backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>1782816000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static BackfillStrategy build(java.util.Map<String, ?> map) throws Exception {
        BackfillStrategy self = new BackfillStrategy();
        return TeaModel.build(map, self);
    }

    public BackfillStrategy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public BackfillStrategy setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public BackfillStrategy setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
