// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSharePromotionActivityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1694315533000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>iot-cv3********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task01</p>
     */
    @NameInMap("SharePromotionActivityName")
    public String sharePromotionActivityName;

    /**
     * <strong>example:</strong>
     * <p>1691547072000</p>
     */
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
