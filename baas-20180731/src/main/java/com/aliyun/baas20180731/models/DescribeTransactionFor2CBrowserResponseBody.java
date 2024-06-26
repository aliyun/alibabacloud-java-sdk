// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTransactionFor2CBrowserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeTransactionFor2CBrowserResponseBodyResult result;

    public static DescribeTransactionFor2CBrowserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransactionFor2CBrowserResponseBody self = new DescribeTransactionFor2CBrowserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransactionFor2CBrowserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransactionFor2CBrowserResponseBody setResult(DescribeTransactionFor2CBrowserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeTransactionFor2CBrowserResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 extends TeaModel {
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

        public static DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 self = new DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setExtentions(java.util.List<String> extentions) {
            this.extentions = extentions;
            return this;
        }
        public java.util.List<String> getExtentions() {
            return this.extentions;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setGas(String gas) {
            this.gas = gas;
            return this;
        }
        public String getGas() {
            return this.gas;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setPeriod(Long period) {
            this.period = period;
            return this;
        }
        public Long getPeriod() {
            return this.period;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setSignatureList(java.util.List<String> signatureList) {
            this.signatureList = signatureList;
            return this;
        }
        public java.util.List<String> getSignatureList() {
            return this.signatureList;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setTxType(String txType) {
            this.txType = txType;
            return this;
        }
        public String getTxType() {
            return this.txType;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTransactionFor2CBrowserResponseBodyResult extends TeaModel {
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
        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 transactionV10;

        public static DescribeTransactionFor2CBrowserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransactionFor2CBrowserResponseBodyResult self = new DescribeTransactionFor2CBrowserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setBlockVersion(Integer blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public Integer getBlockVersion() {
            return this.blockVersion;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setContentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public String getContentHash() {
            return this.contentHash;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setKeyWrap(String keyWrap) {
            this.keyWrap = keyWrap;
            return this;
        }
        public String getKeyWrap() {
            return this.keyWrap;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setReferenceList(java.util.List<String> referenceList) {
            this.referenceList = referenceList;
            return this;
        }
        public java.util.List<String> getReferenceList() {
            return this.referenceList;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setTransTypeV6(String transTypeV6) {
            this.transTypeV6 = transTypeV6;
            return this;
        }
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

        public DescribeTransactionFor2CBrowserResponseBodyResult setTransactionV10(DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 transactionV10) {
            this.transactionV10 = transactionV10;
            return this;
        }
        public DescribeTransactionFor2CBrowserResponseBodyResultTransactionV10 getTransactionV10() {
            return this.transactionV10;
        }

    }

}
