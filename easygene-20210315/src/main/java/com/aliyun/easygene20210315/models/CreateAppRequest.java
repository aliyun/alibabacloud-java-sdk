// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // 应用类型
    @NameInMap("AppType")
    public String appType;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // 参考输入
    @NameInMap("Configs")
    public java.util.List<CreateAppRequestConfigs> configs;

    // 应用定义
    @NameInMap("Definition")
    public String definition;

    // 依赖应用
    @NameInMap("Dependencies")
    public java.util.List<CreateAppRequestDependencies> dependencies;

    // 应用描述
    @NameInMap("Description")
    public String description;

    // 应用使用文档
    @NameInMap("Documentation")
    public String documentation;

    // 应用标签
    @NameInMap("Labels")
    public String labels;

    // 应用描述语言
    @NameInMap("Language")
    public String language;

    // 应用描述语语言版本
    @NameInMap("LanguageVersion")
    public String languageVersion;

    // 主WDL路径
    @NameInMap("Path")
    public String path;

    // 应用当前版本说明
    @NameInMap("RevisionComment")
    public String revisionComment;

    // 工作空间名称
    @NameInMap("Workspace")
    public String workspace;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRequest setConfigs(java.util.List<CreateAppRequestConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<CreateAppRequestConfigs> getConfigs() {
        return this.configs;
    }

    public CreateAppRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateAppRequest setDependencies(java.util.List<CreateAppRequestDependencies> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<CreateAppRequestDependencies> getDependencies() {
        return this.dependencies;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }
    public String getDocumentation() {
        return this.documentation;
    }

    public CreateAppRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateAppRequest setLanguageVersion(String languageVersion) {
        this.languageVersion = languageVersion;
        return this;
    }
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    public CreateAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateAppRequest setRevisionComment(String revisionComment) {
        this.revisionComment = revisionComment;
        return this;
    }
    public String getRevisionComment() {
        return this.revisionComment;
    }

    public CreateAppRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateAppRequestConfigs extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Path")
        public String path;

        public static CreateAppRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestConfigs self = new CreateAppRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAppRequestConfigs setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class CreateAppRequestDependencies extends TeaModel {
        // 依赖内容
        @NameInMap("Content")
        public String content;

        // 依赖路径
        @NameInMap("Path")
        public String path;

        public static CreateAppRequestDependencies build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestDependencies self = new CreateAppRequestDependencies();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestDependencies setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAppRequestDependencies setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
