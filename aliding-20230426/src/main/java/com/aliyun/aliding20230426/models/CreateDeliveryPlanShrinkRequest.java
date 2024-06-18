// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDeliveryPlanShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <strong>example:</strong>
     * <p>1699265024987</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1028</p>
     */
    @NameInMap("ResId")
    public String resId;

    /**
     * <strong>example:</strong>
     * <p>1699265024987</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("UserIdList")
    public String userIdListShrink;

    public static CreateDeliveryPlanShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPlanShrinkRequest self = new CreateDeliveryPlanShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPlanShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public CreateDeliveryPlanShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDeliveryPlanShrinkRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateDeliveryPlanShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDeliveryPlanShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateDeliveryPlanShrinkRequest setUserIdListShrink(String userIdListShrink) {
        this.userIdListShrink = userIdListShrink;
        return this;
    }
    public String getUserIdListShrink() {
        return this.userIdListShrink;
    }

}
