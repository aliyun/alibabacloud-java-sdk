// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitBatchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubmitResult")
    public SubmitBatchTaskResponseBodySubmitResult submitResult;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchTaskResponseBody self = new SubmitBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitBatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitBatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBatchTaskResponseBody setSubmitResult(SubmitBatchTaskResponseBodySubmitResult submitResult) {
        this.submitResult = submitResult;
        return this;
    }
    public SubmitBatchTaskResponseBodySubmitResult getSubmitResult() {
        return this.submitResult;
    }

    public SubmitBatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitBatchTaskResponseBodySubmitResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>n_12113111</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1010312911</p>
         */
        @NameInMap("SubmitId")
        public Long submitId;

        public static SubmitBatchTaskResponseBodySubmitResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchTaskResponseBodySubmitResult self = new SubmitBatchTaskResponseBodySubmitResult();
            return TeaModel.build(map, self);
        }

        public SubmitBatchTaskResponseBodySubmitResult setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public SubmitBatchTaskResponseBodySubmitResult setSubmitId(Long submitId) {
            this.submitId = submitId;
            return this;
        }
        public Long getSubmitId() {
            return this.submitId;
        }

    }

}
