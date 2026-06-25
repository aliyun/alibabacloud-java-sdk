// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelVersionRequest extends TeaModel {
    /**
     * <p>The approval status. Valid values:</p>
     * <ul>
     * <li><p>Pending: The model is pending approval.</p>
     * </li>
     * <li><p>Approved: The model is approved to be published.</p>
     * </li>
     * <li><p>Rejected: The model is not approved to be published.</p>
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
     * <p>Describes how to apply the model to downstream inference applications. For example, describe the processor and container for Elastic Algorithm Service (EAS). Example:
     * <code>{ &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    /**
     * <p>The model metrics.
     * The length cannot exceed 8,192 characters after serialization.</p>
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
     * <p>The extended field. This field is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li><p>If the source type is Custom, this field has no restrictions.</p>
     * </li>
     * <li><p>If the source is PAIFlow or TrainingService, the format is as follows:</p>
     * </li>
     * </ul>
     * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
     * </code></pre>
     * <p>The parameters are described as follows:</p>
     * <ul>
     * <li><p>region: the Alibaba Cloud region ID.</p>
     * </li>
     * <li><p>workspaceId: the workspace ID.</p>
     * </li>
     * <li><p>kind: the type. Valid values: PipelineRun (PAI pipeline) or ServiceJob (training service).</p>
     * </li>
     * <li><p>id: the unique identifier.</p>
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
     * <li><p>Custom (default): The model is a custom model.</p>
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
     * <p>The training configuration. This is used for fine-tuning and incremental training.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("TrainingSpec")
    public java.util.Map<String, ?> trainingSpec;

    /**
     * <p>The description of the model version.</p>
     * 
     * <strong>example:</strong>
     * <p>General sentiment analysis.</p>
     */
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

    public UpdateModelVersionRequest setCompressionSpec(java.util.Map<String, ?> compressionSpec) {
        this.compressionSpec = compressionSpec;
        return this;
    }
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    public UpdateModelVersionRequest setDistillationSpec(java.util.Map<String, ?> distillationSpec) {
        this.distillationSpec = distillationSpec;
        return this;
    }
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    public UpdateModelVersionRequest setEvaluationSpec(java.util.Map<String, ?> evaluationSpec) {
        this.evaluationSpec = evaluationSpec;
        return this;
    }
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    public UpdateModelVersionRequest setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
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
