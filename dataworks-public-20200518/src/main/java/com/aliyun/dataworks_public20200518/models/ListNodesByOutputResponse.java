// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListNodesByOutputResponseData> data;

    public static ListNodesByOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputResponse self = new ListNodesByOutputResponse();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNodesByOutputResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesByOutputResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByOutputResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesByOutputResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByOutputResponse setData(java.util.List<ListNodesByOutputResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByOutputResponseData> getData() {
        return this.data;
    }

    public static class ListNodesByOutputResponseDataNodeList extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ResGroupName")
        @Validation(required = true)
        public String resGroupName;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public Boolean repeatability;

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
        public Integer repeatInterval;

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

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        public static ListNodesByOutputResponseDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseDataNodeList self = new ListNodesByOutputResponseDataNodeList();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseDataNodeList setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodesByOutputResponseDataNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByOutputResponseDataNodeList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListNodesByOutputResponseDataNodeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesByOutputResponseDataNodeList setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListNodesByOutputResponseDataNodeList setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListNodesByOutputResponseDataNodeList setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListNodesByOutputResponseDataNodeList setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListNodesByOutputResponseDataNodeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesByOutputResponseDataNodeList setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListNodesByOutputResponseDataNodeList setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListNodesByOutputResponseDataNodeList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListNodesByOutputResponseDataNodeList setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListNodesByOutputResponseDataNodeList setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNodesByOutputResponseDataNodeList setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListNodesByOutputResponseDataNodeList setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListNodesByOutputResponseDataNodeList setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListNodesByOutputResponseDataNodeList setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListNodesByOutputResponseDataNodeList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

    }

    public static class ListNodesByOutputResponseData extends TeaModel {
        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("NodeList")
        @Validation(required = true)
        public java.util.List<ListNodesByOutputResponseDataNodeList> nodeList;

        public static ListNodesByOutputResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseData self = new ListNodesByOutputResponseData();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListNodesByOutputResponseData setNodeList(java.util.List<ListNodesByOutputResponseDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ListNodesByOutputResponseDataNodeList> getNodeList() {
            return this.nodeList;
        }

    }

}
