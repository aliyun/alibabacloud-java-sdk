// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class MoveOrgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-5yy5icj981xe5****</p>
     */
    @NameInMap("NewParentOrgId")
    public String newParentOrgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-5yy5icj981xe5****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    public static MoveOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveOrgRequest self = new MoveOrgRequest();
        return TeaModel.build(map, self);
    }

    public MoveOrgRequest setNewParentOrgId(String newParentOrgId) {
        this.newParentOrgId = newParentOrgId;
        return this;
    }
    public String getNewParentOrgId() {
        return this.newParentOrgId;
    }

    public MoveOrgRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
