// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the algorithm function to use. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: intelligent cover</li>
     * <li><strong>VideoClip</strong>: video synopsis</li>
     * <li><strong>VideoDelogo</strong>: video logo removal</li>
     * <li><strong>VideoDetext</strong>: video subtitle removal</li>
     * <li><strong>CaptionExtraction</strong>: caption extraction</li>
     * <li><strong>VideoGreenScreenMatting</strong>: image matting</li>
     * <li><strong>FaceBeauty</strong>: video face beautification</li>
     * <li><strong>VideoH2V</strong>: intelligent landscape-to-portrait</li>
     * <li><strong>MusicSegmentDetect</strong>: chorus detection</li>
     * <li><strong>AudioBeatDetection</strong>: beat detection</li>
     * <li><strong>AudioQualityAssessment</strong>: audio quality assessment</li>
     * <li><strong>SpeechDenoise</strong>: speech denoising</li>
     * <li><strong>AudioMixing</strong>: audio mixing</li>
     * <li><strong>MusicDemix</strong>: vocal and accompaniment separation</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The input media. Object Storage Service (OSS) paths and media asset IDs are supported.</p>
     * <p>Different algorithm functions have different input file requirements. For more information, see the supplementary description below.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The algorithm job parameters. This is a JSON object. The parameters vary depending on the algorithm. For more information, see the supplementary description.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The algorithm model ID. If this parameter is left empty, the default model for the corresponding function is used. In most cases, leave this parameter empty to use the default model.</p>
     * <p>The following algorithm functions have non-default models available:</p>
     * <ul>
     * <li>VideoDetext<ul>
     * <li>ModelId = algo-video-detext-new: a subtitle removal algorithm with better results but slower speed and higher cost than the default algorithm.</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The job name. The name can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output media. OSS paths and media asset IDs are supported.</p>
     * <p>Different algorithm functions produce different output files. For more information, see the supplementary description below.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public String outputShrink;

    /**
     * <p>The job scheduling configuration.</p>
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
     * <p>The custom user data, which is returned as-is when you retrieve the result. The value can be up to 256 characters in length.</p>
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
