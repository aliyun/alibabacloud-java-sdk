// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainBlockV2ResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainBlockV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockV2ResponseBody self = new DescribeAntChainBlockV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainBlockV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainBlockV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainBlockV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainBlockV2ResponseBody setResult(DescribeAntChainBlockV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainBlockV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainBlockV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainBlockV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainBlockV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainBlockV2ResponseBodyResultTransSummaryList extends TeaModel {
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

        public static DescribeAntChainBlockV2ResponseBodyResultTransSummaryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainBlockV2ResponseBodyResultTransSummaryList self = new DescribeAntChainBlockV2ResponseBodyResultTransSummaryList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setGasUsed(Long gasUsed) {
            this.gasUsed = gasUsed;
            return this;
        }
        public Long getGasUsed() {
            return this.gasUsed;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setHash(String hash) {
            this.hash = hash;
            return this;
        }
        public String getHash() {
            return this.hash;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setTransTypeV10(String transTypeV10) {
            this.transTypeV10 = transTypeV10;
            return this;
        }
        public String getTransTypeV10() {
            return this.transTypeV10;
        }

        public DescribeAntChainBlockV2ResponseBodyResultTransSummaryList setTransTypeV6(String transTypeV6) {
            this.transTypeV6 = transTypeV6;
            return this;
        }
        public String getTransTypeV6() {
            return this.transTypeV6;
        }

    }

    public static class DescribeAntChainBlockV2ResponseBodyResult extends TeaModel {
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
        public java.util.List<DescribeAntChainBlockV2ResponseBodyResultTransSummaryList> transSummaryList;

        @NameInMap("TransactionSize")
        public Integer transactionSize;

        @NameInMap("Version")
        public Long version;

        public static DescribeAntChainBlockV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainBlockV2ResponseBodyResult self = new DescribeAntChainBlockV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainBlockV2ResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setRootTxHash(String rootTxHash) {
            this.rootTxHash = rootTxHash;
            return this;
        }
        public String getRootTxHash() {
            return this.rootTxHash;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setTransSummaryList(java.util.List<DescribeAntChainBlockV2ResponseBodyResultTransSummaryList> transSummaryList) {
            this.transSummaryList = transSummaryList;
            return this;
        }
        public java.util.List<DescribeAntChainBlockV2ResponseBodyResultTransSummaryList> getTransSummaryList() {
            return this.transSummaryList;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setTransactionSize(Integer transactionSize) {
            this.transactionSize = transactionSize;
            return this;
        }
        public Integer getTransactionSize() {
            return this.transactionSize;
        }

        public DescribeAntChainBlockV2ResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
