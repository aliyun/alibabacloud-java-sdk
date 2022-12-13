// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemMeasureRequest extends TeaModel {
    @NameInMap("checkStandard")
    public String checkStandard;

    @NameInMap("checkUserId")
    public Long checkUserId;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("content")
    public String content;

    @NameInMap("directorId")
    public Long directorId;

    @NameInMap("measureId")
    public Long measureId;

    @NameInMap("planFinishTime")
    public String planFinishTime;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("stalkerId")
    public Long stalkerId;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    public Integer type;

    public static UpdateProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemMeasureRequest self = new UpdateProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemMeasureRequest setCheckStandard(String checkStandard) {
        this.checkStandard = checkStandard;
        return this;
    }
    public String getCheckStandard() {
        return this.checkStandard;
    }

    public UpdateProblemMeasureRequest setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
        return this;
    }
    public Long getCheckUserId() {
        return this.checkUserId;
    }

    public UpdateProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemMeasureRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateProblemMeasureRequest setDirectorId(Long directorId) {
        this.directorId = directorId;
        return this;
    }
    public Long getDirectorId() {
        return this.directorId;
    }

    public UpdateProblemMeasureRequest setMeasureId(Long measureId) {
        this.measureId = measureId;
        return this;
    }
    public Long getMeasureId() {
        return this.measureId;
    }

    public UpdateProblemMeasureRequest setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
        return this;
    }
    public String getPlanFinishTime() {
        return this.planFinishTime;
    }

    public UpdateProblemMeasureRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemMeasureRequest setStalkerId(Long stalkerId) {
        this.stalkerId = stalkerId;
        return this;
    }
    public Long getStalkerId() {
        return this.stalkerId;
    }

    public UpdateProblemMeasureRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateProblemMeasureRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
