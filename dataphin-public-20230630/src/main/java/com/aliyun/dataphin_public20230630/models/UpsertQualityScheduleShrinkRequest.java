// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityScheduleShrinkRequest extends TeaModel {
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
    @NameInMap("UpsertCommand")
    public String upsertCommandShrink;

    public static UpsertQualityScheduleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityScheduleShrinkRequest self = new UpsertQualityScheduleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityScheduleShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityScheduleShrinkRequest setUpsertCommandShrink(String upsertCommandShrink) {
        this.upsertCommandShrink = upsertCommandShrink;
        return this;
    }
    public String getUpsertCommandShrink() {
        return this.upsertCommandShrink;
    }

}
