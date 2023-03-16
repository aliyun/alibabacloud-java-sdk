// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponseBody extends TeaModel {
    /**
     * <p>The information about the key path.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetBaselineKeyPathResponseBodyData> data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
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
        /**
         * <p>The timestamp obtained by adding the predicted time when the instance started to run to the historical average running duration of the instance.</p>
         */
        @NameInMap("AbsTime")
        public Long absTime;

        /**
         * <p>The timestamp of the predicted time when the instance started to run.</p>
         */
        @NameInMap("BeginCast")
        public Long beginCast;

        /**
         * <p>The timestamp of the actual time when the instance started to run.</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The timestamp when the instance started to wait for resources.</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The timestamp when the instance started to wait for the scheduling time.</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The timestamp of the predicted time when the instance finished running.</p>
         */
        @NameInMap("EndCast")
        public Long endCast;

        /**
         * <p>The timestamp of the actual time when the instance finished running.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS. The value NOT_RUN indicates that the instance is not run. The value WAIT_TIME indicates that the instance is waiting to be run. The value WAIT_RESOURCE indicates that the instance is waiting for resources. The value RUNNING indicates that the instance is running. The value CHECKING indicates that data quality is being checked for the instance. The value CHECKING_CONDITION indicates that branch conditions are being checked for the instance. The value FAILURE indicates that the instance fails to run. The value SUCCESS indicates that the instance is run.</p>
         */
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
        /**
         * <p>The timestamp when the event was found.</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the event.</p>
         */
        @NameInMap("TopicId")
        public Long topicId;

        /**
         * <p>The name of the event.</p>
         */
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
        /**
         * <p>The data timestamp of the baseline instance.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The ID of the scheduling cycle of the instance. Valid values: 1 to 288.</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The type of the node. Valid values: 23, 10, 6, and 99. The value 23 indicates that the node is a Data Integration node. The value 10 indicates that the node is a MaxCompute SQL node. The value 6 indicates that the node is a Shell node. The value 99 indicates that the node is a zero load node.</p>
         */
        @NameInMap("PrgType")
        public Integer prgType;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The running records of the instance.</p>
         */
        @NameInMap("Runs")
        public java.util.List<GetBaselineKeyPathResponseBodyDataRuns> runs;

        /**
         * <p>The information about the events that are associated with the instance.</p>
         */
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
