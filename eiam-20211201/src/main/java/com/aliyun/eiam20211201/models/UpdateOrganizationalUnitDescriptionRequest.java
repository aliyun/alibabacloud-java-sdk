// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitDescriptionRequest extends TeaModel {
    /**
     * <p>The description of the organization. The value can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The organization ID.</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    public static UpdateOrganizationalUnitDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitDescriptionRequest self = new UpdateOrganizationalUnitDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitDescriptionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOrganizationalUnitDescriptionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateOrganizationalUnitDescriptionRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

}
