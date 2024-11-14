// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachTaskSessionReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>2024-11-08 09:33:21</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("evaluationResult")
    public String evaluationResult;

    /**
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptName")
    public String scriptName;

    /**
     * <strong>example:</strong>
     * <p>2024-10-11 09:58:01</p>
     */
    @NameInMap("startTime")
    public String startTime;

    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1276673855116835</p>
     */
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

    public GetAICoachTaskSessionReportResponseBody setEvaluationResult(String evaluationResult) {
        this.evaluationResult = evaluationResult;
        return this;
    }
    public String getEvaluationResult() {
        return this.evaluationResult;
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
