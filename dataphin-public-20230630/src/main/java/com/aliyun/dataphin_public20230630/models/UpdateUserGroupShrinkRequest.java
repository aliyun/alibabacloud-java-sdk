// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateUserGroupShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    @NameInMap("UpdateCommand")
    public String updateCommandShrink;

    public static UpdateUserGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupShrinkRequest self = new UpdateUserGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateUserGroupShrinkRequest setUpdateCommandShrink(String updateCommandShrink) {
        this.updateCommandShrink = updateCommandShrink;
        return this;
    }
    public String getUpdateCommandShrink() {
        return this.updateCommandShrink;
    }

}
