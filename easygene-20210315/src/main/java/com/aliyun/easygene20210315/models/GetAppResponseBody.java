// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("Configs")
    public java.util.List<GetAppResponseBodyConfigs> configs;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("Dependencies")
    public java.util.List<GetAppResponseBodyDependencies> dependencies;

    @NameInMap("Description")
    public String description;

    @NameInMap("Documentation")
    public String documentation;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("Inputs")
    public java.util.List<GetAppResponseBodyInputs> inputs;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    @NameInMap("Language")
    public String language;

    @NameInMap("LanguageVersion")
    public String languageVersion;

    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("Outputs")
    public java.util.List<GetAppResponseBodyOutputs> outputs;

    @NameInMap("Path")
    public String path;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("RevisionComment")
    public String revisionComment;

    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("Revisions")
    public java.util.List<GetAppResponseBodyRevisions> revisions;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Source")
    public String source;

    @NameInMap("URL")
    public String URL;

    @NameInMap("WorkflowName")
    public String workflowName;

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

    public GetAppResponseBody setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Long stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

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
        @NameInMap("Help")
        public String help;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("StepOrder")
        public Long stepOrder;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("VariableName")
        public String variableName;

        @NameInMap("VariableType")
        public String variableType;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("RevisionComment")
        public String revisionComment;

        @NameInMap("RevisionTag")
        public String revisionTag;

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

        public GetAppResponseBodyRevisions setRevisionTag(String revisionTag) {
            this.revisionTag = revisionTag;
            return this;
        }
        public String getRevisionTag() {
            return this.revisionTag;
        }

    }

}
