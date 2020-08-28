// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIAppRequest extends TeaModel {
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    public String appTemplateId;

    @NameInMap("AppTemplateVersion")
    @Validation(required = true)
    public String appTemplateVersion;

    @NameInMap("Level")
    @Validation(required = true)
    public Integer level;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateAIAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIAppRequest self = new CreateAIAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIAppRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public CreateAIAppRequest setAppTemplateVersion(String appTemplateVersion) {
        this.appTemplateVersion = appTemplateVersion;
        return this;
    }
    public String getAppTemplateVersion() {
        return this.appTemplateVersion;
    }

    public CreateAIAppRequest setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public CreateAIAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAIAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
