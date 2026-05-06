// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateModelProviderTemplateShrinkRequest extends TeaModel {
    @NameInMap("Config")
    public String configShrink;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWuyingProxy")
    public Boolean enableWuyingProxy;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static UpdateModelProviderTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelProviderTemplateShrinkRequest self = new UpdateModelProviderTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelProviderTemplateShrinkRequest setConfigShrink(String configShrink) {
        this.configShrink = configShrink;
        return this;
    }
    public String getConfigShrink() {
        return this.configShrink;
    }

    public UpdateModelProviderTemplateShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModelProviderTemplateShrinkRequest setEnableWuyingProxy(Boolean enableWuyingProxy) {
        this.enableWuyingProxy = enableWuyingProxy;
        return this;
    }
    public Boolean getEnableWuyingProxy() {
        return this.enableWuyingProxy;
    }

    public UpdateModelProviderTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelProviderTemplateShrinkRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

}
