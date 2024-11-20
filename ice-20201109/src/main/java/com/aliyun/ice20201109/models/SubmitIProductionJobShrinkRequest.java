// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the algorithm that you want to use for the job. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: This algorithm intelligently generates a thumbnail image for a video.</li>
     * <li><strong>VideoClip</strong>: This algorithm intelligently generates a summary for a video.</li>
     * <li><strong>VideoDelogo</strong>: This algorithm removes logos from a video.</li>
     * <li><strong>VideoDetext</strong>: This algorithm removes captions from a video.</li>
     * <li><strong>CaptionExtraction</strong>: This algorithm extracts captions from a video and generates the caption file.</li>
     * <li><strong>VideoGreenScreenMatting</strong>: This algorithm performs green-screen image matting on a video and generates a new video.</li>
     * <li><strong>FaceBeauty</strong>: This algorithm performs video retouching.</li>
     * <li><strong>VideoH2V</strong>: This algorithm transforms a video from the landscape mode to the portrait mode.</li>
     * <li><strong>MusicSegmentDetect</strong>: This algorithm detects the chorus of a song.</li>
     * <li><strong>AudioBeatDetection</strong>: This algorithm detects rhythms.</li>
     * <li><strong>AudioQualityAssessment</strong>: This algorithm assesses the audio quality.</li>
     * <li><strong>SpeechDenoise</strong>: This algorithm performs noise reduction.</li>
     * <li><strong>AudioMixing</strong>: This algorithm mixes audio streams.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The input file. The file can be an Object Storage Service (OSS) object or a media asset.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The algorithm-specific parameters. The parameters are specified as JSON objects and vary based on the algorithm. For more information, see the &quot;Parameters of JobParams&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The name of the intelligent production job. The name can be up to 100 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output file. The file can be an OSS object or a media asset.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The user-defined data that is returned in the response. The value can be up to 1,024 bytes in length.</p>
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
