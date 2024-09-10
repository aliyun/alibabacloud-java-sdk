// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MyTestApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>App</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Configs")
    public java.util.List<GetAppResponseBodyConfigs> configs;

    /**
     * <strong>example:</strong>
     * <p>2021-06-16T15:09:14.378297+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>WDL content</p>
     */
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Dependencies")
    public java.util.List<GetAppResponseBodyDependencies> dependencies;

    /**
     * <strong>example:</strong>
     * <p>This is a test app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>example documentation content</p>
     */
    @NameInMap("Documentation")
    public String documentation;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    @NameInMap("Inputs")
    public java.util.List<GetAppResponseBodyInputs> inputs;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <strong>example:</strong>
     * <p>WDL</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("LanguageVersion")
    public String languageVersion;

    /**
     * <strong>example:</strong>
     * <p>2021-06-16T15:09:14.378297+08:00</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("Outputs")
    public java.util.List<GetAppResponseBodyOutputs> outputs;

    /**
     * <strong>example:</strong>
     * <p>main.wdl</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Revision")
    public String revision;

    /**
     * <strong>example:</strong>
     * <p>Example revision comment</p>
     */
    @NameInMap("RevisionComment")
    public String revisionComment;

    /**
     * <strong>example:</strong>
     * <p>TestTag</p>
     */
    @NameInMap("RevisionTag")
    public String revisionTag;

    @NameInMap("Revisions")
    public java.util.List<GetAppResponseBodyRevisions> revisions;

    /**
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>EasyGene</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>Example url</p>
     */
    @NameInMap("URL")
    public String URL;

    /**
     * <strong>example:</strong>
     * <p>MyTestWorkflow</p>
     */
    @NameInMap("WorkflowName")
    public String workflowName;

    /**
     * <strong>example:</strong>
     * <p>TestWorkspace</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{     &quot;wgs.apply_bqsr.cpu&quot;: 4,     &quot;wgs.apply_bqsr.disks&quot;: &quot;local-disk 250 cloud_ssd&quot;,     &quot;wgs.apply_bqsr.gatk_Launcher&quot;: &quot;/usr/local/bin/gatk-4.1.4.1/gatk&quot;,     &quot;wgs.apply_bqsr.java_opts&quot;: &quot;\&quot;-XX:GCTimeLimit=50 -XX:GCHeapFreeLimit=10 -Xms3000m -Djava.io.tmpdir=/mnt\&quot;&quot;,     &quot;wgs.apply_bqsr.memory&quot;: &quot;8G&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>./config/example.json</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>task echo {   String txt_out = &quot;default_txt_out&quot;   String dd_out = &quot;default_dd_out&quot;    command {     echo Hello &gt; ${txt_out}     /bin/bash -c &quot;dd if=/dev/zero of=${dd_out} bs=1M count=15&quot;     echo &quot;This is a test std out.&quot;   }    runtime {     cpu: &quot;2&quot;     memory: &quot;4G&quot;     autoReleaseJob: false     reserveOnFail: true     userData: &quot;key1 value1&quot;     disks: &quot;local-disk 40 cloud_ssd, /home/mount/ 40 cloud_efficiency&quot;     tag: &quot;TestTag&quot;   }    output {     File outTxtFile = &quot;${txt_out}&quot;     File outDdFile = &quot;${dd_out}&quot;   } }</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>./task/echo.wdl</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>help information</p>
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
         * <p>1</p>
         */
        @NameInMap("StepOrder")
        public Long stepOrder;

        /**
         * <strong>example:</strong>
         * <p>TestTaskName</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>TestVariableName</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <strong>example:</strong>
         * <p>TestVariableType</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <strong>example:</strong>
         * <p>TestVariableValue</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Example help information</p>
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
         * <p>1</p>
         */
        @NameInMap("StepOrder")
        public Long stepOrder;

        /**
         * <strong>example:</strong>
         * <p>TestTaskName</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>TestVariableName</p>
         */
        @NameInMap("VariableName")
        public String variableName;

        /**
         * <strong>example:</strong>
         * <p>Int</p>
         */
        @NameInMap("VariableType")
        public String variableType;

        /**
         * <strong>example:</strong>
         * <p>ExampleValue</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2021-06-16T15:09:14.378297+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Revision")
        public String revision;

        /**
         * <strong>example:</strong>
         * <p>Example revision comment</p>
         */
        @NameInMap("RevisionComment")
        public String revisionComment;

        /**
         * <strong>example:</strong>
         * <p>ProduceVersion</p>
         */
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
