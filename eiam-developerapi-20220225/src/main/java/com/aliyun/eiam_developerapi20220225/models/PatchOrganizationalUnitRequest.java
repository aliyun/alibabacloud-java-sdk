// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchOrganizationalUnitRequest extends TeaModel {
    // 机构描述
    @NameInMap("description")
    public String description;

    // 机构名称
    @NameInMap("organizationalUnitName")
    public String organizationalUnitName;

    public static PatchOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchOrganizationalUnitRequest self = new PatchOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public PatchOrganizationalUnitRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PatchOrganizationalUnitRequest setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

}
