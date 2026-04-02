// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ModelVersion extends TeaModel {
    /**
     * <p>The approval status. Valid values:</p>
     * <ul>
     * <li>Pending</li>
     * <li>Approved</li>
     * <li>Rejected</li>
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
     * <p>The time when the model was created, in UTC. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the model was last modified, in UTC. The time follows the ISO 8601 standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The inference configurations applied to the downstream, such as the configuration of the processor or container of Elastic Algorithm Service (EAS). Example: <code>{ &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <p>The labels.</p>
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
     * <p>The extended field. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>155770209******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li>If the source type is Custom, this field is not limited.</li>
     * <li>If the source type is PAIFlow or TrainingService, the format is:</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>region is the ID of the Alibaba Cloud region. workspacceId is the ID of the workspace. kind is the type. Valid values: PipelineRun (PAIFlow pipeline) and ServiceJob (training service). id is the unique identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the model. Default value: Custom.</p>
     * <ul>
     * <li>Custom</li>
     * <li>PAIFlow</li>
     * <li>TrainingService</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The training configuration, used for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The URI of the model version, which is the location where the model is stored. The value can be the HTTP(S) address of the model, such as <code>https://myweb.com/mymodel.tar.gz</code>. If the model is stored in an Object Storage Service (OSS) bucket, the value is in the <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code> format. The endpoint can be queried in the OSS console, such as <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</p>
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
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The model version, which is unique for the model. If you leave this parameter empty, <code>0.1.0</code> is the first version by default. Then, the minor version number incremented by 1 is used as the second version <code>0.2.0</code>.</p>
     * <p>The version consists of a major version number, a minor version number, and a patch version number. The version numbers are separated with periods (<code>.</code>). The major and minor version numbers are digits, and the patch version number starts with a digit followed by an underscore (<code>_</code>) and a letter. such as 1.1.0 or 2.3.4_beta.</p>
     * <p>Regular expression: <code>&quot;^\\\\d+\\\\.\\\\d+\\\\.\\\\d+(_\\\\w+)?$&quot;</code></p>
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
