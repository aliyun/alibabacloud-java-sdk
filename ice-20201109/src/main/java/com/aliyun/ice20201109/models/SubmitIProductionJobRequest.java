// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobRequest extends TeaModel {
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
    public SubmitIProductionJobRequestInput input;

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
    public SubmitIProductionJobRequestOutput output;

    /**
     * <p>The configuration for job scheduling.</p>
     */
    @NameInMap("ScheduleConfig")
    public SubmitIProductionJobRequestScheduleConfig scheduleConfig;

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
         * <p>The OSS URL of the input file or the ID of the input media asset.
         * The OSS URL can be in one of the following formats:</p>
         * <ol>
         * <li><p><code>oss://&lt;bucket&gt;/&lt;object&gt;</code></p>
         * </li>
         * <li><p><code>http(s)://&lt;bucket&gt;.oss-&lt;regionId&gt;.aliyuncs.com/&lt;object&gt;</code>
         * In these formats, <code>&lt;bucket&gt;</code> is the name of an OSS bucket in the same region as your project, and <code>&lt;object&gt;</code> is the file path.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of input media. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: An OSS file path.</p>
         * </li>
         * <li><p><code>Media</code>: A media asset ID.</p>
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
         * <p>The service to which the media asset belongs.</p>
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
         * <p>If <code>Type</code> is set to <code>Media</code>, you can use this parameter to specify the OSS URL for the output file. The bucket must be registered in either IMS or VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The type of the output media. Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: An OSS file path.</p>
         * </li>
         * <li><p><code>Media</code>: A media asset ID.</p>
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
         * <p>The ID of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039c3dc</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job priority, which can be an integer from 1 to 10. A smaller value indicates a higher priority.</p>
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
