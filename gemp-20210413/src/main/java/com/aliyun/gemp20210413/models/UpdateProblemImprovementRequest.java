// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemImprovementRequest extends TeaModel {
    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    // 发现来源 码表:PROBLEM_DISCOVER_SOURCE
    @NameInMap("discoverSource")
    public Long discoverSource;

    // 故障责任部门ID
    @NameInMap("dutyDepartmentId")
    public Long dutyDepartmentId;

    // 故障责任部门
    @NameInMap("dutyDepartmentName")
    public String dutyDepartmentName;

    // 故障责任人id
    @NameInMap("dutyUserId")
    public Long dutyUserId;

    // 注入方式 码表:PROBLEM_INJECTION_MODE
    @NameInMap("injectionMode")
    public String injectionMode;

    // 监控源
    @NameInMap("monitorSourceName")
    public String monitorSourceName;

    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    // 故障原因
    @NameInMap("problemReason")
    public String problemReason;

    // 最近活动 码表:PROBLEM_RECENT_ACTIVITY
    @NameInMap("recentActivity")
    public String recentActivity;

    // 恢复方式  码表:PROBLEM_RECOVERY_MODE
    @NameInMap("recoveryMode")
    public String recoveryMode;

    // 关联变更
    @NameInMap("relationChanges")
    public String relationChanges;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 复盘负责人id
    @NameInMap("replayDutyUserId")
    public Long replayDutyUserId;

    // 用户上报 码表:PROBLEM_USER_REPORT
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
