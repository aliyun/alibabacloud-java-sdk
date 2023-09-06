// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryScheduleConferenceShrinkRequest extends TeaModel {
    @NameInMap("RequestUnionId")
    public String requestUnionId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryScheduleConferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScheduleConferenceShrinkRequest self = new QueryScheduleConferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryScheduleConferenceShrinkRequest setRequestUnionId(String requestUnionId) {
        this.requestUnionId = requestUnionId;
        return this;
    }
    public String getRequestUnionId() {
        return this.requestUnionId;
    }

    public QueryScheduleConferenceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
