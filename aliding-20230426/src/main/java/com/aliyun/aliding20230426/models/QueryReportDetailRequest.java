// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryReportDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("TenantContext")
    public QueryReportDetailRequestTenantContext tenantContext;

    public static QueryReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReportDetailRequest self = new QueryReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryReportDetailRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public QueryReportDetailRequest setTenantContext(QueryReportDetailRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public QueryReportDetailRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class QueryReportDetailRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static QueryReportDetailRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            QueryReportDetailRequestTenantContext self = new QueryReportDetailRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public QueryReportDetailRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
