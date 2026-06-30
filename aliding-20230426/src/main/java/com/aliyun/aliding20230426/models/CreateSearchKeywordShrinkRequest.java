// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSearchKeywordShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResId")
    public String resId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("UserIdList")
    public String userIdListShrink;

    public static CreateSearchKeywordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchKeywordShrinkRequest self = new CreateSearchKeywordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchKeywordShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSearchKeywordShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSearchKeywordShrinkRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateSearchKeywordShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateSearchKeywordShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateSearchKeywordShrinkRequest setUserIdListShrink(String userIdListShrink) {
        this.userIdListShrink = userIdListShrink;
        return this;
    }
    public String getUserIdListShrink() {
        return this.userIdListShrink;
    }

}
