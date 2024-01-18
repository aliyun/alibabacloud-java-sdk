// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class QueryMessageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageList")
    public java.util.List<QueryMessageResponseBodyMessageList> messageList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageResponseBody self = new QueryMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMessageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMessageResponseBody setMessageList(java.util.List<QueryMessageResponseBodyMessageList> messageList) {
        this.messageList = messageList;
        return this;
    }
    public java.util.List<QueryMessageResponseBodyMessageList> getMessageList() {
        return this.messageList;
    }

    public QueryMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMessageResponseBodyMessageList extends TeaModel {
        @NameInMap("Checksum")
        public Long checksum;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyTruncated")
        public Boolean keyTruncated;

        @NameInMap("Offset")
        public Long offset;

        @NameInMap("Partition")
        public Long partition;

        @NameInMap("SerializedKeySize")
        public Integer serializedKeySize;

        @NameInMap("SerializedValueSize")
        public Integer serializedValueSize;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TimestampType")
        public String timestampType;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TruncatedKeySize")
        public Integer truncatedKeySize;

        @NameInMap("TruncatedValueSize")
        public Integer truncatedValueSize;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueTruncated")
        public Boolean valueTruncated;

        public static QueryMessageResponseBodyMessageList build(java.util.Map<String, ?> map) throws Exception {
            QueryMessageResponseBodyMessageList self = new QueryMessageResponseBodyMessageList();
            return TeaModel.build(map, self);
        }

        public QueryMessageResponseBodyMessageList setChecksum(Long checksum) {
            this.checksum = checksum;
            return this;
        }
        public Long getChecksum() {
            return this.checksum;
        }

        public QueryMessageResponseBodyMessageList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMessageResponseBodyMessageList setKeyTruncated(Boolean keyTruncated) {
            this.keyTruncated = keyTruncated;
            return this;
        }
        public Boolean getKeyTruncated() {
            return this.keyTruncated;
        }

        public QueryMessageResponseBodyMessageList setOffset(Long offset) {
            this.offset = offset;
            return this;
        }
        public Long getOffset() {
            return this.offset;
        }

        public QueryMessageResponseBodyMessageList setPartition(Long partition) {
            this.partition = partition;
            return this;
        }
        public Long getPartition() {
            return this.partition;
        }

        public QueryMessageResponseBodyMessageList setSerializedKeySize(Integer serializedKeySize) {
            this.serializedKeySize = serializedKeySize;
            return this;
        }
        public Integer getSerializedKeySize() {
            return this.serializedKeySize;
        }

        public QueryMessageResponseBodyMessageList setSerializedValueSize(Integer serializedValueSize) {
            this.serializedValueSize = serializedValueSize;
            return this;
        }
        public Integer getSerializedValueSize() {
            return this.serializedValueSize;
        }

        public QueryMessageResponseBodyMessageList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryMessageResponseBodyMessageList setTimestampType(String timestampType) {
            this.timestampType = timestampType;
            return this;
        }
        public String getTimestampType() {
            return this.timestampType;
        }

        public QueryMessageResponseBodyMessageList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public QueryMessageResponseBodyMessageList setTruncatedKeySize(Integer truncatedKeySize) {
            this.truncatedKeySize = truncatedKeySize;
            return this;
        }
        public Integer getTruncatedKeySize() {
            return this.truncatedKeySize;
        }

        public QueryMessageResponseBodyMessageList setTruncatedValueSize(Integer truncatedValueSize) {
            this.truncatedValueSize = truncatedValueSize;
            return this;
        }
        public Integer getTruncatedValueSize() {
            return this.truncatedValueSize;
        }

        public QueryMessageResponseBodyMessageList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryMessageResponseBodyMessageList setValueTruncated(Boolean valueTruncated) {
            this.valueTruncated = valueTruncated;
            return this;
        }
        public Boolean getValueTruncated() {
            return this.valueTruncated;
        }

    }

}
