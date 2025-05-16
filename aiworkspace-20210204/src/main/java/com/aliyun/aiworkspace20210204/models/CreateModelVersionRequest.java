// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionRequest extends TeaModel {
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
     * <p>The model format. Valid values:</p>
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
     * <p>The model framework. Valid values:</p>
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
     * <p>Describes how to apply to downstream inference services. For example, describe the processor and container of EAS. Example: <code>{ &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code></p>
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
    public java.util.List<Label> labels;

    /**
     * <p>The metrics for the model. The length after serialization is limited to 8,192.</p>
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
     * <p>The extended field. This is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The ID of the model source.</p>
     * <ul>
     * <li>If SourceType is set to Custom, this parameter is not limited.</li>
     * <li>If SourceType is set to PAIFlow or TrainingService, the ID of the model source is in the following format:</li>
     * </ul>
     * <!---->
     * 
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>Take note of the following parameters:</p>
     * <ul>
     * <li>region indicates the region ID.</li>
     * <li>workspaceId indicates the workspace ID.</li>
     * <li>kind indicates the type. Valid values: PipelineRun (PAIFlow) and ServiceJob (training service).</li>
     * <li>id indicates the unique identifier.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the model source. Valid values:</p>
     * <ul>
     * <li>Custom (default)</li>
     * <li>PAIFlow</li>
     * <li>TrainingService: the Platform for AI (PAI) training service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAIFlow</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The training configurations, which is used for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The URI of the model version, which is the location where the model is stored. Valid values:</p>
     * <ul>
     * <li>The HTTP(S) address of the model. Example: <code>https://myweb.com/mymodel.tar.gz</code>.</li>
     * <li>The OSS path of the model, in the format of <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code>. For information about endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The version description.</p>
     */
    @NameInMap("VersionDescription")
    public String versionDescription;

    /**
     * <p>The model version, which is unique for each model. If you leave this parameter empty, the first version is <strong>0.1.0</strong> by default. After that, the minor version number is increased by 1 in sequence. For example, the second version number is <strong>0.2.0</strong>. A version number consists of a major version number, a minor version number, and a stage version number, separated by periods (.). The major version number and minor version number are numeric. The stage version number begins with a digit and can include numbers, underscores, and letters. For example, the version number is 1.1.0 or 2.3.4_beta.</p>
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
