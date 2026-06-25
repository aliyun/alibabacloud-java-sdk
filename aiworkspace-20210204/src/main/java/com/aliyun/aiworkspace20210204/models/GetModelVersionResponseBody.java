// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetModelVersionResponseBody extends TeaModel {
    /**
     * <p>The approval status. Valid values:</p>
     * <ul>
     * <li><p>Pending: The model is pending approval.</p>
     * </li>
     * <li><p>Approved: The model is approved for publishing.</p>
     * </li>
     * <li><p>Rejected: The model is rejected for publishing.</p>
     * </li>
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
     * <p>The model format. Valid values:</p>
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
     * <p>The model framework. Valid values:</p>
     * <ul>
     * <li><p>Pytorch
     * -XGBoost</p>
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
     * <p>The UTC time when the model was created. The time is in the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The UTC time when the model was last updated. The time is in the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Describes how to apply the model to a downstream inference service. For example, this can describe the processor and container for Elastic Algorithm Service (EAS).</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;Processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <p>The list of labels for the model version.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metrics")
    public java.util.Map<String, ?> metrics;

    /**
     * <p>The extended field. This field is a JSON string.</p>
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
     * <p>1234567890******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li><p>If the source type is Custom, this field has no limits.</p>
     * </li>
     * <li><p>If the source is PAIFlow or TrainingService, the format is:</p>
     * </li>
     * </ul>
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>The parameters are:</p>
     * <ul>
     * <li><p>region: The ID of the Alibaba Cloud region.</p>
     * </li>
     * <li><p>workspaceId: The workspace ID.</p>
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
     * <li><p>Custom: The model is a custom model.</p>
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
     * <p>The training configuration. This is the configuration for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The URI of the model version. This is the storage location of the model. Valid values:</p>
     * <ul>
     * <li><p>The HTTP or HTTPS URL of the model. Example: <code>https://myweb.com/mymodel.tar.gz</code>.</p>
     * </li>
     * <li><p>If the model is stored in Object Storage Service (OSS), the format is <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code>. For more information about how to configure the endpoint, see <a href="https://help.aliyun.com/document_detail/31837.html">Endpoints</a>. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890******</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The description of the model version.</p>
     * 
     * <strong>example:</strong>
     * <p>General sentiment analysis.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The model version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static GetModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelVersionResponseBody self = new GetModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelVersionResponseBody setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public GetModelVersionResponseBody setCompressionSpec(java.util.Map<String, ?> compressionSpec) {
        this.compressionSpec = compressionSpec;
        return this;
    }
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    public GetModelVersionResponseBody setDistillationSpec(java.util.Map<String, ?> distillationSpec) {
        this.distillationSpec = distillationSpec;
        return this;
    }
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    public GetModelVersionResponseBody setEvaluationSpec(java.util.Map<String, ?> evaluationSpec) {
        this.evaluationSpec = evaluationSpec;
        return this;
    }
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    public GetModelVersionResponseBody setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public GetModelVersionResponseBody setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public GetModelVersionResponseBody setFrameworkType(String frameworkType) {
        this.frameworkType = frameworkType;
        return this;
    }
    public String getFrameworkType() {
        return this.frameworkType;
    }

    public GetModelVersionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetModelVersionResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetModelVersionResponseBody setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public GetModelVersionResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetModelVersionResponseBody setMetrics(java.util.Map<String, ?> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    public GetModelVersionResponseBody setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public GetModelVersionResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelVersionResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetModelVersionResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetModelVersionResponseBody setTrainingSpec(java.util.Map<String, ?> trainingSpec) {
        this.trainingSpec = trainingSpec;
        return this;
    }
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    public GetModelVersionResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public GetModelVersionResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetModelVersionResponseBody setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public GetModelVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
