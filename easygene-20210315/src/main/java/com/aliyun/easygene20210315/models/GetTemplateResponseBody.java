// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MyApp</p>
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
     * <p>test template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("InputsExpression")
    public java.util.List<GetTemplateResponseBodyInputsExpression> inputsExpression;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <strong>example:</strong>
     * <p>2021-06-10T13:30:20.405878292Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("OutputsExpression")
    public java.util.List<GetTemplateResponseBodyOutputsExpression> outputsExpression;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>produceVersion</p>
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
     * <p>EasyGene</p>
     */
    @NameInMap("Source")
    public String source;

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

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetTemplateResponseBody setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public GetTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTemplateResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetTemplateResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetTemplateResponseBody setInputsExpression(java.util.List<GetTemplateResponseBodyInputsExpression> inputsExpression) {
        this.inputsExpression = inputsExpression;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyInputsExpression> getInputsExpression() {
        return this.inputsExpression;
    }

    public GetTemplateResponseBody setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetTemplateResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetTemplateResponseBody setOutputsExpression(java.util.List<GetTemplateResponseBodyOutputsExpression> outputsExpression) {
        this.outputsExpression = outputsExpression;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyOutputsExpression> getOutputsExpression() {
        return this.outputsExpression;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public GetTemplateResponseBody setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public GetTemplateResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetTemplateResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetTemplateResponseBodyInputsExpression extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test help</p>
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
         * <p>Task1</p>
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
         * <p>oss://bucket/file1.fastq</p>
         */
        @NameInMap("VariableValue")
        public String variableValue;

        public static GetTemplateResponseBodyInputsExpression build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyInputsExpression self = new GetTemplateResponseBodyInputsExpression();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyInputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetTemplateResponseBodyInputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetTemplateResponseBodyInputsExpression setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public GetTemplateResponseBodyInputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTemplateResponseBodyInputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetTemplateResponseBodyInputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetTemplateResponseBodyInputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class GetTemplateResponseBodyOutputsExpression extends TeaModel {
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
         * <p>2</p>
         */
        @NameInMap("StepOrder")
        public Long stepOrder;

        /**
         * <strong>example:</strong>
         * <p>jobname</p>
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
         * <p>string</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <strong>example:</strong>
         * <p>abc_1.fastq.gz</p>
         */
        @NameInMap("VariableValue")
        public String variableValue;

        public static GetTemplateResponseBodyOutputsExpression build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyOutputsExpression self = new GetTemplateResponseBodyOutputsExpression();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyOutputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetTemplateResponseBodyOutputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetTemplateResponseBodyOutputsExpression setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public GetTemplateResponseBodyOutputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTemplateResponseBodyOutputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetTemplateResponseBodyOutputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetTemplateResponseBodyOutputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

}
