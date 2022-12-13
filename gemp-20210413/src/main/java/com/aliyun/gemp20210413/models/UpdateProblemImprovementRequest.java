// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemImprovementRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("customProblemReason")
    public String customProblemReason;

    @NameInMap("discoverSource")
    public Long discoverSource;

    @NameInMap("dutyDepartmentId")
    public Long dutyDepartmentId;

    @NameInMap("dutyDepartmentName")
    public String dutyDepartmentName;

    @NameInMap("dutyUserId")
    public Long dutyUserId;

    @NameInMap("injectionMode")
    public String injectionMode;

    @NameInMap("monitorSourceName")
    public String monitorSourceName;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemReason")
    public String problemReason;

    @NameInMap("recentActivity")
    public String recentActivity;

    @NameInMap("recoveryMode")
    public String recoveryMode;

    @NameInMap("relationChanges")
    public String relationChanges;

    @NameInMap("remark")
    public String remark;

    @NameInMap("replayDutyUserId")
    public Long replayDutyUserId;

    @NameInMap("userReport")
    public Long userReport;

    public static UpdateProblemImprovementRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemImprovementRequest self = new UpdateProblemImprovementRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemImprovementRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemImprovementRequest setCustomProblemReason(String customProblemReason) {
        this.customProblemReason = customProblemReason;
        return this;
    }
    public String getCustomProblemReason() {
        return this.customProblemReason;
    }

    public UpdateProblemImprovementRequest setDiscoverSource(Long discoverSource) {
        this.discoverSource = discoverSource;
        return this;
    }
    public Long getDiscoverSource() {
        return this.discoverSource;
    }

    public UpdateProblemImprovementRequest setDutyDepartmentId(Long dutyDepartmentId) {
        this.dutyDepartmentId = dutyDepartmentId;
        return this;
    }
    public Long getDutyDepartmentId() {
        return this.dutyDepartmentId;
    }

    public UpdateProblemImprovementRequest setDutyDepartmentName(String dutyDepartmentName) {
        this.dutyDepartmentName = dutyDepartmentName;
        return this;
    }
    public String getDutyDepartmentName() {
        return this.dutyDepartmentName;
    }

    public UpdateProblemImprovementRequest setDutyUserId(Long dutyUserId) {
        this.dutyUserId = dutyUserId;
        return this;
    }
    public Long getDutyUserId() {
        return this.dutyUserId;
    }

    public UpdateProblemImprovementRequest setInjectionMode(String injectionMode) {
        this.injectionMode = injectionMode;
        return this;
    }
    public String getInjectionMode() {
        return this.injectionMode;
    }

    public UpdateProblemImprovementRequest setMonitorSourceName(String monitorSourceName) {
        this.monitorSourceName = monitorSourceName;
        return this;
    }
    public String getMonitorSourceName() {
        return this.monitorSourceName;
    }

    public UpdateProblemImprovementRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemImprovementRequest setProblemReason(String problemReason) {
        this.problemReason = problemReason;
        return this;
    }
    public String getProblemReason() {
        return this.problemReason;
    }

    public UpdateProblemImprovementRequest setRecentActivity(String recentActivity) {
        this.recentActivity = recentActivity;
        return this;
    }
    public String getRecentActivity() {
        return this.recentActivity;
    }

    public UpdateProblemImprovementRequest setRecoveryMode(String recoveryMode) {
        this.recoveryMode = recoveryMode;
        return this;
    }
    public String getRecoveryMode() {
        return this.recoveryMode;
    }

    public UpdateProblemImprovementRequest setRelationChanges(String relationChanges) {
        this.relationChanges = relationChanges;
        return this;
    }
    public String getRelationChanges() {
        return this.relationChanges;
    }

    public UpdateProblemImprovementRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateProblemImprovementRequest setReplayDutyUserId(Long replayDutyUserId) {
        this.replayDutyUserId = replayDutyUserId;
        return this;
    }
    public Long getReplayDutyUserId() {
        return this.replayDutyUserId;
    }

    public UpdateProblemImprovementRequest setUserReport(Long userReport) {
        this.userReport = userReport;
        return this;
    }
    public Long getUserReport() {
        return this.userReport;
    }

}
