// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SaveStatsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RecordTime")
    public Long recordTime;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("CalleeNumber")
    public String calleeNumber;

    @NameInMap("CallStartTime")
    public Long callStartTime;

    @NameInMap("Stats")
    public String stats;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("TenantId")
    public String tenantId;

    public static SaveStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveStatsRequest self = new SaveStatsRequest();
        return TeaModel.build(map, self);
    }

    public SaveStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveStatsRequest setRecordTime(Long recordTime) {
        this.recordTime = recordTime;
        return this;
    }
    public Long getRecordTime() {
        return this.recordTime;
    }

    public SaveStatsRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveStatsRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public SaveStatsRequest setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public SaveStatsRequest setCallStartTime(Long callStartTime) {
        this.callStartTime = callStartTime;
        return this;
    }
    public Long getCallStartTime() {
        return this.callStartTime;
    }

    public SaveStatsRequest setStats(String stats) {
        this.stats = stats;
        return this;
    }
    public String getStats() {
        return this.stats;
    }

    public SaveStatsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public SaveStatsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
