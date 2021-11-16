// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemImprovementResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProblemImprovementResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetProblemImprovementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemImprovementResponseBody self = new GetProblemImprovementResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemImprovementResponseBody setData(GetProblemImprovementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProblemImprovementResponseBodyData getData() {
        return this.data;
    }

    public GetProblemImprovementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProblemImprovementResponseBodyDataMeasureList extends TeaModel {
        // 验收标准
        @NameInMap("checkStandard")
        public String checkStandard;

        // 验收人id
        @NameInMap("checkUserId")
        public Long checkUserId;

        // 验收人名称
        @NameInMap("checkUserName")
        public String checkUserName;

        // 措施内容
        @NameInMap("content")
        public String content;

        // 负责人id
        @NameInMap("directorId")
        public Long directorId;

        // 负责人名称
        @NameInMap("directorName")
        public String directorName;

        // 改进措施id 用于删除或更新
        @NameInMap("measureId")
        public Long measureId;

        // 计划完成时间
        @NameInMap("planFinishTime")
        public String planFinishTime;

        // 跟踪人id
        @NameInMap("stalkerId")
        public Long stalkerId;

        // 跟踪人名称
        @NameInMap("stalkerName")
        public String stalkerName;

        // UNIMPROVED	状态 IMPROVED 改进 2 未改进UNIMPROVED
        @NameInMap("status")
        public String status;

        // 措施类型
        @NameInMap("type")
        public Long type;

        public static GetProblemImprovementResponseBodyDataMeasureList build(java.util.Map<String, ?> map) throws Exception {
            GetProblemImprovementResponseBodyDataMeasureList self = new GetProblemImprovementResponseBodyDataMeasureList();
            return TeaModel.build(map, self);
        }

        public GetProblemImprovementResponseBodyDataMeasureList setCheckStandard(String checkStandard) {
            this.checkStandard = checkStandard;
            return this;
        }
        public String getCheckStandard() {
            return this.checkStandard;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setCheckUserId(Long checkUserId) {
            this.checkUserId = checkUserId;
            return this;
        }
        public Long getCheckUserId() {
            return this.checkUserId;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setCheckUserName(String checkUserName) {
            this.checkUserName = checkUserName;
            return this;
        }
        public String getCheckUserName() {
            return this.checkUserName;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setDirectorId(Long directorId) {
            this.directorId = directorId;
            return this;
        }
        public Long getDirectorId() {
            return this.directorId;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setDirectorName(String directorName) {
            this.directorName = directorName;
            return this;
        }
        public String getDirectorName() {
            return this.directorName;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setMeasureId(Long measureId) {
            this.measureId = measureId;
            return this;
        }
        public Long getMeasureId() {
            return this.measureId;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setPlanFinishTime(String planFinishTime) {
            this.planFinishTime = planFinishTime;
            return this;
        }
        public String getPlanFinishTime() {
            return this.planFinishTime;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setStalkerId(Long stalkerId) {
            this.stalkerId = stalkerId;
            return this;
        }
        public Long getStalkerId() {
            return this.stalkerId;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setStalkerName(String stalkerName) {
            this.stalkerName = stalkerName;
            return this;
        }
        public String getStalkerName() {
            return this.stalkerName;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProblemImprovementResponseBodyDataMeasureList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class GetProblemImprovementResponseBodyData extends TeaModel {
        // 发现来源 码表:PROBLEM_DISCOVER_SOURCE
        @NameInMap("discoverSource")
        public String discoverSource;

        // 故障责任部门
        @NameInMap("dutyDepartmentId")
        public String dutyDepartmentId;

        // 故障责任部门名称
        @NameInMap("dutyDepartmentName")
        public String dutyDepartmentName;

        // 故障责任人id
        @NameInMap("dutyUserId")
        public Long dutyUserId;

        // 故障责任人名称
        @NameInMap("dutyUserName")
        public String dutyUserName;

        // 故障责任人手机号
        @NameInMap("dutyUserPhone")
        public String dutyUserPhone;

        // 注入方式 码表:PROBLEM_INJECTION_MODE
        @NameInMap("injectionMode")
        public String injectionMode;

        // 是否手动
        @NameInMap("isManual")
        public Boolean isManual;

        // 改进措施列表
        @NameInMap("measureList")
        public java.util.List<GetProblemImprovementResponseBodyDataMeasureList> measureList;

        // 监控源
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 故障ID
        @NameInMap("problemId")
        public String problemId;

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

        // 复盘负责人名称
        @NameInMap("replayDutyUserName")
        public String replayDutyUserName;

        // 复盘负责人手机号
        @NameInMap("replayDutyUserPhone")
        public String replayDutyUserPhone;

        // 用户上报 码表:PROBLEM_USER_REPORT
        @NameInMap("userReport")
        public Long userReport;

        public static GetProblemImprovementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemImprovementResponseBodyData self = new GetProblemImprovementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemImprovementResponseBodyData setDiscoverSource(String discoverSource) {
            this.discoverSource = discoverSource;
            return this;
        }
        public String getDiscoverSource() {
            return this.discoverSource;
        }

        public GetProblemImprovementResponseBodyData setDutyDepartmentId(String dutyDepartmentId) {
            this.dutyDepartmentId = dutyDepartmentId;
            return this;
        }
        public String getDutyDepartmentId() {
            return this.dutyDepartmentId;
        }

        public GetProblemImprovementResponseBodyData setDutyDepartmentName(String dutyDepartmentName) {
            this.dutyDepartmentName = dutyDepartmentName;
            return this;
        }
        public String getDutyDepartmentName() {
            return this.dutyDepartmentName;
        }

        public GetProblemImprovementResponseBodyData setDutyUserId(Long dutyUserId) {
            this.dutyUserId = dutyUserId;
            return this;
        }
        public Long getDutyUserId() {
            return this.dutyUserId;
        }

        public GetProblemImprovementResponseBodyData setDutyUserName(String dutyUserName) {
            this.dutyUserName = dutyUserName;
            return this;
        }
        public String getDutyUserName() {
            return this.dutyUserName;
        }

        public GetProblemImprovementResponseBodyData setDutyUserPhone(String dutyUserPhone) {
            this.dutyUserPhone = dutyUserPhone;
            return this;
        }
        public String getDutyUserPhone() {
            return this.dutyUserPhone;
        }

        public GetProblemImprovementResponseBodyData setInjectionMode(String injectionMode) {
            this.injectionMode = injectionMode;
            return this;
        }
        public String getInjectionMode() {
            return this.injectionMode;
        }

        public GetProblemImprovementResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public GetProblemImprovementResponseBodyData setMeasureList(java.util.List<GetProblemImprovementResponseBodyDataMeasureList> measureList) {
            this.measureList = measureList;
            return this;
        }
        public java.util.List<GetProblemImprovementResponseBodyDataMeasureList> getMeasureList() {
            return this.measureList;
        }

        public GetProblemImprovementResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public GetProblemImprovementResponseBodyData setProblemId(String problemId) {
            this.problemId = problemId;
            return this;
        }
        public String getProblemId() {
            return this.problemId;
        }

        public GetProblemImprovementResponseBodyData setProblemReason(String problemReason) {
            this.problemReason = problemReason;
            return this;
        }
        public String getProblemReason() {
            return this.problemReason;
        }

        public GetProblemImprovementResponseBodyData setRecentActivity(String recentActivity) {
            this.recentActivity = recentActivity;
            return this;
        }
        public String getRecentActivity() {
            return this.recentActivity;
        }

        public GetProblemImprovementResponseBodyData setRecoveryMode(String recoveryMode) {
            this.recoveryMode = recoveryMode;
            return this;
        }
        public String getRecoveryMode() {
            return this.recoveryMode;
        }

        public GetProblemImprovementResponseBodyData setRelationChanges(String relationChanges) {
            this.relationChanges = relationChanges;
            return this;
        }
        public String getRelationChanges() {
            return this.relationChanges;
        }

        public GetProblemImprovementResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetProblemImprovementResponseBodyData setReplayDutyUserId(Long replayDutyUserId) {
            this.replayDutyUserId = replayDutyUserId;
            return this;
        }
        public Long getReplayDutyUserId() {
            return this.replayDutyUserId;
        }

        public GetProblemImprovementResponseBodyData setReplayDutyUserName(String replayDutyUserName) {
            this.replayDutyUserName = replayDutyUserName;
            return this;
        }
        public String getReplayDutyUserName() {
            return this.replayDutyUserName;
        }

        public GetProblemImprovementResponseBodyData setReplayDutyUserPhone(String replayDutyUserPhone) {
            this.replayDutyUserPhone = replayDutyUserPhone;
            return this;
        }
        public String getReplayDutyUserPhone() {
            return this.replayDutyUserPhone;
        }

        public GetProblemImprovementResponseBodyData setUserReport(Long userReport) {
            this.userReport = userReport;
            return this;
        }
        public Long getUserReport() {
            return this.userReport;
        }

    }

}
