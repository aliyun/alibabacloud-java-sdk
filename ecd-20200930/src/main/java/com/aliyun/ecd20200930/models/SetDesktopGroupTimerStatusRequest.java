// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TimerType")
    public Integer timerType;

    public static SetDesktopGroupTimerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerStatusRequest self = new SetDesktopGroupTimerStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerStatusRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetDesktopGroupTimerStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDesktopGroupTimerStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SetDesktopGroupTimerStatusRequest setTimerType(Integer timerType) {
        this.timerType = timerType;
        return this;
    }
    public Integer getTimerType() {
        return this.timerType;
    }

}
