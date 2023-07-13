// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionActivityRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SharePromotionActivityName")
    public String sharePromotionActivityName;

    @NameInMap("StartTime")
    public Long startTime;

    public static CreateSharePromotionActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSharePromotionActivityRequest self = new CreateSharePromotionActivityRequest();
        return TeaModel.build(map, self);
    }

    public CreateSharePromotionActivityRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateSharePromotionActivityRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSharePromotionActivityRequest setSharePromotionActivityName(String sharePromotionActivityName) {
        this.sharePromotionActivityName = sharePromotionActivityName;
        return this;
    }
    public String getSharePromotionActivityName() {
        return this.sharePromotionActivityName;
    }

    public CreateSharePromotionActivityRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
