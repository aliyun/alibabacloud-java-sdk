// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <p>The name of the event.</p>
     */
    @NameInMap("Data")
    public GetTopicResponseBodyData data;

    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the Apsara Stack tenant account used by the event owner.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTopicResponseBody self = new GetTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTopicResponseBody setData(GetTopicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTopicResponseBodyData getData() {
        return this.data;
    }

    public GetTopicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTopicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public GetTopicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTopicResponseBodyData extends TeaModel {
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The ID of the Apsara Stack tenant account used by the alert recipient.</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The timestamp when the event was found.</p>
         */
        @NameInMap("Assigner")
        public String assigner;

        /**
         * <p>The status of the event. Valid values: IGNORE, NEW, FIXING, and RECOVER. A value of IGNORE indicates that the event is ignored. A value of NEW indicates that the event is a new event. A value of FIXING indicates that the event is being processed. A value of RECOVER indicates that the event is processed.</p>
         */
        @NameInMap("BaselineBuffer")
        public Long baselineBuffer;

        /**
         * <p>The timestamp when the first alert was reported.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The type of the event. Valid values: SLOW and ERROR. A value of SLOW indicates that the duration of the task is significantly longer than the average duration of the task in previous cycles. A value of ERROR indicates that the task fails to run.</p>
         */
        @NameInMap("BaselineInGroupId")
        public Integer baselineInGroupId;

        /**
         * <p>The name of the node that triggered the event.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The timestamp when the system reports the next alert.</p>
         */
        @NameInMap("BaselineStatus")
        public String baselineStatus;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The name of the baseline to which the worst baseline instance belongs.</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The ID of the baseline to which the worst baseline instance belongs.</p>
         */
        @NameInMap("DealUser")
        public String dealUser;

        /**
         * <p>The margin of the worst baseline instance. Unit: seconds.</p>
         */
        @NameInMap("FixTime")
        public Long fixTime;

        /**
         * <p>The ID of the Apsara Stack tenant account used by the user who last processed the event.</p>
         */
        @NameInMap("HappenTime")
        public Long happenTime;

        /**
         * <p>The ID of the cycle of the worst baseline instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The timestamp when the event was processed.</p>
         */
        @NameInMap("NextAlertTime")
        public Long nextAlertTime;

        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The margin of the event. Unit: seconds.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS, and OVER. A value of ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. A value of SAFE indicates that nodes are run before the alert duration begins. A value of DANGROUS indicates that nodes are still running after the alert duration ends but the committed time does not arrive. A value of OVER indicates that nodes are still running after the committed time.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the instance that triggered the event.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the node that triggered the event.</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The ID of the workspace to which the node that triggered the event belongs.</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The timestamp when the event was last processed.</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        /**
         * <p>The timestamp when the system event occurred. A time difference may exist between the time when the event occurred and the time when the event was found.</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        public static GetTopicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTopicResponseBodyData self = new GetTopicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTopicResponseBodyData setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public GetTopicResponseBodyData setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public GetTopicResponseBodyData setAssigner(String assigner) {
            this.assigner = assigner;
            return this;
        }
        public String getAssigner() {
            return this.assigner;
        }

        public GetTopicResponseBodyData setBaselineBuffer(Long baselineBuffer) {
            this.baselineBuffer = baselineBuffer;
            return this;
        }
        public Long getBaselineBuffer() {
            return this.baselineBuffer;
        }

        public GetTopicResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTopicResponseBodyData setBaselineInGroupId(Integer baselineInGroupId) {
            this.baselineInGroupId = baselineInGroupId;
            return this;
        }
        public Integer getBaselineInGroupId() {
            return this.baselineInGroupId;
        }

        public GetTopicResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTopicResponseBodyData setBaselineStatus(String baselineStatus) {
            this.baselineStatus = baselineStatus;
            return this;
        }
        public String getBaselineStatus() {
            return this.baselineStatus;
        }

        public GetTopicResponseBodyData setBuffer(Long buffer) {
            this.buffer = buffer;
            return this;
        }
        public Long getBuffer() {
            return this.buffer;
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

        public GetTopicResponseBodyData setFixTime(Long fixTime) {
            this.fixTime = fixTime;
            return this;
        }
        public Long getFixTime() {
            return this.fixTime;
        }

        public GetTopicResponseBodyData setHappenTime(Long happenTime) {
            this.happenTime = happenTime;
            return this;
        }
        public Long getHappenTime() {
            return this.happenTime;
        }

        public GetTopicResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetTopicResponseBodyData setNextAlertTime(Long nextAlertTime) {
            this.nextAlertTime = nextAlertTime;
            return this;
        }
        public Long getNextAlertTime() {
            return this.nextAlertTime;
        }

        public GetTopicResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetTopicResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTopicResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTopicResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTopicResponseBodyData setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetTopicResponseBodyData setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetTopicResponseBodyData setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

        public GetTopicResponseBodyData setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

}
