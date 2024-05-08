// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SyncDingTypeShrinkRequest extends TeaModel {
    @NameInMap("DingType")
    public String dingType;

    @NameInMap("IsDimission")
    public String isDimission;

    @NameInMap("Source")
    public String source;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("WorkNo")
    public String workNo;

    public static SyncDingTypeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDingTypeShrinkRequest self = new SyncDingTypeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SyncDingTypeShrinkRequest setDingType(String dingType) {
        this.dingType = dingType;
        return this;
    }
    public String getDingType() {
        return this.dingType;
    }

    public SyncDingTypeShrinkRequest setIsDimission(String isDimission) {
        this.isDimission = isDimission;
        return this;
    }
    public String getIsDimission() {
        return this.isDimission;
    }

    public SyncDingTypeShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SyncDingTypeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public SyncDingTypeShrinkRequest setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }
    public String getWorkNo() {
        return this.workNo;
    }

}
