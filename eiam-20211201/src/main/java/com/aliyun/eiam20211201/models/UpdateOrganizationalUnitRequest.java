// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The organization ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationalUnitId")
    public String organizationalUnitId;

    /**
     * <p>The name of the organization. The name can be up to 64 characters in length and must be unique in the same parent organization.</p>
     */
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    public static UpdateOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOrganizationalUnitRequest self = new UpdateOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public UpdateOrganizationalUnitRequest setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

}
