// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2P1dvcmtzcGFjZT93cy1mMDE4OTgxNGU1ZTkK</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>help test</p>
         */
        @NameInMap("Help")
        public String help;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StepOrder")
        public Long stepOrder;

        /**
         * <strong>example:</strong>
         * <p>task1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>fastq1</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <strong>example:</strong>
         * <p>oss://bucket/file1.fastq</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>help test</p>
         */
        @NameInMap("Help")
        public String help;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StepOrder")
        public Long stepOrder;

        /**
         * <strong>example:</strong>
         * <p>task1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <strong>example:</strong>
         * <p>oss://bucket/test.vcf</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>my-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppRevision")
        public String appRevision;

        /**
         * <strong>example:</strong>
         * <p>2021-06-10T13:30:20.414557061Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>This is a test template</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("InputsExpression")
        public java.util.List<ListTemplatesResponseBodyTemplatesInputsExpression> inputsExpression;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <strong>example:</strong>
         * <p>2021-06-10T13:30:20.414557061Z</p>
         */
        @NameInMap("LastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("OutputsExpression")
        public java.util.List<ListTemplatesResponseBodyTemplatesOutputsExpression> outputsExpression;

        /**
         * <strong>example:</strong>
         * <p>ProduceVersion</p>
         */
        @NameInMap("RevisionTag")
        public String revisionTag;

        /**
         * <strong>example:</strong>
         * <p>test-entity</p>
         */
        @NameInMap("RootEntity")
        public String rootEntity;

        /**
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>test-workspace</p>
         */
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
