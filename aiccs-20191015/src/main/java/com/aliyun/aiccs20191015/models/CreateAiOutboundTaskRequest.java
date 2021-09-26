// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务类型（2:预测式外呼3:自动外呼）
    @NameInMap("Type")
    public Integer type;

    // 任务名（1～15字符）
    @NameInMap("Name")
    public String name;

    // 任务描述（0～100字符）
    @NameInMap("Description")
    public String description;

    // 外呼主叫号码
    @NameInMap("OutboundNums")
    public java.util.List<String> outboundNums;

    // 被叫号码重复策略（0任务内去重，1不去重）
    @NameInMap("NumRepeated")
    public Integer numRepeated;

    // 技能组id（预测式外呼）或者ivr id（自动外呼）
    @NameInMap("HandlerId")
    public Long handlerId;

    // 任务执行时间
    @NameInMap("ExecutionTime")
    public String executionTime;

    // 自动外呼的呼叫并发
    @NameInMap("ConcurrentRate")
    public Integer concurrentRate;

    // 失败重呼策略（为空则不重呼）
    @NameInMap("RecallRule")
    public CreateAiOutboundTaskRequestRecallRule recallRule;

    // 预测式外呼固定外呼比例（>=1）
    @NameInMap("ForecastCallRate")
    public Float forecastCallRate;

    public static CreateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskRequest self = new CreateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAiOutboundTaskRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateAiOutboundTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAiOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAiOutboundTaskRequest setOutboundNums(java.util.List<String> outboundNums) {
        this.outboundNums = outboundNums;
        return this;
    }
    public java.util.List<String> getOutboundNums() {
        return this.outboundNums;
    }

    public CreateAiOutboundTaskRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public CreateAiOutboundTaskRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public CreateAiOutboundTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public CreateAiOutboundTaskRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public CreateAiOutboundTaskRequest setRecallRule(CreateAiOutboundTaskRequestRecallRule recallRule) {
        this.recallRule = recallRule;
        return this;
    }
    public CreateAiOutboundTaskRequestRecallRule getRecallRule() {
        return this.recallRule;
    }

    public CreateAiOutboundTaskRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public static class CreateAiOutboundTaskRequestRecallRule extends TeaModel {
        // 重呼次数（1～3）
        @NameInMap("Count")
        public Integer count;

        // 重呼间隔时间（1～60分钟）
        @NameInMap("Interval")
        public Integer interval;

        public static CreateAiOutboundTaskRequestRecallRule build(java.util.Map<String, ?> map) throws Exception {
            CreateAiOutboundTaskRequestRecallRule self = new CreateAiOutboundTaskRequestRecallRule();
            return TeaModel.build(map, self);
        }

        public CreateAiOutboundTaskRequestRecallRule setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public CreateAiOutboundTaskRequestRecallRule setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

    }

}
