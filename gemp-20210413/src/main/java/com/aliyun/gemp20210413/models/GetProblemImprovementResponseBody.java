// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemImprovementResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetProblemImprovementResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3811</p>
     */
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
        @NameInMap("checkStandard")
        public String checkStandard;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("checkUserId")
        public Long checkUserId;

        @NameInMap("checkUserIsValid")
        public Integer checkUserIsValid;

        @NameInMap("checkUserName")
        public String checkUserName;

        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>212</p>
         */
        @NameInMap("directorId")
        public Long directorId;

        @NameInMap("directorIsValid")
        public Integer directorIsValid;

        @NameInMap("directorName")
        public String directorName;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("measureId")
        public Long measureId;

        /**
         * <strong>example:</strong>
         * <p>2021-05-01 00:00:00</p>
         */
        @NameInMap("planFinishTime")
        public String planFinishTime;

        /**
         * <strong>example:</strong>
         * <p>3121</p>
         */
        @NameInMap("stalkerId")
        public Long stalkerId;

        @NameInMap("stalkerIsValid")
        public Integer stalkerIsValid;

        @NameInMap("stalkerName")
        public String stalkerName;

        /**
         * <strong>example:</strong>
         * <p>UNIMPROVED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        public GetProblemImprovementResponseBodyDataMeasureList setCheckUserIsValid(Integer checkUserIsValid) {
            this.checkUserIsValid = checkUserIsValid;
            return this;
        }
        public Integer getCheckUserIsValid() {
            return this.checkUserIsValid;
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

        public GetProblemImprovementResponseBodyDataMeasureList setDirectorIsValid(Integer directorIsValid) {
            this.directorIsValid = directorIsValid;
            return this;
        }
        public Integer getDirectorIsValid() {
            return this.directorIsValid;
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

        public GetProblemImprovementResponseBodyDataMeasureList setStalkerIsValid(Integer stalkerIsValid) {
            this.stalkerIsValid = stalkerIsValid;
            return this;
        }
        public Integer getStalkerIsValid() {
            return this.stalkerIsValid;
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
        @NameInMap("customProblemReason")
        public String customProblemReason;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("discoverSource")
        public String discoverSource;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("dutyDepartmentId")
        public String dutyDepartmentId;

        @NameInMap("dutyDepartmentName")
        public String dutyDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>231</p>
         */
        @NameInMap("dutyUserId")
        public Long dutyUserId;

        @NameInMap("dutyUserIsValid")
        public Long dutyUserIsValid;

        @NameInMap("dutyUserName")
        public String dutyUserName;

        /**
         * <strong>example:</strong>
         * <p>13098898****</p>
         */
        @NameInMap("dutyUserPhone")
        public String dutyUserPhone;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("injectionMode")
        public String injectionMode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isManual")
        public Boolean isManual;

        @NameInMap("measureList")
        public java.util.List<GetProblemImprovementResponseBodyDataMeasureList> measureList;

        /**
         * <strong>example:</strong>
         * <p>Zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        /**
         * <strong>example:</strong>
         * <p>231231</p>
         */
        @NameInMap("problemId")
        public String problemId;

        @NameInMap("problemReason")
        public String problemReason;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("recentActivity")
        public String recentActivity;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("recoveryMode")
        public String recoveryMode;

        @NameInMap("relationChanges")
        public String relationChanges;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>23123</p>
         */
        @NameInMap("replayDutyUserId")
        public Long replayDutyUserId;

        @NameInMap("replayDutyUserIsValid")
        public Long replayDutyUserIsValid;

        @NameInMap("replayDutyUserName")
        public String replayDutyUserName;

        /**
         * <strong>example:</strong>
         * <p>1308787****</p>
         */
        @NameInMap("replayDutyUserPhone")
        public String replayDutyUserPhone;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("userReport")
        public Long userReport;

        public static GetProblemImprovementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemImprovementResponseBodyData self = new GetProblemImprovementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemImprovementResponseBodyData setCustomProblemReason(String customProblemReason) {
            this.customProblemReason = customProblemReason;
            return this;
        }
        public String getCustomProblemReason() {
            return this.customProblemReason;
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

        public GetProblemImprovementResponseBodyData setDutyUserIsValid(Long dutyUserIsValid) {
            this.dutyUserIsValid = dutyUserIsValid;
            return this;
        }
        public Long getDutyUserIsValid() {
            return this.dutyUserIsValid;
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

        public GetProblemImprovementResponseBodyData setReplayDutyUserIsValid(Long replayDutyUserIsValid) {
            this.replayDutyUserIsValid = replayDutyUserIsValid;
            return this;
        }
        public Long getReplayDutyUserIsValid() {
            return this.replayDutyUserIsValid;
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
