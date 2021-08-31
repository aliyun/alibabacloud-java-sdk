// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 流水线
    @NameInMap("pipeline")
    public GetPipelineResponseBodyPipeline pipeline;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    public static GetPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineResponseBody self = new GetPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetPipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipelineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public static class GetPipelineResponseBodyPipelineTagList extends TeaModel {
        // 标签id
        @NameInMap("id")
        public Long id;

        // 标签名称
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

    public static class GetPipelineResponseBodyPipelinePipelineConfigSourcesData extends TeaModel {
        // 分支
        @NameInMap("branch")
        public String branch;

        // 服务连接Id
        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        // 代码源显示标签
        @NameInMap("label")
        public String label;

        // 是否提交触发
        @NameInMap("isTrigger")
        public Boolean isTrigger;

        // 代码库地址
        @NameInMap("repo")
        public String repo;

        // 触发过滤条件
        @NameInMap("triggerFilter")
        public String triggerFilter;

        // webhhook地址
        @NameInMap("webhook")
        public String webhook;

        // 触发事件
        @NameInMap("events")
        public java.util.List<String> events;

        // 是否分支模式
        @NameInMap("isBranchMode")
        public Boolean isBranchMode;

        // 是否子模块
        @NameInMap("isSubmodule")
        public Boolean isSubmodule;

        // 是否设置clone深度
        @NameInMap("isCloneDepth")
        public Boolean isCloneDepth;

        // 克隆深度
        @NameInMap("cloneDepth")
        public Long cloneDepth;

        // Credential Id
        @NameInMap("credentialId")
        public Long credentialId;

        // Credential Type
        @NameInMap("credentialType")
        public String credentialType;

        // Credential Label
        @NameInMap("credentialLabel")
        public String credentialLabel;

        // github命名空间
        @NameInMap("namespace")
        public String namespace;

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

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setServiceConnectionId(Long serviceConnectionId) {
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsTrigger(Boolean isTrigger) {
            this.isTrigger = isTrigger;
            return this;
        }
        public Boolean getIsTrigger() {
            return this.isTrigger;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setRepo(String repo) {
            this.repo = repo;
            return this;
        }
        public String getRepo() {
            return this.repo;
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

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsSubmodule(Boolean isSubmodule) {
            this.isSubmodule = isSubmodule;
            return this;
        }
        public Boolean getIsSubmodule() {
            return this.isSubmodule;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setIsCloneDepth(Boolean isCloneDepth) {
            this.isCloneDepth = isCloneDepth;
            return this;
        }
        public Boolean getIsCloneDepth() {
            return this.isCloneDepth;
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

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setCredentialLabel(String credentialLabel) {
            this.credentialLabel = credentialLabel;
            return this;
        }
        public String getCredentialLabel() {
            return this.credentialLabel;
        }

        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class GetPipelineResponseBodyPipelinePipelineConfigSources extends TeaModel {
        // 代码源唯一标识
        @NameInMap("sign")
        public String sign;

        // 代码源类型aliyunGit 阿里云代码库 customGitlab  自建git giteeGit 码云 codeup Codeup git 通用git gitlab gitlab bitbucket bitbucket githubOAuth github
        @NameInMap("type")
        public String type;

        // 代码数据
        @NameInMap("data")
        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData data;

        public static GetPipelineResponseBodyPipelinePipelineConfigSources build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipelinePipelineConfigSources self = new GetPipelineResponseBodyPipelinePipelineConfigSources();
            return TeaModel.build(map, self);
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

        public GetPipelineResponseBodyPipelinePipelineConfigSources setData(GetPipelineResponseBodyPipelinePipelineConfigSourcesData data) {
            this.data = data;
            return this;
        }
        public GetPipelineResponseBodyPipelinePipelineConfigSourcesData getData() {
            return this.data;
        }

    }

    public static class GetPipelineResponseBodyPipelinePipelineConfig extends TeaModel {
        // 流水线配置信息
        @NameInMap("flow")
        public String flow;

        // 流水线环境变量等
        @NameInMap("settings")
        public String settings;

        // 代码源
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

    public static class GetPipelineResponseBodyPipeline extends TeaModel {
        // 创建者阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 环境id 0 日常环境  1预发环境 2正式环境
        @NameInMap("envId")
        public Integer envId;

        // 环境名称
        @NameInMap("envName")
        public String envName;

        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

        // 更新时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 流水线分组id
        @NameInMap("groupId")
        public Long groupId;

        // 更新人阿里云账号id
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        // 流水线名称
        @NameInMap("name")
        public String name;

        // 标签
        @NameInMap("tagList")
        public java.util.List<GetPipelineResponseBodyPipelineTagList> tagList;

        // 流水线配置
        @NameInMap("pipelineConfig")
        public GetPipelineResponseBodyPipelinePipelineConfig pipelineConfig;

        public static GetPipelineResponseBodyPipeline build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineResponseBodyPipeline self = new GetPipelineResponseBodyPipeline();
            return TeaModel.build(map, self);
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

        public GetPipelineResponseBodyPipeline setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPipelineResponseBodyPipeline setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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

        public GetPipelineResponseBodyPipeline setTagList(java.util.List<GetPipelineResponseBodyPipelineTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetPipelineResponseBodyPipelineTagList> getTagList() {
            return this.tagList;
        }

        public GetPipelineResponseBodyPipeline setPipelineConfig(GetPipelineResponseBodyPipelinePipelineConfig pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public GetPipelineResponseBodyPipelinePipelineConfig getPipelineConfig() {
            return this.pipelineConfig;
        }

    }

}
