// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodesByOutputResponseBody extends TeaModel {
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
    public java.util.List<ListNodesByOutputResponseBodyData> data;

    public static ListNodesByOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByOutputResponseBody self = new ListNodesByOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodesByOutputResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodesByOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodesByOutputResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodesByOutputResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodesByOutputResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNodesByOutputResponseBody setData(java.util.List<ListNodesByOutputResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodesByOutputResponseBodyData> getData() {
        return this.data;
    }

    public static class ListNodesByOutputResponseBodyDataNodeList extends TeaModel {
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("RepeatInterval")
        public Integer repeatInterval;

        @NameInMap("Repeatability")
        public Boolean repeatability;

        @NameInMap("FileType")
        public String fileType;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("ParamValues")
        public String paramValues;

        @NameInMap("RelatedFlowId")
        public Long relatedFlowId;

        @NameInMap("DqcType")
        public Integer dqcType;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Description")
        public String description;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ResGroupName")
        public String resGroupName;

        @NameInMap("DqcDescription")
        public String dqcDescription;

        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListNodesByOutputResponseBodyDataNodeList build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseBodyDataNodeList self = new ListNodesByOutputResponseBodyDataNodeList();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseBodyDataNodeList setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRepeatInterval(Integer repeatInterval) {
            this.repeatInterval = repeatInterval;
            return this;
        }
        public Integer getRepeatInterval() {
            return this.repeatInterval;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public ListNodesByOutputResponseBodyDataNodeList setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListNodesByOutputResponseBodyDataNodeList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public ListNodesByOutputResponseBodyDataNodeList setParamValues(String paramValues) {
            this.paramValues = paramValues;
            return this;
        }
        public String getParamValues() {
            return this.paramValues;
        }

        public ListNodesByOutputResponseBodyDataNodeList setRelatedFlowId(Long relatedFlowId) {
            this.relatedFlowId = relatedFlowId;
            return this;
        }
        public Long getRelatedFlowId() {
            return this.relatedFlowId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDqcType(Integer dqcType) {
            this.dqcType = dqcType;
            return this;
        }
        public Integer getDqcType() {
            return this.dqcType;
        }

        public ListNodesByOutputResponseBodyDataNodeList setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNodesByOutputResponseBodyDataNodeList setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNodesByOutputResponseBodyDataNodeList setResGroupName(String resGroupName) {
            this.resGroupName = resGroupName;
            return this;
        }
        public String getResGroupName() {
            return this.resGroupName;
        }

        public ListNodesByOutputResponseBodyDataNodeList setDqcDescription(String dqcDescription) {
            this.dqcDescription = dqcDescription;
            return this;
        }
        public String getDqcDescription() {
            return this.dqcDescription;
        }

        public ListNodesByOutputResponseBodyDataNodeList setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public ListNodesByOutputResponseBodyDataNodeList setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class ListNodesByOutputResponseBodyData extends TeaModel {
        @NameInMap("Output")
        public String output;

        @NameInMap("NodeList")
        public java.util.List<ListNodesByOutputResponseBodyDataNodeList> nodeList;

        public static ListNodesByOutputResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodesByOutputResponseBodyData self = new ListNodesByOutputResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodesByOutputResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListNodesByOutputResponseBodyData setNodeList(java.util.List<ListNodesByOutputResponseBodyDataNodeList> nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public java.util.List<ListNodesByOutputResponseBodyDataNodeList> getNodeList() {
            return this.nodeList;
        }

    }

}
