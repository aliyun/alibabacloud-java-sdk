// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainBlockResponseBodyResult result;

    public static DescribeAntChainBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockResponseBody self = new DescribeAntChainBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainBlockResponseBody setResult(DescribeAntChainBlockResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainBlockResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainBlockResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

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

        public static DescribeAntChainBlockResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainBlockResponseBodyResult self = new DescribeAntChainBlockResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainBlockResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainBlockResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainBlockResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainBlockResponseBodyResult setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeAntChainBlockResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeAntChainBlockResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeAntChainBlockResponseBodyResult setTransSummaryList(String transSummaryList) {
            this.transSummaryList = transSummaryList;
            return this;
        }
        public String getTransSummaryList() {
            return this.transSummaryList;
        }

        public DescribeAntChainBlockResponseBodyResult setTransactionSize(Integer transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeAntChainBlockResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
