// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class QueryRunningInstanceShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryRunningInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRunningInstanceShrinkRequest self = new QueryRunningInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryRunningInstanceShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public QueryRunningInstanceShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
