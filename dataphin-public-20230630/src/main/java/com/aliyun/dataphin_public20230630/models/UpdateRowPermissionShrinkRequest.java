// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateRowPermissionShrinkRequest extends TeaModel {
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
    @NameInMap("UpdateRowPermissionCommand")
    public String updateRowPermissionCommandShrink;

    public static UpdateRowPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRowPermissionShrinkRequest self = new UpdateRowPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRowPermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateRowPermissionShrinkRequest setUpdateRowPermissionCommandShrink(String updateRowPermissionCommandShrink) {
        this.updateRowPermissionCommandShrink = updateRowPermissionCommandShrink;
        return this;
    }
    public String getUpdateRowPermissionCommandShrink() {
        return this.updateRowPermissionCommandShrink;
    }

}
