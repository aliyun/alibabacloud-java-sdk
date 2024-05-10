// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsReportShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static StatisticsReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisticsReportShrinkRequest self = new StatisticsReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StatisticsReportShrinkRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public StatisticsReportShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
