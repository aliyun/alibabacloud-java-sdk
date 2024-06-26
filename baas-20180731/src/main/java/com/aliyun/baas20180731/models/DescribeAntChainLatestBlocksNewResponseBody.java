// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainLatestBlocksNewResponseBodyResult> result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainLatestBlocksNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksNewResponseBody self = new DescribeAntChainLatestBlocksNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setResult(java.util.List<DescribeAntChainLatestBlocksNewResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainLatestBlocksNewResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainLatestBlocksNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainLatestBlocksNewResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BizData")
        public String bizData;

        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PreviousHash")
        public String previousHash;

        @NameInMap("RootTxHash")
        public String rootTxHash;

        @NameInMap("Size")
        public Long size;

        @NameInMap("TransactionSize")
        public Long transactionSize;

        @NameInMap("Version")
        public Long version;

        public static DescribeAntChainLatestBlocksNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainLatestBlocksNewResponseBodyResult self = new DescribeAntChainLatestBlocksNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setTransactionSize(Long transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Long getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeAntChainLatestBlocksNewResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
