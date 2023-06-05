// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionRequest extends TeaModel {
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    @NameInMap("FormatType")
    public String formatType;

    @NameInMap("FrameworkType")
    public String frameworkType;

    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

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

    @NameInMap("Uri")
    public String uri;

    @NameInMap("VersionDescription")
    public String versionDescription;

    @NameInMap("VersionName")
    public String versionName;

    public static CreateModelVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionRequest self = new CreateModelVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public CreateModelVersionRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public CreateModelVersionRequest setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public CreateModelVersionRequest setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public CreateModelVersionRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateModelVersionRequest setMetrics(java.util.Map<String, ?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    public CreateModelVersionRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateModelVersionRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateModelVersionRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateModelVersionRequest setTrainingSpec(java.util.Map<String, ?> trainingSpec) {
        this.trainingSpec = trainingSpec;
        return this;
    }
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    public CreateModelVersionRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public CreateModelVersionRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public CreateModelVersionRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
