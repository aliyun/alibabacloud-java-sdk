// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UnRelatedSlsLogStoreResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UnRelatedSlsLogStoreResponseBodyResult result;

    @NameInMap("Success")
    public String success;

    public static UnRelatedSlsLogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnRelatedSlsLogStoreResponseBody self = new UnRelatedSlsLogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public UnRelatedSlsLogStoreResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UnRelatedSlsLogStoreResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnRelatedSlsLogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnRelatedSlsLogStoreResponseBody setResult(UnRelatedSlsLogStoreResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UnRelatedSlsLogStoreResponseBodyResult getResult() {
        return this.result;
    }

    public UnRelatedSlsLogStoreResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UnRelatedSlsLogStoreResponseBodyResult extends TeaModel {
        @NameInMap("UnRelatedResult")
        public Boolean unRelatedResult;

        public static UnRelatedSlsLogStoreResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UnRelatedSlsLogStoreResponseBodyResult self = new UnRelatedSlsLogStoreResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UnRelatedSlsLogStoreResponseBodyResult setUnRelatedResult(Boolean unRelatedResult) {
            this.unRelatedResult = unRelatedResult;
            return this;
        }
        public Boolean getUnRelatedResult() {
            return this.unRelatedResult;
        }

    }

}
