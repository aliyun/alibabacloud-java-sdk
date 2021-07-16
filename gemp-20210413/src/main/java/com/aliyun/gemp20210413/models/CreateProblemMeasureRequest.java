// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemMeasureRequest extends TeaModel {
    // 措施类型
    @NameInMap("type")
    public Integer type;

    // 故障Id
    @NameInMap("problemId")
    public Long problemId;

    // 措施内容
    @NameInMap("content")
    public String content;

    // 验收标准
    @NameInMap("checkStandard")
    public String checkStandard;

    // 验收人id
    @NameInMap("checkUserId")
    public Long checkUserId;

    // 计划完成时间
    @NameInMap("planFinishTime")
    public String planFinishTime;

    // 负责人id
    @NameInMap("directorId")
    public Long directorId;

    // 跟踪人id
    @NameInMap("stalkerId")
    public Long stalkerId;

    // 状态 IMPROVED 改进 2 未改进UNIMPROVED
    @NameInMap("status")
    public String status;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemMeasureRequest self = new CreateProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemMeasureRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateProblemMeasureRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemMeasureRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public CreateProblemMeasureRequest setPlanFinishTime(String planFinishTime) {
        this.planFinishTime = planFinishTime;
        return this;
    }
    public String getPlanFinishTime() {
        return this.planFinishTime;
    }

    public CreateProblemMeasureRequest setDirectorId(Long directorId) {
        this.directorId = directorId;
        return this;
    }
    public Long getDirectorId() {
        return this.directorId;
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

    public CreateProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
