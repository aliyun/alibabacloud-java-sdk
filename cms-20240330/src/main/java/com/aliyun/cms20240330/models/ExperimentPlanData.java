// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExperimentPlanData extends TeaModel {
    @NameInMap("createdAt")
    public Long createdAt;

    @NameInMap("datasetId")
    public String datasetId;

    @NameInMap("description")
    public String description;

    @NameInMap("experimentCount")
    public Integer experimentCount;

    @NameInMap("planId")
    public String planId;

    @NameInMap("planName")
    public String planName;

    @NameInMap("status")
    public String status;

    @NameInMap("updatedAt")
    public Long updatedAt;

    public static ExperimentPlanData build(java.util.Map<String, ?> map) throws Exception {
        ExperimentPlanData self = new ExperimentPlanData();
        return TeaModel.build(map, self);
    }

    public ExperimentPlanData setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public ExperimentPlanData setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ExperimentPlanData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExperimentPlanData setExperimentCount(Integer experimentCount) {
        this.experimentCount = experimentCount;
        return this;
    }
    public Integer getExperimentCount() {
        return this.experimentCount;
    }

    public ExperimentPlanData setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ExperimentPlanData setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public ExperimentPlanData setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExperimentPlanData setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
