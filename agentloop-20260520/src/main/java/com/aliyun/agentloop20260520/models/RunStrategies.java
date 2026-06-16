// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class RunStrategies extends TeaModel {
    @NameInMap("backfill")
    public BackfillStrategy backfill;

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
