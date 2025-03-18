// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>The description of the organizational unit.</p>
     * 
     * <strong>example:</strong>
     * <p>test organizational unit</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The external ID of the organizational unit. The external ID can be used to map external data to the data of the organizational unit in Employee Identity and Access Management (EIAM) of Identity as a Service (IDaaS). By default, the external ID is the organizational unit ID.</p>
     * <p>For organizational units with the same source type and source ID, each organizational unit has a unique external ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    /**
     * <p>The name of the organizational unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name001</p>
     */
    @NameInMap("organizationalUnitName")
    public String organizationalUnitName;

    /**
     * <p>The ID of the parent organizational unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("parentId")
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
