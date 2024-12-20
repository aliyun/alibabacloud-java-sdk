// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConcurrentRate")
        public Integer concurrentRate;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;TUESDAY&quot;:[{&quot;start&quot;:&quot;06:00&quot;,&quot;end&quot;:&quot;06:05&quot;}],&quot;MONDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;},{&quot;start&quot;:&quot;20:30&quot;,&quot;end&quot;:&quot;21:45&quot;},{&quot;start&quot;:&quot;22:30&quot;,&quot;end&quot;:&quot;22:50&quot;}],&quot;WEDNESDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;THURSDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;FRIDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SATURDAY&quot;:[{&quot;start&quot;:&quot;09:00&quot;,&quot;end&quot;:&quot;18:00&quot;}],&quot;SUNDAY&quot;:[{&quot;start&quot;:&quot;17:00&quot;,&quot;end&quot;:&quot;23:45&quot;}]}</p>
         */
        @NameInMap("ExecutionTime")
        public String executionTime;

        /**
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("ForecastCallRate")
        public Float forecastCallRate;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("HandlerId")
        public Long handlerId;

        /**
         * <strong>example:</strong>
         * <p>热线技能组</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <strong>example:</strong>
         * <p>xx外呼任务</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NumRepeated")
        public Integer numRepeated;

        @NameInMap("OutboundNums")
        public java.util.List<String> outboundNums;

        @NameInMap("RecallRule")
        public GetAiOutboundTaskDetailResponseBodyDataRecallRule recallRule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>未开始</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
