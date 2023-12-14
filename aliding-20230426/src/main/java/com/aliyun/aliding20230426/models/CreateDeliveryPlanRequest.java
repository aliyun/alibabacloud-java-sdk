// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDeliveryPlanRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ResId")
    public String resId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static CreateDeliveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPlanRequest self = new CreateDeliveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPlanRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public CreateDeliveryPlanRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDeliveryPlanRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateDeliveryPlanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDeliveryPlanRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
