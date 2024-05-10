// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteLiveShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DeleteLiveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveShrinkRequest self = new DeleteLiveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public DeleteLiveShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
