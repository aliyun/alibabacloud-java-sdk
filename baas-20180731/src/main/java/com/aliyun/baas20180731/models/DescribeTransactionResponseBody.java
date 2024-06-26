// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeTransactionResponseBodyResult result;

    public static DescribeTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionResponseBody self = new DescribeTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransactionResponseBody setResult(DescribeTransactionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeTransactionResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeTransactionResponseBodyResultTransactionV10 extends TeaModel {
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

        @NameInMap("SignatureList")
        public java.util.List<String> signatureList;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("To")
        public String to;

        @NameInMap("TxType")
        public String txType;

        @NameInMap("Value")
        public String value;

        public static DescribeTransactionResponseBodyResultTransactionV10 build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionResponseBodyResultTransactionV10 self = new DescribeTransactionResponseBodyResultTransactionV10();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setExtentions(java.util.List<String> extentions) {
            this.extentions = extentions;
            return this;
        }
        public java.util.List<String> getExtentions() {
            return this.extentions;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setGas(String gas) {
            this.gas = gas;
            return this;
        }
        public String getGas() {
            return this.gas;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setSignatureList(java.util.List<String> signatureList) {
            this.signatureList = signatureList;
            return this;
        }
        public java.util.List<String> getSignatureList() {
            return this.signatureList;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setTxType(String txType) {
            this.txType = txType;
            return this;
        }
        public String getTxType() {
            return this.txType;
        }

        public DescribeTransactionResponseBodyResultTransactionV10 setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTransactionResponseBodyResult extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockHeight")
        public Long blockHeight;

        @NameInMap("BlockVersion")
        public Integer blockVersion;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentHash")
        public String contentHash;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("KeyWrap")
        public String keyWrap;

        @NameInMap("Nonce")
        public String nonce;

        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        @NameInMap("ReferenceList")
        public java.util.List<String> referenceList;

        @NameInMap("TransTypeV6")
        public String transTypeV6;

        @NameInMap("TransactionV10")
        public DescribeTransactionResponseBodyResultTransactionV10 transactionV10;

        public static DescribeTransactionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionResponseBodyResult self = new DescribeTransactionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeTransactionResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeTransactionResponseBodyResult setBlockVersion(Integer blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public Integer getBlockVersion() {
            return this.blockVersion;
        }

        public DescribeTransactionResponseBodyResult setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeTransactionResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeTransactionResponseBodyResult setContentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public String getContentHash() {
            return this.contentHash;
        }

        public DescribeTransactionResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTransactionResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeTransactionResponseBodyResult setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeTransactionResponseBodyResult setKeyWrap(String keyWrap) {
            this.keyWrap = keyWrap;
            return this;
        }
        public String getKeyWrap() {
            return this.keyWrap;
        }

        public DescribeTransactionResponseBodyResult setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeTransactionResponseBodyResult setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeTransactionResponseBodyResult setReferenceList(java.util.List<String> referenceList) {
            this.referenceList = referenceList;
            return this;
        }
        public java.util.List<String> getReferenceList() {
            return this.referenceList;
        }

        public DescribeTransactionResponseBodyResult setTransTypeV6(String transTypeV6) {
            this.transTypeV6 = transTypeV6;
            return this;
        }
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

        public DescribeTransactionResponseBodyResult setTransactionV10(DescribeTransactionResponseBodyResultTransactionV10 transactionV10) {
            this.transactionV10 = transactionV10;
            return this;
        }
        public DescribeTransactionResponseBodyResultTransactionV10 getTransactionV10() {
            return this.transactionV10;
        }

    }

}
