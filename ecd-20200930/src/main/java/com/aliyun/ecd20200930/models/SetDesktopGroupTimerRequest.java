// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerRequest extends TeaModel {
    /**
     * <p>The cron expression for the scheduled task. This parameter is required when `TimerType` is set to 2, 3, or 4.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The ID of the cloud computer pool.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to forcefully execute the scheduled task.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the disk that you want to reset.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- does not reset disks.</p>
     * <p>- resets only the system disk.</p>
     * <p>- resets only the user disk.</p>
     * <p>- resets the system disk and the user disk.</p>
     */
    @NameInMap("ResetType")
    public Integer resetType;

    /**
     * <p>The type of the scheduled task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   1: scheduled reset</p>
     * <p>*   2: scheduled startup</p>
     * <p>*   3: scheduled stop</p>
     * <p>*   4: scheduled restart</p>
     */
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
