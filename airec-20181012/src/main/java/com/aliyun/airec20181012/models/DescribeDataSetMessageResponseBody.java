// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeDataSetMessageResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<DescribeDataSetMessageResponseBodyResult> result;

    public static DescribeDataSetMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSetMessageResponseBody self = new DescribeDataSetMessageResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeDataSetMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDataSetMessageResponseBody setResult(java.util.List<DescribeDataSetMessageResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDataSetMessageResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeDataSetMessageResponseBodyResult extends TeaModel {
        @NameInMap("ErrorLevel")
        public String errorLevel;

        @NameInMap("Message")
        public String message;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("ErrorType")
        public String errorType;

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

        public DescribeDataSetMessageResponseBodyResult setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

    }

}
