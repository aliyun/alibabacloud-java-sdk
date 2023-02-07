// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateAiOutboundTaskRequest extends TeaModel {
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
    public java.util.List<String> outboundNums;

    @NameInMap("RecallRule")
    public UpdateAiOutboundTaskRequestRecallRule recallRule;

    @NameInMap("TaskId")
    public Long taskId;

    public static UpdateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiOutboundTaskRequest self = new UpdateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiOutboundTaskRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public UpdateAiOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAiOutboundTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public UpdateAiOutboundTaskRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public UpdateAiOutboundTaskRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public UpdateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAiOutboundTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAiOutboundTaskRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public UpdateAiOutboundTaskRequest setOutboundNums(java.util.List<String> outboundNums) {
        this.outboundNums = outboundNums;
        return this;
    }
    public java.util.List<String> getOutboundNums() {
        return this.outboundNums;
    }

    public UpdateAiOutboundTaskRequest setRecallRule(UpdateAiOutboundTaskRequestRecallRule recallRule) {
        this.recallRule = recallRule;
        return this;
    }
    public UpdateAiOutboundTaskRequestRecallRule getRecallRule() {
        return this.recallRule;
    }

    public UpdateAiOutboundTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class UpdateAiOutboundTaskRequestRecallRule extends TeaModel {
        @NameInMap("Count")
        public Integer count;

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
