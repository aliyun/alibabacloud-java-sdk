// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetScheduleTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

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

        @NameInMap("Cron")
        public String cron;

        @NameInMap("ScheduleEndTime")
        public String scheduleEndTime;

        @NameInMap("ScheduleId")
        public Long scheduleId;

        @NameInMap("ScheduleStartTime")
        public String scheduleStartTime;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("Uuid")
        public String uuid;

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

        public GetScheduleTaskResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetScheduleTaskResponseBodyResult setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
