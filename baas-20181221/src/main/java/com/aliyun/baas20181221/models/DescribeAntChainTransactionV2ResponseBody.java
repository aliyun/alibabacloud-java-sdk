// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionV2ResponseBody extends TeaModel {
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
    public DescribeAntChainTransactionV2ResponseBodyResult result;

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

    public static DescribeAntChainTransactionV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionV2ResponseBody self = new DescribeAntChainTransactionV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainTransactionV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainTransactionV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainTransactionV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainTransactionV2ResponseBody setResult(DescribeAntChainTransactionV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainTransactionV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainTransactionV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainTransactionV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainTransactionV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainTransactionV2ResponseBodyResultTransaction extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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

        public static DescribeAntChainTransactionV2ResponseBodyResultTransaction build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionV2ResponseBodyResultTransaction self = new DescribeAntChainTransactionV2ResponseBodyResultTransaction();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setExtentions(java.util.List<String> extentions) {
            this.extentions = extentions;
            return this;
        }
        public java.util.List<String> getExtentions() {
            return this.extentions;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setGas(String gas) {
            this.gas = gas;
            return this;
        }
        public String getGas() {
            return this.gas;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setSignatures(java.util.List<String> signatures) {
            this.signatures = signatures;
            return this;
        }
        public java.util.List<String> getSignatures() {
            return this.signatures;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setTxType(String txType) {
            this.txType = txType;
            return this;
        }
        public String getTxType() {
            return this.txType;
        }

        public DescribeAntChainTransactionV2ResponseBodyResultTransaction setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAntChainTransactionV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1168bc5dd0b78d15446b15ea5a7f7822a7d07c007dd3a50becf98da220fc08f6</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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
        public DescribeAntChainTransactionV2ResponseBodyResultTransaction transaction;

        public static DescribeAntChainTransactionV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainTransactionV2ResponseBodyResult self = new DescribeAntChainTransactionV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setBlockVersion(String blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public String getBlockVersion() {
            return this.blockVersion;
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainTransactionV2ResponseBodyResult setTransaction(DescribeAntChainTransactionV2ResponseBodyResultTransaction transaction) {
            this.transaction = transaction;
            return this;
        }
        public DescribeAntChainTransactionV2ResponseBodyResultTransaction getTransaction() {
            return this.transaction;
        }

    }

}
