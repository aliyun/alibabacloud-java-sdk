// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateComputeSourceShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public String createCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateComputeSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeSourceShrinkRequest self = new CreateComputeSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeSourceShrinkRequest setCreateCommandShrink(String createCommandShrink) {
        this.createCommandShrink = createCommandShrink;
        return this;
    }
    public String getCreateCommandShrink() {
        return this.createCommandShrink;
    }

    public CreateComputeSourceShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
