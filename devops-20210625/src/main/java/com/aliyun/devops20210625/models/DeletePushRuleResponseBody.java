// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeletePushRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParam.NotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DeletePushRuleResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static DeletePushRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePushRuleResponseBody self = new DeletePushRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePushRuleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeletePushRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeletePushRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePushRuleResponseBody setResult(DeletePushRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeletePushRuleResponseBodyResult getResult() {
        return this.result;
    }

    public DeletePushRuleResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DeletePushRuleResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static DeletePushRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeletePushRuleResponseBodyResult self = new DeletePushRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeletePushRuleResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
