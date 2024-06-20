// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockV2ResponseBody extends TeaModel {
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
    public DescribeAntChainBlockV2ResponseBodyResult result;

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
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>5abf96debc87f1b64dcbaf4fa57fd46f2a06acdb5de0ba91ef9718d81aebafc7</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>1609223363570</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>4000000</p>
         */
        @NameInMap("GasUsed")
        public Long gasUsed;

        /**
         * <strong>example:</strong>
         * <p>076bba1b726b3bcb958cba6fffc03eaa5cbed59320271dcbc0e05648a18a94f2</p>
         */
        @NameInMap("Hash")
        public String hash;

        /**
         * <strong>example:</strong>
         * <p>254761</p>
         */
        @NameInMap("Height")
        public Long height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <strong>example:</strong>
         * <p>e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec</p>
         */
        @NameInMap("To")
        public String to;

        /**
         * <strong>example:</strong>
         * <p>CALL_CONTRACT</p>
         */
        @NameInMap("TransTypeV10")
        public String transTypeV10;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>5abf96debc87f1b64dcbaf4fa57fd46f2a06acdb5de0ba91ef9718d81aebafc7</p>
         */
        @NameInMap("BlockHash")
        public String blockHash;

        /**
         * <strong>example:</strong>
         * <p>1609223363570</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>254761</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>2444ef0617e0c6845549dead70f118c5a58f03c04575ecb79e283ab5c34b491d</p>
         */
        @NameInMap("PreviousHash")
        public String previousHash;

        /**
         * <strong>example:</strong>
         * <p>0000000000000000000000000000000000000000000000000000000000000000</p>
         */
        @NameInMap("RootTxHash")
        public String rootTxHash;

        @NameInMap("TransSummaryList")
        public java.util.List<DescribeAntChainBlockV2ResponseBodyResultTransSummaryList> transSummaryList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TransactionSize")
        public Integer transactionSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
