// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RemoveUserFromOrganizationalUnitsRequest extends TeaModel {
    @NameInMap("organizationalUnitIds")
    public java.util.List<String> organizationalUnitIds;

    public static RemoveUserFromOrganizationalUnitsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromOrganizationalUnitsRequest self = new RemoveUserFromOrganizationalUnitsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromOrganizationalUnitsRequest setOrganizationalUnitIds(java.util.List<String> organizationalUnitIds) {
        this.organizationalUnitIds = organizationalUnitIds;
        return this;
    }
    public java.util.List<String> getOrganizationalUnitIds() {
        return this.organizationalUnitIds;
    }

}
