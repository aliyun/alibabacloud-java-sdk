// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class SetUserPrimaryOrganizationalUnitRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
     */
    @NameInMap("organizationalUnitId")
    public String organizationalUnitId;

    public static SetUserPrimaryOrganizationalUnitRequest build(java.util.Map<String, ?> map) throws Exception {
        SetUserPrimaryOrganizationalUnitRequest self = new SetUserPrimaryOrganizationalUnitRequest();
        return TeaModel.build(map, self);
    }

    public SetUserPrimaryOrganizationalUnitRequest setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
        return this;
    }
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

}
