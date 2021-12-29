// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainMetadataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryBlockchainMetadataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryBlockchainMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainMetadataResponseBody self = new QueryBlockchainMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainMetadataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBlockchainMetadataResponseBody setData(QueryBlockchainMetadataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBlockchainMetadataResponseBodyData getData() {
        return this.data;
    }

    public QueryBlockchainMetadataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryBlockchainMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBlockchainMetadataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBlockchainMetadataResponseBodyData extends TeaModel {
        @NameInMap("BlockHash")
        public String blockHash;

        @NameInMap("BlockNumber")
        public String blockNumber;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TxHash")
        public String txHash;

        public static QueryBlockchainMetadataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBlockchainMetadataResponseBodyData self = new QueryBlockchainMetadataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBlockchainMetadataResponseBodyData setBlockHash(String blockHash) {
            this.blockHash = blockHash;
            return this;
        }
        public String getBlockHash() {
            return this.blockHash;
        }

        public QueryBlockchainMetadataResponseBodyData setBlockNumber(String blockNumber) {
            this.blockNumber = blockNumber;
            return this;
        }
        public String getBlockNumber() {
            return this.blockNumber;
        }

        public QueryBlockchainMetadataResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryBlockchainMetadataResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public QueryBlockchainMetadataResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryBlockchainMetadataResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryBlockchainMetadataResponseBodyData setTxHash(String txHash) {
            this.txHash = txHash;
            return this;
        }
        public String getTxHash() {
            return this.txHash;
        }

    }

}
