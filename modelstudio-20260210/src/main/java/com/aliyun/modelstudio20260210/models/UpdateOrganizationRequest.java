// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateOrganizationRequest extends TeaModel {
    /**
     * <p>The description of the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>New organization description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the organization.</p>
     * 
     * <strong>example:</strong>
     * <p>New organization name</p>
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
