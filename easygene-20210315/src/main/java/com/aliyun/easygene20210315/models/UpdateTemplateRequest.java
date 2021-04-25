// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 工作空间描述
    @NameInMap("Description")
    public String description;

    // 实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    // 应用的输入
    @NameInMap("Inputs")
    public java.util.List<UpdateTemplateRequestInputs> inputs;

    // 应用的输出
    @NameInMap("Outputs")
    public java.util.List<UpdateTemplateRequestOutputs> outputs;

    // 工作空间标签
    @NameInMap("Labels")
    public String labels;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public UpdateTemplateRequest setInputs(java.util.List<UpdateTemplateRequestInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<UpdateTemplateRequestInputs> getInputs() {
        return this.inputs;
    }

    public UpdateTemplateRequest setOutputs(java.util.List<UpdateTemplateRequestOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<UpdateTemplateRequestOutputs> getOutputs() {
        return this.outputs;
    }

    public UpdateTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public static class UpdateTemplateRequestInputs extends TeaModel {
        // 任务名称
        @NameInMap("TaskName")
        public String taskName;

        // 变量名
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
        @NameInMap("VariableType")
        public String variableType;

        // 变量值
        @NameInMap("VariableValue")
        public String variableValue;

        // 是否必填
        @NameInMap("Required")
        public Boolean required;

        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Integer stepOrder;

        public static UpdateTemplateRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateRequestInputs self = new UpdateTemplateRequestInputs();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateRequestInputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateTemplateRequestInputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public UpdateTemplateRequestInputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public UpdateTemplateRequestInputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public UpdateTemplateRequestInputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpdateTemplateRequestInputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public UpdateTemplateRequestInputs setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

    }

    public static class UpdateTemplateRequestOutputs extends TeaModel {
        // 任务名称
        @NameInMap("TaskName")
        public String taskName;

        // 变量名
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
        @NameInMap("VariableType")
        public String variableType;

        // 变量值
        @NameInMap("VariableValue")
        public String variableValue;

        // 是否必填
        @NameInMap("Required")
        public Boolean required;

        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Integer stepOrder;

        public static UpdateTemplateRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateRequestOutputs self = new UpdateTemplateRequestOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateRequestOutputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public UpdateTemplateRequestOutputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public UpdateTemplateRequestOutputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public UpdateTemplateRequestOutputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public UpdateTemplateRequestOutputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public UpdateTemplateRequestOutputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public UpdateTemplateRequestOutputs setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

    }

}
