// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTopicsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTopicsResponseData data;

    public static ListTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponse self = new ListTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListTopicsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTopicsResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTopicsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTopicsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTopicsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicsResponse setData(ListTopicsResponseData data) {
        this.data = data;
        return this;
    }
    public ListTopicsResponseData getData() {
        return this.data;
    }

    public static class ListTopicsResponseDataTopics extends TeaModel {
        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public String topicName;

        @NameInMap("TopicStatus")
        @Validation(required = true)
        public String topicStatus;

        @NameInMap("TopicType")
        @Validation(required = true)
        public String topicType;

        @NameInMap("AddTime")
        @Validation(required = true)
        public Long addTime;

        @NameInMap("HappenTime")
        @Validation(required = true)
        public Long happenTime;

        @NameInMap("FixTime")
        @Validation(required = true)
        public Long fixTime;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("NodeOwner")
        @Validation(required = true)
        public String nodeOwner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListTopicsResponseDataTopics build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseDataTopics self = new ListTopicsResponseDataTopics();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseDataTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListTopicsResponseDataTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTopicsResponseDataTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public ListTopicsResponseDataTopics setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

        public ListTopicsResponseDataTopics setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public ListTopicsResponseDataTopics setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public ListTopicsResponseDataTopics setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public ListTopicsResponseDataTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListTopicsResponseDataTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListTopicsResponseDataTopics setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListTopicsResponseDataTopics setNodeOwner(String nodeOwner) {
            this.nodeOwner = nodeOwner;
            return this;
        }
        public String getNodeOwner() {
            return this.nodeOwner;
        }

        public ListTopicsResponseDataTopics setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListTopicsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<ListTopicsResponseDataTopics> topics;

        public static ListTopicsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseData self = new ListTopicsResponseData();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListTopicsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTopicsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListTopicsResponseData setTopics(java.util.List<ListTopicsResponseDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListTopicsResponseDataTopics> getTopics() {
            return this.topics;
        }

    }

}
