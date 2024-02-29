// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetAlertMessageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAlertMessageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

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
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineOwner")
        public String baselineOwner;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicName")
        public String topicName;

        @NameInMap("TopicOwner")
        public String topicOwner;

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
        @NameInMap("AlertId")
        public Long alertId;

        @NameInMap("AlertMessageStatus")
        public String alertMessageStatus;

        @NameInMap("AlertMethod")
        public String alertMethod;

        @NameInMap("AlertTime")
        public Long alertTime;

        @NameInMap("AlertUser")
        public String alertUser;

        @NameInMap("Content")
        public String content;

        @NameInMap("Instances")
        public java.util.List<GetAlertMessageResponseBodyDataInstances> instances;

        @NameInMap("Nodes")
        public java.util.List<GetAlertMessageResponseBodyDataNodes> nodes;

        @NameInMap("RemindId")
        public Long remindId;

        @NameInMap("RemindName")
        public String remindName;

        @NameInMap("SlaAlert")
        public GetAlertMessageResponseBodyDataSlaAlert slaAlert;

        @NameInMap("Source")
        public String source;

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
