// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryReportDetailShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static QueryReportDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReportDetailShrinkRequest self = new QueryReportDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryReportDetailShrinkRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public QueryReportDetailShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
