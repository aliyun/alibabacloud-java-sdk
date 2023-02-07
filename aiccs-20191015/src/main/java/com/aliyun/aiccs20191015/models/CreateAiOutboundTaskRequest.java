// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CreateAiOutboundTaskRequest extends TeaModel {
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
    public CreateAiOutboundTaskRequestRecallRule recallRule;

    @NameInMap("Type")
    public Integer type;

    public static CreateAiOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiOutboundTaskRequest self = new CreateAiOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiOutboundTaskRequest setConcurrentRate(Integer concurrentRate) {
        this.concurrentRate = concurrentRate;
        return this;
    }
    public Integer getConcurrentRate() {
        return this.concurrentRate;
    }

    public CreateAiOutboundTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAiOutboundTaskRequest setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }
    public String getExecutionTime() {
        return this.executionTime;
    }

    public CreateAiOutboundTaskRequest setForecastCallRate(Float forecastCallRate) {
        this.forecastCallRate = forecastCallRate;
        return this;
    }
    public Float getForecastCallRate() {
        return this.forecastCallRate;
    }

    public CreateAiOutboundTaskRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public CreateAiOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAiOutboundTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAiOutboundTaskRequest setNumRepeated(Integer numRepeated) {
        this.numRepeated = numRepeated;
        return this;
    }
    public Integer getNumRepeated() {
        return this.numRepeated;
    }

    public CreateAiOutboundTaskRequest setOutboundNums(java.util.List<String> outboundNums) {
        this.outboundNums = outboundNums;
        return this;
    }
    public java.util.List<String> getOutboundNums() {
        return this.outboundNums;
    }

    public CreateAiOutboundTaskRequest setRecallRule(CreateAiOutboundTaskRequestRecallRule recallRule) {
        this.recallRule = recallRule;
        return this;
    }
    public CreateAiOutboundTaskRequestRecallRule getRecallRule() {
        return this.recallRule;
    }

    public CreateAiOutboundTaskRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class CreateAiOutboundTaskRequestRecallRule extends TeaModel {
        @NameInMap("Count")
        public Integer count;

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
