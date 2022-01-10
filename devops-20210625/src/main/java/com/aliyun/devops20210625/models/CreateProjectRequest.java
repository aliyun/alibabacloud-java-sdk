// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("customCode")
    public String customCode;

    @NameInMap("name")
    public String name;

    @NameInMap("scope")
    public String scope;

    @NameInMap("templateIdentifier")
    public String templateIdentifier;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setCustomCode(String customCode) {
        this.customCode = customCode;
        return this;
    }
    public String getCustomCode() {
        return this.customCode;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProjectRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateProjectRequest setTemplateIdentifier(String templateIdentifier) {
        this.templateIdentifier = templateIdentifier;
        return this;
    }
    public String getTemplateIdentifier() {
        return this.templateIdentifier;
    }

}
