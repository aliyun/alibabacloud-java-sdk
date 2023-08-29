// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StatisticsListByTypeReportRequest extends TeaModel {
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public StatisticsListByTypeReportRequestTenantContext tenantContext;

    @NameInMap("Type")
    public Long type;

    public static StatisticsListByTypeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisticsListByTypeReportRequest self = new StatisticsListByTypeReportRequest();
        return TeaModel.build(map, self);
    }

    public StatisticsListByTypeReportRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public StatisticsListByTypeReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public StatisticsListByTypeReportRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public StatisticsListByTypeReportRequest setTenantContext(StatisticsListByTypeReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StatisticsListByTypeReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public StatisticsListByTypeReportRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public static class StatisticsListByTypeReportRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static StatisticsListByTypeReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StatisticsListByTypeReportRequestTenantContext self = new StatisticsListByTypeReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StatisticsListByTypeReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
