// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachDebugResultResponseBody extends TeaModel {
    @NameInMap("aliyunSubId")
    public String aliyunSubId;

    @NameInMap("dataId")
    public String dataId;

    @NameInMap("dataType")
    public Long dataType;

    @NameInMap("dialogueList")
    public java.util.List<GetAICoachDebugResultResponseBodyDialogueList> dialogueList;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("finishTime")
    public String finishTime;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptDebugId")
    public String scriptDebugId;

    @NameInMap("status")
    public Long status;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("taskId")
    public String taskId;

    @NameInMap("taskReport")
    public GetAICoachDebugResultResponseBodyTaskReport taskReport;

    public static GetAICoachDebugResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachDebugResultResponseBody self = new GetAICoachDebugResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachDebugResultResponseBody setAliyunSubId(String aliyunSubId) {
        this.aliyunSubId = aliyunSubId;
        return this;
    }
    public String getAliyunSubId() {
        return this.aliyunSubId;
    }

    public GetAICoachDebugResultResponseBody setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public GetAICoachDebugResultResponseBody setDataType(Long dataType) {
        this.dataType = dataType;
        return this;
    }
    public Long getDataType() {
        return this.dataType;
    }

    public GetAICoachDebugResultResponseBody setDialogueList(java.util.List<GetAICoachDebugResultResponseBodyDialogueList> dialogueList) {
        this.dialogueList = dialogueList;
        return this;
    }
    public java.util.List<GetAICoachDebugResultResponseBodyDialogueList> getDialogueList() {
        return this.dialogueList;
    }

    public GetAICoachDebugResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAICoachDebugResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAICoachDebugResultResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetAICoachDebugResultResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAICoachDebugResultResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAICoachDebugResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachDebugResultResponseBody setScriptDebugId(String scriptDebugId) {
        this.scriptDebugId = scriptDebugId;
        return this;
    }
    public String getScriptDebugId() {
        return this.scriptDebugId;
    }

    public GetAICoachDebugResultResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetAICoachDebugResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAICoachDebugResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAICoachDebugResultResponseBody setTaskReport(GetAICoachDebugResultResponseBodyTaskReport taskReport) {
        this.taskReport = taskReport;
        return this;
    }
    public GetAICoachDebugResultResponseBodyTaskReport getTaskReport() {
        return this.taskReport;
    }

    public static class GetAICoachDebugResultResponseBodyDialogueList extends TeaModel {
        @NameInMap("message")
        public String message;

        @NameInMap("role")
        public String role;

        public static GetAICoachDebugResultResponseBodyDialogueList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyDialogueList self = new GetAICoachDebugResultResponseBodyDialogueList();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyDialogueList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetAICoachDebugResultResponseBodyDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetAICoachDebugResultResponseBodyTaskReportDeductionRule extends TeaModel {
        @NameInMap("hit")
        public Boolean hit;

        @NameInMap("name")
        public String name;

        @NameInMap("reason")
        public java.util.List<String> reason;

        public static GetAICoachDebugResultResponseBodyTaskReportDeductionRule build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyTaskReportDeductionRule self = new GetAICoachDebugResultResponseBodyTaskReportDeductionRule();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyTaskReportDeductionRule setHit(Boolean hit) {
            this.hit = hit;
            return this;
        }
        public Boolean getHit() {
            return this.hit;
        }

        public GetAICoachDebugResultResponseBodyTaskReportDeductionRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachDebugResultResponseBodyTaskReportDeductionRule setReason(java.util.List<String> reason) {
            this.reason = reason;
            return this;
        }
        public java.util.List<String> getReason() {
            return this.reason;
        }

    }

    public static class GetAICoachDebugResultResponseBodyTaskReportExpressiveness extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("reason")
        public java.util.List<String> reason;

        @NameInMap("scoreRounds")
        public Integer scoreRounds;

        @NameInMap("status")
        public String status;

        @NameInMap("totalRounds")
        public Integer totalRounds;

        public static GetAICoachDebugResultResponseBodyTaskReportExpressiveness build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyTaskReportExpressiveness self = new GetAICoachDebugResultResponseBodyTaskReportExpressiveness();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness setReason(java.util.List<String> reason) {
            this.reason = reason;
            return this;
        }
        public java.util.List<String> getReason() {
            return this.reason;
        }

        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness setScoreRounds(Integer scoreRounds) {
            this.scoreRounds = scoreRounds;
            return this;
        }
        public Integer getScoreRounds() {
            return this.scoreRounds;
        }

        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness setTotalRounds(Integer totalRounds) {
            this.totalRounds = totalRounds;
            return this;
        }
        public Integer getTotalRounds() {
            return this.totalRounds;
        }

    }

    public static class GetAICoachDebugResultResponseBodyTaskReportPointAnswerList extends TeaModel {
        @NameInMap("reason")
        public java.util.List<String> reason;

        @NameInMap("status")
        public Long status;

        public static GetAICoachDebugResultResponseBodyTaskReportPointAnswerList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyTaskReportPointAnswerList self = new GetAICoachDebugResultResponseBodyTaskReportPointAnswerList();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyTaskReportPointAnswerList setReason(java.util.List<String> reason) {
            this.reason = reason;
            return this;
        }
        public java.util.List<String> getReason() {
            return this.reason;
        }

        public GetAICoachDebugResultResponseBodyTaskReportPointAnswerList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetAICoachDebugResultResponseBodyTaskReportPoint extends TeaModel {
        @NameInMap("answerList")
        public java.util.List<GetAICoachDebugResultResponseBodyTaskReportPointAnswerList> answerList;

        @NameInMap("name")
        public String name;

        public static GetAICoachDebugResultResponseBodyTaskReportPoint build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyTaskReportPoint self = new GetAICoachDebugResultResponseBodyTaskReportPoint();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyTaskReportPoint setAnswerList(java.util.List<GetAICoachDebugResultResponseBodyTaskReportPointAnswerList> answerList) {
            this.answerList = answerList;
            return this;
        }
        public java.util.List<GetAICoachDebugResultResponseBodyTaskReportPointAnswerList> getAnswerList() {
            return this.answerList;
        }

        public GetAICoachDebugResultResponseBodyTaskReportPoint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAICoachDebugResultResponseBodyTaskReport extends TeaModel {
        @NameInMap("deductionRule")
        public GetAICoachDebugResultResponseBodyTaskReportDeductionRule deductionRule;

        @NameInMap("expressiveness")
        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness expressiveness;

        @NameInMap("point")
        public GetAICoachDebugResultResponseBodyTaskReportPoint point;

        public static GetAICoachDebugResultResponseBodyTaskReport build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachDebugResultResponseBodyTaskReport self = new GetAICoachDebugResultResponseBodyTaskReport();
            return TeaModel.build(map, self);
        }

        public GetAICoachDebugResultResponseBodyTaskReport setDeductionRule(GetAICoachDebugResultResponseBodyTaskReportDeductionRule deductionRule) {
            this.deductionRule = deductionRule;
            return this;
        }
        public GetAICoachDebugResultResponseBodyTaskReportDeductionRule getDeductionRule() {
            return this.deductionRule;
        }

        public GetAICoachDebugResultResponseBodyTaskReport setExpressiveness(GetAICoachDebugResultResponseBodyTaskReportExpressiveness expressiveness) {
            this.expressiveness = expressiveness;
            return this;
        }
        public GetAICoachDebugResultResponseBodyTaskReportExpressiveness getExpressiveness() {
            return this.expressiveness;
        }

        public GetAICoachDebugResultResponseBodyTaskReport setPoint(GetAICoachDebugResultResponseBodyTaskReportPoint point) {
            this.point = point;
            return this;
        }
        public GetAICoachDebugResultResponseBodyTaskReportPoint getPoint() {
            return this.point;
        }

    }

}
