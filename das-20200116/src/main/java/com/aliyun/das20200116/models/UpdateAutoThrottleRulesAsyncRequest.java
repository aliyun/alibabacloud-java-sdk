// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoThrottleRulesAsyncRequest extends TeaModel {
    /**
     * <p>The duration threshold of the anomaly that triggers automatic SQL throttling. The value must be a positive integer greater than or equal to 2. Unit: minutes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AbnormalDuration")
    public Double abnormalDuration;

    /**
     * <p>The active sessions threshold.	</p>
     * <ul>
     * <li>If the relationship with the CPU utilization threshold is <strong>OR</strong>, the value must be greater than or equal to 16.</li>
     * <li>If the relationship with the CPU utilization threshold is <strong>AND</strong>, the value must be greater than or equal to 2.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("ActiveSessions")
    public Long activeSessions;

    /**
     * <p>The end time of the throttling time window (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23:59Z</p>
     */
    @NameInMap("AllowThrottleEndTime")
    public String allowThrottleEndTime;

    /**
     * <p>The start time of the throttling time window (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00Z</p>
     */
    @NameInMap("AllowThrottleStartTime")
    public String allowThrottleStartTime;

    /**
     * <p>Specifies whether to simultaneously kill abnormal SQL statements that are being executed.</p>
     * <blockquote>
     * <p>Abnormal SQL statements are those that match the SQL templates to be throttled.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoKillSession")
    public Boolean autoKillSession;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The logical relationship between the CPU utilization threshold and the active sessions threshold. Valid values:</p>
     * <ul>
     * <li><strong>AND</strong>: both conditions must be met.</li>
     * <li><strong>OR</strong>: either condition must be met.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("CpuSessionRelation")
    public String cpuSessionRelation;

    /**
     * <p>The CPU utilization threshold. Valid values: 70% to 100%.</p>
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
     * <p>The data format is JSONArray, such as <code>[\\&quot;Instance ID 1\\&quot;,\\&quot;Instance ID 2\\&quot;]</code>. Separate instance IDs with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The maximum throttling duration. The value must be a positive integer. Unit: minutes.</p>
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
     * <p>An asynchronous call does not immediately return complete results. First, call this operation to obtain the <strong>ResultId</strong>. Then, use the returned <strong>ResultId</strong> to initiate the call again until <strong>isFinish</strong> is <strong>true</strong>, at which point the complete results are returned. This means that you must call this operation at least twice to obtain complete data.</p>
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
