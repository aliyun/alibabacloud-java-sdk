// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncRequest extends TeaModel {
    @NameInMap("AbnormalDuration")
    public Double abnormalDuration;

    @NameInMap("ActiveSessions")
    public Long activeSessions;

    @NameInMap("AllowThrottleEndTime")
    public String allowThrottleEndTime;

    @NameInMap("AllowThrottleStartTime")
    public String allowThrottleStartTime;

    @NameInMap("AutoKillSession")
    public Boolean autoKillSession;

    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("CpuSessionRelation")
    public String cpuSessionRelation;

    @NameInMap("CpuUsage")
    public Double cpuUsage;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("MaxThrottleTime")
    public Double maxThrottleTime;

    @NameInMap("ResultId")
    public String resultId;

    public static UpdateAutoThrottleRulesAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoThrottleRulesAsyncRequest self = new UpdateAutoThrottleRulesAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoThrottleRulesAsyncRequest setAbnormalDuration(Double abnormalDuration) {
        this.abnormalDuration = abnormalDuration;
        return this;
    }
    public Double getAbnormalDuration() {
        return this.abnormalDuration;
    }

    public UpdateAutoThrottleRulesAsyncRequest setActiveSessions(Long activeSessions) {
        this.activeSessions = activeSessions;
        return this;
    }
    public Long getActiveSessions() {
        return this.activeSessions;
    }

    public UpdateAutoThrottleRulesAsyncRequest setAllowThrottleEndTime(String allowThrottleEndTime) {
        this.allowThrottleEndTime = allowThrottleEndTime;
        return this;
    }
    public String getAllowThrottleEndTime() {
        return this.allowThrottleEndTime;
    }

    public UpdateAutoThrottleRulesAsyncRequest setAllowThrottleStartTime(String allowThrottleStartTime) {
        this.allowThrottleStartTime = allowThrottleStartTime;
        return this;
    }
    public String getAllowThrottleStartTime() {
        return this.allowThrottleStartTime;
    }

    public UpdateAutoThrottleRulesAsyncRequest setAutoKillSession(Boolean autoKillSession) {
        this.autoKillSession = autoKillSession;
        return this;
    }
    public Boolean getAutoKillSession() {
        return this.autoKillSession;
    }

    public UpdateAutoThrottleRulesAsyncRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public UpdateAutoThrottleRulesAsyncRequest setCpuSessionRelation(String cpuSessionRelation) {
        this.cpuSessionRelation = cpuSessionRelation;
        return this;
    }
    public String getCpuSessionRelation() {
        return this.cpuSessionRelation;
    }

    public UpdateAutoThrottleRulesAsyncRequest setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }
    public Double getCpuUsage() {
        return this.cpuUsage;
    }

    public UpdateAutoThrottleRulesAsyncRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public UpdateAutoThrottleRulesAsyncRequest setMaxThrottleTime(Double maxThrottleTime) {
        this.maxThrottleTime = maxThrottleTime;
        return this;
    }
    public Double getMaxThrottleTime() {
        return this.maxThrottleTime;
    }

    public UpdateAutoThrottleRulesAsyncRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

}
