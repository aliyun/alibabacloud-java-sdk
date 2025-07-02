// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class MoveUserOrgRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>org-4mdgc1cocc59z****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    public static MoveUserOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveUserOrgRequest self = new MoveUserOrgRequest();
        return TeaModel.build(map, self);
    }

    public MoveUserOrgRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public MoveUserOrgRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
