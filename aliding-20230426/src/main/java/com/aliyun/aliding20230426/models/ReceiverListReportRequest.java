// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ReceiverListReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Offset")
    public Long offset;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>173xxxx</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public ReceiverListReportRequestTenantContext tenantContext;

    public static ReceiverListReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiverListReportRequest self = new ReceiverListReportRequest();
        return TeaModel.build(map, self);
    }

    public ReceiverListReportRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ReceiverListReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ReceiverListReportRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ReceiverListReportRequest setTenantContext(ReceiverListReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ReceiverListReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ReceiverListReportRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ReceiverListReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ReceiverListReportRequestTenantContext self = new ReceiverListReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ReceiverListReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
