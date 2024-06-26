// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryTransactionResponseBodyResult result;

    public static QueryTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTransactionResponseBody self = new QueryTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTransactionResponseBody setResult(QueryTransactionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryTransactionResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryTransactionResponseBodyResultReferenceList extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Length")
        public Integer length;

        @NameInMap("Type")
        public Integer type;

        public static QueryTransactionResponseBodyResultReferenceList build(java.util.Map<String, ?> map) throws Exception {
            QueryTransactionResponseBodyResultReferenceList self = new QueryTransactionResponseBodyResultReferenceList();
            return TeaModel.build(map, self);
        }

        public QueryTransactionResponseBodyResultReferenceList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryTransactionResponseBodyResultReferenceList setLength(Integer length) {
            this.length = length;
            return this;
        }
        public Integer getLength() {
            return this.length;
        }

        public QueryTransactionResponseBodyResultReferenceList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryTransactionResponseBodyResult extends TeaModel {
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
        public QueryTransactionResponseBodyResultReferenceList referenceList;

        @NameInMap("Type")
        public Integer type;

        public static QueryTransactionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTransactionResponseBodyResult self = new QueryTransactionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryTransactionResponseBodyResult setBlockHeight(Long blockHeight) {
            this.blockHeight = blockHeight;
            return this;
        }
        public Long getBlockHeight() {
            return this.blockHeight;
        }

        public QueryTransactionResponseBodyResult setBlockVersion(Integer blockVersion) {
            this.blockVersion = blockVersion;
            return this;
        }
        public Integer getBlockVersion() {
            return this.blockVersion;
        }

        public QueryTransactionResponseBodyResult setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public QueryTransactionResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryTransactionResponseBodyResult setContentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public String getContentHash() {
            return this.contentHash;
        }

        public QueryTransactionResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryTransactionResponseBodyResult setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public QueryTransactionResponseBodyResult setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public QueryTransactionResponseBodyResult setKeyWrap(String keyWrap) {
            this.keyWrap = keyWrap;
            return this;
        }
        public String getKeyWrap() {
            return this.keyWrap;
        }

        public QueryTransactionResponseBodyResult setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public QueryTransactionResponseBodyResult setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public QueryTransactionResponseBodyResult setReferenceList(QueryTransactionResponseBodyResultReferenceList referenceList) {
            this.referenceList = referenceList;
            return this;
        }
        public QueryTransactionResponseBodyResultReferenceList getReferenceList() {
            return this.referenceList;
        }

        public QueryTransactionResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
