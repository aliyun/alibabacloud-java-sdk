// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobRequest extends TeaModel {
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
    public SubmitIProductionJobRequestInput input;

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
    public SubmitIProductionJobRequestOutput output;

    /**
     * <p>The job scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitIProductionJobRequestScheduleConfig scheduleConfig;

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

    public static SubmitIProductionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobRequest self = new SubmitIProductionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SubmitIProductionJobRequest setInput(SubmitIProductionJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitIProductionJobRequestInput getInput() {
        return this.input;
    }

    public SubmitIProductionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitIProductionJobRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitIProductionJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitIProductionJobRequest setOutput(SubmitIProductionJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitIProductionJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitIProductionJobRequest setScheduleConfig(SubmitIProductionJobRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public SubmitIProductionJobRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public SubmitIProductionJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitIProductionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitIProductionJobRequestInput extends TeaModel {
        /**
         * <p>The input media. Both OSS URLs and media asset IDs are supported.
         * OSS URL formats (select one of the following formats):</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object
         * In the URLs, bucket is the name of the OSS bucket in the same region as the current project, and object is the file path.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li><p>OSS: OSS path</p>
         * </li>
         * <li><p>Media: media asset ID</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitIProductionJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestInput self = new SubmitIProductionJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitIProductionJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitIProductionJobRequestOutput extends TeaModel {
        /**
         * <p>The business to which the media asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>IMS</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS URL of the output file. This parameter is required when Type is set to Media. The bucket must be registered in IMS or VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li><p>OSS: OSS path</p>
         * </li>
         * <li><p>Media: media asset ID</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitIProductionJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestOutput self = new SubmitIProductionJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestOutput setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public SubmitIProductionJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitIProductionJobRequestOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public SubmitIProductionJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitIProductionJobRequestScheduleConfig extends TeaModel {
        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039c3dc</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static SubmitIProductionJobRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitIProductionJobRequestScheduleConfig self = new SubmitIProductionJobRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitIProductionJobRequestScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitIProductionJobRequestScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
