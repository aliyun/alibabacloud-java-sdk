// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyResourcePermissionShrinkRequest extends TeaModel {
    /**
     * <p>The permission application request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public String applyCommandShrink;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ApplyResourcePermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourcePermissionShrinkRequest self = new ApplyResourcePermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyResourcePermissionShrinkRequest setApplyCommandShrink(String applyCommandShrink) {
        this.applyCommandShrink = applyCommandShrink;
        return this;
    }
    public String getApplyCommandShrink() {
        return this.applyCommandShrink;
    }

    public ApplyResourcePermissionShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyResourcePermissionShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
