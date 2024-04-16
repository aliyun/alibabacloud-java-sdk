// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("Asynchronous")
    public Boolean asynchronous;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("PlatformVersion")
    public String platformVersion;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceCommitId")
    public String sourceCommitId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Templated")
    public Boolean templated;

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

    public CreateAppRequest setAsynchronous(Boolean asynchronous) {
        this.asynchronous = asynchronous;
        return this;
    }
    public Boolean getAsynchronous() {
        return this.asynchronous;
    }

    public CreateAppRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public CreateAppRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public CreateAppRequest setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }
    public String getPlatformVersion() {
        return this.platformVersion;
    }

    public CreateAppRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public CreateAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateAppRequest setSourceCommitId(String sourceCommitId) {
        this.sourceCommitId = sourceCommitId;
        return this;
    }
    public String getSourceCommitId() {
        return this.sourceCommitId;
    }

    public CreateAppRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateAppRequest setTemplated(Boolean templated) {
        this.templated = templated;
        return this;
    }
    public Boolean getTemplated() {
        return this.templated;
    }

}
