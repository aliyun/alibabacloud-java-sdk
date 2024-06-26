// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryBlockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryBlockResponseBodyResult result;

    public static QueryBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockResponseBody self = new QueryBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBlockResponseBody setResult(QueryBlockResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryBlockResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryBlockResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("PreviousHash")
        public String previousHash;

        @NameInMap("RootTxHash")
        public String rootTxHash;

        @NameInMap("TransSummaryList")
        public String transSummaryList;

        @NameInMap("TransactionSize")
        public Integer transactionSize;

        public static QueryBlockResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockResponseBodyResult self = new QueryBlockResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryBlockResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryBlockResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public QueryBlockResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryBlockResponseBodyResult setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public QueryBlockResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public QueryBlockResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public QueryBlockResponseBodyResult setTransSummaryList(String transSummaryList) {
            this.transSummaryList = transSummaryList;
            return this;
        }
        public String getTransSummaryList() {
            return this.transSummaryList;
        }

        public QueryBlockResponseBodyResult setTransactionSize(Integer transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

    }

}
