// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveResourceGroupModelTemplateRequest extends TeaModel {
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
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    public static RemoveResourceGroupModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveResourceGroupModelTemplateRequest self = new RemoveResourceGroupModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public RemoveResourceGroupModelTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public RemoveResourceGroupModelTemplateRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

}
