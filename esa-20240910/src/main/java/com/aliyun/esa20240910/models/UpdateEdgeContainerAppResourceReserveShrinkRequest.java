// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppResourceReserveShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z</p>
     */
    @NameInMap("DurationTime")
    public String durationTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Forever")
    public Boolean forever;

    @NameInMap("ReserveSet")
    public String reserveSetShrink;

    public static UpdateEdgeContainerAppResourceReserveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppResourceReserveShrinkRequest self = new UpdateEdgeContainerAppResourceReserveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppResourceReserveShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEdgeContainerAppResourceReserveShrinkRequest setDurationTime(String durationTime) {
        this.durationTime = durationTime;
        return this;
    }
    public String getDurationTime() {
        return this.durationTime;
    }

    public UpdateEdgeContainerAppResourceReserveShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEdgeContainerAppResourceReserveShrinkRequest setForever(Boolean forever) {
        this.forever = forever;
        return this;
    }
    public Boolean getForever() {
        return this.forever;
    }

    public UpdateEdgeContainerAppResourceReserveShrinkRequest setReserveSetShrink(String reserveSetShrink) {
        this.reserveSetShrink = reserveSetShrink;
        return this;
    }
    public String getReserveSetShrink() {
        return this.reserveSetShrink;
    }

}
