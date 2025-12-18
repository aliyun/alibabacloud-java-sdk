// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SyncDepartmentShrinkRequest extends TeaModel {
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
    @NameInMap("SyncDepartmentCommand")
    public String syncDepartmentCommandShrink;

    public static SyncDepartmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDepartmentShrinkRequest self = new SyncDepartmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncDepartmentShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SyncDepartmentShrinkRequest setSyncDepartmentCommandShrink(String syncDepartmentCommandShrink) {
        this.syncDepartmentCommandShrink = syncDepartmentCommandShrink;
        return this;
    }
    public String getSyncDepartmentCommandShrink() {
        return this.syncDepartmentCommandShrink;
    }

}
