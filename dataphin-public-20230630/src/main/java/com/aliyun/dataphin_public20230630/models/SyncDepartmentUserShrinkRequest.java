// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentUserShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SyncDepartmentUserCommand")
    public String syncDepartmentUserCommandShrink;

    public static SyncDepartmentUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentUserShrinkRequest self = new SyncDepartmentUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentUserShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SyncDepartmentUserShrinkRequest setSyncDepartmentUserCommandShrink(String syncDepartmentUserCommandShrink) {
        this.syncDepartmentUserCommandShrink = syncDepartmentUserCommandShrink;
        return this;
    }
    public String getSyncDepartmentUserCommandShrink() {
        return this.syncDepartmentUserCommandShrink;
    }

}
