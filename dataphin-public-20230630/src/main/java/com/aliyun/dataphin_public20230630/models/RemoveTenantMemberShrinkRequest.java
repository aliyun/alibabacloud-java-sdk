// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveTenantMemberShrinkRequest extends TeaModel {
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
    @NameInMap("RemoveCommand")
    public String removeCommandShrink;

    public static RemoveTenantMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTenantMemberShrinkRequest self = new RemoveTenantMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTenantMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveTenantMemberShrinkRequest setRemoveCommandShrink(String removeCommandShrink) {
        this.removeCommandShrink = removeCommandShrink;
        return this;
    }
    public String getRemoveCommandShrink() {
        return this.removeCommandShrink;
    }

}
