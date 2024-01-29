// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTemplates(java.util.List<ListTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplatesResponseBodyTemplatesInputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Long stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        @NameInMap("VariableValue")
        public String variableValue;

        public static ListTemplatesResponseBodyTemplatesInputsExpression build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplatesInputsExpression self = new ListTemplatesResponseBodyTemplatesInputsExpression();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public ListTemplatesResponseBodyTemplatesInputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class ListTemplatesResponseBodyTemplatesOutputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Long stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        @NameInMap("VariableValue")
        public String variableValue;

        public static ListTemplatesResponseBodyTemplatesOutputsExpression build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplatesOutputsExpression self = new ListTemplatesResponseBodyTemplatesOutputsExpression();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public ListTemplatesResponseBodyTemplatesOutputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class ListTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppRevision")
        public String appRevision;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InputsExpression")
        public java.util.List<ListTemplatesResponseBodyTemplatesInputsExpression> inputsExpression;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("OutputsExpression")
        public java.util.List<ListTemplatesResponseBodyTemplatesOutputsExpression> outputsExpression;

        @NameInMap("RevisionTag")
        public String revisionTag;

        @NameInMap("RootEntity")
        public String rootEntity;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Workspace")
        public String workspace;

        public static ListTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplates self = new ListTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplates setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListTemplatesResponseBodyTemplates setAppRevision(String appRevision) {
            this.appRevision = appRevision;
            return this;
        }
        public String getAppRevision() {
            return this.appRevision;
        }

        public ListTemplatesResponseBodyTemplates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplatesResponseBodyTemplates setInputsExpression(java.util.List<ListTemplatesResponseBodyTemplatesInputsExpression> inputsExpression) {
            this.inputsExpression = inputsExpression;
            return this;
        }
        public java.util.List<ListTemplatesResponseBodyTemplatesInputsExpression> getInputsExpression() {
            return this.inputsExpression;
        }

        public ListTemplatesResponseBodyTemplates setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListTemplatesResponseBodyTemplates setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListTemplatesResponseBodyTemplates setOutputsExpression(java.util.List<ListTemplatesResponseBodyTemplatesOutputsExpression> outputsExpression) {
            this.outputsExpression = outputsExpression;
            return this;
        }
        public java.util.List<ListTemplatesResponseBodyTemplatesOutputsExpression> getOutputsExpression() {
            return this.outputsExpression;
        }

        public ListTemplatesResponseBodyTemplates setRevisionTag(String revisionTag) {
            this.revisionTag = revisionTag;
            return this;
        }
        public String getRevisionTag() {
            return this.revisionTag;
        }

        public ListTemplatesResponseBodyTemplates setRootEntity(String rootEntity) {
            this.rootEntity = rootEntity;
            return this;
        }
        public String getRootEntity() {
            return this.rootEntity;
        }

        public ListTemplatesResponseBodyTemplates setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseBodyTemplates setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
