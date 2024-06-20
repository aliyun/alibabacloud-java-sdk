// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksV2ResponseBody extends TeaModel {
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
    public java.util.List<DescribeAntChainLatestBlocksV2ResponseBodyResult> result;

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

    public static DescribeAntChainLatestBlocksV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksV2ResponseBody self = new DescribeAntChainLatestBlocksV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setResult(java.util.List<DescribeAntChainLatestBlocksV2ResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainLatestBlocksV2ResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainLatestBlocksV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainLatestBlocksV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>b21baa257788d97eb0006672ccc5008f465365e1dec88d0bbd833e150414b3d5</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <strong>example:</strong>
         * <p>b21baa257788d97eb0006672ccc5008f465365e1dec88d0bbd833e150414b3d5</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>1610002621000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>259808</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>f208834bdc72bd6bb05c5ef1a35abbc8295a16deda9526b7b78c69ec24591b9f</p>
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
         * <p>1024</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransactionSize")
        public Long transactionSize;

        /**
         * <strong>example:</strong>
         * <p>33556226</p>
         */
        @NameInMap("Version")
        public Long version;

        public static DescribeAntChainLatestBlocksV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainLatestBlocksV2ResponseBodyResult self = new DescribeAntChainLatestBlocksV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setTransactionSize(Long transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Long getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeAntChainLatestBlocksV2ResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
