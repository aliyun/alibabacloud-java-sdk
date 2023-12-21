// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendSearchShadeShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String contentShrink;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static SendSearchShadeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSearchShadeShrinkRequest self = new SendSearchShadeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendSearchShadeShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public SendSearchShadeShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendSearchShadeShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SendSearchShadeShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
