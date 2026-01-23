// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityRuleShrinkRequest extends TeaModel {
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

    public static UpsertQualityRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityRuleShrinkRequest self = new UpsertQualityRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityRuleShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityRuleShrinkRequest setUpsertCommandShrink(String upsertCommandShrink) {
        this.upsertCommandShrink = upsertCommandShrink;
        return this;
    }
    public String getUpsertCommandShrink() {
        return this.upsertCommandShrink;
    }

}
