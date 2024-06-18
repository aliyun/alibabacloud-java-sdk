// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportUnReadCountShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Request")
    public String requestShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetReportUnReadCountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportUnReadCountShrinkRequest self = new GetReportUnReadCountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetReportUnReadCountShrinkRequest setRequestShrink(String requestShrink) {
        this.requestShrink = requestShrink;
        return this;
    }
    public String getRequestShrink() {
        return this.requestShrink;
    }

    public GetReportUnReadCountShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
