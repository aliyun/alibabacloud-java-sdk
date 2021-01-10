// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIAppRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppTemplateId")
    public String appTemplateId;

    @NameInMap("AppTemplateVersion")
    public String appTemplateVersion;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateAIAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIAppRequest self = new CreateAIAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIAppRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateAIAppRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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
