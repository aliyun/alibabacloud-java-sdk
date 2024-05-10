// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryLiveWatchDetailShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryLiveWatchDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveWatchDetailShrinkRequest self = new QueryLiveWatchDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveWatchDetailShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public QueryLiveWatchDetailShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
