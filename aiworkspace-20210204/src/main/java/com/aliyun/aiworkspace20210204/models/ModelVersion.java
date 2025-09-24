// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ModelVersion extends TeaModel {
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    @NameInMap("CompressionSpec")
    public java.util.Map<String, ?> compressionSpec;

    @NameInMap("DistillationSpec")
    public java.util.Map<String, ?> distillationSpec;

    @NameInMap("EvaluationSpec")
    public java.util.Map<String, ?> evaluationSpec;

    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <strong>example:</strong>
     * <p>SavedModel</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <strong>example:</strong>
     * <p>TensorFlow</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    @NameInMap("Labels")
    public java.util.List<ModelVersionLabels> labels;

    @NameInMap("Metrics")
    public java.util.Map<String, ?> metrics;

    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>155770209******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <strong>example:</strong>
     * <p>oss://bucket/path-to-model</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <strong>example:</strong>
     * <p>155770209******</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static ModelVersion build(java.util.Map<String, ?> map) throws Exception {
        ModelVersion self = new ModelVersion();
        return TeaModel.build(map, self);
    }

    public ModelVersion setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public ModelVersion setCompressionSpec(java.util.Map<String, ?> compressionSpec) {
        this.compressionSpec = compressionSpec;
        return this;
    }
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    public ModelVersion setDistillationSpec(java.util.Map<String, ?> distillationSpec) {
        this.distillationSpec = distillationSpec;
        return this;
    }
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    public ModelVersion setEvaluationSpec(java.util.Map<String, ?> evaluationSpec) {
        this.evaluationSpec = evaluationSpec;
        return this;
    }
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    public ModelVersion setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public ModelVersion setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public ModelVersion setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public ModelVersion setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ModelVersion setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ModelVersion setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public ModelVersion setLabels(java.util.List<ModelVersionLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ModelVersionLabels> getLabels() {
        return this.labels;
    }

    public ModelVersion setMetrics(java.util.Map<String, ?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    public ModelVersion setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public ModelVersion setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ModelVersion setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ModelVersion setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ModelVersion setTrainingSpec(java.util.Map<String, ?> trainingSpec) {
        this.trainingSpec = trainingSpec;
        return this;
    }
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    public ModelVersion setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public ModelVersion setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ModelVersion setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public ModelVersion setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class ModelVersionLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModelVersionLabels build(java.util.Map<String, ?> map) throws Exception {
            ModelVersionLabels self = new ModelVersionLabels();
            return TeaModel.build(map, self);
        }

        public ModelVersionLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModelVersionLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
