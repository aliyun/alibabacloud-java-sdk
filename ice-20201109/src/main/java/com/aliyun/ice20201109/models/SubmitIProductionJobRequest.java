// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobRequest extends TeaModel {
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
    public SubmitIProductionJobRequestInput input;

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
    public SubmitIProductionJobRequestOutput output;

    /**
     * <p>The scheduling configuration.</p>
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
     * <p>The user-defined data that is returned in the response. The value can be up to 1,024 bytes in length.</p>
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
         * <p>The input file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[regionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
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
         * <li>OSS: OSS object</li>
         * <li>Media: media asset</li>
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
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The output file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS object</li>
         * <li>Media: media asset</li>
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue.</p>
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
