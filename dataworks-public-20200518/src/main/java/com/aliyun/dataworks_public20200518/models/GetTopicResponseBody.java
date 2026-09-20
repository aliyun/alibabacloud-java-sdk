// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicResponseBody extends TeaModel {
    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("Data")
    public GetTopicResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFGH-IJKLMNOPQ</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The timestamp when the event was discovered.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The timestamp of the first alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The Alibaba Cloud UID of the assigner.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Assigner")
        public String assigner;

        /**
         * <p>The buffer of the worst baseline instance, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("BaselineBuffer")
        public Long baselineBuffer;

        /**
         * <p>The baseline ID of the worst baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The cycle number of the worst baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BaselineInGroupId")
        public Integer baselineInGroupId;

        /**
         * <p>The baseline name of the worst baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGROUS (warning), and OVER (exceeded).</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
         */
        @NameInMap("BaselineStatus")
        public String baselineStatus;

        /**
         * <p>The buffer of the event, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Buffer")
        public Long buffer;

        /**
         * <p>The timestamp of the last handling.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("DealTime")
        public Long dealTime;

        /**
         * <p>The Alibaba Cloud UID of the last handler.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("DealUser")
        public String dealUser;

        /**
         * <p>The timestamp when the event was resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("FixTime")
        public Long fixTime;

        /**
         * <p>The timestamp when the event occurred. There may be a time difference between when the event occurred and when it was discovered.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("HappenTime")
        public Long happenTime;

        /**
         * <p>The instance ID associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The timestamp of the next alert.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("NextAlertTime")
        public Long nextAlertTime;

        /**
         * <p>The ID of the node associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node associated with the event.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The Alibaba Cloud UID of the event owner.</p>
         * 
         * <strong>example:</strong>
         * <p>952795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the node associated with the event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234 error</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The status of the event. Valid values: IGNORE (ignored), NEW (newly discovered), FIXING (being handled), and RECOVER (recovered).</p>
         * 
         * <strong>example:</strong>
         * <p>FIXING</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        /**
         * <p>The type of the event. Valid values: SLOW and ERROR.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR</p>
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
