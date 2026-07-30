// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ModelVersion extends TeaModel {
    /**
     * <p>The approval status. Valid values:</p>
     * <ul>
     * <li>Pending: pending.</li>
     * <li>Approved: approved for going live.</li>
     * <li>Rejected: not approved for going live.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The compression configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CompressionSpec")
    public java.util.Map<String, ?> compressionSpec;

    /**
     * <p>The distillation configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DistillationSpec")
    public java.util.Map<String, ?> distillationSpec;

    /**
     * <p>The evaluation configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EvaluationSpec")
    public java.util.Map<String, ?> evaluationSpec;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;CoverUris&quot;: [&quot;<a href="https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png%22%5D">https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png&quot;]</a>,
     *     &quot;TrainedWords&quot;: [&quot;albedo_overlord&quot;]
     * }</p>
     */
    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <p>The model format.</p>
     * <ul>
     * <li>OfflineModel</li>
     * <li>SavedModel</li>
     * <li>Keras H5</li>
     * <li>Frozen Pb</li>
     * <li>Caffe Prototxt</li>
     * <li>TorchScript</li>
     * <li>XGBoost</li>
     * <li>PMML</li>
     * <li>AlinkModel</li>
     * <li>ONNX</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SavedModel</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The model framework.</p>
     * <ul>
     * <li>Pytorch</li>
     * <li>XGBoost</li>
     * <li>Keras</li>
     * <li>Caffe</li>
     * <li>Alink</li>
     * <li>Xflow</li>
     * <li>TensorFlow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TensorFlow</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The UTC time of model creation, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The UTC time when the model was last updated, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Describes how to apply the model to downstream inference applications, such as specifying the EAS processor or container. Example:
     * <code>{     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <p>The label list.</p>
     */
    @NameInMap("Labels")
    public java.util.List<ModelVersionLabels> labels;

    /**
     * <p>The model metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;Results&quot;: [{
     *     &quot;Dataset&quot;: {
     *       &quot;DatasetId&quot;: &quot;d-sdkjanksaklerhfd&quot;
     *     },
     *     &quot;Metrics&quot;: {
     *       &quot;cer&quot;: 0.175
     *     }
     *   }, {
     *     &quot;Dataset&quot;: {
     *       &quot;Uri&quot;: &quot;oss://xxxx/&quot;
     *     },
     *     &quot;Metrics&quot;: {
     *       &quot;cer&quot;: 0.172
     *     }
     *   }]
     * }</p>
     */
    @NameInMap("Metrics")
    public java.util.Map<String, ?> metrics;

    /**
     * <p>The extended fields. JsonString type.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>155770209******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li><p>If the source type is Custom, this field has no restrictions.</p>
     * </li>
     * <li><p>If the source type is PAIFlow or TrainingService, the format is:</p>
     * </li>
     * </ul>
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>region is the Alibaba Cloud region ID. workspaceId is the workspace ID. kind specifies the type. Valid values: PipelineRun (PAI workflow) and ServiceJob (training service). id is the unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The model source type. Default value: Custom.</p>
     * <ul>
     * <li>Custom: custom.</li>
     * <li>PAIFlow: PAI workflow.</li>
     * <li>TrainingService: PAI training service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The training configuration. Used for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The model version URI, which specifies the model storage location. This can be an HTTP(S) address of the model, such as <code>https://myweb.com/mymodel.tar.gz</code>. If the model is stored in OSS, the format is <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code>. You can query the endpoint in the OSS console. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>155770209******</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The model version description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment analysis</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The model version, unique within the model. If not specified, the first version defaults to <code>0.1.0</code>, and subsequent versions increment the minor version number by 1. For example, the second version defaults to <code>0.2.0</code>.</p>
     * <p>The version number consists of a major version number, a minor version number, and a stage version number, separated by <code>.</code>. The major and minor version numbers are numeric. The stage version number starts with a digit, followed by <code>_</code> and letters. Examples: 1.1.0 or 2.3.4_beta.</p>
     * <p>Regular expression reference: <code>&quot;^\\d+\\.\\d+\\.\\d+(_\\w+)?$&quot;</code></p>
     * 
     * <strong>example:</strong>
     * <p>0.1.0</p>
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
        /**
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
