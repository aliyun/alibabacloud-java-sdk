// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishIncidentRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("incidentFinishReason")
    public Integer incidentFinishReason;

    @NameInMap("incidentFinishReasonDescription")
    public String incidentFinishReasonDescription;

    @NameInMap("incidentFinishSolution")
    public Integer incidentFinishSolution;

    @NameInMap("incidentFinishSolutionDescription")
    public String incidentFinishSolutionDescription;

    @NameInMap("incidentIds")
    public java.util.List<Long> incidentIds;

    public static FinishIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishIncidentRequest self = new FinishIncidentRequest();
        return TeaModel.build(map, self);
    }

    public FinishIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishIncidentRequest setIncidentFinishReason(Integer incidentFinishReason) {
        this.incidentFinishReason = incidentFinishReason;
        return this;
    }
    public Integer getIncidentFinishReason() {
        return this.incidentFinishReason;
    }

    public FinishIncidentRequest setIncidentFinishReasonDescription(String incidentFinishReasonDescription) {
        this.incidentFinishReasonDescription = incidentFinishReasonDescription;
        return this;
    }
    public String getIncidentFinishReasonDescription() {
        return this.incidentFinishReasonDescription;
    }

    public FinishIncidentRequest setIncidentFinishSolution(Integer incidentFinishSolution) {
        this.incidentFinishSolution = incidentFinishSolution;
        return this;
    }
    public Integer getIncidentFinishSolution() {
        return this.incidentFinishSolution;
    }

    public FinishIncidentRequest setIncidentFinishSolutionDescription(String incidentFinishSolutionDescription) {
        this.incidentFinishSolutionDescription = incidentFinishSolutionDescription;
        return this;
    }
    public String getIncidentFinishSolutionDescription() {
        return this.incidentFinishSolutionDescription;
    }

    public FinishIncidentRequest setIncidentIds(java.util.List<Long> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }
    public java.util.List<Long> getIncidentIds() {
        return this.incidentIds;
    }

}
