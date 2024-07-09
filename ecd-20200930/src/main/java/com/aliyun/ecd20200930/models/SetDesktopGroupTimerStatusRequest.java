// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopGroupTimerStatusRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-fgxsniu6at****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

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
     * <p>The status of the scheduled task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: enabled</li>
     * <li>2: disabled</li>
     * <li>3: deleted</li>
     * <li>100: unknown</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

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
