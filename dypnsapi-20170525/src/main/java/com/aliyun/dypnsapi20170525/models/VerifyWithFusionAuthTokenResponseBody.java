// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyWithFusionAuthTokenResponseBody extends TeaModel {
    /**
     * <p>The response code. If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Model")
    public VerifyWithFusionAuthTokenResponseBodyModel model;

    /**
     * <p>The request ID, which is used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The phone number, which is returned when the verification is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>180********</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The phone number score, which is generated only after the phone number scoring node is enabled and the verification is successful. The higher the score, the more risky the phone number. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PhoneScore")
        public Long phoneScore;

        /**
         * <p>The verification result. Valid values: PASS and UNKNOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
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
