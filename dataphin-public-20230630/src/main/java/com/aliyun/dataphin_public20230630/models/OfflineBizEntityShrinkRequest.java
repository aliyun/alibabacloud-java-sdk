// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBizEntityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfflineCommand")
    public String offlineCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OfflineBizEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineBizEntityShrinkRequest self = new OfflineBizEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OfflineBizEntityShrinkRequest setOfflineCommandShrink(String offlineCommandShrink) {
        this.offlineCommandShrink = offlineCommandShrink;
        return this;
    }
    public String getOfflineCommandShrink() {
        return this.offlineCommandShrink;
    }

    public OfflineBizEntityShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
