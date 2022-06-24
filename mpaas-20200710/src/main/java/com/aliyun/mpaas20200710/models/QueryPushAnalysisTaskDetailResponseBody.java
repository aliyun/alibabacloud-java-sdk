// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisTaskDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryPushAnalysisTaskDetailResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryPushAnalysisTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisTaskDetailResponseBody self = new QueryPushAnalysisTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushAnalysisTaskDetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPushAnalysisTaskDetailResponseBody setResultContent(QueryPushAnalysisTaskDetailResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryPushAnalysisTaskDetailResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryPushAnalysisTaskDetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryPushAnalysisTaskDetailResponseBodyResultContentData extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("PushArrivalNum")
        public Float pushArrivalNum;

        @NameInMap("PushNum")
        public Float pushNum;

        @NameInMap("PushSuccessNum")
        public Float pushSuccessNum;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TaskId")
        public Long taskId;

        public static QueryPushAnalysisTaskDetailResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisTaskDetailResponseBodyResultContentData self = new QueryPushAnalysisTaskDetailResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setPushArrivalNum(Float pushArrivalNum) {
            this.pushArrivalNum = pushArrivalNum;
            return this;
        }
        public Float getPushArrivalNum() {
            return this.pushArrivalNum;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setPushNum(Float pushNum) {
            this.pushNum = pushNum;
            return this;
        }
        public Float getPushNum() {
            return this.pushNum;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setPushSuccessNum(Float pushSuccessNum) {
            this.pushSuccessNum = pushSuccessNum;
            return this;
        }
        public Float getPushSuccessNum() {
            return this.pushSuccessNum;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContentData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

    public static class QueryPushAnalysisTaskDetailResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public QueryPushAnalysisTaskDetailResponseBodyResultContentData data;

        public static QueryPushAnalysisTaskDetailResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisTaskDetailResponseBodyResultContent self = new QueryPushAnalysisTaskDetailResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisTaskDetailResponseBodyResultContent setData(QueryPushAnalysisTaskDetailResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryPushAnalysisTaskDetailResponseBodyResultContentData getData() {
            return this.data;
        }

    }

}
