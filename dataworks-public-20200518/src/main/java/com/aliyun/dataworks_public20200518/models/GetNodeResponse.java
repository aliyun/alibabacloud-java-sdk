// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeResponse extends TeaModel {
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
    public GetNodeResponseData data;

    public static GetNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeResponse self = new GetNodeResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNodeResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeResponse setData(GetNodeResponseData data) {
        this.data = data;
        return this;
    }
    public GetNodeResponseData getData() {
        return this.data;
    }

    public static class GetNodeResponseData extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResGroupName")
        @Validation(required = true)
        public String resGroupName;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public String repeatability;

        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("SchedulerType")
        @Validation(required = true)
        public String schedulerType;

        @NameInMap("ParamValues")
        @Validation(required = true)
        public String paramValues;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        @NameInMap("RepeatInterval")
        @Validation(required = true)
        public Long repeatInterval;

        @NameInMap("Connection")
        @Validation(required = true)
        public String connection;

        @NameInMap("DqcType")
        @Validation(required = true)
        public Integer dqcType;

        @NameInMap("DqcDescription")
        @Validation(required = true)
        public String dqcDescription;

        @NameInMap("RelatedFlowId")
        @Validation(required = true)
        public Long relatedFlowId;

        public static GetNodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeResponseData self = new GetNodeResponseData();
            return TeaModel.build(map, self);
        }

        public GetNodeResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeResponseData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetNodeResponseData setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public GetNodeResponseData setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeResponseData setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeResponseData setRepeatability(String repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public String getRepeatability() {
            return this.repeatability;
        }

        public GetNodeResponseData setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeResponseData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeResponseData setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeResponseData setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public GetNodeResponseData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeResponseData setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeResponseData setRepeatInterval(Long repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Long getRepeatInterval() {
            return this.repeatInterval;
        }

        public GetNodeResponseData setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public GetNodeResponseData setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public GetNodeResponseData setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public GetNodeResponseData setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

    }

}
