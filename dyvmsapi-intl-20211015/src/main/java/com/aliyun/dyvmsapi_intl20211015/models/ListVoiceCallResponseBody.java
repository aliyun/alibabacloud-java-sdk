// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceCallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListVoiceCallResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListVoiceCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCallResponseBody self = new ListVoiceCallResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceCallResponseBody setList(java.util.List<ListVoiceCallResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVoiceCallResponseBodyList> getList() {
        return this.list;
    }

    public ListVoiceCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceCallResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVoiceCallResponseBodyList extends TeaModel {
        @NameInMap("AnsweredCalls")
        public Long answeredCalls;

        @NameInMap("BusinessType")
        public Long businessType;

        @NameInMap("CalledCalls")
        public Long calledCalls;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("FailedCalls")
        public Long failedCalls;

        @NameInMap("GroupCallType")
        public Long groupCallType;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SendType")
        public Long sendType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateContent")
        public String templateContent;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TickerTs")
        public String tickerTs;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalDuration")
        public Long totalDuration;

        @NameInMap("UserUuid")
        public String userUuid;

        public static ListVoiceCallResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceCallResponseBodyList self = new ListVoiceCallResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVoiceCallResponseBodyList setAnsweredCalls(Long answeredCalls) {
            this.answeredCalls = answeredCalls;
            return this;
        }
        public Long getAnsweredCalls() {
            return this.answeredCalls;
        }

        public ListVoiceCallResponseBodyList setBusinessType(Long businessType) {
            this.businessType = businessType;
            return this;
        }
        public Long getBusinessType() {
            return this.businessType;
        }

        public ListVoiceCallResponseBodyList setCalledCalls(Long calledCalls) {
            this.calledCalls = calledCalls;
            return this;
        }
        public Long getCalledCalls() {
            return this.calledCalls;
        }

        public ListVoiceCallResponseBodyList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListVoiceCallResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListVoiceCallResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListVoiceCallResponseBodyList setFailedCalls(Long failedCalls) {
            this.failedCalls = failedCalls;
            return this;
        }
        public Long getFailedCalls() {
            return this.failedCalls;
        }

        public ListVoiceCallResponseBodyList setGroupCallType(Long groupCallType) {
            this.groupCallType = groupCallType;
            return this;
        }
        public Long getGroupCallType() {
            return this.groupCallType;
        }

        public ListVoiceCallResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListVoiceCallResponseBodyList setSendType(Long sendType) {
            this.sendType = sendType;
            return this;
        }
        public Long getSendType() {
            return this.sendType;
        }

        public ListVoiceCallResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVoiceCallResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVoiceCallResponseBodyList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListVoiceCallResponseBodyList setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public ListVoiceCallResponseBodyList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListVoiceCallResponseBodyList setTickerTs(String tickerTs) {
            this.tickerTs = tickerTs;
            return this;
        }
        public String getTickerTs() {
            return this.tickerTs;
        }

        public ListVoiceCallResponseBodyList setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public ListVoiceCallResponseBodyList setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ListVoiceCallResponseBodyList setUserUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }
        public String getUserUuid() {
            return this.userUuid;
        }

    }

}
