// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsVerifyCodeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public SendSmsVerifyCodeResponseBodyModel model;

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
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("OutId")
        public String outId;

        @NameInMap("RequestId")
        public String requestId;

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
