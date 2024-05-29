// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigWebCCTemplateRequest extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The mode of the Frequency Control policy. Valid values:</p>
     * <br>
     * <p>*   **default**: Normal</p>
     * <p>*   **gf_under_attack**: Emergency</p>
     * <p>*   **gf_sos_verify**: Strict</p>
     * <p>*   **gf_sos_enhance**: Super Strict</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
