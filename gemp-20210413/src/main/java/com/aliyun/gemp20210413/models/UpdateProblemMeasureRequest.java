// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemMeasureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("checkStandard")
    public String checkStandard;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("checkUserId")
    public Long checkUserId;

    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3812</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("directorId")
    public Long directorId;

    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("measureId")
    public Long measureId;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21 00:00:00</p>
     */
    @NameInMap("planFinishTime")
    public String planFinishTime;

    /**
     * <strong>example:</strong>
     * <p>1233</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("stalkerId")
    public Long stalkerId;

    /**
     * <strong>example:</strong>
     * <p>UNIMPROVED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
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
