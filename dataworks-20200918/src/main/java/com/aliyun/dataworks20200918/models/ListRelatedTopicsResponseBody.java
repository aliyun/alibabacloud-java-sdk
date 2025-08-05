// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListRelatedTopicsResponseBody extends TeaModel {
    @NameInMap("RelatedTopics")
    public java.util.List<ListRelatedTopicsResponseBodyRelatedTopics> relatedTopics;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRelatedTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRelatedTopicsResponseBody self = new ListRelatedTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRelatedTopicsResponseBody setRelatedTopics(java.util.List<ListRelatedTopicsResponseBodyRelatedTopics> relatedTopics) {
        this.relatedTopics = relatedTopics;
        return this;
    }
    public java.util.List<ListRelatedTopicsResponseBodyRelatedTopics> getRelatedTopics() {
        return this.relatedTopics;
    }

    public ListRelatedTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRelatedTopicsResponseBodyRelatedTopics extends TeaModel {
        @NameInMap("AddTime")
        public Long addTime;

        @NameInMap("FixTime")
        public Long fixTime;

        @NameInMap("HappenTime")
        public Long happenTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeOwner")
        public String nodeOwner;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("TopicStatus")
        public String topicStatus;

        @NameInMap("TopicType")
        public String topicType;

        public static ListRelatedTopicsResponseBodyRelatedTopics build(java.util.Map<String, ?> map) throws Exception {
            ListRelatedTopicsResponseBodyRelatedTopics self = new ListRelatedTopicsResponseBodyRelatedTopics();
            return TeaModel.build(map, self);
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setNodeOwner(String nodeOwner) {
            this.nodeOwner = nodeOwner;
            return this;
        }
        public String getNodeOwner() {
            return this.nodeOwner;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public ListRelatedTopicsResponseBodyRelatedTopics setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

}
