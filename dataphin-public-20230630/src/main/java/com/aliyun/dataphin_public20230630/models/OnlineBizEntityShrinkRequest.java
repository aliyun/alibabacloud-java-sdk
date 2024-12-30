// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OnlineBizEntityShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OnlineCommand")
    public String onlineCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static OnlineBizEntityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineBizEntityShrinkRequest self = new OnlineBizEntityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OnlineBizEntityShrinkRequest setOnlineCommandShrink(String onlineCommandShrink) {
        this.onlineCommandShrink = onlineCommandShrink;
        return this;
    }
    public String getOnlineCommandShrink() {
        return this.onlineCommandShrink;
    }

    public OnlineBizEntityShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
