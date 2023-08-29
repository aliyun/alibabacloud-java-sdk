// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListReportShrinkRequest extends TeaModel {
    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ModifiedEndTime")
    public Long modifiedEndTime;

    @NameInMap("ModifiedStartTime")
    public Long modifiedStartTime;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static ListReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReportShrinkRequest self = new ListReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListReportShrinkRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public ListReportShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListReportShrinkRequest setModifiedEndTime(Long modifiedEndTime) {
        this.modifiedEndTime = modifiedEndTime;
        return this;
    }
    public Long getModifiedEndTime() {
        return this.modifiedEndTime;
    }

    public ListReportShrinkRequest setModifiedStartTime(Long modifiedStartTime) {
        this.modifiedStartTime = modifiedStartTime;
        return this;
    }
    public Long getModifiedStartTime() {
        return this.modifiedStartTime;
    }

    public ListReportShrinkRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ListReportShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListReportShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListReportShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
