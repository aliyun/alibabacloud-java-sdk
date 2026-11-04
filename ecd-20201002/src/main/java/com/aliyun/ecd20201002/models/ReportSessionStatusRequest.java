// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportSessionStatusRequest extends TeaModel {
    /**
     * <p>The connected user.</p>
     * 
     * <strong>example:</strong>
     * <p>liming</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp167fcodoa90ixn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The duration of the session change.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1642909143781</p>
     */
    @NameInMap("SessionChangeTime")
    public Long sessionChangeTime;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The session status. Valid values:</p>
     * <ul>
     * <li>SessionLogOff: The session is closed.</li>
     * <li>DesktopTimerDisconnection: The cloud computer is disconnected by a scheduled task.</li>
     * <li>SessionReboot: The session is rebooted.</li>
     * <li>DesktopTimerShutdown: The cloud computer is started by a scheduled task.</li>
     * <li>SessionLock: The logged-on user locks the session.</li>
     * <li>SessionShutdown: The session is shut down.</li>
     * <li>SessionUnLock: The logged-on user unlocks the session.</li>
     * <li>DesktopTimerReboot: The cloud computer is rebooted by a scheduled task.</li>
     * <li>ConsoleConnect: The console is connected before the session starts.</li>
     * <li>SessionLogOn: The session starts.</li>
     * <li>SessionPopup: The session exits before disconnection.</li>
     * <li>SessionDisconnect: The session is disconnected.</li>
     * <li>ConsoleDisconnect: The console is disconnected after the session is logged off.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionLogOn</p>
     */
    @NameInMap("SessionStatus")
    public String sessionStatus;

    public static ReportSessionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportSessionStatusRequest self = new ReportSessionStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportSessionStatusRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ReportSessionStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReportSessionStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReportSessionStatusRequest setSessionChangeTime(Long sessionChangeTime) {
        this.sessionChangeTime = sessionChangeTime;
        return this;
    }
    public Long getSessionChangeTime() {
        return this.sessionChangeTime;
    }

    public ReportSessionStatusRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ReportSessionStatusRequest setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }
    public String getSessionStatus() {
        return this.sessionStatus;
    }

}
