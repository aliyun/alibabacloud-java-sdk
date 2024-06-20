// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9EC8FDC1-ED32-4EC0-AEC2-AFAA906ADBAB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainTransactionReceiptResponseBodyResult result;

    public static DescribeAntChainTransactionReceiptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptResponseBody self = new DescribeAntChainTransactionReceiptResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionReceiptResponseBody setResult(DescribeAntChainTransactionReceiptResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionReceiptResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainTransactionReceiptResponseBodyResult extends TeaModel {
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

        public static DescribeAntChainTransactionReceiptResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionReceiptResponseBodyResult self = new DescribeAntChainTransactionReceiptResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public String getGasUsed() {
            return this.gasUsed;
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
