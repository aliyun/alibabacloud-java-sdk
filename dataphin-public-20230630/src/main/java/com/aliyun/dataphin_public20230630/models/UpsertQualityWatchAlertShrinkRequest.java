// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityWatchAlertShrinkRequest extends TeaModel {
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
     * <p>The update instruction.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public String upsertCommandShrink;

    public static UpsertQualityWatchAlertShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityWatchAlertShrinkRequest self = new UpsertQualityWatchAlertShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityWatchAlertShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityWatchAlertShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpsertQualityWatchAlertShrinkRequest setUpsertCommandShrink(String upsertCommandShrink) {
        this.upsertCommandShrink = upsertCommandShrink;
        return this;
    }
    public String getUpsertCommandShrink() {
        return this.upsertCommandShrink;
    }

}
