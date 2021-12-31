// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportSessionStatusRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionChangeTime")
    public Long sessionChangeTime;

    @NameInMap("SessionId")
    public String sessionId;

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
