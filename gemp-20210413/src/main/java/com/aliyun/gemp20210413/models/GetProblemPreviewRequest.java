// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemPreviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840f13812</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("effectServiceIds")
    public java.util.List<Long> effectServiceIds;

    /**
     * <strong>example:</strong>
     * <p>213123</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("problemId")
    public Long problemId;

    /**
     * <strong>example:</strong>
     * <p>P2</p>
     */
    @NameInMap("problemLevel")
    public String problemLevel;

    /**
     * <strong>example:</strong>
     * <p>PROBLEM_NOTIFY</p>
     */
    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    /**
     * <strong>example:</strong>
     * <p>21312</p>
     */
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    public static GetProblemPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPreviewRequest self = new GetProblemPreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemPreviewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetProblemPreviewRequest setEffectServiceIds(java.util.List<Long> effectServiceIds) {
        this.effectServiceIds = effectServiceIds;
        return this;
    }
    public java.util.List<Long> getEffectServiceIds() {
        return this.effectServiceIds;
    }

    public GetProblemPreviewRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public GetProblemPreviewRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public GetProblemPreviewRequest setProblemLevel(String problemLevel) {
        this.problemLevel = problemLevel;
        return this;
    }
    public String getProblemLevel() {
        return this.problemLevel;
    }

    public GetProblemPreviewRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public GetProblemPreviewRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public GetProblemPreviewRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

}
