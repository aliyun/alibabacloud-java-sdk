// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    // 应用模板描述
    @NameInMap("Description")
    public String description;

    // 应用的输入
    @NameInMap("InputsExpression")
    public java.util.List<UpdateTemplateRequestInputsExpression> inputsExpression;

    // 应用模板标签
    @NameInMap("Labels")
    public String labels;

    // 应用的输出
    @NameInMap("OutputsExpression")
    public java.util.List<UpdateTemplateRequestOutputsExpression> outputsExpression;

    // 实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 工作空间名称
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
        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 是否必填
        @NameInMap("Required")
        public Boolean required;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Integer stepOrder;

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
        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 是否必填
        @NameInMap("Required")
        public Boolean required;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Integer stepOrder;

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
