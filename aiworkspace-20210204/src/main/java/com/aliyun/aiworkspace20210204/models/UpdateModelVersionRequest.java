// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelVersionRequest extends TeaModel {
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    @NameInMap("Metrics")
    public java.util.Map<String, ?> metrics;

    @NameInMap("Options")
    public String options;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    @NameInMap("VersionDescription")
    public String versionDescription;

    public static UpdateModelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelVersionRequest self = new UpdateModelVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelVersionRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public UpdateModelVersionRequest setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public UpdateModelVersionRequest setMetrics(java.util.Map<String, ?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    public UpdateModelVersionRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public UpdateModelVersionRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public UpdateModelVersionRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateModelVersionRequest setTrainingSpec(java.util.Map<String, ?> trainingSpec) {
        this.trainingSpec = trainingSpec;
        return this;
    }
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    public UpdateModelVersionRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

}
