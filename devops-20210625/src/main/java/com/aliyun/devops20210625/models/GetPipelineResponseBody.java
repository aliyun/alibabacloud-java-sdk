// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponseBody self = new GetPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineResponseBody setPipeline(GetPipelineResponseBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }
    public GetPipelineResponseBodyPipeline getPipeline() {
        return this.pipeline;
    }

    public GetPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineResponseBodyPipelinePipelineConfigSourcesData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("branch")
        public String branch;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cloneDepth")
        public Long cloneDepth;

        /**
         * <p>Credential Id</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("credentialId")
        public Long credentialId;

        /**
         * <p>Credential Label</p>
         * 
         * <strong>example:</strong>
         * <p>企业公钥</p>
         */
        @NameInMap("credentialLabel")
        public String credentialLabel;

        /**
         * <p>Credential Type</p>
         * 
         * <strong>example:</strong>
         * <p>region-ssh</p>
         */
        @NameInMap("credentialType")
        public String credentialType;

        @NameInMap("events")
        public java.util.List<String> events;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isBranchMode")
        public Boolean isBranchMode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isCloneDepth")
        public Boolean isCloneDepth;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isSubmodule")
        public Boolean isSubmodule;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isTrigger")
        public Boolean isTrigger;

        /**
         * <strong>example:</strong>
         * <p>cdup/ss</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>asasasas</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p><a href="https://codeup.aliyun.com/test.git">https://codeup.aliyun.com/test.git</a></p>
         */
        @NameInMap("repo")
        public String repo;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        /**
         * <strong>example:</strong>
         * <p>.*</p>
         */
        @NameInMap("triggerFilter")
        public String triggerFilter;

        /**
         * <strong>example:</strong>
         * <p><a href="https://flow.aliyun/webhook/asassasa">https://flow.aliyun/webhook/asassasa</a></p>
         */
        @NameInMap("webhook")
        public String webhook;

        public static GetPipelineResponseBodyPipelinePipelineConfigSourcesData build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelinePipelineConfigSourcesData self = new GetPipelineResponseBodyPipelinePipelineConfigSourcesData();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCloneDepth(Long cloneDepth) {
            this.cloneDepth = cloneDepth;
            return this;
        }
        public Long getCloneDepth() {
            return this.cloneDepth;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCredentialId(Long credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public Long getCredentialId() {
            return this.credentialId;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCredentialLabel(String credentialLabel) {
            this.credentialLabel = credentialLabel;
            return this;
        }
        public String getCredentialLabel() {
            return this.credentialLabel;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setEvents(java.util.List<String> events) {
            this.events = events;
            return this;
        }
        public java.util.List<String> getEvents() {
            return this.events;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsBranchMode(Boolean isBranchMode) {
            this.isBranchMode = isBranchMode;
            return this;
        }
        public Boolean getIsBranchMode() {
            return this.isBranchMode;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsCloneDepth(Boolean isCloneDepth) {
            this.isCloneDepth = isCloneDepth;
            return this;
        }
        public Boolean getIsCloneDepth() {
            return this.isCloneDepth;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsSubmodule(Boolean isSubmodule) {
            this.isSubmodule = isSubmodule;
            return this;
        }
        public Boolean getIsSubmodule() {
            return this.isSubmodule;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsTrigger(Boolean isTrigger) {
            this.isTrigger = isTrigger;
            return this;
        }
        public Boolean getIsTrigger() {
            return this.isTrigger;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setServiceConnectionId(Long serviceConnectionId) {
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setTriggerFilter(String triggerFilter) {
            this.triggerFilter = triggerFilter;
            return this;
        }
        public String getTriggerFilter() {
            return this.triggerFilter;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class GetPipelineResponseBodyPipelinePipelineConfigSources extends TeaModel {
        @NameInMap("data")
        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData data;

        /**
         * <strong>example:</strong>
         * <p>xxsxsxs</p>
         */
        @NameInMap("sign")
        public String sign;

        /**
         * <strong>example:</strong>
         * <p>Codeup</p>
         */
        @NameInMap("type")
        public String type;

        public static GetPipelineResponseBodyPipelinePipelineConfigSources build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelinePipelineConfigSources self = new GetPipelineResponseBodyPipelinePipelineConfigSources();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSources setData(GetPipelineResponseBodyPipelinePipelineConfigSourcesData data) {
            this.data = data;
            return this;
        }
        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData getData() {
            return this.data;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSources setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPipelineResponseBodyPipelinePipelineConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>schema: tb pipeline:   - name: 执行命令     stages:       - driven: AUTO         jobs:           - displayName: 执行命令             task: execution-component-production@10             identifier: &quot;10_1626147407245&quot;             templateType: task             templateSign: &quot;&quot;             templateBatchUpdate: &quot;N&quot;             extraInfo: &quot;&quot;             params:               version1: pre-jdk1.62               steps:                 - name: 执行命令                   stepType: exec-shell                   stepIdentifier: &quot;10_1626147407245__11_1626147407249&quot;                   command: |                     # input your command here                     echo hello,world!                   ARTIFACTS: &quot;&quot;                   JSONEncoding: true                   freeInTaskGroupModeFields:                     - ARTIFACTS                   source: 132504-sss_ddd_3mvJ               ENGINE_PIPELINE_NAME: &quot;${INPUTS.ENGINE_PIPELINE_NAME}&quot;               ENGINE_PIPELINE_ID: &quot;${INPUTS.ENGINE_PIPELINE_ID}&quot;               ENGINE_PIPELINE_INST_ID: &quot;${INPUTS.ENGINE_PIPELINE_INST_ID}&quot;               ENGINE_PIPELINE_INST_NUMBER: &quot;${INPUTS.ENGINE_PIPELINE_INST_NUMBER}&quot;               buildNodeGroup: K8S-4             plugins: []             output: []             freeInTaskGroupModeFields: []</p>
         */
        @NameInMap("flow")
        public String flow;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("settings")
        public String settings;

        @NameInMap("sources")
        public java.util.List<GetPipelineResponseBodyPipelinePipelineConfigSources> sources;

        public static GetPipelineResponseBodyPipelinePipelineConfig build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelinePipelineConfig self = new GetPipelineResponseBodyPipelinePipelineConfig();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipelinePipelineConfig setFlow(String flow) {
            this.flow = flow;
            return this;
        }
        public String getFlow() {
            return this.flow;
        }

        public GetPipelineResponseBodyPipelinePipelineConfig setSettings(String settings) {
            this.settings = settings;
            return this;
        }
        public String getSettings() {
            return this.settings;
        }

        public GetPipelineResponseBodyPipelinePipelineConfig setSources(java.util.List<GetPipelineResponseBodyPipelinePipelineConfigSources> sources) {
            this.sources = sources;
            return this;
        }
        public java.util.List<GetPipelineResponseBodyPipelinePipelineConfigSources> getSources() {
            return this.sources;
        }

    }

    public static class GetPipelineResponseBodyPipelineTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>标签1</p>
         */
        @NameInMap("name")
        public String name;

        public static GetPipelineResponseBodyPipelineTagList build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelineTagList self = new GetPipelineResponseBodyPipelineTagList();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipelineTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPipelineResponseBodyPipelineTagList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPipelineResponseBodyPipeline extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>112222122</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("envId")
        public Integer envId;

        /**
         * <strong>example:</strong>
         * <p>日常环境</p>
         */
        @NameInMap("envName")
        public String envName;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("groupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>112222122</p>
         */
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        /**
         * <strong>example:</strong>
         * <p>流水线</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("pipelineConfig")
        public GetPipelineResponseBodyPipelinePipelineConfig pipelineConfig;

        @NameInMap("tagList")
        public java.util.List<GetPipelineResponseBodyPipelineTagList> tagList;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipeline self = new GetPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
        }

        public GetPipelineResponseBodyPipeline setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineResponseBodyPipeline setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetPipelineResponseBodyPipeline setEnvId(Integer envId) {
            this.envId = envId;
            return this;
        }
        public Integer getEnvId() {
            return this.envId;
        }

        public GetPipelineResponseBodyPipeline setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public GetPipelineResponseBodyPipeline setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetPipelineResponseBodyPipeline setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetPipelineResponseBodyPipeline setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipelineResponseBodyPipeline setPipelineConfig(GetPipelineResponseBodyPipelinePipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public GetPipelineResponseBodyPipelinePipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

        public GetPipelineResponseBodyPipeline setTagList(java.util.List<GetPipelineResponseBodyPipelineTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetPipelineResponseBodyPipelineTagList> getTagList() {
            return this.tagList;
        }

        public GetPipelineResponseBodyPipeline setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
