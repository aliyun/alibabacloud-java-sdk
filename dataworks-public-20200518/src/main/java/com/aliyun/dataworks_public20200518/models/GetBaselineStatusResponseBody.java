// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponseBody extends TeaModel {
    /**
     * <p>The details of the baseline instance.</p>
     */
    @NameInMap("Data")
    public GetBaselineStatusResponseBodyData data;

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

    public static GetBaselineStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusResponseBody self = new GetBaselineStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBaselineStatusResponseBody setData(GetBaselineStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBaselineStatusResponseBodyData getData() {
        return this.data;
    }

    public GetBaselineStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBaselineStatusResponseBodyDataBlockInstance extends TeaModel {
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
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS. The value NOT_RUN indicates that the instance is not run. The value WAIT_TIME indicates that the instance is waiting to be run. The value WAIT_RESOURCE indicates that the instance is waiting for resources. The value RUNNING indicates that the instance is running. The value CHECKING indicates that data quality is being checked for the instance. The value CHECKING_CONDITION indicates that branch conditions are being checked for the instance. The value FAILURE indicates that the instance fails to run. The value SUCCESS indicates that the instance is run.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBaselineStatusResponseBodyDataBlockInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyDataBlockInstance self = new GetBaselineStatusResponseBodyDataBlockInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBaselineStatusResponseBodyDataLastInstance extends TeaModel {
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
         * <p>The ID of the workspace to which the node belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The status of the instance. Valid values: NOT_RUN, WAIT_TIME, WAIT_RESOURCE, RUNNING, CHECKING, CHECKING_CONDITION, FAILURE, and SUCCESS. The value NOT_RUN indicates that the instance is not run. The value WAIT_TIME indicates that the instance is waiting to be run. The value WAIT_RESOURCE indicates that the instance is waiting for resources. The value RUNNING indicates that the instance is running. The value CHECKING indicates that data quality is being checked for the instance. The value CHECKING_CONDITION indicates that branch conditions are being checked for the instance. The value FAILURE indicates that the instance fails to run. The value SUCCESS indicates that the instance is run.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBaselineStatusResponseBodyDataLastInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyDataLastInstance self = new GetBaselineStatusResponseBodyDataLastInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyDataLastInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBaselineStatusResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        /**
         * <p>The data timestamp of the baseline instance.</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The information about the key instance.</p>
         */
        @NameInMap("BlockInstance")
        public GetBaselineStatusResponseBodyDataBlockInstance blockInstance;

        /**
         * <p>The margin of the baseline instance. Unit: seconds.</p>
         */
        @NameInMap("Buffer")
        public Float buffer;

        /**
         * <p>The timestamp of the predicted time when the baseline instance finished running.</p>
         */
        @NameInMap("EndCast")
        public Long endCast;

        /**
         * <p>The timestamp of the alerting time of the baseline instance.</p>
         */
        @NameInMap("ExpTime")
        public Long expTime;

        /**
         * <p>The status of the baseline instance. Valid values: UNFINISH and FINISH. The value UNFINISH indicates that the baseline instance is still running. The value FINISH indicates that the baseline instance finishes running.</p>
         */
        @NameInMap("FinishStatus")
        public String finishStatus;

        /**
         * <p>The timestamp of the actual time when the baseline instance finished running. This parameter is returned if the value of the FinishStatus parameter is FINISH.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the scheduling cycle of the baseline instance. For a baseline instance that is scheduled by day, the value of this parameter is 1. For a baseline instance that is scheduled by hour, the value of this parameter ranges from 1 to 24.</p>
         */
        @NameInMap("InGroupId")
        public Integer inGroupId;

        /**
         * <p>The information about the last generated instance.</p>
         */
        @NameInMap("LastInstance")
        public GetBaselineStatusResponseBodyDataLastInstance lastInstance;

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The priority of the baseline. Valid values: 1, 2, 5, 7, and 8.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the workspace to which the baseline belongs.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The timestamp of the committed completion time of the baseline instance.</p>
         */
        @NameInMap("SlaTime")
        public Long slaTime;

        /**
         * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes finish running before the alerting time. The value DANGEROUS indicates that nodes are still running after the alerting time but before the committed completion time. The value OVER indicates that nodes are still running after the committed completion time.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBaselineStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyData self = new GetBaselineStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineStatusResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineStatusResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineStatusResponseBodyData setBlockInstance(GetBaselineStatusResponseBodyDataBlockInstance blockInstance) {
            this.blockInstance = blockInstance;
            return this;
        }
        public GetBaselineStatusResponseBodyDataBlockInstance getBlockInstance() {
            return this.blockInstance;
        }

        public GetBaselineStatusResponseBodyData setBuffer(Float buffer) {
            this.buffer = buffer;
            return this;
        }
        public Float getBuffer() {
            return this.buffer;
        }

        public GetBaselineStatusResponseBodyData setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyData setExpTime(Long expTime) {
            this.expTime = expTime;
            return this;
        }
        public Long getExpTime() {
            return this.expTime;
        }

        public GetBaselineStatusResponseBodyData setFinishStatus(String finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public String getFinishStatus() {
            return this.finishStatus;
        }

        public GetBaselineStatusResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyData setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineStatusResponseBodyData setLastInstance(GetBaselineStatusResponseBodyDataLastInstance lastInstance) {
            this.lastInstance = lastInstance;
            return this;
        }
        public GetBaselineStatusResponseBodyDataLastInstance getLastInstance() {
            return this.lastInstance;
        }

        public GetBaselineStatusResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineStatusResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyData setSlaTime(Long slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public Long getSlaTime() {
            return this.slaTime;
        }

        public GetBaselineStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
