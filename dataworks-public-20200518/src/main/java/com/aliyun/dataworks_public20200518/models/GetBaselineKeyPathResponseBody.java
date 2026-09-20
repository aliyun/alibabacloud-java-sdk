// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineKeyPathResponseBody extends TeaModel {
    /**
     * <p>The critical path information.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetBaselineKeyPathResponseBodyData> data;

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
         * <p>The timestamp calculated by adding the historical average run duration to the estimated start time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531402000</p>
         */
        @NameInMap("AbsTime")
        public Long absTime;

        /**
         * <p>The estimated start time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531686000</p>
         */
        @NameInMap("BeginCast")
        public Long beginCast;

        /**
         * <p>The timestamp when the instance actually started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531401000</p>
         */
        @NameInMap("BeginRunningTime")
        public Long beginRunningTime;

        /**
         * <p>The timestamp when the instance entered the waiting-for-resources state.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531401000</p>
         */
        @NameInMap("BeginWaitResTime")
        public Long beginWaitResTime;

        /**
         * <p>The timestamp when the instance entered the waiting-for-time state.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531400000</p>
         */
        @NameInMap("BeginWaitTimeTime")
        public Long beginWaitTimeTime;

        /**
         * <p>The estimated end time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531687000</p>
         */
        @NameInMap("EndCast")
        public Long endCast;

        /**
         * <p>The timestamp when the instance actually finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531401000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>NOT_RUN: not run.</li>
         * <li>WAIT_TIME: waiting for the scheduled time.</li>
         * <li>WAIT_RESOURCE: waiting for resources.</li>
         * <li>RUNNING: running.</li>
         * <li>CHECKING: checking.</li>
         * <li>CHECKING_CONDITION: checking conditions.</li>
         * <li>FAILURE: failed.</li>
         * <li>SUCCESS: succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
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
         * <p>The timestamp when the event was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>1553531401000</p>
         */
        @NameInMap("AddTime")
        public Long addTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

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
         * <p>1234</p>
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
         * <p>The timestamp of the business date of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1553443200000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The cycle number of the instance. Valid values: [1,288\].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the node.</p>
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
         * <p>The Alibaba Cloud UID of the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>9527952****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The node type. Common node types include Data Integration (23), MaxCompute SQL (10), Shell (6), and virtual node (99).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PrgType")
        public Integer prgType;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The run records of the instance.</p>
         */
        @NameInMap("Runs")
        public java.util.List<GetBaselineKeyPathResponseBodyDataRuns> runs;

        /**
         * <p>The event information associated with the instance.</p>
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
