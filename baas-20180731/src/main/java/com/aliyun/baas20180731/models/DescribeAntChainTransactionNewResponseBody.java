// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainTransactionNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainTransactionNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionNewResponseBody self = new DescribeAntChainTransactionNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionNewResponseBody setResult(DescribeAntChainTransactionNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionNewResponseBodyResultTransaction extends TeaModel {
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

        public static DescribeAntChainTransactionNewResponseBodyResultTransaction build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionNewResponseBodyResultTransaction self = new DescribeAntChainTransactionNewResponseBodyResultTransaction();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setExtentions(java.util.List<String> extentions) {
            this.extentions = extentions;
            return this;
        }
        public java.util.List<String> getExtentions() {
            return this.extentions;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setGas(String gas) {
            this.gas = gas;
            return this;
        }
        public String getGas() {
            return this.gas;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setSignatures(java.util.List<String> signatures) {
            this.signatures = signatures;
            return this;
        }
        public java.util.List<String> getSignatures() {
            return this.signatures;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setTxType(String txType) {
            this.txType = txType;
            return this;
        }
        public String getTxType() {
            return this.txType;
        }

        public DescribeAntChainTransactionNewResponseBodyResultTransaction setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAntChainTransactionNewResponseBodyResult extends TeaModel {
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
        public DescribeAntChainTransactionNewResponseBodyResultTransaction transaction;

        public static DescribeAntChainTransactionNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionNewResponseBodyResult self = new DescribeAntChainTransactionNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionNewResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainTransactionNewResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainTransactionNewResponseBodyResult setBlockVersion(String blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public String getBlockVersion() {
            return this.blockVersion;
        }

        public DescribeAntChainTransactionNewResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainTransactionNewResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionNewResponseBodyResult setTransaction(DescribeAntChainTransactionNewResponseBodyResultTransaction transaction) {
            this.transaction = transaction;
            return this;
        }
        public DescribeAntChainTransactionNewResponseBodyResultTransaction getTransaction() {
            return this.transaction;
        }

    }

}
