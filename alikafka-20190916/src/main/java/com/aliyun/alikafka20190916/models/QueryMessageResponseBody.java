// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class QueryMessageResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code. If the request is successful, 200 is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The messages.</p>
     */
    @NameInMap("MessageList")
    public java.util.List<QueryMessageResponseBodyMessageList> messageList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The check value of the chaincode.</p>
         */
        @NameInMap("Checksum")
        public Long checksum;

        /**
         * <p>The message key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the key is truncated.</p>
         */
        @NameInMap("KeyTruncated")
        public Boolean keyTruncated;

        /**
         * <p>The consumer offset of the partition.</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The partition ID.</p>
         */
        @NameInMap("Partition")
        public Long partition;

        /**
         * <p>The size of the key after serialization. Unit: bytes.</p>
         */
        @NameInMap("SerializedKeySize")
        public Integer serializedKeySize;

        /**
         * <p>The size of the value after serialization. Unit: bytes.</p>
         */
        @NameInMap("SerializedValueSize")
        public Integer serializedValueSize;

        /**
         * <p>The time when the message was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The time type.</p>
         */
        @NameInMap("TimestampType")
        public String timestampType;

        /**
         * <p>The topic name.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The truncated size of the message key. Unit: bytes.</p>
         * <br>
         * <p>>  A maximum of 1 KB content can be displayed for each message. Content that exceeds 1 KB is automatically truncated. For more information, see [Query messages](https://help.aliyun.com/zh/apsaramq-for-kafka/query-messages).</p>
         */
        @NameInMap("TruncatedKeySize")
        public Integer truncatedKeySize;

        /**
         * <p>The truncated size of the message value. Unit: bytes.</p>
         * <br>
         * <p>>  A maximum of 1 KB content can be displayed for each message. Content that exceeds 1 KB is automatically truncated. For more information, see [Query messages](https://help.aliyun.com/zh/apsaramq-for-kafka/query-messages).</p>
         */
        @NameInMap("TruncatedValueSize")
        public Integer truncatedValueSize;

        /**
         * <p>The message value.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Indicates whether the value is truncated.</p>
         */
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
