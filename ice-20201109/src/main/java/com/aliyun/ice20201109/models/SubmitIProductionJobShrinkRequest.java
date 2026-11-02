// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobShrinkRequest extends TeaModel {
    /**
     * <p>The name of the algorithm feature to be used. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: intelligent cover</li>
     * <li><strong>VideoClip</strong>: video synopsis</li>
     * <li><strong>VideoDelogo</strong>: video icon removal</li>
     * <li><strong>VideoDetext</strong>: video subtitle removal</li>
     * <li><strong>CaptionExtraction</strong>: subtitle fetch</li>
     * <li><strong>VideoGreenScreenMatting</strong>: image matting</li>
     * <li><strong>FaceBeauty</strong>: video face beautification</li>
     * <li><strong>VideoH2V</strong>: video landscape-to-portrait conversion</li>
     * <li><strong>MusicSegmentDetect</strong>: chorus detection</li>
     * <li><strong>AudioBeatDetection</strong>: beat detection</li>
     * <li><strong>AudioQualityAssessment</strong>: audio quality assessment</li>
     * <li><strong>SpeechDenoise</strong>: speech noise reduction</li>
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
     * <p>The input media. OSS paths and media asset IDs are supported.</p>
     * <p>The file requirements for the input media vary based on the algorithm feature. For more information, see the supplementary instructions below.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The algorithm job parameters. The value is a JSON object. The parameters vary based on the algorithm. For more information, see the supplementary instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The algorithm model ID. If this parameter is left empty, the default model for the corresponding feature is used. You can leave this parameter empty and use the default model.</p>
     * <p>The following algorithm features support non-default models:</p>
     * <ul>
     * <li>VideoDetext<ul>
     * <li>ModelId = algo-video-detext-new: a subtitle removal algorithm that delivers better results but runs slower and costs more than the default algorithm.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>algo-video-detext-new</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The name of the job. The name can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test job</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output media. OSS paths and media asset IDs are supported.</p>
     * <p>The output files for the Output parameter vary based on the algorithm feature. For more information, see the supplementary instructions below.</p>
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
     * <p>The custom user data. The data is returned as is when the result is obtained. The value can be up to 256 characters in length.</p>
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
