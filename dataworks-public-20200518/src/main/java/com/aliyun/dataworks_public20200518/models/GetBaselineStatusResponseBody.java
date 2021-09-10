// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetBaselineStatusResponseBodyData data;

    public static GetBaselineStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusResponseBody self = new GetBaselineStatusResponseBody();
        return TeaModel.build(map, self);
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

    public GetBaselineStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBaselineStatusResponseBody setData(GetBaselineStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBaselineStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetBaselineStatusResponseBodyDataLastInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("NodeId")
        public Long nodeId;

        public static GetBaselineStatusResponseBodyDataLastInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyDataLastInstance self = new GetBaselineStatusResponseBodyDataLastInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyDataLastInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyDataLastInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetBaselineStatusResponseBodyDataBlockInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("NodeId")
        public Long nodeId;

        public static GetBaselineStatusResponseBodyDataBlockInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyDataBlockInstance self = new GetBaselineStatusResponseBodyDataBlockInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyDataBlockInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetBaselineStatusResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("EndCast")
        public Long endCast;

        @NameInMap("InGroupId")
        public Integer inGroupId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("FinishStatus")
        public String finishStatus;

        @NameInMap("Bizdate")
        public Long bizdate;

        @NameInMap("Buffer")
        public Float buffer;

        @NameInMap("SlaTime")
        public Long slaTime;

        @NameInMap("ExpTime")
        public Long expTime;

        @NameInMap("LastInstance")
        public GetBaselineStatusResponseBodyDataLastInstance lastInstance;

        @NameInMap("BlockInstance")
        public GetBaselineStatusResponseBodyDataBlockInstance blockInstance;

        public static GetBaselineStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseBodyData self = new GetBaselineStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineStatusResponseBodyData setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseBodyData setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineStatusResponseBodyData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineStatusResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineStatusResponseBodyData setFinishStatus(String finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public String getFinishStatus() {
            return this.finishStatus;
        }

        public GetBaselineStatusResponseBodyData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineStatusResponseBodyData setBuffer(Float buffer) {
            this.buffer = buffer;
            return this;
        }
        public Float getBuffer() {
            return this.buffer;
        }

        public GetBaselineStatusResponseBodyData setSlaTime(Long slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public Long getSlaTime() {
            return this.slaTime;
        }

        public GetBaselineStatusResponseBodyData setExpTime(Long expTime) {
            this.expTime = expTime;
            return this;
        }
        public Long getExpTime() {
            return this.expTime;
        }

        public GetBaselineStatusResponseBodyData setLastInstance(GetBaselineStatusResponseBodyDataLastInstance lastInstance) {
            this.lastInstance = lastInstance;
            return this;
        }
        public GetBaselineStatusResponseBodyDataLastInstance getLastInstance() {
            return this.lastInstance;
        }

        public GetBaselineStatusResponseBodyData setBlockInstance(GetBaselineStatusResponseBodyDataBlockInstance blockInstance) {
            this.blockInstance = blockInstance;
            return this;
        }
        public GetBaselineStatusResponseBodyDataBlockInstance getBlockInstance() {
            return this.blockInstance;
        }

    }

}
