// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBizChainDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBizChainDataResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBizChainDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBizChainDataResponseBody self = new ListBizChainDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBizChainDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBizChainDataResponseBody setData(ListBizChainDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBizChainDataResponseBodyData getData() {
        return this.data;
    }

    public ListBizChainDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBizChainDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBizChainDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBizChainDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBizChainDataResponseBodyDataPageData extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockNum")
        public String blockNum;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TxHash")
        public String txHash;

        public static ListBizChainDataResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListBizChainDataResponseBodyDataPageData self = new ListBizChainDataResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListBizChainDataResponseBodyDataPageData setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public ListBizChainDataResponseBodyDataPageData setBlockNum(String blockNum) {
            this.blockNum = blockNum;
            return this;
        }
        public String getBlockNum() {
            return this.blockNum;
        }

        public ListBizChainDataResponseBodyDataPageData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListBizChainDataResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListBizChainDataResponseBodyDataPageData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListBizChainDataResponseBodyDataPageData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListBizChainDataResponseBodyDataPageData setTxHash(String txHash) {
            this.txHash = txHash;
            return this;
        }
        public String getTxHash() {
            return this.txHash;
        }

    }

    public static class ListBizChainDataResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListBizChainDataResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListBizChainDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBizChainDataResponseBodyData self = new ListBizChainDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBizChainDataResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListBizChainDataResponseBodyData setPageData(java.util.List<ListBizChainDataResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListBizChainDataResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListBizChainDataResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListBizChainDataResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
