// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskShrinkRequest extends TeaModel {
    // 自动外呼的呼叫并发
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    // 任务描述（0～100字符）
    @NameInMap("Description")
    public String description;

    // 任务执行时间
    @NameInMap("ExecutionTime")
    public String executionTime;

    // 预测式外呼固定外呼比例（>=1）
    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    // 技能组id（预测式外呼）或者ivr id（自动外呼）
    @NameInMap("HandlerId")
    public Long handlerId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务名（1～15字符）
    @NameInMap("Name")
    public String name;

    // 被叫号码重复策略（0任务内去重，1不去重）
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    // 外呼主叫号码
    @NameInMap("OutboundNums")
    public String outboundNumsShrink;

    // 失败重呼策略（为空则不重呼）
    @NameInMap("RecallRule")
    public String recallRuleShrink;

    // 任务类型（2:预测式外呼3:自动外呼）
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
