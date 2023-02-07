// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskShrinkRequest extends TeaModel {
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExecutionTime")
    public String executionTime;

    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    @NameInMap("HandlerId")
    public Long handlerId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NumRepeated")
    public Integer numRepeated;

    @NameInMap("OutboundNums")
    public String outboundNumsShrink;

    @NameInMap("RecallRule")
    public String recallRuleShrink;

    @NameInMap("Type")
    public Integer type;

    public static CreateAiOutboundTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskShrinkRequest self = new CreateAiOutboundTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskShrinkRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public CreateAiOutboundTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAiOutboundTaskShrinkRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public CreateAiOutboundTaskShrinkRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public CreateAiOutboundTaskShrinkRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public CreateAiOutboundTaskShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAiOutboundTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAiOutboundTaskShrinkRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public CreateAiOutboundTaskShrinkRequest setOutboundNumsShrink(String outboundNumsShrink) {
        this.outboundNumsShrink = outboundNumsShrink;
        return this;
    }
    public String getOutboundNumsShrink() {
        return this.outboundNumsShrink;
    }

    public CreateAiOutboundTaskShrinkRequest setRecallRuleShrink(String recallRuleShrink) {
        this.recallRuleShrink = recallRuleShrink;
        return this;
    }
    public String getRecallRuleShrink() {
        return this.recallRuleShrink;
    }

    public CreateAiOutboundTaskShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
