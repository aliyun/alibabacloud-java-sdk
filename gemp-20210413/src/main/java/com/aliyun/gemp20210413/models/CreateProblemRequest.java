// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemRequest extends TeaModel {
    @NameInMap("affectServiceIds")
    public java.util.List<Long> affectServiceIds;

    /**
     * <strong>example:</strong>
     * <p>E789D869-DB13-4913-BAA8-A1F56F94B94D</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>2020-10-02 00:00:00</p>
     */
    @NameInMap("discoverTime")
    public String discoverTime;

    /**
     * <strong>example:</strong>
     * <p>123221</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

    /**
     * <strong>example:</strong>
     * <p>32121</p>
     */
    @NameInMap("mainHandlerId")
    public Long mainHandlerId;

    /**
     * <strong>example:</strong>
     * <p>初步原因</p>
     */
    @NameInMap("preliminaryReason")
    public String preliminaryReason;

    /**
     * <strong>example:</strong>
     * <p>P2</p>
     */
    @NameInMap("problemLevel")
    public String problemLevel;

    /**
     * <strong>example:</strong>
     * <p>故障A</p>
     */
    @NameInMap("problemName")
    public String problemName;

    /**
     * <strong>example:</strong>
     * <p>PROBLEM_NOTIFY</p>
     */
    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    /**
     * <strong>example:</strong>
     * <p>HANDLING</p>
     */
    @NameInMap("problemStatus")
    public String problemStatus;

    /**
     * <strong>example:</strong>
     * <p>进展摘要</p>
     */
    @NameInMap("progressSummary")
    public String progressSummary;

    /**
     * <strong>example:</strong>
     * <p>343</p>
     */
    @NameInMap("progressSummaryRichTextId")
    public Long progressSummaryRichTextId;

    /**
     * <strong>example:</strong>
     * <p>2020-10-02 00:00:00</p>
     */
    @NameInMap("recoveryTime")
    public String recoveryTime;

    /**
     * <strong>example:</strong>
     * <p>123122</p>
     */
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static CreateProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemRequest self = new CreateProblemRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemRequest setAffectServiceIds(java.util.List<Long> affectServiceIds) {
        this.affectServiceIds = affectServiceIds;
        return this;
    }
    public java.util.List<Long> getAffectServiceIds() {
        return this.affectServiceIds;
    }

    public CreateProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemRequest setDiscoverTime(String discoverTime) {
        this.discoverTime = discoverTime;
        return this;
    }
    public String getDiscoverTime() {
        return this.discoverTime;
    }

    public CreateProblemRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public CreateProblemRequest setMainHandlerId(Long mainHandlerId) {
        this.mainHandlerId = mainHandlerId;
        return this;
    }
    public Long getMainHandlerId() {
        return this.mainHandlerId;
    }

    public CreateProblemRequest setPreliminaryReason(String preliminaryReason) {
        this.preliminaryReason = preliminaryReason;
        return this;
    }
    public String getPreliminaryReason() {
        return this.preliminaryReason;
    }

    public CreateProblemRequest setProblemLevel(String problemLevel) {
        this.problemLevel = problemLevel;
        return this;
    }
    public String getProblemLevel() {
        return this.problemLevel;
    }

    public CreateProblemRequest setProblemName(String problemName) {
        this.problemName = problemName;
        return this;
    }
    public String getProblemName() {
        return this.problemName;
    }

    public CreateProblemRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public CreateProblemRequest setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
        return this;
    }
    public String getProblemStatus() {
        return this.problemStatus;
    }

    public CreateProblemRequest setProgressSummary(String progressSummary) {
        this.progressSummary = progressSummary;
        return this;
    }
    public String getProgressSummary() {
        return this.progressSummary;
    }

    public CreateProblemRequest setProgressSummaryRichTextId(Long progressSummaryRichTextId) {
        this.progressSummaryRichTextId = progressSummaryRichTextId;
        return this;
    }
    public Long getProgressSummaryRichTextId() {
        return this.progressSummaryRichTextId;
    }

    public CreateProblemRequest setRecoveryTime(String recoveryTime) {
        this.recoveryTime = recoveryTime;
        return this;
    }
    public String getRecoveryTime() {
        return this.recoveryTime;
    }

    public CreateProblemRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public CreateProblemRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
