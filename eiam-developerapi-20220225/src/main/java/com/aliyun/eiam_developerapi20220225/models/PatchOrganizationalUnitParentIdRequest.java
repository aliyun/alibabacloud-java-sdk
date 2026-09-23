// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchOrganizationalUnitParentIdRequest extends TeaModel {
    /**
     * <p>The ID of the parent organizational unit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ou_001</p>
     */
    @NameInMap("parentId")
    public String parentId;

    public static PatchOrganizationalUnitParentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        PatchOrganizationalUnitParentIdRequest self = new PatchOrganizationalUnitParentIdRequest();
        return TeaModel.build(map, self);
    }

    public PatchOrganizationalUnitParentIdRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
