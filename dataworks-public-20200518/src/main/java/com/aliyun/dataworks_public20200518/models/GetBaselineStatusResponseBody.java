// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBaselineStatusResponseBodyData data;

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
        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public Long projectId;

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
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("BlockInstance")
        public GetBaselineStatusResponseBodyDataBlockInstance blockInstance;

        @NameInMap("Buffer")
        public Float buffer;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("ExpTime")
        public Long expTime;

        @NameInMap("FinishStatus")
        public String finishStatus;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("LastInstance")
        public GetBaselineStatusResponseBodyDataLastInstance lastInstance;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("SlaTime")
        public Long slaTime;

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
