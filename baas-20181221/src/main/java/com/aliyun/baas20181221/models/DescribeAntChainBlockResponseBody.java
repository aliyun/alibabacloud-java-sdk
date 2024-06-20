// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4DDA2E72-778A-4D79-BE70-448A26A57227</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>pYogqb9v</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>aeec5963f8deeeae820aaf302f0c925db9fa8d07b9898dac782335f817554e47</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>1562851727742</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>e11767c7b9d92563663a76f10c69e8354788001e2c9e6bd9267239a81d3bb523</p>
         */
        @NameInMap("PreviousHash")
        public String previousHash;

        /**
         * <strong>example:</strong>
         * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
         */
        @NameInMap("RootTxHash")
        public String rootTxHash;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("TransSummaryList")
        public String transSummaryList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransactionSize")
        public Integer transactionSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
