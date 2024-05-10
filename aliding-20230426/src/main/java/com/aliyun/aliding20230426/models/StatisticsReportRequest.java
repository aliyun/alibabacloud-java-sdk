// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("TenantContext")
    public StatisticsReportRequestTenantContext tenantContext;

    public static StatisticsReportRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisticsReportRequest self = new StatisticsReportRequest();
        return TeaModel.build(map, self);
    }

    public StatisticsReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public StatisticsReportRequest setTenantContext(StatisticsReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StatisticsReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class StatisticsReportRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static StatisticsReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StatisticsReportRequestTenantContext self = new StatisticsReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StatisticsReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
