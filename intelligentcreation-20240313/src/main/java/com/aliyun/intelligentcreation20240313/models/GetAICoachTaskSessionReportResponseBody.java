// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionReportResponseBody extends TeaModel {
    @NameInMap("duration")
    public Long duration;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("evaluationRating")
    public String evaluationRating;

    @NameInMap("evaluationResult")
    public String evaluationResult;

    @NameInMap("extendCustomNameMap")
    public java.util.Map<String, String> extendCustomNameMap;

    @NameInMap("feedback")
    public Boolean feedback;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptName")
    public String scriptName;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("status")
    public String status;

    @NameInMap("uid")
    public String uid;

    public static GetAICoachTaskSessionReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachTaskSessionReportResponseBody self = new GetAICoachTaskSessionReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachTaskSessionReportResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetAICoachTaskSessionReportResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAICoachTaskSessionReportResponseBody setEvaluationRating(String evaluationRating) {
        this.evaluationRating = evaluationRating;
        return this;
    }
    public String getEvaluationRating() {
        return this.evaluationRating;
    }

    public GetAICoachTaskSessionReportResponseBody setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }
    public String getEvaluationResult() {
        return this.evaluationResult;
    }

    public GetAICoachTaskSessionReportResponseBody setExtendCustomNameMap(java.util.Map<String, String> extendCustomNameMap) {
        this.extendCustomNameMap = extendCustomNameMap;
        return this;
    }
    public java.util.Map<String, String> getExtendCustomNameMap() {
        return this.extendCustomNameMap;
    }

    public GetAICoachTaskSessionReportResponseBody setFeedback(Boolean feedback) {
        this.feedback = feedback;
        return this;
    }
    public Boolean getFeedback() {
        return this.feedback;
    }

    public GetAICoachTaskSessionReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachTaskSessionReportResponseBody setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public GetAICoachTaskSessionReportResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetAICoachTaskSessionReportResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAICoachTaskSessionReportResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
