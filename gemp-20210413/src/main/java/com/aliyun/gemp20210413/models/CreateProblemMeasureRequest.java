// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemMeasureRequest extends TeaModel {
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

    public static CreateProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemMeasureRequest self = new CreateProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemMeasureRequest setCheckStandard(String checkStandard) {
        this.checkStandard = checkStandard;
        return this;
    }
    public String getCheckStandard() {
        return this.checkStandard;
    }

    public CreateProblemMeasureRequest setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
        return this;
    }
    public Long getCheckUserId() {
        return this.checkUserId;
    }

    public CreateProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemMeasureRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateProblemMeasureRequest setDirectorId(Long directorId) {
        this.directorId = directorId;
        return this;
    }
    public Long getDirectorId() {
        return this.directorId;
    }

    public CreateProblemMeasureRequest setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
        return this;
    }
    public String getPlanFinishTime() {
        return this.planFinishTime;
    }

    public CreateProblemMeasureRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemMeasureRequest setStalkerId(Long stalkerId) {
        this.stalkerId = stalkerId;
        return this;
    }
    public Long getStalkerId() {
        return this.stalkerId;
    }

    public CreateProblemMeasureRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateProblemMeasureRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
