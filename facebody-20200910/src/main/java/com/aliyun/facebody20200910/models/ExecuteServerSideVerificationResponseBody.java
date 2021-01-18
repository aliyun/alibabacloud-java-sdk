// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class ExecuteServerSideVerificationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ExecuteServerSideVerificationResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static ExecuteServerSideVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteServerSideVerificationResponseBody self = new ExecuteServerSideVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteServerSideVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteServerSideVerificationResponseBody setData(ExecuteServerSideVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteServerSideVerificationResponseBodyData getData() {
        return this.data;
    }

    public ExecuteServerSideVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteServerSideVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class ExecuteServerSideVerificationResponseBodyData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("VerificationToken")
        public String verificationToken;

        @NameInMap("Reason")
        public String reason;

        public static ExecuteServerSideVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecuteServerSideVerificationResponseBodyData self = new ExecuteServerSideVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecuteServerSideVerificationResponseBodyData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public ExecuteServerSideVerificationResponseBodyData setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public ExecuteServerSideVerificationResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
