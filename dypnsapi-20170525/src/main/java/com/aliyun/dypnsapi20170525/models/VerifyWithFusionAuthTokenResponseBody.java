// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyWithFusionAuthTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public VerifyWithFusionAuthTokenResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static VerifyWithFusionAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyWithFusionAuthTokenResponseBody self = new VerifyWithFusionAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyWithFusionAuthTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyWithFusionAuthTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyWithFusionAuthTokenResponseBody setModel(VerifyWithFusionAuthTokenResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public VerifyWithFusionAuthTokenResponseBodyModel getModel() {
        return this.model;
    }

    public VerifyWithFusionAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyWithFusionAuthTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyWithFusionAuthTokenResponseBodyModel extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("PhoneScore")
        public Long phoneScore;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static VerifyWithFusionAuthTokenResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            VerifyWithFusionAuthTokenResponseBodyModel self = new VerifyWithFusionAuthTokenResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public VerifyWithFusionAuthTokenResponseBodyModel setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public VerifyWithFusionAuthTokenResponseBodyModel setPhoneScore(Long phoneScore) {
            this.phoneScore = phoneScore;
            return this;
        }
        public Long getPhoneScore() {
            return this.phoneScore;
        }

        public VerifyWithFusionAuthTokenResponseBodyModel setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
