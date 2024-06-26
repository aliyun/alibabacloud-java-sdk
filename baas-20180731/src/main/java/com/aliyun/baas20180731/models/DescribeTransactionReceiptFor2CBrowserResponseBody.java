// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionReceiptFor2CBrowserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeTransactionReceiptFor2CBrowserResponseBodyResult result;

    public static DescribeTransactionReceiptFor2CBrowserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionReceiptFor2CBrowserResponseBody self = new DescribeTransactionReceiptFor2CBrowserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionReceiptFor2CBrowserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransactionReceiptFor2CBrowserResponseBody setResult(DescribeTransactionReceiptFor2CBrowserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeTransactionReceiptFor2CBrowserResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeTransactionReceiptFor2CBrowserResponseBodyResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("GasUsed")
        public String gasUsed;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        @NameInMap("Result")
        public Long result;

        public static DescribeTransactionReceiptFor2CBrowserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionReceiptFor2CBrowserResponseBodyResult self = new DescribeTransactionReceiptFor2CBrowserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionReceiptFor2CBrowserResponseBodyResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTransactionReceiptFor2CBrowserResponseBodyResult setGasUsed(String gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public String getGasUsed() {
            return this.gasUsed;
        }

        public DescribeTransactionReceiptFor2CBrowserResponseBodyResult setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public DescribeTransactionReceiptFor2CBrowserResponseBodyResult setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
