// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteRowPermissionShrinkRequest extends TeaModel {
    /**
     * <p>The request command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteRowPermissionCommand")
    public String deleteRowPermissionCommandShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static DeleteRowPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRowPermissionShrinkRequest self = new DeleteRowPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRowPermissionShrinkRequest setDeleteRowPermissionCommandShrink(String deleteRowPermissionCommandShrink) {
        this.deleteRowPermissionCommandShrink = deleteRowPermissionCommandShrink;
        return this;
    }
    public String getDeleteRowPermissionCommandShrink() {
        return this.deleteRowPermissionCommandShrink;
    }

    public DeleteRowPermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public DeleteRowPermissionShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
