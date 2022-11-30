// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceCallDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListVoiceCallDetailResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListVoiceCallDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCallDetailResponseBody self = new ListVoiceCallDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoiceCallDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoiceCallDetailResponseBody setList(java.util.List<ListVoiceCallDetailResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVoiceCallDetailResponseBodyList> getList() {
        return this.list;
    }

    public ListVoiceCallDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoiceCallDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVoiceCallDetailResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListVoiceCallDetailResponseBodyList extends TeaModel {
        @NameInMap("Billing")
        public Long billing;

        @NameInMap("BusinessType")
        public Long businessType;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("CommitTs")
        public String commitTs;

        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTs")
        public String endTs;

        @NameInMap("HangupType")
        public Long hangupType;

        @NameInMap("SendType")
        public Long sendType;

        @NameInMap("StartTs")
        public String startTs;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static ListVoiceCallDetailResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVoiceCallDetailResponseBodyList self = new ListVoiceCallDetailResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVoiceCallDetailResponseBodyList setBilling(Long billing) {
            this.billing = billing;
            return this;
        }
        public Long getBilling() {
            return this.billing;
        }

        public ListVoiceCallDetailResponseBodyList setBusinessType(Long businessType) {
            this.businessType = businessType;
            return this;
        }
        public Long getBusinessType() {
            return this.businessType;
        }

        public ListVoiceCallDetailResponseBodyList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListVoiceCallDetailResponseBodyList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListVoiceCallDetailResponseBodyList setCommitTs(String commitTs) {
            this.commitTs = commitTs;
            return this;
        }
        public String getCommitTs() {
            return this.commitTs;
        }

        public ListVoiceCallDetailResponseBodyList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public ListVoiceCallDetailResponseBodyList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListVoiceCallDetailResponseBodyList setEndTs(String endTs) {
            this.endTs = endTs;
            return this;
        }
        public String getEndTs() {
            return this.endTs;
        }

        public ListVoiceCallDetailResponseBodyList setHangupType(Long hangupType) {
            this.hangupType = hangupType;
            return this;
        }
        public Long getHangupType() {
            return this.hangupType;
        }

        public ListVoiceCallDetailResponseBodyList setSendType(Long sendType) {
            this.sendType = sendType;
            return this;
        }
        public Long getSendType() {
            return this.sendType;
        }

        public ListVoiceCallDetailResponseBodyList setStartTs(String startTs) {
            this.startTs = startTs;
            return this;
        }
        public String getStartTs() {
            return this.startTs;
        }

        public ListVoiceCallDetailResponseBodyList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListVoiceCallDetailResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVoiceCallDetailResponseBodyList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
