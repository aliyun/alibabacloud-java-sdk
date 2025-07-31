// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateTenantComputeEngineShrinkRequest extends TeaModel {
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
    @NameInMap("UpdateCommand")
    public String updateCommandShrink;

    public static UpdateTenantComputeEngineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantComputeEngineShrinkRequest self = new UpdateTenantComputeEngineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantComputeEngineShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateTenantComputeEngineShrinkRequest setUpdateCommandShrink(String updateCommandShrink) {
        this.updateCommandShrink = updateCommandShrink;
        return this;
    }
    public String getUpdateCommandShrink() {
        return this.updateCommandShrink;
    }

}
