// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetTopicResponseBodyData data;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTopicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTopicResponseBody setData(GetTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicResponseBodyData getData() {
        return this.data;
    }

    public static class GetTopicResponseBodyData extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("BaselineStatus")
        public String baselineStatus;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("NextAlertTime")
        public Long nextAlertTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("FixTime")
        public Long fixTime;

        @NameInMap("BaselineInGroupId")
        public Integer baselineInGroupId;

        @NameInMap("BaselineBuffer")
        public Long baselineBuffer;

        @NameInMap("TopicType")
        public String topicType;

        @NameInMap("TopicStatus")
        public String topicStatus;

        @NameInMap("HappenTime")
        public Long happenTime;

        @NameInMap("DealTime")
        public Long dealTime;

        @NameInMap("DealUser")
        public String dealUser;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("Buffer")
        public Long buffer;

        @NameInMap("Assigner")
        public String assigner;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("AddTime")
        public Long addTime;

        @NameInMap("NodeId")
        public Long nodeId;

        public static GetTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyData self = new GetTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTopicResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTopicResponseBodyData setBaselineStatus(String baselineStatus) {
            this.baselineStatus = baselineStatus;
            return this;
        }
        public String getBaselineStatus() {
            return this.baselineStatus;
        }

        public GetTopicResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTopicResponseBodyData setNextAlertTime(Long nextAlertTime) {
            this.nextAlertTime = nextAlertTime;
            return this;
        }
        public Long getNextAlertTime() {
            return this.nextAlertTime;
        }

        public GetTopicResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetTopicResponseBodyData setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public GetTopicResponseBodyData setBaselineInGroupId(Integer baselineInGroupId) {
            this.baselineInGroupId = baselineInGroupId;
            return this;
        }
        public Integer getBaselineInGroupId() {
            return this.baselineInGroupId;
        }

        public GetTopicResponseBodyData setBaselineBuffer(Long baselineBuffer) {
            this.baselineBuffer = baselineBuffer;
            return this;
        }
        public Long getBaselineBuffer() {
            return this.baselineBuffer;
        }

        public GetTopicResponseBodyData setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

        public GetTopicResponseBodyData setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public GetTopicResponseBodyData setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public GetTopicResponseBodyData setDealTime(Long dealTime) {
            this.dealTime = dealTime;
            return this;
        }
        public Long getDealTime() {
            return this.dealTime;
        }

        public GetTopicResponseBodyData setDealUser(String dealUser) {
            this.dealUser = dealUser;
            return this;
        }
        public String getDealUser() {
            return this.dealUser;
        }

        public GetTopicResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTopicResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTopicResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTopicResponseBodyData setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public GetTopicResponseBodyData setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
        }

        public GetTopicResponseBodyData setAssigner(String assigner) {
            this.assigner = assigner;
            return this;
        }
        public String getAssigner() {
            return this.assigner;
        }

        public GetTopicResponseBodyData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetTopicResponseBodyData setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public GetTopicResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

}
