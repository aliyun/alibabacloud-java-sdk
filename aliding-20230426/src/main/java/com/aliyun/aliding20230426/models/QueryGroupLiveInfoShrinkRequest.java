// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryGroupLiveInfoShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Eijxxx</p>
     */
    @NameInMap("AnchorUnionId")
    public String anchorUnionId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("LiveUuid")
    public String liveUuid;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryGroupLiveInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupLiveInfoShrinkRequest self = new QueryGroupLiveInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryGroupLiveInfoShrinkRequest setAnchorUnionId(String anchorUnionId) {
        this.anchorUnionId = anchorUnionId;
        return this;
    }
    public String getAnchorUnionId() {
        return this.anchorUnionId;
    }

    public QueryGroupLiveInfoShrinkRequest setLiveUuid(String liveUuid) {
        this.liveUuid = liveUuid;
        return this;
    }
    public String getLiveUuid() {
        return this.liveUuid;
    }

    public QueryGroupLiveInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
