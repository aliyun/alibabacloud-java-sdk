// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>The description of the organization. The value can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The external ID of the organization, which can be used to associate the organization with an external system. By default, the external ID is the organization ID. The value can be up to 64 characters in length.</p>
     */
    @NameInMap("OrganizationalUnitExternalId")
    public String organizationalUnitExternalId;

    /**
     * <p>The name of the organization. The name can be up to 64 characters in length.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>The parent organization ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    public static CreateOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrganizationalUnitRequest self = new CreateOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrganizationalUnitRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOrganizationalUnitRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOrganizationalUnitRequest setOrganizationalUnitExternalId(String organizationalUnitExternalId) {
        this.organizationalUnitExternalId = organizationalUnitExternalId;
        return this;
    }
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    public CreateOrganizationalUnitRequest setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    public CreateOrganizationalUnitRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
