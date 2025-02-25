// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class EventRule extends TeaModel {
    @NameInMap("Conditional")
    public java.util.List<ConditionalRule> conditional;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("SampleRate")
    public Float sampleRate;

    public static EventRule build(java.util.Map<String, ?> map) throws Exception {
        EventRule self = new EventRule();
        return TeaModel.build(map, self);
    }

    public EventRule setConditional(java.util.List<ConditionalRule> conditional) {
        this.conditional = conditional;
        return this;
    }
    public java.util.List<ConditionalRule> getConditional() {
        return this.conditional;
    }

    public EventRule setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EventRule setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventRule setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public EventRule setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public EventRule setSampleRate(Float sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Float getSampleRate() {
        return this.sampleRate;
    }

}
