// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateUdfShrinkRequest extends TeaModel {
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

    public static CreateUdfShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfShrinkRequest self = new CreateUdfShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUdfShrinkRequest setCreateCommandShrink(String createCommandShrink) {
        this.createCommandShrink = createCommandShrink;
        return this;
    }
    public String getCreateCommandShrink() {
        return this.createCommandShrink;
    }

    public CreateUdfShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
