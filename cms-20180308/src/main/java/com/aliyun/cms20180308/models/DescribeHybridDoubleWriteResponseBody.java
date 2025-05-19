// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DescribeHybridDoubleWriteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7985D471-3FA8-4EE9-8F4B-45C19DF3D36F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeHybridDoubleWriteResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeHybridDoubleWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridDoubleWriteResponseBody self = new DescribeHybridDoubleWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridDoubleWriteResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHybridDoubleWriteResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHybridDoubleWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHybridDoubleWriteResponseBody setResult(java.util.List<DescribeHybridDoubleWriteResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeHybridDoubleWriteResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeHybridDoubleWriteResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeHybridDoubleWriteResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-target</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>test-source</p>
         */
        @NameInMap("SourceNamespace")
        public String sourceNamespace;

        /**
         * <strong>example:</strong>
         * <p>12706766**********</p>
         */
        @NameInMap("SourceUserId")
        public Long sourceUserId;

        /**
         * <strong>example:</strong>
         * <p>11234766**********</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static DescribeHybridDoubleWriteResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridDoubleWriteResponseBodyResult self = new DescribeHybridDoubleWriteResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeHybridDoubleWriteResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeHybridDoubleWriteResponseBodyResult setSourceNamespace(String sourceNamespace) {
            this.sourceNamespace = sourceNamespace;
            return this;
        }
        public String getSourceNamespace() {
            return this.sourceNamespace;
        }

        public DescribeHybridDoubleWriteResponseBodyResult setSourceUserId(Long sourceUserId) {
            this.sourceUserId = sourceUserId;
            return this;
        }
        public Long getSourceUserId() {
            return this.sourceUserId;
        }

        public DescribeHybridDoubleWriteResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
