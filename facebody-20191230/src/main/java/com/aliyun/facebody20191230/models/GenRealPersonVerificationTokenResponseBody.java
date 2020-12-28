// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenRealPersonVerificationTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GenRealPersonVerificationTokenResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GenRealPersonVerificationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenRealPersonVerificationTokenResponseBody self = new GenRealPersonVerificationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenRealPersonVerificationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenRealPersonVerificationTokenResponseBody setData(GenRealPersonVerificationTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenRealPersonVerificationTokenResponseBodyData getData() {
        return this.data;
    }

    public GenRealPersonVerificationTokenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenRealPersonVerificationTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenRealPersonVerificationTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenRealPersonVerificationTokenResponseBodyData extends TeaModel {
        @NameInMap("VerificationToken")
        public String verificationToken;

        public static GenRealPersonVerificationTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenRealPersonVerificationTokenResponseBodyData self = new GenRealPersonVerificationTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenRealPersonVerificationTokenResponseBodyData setVerificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }
        public String getVerificationToken() {
            return this.verificationToken;
        }

    }

}
