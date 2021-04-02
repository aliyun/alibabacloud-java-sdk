// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponse extends TeaModel {
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
    public java.util.List<GetBaselineKeyPathResponseData> data;

    public static GetBaselineKeyPathResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathResponse self = new GetBaselineKeyPathResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineKeyPathResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBaselineKeyPathResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineKeyPathResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineKeyPathResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineKeyPathResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineKeyPathResponse setData(java.util.List<GetBaselineKeyPathResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBaselineKeyPathResponseData> getData() {
        return this.data;
    }

    public static class GetBaselineKeyPathResponseDataRuns extends TeaModel {
        @NameInMap("AbsTime")
        @Validation(required = true)
        public Long absTime;

        @NameInMap("BeginCast")
        @Validation(required = true)
        public Long beginCast;

        @NameInMap("BeginRunningTime")
        @Validation(required = true)
        public Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        @Validation(required = true)
        public Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        @Validation(required = true)
        public Long beginWaitTimeTime;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("CycTime")
        @Validation(required = true)
        public Long cycTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

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

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static GetBaselineKeyPathResponseDataRuns build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseDataRuns self = new GetBaselineKeyPathResponseDataRuns();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseDataRuns setAbsTime(Long absTime) {
            this.absTime = absTime;
            return this;
        }
        public Long getAbsTime() {
            return this.absTime;
        }

        public GetBaselineKeyPathResponseDataRuns setBeginCast(Long beginCast) {
            this.beginCast = beginCast;
            return this;
        }
        public Long getBeginCast() {
            return this.beginCast;
        }

        public GetBaselineKeyPathResponseDataRuns setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public GetBaselineKeyPathResponseDataRuns setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public GetBaselineKeyPathResponseDataRuns setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public GetBaselineKeyPathResponseDataRuns setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineKeyPathResponseDataRuns setCycTime(Long cycTime) {
            this.cycTime = cycTime;
            return this;
        }
        public Long getCycTime() {
            return this.cycTime;
        }

        public GetBaselineKeyPathResponseDataRuns setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineKeyPathResponseDataRuns setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineKeyPathResponseDataRuns setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineKeyPathResponseDataRuns setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineKeyPathResponseDataRuns setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineKeyPathResponseDataRuns setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineKeyPathResponseDataRuns setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineKeyPathResponseDataRuns setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineKeyPathResponseDataRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBaselineKeyPathResponseDataTopics extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("TopicId")
        @Validation(required = true)
        public Long topicId;

        @NameInMap("TopicName")
        @Validation(required = true)
        public Long topicName;

        @NameInMap("AddTime")
        @Validation(required = true)
        public Long addTime;

        public static GetBaselineKeyPathResponseDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseDataTopics self = new GetBaselineKeyPathResponseDataTopics();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseDataTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineKeyPathResponseDataTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetBaselineKeyPathResponseDataTopics setTopicName(Long topicName) {
            this.topicName = topicName;
            return this;
        }
        public Long getTopicName() {
            return this.topicName;
        }

        public GetBaselineKeyPathResponseDataTopics setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

    }

    public static class GetBaselineKeyPathResponseData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("PrgType")
        @Validation(required = true)
        public Integer prgType;

        @NameInMap("Runs")
        @Validation(required = true)
        public java.util.List<GetBaselineKeyPathResponseDataRuns> runs;

        @NameInMap("Topics")
        @Validation(required = true)
        public java.util.List<GetBaselineKeyPathResponseDataTopics> topics;

        public static GetBaselineKeyPathResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseData self = new GetBaselineKeyPathResponseData();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineKeyPathResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineKeyPathResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineKeyPathResponseData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineKeyPathResponseData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineKeyPathResponseData setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineKeyPathResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineKeyPathResponseData setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

        public GetBaselineKeyPathResponseData setRuns(java.util.List<GetBaselineKeyPathResponseDataRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<GetBaselineKeyPathResponseDataRuns> getRuns() {
            return this.runs;
        }

        public GetBaselineKeyPathResponseData setTopics(java.util.List<GetBaselineKeyPathResponseDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<GetBaselineKeyPathResponseDataTopics> getTopics() {
            return this.topics;
        }

    }

}
