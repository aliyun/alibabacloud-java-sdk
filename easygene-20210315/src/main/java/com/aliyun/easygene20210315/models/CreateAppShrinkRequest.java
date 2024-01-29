// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateAppShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Configs")
    public String configsShrink;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("Dependencies")
    public String dependenciesShrink;

    @NameInMap("Description")
    public String description;

    @NameInMap("Documentation")
    public String documentation;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Language")
    public String language;

    @NameInMap("LanguageVersion")
    public String languageVersion;

    @NameInMap("Path")
    public String path;

    @NameInMap("RevisionComment")
    public String revisionComment;

    @NameInMap("RevisionTag")
    public String revisionTag;

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

    public CreateAppShrinkRequest setRevisionTag(String revisionTag) {
        this.revisionTag = revisionTag;
        return this;
    }
    public String getRevisionTag() {
        return this.revisionTag;
    }

    public CreateAppShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
