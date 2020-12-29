// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptResponseBody extends TeaModel {
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
        @NameInMap("Data")
        public String data;

        @NameInMap("Result")
        public Long result;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        @NameInMap("GasUsed")
        public String gasUsed;

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

        public DescribeAntChainTransactionReceiptResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public DescribeAntChainTransactionReceiptResponseBodyResult setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public String getGasUsed() {
            return this.gasUsed;
        }

    }

}
