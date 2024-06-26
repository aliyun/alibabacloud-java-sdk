// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainBlockNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainBlockNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockNewResponseBody self = new DescribeAntChainBlockNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainBlockNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainBlockNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainBlockNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainBlockNewResponseBody setResult(DescribeAntChainBlockNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainBlockNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainBlockNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainBlockNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainBlockNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainBlockNewResponseBodyResultTransSummaryList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("From")
        public String from;

        @NameInMap("GasUsed")
        public Long gasUsed;

        @NameInMap("Hash")
        public String hash;

        @NameInMap("Height")
        public Long height;

        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        @NameInMap("To")
        public String to;

        @NameInMap("TransTypeV10")
        public String transTypeV10;

        @NameInMap("TransTypeV6")
        public String transTypeV6;

        public static DescribeAntChainBlockNewResponseBodyResultTransSummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainBlockNewResponseBodyResultTransSummaryList self = new DescribeAntChainBlockNewResponseBodyResultTransSummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setGasUsed(Long gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public Long getGasUsed() {
            return this.gasUsed;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setTransTypeV10(String transTypeV10) {
            this.transTypeV10 = transTypeV10;
            return this;
        }
        public String getTransTypeV10() {
            return this.transTypeV10;
        }

        public DescribeAntChainBlockNewResponseBodyResultTransSummaryList setTransTypeV6(String transTypeV6) {
            this.transTypeV6 = transTypeV6;
            return this;
        }
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

    }

    public static class DescribeAntChainBlockNewResponseBodyResult extends TeaModel {
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
        public java.util.List<DescribeAntChainBlockNewResponseBodyResultTransSummaryList> transSummaryList;

        @NameInMap("TransactionSize")
        public Integer transactionSize;

        @NameInMap("Version")
        public Long version;

        public static DescribeAntChainBlockNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainBlockNewResponseBodyResult self = new DescribeAntChainBlockNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainBlockNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainBlockNewResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainBlockNewResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainBlockNewResponseBodyResult setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeAntChainBlockNewResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeAntChainBlockNewResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeAntChainBlockNewResponseBodyResult setTransSummaryList(java.util.List<DescribeAntChainBlockNewResponseBodyResultTransSummaryList> transSummaryList) {
            this.transSummaryList = transSummaryList;
            return this;
        }
        public java.util.List<DescribeAntChainBlockNewResponseBodyResultTransSummaryList> getTransSummaryList() {
            return this.transSummaryList;
        }

        public DescribeAntChainBlockNewResponseBodyResult setTransactionSize(Integer transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeAntChainBlockNewResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
