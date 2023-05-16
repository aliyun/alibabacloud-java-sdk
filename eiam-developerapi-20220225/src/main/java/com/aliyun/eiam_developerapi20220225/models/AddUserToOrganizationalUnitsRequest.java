// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class AddUserToOrganizationalUnitsRequest extends TeaModel {
    @NameInMap("organizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static AddUserToOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToOrganizationalUnitsRequest self = new AddUserToOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}
