// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateOrganizationalUnitRequest extends TeaModel {
    // 描述
    @NameInMap("description")
    public String description;

    // 机构外部ID
    @NameInMap("organizationalUnitExternalId")
    public String organizationalUnitExternalId;

    // 机构名称
    @NameInMap("organizationalUnitName")
    public String organizationalUnitName;

    // 父机构ID
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
