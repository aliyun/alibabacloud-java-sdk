// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveUserGroupMemberShrinkRequest extends TeaModel {
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
     * <p>The command to remove user group members.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemoveCommand")
    public String removeCommandShrink;

    public static RemoveUserGroupMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserGroupMemberShrinkRequest self = new RemoveUserGroupMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserGroupMemberShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public RemoveUserGroupMemberShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public RemoveUserGroupMemberShrinkRequest setRemoveCommandShrink(String removeCommandShrink) {
        this.removeCommandShrink = removeCommandShrink;
        return this;
    }
    public String getRemoveCommandShrink() {
        return this.removeCommandShrink;
    }

}
