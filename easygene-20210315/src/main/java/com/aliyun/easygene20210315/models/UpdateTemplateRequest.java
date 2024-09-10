// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is a test template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputsExpression")
    public java.util.List<UpdateTemplateRequestInputsExpression> inputsExpression;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputsExpression")
    public java.util.List<UpdateTemplateRequestOutputsExpression> outputsExpression;

    /**
     * <strong>example:</strong>
     * <p>test-entity</p>
     */
    @NameInMap("RootEntity")
    public String rootEntity;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-workspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setInputsExpression(java.util.List<UpdateTemplateRequestInputsExpression> inputsExpression) {
        this.inputsExpression = inputsExpression;
        return this;
    }
    public java.util.List<UpdateTemplateRequestInputsExpression> getInputsExpression() {
        return this.inputsExpression;
    }

    public UpdateTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateTemplateRequest setOutputsExpression(java.util.List<UpdateTemplateRequestOutputsExpression> outputsExpression) {
        this.outputsExpression = outputsExpression;
        return this;
    }
    public java.util.List<UpdateTemplateRequestOutputsExpression> getOutputsExpression() {
        return this.outputsExpression;
    }

    public UpdateTemplateRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdateTemplateRequestInputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StepOrder")
        public Integer stepOrder;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Task1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fastq1</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>read_1.fastq.gz</p>
         */
        @NameInMap("VariableValue")
        public String variableValue;

        public static UpdateTemplateRequestInputsExpression build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateRequestInputsExpression self = new UpdateTemplateRequestInputsExpression();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateRequestInputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public UpdateTemplateRequestInputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpdateTemplateRequestInputsExpression setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public UpdateTemplateRequestInputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateTemplateRequestInputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public UpdateTemplateRequestInputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public UpdateTemplateRequestInputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class UpdateTemplateRequestOutputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Task1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bam</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>out.bam</p>
         */
        @NameInMap("VariableValue")
        public String variableValue;

        public static UpdateTemplateRequestOutputsExpression build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateRequestOutputsExpression self = new UpdateTemplateRequestOutputsExpression();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateRequestOutputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public UpdateTemplateRequestOutputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpdateTemplateRequestOutputsExpression setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public UpdateTemplateRequestOutputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateTemplateRequestOutputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public UpdateTemplateRequestOutputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public UpdateTemplateRequestOutputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

}
