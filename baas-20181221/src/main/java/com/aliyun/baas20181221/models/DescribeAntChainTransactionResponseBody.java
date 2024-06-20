// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7DCE6520-E5DB-4859-90AC-BDDB8A5501C6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("Data")
        public String data;

        @NameInMap("Extentions")
        public java.util.List<String> extentions;

        /**
         * <strong>example:</strong>
         * <p>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("Gas")
        public String gas;

        /**
         * <strong>example:</strong>
         * <p>b3b0d2db83d3e670449d1e2a39d1d13b7e0e6080b0f9c6945f79eca68d1dd2ca</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <strong>example:</strong>
         * <p>5675407026657953619</p>
         */
        @NameInMap("Nonce")
        public String nonce;

        /**
         * <p>Period</p>
         * 
         * <strong>example:</strong>
         * <p>1563954336850</p>
         */
        @NameInMap("Period")
        public Long period;

        @NameInMap("Signatures")
        public java.util.List<String> signatures;

        /**
         * <strong>example:</strong>
         * <p>1563954336850</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>961085f3c7ef705ad587d0cbe11d7863a5a11af7451f4e9b1edadd74402addf5</p>
         */
        @NameInMap("To")
        public String to;

        /**
         * <strong>example:</strong>
         * <p>UNFREEZE_ACCOUNT_CONTRACT</p>
         */
        @NameInMap("TxType")
        public String txType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1168bc5dd0b78d15446b15ea5a7f7822a7d07c007dd3a50becf98da220fc08f6</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>368169</p>
         */
        @NameInMap("BlockHeight")
        public Long blockHeight;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BlockVersion")
        public String blockVersion;

        /**
         * <strong>example:</strong>
         * <p>1563954336850</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>b3b0d2db83d3e670449d1e2a39d1d13b7e0e6080b0f9c6945f79eca68d1dd2ca</p>
         */
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
