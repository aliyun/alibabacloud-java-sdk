// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerRequest extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResetType")
    public Integer resetType;

    @NameInMap("TimerType")
    public Integer timerType;

    public static SetDesktopGroupTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopGroupTimerRequest self = new SetDesktopGroupTimerRequest();
        return TeaModel.build(map, self);
    }

    public SetDesktopGroupTimerRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public SetDesktopGroupTimerRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public SetDesktopGroupTimerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public SetDesktopGroupTimerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetDesktopGroupTimerRequest setResetType(Integer resetType) {
        this.resetType = resetType;
        return this;
    }
    public Integer getResetType() {
        return this.resetType;
    }

    public SetDesktopGroupTimerRequest setTimerType(Integer timerType) {
        this.timerType = timerType;
        return this;
    }
    public Integer getTimerType() {
        return this.timerType;
    }

}
