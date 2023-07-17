// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SipTrunkDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SipTrunkDetailResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static SipTrunkDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SipTrunkDetailResponseBody self = new SipTrunkDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SipTrunkDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SipTrunkDetailResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SipTrunkDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SipTrunkDetailResponseBody setModel(SipTrunkDetailResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SipTrunkDetailResponseBodyModel getModel() {
        return this.model;
    }

    public SipTrunkDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SipTrunkDetailResponseBodyModelList extends TeaModel {
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

        @NameInMap("LvnCliType")
        public String lvnCliType;

        @NameInMap("RecordUrl")
        public String recordUrl;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UserUuid")
        public String userUuid;

        @NameInMap("Uuid")
        public String uuid;

        public static SipTrunkDetailResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            SipTrunkDetailResponseBodyModelList self = new SipTrunkDetailResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public SipTrunkDetailResponseBodyModelList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public SipTrunkDetailResponseBodyModelList setAnswered(Long answered) {
            this.answered = answered;
            return this;
        }
        public Long getAnswered() {
            return this.answered;
        }

        public SipTrunkDetailResponseBodyModelList setBusiType(String busiType) {
            this.busiType = busiType;
            return this;
        }
        public String getBusiType() {
            return this.busiType;
        }

        public SipTrunkDetailResponseBodyModelList setCallEndTime(String callEndTime) {
            this.callEndTime = callEndTime;
            return this;
        }
        public String getCallEndTime() {
            return this.callEndTime;
        }

        public SipTrunkDetailResponseBodyModelList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public SipTrunkDetailResponseBodyModelList setCalledIp(String calledIp) {
            this.calledIp = calledIp;
            return this;
        }
        public String getCalledIp() {
            return this.calledIp;
        }

        public SipTrunkDetailResponseBodyModelList setCalledNum(String calledNum) {
            this.calledNum = calledNum;
            return this;
        }
        public String getCalledNum() {
            return this.calledNum;
        }

        public SipTrunkDetailResponseBodyModelList setCalledNumRegion(String calledNumRegion) {
            this.calledNumRegion = calledNumRegion;
            return this;
        }
        public String getCalledNumRegion() {
            return this.calledNumRegion;
        }

        public SipTrunkDetailResponseBodyModelList setCalledNumType(String calledNumType) {
            this.calledNumType = calledNumType;
            return this;
        }
        public String getCalledNumType() {
            return this.calledNumType;
        }

        public SipTrunkDetailResponseBodyModelList setCallerDisplay(String callerDisplay) {
            this.callerDisplay = callerDisplay;
            return this;
        }
        public String getCallerDisplay() {
            return this.callerDisplay;
        }

        public SipTrunkDetailResponseBodyModelList setCallerIp(String callerIp) {
            this.callerIp = callerIp;
            return this;
        }
        public String getCallerIp() {
            return this.callerIp;
        }

        public SipTrunkDetailResponseBodyModelList setCallerNum(String callerNum) {
            this.callerNum = callerNum;
            return this;
        }
        public String getCallerNum() {
            return this.callerNum;
        }

        public SipTrunkDetailResponseBodyModelList setCallerNumRegion(String callerNumRegion) {
            this.callerNumRegion = callerNumRegion;
            return this;
        }
        public String getCallerNumRegion() {
            return this.callerNumRegion;
        }

        public SipTrunkDetailResponseBodyModelList setCallerNumType(String callerNumType) {
            this.callerNumType = callerNumType;
            return this;
        }
        public String getCallerNumType() {
            return this.callerNumType;
        }

        public SipTrunkDetailResponseBodyModelList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SipTrunkDetailResponseBodyModelList setHangup(Long hangup) {
            this.hangup = hangup;
            return this;
        }
        public Long getHangup() {
            return this.hangup;
        }

        public SipTrunkDetailResponseBodyModelList setHangupType(Long hangupType) {
            this.hangupType = hangupType;
            return this;
        }
        public Long getHangupType() {
            return this.hangupType;
        }

        public SipTrunkDetailResponseBodyModelList setLvnCliType(String lvnCliType) {
            this.lvnCliType = lvnCliType;
            return this;
        }
        public String getLvnCliType() {
            return this.lvnCliType;
        }

        public SipTrunkDetailResponseBodyModelList setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public SipTrunkDetailResponseBodyModelList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SipTrunkDetailResponseBodyModelList setUserUuid(String userUuid) {
            this.userUuid = userUuid;
            return this;
        }
        public String getUserUuid() {
            return this.userUuid;
        }

        public SipTrunkDetailResponseBodyModelList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class SipTrunkDetailResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<SipTrunkDetailResponseBodyModelList> list;

        @NameInMap("Total")
        public Long total;

        public static SipTrunkDetailResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SipTrunkDetailResponseBodyModel self = new SipTrunkDetailResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SipTrunkDetailResponseBodyModel setList(java.util.List<SipTrunkDetailResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SipTrunkDetailResponseBodyModelList> getList() {
            return this.list;
        }

        public SipTrunkDetailResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
