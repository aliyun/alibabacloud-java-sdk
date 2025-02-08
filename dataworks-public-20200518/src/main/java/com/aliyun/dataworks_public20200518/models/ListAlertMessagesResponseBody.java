// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesResponseBody extends TeaModel {
    /**
     * <p>The information about returned alerts.</p>
     */
    @NameInMap("Data")
    public ListAlertMessagesResponseBodyData data;

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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAlertMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesResponseBody self = new ListAlertMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesResponseBody setData(ListAlertMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAlertMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListAlertMessagesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlertMessagesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAlertMessagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesInstances extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
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
         * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS. The value NOT_RUN indicates that the instance is not run. The value WAIT_TIME indicates that the instance is waiting to be run. The value WAIT_RESOURCE indicates that the instance is waiting for resources. The value RUNNING indicates that the instance is running. The value CHECKING indicates that data quality is being checked for the node for which the instance is generated. The value CHECKING_CONDITION indicates that branch conditions are being checked for the node for which the instance is generated. The value FAILURE indicates that the instance fails to run. The value SUCCESS indicates that the instance is successfully run.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_RUN</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAlertMessagesResponseBodyDataAlertMessagesInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesInstances self = new ListAlertMessagesResponseBodyDataAlertMessagesInstances();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesNodes extends TeaModel {
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

        public static ListAlertMessagesResponseBodyDataAlertMessagesNodes build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesNodes self = new ListAlertMessagesResponseBodyDataAlertMessagesNodes();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
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
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGEROUS indicates that nodes are still running after the alert duration ends but the committed completion time does not arrive. The value OVER indicates that nodes are still running after the committed completion time.</p>
         * 
         * <strong>example:</strong>
         * <p>SAFE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert self = new ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBaselineOwner(String baselineOwner) {
            this.baselineOwner = baselineOwner;
            return this;
        }
        public String getBaselineOwner() {
            return this.baselineOwner;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesTopics extends TeaModel {
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
         * <p>1234</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>9527 error</p>
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
         * <p>The status of the event. Valid values: IGNORE, NEW, FIXING, and RECOVER. The value IGNORE indicates that the event is ignored. The value NEW indicates that the event is a new event. The value FIXING indicates that the event is being handled. The value RECOVER indicates that the event is handled.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXING</p>
         */
        @NameInMap("TopicStatus")
        public String topicStatus;

        public static ListAlertMessagesResponseBodyDataAlertMessagesTopics build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesTopics self = new ListAlertMessagesResponseBodyDataAlertMessagesTopics();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessages extends TeaModel {
        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AlertId")
        public Long alertId;

        /**
         * <p>The sending status of the notification. Valid values: READY_TO_SEND, SEND_FAIL, SEND_SUCCESS, and SEND_OVERLIMIT. The value READY_TO_SEND indicates that the notification is waiting to be sent. The value SEND_FAIL indicates that the notification fails to be sent. The value SEND_SUCCESS indicates that the notification is sent. The value SEND_OVERLIMIT indicates that the number of notifications that are sent exceeds the upper limit.</p>
         * 
         * <strong>example:</strong>
         * <p>READY_TO_SEND</p>
         */
        @NameInMap("AlertMessageStatus")
        public String alertMessageStatus;

        /**
         * <p>The notification method. Valid values: MAIL, SMS, and PHONE. Only DataWorks Professional Edition and more advanced editions support the PHONE notification method.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS</p>
         */
        @NameInMap("AlertMethod")
        public String alertMethod;

        /**
         * <p>The timestamp when the alert was reported.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531401000</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The ID of the Alibaba Cloud used by the alert recipient.</p>
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
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> instances;

        /**
         * <p>The nodes returned for different alert sources.</p>
         * <ul>
         * <li>The nodes that form a loop are returned if the value of the Source parameter is NODE_CYCLE_ALERT.</li>
         * <li>The nodes that are isolated are returned if the value of the Source parameter is NODE_LONELY_ALERT.</li>
         * </ul>
         */
        @NameInMap("Nodes")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> nodes;

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
        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert slaAlert;

        /**
         * <p>The type of the alert. Valid values: REMIND_ALERT, TOPIC_ALERT, SLA_ALERT, NODE_CYCLE_ALERT, and NODE_LONELY_ALERT. The value REMIND_ALERT indicates that the alert is a custom alert. The value TOPIC_ALERT indicates that the alert is an event alert. The value SLA_ALERT indicates that the alert is a baseline alert. The value NODE_CYCLE_ALERT indicates that the alert is reported for a node dependency loop. The value NODE_LONELY_ALERT indicates that the alert is reported for isolated nodes.</p>
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
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> topics;

        public static ListAlertMessagesResponseBodyDataAlertMessages build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessages self = new ListAlertMessagesResponseBodyDataAlertMessages();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertMessageStatus(String alertMessageStatus) {
            this.alertMessageStatus = alertMessageStatus;
            return this;
        }
        public String getAlertMessageStatus() {
            return this.alertMessageStatus;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertMethod(String alertMethod) {
            this.alertMethod = alertMethod;
            return this;
        }
        public String getAlertMethod() {
            return this.alertMethod;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertUser(String alertUser) {
            this.alertUser = alertUser;
            return this;
        }
        public String getAlertUser() {
            return this.alertUser;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setInstances(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> getInstances() {
            return this.instances;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setNodes(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> getNodes() {
            return this.nodes;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setSlaAlert(ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert slaAlert) {
            this.slaAlert = slaAlert;
            return this;
        }
        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert getSlaAlert() {
            return this.slaAlert;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setTopics(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> getTopics() {
            return this.topics;
        }

    }

    public static class ListAlertMessagesResponseBodyData extends TeaModel {
        /**
         * <p>The alerts.</p>
         */
        @NameInMap("AlertMessages")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> alertMessages;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of alerts returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListAlertMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyData self = new ListAlertMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyData setAlertMessages(java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> alertMessages) {
            this.alertMessages = alertMessages;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> getAlertMessages() {
            return this.alertMessages;
        }

        public ListAlertMessagesResponseBodyData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListAlertMessagesResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListAlertMessagesResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
