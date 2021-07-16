// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemRequest extends TeaModel {
    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    // 故障名
    @NameInMap("problemName")
    public String problemName;

    // 故障等级
    @NameInMap("level")
    public String level;

    // 所属服务
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 进展摘要
    @NameInMap("progressSummary")
    public String progressSummary;

    // 初步原因
    @NameInMap("preliminaryReason")
    public String preliminaryReason;

    // 主要处理人
    @NameInMap("mainHandlerId")
    public Long mainHandlerId;

    // 舆情反馈
    @NameInMap("feedback")
    public String feedback;

    // 应急协同组
    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static UpdateProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemRequest self = new UpdateProblemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public UpdateProblemRequest setProblemName(String problemName) {
        this.problemName = problemName;
        return this;
    }
    public String getProblemName() {
        return this.problemName;
    }

    public UpdateProblemRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public UpdateProblemRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public UpdateProblemRequest setProgressSummary(String progressSummary) {
        this.progressSummary = progressSummary;
        return this;
    }
    public String getProgressSummary() {
        return this.progressSummary;
    }

    public UpdateProblemRequest setPreliminaryReason(String preliminaryReason) {
        this.preliminaryReason = preliminaryReason;
        return this;
    }
    public String getPreliminaryReason() {
        return this.preliminaryReason;
    }

    public UpdateProblemRequest setMainHandlerId(Long mainHandlerId) {
        this.mainHandlerId = mainHandlerId;
        return this;
    }
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    public UpdateProblemRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateProblemRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
