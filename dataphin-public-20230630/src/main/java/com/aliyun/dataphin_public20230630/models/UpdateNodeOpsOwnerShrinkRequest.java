// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateNodeOpsOwnerShrinkRequest extends TeaModel {
    /**
     * <p>The command for updating O&amp;M owners.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Command")
    public String commandShrink;

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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static UpdateNodeOpsOwnerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOpsOwnerShrinkRequest self = new UpdateNodeOpsOwnerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOpsOwnerShrinkRequest setCommandShrink(String commandShrink) {
        this.commandShrink = commandShrink;
        return this;
    }
    public String getCommandShrink() {
        return this.commandShrink;
    }

    public UpdateNodeOpsOwnerShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateNodeOpsOwnerShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
