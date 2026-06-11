// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStageForView extends TeaModel {
    /**
     * <p>The number of loop notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cycleNotifyCount")
    public Integer cycleNotifyCount;

    /**
     * <p>The loop notification interval.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("cycleNotifyInterval")
    public Integer cycleNotifyInterval;

    /**
     * <p>The effective time range.</p>
     */
    @NameInMap("effectTimeRange")
    public EffectTimeRange effectTimeRange;

    /**
     * <p>The stage index.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("index")
    public Integer index;

    /**
     * <p>The list of notification channels.</p>
     */
    @NameInMap("notifyChannels")
    public java.util.List<NotifyChannel> notifyChannels;

    /**
     * <p>The target event state.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;Open&quot;</p>
     */
    @NameInMap("targetIncidentState")
    public String targetIncidentState;

    /**
     * <p>The trigger delay time.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
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
