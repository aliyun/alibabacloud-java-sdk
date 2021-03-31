// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListAlertMessagesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListAlertMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesResponseBody self = new ListAlertMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertMessagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public ListAlertMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesNodes extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListAlertMessagesResponseBodyDataAlertMessagesNodes build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesNodes self = new ListAlertMessagesResponseBodyDataAlertMessagesNodes();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesTopics extends TeaModel {
        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicOwner")
        public String topicOwner;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("TopicStatus")
        public String topicStatus;

        public static ListAlertMessagesResponseBodyDataAlertMessagesTopics build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesTopics self = new ListAlertMessagesResponseBodyDataAlertMessagesTopics();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("BaselineOwner")
        public String baselineOwner;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        public static ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert self = new ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBaselineOwner(String baselineOwner) {
            this.baselineOwner = baselineOwner;
            return this;
        }
        public String getBaselineOwner() {
            return this.baselineOwner;
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

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessagesInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListAlertMessagesResponseBodyDataAlertMessagesInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessagesInstances self = new ListAlertMessagesResponseBodyDataAlertMessagesInstances();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessagesInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

    }

    public static class ListAlertMessagesResponseBodyDataAlertMessages extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> nodes;

        @NameInMap("Topics")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> topics;

        @NameInMap("SlaAlert")
        public ListAlertMessagesResponseBodyDataAlertMessagesSlaAlert slaAlert;

        @NameInMap("Source")
        public String source;

        @NameInMap("Instances")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> instances;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("AlertMessageStatus")
        public String alertMessageStatus;

        @NameInMap("AlertUser")
        public String alertUser;

        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("AlertMethod")
        public String alertMethod;

        @NameInMap("Content")
        public String content;

        @NameInMap("RemindName")
        public String remindName;

        @NameInMap("AlertId")
        public Long alertId;

        public static ListAlertMessagesResponseBodyDataAlertMessages build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyDataAlertMessages self = new ListAlertMessagesResponseBodyDataAlertMessages();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setNodes(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesNodes> getNodes() {
            return this.nodes;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setTopics(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesTopics> getTopics() {
            return this.topics;
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

        public ListAlertMessagesResponseBodyDataAlertMessages setInstances(java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessagesInstances> getInstances() {
            return this.instances;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertMessageStatus(String alertMessageStatus) {
            this.alertMessageStatus = alertMessageStatus;
            return this;
        }
        public String getAlertMessageStatus() {
            return this.alertMessageStatus;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertUser(String alertUser) {
            this.alertUser = alertUser;
            return this;
        }
        public String getAlertUser() {
            return this.alertUser;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertMethod(String alertMethod) {
            this.alertMethod = alertMethod;
            return this;
        }
        public String getAlertMethod() {
            return this.alertMethod;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListAlertMessagesResponseBodyDataAlertMessages setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

    }

    public static class ListAlertMessagesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        @NameInMap("AlertMessages")
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> alertMessages;

        public static ListAlertMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseBodyData self = new ListAlertMessagesResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListAlertMessagesResponseBodyData setAlertMessages(java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> alertMessages) {
            this.alertMessages = alertMessages;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseBodyDataAlertMessages> getAlertMessages() {
            return this.alertMessages;
        }

    }

}
