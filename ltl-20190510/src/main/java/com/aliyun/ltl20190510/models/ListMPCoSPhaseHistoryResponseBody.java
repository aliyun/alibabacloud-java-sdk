// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListMPCoSPhaseHistoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListMPCoSPhaseHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseHistoryResponseBody self = new ListMPCoSPhaseHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMPCoSPhaseHistoryResponseBody setData(ListMPCoSPhaseHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMPCoSPhaseHistoryResponseBodyData getData() {
        return this.data;
    }

    public ListMPCoSPhaseHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMPCoSPhaseHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMPCoSPhaseHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMPCoSPhaseHistoryResponseBodyDataPageData extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockNumber")
        public Long blockNumber;

        @NameInMap("DataHash")
        public String dataHash;

        @NameInMap("DataSeq")
        public String dataSeq;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PreviousHash")
        public String previousHash;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TransactionHash")
        public String transactionHash;

        public static ListMPCoSPhaseHistoryResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseHistoryResponseBodyDataPageData self = new ListMPCoSPhaseHistoryResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setBlockNumber(Long blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public Long getBlockNumber() {
            return this.blockNumber;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setDataHash(String dataHash) {
            this.dataHash = dataHash;
            return this;
        }
        public String getDataHash() {
            return this.dataHash;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setDataSeq(String dataSeq) {
            this.dataSeq = dataSeq;
            return this;
        }
        public String getDataSeq() {
            return this.dataSeq;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setPreviousHash(String previousHash) {
            this.previousHash = previousHash;
            return this;
        }
        public String getPreviousHash() {
            return this.previousHash;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListMPCoSPhaseHistoryResponseBodyDataPageData setTransactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
            return this;
        }
        public String getTransactionHash() {
            return this.transactionHash;
        }

    }

    public static class ListMPCoSPhaseHistoryResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListMPCoSPhaseHistoryResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListMPCoSPhaseHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMPCoSPhaseHistoryResponseBodyData self = new ListMPCoSPhaseHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMPCoSPhaseHistoryResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListMPCoSPhaseHistoryResponseBodyData setPageData(java.util.List<ListMPCoSPhaseHistoryResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListMPCoSPhaseHistoryResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListMPCoSPhaseHistoryResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListMPCoSPhaseHistoryResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
