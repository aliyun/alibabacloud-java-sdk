// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunStrategies extends TeaModel {
    /**
     * <p>The historical batch backfill policy. Backfill is enabled when the object exists and enabled is not explicitly set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:true,&quot;startTime&quot;:1782816000000,&quot;endTime&quot;:1782902400000,&quot;immediate&quot;:false}</p>
     */
    @NameInMap("backfill")
    public BackfillStrategy backfill;

    /**
     * <p>The continuous evaluation policy. Continuous evaluation is enabled when the object exists and enabled is not explicitly set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enabled&quot;:true,&quot;intervalUnit&quot;:&quot;HOUR&quot;,&quot;intervalValue&quot;:1,&quot;dataDelayMinutes&quot;:5}</p>
     */
    @NameInMap("continuous")
    public ContinuousStrategy continuous;

    public static RunStrategies build(java.util.Map<String, ?> map) throws Exception {
        RunStrategies self = new RunStrategies();
        return TeaModel.build(map, self);
    }

    public RunStrategies setBackfill(BackfillStrategy backfill) {
        this.backfill = backfill;
        return this;
    }
    public BackfillStrategy getBackfill() {
        return this.backfill;
    }

    public RunStrategies setContinuous(ContinuousStrategy continuous) {
        this.continuous = continuous;
        return this;
    }
    public ContinuousStrategy getContinuous() {
        return this.continuous;
    }

}
