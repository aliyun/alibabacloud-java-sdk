// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer pool.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the scheduled task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   1: enabled</p>
     * <p>*   2: disabled</p>
     * <p>*   3: deleted</p>
     * <p>*   100: unknown</p>
     */
    @NameInMap("Status")
    public Integer status;

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
