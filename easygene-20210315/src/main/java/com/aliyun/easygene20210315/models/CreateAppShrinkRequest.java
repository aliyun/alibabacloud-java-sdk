// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateAppShrinkRequest extends TeaModel {
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
    public String configsShrink;

    // 应用定义
    @NameInMap("Definition")
    public String definition;

    // 依赖应用
    @NameInMap("Dependencies")
    public String dependenciesShrink;

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

    public static CreateAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppShrinkRequest self = new CreateAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppShrinkRequest setConfigsShrink(String configsShrink) {
        this.configsShrink = configsShrink;
        return this;
    }
    public String getConfigsShrink() {
        return this.configsShrink;
    }

    public CreateAppShrinkRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateAppShrinkRequest setDependenciesShrink(String dependenciesShrink) {
        this.dependenciesShrink = dependenciesShrink;
        return this;
    }
    public String getDependenciesShrink() {
        return this.dependenciesShrink;
    }

    public CreateAppShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppShrinkRequest setDocumentation(String documentation) {
        this.documentation = documentation;
        return this;
    }
    public String getDocumentation() {
        return this.documentation;
    }

    public CreateAppShrinkRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateAppShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateAppShrinkRequest setLanguageVersion(String languageVersion) {
        this.languageVersion = languageVersion;
        return this;
    }
    public String getLanguageVersion() {
        return this.languageVersion;
    }

    public CreateAppShrinkRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateAppShrinkRequest setRevisionComment(String revisionComment) {
        this.revisionComment = revisionComment;
        return this;
    }
    public String getRevisionComment() {
        return this.revisionComment;
    }

    public CreateAppShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
