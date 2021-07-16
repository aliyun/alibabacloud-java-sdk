// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemMeasureRequest extends TeaModel {
    // 措施类型 码表 PROBLEM_REPLAY_IMPROVEMENT
    @NameInMap("type")
    public Integer type;

    // 措施内容
    @NameInMap("content")
    public String content;

    // 验收标准
    @NameInMap("checkStandard")
    public String checkStandard;

    // 验收人id
    @NameInMap("checkUserId")
    public Long checkUserId;

    // 负责人id
    @NameInMap("directorId")
    public Long directorId;

    // 跟踪人id
    @NameInMap("stalkerId")
    public Long stalkerId;

    // 计划完成时间
    @NameInMap("planFinishTime")
    public String planFinishTime;

    // 措施Id
    @NameInMap("measureId")
    public Long measureId;

    // 状态 IMPROVED 改进 2 未改进UNIMPROVED
    @NameInMap("status")
    public String status;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    // 故障Id
    @NameInMap("problemId")
    public Long problemId;

    public static UpdateProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemMeasureRequest self = new UpdateProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemMeasureRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public UpdateProblemMeasureRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public UpdateProblemMeasureRequest setDirectorId(Long directorId) {
        this.directorId = directorId;
        return this;
    }
    public Long getDirectorId() {
        return this.directorId;
    }

    public UpdateProblemMeasureRequest setStalkerId(Long stalkerId) {
        this.stalkerId = stalkerId;
        return this;
    }
    public Long getStalkerId() {
        return this.stalkerId;
    }

    public UpdateProblemMeasureRequest setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
        return this;
    }
    public String getPlanFinishTime() {
        return this.planFinishTime;
    }

    public UpdateProblemMeasureRequest setMeasureId(Long measureId) {
        this.measureId = measureId;
        return this;
    }
    public Long getMeasureId() {
        return this.measureId;
    }

    public UpdateProblemMeasureRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProblemMeasureRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
