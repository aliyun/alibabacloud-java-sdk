// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class BackfillStrategy extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("immediate")
    public Boolean immediate;

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

    public BackfillStrategy setImmediate(Boolean immediate) {
        this.immediate = immediate;
        return this;
    }
    public Boolean getImmediate() {
        return this.immediate;
    }

    public BackfillStrategy setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
