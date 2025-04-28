// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateRowPermissionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateRowPermissionCommand")
    public String createRowPermissionCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateRowPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRowPermissionShrinkRequest self = new CreateRowPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRowPermissionShrinkRequest setCreateRowPermissionCommandShrink(String createRowPermissionCommandShrink) {
        this.createRowPermissionCommandShrink = createRowPermissionCommandShrink;
        return this;
    }
    public String getCreateRowPermissionCommandShrink() {
        return this.createRowPermissionCommandShrink;
    }

    public CreateRowPermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
