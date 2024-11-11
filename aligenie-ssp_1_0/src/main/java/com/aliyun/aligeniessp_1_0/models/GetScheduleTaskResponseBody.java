// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetScheduleTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F7E21065-6C21-1158-A2F9-AEFE5CAB7C94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetScheduleTaskResponseBodyResult result;

    public static GetScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTaskResponseBody self = new GetScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetScheduleTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScheduleTaskResponseBody setResult(GetScheduleTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetScheduleTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetScheduleTaskResponseBodyResultActionTopicList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:{&quot;key&quot;:1}}</p>
         */
        @NameInMap("CustomAction")
        public java.util.Map<String, ?> customAction;

        public static GetScheduleTaskResponseBodyResultActionTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTaskResponseBodyResultActionTopicList self = new GetScheduleTaskResponseBodyResultActionTopicList();
            return TeaModel.build(map, self);
        }

        public GetScheduleTaskResponseBodyResultActionTopicList setCustomAction(java.util.Map<String, ?> customAction) {
            this.customAction = customAction;
            return this;
        }
        public java.util.Map<String, ?> getCustomAction() {
            return this.customAction;
        }

    }

    public static class GetScheduleTaskResponseBodyResult extends TeaModel {
        @NameInMap("ActionTopicList")
        public java.util.List<GetScheduleTaskResponseBodyResultActionTopicList> actionTopicList;

        /**
         * <strong>example:</strong>
         * <p>0 10 20 30 6 ? 2022</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <strong>example:</strong>
         * <p>1659169473000</p>
         */
        @NameInMap("ScheduleEndTime")
        public String scheduleEndTime;

        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ScheduleId")
        public Long scheduleId;

        /**
         * <strong>example:</strong>
         * <p>1656577473000</p>
         */
        @NameInMap("ScheduleStartTime")
        public String scheduleStartTime;

        /**
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        public static GetScheduleTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleTaskResponseBodyResult self = new GetScheduleTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetScheduleTaskResponseBodyResult setActionTopicList(java.util.List<GetScheduleTaskResponseBodyResultActionTopicList> actionTopicList) {
            this.actionTopicList = actionTopicList;
            return this;
        }
        public java.util.List<GetScheduleTaskResponseBodyResultActionTopicList> getActionTopicList() {
            return this.actionTopicList;
        }

        public GetScheduleTaskResponseBodyResult setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetScheduleTaskResponseBodyResult setScheduleEndTime(String scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }
        public String getScheduleEndTime() {
            return this.scheduleEndTime;
        }

        public GetScheduleTaskResponseBodyResult setScheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }
        public Long getScheduleId() {
            return this.scheduleId;
        }

        public GetScheduleTaskResponseBodyResult setScheduleStartTime(String scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }
        public String getScheduleStartTime() {
            return this.scheduleStartTime;
        }

        public GetScheduleTaskResponseBodyResult setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

    }

}
