// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class IsSlsUserAuthrizedCodeupResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public IsSlsUserAuthrizedCodeupResponseBodyResult result;

    @NameInMap("Success")
    public String success;

    public static IsSlsUserAuthrizedCodeupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsSlsUserAuthrizedCodeupResponseBody self = new IsSlsUserAuthrizedCodeupResponseBody();
        return TeaModel.build(map, self);
    }

    public IsSlsUserAuthrizedCodeupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public IsSlsUserAuthrizedCodeupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public IsSlsUserAuthrizedCodeupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IsSlsUserAuthrizedCodeupResponseBody setResult(IsSlsUserAuthrizedCodeupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public IsSlsUserAuthrizedCodeupResponseBodyResult getResult() {
        return this.result;
    }

    public IsSlsUserAuthrizedCodeupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class IsSlsUserAuthrizedCodeupResponseBodyResult extends TeaModel {
        @NameInMap("authrized")
        public Boolean authrized;

        public static IsSlsUserAuthrizedCodeupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            IsSlsUserAuthrizedCodeupResponseBodyResult self = new IsSlsUserAuthrizedCodeupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public IsSlsUserAuthrizedCodeupResponseBodyResult setAuthrized(Boolean authrized) {
            this.authrized = authrized;
            return this;
        }
        public Boolean getAuthrized() {
            return this.authrized;
        }

    }

}
