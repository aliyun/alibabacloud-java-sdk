// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStageForView extends TeaModel {
    @NameInMap("cycleNotifyCount")
    public Integer cycleNotifyCount;

    @NameInMap("cycleNotifyInterval")
    public Integer cycleNotifyInterval;

    @NameInMap("effectTimeRange")
    public EffectTimeRange effectTimeRange;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("index")
    public Integer index;

    @NameInMap("notifyChannels")
    public java.util.List<NotifyChannel> notifyChannels;

    @NameInMap("targetIncidentState")
    public String targetIncidentState;

    @NameInMap("triggerDelay")
    public Integer triggerDelay;

    public static IncidentEscalationStageForView build(java.util.Map<String, ?> map) throws Exception {
        IncidentEscalationStageForView self = new IncidentEscalationStageForView();
        return TeaModel.build(map, self);
    }

    public IncidentEscalationStageForView setCycleNotifyCount(Integer cycleNotifyCount) {
        this.cycleNotifyCount = cycleNotifyCount;
        return this;
    }
    public Integer getCycleNotifyCount() {
        return this.cycleNotifyCount;
    }

    public IncidentEscalationStageForView setCycleNotifyInterval(Integer cycleNotifyInterval) {
        this.cycleNotifyInterval = cycleNotifyInterval;
        return this;
    }
    public Integer getCycleNotifyInterval() {
        return this.cycleNotifyInterval;
    }

    public IncidentEscalationStageForView setEffectTimeRange(EffectTimeRange effectTimeRange) {
        this.effectTimeRange = effectTimeRange;
        return this;
    }
    public EffectTimeRange getEffectTimeRange() {
        return this.effectTimeRange;
    }

    public IncidentEscalationStageForView setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public IncidentEscalationStageForView setNotifyChannels(java.util.List<NotifyChannel> notifyChannels) {
        this.notifyChannels = notifyChannels;
        return this;
    }
    public java.util.List<NotifyChannel> getNotifyChannels() {
        return this.notifyChannels;
    }

    public IncidentEscalationStageForView setTargetIncidentState(String targetIncidentState) {
        this.targetIncidentState = targetIncidentState;
        return this;
    }
    public String getTargetIncidentState() {
        return this.targetIncidentState;
    }

    public IncidentEscalationStageForView setTriggerDelay(Integer triggerDelay) {
        this.triggerDelay = triggerDelay;
        return this;
    }
    public Integer getTriggerDelay() {
        return this.triggerDelay;
    }

}
