// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsVerifyCodeResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. If OK is returned, the request is successful. For more information, see [Response codes](https://help.aliyun.com/zh/pnvs/developer-reference/api-return-code?spm=a2c4g.11174283.0.0.70c5616bkj38Wa).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Model")
    public SendSmsVerifyCodeResponseBodyModel model;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SendSmsVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendSmsVerifyCodeResponseBody self = new SendSmsVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SendSmsVerifyCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SendSmsVerifyCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendSmsVerifyCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendSmsVerifyCodeResponseBody setModel(SendSmsVerifyCodeResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public SendSmsVerifyCodeResponseBodyModel getModel() {
        return this.model;
    }

    public SendSmsVerifyCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendSmsVerifyCodeResponseBodyModel extends TeaModel {
        /**
         * <p>The business ID.</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The external ID.</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The request ID.</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The verification code.</p>
         */
        @NameInMap("VerifyCode")
        public String verifyCode;

        public static SendSmsVerifyCodeResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            SendSmsVerifyCodeResponseBodyModel self = new SendSmsVerifyCodeResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public SendSmsVerifyCodeResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public SendSmsVerifyCodeResponseBodyModel setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public SendSmsVerifyCodeResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SendSmsVerifyCodeResponseBodyModel setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

    }

}
