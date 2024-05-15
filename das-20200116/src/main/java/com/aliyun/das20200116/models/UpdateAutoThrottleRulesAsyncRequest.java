// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncRequest extends TeaModel {
    /**
     * <p>The duration threshold for triggering automatic SQL throttling. Set this parameter to a positive integer that is greater than or equal to 2. Unit: minutes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AbnormalDuration")
    public Double abnormalDuration;

    /**
     * <p>The maximum number of active sessions.</p>
     * <br>
     * <p>*   Specify an integer that is greater than or equal to 16 when the CPU utilization threshold and the maximum number of active sessions are in the **OR** relationship.</p>
     * <p>*   Specify an integer that is greater than or equal to 2 when the CPU utilization threshold and the maximum number of active sessions are in the **AND** relationship.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActiveSessions")
    public Long activeSessions;

    /**
     * <p>The end time of the throttling window. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AllowThrottleEndTime")
    public String allowThrottleEndTime;

    /**
     * <p>The start time of the throttling window. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AllowThrottleStartTime")
    public String allowThrottleStartTime;

    /**
     * <p>Specifies whether to terminate abnormal SQL statements in execution at the same time. Valid values:</p>
     * <br>
     * <p>>  Abnormal SQL statements use the same template as the SQL statements that need to be throttled.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AutoKillSession")
    public Boolean autoKillSession;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
     * <br>
     * <p>*   **AND**</p>
     * <p>*   **OR**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CpuSessionRelation")
    public String cpuSessionRelation;

    /**
     * <p>The CPU utilization threshold, in percentages. Valid values: 70 to 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CpuUsage")
    public Double cpuUsage;

    /**
     * <p>The database instance IDs.</p>
     * <br>
     * <p>>  Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\\"Instance ID1\\", \\"Instance ID2\\"]`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The maximum throttling duration. Set this parameter to a positive integer. Unit: minutes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxThrottleTime")
    public Double maxThrottleTime;

    /**
     * <p>The ID of the asynchronous request.</p>
     * <br>
     * <p>>  You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.</p>
     */
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
