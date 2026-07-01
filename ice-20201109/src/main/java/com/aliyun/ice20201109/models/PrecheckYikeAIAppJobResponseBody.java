// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class PrecheckYikeAIAppJobResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned if the precheck fails. This parameter contains only the parameters that failed the check.</p>
     */
    @NameInMap("Result")
    public java.util.List<PrecheckYikeAIAppJobResponseBodyResult> result;

    /**
     * <p>The precheck result. Valid values are:</p>
     * <ul>
     * <li><p>Success: The precheck was successful.</p>
     * </li>
     * <li><p>Failed: The precheck failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    public static PrecheckYikeAIAppJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckYikeAIAppJobResponseBody self = new PrecheckYikeAIAppJobResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckYikeAIAppJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrecheckYikeAIAppJobResponseBody setResult(java.util.List<PrecheckYikeAIAppJobResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<PrecheckYikeAIAppJobResponseBodyResult> getResult() {
        return this.result;
    }

    public PrecheckYikeAIAppJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class PrecheckYikeAIAppJobResponseBodyResult extends TeaModel {
        /**
         * <p>The cause of the parameter validation error.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageCheckFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The application parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>LoadImage.1.TargetImage</p>
         */
        @NameInMap("Key")
        public String key;

        public static PrecheckYikeAIAppJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PrecheckYikeAIAppJobResponseBodyResult self = new PrecheckYikeAIAppJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PrecheckYikeAIAppJobResponseBodyResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PrecheckYikeAIAppJobResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
