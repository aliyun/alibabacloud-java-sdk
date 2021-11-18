// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetPredictiveTaskDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPredictiveTaskDataResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetPredictiveTaskDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPredictiveTaskDataResponseBody self = new GetPredictiveTaskDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPredictiveTaskDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPredictiveTaskDataResponseBody setData(GetPredictiveTaskDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPredictiveTaskDataResponseBodyData getData() {
        return this.data;
    }

    public GetPredictiveTaskDataResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPredictiveTaskDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPredictiveTaskDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPredictiveTaskDataResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetPredictiveTaskDataResponseBodyData extends TeaModel {
        @NameInMap("Abandoned")
        public Boolean abandoned;

        @NameInMap("Answered")
        public Boolean answered;

        @NameInMap("Connected")
        public Boolean connected;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("DialDuration")
        public Long dialDuration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("QueueDuration")
        public Long queueDuration;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TalkDuration")
        public Long talkDuration;

        @NameInMap("TaskId")
        public String taskId;

        public static GetPredictiveTaskDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPredictiveTaskDataResponseBodyData self = new GetPredictiveTaskDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPredictiveTaskDataResponseBodyData setAbandoned(Boolean abandoned) {
            this.abandoned = abandoned;
            return this;
        }
        public Boolean getAbandoned() {
            return this.abandoned;
        }

        public GetPredictiveTaskDataResponseBodyData setAnswered(Boolean answered) {
            this.answered = answered;
            return this;
        }
        public Boolean getAnswered() {
            return this.answered;
        }

        public GetPredictiveTaskDataResponseBodyData setConnected(Boolean connected) {
            this.connected = connected;
            return this;
        }
        public Boolean getConnected() {
            return this.connected;
        }

        public GetPredictiveTaskDataResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetPredictiveTaskDataResponseBodyData setDialDuration(Long dialDuration) {
            this.dialDuration = dialDuration;
            return this;
        }
        public Long getDialDuration() {
            return this.dialDuration;
        }

        public GetPredictiveTaskDataResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPredictiveTaskDataResponseBodyData setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetPredictiveTaskDataResponseBodyData setQueueDuration(Long queueDuration) {
            this.queueDuration = queueDuration;
            return this;
        }
        public Long getQueueDuration() {
            return this.queueDuration;
        }

        public GetPredictiveTaskDataResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPredictiveTaskDataResponseBodyData setTalkDuration(Long talkDuration) {
            this.talkDuration = talkDuration;
            return this;
        }
        public Long getTalkDuration() {
            return this.talkDuration;
        }

        public GetPredictiveTaskDataResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
