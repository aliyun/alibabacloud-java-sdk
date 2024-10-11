// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeDataSetMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<DescribeDataSetMessageResponseBodyResult> result;

    public static DescribeDataSetMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetMessageResponseBody self = new DescribeDataSetMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataSetMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDataSetMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDataSetMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataSetMessageResponseBody setResult(java.util.List<DescribeDataSetMessageResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDataSetMessageResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeDataSetMessageResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>warn</p>
         */
        @NameInMap("errorLevel")
        public String errorLevel;

        @NameInMap("errorType")
        public String errorType;

        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>20181211 17:27:44</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static DescribeDataSetMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataSetMessageResponseBodyResult self = new DescribeDataSetMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataSetMessageResponseBodyResult setErrorLevel(String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public String getErrorLevel() {
            return this.errorLevel;
        }

        public DescribeDataSetMessageResponseBodyResult setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeDataSetMessageResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDataSetMessageResponseBodyResult setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
