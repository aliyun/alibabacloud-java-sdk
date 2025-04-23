// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetTopicStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E475C7E2-8C35-46EF-BE7D-5D2A9F5D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TopicStatus")
    public GetTopicStatusResponseBodyTopicStatus topicStatus;

    public static GetTopicStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicStatusResponseBody self = new GetTopicStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTopicStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTopicStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicStatusResponseBody setTopicStatus(GetTopicStatusResponseBodyTopicStatus topicStatus) {
        this.topicStatus = topicStatus;
        return this;
    }
    public GetTopicStatusResponseBodyTopicStatus getTopicStatus() {
        return this.topicStatus;
    }

    public static class GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1566470063547</p>
         */
        @NameInMap("LastUpdateTimestamp")
        public Long lastUpdateTimestamp;

        /**
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("MaxOffset")
        public Long maxOffset;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinOffset")
        public Long minOffset;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        /**
         * <strong>example:</strong>
         * <p>testkafka</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable build(java.util.Map<String, ?> map) throws Exception {
            GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable self = new GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable();
            return TeaModel.build(map, self);
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable setLastUpdateTimestamp(Long lastUpdateTimestamp) {
            this.lastUpdateTimestamp = lastUpdateTimestamp;
            return this;
        }
        public Long getLastUpdateTimestamp() {
            return this.lastUpdateTimestamp;
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable setMaxOffset(Long maxOffset) {
            this.maxOffset = maxOffset;
            return this;
        }
        public Long getMaxOffset() {
            return this.maxOffset;
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable setMinOffset(Long minOffset) {
            this.minOffset = minOffset;
            return this;
        }
        public Long getMinOffset() {
            return this.minOffset;
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetTopicStatusResponseBodyTopicStatusOffsetTable extends TeaModel {
        @NameInMap("OffsetTable")
        public java.util.List<GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable> offsetTable;

        public static GetTopicStatusResponseBodyTopicStatusOffsetTable build(java.util.Map<String, ?> map) throws Exception {
            GetTopicStatusResponseBodyTopicStatusOffsetTable self = new GetTopicStatusResponseBodyTopicStatusOffsetTable();
            return TeaModel.build(map, self);
        }

        public GetTopicStatusResponseBodyTopicStatusOffsetTable setOffsetTable(java.util.List<GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable> offsetTable) {
            this.offsetTable = offsetTable;
            return this;
        }
        public java.util.List<GetTopicStatusResponseBodyTopicStatusOffsetTableOffsetTable> getOffsetTable() {
            return this.offsetTable;
        }

    }

    public static class GetTopicStatusResponseBodyTopicStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1566470063575</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        @NameInMap("OffsetTable")
        public GetTopicStatusResponseBodyTopicStatusOffsetTable offsetTable;

        /**
         * <strong>example:</strong>
         * <p>423</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetTopicStatusResponseBodyTopicStatus build(java.util.Map<String, ?> map) throws Exception {
            GetTopicStatusResponseBodyTopicStatus self = new GetTopicStatusResponseBodyTopicStatus();
            return TeaModel.build(map, self);
        }

        public GetTopicStatusResponseBodyTopicStatus setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public GetTopicStatusResponseBodyTopicStatus setOffsetTable(GetTopicStatusResponseBodyTopicStatusOffsetTable offsetTable) {
            this.offsetTable = offsetTable;
            return this;
        }
        public GetTopicStatusResponseBodyTopicStatusOffsetTable getOffsetTable() {
            return this.offsetTable;
        }

        public GetTopicStatusResponseBodyTopicStatus setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
