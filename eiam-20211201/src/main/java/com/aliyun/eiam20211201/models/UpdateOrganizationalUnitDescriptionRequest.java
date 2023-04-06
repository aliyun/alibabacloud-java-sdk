// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitDescriptionRequest extends TeaModel {
    /**
     * <p>组织描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>组织ID。</p>
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
