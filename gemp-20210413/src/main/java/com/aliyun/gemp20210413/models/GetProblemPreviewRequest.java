// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemPreviewRequest extends TeaModel {
    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    // 通告类型
    @NameInMap("problemNotifyType")
    public String problemNotifyType;

    // 故障等级
    @NameInMap("problemLevel")
    public String problemLevel;

    // 影响服务
    @NameInMap("effectServiceIds")
    public java.util.List<Long> effectServiceIds;

    // 所属服务
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    // 事件Id
    @NameInMap("incidentId")
    public Long incidentId;

    // 应急协同组
    @NameInMap("serviceGroupIds")
    public java.util.List<Long> serviceGroupIds;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    public static GetProblemPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemPreviewRequest self = new GetProblemPreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemPreviewRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public GetProblemPreviewRequest setProblemNotifyType(String problemNotifyType) {
        this.problemNotifyType = problemNotifyType;
        return this;
    }
    public String getProblemNotifyType() {
        return this.problemNotifyType;
    }

    public GetProblemPreviewRequest setProblemLevel(String problemLevel) {
        this.problemLevel = problemLevel;
        return this;
    }
    public String getProblemLevel() {
        return this.problemLevel;
    }

    public GetProblemPreviewRequest setEffectServiceIds(java.util.List<Long> effectServiceIds) {
        this.effectServiceIds = effectServiceIds;
        return this;
    }
    public java.util.List<Long> getEffectServiceIds() {
        return this.effectServiceIds;
    }

    public GetProblemPreviewRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public GetProblemPreviewRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public GetProblemPreviewRequest setServiceGroupIds(java.util.List<Long> serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public java.util.List<Long> getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public GetProblemPreviewRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
