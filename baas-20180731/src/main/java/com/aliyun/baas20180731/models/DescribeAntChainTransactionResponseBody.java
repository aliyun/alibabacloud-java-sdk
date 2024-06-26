// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainTransactionResponseBodyResult result;

    public static DescribeAntChainTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionResponseBody self = new DescribeAntChainTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionResponseBody setResult(DescribeAntChainTransactionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainTransactionResponseBodyResultTransaction extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Extentions")
        public java.util.List<String> extentions;

        @NameInMap("From")
        public String from;

        @NameInMap("Gas")
        public String gas;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("Period")
        public Long period;

        @NameInMap("Signatures")
        public java.util.List<String> signatures;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("To")
        public String to;

        @NameInMap("TxType")
        public String txType;

        @NameInMap("Value")
        public String value;

        public static DescribeAntChainTransactionResponseBodyResultTransaction build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionResponseBodyResultTransaction self = new DescribeAntChainTransactionResponseBodyResultTransaction();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setExtentions(java.util.List<String> extentions) {
            this.extentions = extentions;
            return this;
        }
        public java.util.List<String> getExtentions() {
            return this.extentions;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setGas(String gas) {
            this.gas = gas;
            return this;
        }
        public String getGas() {
            return this.gas;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setSignatures(java.util.List<String> signatures) {
            this.signatures = signatures;
            return this;
        }
        public java.util.List<String> getSignatures() {
            return this.signatures;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setTxType(String txType) {
            this.txType = txType;
            return this;
        }
        public String getTxType() {
            return this.txType;
        }

        public DescribeAntChainTransactionResponseBodyResultTransaction setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAntChainTransactionResponseBodyResult extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("BlockVersion")
        public String blockVersion;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("Transaction")
        public DescribeAntChainTransactionResponseBodyResultTransaction transaction;

        public static DescribeAntChainTransactionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionResponseBodyResult self = new DescribeAntChainTransactionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainTransactionResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainTransactionResponseBodyResult setBlockVersion(String blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public String getBlockVersion() {
            return this.blockVersion;
        }

        public DescribeAntChainTransactionResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainTransactionResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionResponseBodyResult setTransaction(DescribeAntChainTransactionResponseBodyResultTransaction transaction) {
            this.transaction = transaction;
            return this;
        }
        public DescribeAntChainTransactionResponseBodyResultTransaction getTransaction() {
            return this.transaction;
        }

    }

}
