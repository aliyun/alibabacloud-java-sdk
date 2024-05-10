// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommentListReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public CommentListReportRequestTenantContext tenantContext;

    public static CommentListReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CommentListReportRequest self = new CommentListReportRequest();
        return TeaModel.build(map, self);
    }

    public CommentListReportRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public CommentListReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public CommentListReportRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public CommentListReportRequest setTenantContext(CommentListReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CommentListReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CommentListReportRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CommentListReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CommentListReportRequestTenantContext self = new CommentListReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CommentListReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
