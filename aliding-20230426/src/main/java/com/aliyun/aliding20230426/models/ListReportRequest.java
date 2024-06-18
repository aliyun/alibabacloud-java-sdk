// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Cursor")
    public Long cursor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1507564800000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1507564800000</p>
     */
    @NameInMap("ModifiedEndTime")
    public Long modifiedEndTime;

    /**
     * <strong>example:</strong>
     * <p>1507564800000</p>
     */
    @NameInMap("ModifiedStartTime")
    public Long modifiedStartTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1507564800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>我管理的模版</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public ListReportRequestTenantContext tenantContext;

    public static ListReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportRequest self = new ListReportRequest();
        return TeaModel.build(map, self);
    }

    public ListReportRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public ListReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListReportRequest setModifiedEndTime(Long modifiedEndTime) {
        this.modifiedEndTime = modifiedEndTime;
        return this;
    }
    public Long getModifiedEndTime() {
        return this.modifiedEndTime;
    }

    public ListReportRequest setModifiedStartTime(Long modifiedStartTime) {
        this.modifiedStartTime = modifiedStartTime;
        return this;
    }
    public Long getModifiedStartTime() {
        return this.modifiedStartTime;
    }

    public ListReportRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListReportRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListReportRequest setTenantContext(ListReportRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListReportRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class ListReportRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListReportRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListReportRequestTenantContext self = new ListReportRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListReportRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
