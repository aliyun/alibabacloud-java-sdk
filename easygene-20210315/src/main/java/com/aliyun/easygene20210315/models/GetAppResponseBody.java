// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 实体类型
    @NameInMap("AppType")
    public String appType;

    // 参考输入
    @NameInMap("Configs")
    public java.util.List<GetAppResponseBodyConfigs> configs;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 应用定义
    @NameInMap("Definition")
    public String definition;

    // 依赖应用
    @NameInMap("Dependencies")
    public java.util.List<GetAppResponseBodyDependencies> dependencies;

    // 应用简要描述
    @NameInMap("Description")
    public String description;

    // 应用详细文档
    @NameInMap("Documentation")
    public String documentation;

    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 应用输入
    @NameInMap("Inputs")
    public java.util.List<GetAppResponseBodyInputs> inputs;

    // 应用标签
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    // 应用描述语言
    @NameInMap("Language")
    public String language;

    // 应用描述语言版本
    @NameInMap("LanguageVersion")
    public String languageVersion;

    // 应用最后修改时间
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    // 应用的输出参数
    @NameInMap("Outputs")
    public java.util.List<GetAppResponseBodyOutputs> outputs;

    // 主WDL路径
    @NameInMap("Path")
    public String path;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 应用版本号
    @NameInMap("Revision")
    public String revision;

    // 应用当前版本修改
    @NameInMap("RevisionComment")
    public String revisionComment;

    // 应用的所有版本号
    @NameInMap("Revisions")
    public java.util.List<GetAppResponseBodyRevisions> revisions;

    // 应用可见范围
    @NameInMap("Scope")
    public String scope;

    // 应用来源
    @NameInMap("Source")
    public String source;

    // 应用URL
    @NameInMap("URL")
    public String URL;

    // 工作流名称
    @NameInMap("WorkflowName")
    public String workflowName;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static GetAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppResponseBody self = new GetAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppResponseBody setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetAppResponseBody setConfigs(java.util.List<GetAppResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<GetAppResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public GetAppResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAppResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetAppResponseBody setDependencies(java.util.List<GetAppResponseBodyDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<GetAppResponseBodyDependencies> getDependencies() {
        return this.dependencies;
    }

    public GetAppResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAppResponseBody setDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }
    public String getDocumentation() {
        return this.documentation;
    }

    public GetAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetAppResponseBody setInputs(java.util.List<GetAppResponseBodyInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<GetAppResponseBodyInputs> getInputs() {
        return this.inputs;
    }

    public GetAppResponseBody setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public GetAppResponseBody setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetAppResponseBody setLanguageVersion(String languageVersion) {
        this.languageVersion = languageVersion;
        return this;
    }
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    public GetAppResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetAppResponseBody setOutputs(java.util.List<GetAppResponseBodyOutputs> outputs) {
        this.outputs = outputs;
        return this;
    }
    public java.util.List<GetAppResponseBodyOutputs> getOutputs() {
        return this.outputs;
    }

    public GetAppResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppResponseBody setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public GetAppResponseBody setRevisionComment(String revisionComment) {
        this.revisionComment = revisionComment;
        return this;
    }
    public String getRevisionComment() {
        return this.revisionComment;
    }

    public GetAppResponseBody setRevisions(java.util.List<GetAppResponseBodyRevisions> revisions) {
        this.revisions = revisions;
        return this;
    }
    public java.util.List<GetAppResponseBodyRevisions> getRevisions() {
        return this.revisions;
    }

    public GetAppResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetAppResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetAppResponseBody setURL(String URL) {
        this.URL = URL;
        return this;
    }
    public String getURL() {
        return this.URL;
    }

    public GetAppResponseBody setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }
    public String getWorkflowName() {
        return this.workflowName;
    }

    public GetAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetAppResponseBodyConfigs extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static GetAppResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyConfigs self = new GetAppResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAppResponseBodyConfigs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetAppResponseBodyDependencies extends TeaModel {
        // wdl内容
        @NameInMap("Content")
        public String content;

        // 依赖路径
        @NameInMap("Path")
        public String path;

        public static GetAppResponseBodyDependencies build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyDependencies self = new GetAppResponseBodyDependencies();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyDependencies setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetAppResponseBodyDependencies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetAppResponseBodyInputs extends TeaModel {
        // 帮助
        @NameInMap("Help")
        public String help;

        // 是否必须
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

        public static GetAppResponseBodyInputs build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyInputs self = new GetAppResponseBodyInputs();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyInputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetAppResponseBodyInputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetAppResponseBodyInputs setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public GetAppResponseBodyInputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetAppResponseBodyInputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetAppResponseBodyInputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetAppResponseBodyInputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class GetAppResponseBodyOutputs extends TeaModel {
        // 帮助信息
        @NameInMap("Help")
        public String help;

        // 是否必须
        @NameInMap("Required")
        public Boolean required;

        // 步骤编号
        @NameInMap("StepOrder")
        public Long stepOrder;

        // 任务名称
        @NameInMap("TaskName")
        public String taskName;

        // 参数名称
        @NameInMap("VariableName")
        public String variableName;

        // 参数类型
        @NameInMap("VariableType")
        public String variableType;

        // 参数值
        @NameInMap("VariableValue")
        public String variableValue;

        public static GetAppResponseBodyOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyOutputs self = new GetAppResponseBodyOutputs();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyOutputs setHelp(String help) {
            this.help = help;
            return this;
        }
        public String getHelp() {
            return this.help;
        }

        public GetAppResponseBodyOutputs setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetAppResponseBodyOutputs setStepOrder(Long stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Long getStepOrder() {
            return this.stepOrder;
        }

        public GetAppResponseBodyOutputs setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetAppResponseBodyOutputs setVariableName(String variableName) {
            this.variableName = variableName;
            return this;
        }
        public String getVariableName() {
            return this.variableName;
        }

        public GetAppResponseBodyOutputs setVariableType(String variableType) {
            this.variableType = variableType;
            return this;
        }
        public String getVariableType() {
            return this.variableType;
        }

        public GetAppResponseBodyOutputs setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

    public static class GetAppResponseBodyRevisions extends TeaModel {
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 版本号
        @NameInMap("Revision")
        public String revision;

        // 应用当前版本修改
        @NameInMap("RevisionComment")
        public String revisionComment;

        public static GetAppResponseBodyRevisions build(java.util.Map<String, ?> map) throws Exception {
            GetAppResponseBodyRevisions self = new GetAppResponseBodyRevisions();
            return TeaModel.build(map, self);
        }

        public GetAppResponseBodyRevisions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAppResponseBodyRevisions setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public GetAppResponseBodyRevisions setRevisionComment(String revisionComment) {
            this.revisionComment = revisionComment;
            return this;
        }
        public String getRevisionComment() {
            return this.revisionComment;
        }

    }

}
