// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskShrinkRequest extends TeaModel {
    // 自动外呼的并发
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

    // 被叫号码重复策略（0:任务内去重，1:任务内不去重）
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    // 外呼主叫号码
    @NameInMap("OutboundNums")
    public String outboundNumsShrink;

    // 失败重呼策略
    @NameInMap("RecallRule")
    public String recallRuleShrink;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateAiOutboundTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskShrinkRequest self = new UpdateAiOutboundTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskShrinkRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public UpdateAiOutboundTaskShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAiOutboundTaskShrinkRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public UpdateAiOutboundTaskShrinkRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public UpdateAiOutboundTaskShrinkRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public UpdateAiOutboundTaskShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAiOutboundTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAiOutboundTaskShrinkRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public UpdateAiOutboundTaskShrinkRequest setOutboundNumsShrink(String outboundNumsShrink) {
        this.outboundNumsShrink = outboundNumsShrink;
        return this;
    }
    public String getOutboundNumsShrink() {
        return this.outboundNumsShrink;
    }

    public UpdateAiOutboundTaskShrinkRequest setRecallRuleShrink(String recallRuleShrink) {
        this.recallRuleShrink = recallRuleShrink;
        return this;
    }
    public String getRecallRuleShrink() {
        return this.recallRuleShrink;
    }

    public UpdateAiOutboundTaskShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
