// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ReceiverListReportShrinkRequest extends TeaModel {
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static ReceiverListReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiverListReportShrinkRequest self = new ReceiverListReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReceiverListReportShrinkRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ReceiverListReportShrinkRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ReceiverListReportShrinkRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ReceiverListReportShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
