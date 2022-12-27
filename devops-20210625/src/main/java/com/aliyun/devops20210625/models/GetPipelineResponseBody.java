// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("branch")
        public String branch;

        @NameInMap("cloneDepth")
        public Long cloneDepth;

        // Credential Id
        @NameInMap("credentialId")
        public Long credentialId;

        // Credential Label
        @NameInMap("credentialLabel")
        public String credentialLabel;

        // Credential Type
        @NameInMap("credentialType")
        public String credentialType;

        @NameInMap("events")
        public java.util.List<String> events;

        @NameInMap("isBranchMode")
        public Boolean isBranchMode;

        @NameInMap("isCloneDepth")
        public Boolean isCloneDepth;

        @NameInMap("isSubmodule")
        public Boolean isSubmodule;

        @NameInMap("isTrigger")
        public Boolean isTrigger;

        @NameInMap("label")
        public String label;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("repo")
        public String repo;

        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        @NameInMap("triggerFilter")
        public String triggerFilter;

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

        @NameInMap("sign")
        public String sign;

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
        @NameInMap("flow")
        public String flow;

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
        @NameInMap("id")
        public Long id;

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
        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("envId")
        public Integer envId;

        @NameInMap("envName")
        public String envName;

        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("name")
        public String name;

        @NameInMap("pipelineConfig")
        public GetPipelineResponseBodyPipelinePipelineConfig pipelineConfig;

        @NameInMap("tagList")
        public java.util.List<GetPipelineResponseBodyPipelineTagList> tagList;

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
