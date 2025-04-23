// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class RemoveOrgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-5yy5icj981xe5****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    public static RemoveOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveOrgRequest self = new RemoveOrgRequest();
        return TeaModel.build(map, self);
    }

    public RemoveOrgRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
