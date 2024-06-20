// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptV2ResponseBody extends TeaModel {
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
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainTransactionReceiptV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainTransactionReceiptV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptV2ResponseBody self = new DescribeAntChainTransactionReceiptV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setResult(DescribeAntChainTransactionReceiptV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionReceiptV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionReceiptV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionReceiptV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("GasUsed")
        public String gasUsed;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static DescribeAntChainTransactionReceiptV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionReceiptV2ResponseBodyResult self = new DescribeAntChainTransactionReceiptV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionReceiptV2ResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionReceiptV2ResponseBodyResult setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public String getGasUsed() {
            return this.gasUsed;
        }

        public DescribeAntChainTransactionReceiptV2ResponseBodyResult setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public DescribeAntChainTransactionReceiptV2ResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
