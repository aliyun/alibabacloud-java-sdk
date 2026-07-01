// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the algorithm function. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong>: Generates a smart cover.</p>
     * </li>
     * <li><p><strong>VideoClip</strong>: Creates a video summary.</p>
     * </li>
     * <li><p><strong>VideoDelogo</strong>: Removes logos from a video.</p>
     * </li>
     * <li><p><strong>VideoDetext</strong>: Removes text from a video.</p>
     * </li>
     * <li><p><strong>CaptionExtraction</strong>: Extracts captions from a video.</p>
     * </li>
     * <li><p><strong>VideoGreenScreenMatting</strong>: Performs green screen keying for a video.</p>
     * </li>
     * <li><p><strong>FaceBeauty</strong>: Applies beauty filters to faces in a video.</p>
     * </li>
     * <li><p><strong>VideoH2V</strong>: Converts a horizontal video to a vertical video.</p>
     * </li>
     * <li><p><strong>MusicSegmentDetect</strong>: Detects chorus segments in music.</p>
     * </li>
     * <li><p><strong>AudioBeatDetection</strong>: Detects the beat of an audio track.</p>
     * </li>
     * <li><p><strong>AudioQualityAssessment</strong>: Assesses audio quality.</p>
     * </li>
     * <li><p><strong>SpeechDenoise</strong>: Reduces noise in speech audio.</p>
     * </li>
     * <li><p><strong>AudioMixing</strong>: Mixes audio tracks.</p>
     * </li>
     * <li><p><strong>MusicDemix</strong>: Separates vocals from accompaniment in music.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The input media asset. You can specify an OSS file or a media asset ID.</p>
     * <p>The requirements for input files vary by algorithm function. For more information, see the supplementary instructions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The algorithm job parameters, specified as a JSON-formatted string. The content of the JSON object varies by algorithm function. For more information, see the supplementary instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The ID of the algorithm model. If you do not specify this parameter, the system uses the default model for the selected function. We recommend leaving this parameter empty unless you need to use a specific alternative model.</p>
     * <p>The following function offers an alternative model:</p>
     * <ul>
     * <li><p><code>VideoDetext</code></p>
     * <ul>
     * <li>Set <code>ModelId</code> to <code>algo-video-detext-new</code> to use an advanced subtitle removal algorithm. This model provides higher quality results but is slower and more expensive than the default model.</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The name of the job, which can be up to 100 characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output destination. You can specify an OSS file path or a media asset ID.</p>
     * <p>The output files vary by algorithm function. For more information, see the supplementary instructions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The configuration for job scheduling.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Custom user data. The system passes this data through and returns it as-is in the callback or response. The length cannot exceed 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:1}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitIProductionJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobShrinkRequest self = new SubmitIProductionJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobShrinkRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SubmitIProductionJobShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public SubmitIProductionJobShrinkRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitIProductionJobShrinkRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitIProductionJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitIProductionJobShrinkRequest setOutputShrink(String outputShrink) {
        this.outputShrink = outputShrink;
        return this;
    }
    public String getOutputShrink() {
        return this.outputShrink;
    }

    public SubmitIProductionJobShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public SubmitIProductionJobShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitIProductionJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
