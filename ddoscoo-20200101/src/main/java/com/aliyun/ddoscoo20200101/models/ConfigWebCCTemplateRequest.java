// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCTemplateRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Template")
    public String template;

    public static ConfigWebCCTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigWebCCTemplateRequest self = new ConfigWebCCTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigWebCCTemplateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigWebCCTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ConfigWebCCTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
