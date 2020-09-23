// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineStatusResponse extends TeaModel {
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
    public GetBaselineStatusResponseData data;

    public static GetBaselineStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineStatusResponse self = new GetBaselineStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBaselineStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBaselineStatusResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBaselineStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBaselineStatusResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBaselineStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBaselineStatusResponse setData(GetBaselineStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetBaselineStatusResponseData getData() {
        return this.data;
    }

    public static class GetBaselineStatusResponseDataLastInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        public static GetBaselineStatusResponseDataLastInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseDataLastInstance self = new GetBaselineStatusResponseDataLastInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseDataLastInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseDataLastInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseDataLastInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseDataLastInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseDataLastInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineStatusResponseDataLastInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseDataLastInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseDataLastInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetBaselineStatusResponseDataBlockInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        public static GetBaselineStatusResponseDataBlockInstance build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseDataBlockInstance self = new GetBaselineStatusResponseDataBlockInstance();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseDataBlockInstance setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetBaselineStatusResponseDataBlockInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseDataBlockInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseDataBlockInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseDataBlockInstance setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetBaselineStatusResponseDataBlockInstance setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseDataBlockInstance setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseDataBlockInstance setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetBaselineStatusResponseData extends TeaModel {
        @NameInMap("BaselineName")
        @Validation(required = true)
        public String baselineName;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("ExpTime")
        @Validation(required = true)
        public Long expTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("EndCast")
        @Validation(required = true)
        public Long endCast;

        @NameInMap("SlaTime")
        @Validation(required = true)
        public Long slaTime;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Buffer")
        @Validation(required = true)
        public Float buffer;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FinishStatus")
        @Validation(required = true)
        public String finishStatus;

        @NameInMap("InGroupId")
        @Validation(required = true)
        public Integer inGroupId;

        @NameInMap("LastInstance")
        @Validation(required = true)
        public GetBaselineStatusResponseDataLastInstance lastInstance;

        @NameInMap("BlockInstance")
        @Validation(required = true)
        public GetBaselineStatusResponseDataBlockInstance blockInstance;

        public static GetBaselineStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBaselineStatusResponseData self = new GetBaselineStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetBaselineStatusResponseData setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetBaselineStatusResponseData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetBaselineStatusResponseData setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetBaselineStatusResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBaselineStatusResponseData setExpTime(Long expTime) {
            this.expTime = expTime;
            return this;
        }
        public Long getExpTime() {
            return this.expTime;
        }

        public GetBaselineStatusResponseData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetBaselineStatusResponseData setEndCast(Long endCast) {
            this.endCast = endCast;
            return this;
        }
        public Long getEndCast() {
            return this.endCast;
        }

        public GetBaselineStatusResponseData setSlaTime(Long slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public Long getSlaTime() {
            return this.slaTime;
        }

        public GetBaselineStatusResponseData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetBaselineStatusResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBaselineStatusResponseData setBuffer(Float buffer) {
            this.buffer = buffer;
            return this;
        }
        public Float getBuffer() {
            return this.buffer;
        }

        public GetBaselineStatusResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBaselineStatusResponseData setFinishStatus(String finishStatus) {
            this.finishStatus = finishStatus;
            return this;
        }
        public String getFinishStatus() {
            return this.finishStatus;
        }

        public GetBaselineStatusResponseData setInGroupId(Integer inGroupId) {
            this.inGroupId = inGroupId;
            return this;
        }
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        public GetBaselineStatusResponseData setLastInstance(GetBaselineStatusResponseDataLastInstance lastInstance) {
            this.lastInstance = lastInstance;
            return this;
        }
        public GetBaselineStatusResponseDataLastInstance getLastInstance() {
            return this.lastInstance;
        }

        public GetBaselineStatusResponseData setBlockInstance(GetBaselineStatusResponseDataBlockInstance blockInstance) {
            this.blockInstance = blockInstance;
            return this;
        }
        public GetBaselineStatusResponseDataBlockInstance getBlockInstance() {
            return this.blockInstance;
        }

    }

}
