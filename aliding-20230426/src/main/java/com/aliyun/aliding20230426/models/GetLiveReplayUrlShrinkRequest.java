// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlShrinkRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetLiveReplayUrlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlShrinkRequest self = new GetLiveReplayUrlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlShrinkRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public GetLiveReplayUrlShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
