// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetAlertMessageResponseBody extends TeaModel {
    /**
     * <p>The information about returned alerts.</p>
     */
    @NameInMap("Data")
    public GetAlertMessageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAlertMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertMessageResponseBody self = new GetAlertMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertMessageResponseBody setData(GetAlertMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlertMessageResponseBodyData getData() {
        return this.data;
    }

    public GetAlertMessageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAlertMessageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAlertMessageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAlertMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlertMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlertMessageResponseBodyDataInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12312312</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>NOT_RUN</li>
         * <li>WAIT_TIME</li>
         * <li>WAIT_RESOURCE</li>
         * <li>RUNNING</li>
         * <li>CHECKING</li>
         * <li>CHECKING_CONDITION</li>
         * <li>FAILURE</li>
         * <li>SUCCESS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAlertMessageResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            GetAlertMessageResponseBodyDataInstances self = new GetAlertMessageResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public GetAlertMessageResponseBodyDataInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetAlertMessageResponseBodyDataInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetAlertMessageResponseBodyDataInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetAlertMessageResponseBodyDataInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetAlertMessageResponseBodyDataInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAlertMessageResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>95279527952****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetAlertMessageResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetAlertMessageResponseBodyDataNodes self = new GetAlertMessageResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetAlertMessageResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetAlertMessageResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetAlertMessageResponseBodyDataNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetAlertMessageResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetAlertMessageResponseBodyDataSlaAlert extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15142123</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>952795279****</p>
         */
        @NameInMap("BaselineOwner")
        public String baselineOwner;

        /**
         * <p>The data timestamp of the baseline instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553443200000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The ID of the cycle of the baseline instance. Valid values of the ID of an hour-level cycle: [1,24]. The ID of a day-level cycle is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the baseline. Valid values:</p>
         * <ul>
         * <li>ERROR</li>
         * <li>SAFE</li>
         * <li>DANGEROUS</li>
         * <li>OVER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAlertMessageResponseBodyDataSlaAlert build(java.util.Map<String, ?> map) throws Exception {
            GetAlertMessageResponseBodyDataSlaAlert self = new GetAlertMessageResponseBodyDataSlaAlert();
            return TeaModel.build(map, self);
        }

        public GetAlertMessageResponseBodyDataSlaAlert setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setBaselineOwner(String baselineOwner) {
            this.baselineOwner = baselineOwner;
            return this;
        }
        public String getBaselineOwner() {
            return this.baselineOwner;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetAlertMessageResponseBodyDataSlaAlert setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAlertMessageResponseBodyDataTopics extends TeaModel {
        /**
         * <p>The ID of the instance that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the node that triggered the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>412431</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the event owner.</p>
         * 
         * <strong>example:</strong>
         * <p>9527952795****</p>
         */
        @NameInMap("TopicOwner")
        public String topicOwner;

        /**
         * <p>The status of the event. Valid values:</p>
         * <ul>
         * <li>IGNORE</li>
         * <li>NEW</li>
         * <li>FIXING</li>
         * <li>RECOVER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FIXING</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        public static GetAlertMessageResponseBodyDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetAlertMessageResponseBodyDataTopics self = new GetAlertMessageResponseBodyDataTopics();
            return TeaModel.build(map, self);
        }

        public GetAlertMessageResponseBodyDataTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetAlertMessageResponseBodyDataTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetAlertMessageResponseBodyDataTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetAlertMessageResponseBodyDataTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public GetAlertMessageResponseBodyDataTopics setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public GetAlertMessageResponseBodyDataTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

    }

    public static class GetAlertMessageResponseBodyData extends TeaModel {
        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The sending status of the notification. Valid values:</p>
         * <ul>
         * <li>READY_TO_SEND: The notification is waiting to be sent.</li>
         * <li>SEND_FAIL: The notification fails to be sent.</li>
         * <li>SEND_SUCCESS: The notification is sent.</li>
         * <li>SEND_OVERLIMIT: The number of notifications that are sent exceeds the upper limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY_TO_SEND</p>
         */
        @NameInMap("AlertMessageStatus")
        public String alertMessageStatus;

        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li>MAIL.</li>
         * <li>SMS.</li>
         * <li>PHONE. Only DataWorks Professional Edition and more advanced editions support the PHONE notification method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("AlertMethod")
        public String alertMethod;

        /**
         * <p>The time when the alert was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1553524393000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the alert recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>9527952795****</p>
         */
        @NameInMap("AlertUser")
        public String alertUser;

        /**
         * <p>The content of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Node error</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The instances that triggered the custom alert rule. This parameter is returned if the value of the Source parameter is REMIND_ALERT. This parameter is left empty if the value of the Source parameter is not REMIND_ALERT.</p>
         */
        @NameInMap("Instances")
        public java.util.List<GetAlertMessageResponseBodyDataInstances> instances;

        /**
         * <p>The nodes returned for different alert sources. The nodes that form a loop are returned if the value of the Source parameter is NODE_CYCLE_ALERT. The nodes that are isolated are returned if the value of the Source parameter is NODE_LONELY_ALERT.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetAlertMessageResponseBodyDataNodes> nodes;

        /**
         * <p>The ID of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("RemindId")
        public Long remindId;

        /**
         * <p>The name of the custom alert rule that was triggered. This parameter is returned if the value of the Source parameter is REMIND_ALERT.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom monitoring rule name</p>
         */
        @NameInMap("RemindName")
        public String remindName;

        /**
         * <p>The basic information about the baseline instance that triggered an alert. This parameter is returned if the value of the Source parameter is SLA_ALERT. This parameter is left empty if the value of the Source parameter is not SLA_ALERT.</p>
         */
        @NameInMap("SlaAlert")
        public GetAlertMessageResponseBodyDataSlaAlert slaAlert;

        /**
         * <p>The type of the alert. Valid values:</p>
         * <ul>
         * <li>REMIND_ALERT: The alert is a custom alert.</li>
         * <li>TOPIC_ALERT: The alert is an event alert.</li>
         * <li>SLA_ALERT: The alert is a baseline alert.</li>
         * <li>NODE_CYCLE_ALERT: The alert is reported for a node dependency loop.</li>
         * <li>NODE_LONELY_ALERT: The alert is reported for isolated nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REMIND_ALERT</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The events that triggered alerts. This parameter is returned if the value of the Source parameter is TOPIC_ALERT. This parameter is left empty if the value of the Source parameter is not TOPIC_ALERT.</p>
         */
        @NameInMap("Topics")
        public java.util.List<GetAlertMessageResponseBodyDataTopics> topics;

        public static GetAlertMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlertMessageResponseBodyData self = new GetAlertMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlertMessageResponseBodyData setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public GetAlertMessageResponseBodyData setAlertMessageStatus(String alertMessageStatus) {
            this.alertMessageStatus = alertMessageStatus;
            return this;
        }
        public String getAlertMessageStatus() {
            return this.alertMessageStatus;
        }

        public GetAlertMessageResponseBodyData setAlertMethod(String alertMethod) {
            this.alertMethod = alertMethod;
            return this;
        }
        public String getAlertMethod() {
            return this.alertMethod;
        }

        public GetAlertMessageResponseBodyData setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public GetAlertMessageResponseBodyData setAlertUser(String alertUser) {
            this.alertUser = alertUser;
            return this;
        }
        public String getAlertUser() {
            return this.alertUser;
        }

        public GetAlertMessageResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAlertMessageResponseBodyData setInstances(java.util.List<GetAlertMessageResponseBodyDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<GetAlertMessageResponseBodyDataInstances> getInstances() {
            return this.instances;
        }

        public GetAlertMessageResponseBodyData setNodes(java.util.List<GetAlertMessageResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetAlertMessageResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetAlertMessageResponseBodyData setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetAlertMessageResponseBodyData setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public GetAlertMessageResponseBodyData setSlaAlert(GetAlertMessageResponseBodyDataSlaAlert slaAlert) {
            this.slaAlert = slaAlert;
            return this;
        }
        public GetAlertMessageResponseBodyDataSlaAlert getSlaAlert() {
            return this.slaAlert;
        }

        public GetAlertMessageResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAlertMessageResponseBodyData setTopics(java.util.List<GetAlertMessageResponseBodyDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<GetAlertMessageResponseBodyDataTopics> getTopics() {
            return this.topics;
        }

    }

}
