// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallEventDetailByContactIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCallEventDetailByContactIdResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCallEventDetailByContactIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallEventDetailByContactIdResponseBody self = new ListCallEventDetailByContactIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallEventDetailByContactIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallEventDetailByContactIdResponseBody setData(ListCallEventDetailByContactIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallEventDetailByContactIdResponseBodyData getData() {
        return this.data;
    }

    public ListCallEventDetailByContactIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallEventDetailByContactIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallEventDetailByContactIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallEventDetailByContactIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("HangUper")
        public String hangUper;

        @NameInMap("Helper")
        public String helper;

        @NameInMap("SatisfactionalResearch")
        public String satisfactionalResearch;

        @NameInMap("SkillGroup")
        public String skillGroup;

        public static ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData build(java.util.Map<String, ?> map) throws Exception {
            ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData self = new ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData();
            return TeaModel.build(map, self);
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData setHangUper(String hangUper) {
            this.hangUper = hangUper;
            return this;
        }
        public String getHangUper() {
            return this.hangUper;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData setHelper(String helper) {
            this.helper = helper;
            return this;
        }
        public String getHelper() {
            return this.helper;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData setSatisfactionalResearch(String satisfactionalResearch) {
            this.satisfactionalResearch = satisfactionalResearch;
            return this;
        }
        public String getSatisfactionalResearch() {
            return this.satisfactionalResearch;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData setSkillGroup(String skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public String getSkillGroup() {
            return this.skillGroup;
        }

    }

    public static class ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail extends TeaModel {
        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("CallMode")
        public String callMode;

        @NameInMap("DetailData")
        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData detailData;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Event")
        public String event;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail build(java.util.Map<String, ?> map) throws Exception {
            ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail self = new ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail();
            return TeaModel.build(map, self);
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setCallMode(String callMode) {
            this.callMode = callMode;
            return this;
        }
        public String getCallMode() {
            return this.callMode;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setDetailData(ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData detailData) {
            this.detailData = detailData;
            return this;
        }
        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetailDetailData getDetailData() {
            return this.detailData;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class ListCallEventDetailByContactIdResponseBodyDataEvents extends TeaModel {
        @NameInMap("CallEventDetail")
        public java.util.List<ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail> callEventDetail;

        public static ListCallEventDetailByContactIdResponseBodyDataEvents build(java.util.Map<String, ?> map) throws Exception {
            ListCallEventDetailByContactIdResponseBodyDataEvents self = new ListCallEventDetailByContactIdResponseBodyDataEvents();
            return TeaModel.build(map, self);
        }

        public ListCallEventDetailByContactIdResponseBodyDataEvents setCallEventDetail(java.util.List<ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail> callEventDetail) {
            this.callEventDetail = callEventDetail;
            return this;
        }
        public java.util.List<ListCallEventDetailByContactIdResponseBodyDataEventsCallEventDetail> getCallEventDetail() {
            return this.callEventDetail;
        }

    }

    public static class ListCallEventDetailByContactIdResponseBodyData extends TeaModel {
        @NameInMap("CallType")
        public String callType;

        @NameInMap("Callee")
        public String callee;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("Events")
        public ListCallEventDetailByContactIdResponseBodyDataEvents events;

        @NameInMap("PrivacyNumber")
        public String privacyNumber;

        @NameInMap("ReleaseAgent")
        public String releaseAgent;

        @NameInMap("ReleaseReason")
        public String releaseReason;

        @NameInMap("StartTime")
        public String startTime;

        public static ListCallEventDetailByContactIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallEventDetailByContactIdResponseBodyData self = new ListCallEventDetailByContactIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallEventDetailByContactIdResponseBodyData setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ListCallEventDetailByContactIdResponseBodyData setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListCallEventDetailByContactIdResponseBodyData setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListCallEventDetailByContactIdResponseBodyData setEvents(ListCallEventDetailByContactIdResponseBodyDataEvents events) {
            this.events = events;
            return this;
        }
        public ListCallEventDetailByContactIdResponseBodyDataEvents getEvents() {
            return this.events;
        }

        public ListCallEventDetailByContactIdResponseBodyData setPrivacyNumber(String privacyNumber) {
            this.privacyNumber = privacyNumber;
            return this;
        }
        public String getPrivacyNumber() {
            return this.privacyNumber;
        }

        public ListCallEventDetailByContactIdResponseBodyData setReleaseAgent(String releaseAgent) {
            this.releaseAgent = releaseAgent;
            return this;
        }
        public String getReleaseAgent() {
            return this.releaseAgent;
        }

        public ListCallEventDetailByContactIdResponseBodyData setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ListCallEventDetailByContactIdResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
