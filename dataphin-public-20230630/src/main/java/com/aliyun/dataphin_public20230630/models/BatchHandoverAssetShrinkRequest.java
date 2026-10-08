// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchHandoverAssetShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HandoverCommand")
    public String handoverCommandShrink;

    /**
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

    public static BatchHandoverAssetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchHandoverAssetShrinkRequest self = new BatchHandoverAssetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchHandoverAssetShrinkRequest setHandoverCommandShrink(String handoverCommandShrink) {
        this.handoverCommandShrink = handoverCommandShrink;
        return this;
    }
    public String getHandoverCommandShrink() {
        return this.handoverCommandShrink;
    }

    public BatchHandoverAssetShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public BatchHandoverAssetShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
