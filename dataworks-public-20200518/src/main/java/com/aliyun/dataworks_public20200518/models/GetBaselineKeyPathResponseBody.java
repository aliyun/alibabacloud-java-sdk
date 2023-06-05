// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetBaselineKeyPathResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The timestamp when the event was found.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBaselineKeyPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineKeyPathResponseBody self = new GetBaselineKeyPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaselineKeyPathResponseBody setData(java.util.List<GetBaselineKeyPathResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetBaselineKeyPathResponseBodyData> getData() {
        return this.data;
    }

    public GetBaselineKeyPathResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineKeyPathResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineKeyPathResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineKeyPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineKeyPathResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBaselineKeyPathResponseBodyDataRuns extends TeaModel {
        @NameInMap("AbsTime")
        public Long absTime;

        @NameInMap("BeginCast")
        public Long beginCast;

        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("Status")
        public String status;

        public static GetBaselineKeyPathResponseBodyDataRuns build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseBodyDataRuns self = new GetBaselineKeyPathResponseBodyDataRuns();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseBodyDataRuns setAbsTime(Long absTime) {
            this.absTime = absTime;
            return this;
        }
        public Long getAbsTime() {
            return this.absTime;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setBeginCast(Long beginCast) {
            this.beginCast = beginCast;
            return this;
        }
        public Long getBeginCast() {
            return this.beginCast;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setBeginRunningTime(Long beginRunningTime) {
            this.beginRunningTime = beginRunningTime;
            return this;
        }
        public Long getBeginRunningTime() {
            return this.beginRunningTime;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setBeginWaitResTime(Long beginWaitResTime) {
            this.beginWaitResTime = beginWaitResTime;
            return this;
        }
        public Long getBeginWaitResTime() {
            return this.beginWaitResTime;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setBeginWaitTimeTime(Long beginWaitTimeTime) {
            this.beginWaitTimeTime = beginWaitTimeTime;
            return this;
        }
        public Long getBeginWaitTimeTime() {
            return this.beginWaitTimeTime;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineKeyPathResponseBodyDataRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBaselineKeyPathResponseBodyDataTopics extends TeaModel {
        @NameInMap("AddTime")
        public Long addTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("TopicId")
        public Long topicId;

        @NameInMap("TopicName")
        public String topicName;

        public static GetBaselineKeyPathResponseBodyDataTopics build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseBodyDataTopics self = new GetBaselineKeyPathResponseBodyDataTopics();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseBodyDataTopics setAddTime(Long addTime) {
            this.addTime = addTime;
            return this;
        }
        public Long getAddTime() {
            return this.addTime;
        }

        public GetBaselineKeyPathResponseBodyDataTopics setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineKeyPathResponseBodyDataTopics setTopicId(Long topicId) {
            this.topicId = topicId;
            return this;
        }
        public Long getTopicId() {
            return this.topicId;
        }

        public GetBaselineKeyPathResponseBodyDataTopics setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class GetBaselineKeyPathResponseBodyData extends TeaModel {
        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PrgType")
        public Integer prgType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Runs")
        public java.util.List<GetBaselineKeyPathResponseBodyDataRuns> runs;

        @NameInMap("Topics")
        public java.util.List<GetBaselineKeyPathResponseBodyDataTopics> topics;

        public static GetBaselineKeyPathResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineKeyPathResponseBodyData self = new GetBaselineKeyPathResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineKeyPathResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineKeyPathResponseBodyData setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineKeyPathResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineKeyPathResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineKeyPathResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineKeyPathResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineKeyPathResponseBodyData setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

        public GetBaselineKeyPathResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineKeyPathResponseBodyData setRuns(java.util.List<GetBaselineKeyPathResponseBodyDataRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<GetBaselineKeyPathResponseBodyDataRuns> getRuns() {
            return this.runs;
        }

        public GetBaselineKeyPathResponseBodyData setTopics(java.util.List<GetBaselineKeyPathResponseBodyDataTopics> topics) {
            this.topics = topics;
            return this;
        }
        public java.util.List<GetBaselineKeyPathResponseBodyDataTopics> getTopics() {
            return this.topics;
        }

    }

}
