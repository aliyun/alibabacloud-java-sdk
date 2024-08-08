// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScheduleShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("UserIds")
    public String userIdsShrink;

    public static GetScheduleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleShrinkRequest self = new GetScheduleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetScheduleShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetScheduleShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetScheduleShrinkRequest setUserIdsShrink(String userIdsShrink) {
        this.userIdsShrink = userIdsShrink;
        return this;
    }
    public String getUserIdsShrink() {
        return this.userIdsShrink;
    }

}
