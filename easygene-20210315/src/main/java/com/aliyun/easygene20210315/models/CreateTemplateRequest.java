// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 应用模板描述
    @NameInMap("Description")
    public String description;

    // 应用的名称
    @NameInMap("AppName")
    public String appName;

    // 应用的版本
    @NameInMap("Revision")
    public String revision;

    // 根实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    // 应用的输入
    @NameInMap("Inputs")
    public java.util.List<CreateTemplateRequestInputs> inputs;

    // 应用的输出
    @NameInMap("Outputs")
    public java.util.List<CreateTemplateRequestOutputs> outputs;

    // 应用标签
    @NameInMap("Labels")
    public String labels;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateTemplateRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public CreateTemplateRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public CreateTemplateRequest setInputs(java.util.List<CreateTemplateRequestInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<CreateTemplateRequestInputs> getInputs() {
        return this.inputs;
    }

    public CreateTemplateRequest setOutputs(java.util.List<CreateTemplateRequestOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<CreateTemplateRequestOutputs> getOutputs() {
        return this.outputs;
    }

    public CreateTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateTemplateRequestInputs extends TeaModel {
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

        public static CreateTemplateRequestInputs build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestInputs self = new CreateTemplateRequestInputs();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestInputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateTemplateRequestInputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public CreateTemplateRequestInputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public CreateTemplateRequestInputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public CreateTemplateRequestInputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateTemplateRequestInputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public CreateTemplateRequestInputs setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

    }

    public static class CreateTemplateRequestOutputs extends TeaModel {
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

        public static CreateTemplateRequestOutputs build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestOutputs self = new CreateTemplateRequestOutputs();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestOutputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateTemplateRequestOutputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public CreateTemplateRequestOutputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public CreateTemplateRequestOutputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public CreateTemplateRequestOutputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateTemplateRequestOutputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public CreateTemplateRequestOutputs setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

    }

}
