// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ConfigResourceGroupModelTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ConfigResourceGroupModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigResourceGroupModelTemplateRequest self = new ConfigResourceGroupModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigResourceGroupModelTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public ConfigResourceGroupModelTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
