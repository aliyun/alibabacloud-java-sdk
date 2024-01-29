// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppRevision")
    public String appRevision;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("InputsExpression")
    public java.util.List<CreateTemplateRequestInputsExpression> inputsExpression;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("OutputsExpression")
    public java.util.List<CreateTemplateRequestOutputsExpression> outputsExpression;

    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("RootEntity")
    public String rootEntity;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateTemplateRequest setAppRevision(String appRevision) {
        this.appRevision = appRevision;
        return this;
    }
    public String getAppRevision() {
        return this.appRevision;
    }

    public CreateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateRequest setInputsExpression(java.util.List<CreateTemplateRequestInputsExpression> inputsExpression) {
        this.inputsExpression = inputsExpression;
        return this;
    }
    public java.util.List<CreateTemplateRequestInputsExpression> getInputsExpression() {
        return this.inputsExpression;
    }

    public CreateTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateTemplateRequest setOutputsExpression(java.util.List<CreateTemplateRequestOutputsExpression> outputsExpression) {
        this.outputsExpression = outputsExpression;
        return this;
    }
    public java.util.List<CreateTemplateRequestOutputsExpression> getOutputsExpression() {
        return this.outputsExpression;
    }

    public CreateTemplateRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateTemplateRequest setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public CreateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateTemplateRequestInputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        @NameInMap("VariableValue")
        public String variableValue;

        public static CreateTemplateRequestInputsExpression build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestInputsExpression self = new CreateTemplateRequestInputsExpression();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestInputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public CreateTemplateRequestInputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateTemplateRequestInputsExpression setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public CreateTemplateRequestInputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateTemplateRequestInputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public CreateTemplateRequestInputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public CreateTemplateRequestInputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class CreateTemplateRequestOutputsExpression extends TeaModel {
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

        @NameInMap("VariableValue")
        public String variableValue;

        public static CreateTemplateRequestOutputsExpression build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateRequestOutputsExpression self = new CreateTemplateRequestOutputsExpression();
            return TeaModel.build(map, self);
        }

        public CreateTemplateRequestOutputsExpression setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public CreateTemplateRequestOutputsExpression setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateTemplateRequestOutputsExpression setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public CreateTemplateRequestOutputsExpression setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateTemplateRequestOutputsExpression setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public CreateTemplateRequestOutputsExpression setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public CreateTemplateRequestOutputsExpression setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

}
