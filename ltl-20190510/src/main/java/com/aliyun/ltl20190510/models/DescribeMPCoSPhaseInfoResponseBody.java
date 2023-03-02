// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSPhaseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeMPCoSPhaseInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMPCoSPhaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSPhaseInfoResponseBody self = new DescribeMPCoSPhaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSPhaseInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMPCoSPhaseInfoResponseBody setData(DescribeMPCoSPhaseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMPCoSPhaseInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeMPCoSPhaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMPCoSPhaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMPCoSPhaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList extends TeaModel {
        @NameInMap("RelatedDataKey")
        public String relatedDataKey;

        @NameInMap("RelatedDataSeq")
        public String relatedDataSeq;

        @NameInMap("RelatedPhaseDataHash")
        public String relatedPhaseDataHash;

        @NameInMap("RelatedPhaseId")
        public String relatedPhaseId;

        @NameInMap("RelatedPhaseName")
        public String relatedPhaseName;

        public static DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList self = new DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList setRelatedDataKey(String relatedDataKey) {
            this.relatedDataKey = relatedDataKey;
            return this;
        }
        public String getRelatedDataKey() {
            return this.relatedDataKey;
        }

        public DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList setRelatedDataSeq(String relatedDataSeq) {
            this.relatedDataSeq = relatedDataSeq;
            return this;
        }
        public String getRelatedDataSeq() {
            return this.relatedDataSeq;
        }

        public DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList setRelatedPhaseDataHash(String relatedPhaseDataHash) {
            this.relatedPhaseDataHash = relatedPhaseDataHash;
            return this;
        }
        public String getRelatedPhaseDataHash() {
            return this.relatedPhaseDataHash;
        }

        public DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList setRelatedPhaseId(String relatedPhaseId) {
            this.relatedPhaseId = relatedPhaseId;
            return this;
        }
        public String getRelatedPhaseId() {
            return this.relatedPhaseId;
        }

        public DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList setRelatedPhaseName(String relatedPhaseName) {
            this.relatedPhaseName = relatedPhaseName;
            return this;
        }
        public String getRelatedPhaseName() {
            return this.relatedPhaseName;
        }

    }

    public static class DescribeMPCoSPhaseInfoResponseBodyData extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockNumber")
        public Long blockNumber;

        @NameInMap("DataHash")
        public String dataHash;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PreviousHash")
        public String previousHash;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("RelatedDataList")
        public java.util.List<DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList> relatedDataList;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TransactionHash")
        public String transactionHash;

        public static DescribeMPCoSPhaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMPCoSPhaseInfoResponseBodyData self = new DescribeMPCoSPhaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setBlockNumber(Long blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public Long getBlockNumber() {
            return this.blockNumber;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setDataHash(String dataHash) {
            this.dataHash = dataHash;
            return this;
        }
        public String getDataHash() {
            return this.dataHash;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setRelatedDataList(java.util.List<DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList> relatedDataList) {
            this.relatedDataList = relatedDataList;
            return this;
        }
        public java.util.List<DescribeMPCoSPhaseInfoResponseBodyDataRelatedDataList> getRelatedDataList() {
            return this.relatedDataList;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeMPCoSPhaseInfoResponseBodyData setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
            return this;
        }
        public String getTransactionHash() {
            return this.transactionHash;
        }

    }

}
