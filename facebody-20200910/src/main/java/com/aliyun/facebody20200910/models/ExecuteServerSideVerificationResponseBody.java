// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910.models;

import com.aliyun.tea.*;

public class ExecuteServerSideVerificationResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExecuteServerSideVerificationResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteServerSideVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteServerSideVerificationResponseBody self = new ExecuteServerSideVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteServerSideVerificationResponseBody setData(ExecuteServerSideVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecuteServerSideVerificationResponseBodyData getData() {
        return this.data;
    }

    public ExecuteServerSideVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteServerSideVerificationResponseBodyData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("VerificationToken")
        public String verificationToken;

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

        public ExecuteServerSideVerificationResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ExecuteServerSideVerificationResponseBodyData setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

}
