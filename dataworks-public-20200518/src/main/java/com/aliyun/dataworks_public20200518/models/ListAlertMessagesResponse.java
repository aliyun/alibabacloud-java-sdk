// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesResponse extends TeaModel {
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
    public ListAlertMessagesResponseData data;

    public static ListAlertMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesResponse self = new ListAlertMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertMessagesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlertMessagesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlertMessagesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAlertMessagesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAlertMessagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertMessagesResponse setData(ListAlertMessagesResponseData data) {
        this.data = data;
        return this;
    }
    public ListAlertMessagesResponseData getData() {
        return this.data;
    }

    public static class ListAlertMessagesResponseDataAlertMessagesInstances extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        public static ListAlertMessagesResponseDataAlertMessagesInstances build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesInstances self = new ListAlertMessagesResponseDataAlertMessagesInstances();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseDataAlertMessagesInstances setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseDataAlertMessagesInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAlertMessagesResponseDataAlertMessagesInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseDataAlertMessagesInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlertMessagesResponseDataAlertMessagesInstances setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesTopics extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public String topicName;

        @NameInMap("TopicOwner")
        @Validation(required = true)
        public String topicOwner;

        @NameInMap("TopicStatus")
        @Validation(required = true)
        public String topicStatus;

        public static ListAlertMessagesResponseDataAlertMessagesTopics build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesTopics self = new ListAlertMessagesResponseDataAlertMessagesTopics();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setTopicOwner(String topicOwner) {
            this.topicOwner = topicOwner;
            return this;
        }
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public ListAlertMessagesResponseDataAlertMessagesTopics setTopicStatus(String topicStatus) {
            this.topicStatus = topicStatus;
            return this;
        }
        public String getTopicStatus() {
            return this.topicStatus;
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesNodes extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListAlertMessagesResponseDataAlertMessagesNodes build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesNodes self = new ListAlertMessagesResponseDataAlertMessagesNodes();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseDataAlertMessagesNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListAlertMessagesResponseDataAlertMessagesNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListAlertMessagesResponseDataAlertMessagesNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListAlertMessagesResponseDataAlertMessagesNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessagesSlaAlert extends TeaModel {
        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("BaselineOwner")
        @Validation(required = true)
        public String baselineOwner;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListAlertMessagesResponseDataAlertMessagesSlaAlert build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessagesSlaAlert self = new ListAlertMessagesResponseDataAlertMessagesSlaAlert();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setBaselineOwner(String baselineOwner) {
            this.baselineOwner = baselineOwner;
            return this;
        }
        public String getBaselineOwner() {
            return this.baselineOwner;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListAlertMessagesResponseDataAlertMessagesSlaAlert setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListAlertMessagesResponseDataAlertMessages extends TeaModel {
        @NameInMap("AlertId")
        @Validation(required = true)
        public Long alertId;

        @NameInMap("AlertTime")
        @Validation(required = true)
        public Long alertTime;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("RemindId")
        @Validation(required = true)
        public Long remindId;

        @NameInMap("RemindName")
        @Validation(required = true)
        public String remindName;

        @NameInMap("AlertUser")
        @Validation(required = true)
        public String alertUser;

        @NameInMap("AlertMethod")
        @Validation(required = true)
        public String alertMethod;

        @NameInMap("AlertMessageStatus")
        @Validation(required = true)
        public String alertMessageStatus;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Instances")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesInstances> instances;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesTopics> topics;

        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesNodes> nodes;

        @NameInMap("SlaAlert")
        @Validation(required = true)
        public ListAlertMessagesResponseDataAlertMessagesSlaAlert slaAlert;

        public static ListAlertMessagesResponseDataAlertMessages build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseDataAlertMessages self = new ListAlertMessagesResponseDataAlertMessages();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseDataAlertMessages setAlertId(Long alertId) {
            this.alertId = alertId;
            return this;
        }
        public Long getAlertId() {
            return this.alertId;
        }

        public ListAlertMessagesResponseDataAlertMessages setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public ListAlertMessagesResponseDataAlertMessages setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAlertMessagesResponseDataAlertMessages setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public ListAlertMessagesResponseDataAlertMessages setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public ListAlertMessagesResponseDataAlertMessages setAlertUser(String alertUser) {
            this.alertUser = alertUser;
            return this;
        }
        public String getAlertUser() {
            return this.alertUser;
        }

        public ListAlertMessagesResponseDataAlertMessages setAlertMethod(String alertMethod) {
            this.alertMethod = alertMethod;
            return this;
        }
        public String getAlertMethod() {
            return this.alertMethod;
        }

        public ListAlertMessagesResponseDataAlertMessages setAlertMessageStatus(String alertMessageStatus) {
            this.alertMessageStatus = alertMessageStatus;
            return this;
        }
        public String getAlertMessageStatus() {
            return this.alertMessageStatus;
        }

        public ListAlertMessagesResponseDataAlertMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListAlertMessagesResponseDataAlertMessages setInstances(java.util.List<ListAlertMessagesResponseDataAlertMessagesInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesInstances> getInstances() {
            return this.instances;
        }

        public ListAlertMessagesResponseDataAlertMessages setTopics(java.util.List<ListAlertMessagesResponseDataAlertMessagesTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesTopics> getTopics() {
            return this.topics;
        }

        public ListAlertMessagesResponseDataAlertMessages setNodes(java.util.List<ListAlertMessagesResponseDataAlertMessagesNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseDataAlertMessagesNodes> getNodes() {
            return this.nodes;
        }

        public ListAlertMessagesResponseDataAlertMessages setSlaAlert(ListAlertMessagesResponseDataAlertMessagesSlaAlert slaAlert) {
            this.slaAlert = slaAlert;
            return this;
        }
        public ListAlertMessagesResponseDataAlertMessagesSlaAlert getSlaAlert() {
            return this.slaAlert;
        }

    }

    public static class ListAlertMessagesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public String pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("AlertMessages")
        @Validation(required = true)
        public java.util.List<ListAlertMessagesResponseDataAlertMessages> alertMessages;

        public static ListAlertMessagesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAlertMessagesResponseData self = new ListAlertMessagesResponseData();
            return TeaModel.build(map, self);
        }

        public ListAlertMessagesResponseData setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListAlertMessagesResponseData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListAlertMessagesResponseData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListAlertMessagesResponseData setAlertMessages(java.util.List<ListAlertMessagesResponseDataAlertMessages> alertMessages) {
            this.alertMessages = alertMessages;
            return this;
        }
        public java.util.List<ListAlertMessagesResponseDataAlertMessages> getAlertMessages() {
            return this.alertMessages;
        }

    }

}
