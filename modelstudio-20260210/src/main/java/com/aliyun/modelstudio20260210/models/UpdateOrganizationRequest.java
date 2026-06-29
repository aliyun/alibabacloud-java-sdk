// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateOrganizationRequest extends TeaModel {
    /**
     * <p>The organization description.</p>
     * 
     * <strong>example:</strong>
     * <p>新的组织描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The organization name.</p>
     * 
     * <strong>example:</strong>
     * <p>新的组织名称</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationRequest self = new UpdateOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOrganizationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
