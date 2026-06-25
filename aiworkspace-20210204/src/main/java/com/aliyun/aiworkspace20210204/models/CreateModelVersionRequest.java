// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionRequest extends TeaModel {
    /**
     * <p>The approval status. Valid values:</p>
     * <ul>
     * <li><p>Pending: The version is pending approval.</p>
     * </li>
     * <li><p>Approved: The version is approved for deployment.</p>
     * </li>
     * <li><p>Rejected: The version is rejected for deployment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    /**
     * <p>The compression configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CompressionSpec")
    public java.util.Map<String, ?> compressionSpec;

    /**
     * <p>The distillation configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("DistillationSpec")
    public java.util.Map<String, ?> distillationSpec;

    /**
     * <p>The evaluation configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("EvaluationSpec")
    public java.util.Map<String, ?> evaluationSpec;

    /**
     * <p>Other information.</p>
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
     * <p>The format of the model. Valid values:</p>
     * <ul>
     * <li><p>OfflineModel</p>
     * </li>
     * <li><p>SavedModel</p>
     * </li>
     * <li><p>Keras H5</p>
     * </li>
     * <li><p>Frozen Pb</p>
     * </li>
     * <li><p>Caffe Prototxt</p>
     * </li>
     * <li><p>TorchScript</p>
     * </li>
     * <li><p>XGBoost</p>
     * </li>
     * <li><p>PMML</p>
     * </li>
     * <li><p>AlinkModel</p>
     * </li>
     * <li><p>ONNX</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SavedModel</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>The framework of the model. Valid values:</p>
     * <ul>
     * <li><p>Pytorch</p>
     * </li>
     * <li><p>XGBoost</p>
     * </li>
     * <li><p>Keras</p>
     * </li>
     * <li><p>Caffe</p>
     * </li>
     * <li><p>Alink</p>
     * </li>
     * <li><p>Xflow</p>
     * </li>
     * <li><p>TensorFlow</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TensorFlow</p>
     */
    @NameInMap("FrameworkType")
    public String frameworkType;

    /**
     * <p>The configurations for downstream inference services, such as the processor and container for Elastic Algorithm Service (EAS). Example:
     * <code>{ &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code></p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The model metrics.
     * The serialized data cannot exceed 8,192 bytes in length.</p>
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
     * <p>The extended fields. This parameter is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li><p>If SourceType is set to Custom, this parameter has no format restrictions.</p>
     * </li>
     * <li><p>If SourceType is PAIFlow or TrainingService, the value must be in the following format:</p>
     * </li>
     * </ul>
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>The fields are described as follows:</p>
     * <ul>
     * <li><p>region: The ID of the Alibaba Cloud region.</p>
     * </li>
     * <li><p>workspaceId: The ID of the workspace.</p>
     * </li>
     * <li><p>kind: The type. Valid values: PipelineRun (PAI pipeline) and ServiceJob (training service).</p>
     * </li>
     * <li><p>id: The unique identifier.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the model. Valid values:</p>
     * <ul>
     * <li><p>Custom (default): The model is custom.</p>
     * </li>
     * <li><p>PAIFlow: The model is from a PAI pipeline.</p>
     * </li>
     * <li><p>TrainingService: The model is from a PAI training service.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The training configurations. These configurations are used for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The URI of the model version, which is the storage location of the model. The following types of model URIs are supported:</p>
     * <ul>
     * <li><p>An HTTP or HTTPS URL of the model. Example: <code>https://myweb.com/mymodel.tar.gz</code>.</p>
     * </li>
     * <li><p>If the model is stored in Object Storage Service (OSS), the URI must be in the <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code> format. For more information about endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">Endpoints</a>. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The description of the model version.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment analysis.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The model version. The version must be unique within the model. If you do not specify this parameter, the first version defaults to <strong>0.1.0</strong>. The minor version number is then incremented by 1 for each subsequent version. For example, the second version defaults to <strong>0.2.0</strong>.
     * A version number consists of a major version, a minor version, and a patch version, separated by periods (.). The major and minor versions are numbers. The patch version can start with a number and contain underscores (_) and letters. Examples: 1.1.0 and 2.3.4_beta.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
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

    public CreateModelVersionRequest setCompressionSpec(java.util.Map<String, ?> compressionSpec) {
        this.compressionSpec = compressionSpec;
        return this;
    }
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    public CreateModelVersionRequest setDistillationSpec(java.util.Map<String, ?> distillationSpec) {
        this.distillationSpec = distillationSpec;
        return this;
    }
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    public CreateModelVersionRequest setEvaluationSpec(java.util.Map<String, ?> evaluationSpec) {
        this.evaluationSpec = evaluationSpec;
        return this;
    }
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    public CreateModelVersionRequest setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
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
