// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListSipTrunkDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("List")
    public java.util.List<ListSipTrunkDetailResponseBodyList> list;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static ListSipTrunkDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunkDetailResponseBody self = new ListSipTrunkDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipTrunkDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipTrunkDetailResponseBody setList(java.util.List<ListSipTrunkDetailResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSipTrunkDetailResponseBodyList> getList() {
        return this.list;
    }

    public ListSipTrunkDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipTrunkDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSipTrunkDetailResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSipTrunkDetailResponseBodyList extends TeaModel {
        @NameInMap("AnswerTime")
        public String answerTime;

        @NameInMap("Answered")
        public Long answered;

        @NameInMap("BusiType")
        public String busiType;

        @NameInMap("CallEndTime")
        public String callEndTime;

        @NameInMap("CallType")
        public String callType;

        @NameInMap("CalledIp")
        public String calledIp;

        @NameInMap("CalledNum")
        public String calledNum;

        @NameInMap("CalledNumRegion")
        public String calledNumRegion;

        @NameInMap("CalledNumType")
        public String calledNumType;

        @NameInMap("CallerDisplay")
        public String callerDisplay;

        @NameInMap("CallerIp")
        public String callerIp;

        @NameInMap("CallerNum")
        public String callerNum;

        @NameInMap("CallerNumRegion")
        public String callerNumRegion;

        @NameInMap("CallerNumType")
        public String callerNumType;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Hangup")
        public Long hangup;

        @NameInMap("HangupType")
        public Long hangupType;

        @NameInMap("IvnCliType")
        public String ivnCliType;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UserUuid")
        public String userUuid;

        @NameInMap("Uuid")
        public String uuid;

        public static ListSipTrunkDetailResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSipTrunkDetailResponseBodyList self = new ListSipTrunkDetailResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSipTrunkDetailResponseBodyList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public ListSipTrunkDetailResponseBodyList setAnswered(Long answered) {
            this.answered = answered;
            return this;
        }
        public Long getAnswered() {
            return this.answered;
        }

        public ListSipTrunkDetailResponseBodyList setBusiType(String busiType) {
            this.busiType = busiType;
            return this;
        }
        public String getBusiType() {
            return this.busiType;
        }

        public ListSipTrunkDetailResponseBodyList setCallEndTime(String callEndTime) {
            this.callEndTime = callEndTime;
            return this;
        }
        public String getCallEndTime() {
            return this.callEndTime;
        }

        public ListSipTrunkDetailResponseBodyList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ListSipTrunkDetailResponseBodyList setCalledIp(String calledIp) {
            this.calledIp = calledIp;
            return this;
        }
        public String getCalledIp() {
            return this.calledIp;
        }

        public ListSipTrunkDetailResponseBodyList setCalledNum(String calledNum) {
            this.calledNum = calledNum;
            return this;
        }
        public String getCalledNum() {
            return this.calledNum;
        }

        public ListSipTrunkDetailResponseBodyList setCalledNumRegion(String calledNumRegion) {
            this.calledNumRegion = calledNumRegion;
            return this;
        }
        public String getCalledNumRegion() {
            return this.calledNumRegion;
        }

        public ListSipTrunkDetailResponseBodyList setCalledNumType(String calledNumType) {
            this.calledNumType = calledNumType;
            return this;
        }
        public String getCalledNumType() {
            return this.calledNumType;
        }

        public ListSipTrunkDetailResponseBodyList setCallerDisplay(String callerDisplay) {
            this.callerDisplay = callerDisplay;
            return this;
        }
        public String getCallerDisplay() {
            return this.callerDisplay;
        }

        public ListSipTrunkDetailResponseBodyList setCallerIp(String callerIp) {
            this.callerIp = callerIp;
            return this;
        }
        public String getCallerIp() {
            return this.callerIp;
        }

        public ListSipTrunkDetailResponseBodyList setCallerNum(String callerNum) {
            this.callerNum = callerNum;
            return this;
        }
        public String getCallerNum() {
            return this.callerNum;
        }

        public ListSipTrunkDetailResponseBodyList setCallerNumRegion(String callerNumRegion) {
            this.callerNumRegion = callerNumRegion;
            return this;
        }
        public String getCallerNumRegion() {
            return this.callerNumRegion;
        }

        public ListSipTrunkDetailResponseBodyList setCallerNumType(String callerNumType) {
            this.callerNumType = callerNumType;
            return this;
        }
        public String getCallerNumType() {
            return this.callerNumType;
        }

        public ListSipTrunkDetailResponseBodyList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListSipTrunkDetailResponseBodyList setHangup(Long hangup) {
            this.hangup = hangup;
            return this;
        }
        public Long getHangup() {
            return this.hangup;
        }

        public ListSipTrunkDetailResponseBodyList setHangupType(Long hangupType) {
            this.hangupType = hangupType;
            return this;
        }
        public Long getHangupType() {
            return this.hangupType;
        }

        public ListSipTrunkDetailResponseBodyList setIvnCliType(String ivnCliType) {
            this.ivnCliType = ivnCliType;
            return this;
        }
        public String getIvnCliType() {
            return this.ivnCliType;
        }

        public ListSipTrunkDetailResponseBodyList setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public ListSipTrunkDetailResponseBodyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListSipTrunkDetailResponseBodyList setUserUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }
        public String getUserUuid() {
            return this.userUuid;
        }

        public ListSipTrunkDetailResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
