// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSipCallRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSipCallRecordsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSipCallRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipCallRecordsResponseBody self = new ListSipCallRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipCallRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipCallRecordsResponseBody setData(java.util.List<ListSipCallRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSipCallRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListSipCallRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSipCallRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipCallRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSipCallRecordsResponseBodyData extends TeaModel {
        @NameInMap("CallId")
        public String callId;

        @NameInMap("Callee")
        public String callee;

        @NameInMap("CalleeClusterId")
        public String calleeClusterId;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("CallerClusterId")
        public String callerClusterId;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("EarlyMediaText")
        public String earlyMediaText;

        @NameInMap("EarlyMediaUrl")
        public String earlyMediaUrl;

        @NameInMap("EstablishedTime")
        public Long establishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InviteTime")
        public Long inviteTime;

        @NameInMap("LastResponseCode")
        public Integer lastResponseCode;

        @NameInMap("LastResponseText")
        public String lastResponseText;

        @NameInMap("ReleaseReasonCode")
        public Integer releaseReasonCode;

        @NameInMap("ReleasedTime")
        public Long releasedTime;

        @NameInMap("RingTime")
        public Long ringTime;

        public static ListSipCallRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSipCallRecordsResponseBodyData self = new ListSipCallRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSipCallRecordsResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListSipCallRecordsResponseBodyData setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListSipCallRecordsResponseBodyData setCalleeClusterId(String calleeClusterId) {
            this.calleeClusterId = calleeClusterId;
            return this;
        }
        public String getCalleeClusterId() {
            return this.calleeClusterId;
        }

        public ListSipCallRecordsResponseBodyData setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListSipCallRecordsResponseBodyData setCallerClusterId(String callerClusterId) {
            this.callerClusterId = callerClusterId;
            return this;
        }
        public String getCallerClusterId() {
            return this.callerClusterId;
        }

        public ListSipCallRecordsResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListSipCallRecordsResponseBodyData setEarlyMediaText(String earlyMediaText) {
            this.earlyMediaText = earlyMediaText;
            return this;
        }
        public String getEarlyMediaText() {
            return this.earlyMediaText;
        }

        public ListSipCallRecordsResponseBodyData setEarlyMediaUrl(String earlyMediaUrl) {
            this.earlyMediaUrl = earlyMediaUrl;
            return this;
        }
        public String getEarlyMediaUrl() {
            return this.earlyMediaUrl;
        }

        public ListSipCallRecordsResponseBodyData setEstablishedTime(Long establishedTime) {
            this.establishedTime = establishedTime;
            return this;
        }
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        public ListSipCallRecordsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSipCallRecordsResponseBodyData setInviteTime(Long inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public Long getInviteTime() {
            return this.inviteTime;
        }

        public ListSipCallRecordsResponseBodyData setLastResponseCode(Integer lastResponseCode) {
            this.lastResponseCode = lastResponseCode;
            return this;
        }
        public Integer getLastResponseCode() {
            return this.lastResponseCode;
        }

        public ListSipCallRecordsResponseBodyData setLastResponseText(String lastResponseText) {
            this.lastResponseText = lastResponseText;
            return this;
        }
        public String getLastResponseText() {
            return this.lastResponseText;
        }

        public ListSipCallRecordsResponseBodyData setReleaseReasonCode(Integer releaseReasonCode) {
            this.releaseReasonCode = releaseReasonCode;
            return this;
        }
        public Integer getReleaseReasonCode() {
            return this.releaseReasonCode;
        }

        public ListSipCallRecordsResponseBodyData setReleasedTime(Long releasedTime) {
            this.releasedTime = releasedTime;
            return this;
        }
        public Long getReleasedTime() {
            return this.releasedTime;
        }

        public ListSipCallRecordsResponseBodyData setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

    }

}
