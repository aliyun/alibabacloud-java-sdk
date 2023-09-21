// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CheckSmsVerifyCodeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CheckSmsVerifyCodeResponseBodyModel model;

    @NameInMap("Success")
    public Boolean success;

    public static CheckSmsVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsVerifyCodeResponseBody self = new CheckSmsVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSmsVerifyCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckSmsVerifyCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckSmsVerifyCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckSmsVerifyCodeResponseBody setModel(CheckSmsVerifyCodeResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CheckSmsVerifyCodeResponseBodyModel getModel() {
        return this.model;
    }

    public CheckSmsVerifyCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckSmsVerifyCodeResponseBodyModel extends TeaModel {
        @NameInMap("OutId")
        public String outId;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CheckSmsVerifyCodeResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CheckSmsVerifyCodeResponseBodyModel self = new CheckSmsVerifyCodeResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CheckSmsVerifyCodeResponseBodyModel setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public CheckSmsVerifyCodeResponseBodyModel setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
