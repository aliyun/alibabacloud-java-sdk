// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SimpleListReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Cursor")
    public Long cursor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public SimpleListReportRequestTenantContext tenantContext;

    public static SimpleListReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SimpleListReportRequest self = new SimpleListReportRequest();
        return TeaModel.build(map, self);
    }

    public SimpleListReportRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public SimpleListReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SimpleListReportRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public SimpleListReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SimpleListReportRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SimpleListReportRequest setTenantContext(SimpleListReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SimpleListReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SimpleListReportRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SimpleListReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SimpleListReportRequestTenantContext self = new SimpleListReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SimpleListReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
