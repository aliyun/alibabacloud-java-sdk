// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // 应用的名称
    @NameInMap("AppName")
    public String appName;

    // 应用的版本
    @NameInMap("AppRevision")
    public String appRevision;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 应用简要描述
    @NameInMap("Description")
    public String description;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 应用输入
    @NameInMap("InputsExpression")
    public java.util.List<GetTemplateResponseBodyInputsExpression> inputsExpression;

    // 应用标签
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    // 应用最后修改时间
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    // 应用的输出参数
    @NameInMap("OutputsExpression")
    public java.util.List<GetTemplateResponseBodyOutputsExpression> outputsExpression;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    // 应用来源
    @NameInMap("Source")
    public String source;

    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 工作空间名称
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
        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 是否必须参数
        @NameInMap("Required")
        public Boolean required;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Long stepOrder;

        // 任务名称
        @NameInMap("TaskName")
        public String taskName;

        // 变量名称
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
        @NameInMap("VariableType")
        public String variableType;

        // 变量值
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
        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 是否必须参数
        @NameInMap("Required")
        public Boolean required;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Long stepOrder;

        // 任务名称
        @NameInMap("TaskName")
        public String taskName;

        // 变量名称
        @NameInMap("VariableName")
        public String variableName;

        // 变量类型
        @NameInMap("VariableType")
        public String variableType;

        // 变量值
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
