// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerRequest extends TeaModel {
    /**
     * <p>The cron expression for the scheduled task. This parameter is required when <code>TimerType</code> is set to 2, 3, or 4.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 2 ? * 1-7</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-dbdkfmh883****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Specifies whether to forcefully execute the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the disk that you want to reset.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>does not reset disks.</li>
     * <li>resets only the system disk.</li>
     * <li>resets only the user disk.</li>
     * <li>resets the system disk and the user disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResetType")
    public Integer resetType;

    /**
     * <p>The type of the scheduled task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: scheduled reset</li>
     * <li>2: scheduled startup</li>
     * <li>3: scheduled stop</li>
     * <li>4: scheduled restart</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
