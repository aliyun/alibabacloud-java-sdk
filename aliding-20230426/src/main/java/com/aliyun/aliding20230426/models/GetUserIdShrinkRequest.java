// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>unionId</p>
     * 
     * <strong>example:</strong>
     * <p>****iE</p>
     */
    @NameInMap("UnionId")
    public String unionId;

    public static GetUserIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdShrinkRequest self = new GetUserIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetUserIdShrinkRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

}
