// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitRequest extends TeaModel {
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
     * <p>外部ID。</p>
     */
    @NameInMap("OrganizationalUnitExternalId")
    public String organizationalUnitExternalId;

    /**
     * <p>组织名称。</p>
     */
    @NameInMap("OrganizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>父组织ID。</p>
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
