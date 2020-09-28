// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class SubmitPidLoopEvaluationRequest extends TeaModel {
    @NameInMap("PidLoopIdList")
    @Validation(required = true)
    public java.util.Map<String, ?> pidLoopIdList;

    @NameInMap("PidProjectId")
    @Validation(required = true)
    public String pidProjectId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    public static SubmitPidLoopEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPidLoopEvaluationRequest self = new SubmitPidLoopEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPidLoopEvaluationRequest setPidLoopIdList(java.util.Map<String, ?> pidLoopIdList) {
        this.pidLoopIdList = pidLoopIdList;
        return this;
    }
    public java.util.Map<String, ?> getPidLoopIdList() {
        return this.pidLoopIdList;
    }

    public SubmitPidLoopEvaluationRequest setPidProjectId(String pidProjectId) {
        this.pidProjectId = pidProjectId;
        return this;
    }
    public String getPidProjectId() {
        return this.pidProjectId;
    }

    public SubmitPidLoopEvaluationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitPidLoopEvaluationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
