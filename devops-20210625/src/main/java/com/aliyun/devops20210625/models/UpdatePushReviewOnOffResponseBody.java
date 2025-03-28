// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePushReviewOnOffResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>6177543A-8D54-5736-A93B-E0195A1512CB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdatePushReviewOnOffResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdatePushReviewOnOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePushReviewOnOffResponseBody self = new UpdatePushReviewOnOffResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePushReviewOnOffResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdatePushReviewOnOffResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdatePushReviewOnOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePushReviewOnOffResponseBody setResult(UpdatePushReviewOnOffResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePushReviewOnOffResponseBodyResult getResult() {
        return this.result;
    }

    public UpdatePushReviewOnOffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdatePushReviewOnOffResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static UpdatePushReviewOnOffResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePushReviewOnOffResponseBodyResult self = new UpdatePushReviewOnOffResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePushReviewOnOffResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
