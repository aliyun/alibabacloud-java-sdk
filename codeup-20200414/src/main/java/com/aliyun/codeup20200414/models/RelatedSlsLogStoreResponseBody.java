// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class RelatedSlsLogStoreResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public RelatedSlsLogStoreResponseBodyResult result;

    @NameInMap("Success")
    public String success;

    public static RelatedSlsLogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RelatedSlsLogStoreResponseBody self = new RelatedSlsLogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public RelatedSlsLogStoreResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RelatedSlsLogStoreResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RelatedSlsLogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RelatedSlsLogStoreResponseBody setResult(RelatedSlsLogStoreResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RelatedSlsLogStoreResponseBodyResult getResult() {
        return this.result;
    }

    public RelatedSlsLogStoreResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class RelatedSlsLogStoreResponseBodyResult extends TeaModel {
        @NameInMap("RelatedResult")
        public Boolean relatedResult;

        public static RelatedSlsLogStoreResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RelatedSlsLogStoreResponseBodyResult self = new RelatedSlsLogStoreResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RelatedSlsLogStoreResponseBodyResult setRelatedResult(Boolean relatedResult) {
            this.relatedResult = relatedResult;
            return this;
        }
        public Boolean getRelatedResult() {
            return this.relatedResult;
        }

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
