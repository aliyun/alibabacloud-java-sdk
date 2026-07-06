// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class QueryMessageResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The query message results.</p>
     */
    @NameInMap("MessageList")
    public java.util.List<QueryMessageResponseBodyMessageList> messageList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABA4A7FD-E10F-45C7-9774-A5236015****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The chaincode checksum.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Checksum")
        public Long checksum;

        /**
         * <p>The message key.</p>
         * 
         * <strong>example:</strong>
         * <p>this is key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the key is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("KeyTruncated")
        public Boolean keyTruncated;

        /**
         * <p>The partition offset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Offset")
        public Long offset;

        /**
         * <p>The partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Partition")
        public Long partition;

        /**
         * <p>The size of the serialized key. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("SerializedKeySize")
        public Integer serializedKeySize;

        /**
         * <p>The size of the serialized value. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SerializedValueSize")
        public Integer serializedValueSize;

        /**
         * <p>The message creation time. Represented as a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1705482172640</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The timestamp type.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        @NameInMap("TimestampType")
        public String timestampType;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>dqc_test2</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The size of the truncated key message. Value: bytes.</p>
         * <blockquote>
         * <p>Each queried message displays up to 1 KB of content; content exceeding this limit will be automatically truncated. <a href="https://help.aliyun.com/document_detail/113172.html">Learn more</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TruncatedKeySize")
        public Integer truncatedKeySize;

        /**
         * <p>The size of the truncated value message. Unit: bytes.</p>
         * <blockquote>
         * <p>Each queried message displays up to 1 KB of content; content exceeding this limit will be automatically truncated. <a href="https://help.aliyun.com/document_detail/113172.html">Learn more</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TruncatedValueSize")
        public Integer truncatedValueSize;

        /**
         * <p>The message value.</p>
         * 
         * <strong>example:</strong>
         * <p>Welcome to Ali kafka</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>Indicates whether the value is truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
