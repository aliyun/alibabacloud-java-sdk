// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserLatestPlanShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetUserLatestPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserLatestPlanShrinkRequest self = new GetUserLatestPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserLatestPlanShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
