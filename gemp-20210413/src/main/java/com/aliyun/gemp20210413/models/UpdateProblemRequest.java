// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateProblemRequest extends TeaModel {
    @NameInMap("feedback")
    public String feedback;

    @NameInMap("level")
    public String level;

    @NameInMap("mainHandlerId")
    public Long mainHandlerId;

    @NameInMap("preliminaryReason")
    public String preliminaryReason;

    @NameInMap("problemId")
    public Long problemId;

    @NameInMap("problemName")
    public String problemName;

    @NameInMap("progressSummary")
    public String progressSummary;

    @NameInMap("progressSummaryRichTextId")
    public Long progressSummaryRichTextId;

    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static UpdateProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProblemRequest self = new UpdateProblemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProblemRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateProblemRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public UpdateProblemRequest setMainHandlerId(Long mainHandlerId) {
        this.mainHandlerId = mainHandlerId;
        return this;
    }
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    public UpdateProblemRequest setPreliminaryReason(String preliminaryReason) {
        this.preliminaryReason = preliminaryReason;
        return this;
    }
    public String getPreliminaryReason() {
        return this.preliminaryReason;
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

    public UpdateProblemRequest setProgressSummary(String progressSummary) {
        this.progressSummary = progressSummary;
        return this;
    }
    public String getProgressSummary() {
        return this.progressSummary;
    }

    public UpdateProblemRequest setProgressSummaryRichTextId(Long progressSummaryRichTextId) {
        this.progressSummaryRichTextId = progressSummaryRichTextId;
        return this;
    }
    public Long getProgressSummaryRichTextId() {
        return this.progressSummaryRichTextId;
    }

    public UpdateProblemRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public UpdateProblemRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
