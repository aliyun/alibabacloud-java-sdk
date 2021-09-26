// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    // 任务名（1～15字符）
    @NameInMap("Name")
    public String name;

    // 任务描述（0～100字符）
    @NameInMap("Description")
    public String description;

    // 外呼主叫号码
    @NameInMap("OutboundNums")
    public java.util.List<String> outboundNums;

    // 被叫号码重复策略（0:任务内去重，1:任务内不去重）
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    // 技能组id（预测式外呼）或者ivr id（自动外呼）
    @NameInMap("HandlerId")
    public Long handlerId;

    // 任务执行时间
    @NameInMap("ExecutionTime")
    public String executionTime;

    // 自动外呼的并发
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    // 失败重呼策略
    @NameInMap("RecallRule")
    public UpdateAiOutboundTaskRequestRecallRule recallRule;

    // 预测式外呼固定外呼比例（>=1）
    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    public static UpdateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskRequest self = new UpdateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAiOutboundTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateAiOutboundTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAiOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAiOutboundTaskRequest setOutboundNums(java.util.List<String> outboundNums) {
        this.outboundNums = outboundNums;
        return this;
    }
    public java.util.List<String> getOutboundNums() {
        return this.outboundNums;
    }

    public UpdateAiOutboundTaskRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public UpdateAiOutboundTaskRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public UpdateAiOutboundTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public UpdateAiOutboundTaskRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public UpdateAiOutboundTaskRequest setRecallRule(UpdateAiOutboundTaskRequestRecallRule recallRule) {
        this.recallRule = recallRule;
        return this;
    }
    public UpdateAiOutboundTaskRequestRecallRule getRecallRule() {
        return this.recallRule;
    }

    public UpdateAiOutboundTaskRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public static class UpdateAiOutboundTaskRequestRecallRule extends TeaModel {
        // 失败重呼次数（1～3次）
        @NameInMap("Count")
        public Integer count;

        // 失败重呼间隔时间（1～60分钟）
        @NameInMap("Interval")
        public Integer interval;

        public static UpdateAiOutboundTaskRequestRecallRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiOutboundTaskRequestRecallRule self = new UpdateAiOutboundTaskRequestRecallRule();
            return TeaModel.build(map, self);
        }

        public UpdateAiOutboundTaskRequestRecallRule setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public UpdateAiOutboundTaskRequestRecallRule setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

    }

}
