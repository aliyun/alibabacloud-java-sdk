// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainTransactionReceiptNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainTransactionReceiptNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptNewResponseBody self = new DescribeAntChainTransactionReceiptNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setResult(DescribeAntChainTransactionReceiptNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionReceiptNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionReceiptNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionReceiptNewResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("GasUsed")
        public String gasUsed;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        @NameInMap("Result")
        public Long result;

        public static DescribeAntChainTransactionReceiptNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionReceiptNewResponseBodyResult self = new DescribeAntChainTransactionReceiptNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionReceiptNewResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionReceiptNewResponseBodyResult setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public String getGasUsed() {
            return this.gasUsed;
        }

        public DescribeAntChainTransactionReceiptNewResponseBodyResult setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public DescribeAntChainTransactionReceiptNewResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
