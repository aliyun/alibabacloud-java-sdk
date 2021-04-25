// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetTemplateResponseBody extends TeaModel {
    // 应用模板名称
    @NameInMap("TemplateName")
    public String templateName;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 应用简要描述
    @NameInMap("Description")
    public String description;

    // 应用的名称
    @NameInMap("AppName")
    public String appName;

    // 应用的版本
    @NameInMap("Revision")
    public String revision;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 应用输入
    @NameInMap("Inputs")
    public java.util.List<GetTemplateResponseBodyInputs> inputs;

    // 应用标签
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    // 应用最后修改时间
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    // 应用的输出参数
    @NameInMap("Outputs")
    public java.util.List<GetTemplateResponseBodyOutputs> outputs;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 应用来源
    @NameInMap("Source")
    public String source;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    // 实体类型
    @NameInMap("RootEntity")
    public String rootEntity;

    public static GetTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateResponseBody self = new GetTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
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

    public GetTemplateResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetTemplateResponseBody setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public GetTemplateResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetTemplateResponseBody setInputs(java.util.List<GetTemplateResponseBodyInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyInputs> getInputs() {
        return this.inputs;
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

    public GetTemplateResponseBody setOutputs(java.util.List<GetTemplateResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<GetTemplateResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public GetTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetTemplateResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public GetTemplateResponseBody setRootEntity(String rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }
    public String getRootEntity() {
        return this.rootEntity;
    }

    public static class GetTemplateResponseBodyInputs extends TeaModel {
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

        // 是否必须参数
        @NameInMap("Required")
        public Boolean required;

        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Long stepOrder;

        public static GetTemplateResponseBodyInputs build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyInputs self = new GetTemplateResponseBodyInputs();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyInputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTemplateResponseBodyInputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetTemplateResponseBodyInputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetTemplateResponseBodyInputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public GetTemplateResponseBodyInputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetTemplateResponseBodyInputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetTemplateResponseBodyInputs setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

    }

    public static class GetTemplateResponseBodyOutputs extends TeaModel {
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

        // 是否必须参数
        @NameInMap("Required")
        public Boolean required;

        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 步骤顺序
        @NameInMap("StepOrder")
        public Long stepOrder;

        public static GetTemplateResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateResponseBodyOutputs self = new GetTemplateResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public GetTemplateResponseBodyOutputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTemplateResponseBodyOutputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetTemplateResponseBodyOutputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetTemplateResponseBodyOutputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

        public GetTemplateResponseBodyOutputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetTemplateResponseBodyOutputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetTemplateResponseBodyOutputs setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

    }

}
