// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockResponseBodyResult result;

    public static DescribeBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockResponseBody self = new DescribeBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockResponseBody setResult(DescribeBlockResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockResponseBodyResult extends TeaModel {
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

        @NameInMap("Version")
        public Long version;

        public static DescribeBlockResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockResponseBodyResult self = new DescribeBlockResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeBlockResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeBlockResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockResponseBodyResult setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeBlockResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeBlockResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeBlockResponseBodyResult setTransSummaryList(String transSummaryList) {
            this.transSummaryList = transSummaryList;
            return this;
        }
        public String getTransSummaryList() {
            return this.transSummaryList;
        }

        public DescribeBlockResponseBodyResult setTransactionSize(Integer transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeBlockResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
