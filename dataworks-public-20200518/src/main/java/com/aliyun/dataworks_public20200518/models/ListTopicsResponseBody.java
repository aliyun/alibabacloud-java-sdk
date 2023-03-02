// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsResponseBody extends TeaModel {
    /**
     * <p>The information about the events returned.</p>
     */
    @NameInMap("Data")
    public ListTopicsResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponseBody self = new ListTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicsResponseBody setData(ListTopicsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTopicsResponseBodyData getData() {
        return this.data;
    }

    public ListTopicsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTopicsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTopicsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopicsResponseBodyDataTopics extends TeaModel {
        /**
         * <p>The timestamp when the event was found.</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The timestamp when the event was processed.</p>
         */
        @NameInMap("FixTime")
        public Long fixTime;

        /**
         * <p>The timestamp when the event occurred. A time difference may exist between the time when the event occurred and the time when the event was found.</p>
         */
        @NameInMap("HappenTime")
        public Long happenTime;

        /**
         * <p>The ID of the node instance that triggers the event.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the node that triggers the event.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account that is used by the node owner.</p>
         */
        @NameInMap("NodeOwner")
        public String nodeOwner;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The status of the event. Valid values: IGNORE, NEW, FIXING, and RECOVER. The value IGNORE indicates that the event is ignored. The value NEW indicates that the event is a new event. The value FIXING indicates that the event is being processed. The value RECOVER indicates that the event is processed.</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        /**
         * <p>The type of the event. Valid values: SLOW and ERROR. The value SLOW indicates that the running duration of the node in the current scheduling cycle is significantly longer than the average running duration of the node in previous scheduling cycles. The value ERROR indicates that the node fails to run.</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        public static ListTopicsResponseBodyDataTopics build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyDataTopics self = new ListTopicsResponseBodyDataTopics();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyDataTopics setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public ListTopicsResponseBodyDataTopics setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public ListTopicsResponseBodyDataTopics setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public ListTopicsResponseBodyDataTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListTopicsResponseBodyDataTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListTopicsResponseBodyDataTopics setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListTopicsResponseBodyDataTopics setNodeOwner(String nodeOwner) {
            this.nodeOwner = nodeOwner;
            return this;
        }
        public String getNodeOwner() {
            return this.nodeOwner;
        }

        public ListTopicsResponseBodyDataTopics setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListTopicsResponseBodyDataTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListTopicsResponseBodyDataTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTopicsResponseBodyDataTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public ListTopicsResponseBodyDataTopics setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class ListTopicsResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The events returned.</p>
         */
        @NameInMap("Topics")
        public java.util.List<ListTopicsResponseBodyDataTopics> topics;

        /**
         * <p>The total number of the events returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTopicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyData self = new ListTopicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTopicsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTopicsResponseBodyData setTopics(java.util.List<ListTopicsResponseBodyDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListTopicsResponseBodyDataTopics> getTopics() {
            return this.topics;
        }

        public ListTopicsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
