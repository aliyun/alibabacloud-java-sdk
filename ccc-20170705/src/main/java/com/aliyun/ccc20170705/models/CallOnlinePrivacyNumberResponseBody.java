// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CallOnlinePrivacyNumberResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public CallOnlinePrivacyNumberResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CallOnlinePrivacyNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CallOnlinePrivacyNumberResponseBody self = new CallOnlinePrivacyNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public CallOnlinePrivacyNumberResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallOnlinePrivacyNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallOnlinePrivacyNumberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CallOnlinePrivacyNumberResponseBody setData(CallOnlinePrivacyNumberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CallOnlinePrivacyNumberResponseBodyData getData() {
        return this.data;
    }

    public CallOnlinePrivacyNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallOnlinePrivacyNumberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CallOnlinePrivacyNumberResponseBodyData extends TeaModel {
        @NameInMap("Represent")
        public String represent;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("CallId")
        public String callId;

        @NameInMap("DateCreated")
        public String dateCreated;

        @NameInMap("TelX")
        public String telX;

        public static CallOnlinePrivacyNumberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CallOnlinePrivacyNumberResponseBodyData self = new CallOnlinePrivacyNumberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CallOnlinePrivacyNumberResponseBodyData setRepresent(String represent) {
            this.represent = represent;
            return this;
        }
        public String getRepresent() {
            return this.represent;
        }

        public CallOnlinePrivacyNumberResponseBodyData setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CallOnlinePrivacyNumberResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CallOnlinePrivacyNumberResponseBodyData setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public String getDateCreated() {
            return this.dateCreated;
        }

        public CallOnlinePrivacyNumberResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
