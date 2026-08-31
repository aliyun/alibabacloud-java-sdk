// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RevokeResourcePermissionShrinkRequest extends TeaModel {
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

    /**
     * <p>The authorization revocation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RevokeCommand")
    public String revokeCommandShrink;

    public static RevokeResourcePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeResourcePermissionShrinkRequest self = new RevokeResourcePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeResourcePermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RevokeResourcePermissionShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RevokeResourcePermissionShrinkRequest setRevokeCommandShrink(String revokeCommandShrink) {
        this.revokeCommandShrink = revokeCommandShrink;
        return this;
    }
    public String getRevokeCommandShrink() {
        return this.revokeCommandShrink;
    }

}
