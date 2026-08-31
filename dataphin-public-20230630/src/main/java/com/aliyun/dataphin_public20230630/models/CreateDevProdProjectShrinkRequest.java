// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDevProdProjectShrinkRequest extends TeaModel {
    /**
     * <p>The create command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public String createCommandShrink;

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

    public static CreateDevProdProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevProdProjectShrinkRequest self = new CreateDevProdProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevProdProjectShrinkRequest setCreateCommandShrink(String createCommandShrink) {
        this.createCommandShrink = createCommandShrink;
        return this;
    }
    public String getCreateCommandShrink() {
        return this.createCommandShrink;
    }

    public CreateDevProdProjectShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateDevProdProjectShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
