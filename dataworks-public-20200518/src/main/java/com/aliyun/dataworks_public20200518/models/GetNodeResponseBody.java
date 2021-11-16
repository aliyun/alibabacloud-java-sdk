// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetNodeResponseBodyData data;

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

    public static GetNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponseBody self = new GetNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeResponseBody setData(GetNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeResponseBodyData getData() {
        return this.data;
    }

    public GetNodeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeResponseBodyData extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BusinessId")
        public Long businessId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("Description")
        public String description;

        @NameInMap("DqcDescription")
        public String dqcDescription;

        @NameInMap("DqcType")
        public Integer dqcType;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        @NameInMap("RepeatInterval")
        public Long repeatInterval;

        @NameInMap("Repeatability")
        public String repeatability;

        @NameInMap("ResGroupName")
        public String resGroupName;

        @NameInMap("SchedulerType")
        public String schedulerType;

        public static GetNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseBodyData self = new GetNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseBodyData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeResponseBodyData setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetNodeResponseBodyData setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public GetNodeResponseBodyData setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNodeResponseBodyData setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public GetNodeResponseBodyData setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public GetNodeResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeResponseBodyData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeResponseBodyData setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetNodeResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeResponseBodyData setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeResponseBodyData setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public GetNodeResponseBodyData setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public GetNodeResponseBodyData setRepeatability(String repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public String getRepeatability() {
            return this.repeatability;
        }

        public GetNodeResponseBodyData setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public GetNodeResponseBodyData setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

}
