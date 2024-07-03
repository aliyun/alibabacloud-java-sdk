// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncRequest extends TeaModel {
    /**
     * <p>The duration threshold for triggering automatic SQL throttling. Set this parameter to an integer that is greater than or equal to 2. Unit: minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AbnormalDuration")
    public Double abnormalDuration;

    /**
     * <p>The threshold for the number of active sessions.</p>
     * <ul>
     * <li>If this parameter and CpuUsage are in the <strong>OR</strong> relationship, set this parameter to an integer that is greater than or equal to 16.</li>
     * <li>If this parameter and CpuUsage are in the <strong>AND</strong> relationship, set this parameter to an integer that is greater than or equal to 2.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("ActiveSessions")
    public Long activeSessions;

    /**
     * <p>The end time of the throttling window. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23:59Z</p>
     */
    @NameInMap("AllowThrottleEndTime")
    public String allowThrottleEndTime;

    /**
     * <p>The start time of the throttling window. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00Z</p>
     */
    @NameInMap("AllowThrottleStartTime")
    public String allowThrottleStartTime;

    /**
     * <p>Specifies whether to terminate abnormal SQL statements in execution at the same time. Valid values:</p>
     * <blockquote>
     * <p> Abnormal SQL statements use the same template as the SQL statements to be throttled.</p>
     * </blockquote>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoKillSession")
    public Boolean autoKillSession;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
     * <ul>
     * <li><strong>AND</strong></li>
     * <li><strong>OR</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("CpuSessionRelation")
    public String cpuSessionRelation;

    /**
     * <p>The threshold for CPU utilization. Valid values: 70% to 100%.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("CpuUsage")
    public Double cpuUsage;

    /**
     * <p>The database instance IDs.</p>
     * <blockquote>
     * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\\&quot;Instance ID1\\&quot;, \\&quot;Instance ID2\\&quot;]</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The maximum throttling duration. Set this parameter to a positive integer. Unit: minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxThrottleTime")
    public Double maxThrottleTime;

    /**
     * <p>The ID of the asynchronous request.</p>
     * <blockquote>
     * <p> You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>async__507044db6c4eadfa2dab9b084e80****</p>
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
