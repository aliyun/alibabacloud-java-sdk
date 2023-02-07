// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAiOutboundTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskDetailResponseBody self = new GetAiOutboundTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskDetailResponseBody setData(GetAiOutboundTaskDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskDetailResponseBodyData getData() {
        return this.data;
    }

    public GetAiOutboundTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAiOutboundTaskDetailResponseBodyDataRecallRule extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Interval")
        public Integer interval;

        public static GetAiOutboundTaskDetailResponseBodyDataRecallRule build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskDetailResponseBodyDataRecallRule self = new GetAiOutboundTaskDetailResponseBodyDataRecallRule();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskDetailResponseBodyDataRecallRule setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetAiOutboundTaskDetailResponseBodyDataRecallRule setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

    }

    public static class GetAiOutboundTaskDetailResponseBodyData extends TeaModel {
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

        @NameInMap("HandlerName")
        public String handlerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("NumRepeated")
        public Integer numRepeated;

        @NameInMap("OutboundNums")
        public java.util.List<String> outboundNums;

        @NameInMap("RecallRule")
        public GetAiOutboundTaskDetailResponseBodyDataRecallRule recallRule;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public Integer type;

        public static GetAiOutboundTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskDetailResponseBodyData self = new GetAiOutboundTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskDetailResponseBodyData setConcurrentRate(Integer concurrentRate) {
            this.concurrentRate = concurrentRate;
            return this;
        }
        public Integer getConcurrentRate() {
            return this.concurrentRate;
        }

        public GetAiOutboundTaskDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAiOutboundTaskDetailResponseBodyData setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public GetAiOutboundTaskDetailResponseBodyData setForecastCallRate(Float forecastCallRate) {
            this.forecastCallRate = forecastCallRate;
            return this;
        }
        public Float getForecastCallRate() {
            return this.forecastCallRate;
        }

        public GetAiOutboundTaskDetailResponseBodyData setHandlerId(Long handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public Long getHandlerId() {
            return this.handlerId;
        }

        public GetAiOutboundTaskDetailResponseBodyData setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public GetAiOutboundTaskDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAiOutboundTaskDetailResponseBodyData setNumRepeated(Integer numRepeated) {
            this.numRepeated = numRepeated;
            return this;
        }
        public Integer getNumRepeated() {
            return this.numRepeated;
        }

        public GetAiOutboundTaskDetailResponseBodyData setOutboundNums(java.util.List<String> outboundNums) {
            this.outboundNums = outboundNums;
            return this;
        }
        public java.util.List<String> getOutboundNums() {
            return this.outboundNums;
        }

        public GetAiOutboundTaskDetailResponseBodyData setRecallRule(GetAiOutboundTaskDetailResponseBodyDataRecallRule recallRule) {
            this.recallRule = recallRule;
            return this;
        }
        public GetAiOutboundTaskDetailResponseBodyDataRecallRule getRecallRule() {
            return this.recallRule;
        }

        public GetAiOutboundTaskDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAiOutboundTaskDetailResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetAiOutboundTaskDetailResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetAiOutboundTaskDetailResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
