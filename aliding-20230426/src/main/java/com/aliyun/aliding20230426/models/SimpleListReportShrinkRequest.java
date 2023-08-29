// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SimpleListReportShrinkRequest extends TeaModel {
    @NameInMap("Cursor")
    public Long cursor;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static SimpleListReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SimpleListReportShrinkRequest self = new SimpleListReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SimpleListReportShrinkRequest setCursor(Long cursor) {
        this.cursor = cursor;
        return this;
    }
    public Long getCursor() {
        return this.cursor;
    }

    public SimpleListReportShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SimpleListReportShrinkRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public SimpleListReportShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SimpleListReportShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public SimpleListReportShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
