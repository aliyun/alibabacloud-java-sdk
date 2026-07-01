// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    /**
     * <p>The time when the job was created, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-07T07:16:11Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the job was completed, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-26T14:50:25Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The name of the algorithm to use. Valid values:</p>
     * <ul>
     * <li><p><strong>Cover</strong>: smart cover</p>
     * </li>
     * <li><p><strong>VideoClip</strong>: video summary</p>
     * </li>
     * <li><p><strong>VideoDelogo</strong>: video logo removal</p>
     * </li>
     * <li><p><strong>VideoDetext</strong>: video text removal</p>
     * </li>
     * <li><p><strong>CaptionExtraction</strong>: caption extraction</p>
     * </li>
     * <li><p><strong>VideoGreenScreenMatting</strong>: green screen matting</p>
     * </li>
     * <li><p><strong>FaceBeauty</strong>: video beautification</p>
     * </li>
     * <li><p><strong>VideoH2V</strong>: horizontal-to-vertical video conversion</p>
     * </li>
     * <li><p><strong>MusicSegmentDetect</strong>: chorus detection</p>
     * </li>
     * <li><p><strong>AudioBeatDetection</strong>: beat detection</p>
     * </li>
     * <li><p><strong>AudioQualityAssessment</strong>: audio quality assessment</p>
     * </li>
     * <li><p><strong>SpeechDenoise</strong>: speech denoising</p>
     * </li>
     * <li><p><strong>AudioMixing</strong>: audio mixing</p>
     * </li>
     * <li><p><strong>MusicDemix</strong>: music source separation</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The input media.</p>
     */
    @NameInMap("Input")
    public QueryIProductionJobResponseBodyInput input;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>A JSON object that contains the parameters for the algorithm job. The specific parameters vary depending on the selected algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output media.</p>
     */
    @NameInMap("Output")
    public QueryIProductionJobResponseBodyOutput output;

    /**
     * <p>An array of output file paths.</p>
     */
    @NameInMap("OutputFiles")
    public java.util.List<String> outputFiles;

    /**
     * <p>The output media asset IDs.</p>
     */
    @NameInMap("OutputMediaIds")
    public java.util.List<String> outputMediaIds;

    /**
     * <p>An array of output file URLs.</p>
     */
    @NameInMap("OutputUrls")
    public java.util.List<String> outputUrls;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The algorithm output, returned as a JSON string. The structure of the output varies based on the <code>FunctionName</code>. For more information, see the additional notes below.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The job configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public QueryIProductionJobResponseBodyScheduleConfig scheduleConfig;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li><p>Queuing: The job is awaiting processing.</p>
     * </li>
     * <li><p>Analyzing: The job is being processed.</p>
     * </li>
     * <li><p>Fail: The job failed to complete.</p>
     * </li>
     * <li><p>Success: The job completed successfully.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The user data. The system returns this value unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:1}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static QueryIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobResponseBody self = new QueryIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryIProductionJobResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public QueryIProductionJobResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public QueryIProductionJobResponseBody setInput(QueryIProductionJobResponseBodyInput input) {
        this.input = input;
        return this;
    }
    public QueryIProductionJobResponseBodyInput getInput() {
        return this.input;
    }

    public QueryIProductionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryIProductionJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public QueryIProductionJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryIProductionJobResponseBody setOutput(QueryIProductionJobResponseBodyOutput output) {
        this.output = output;
        return this;
    }
    public QueryIProductionJobResponseBodyOutput getOutput() {
        return this.output;
    }

    public QueryIProductionJobResponseBody setOutputFiles(java.util.List<String> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }
    public java.util.List<String> getOutputFiles() {
        return this.outputFiles;
    }

    public QueryIProductionJobResponseBody setOutputMediaIds(java.util.List<String> outputMediaIds) {
        this.outputMediaIds = outputMediaIds;
        return this;
    }
    public java.util.List<String> getOutputMediaIds() {
        return this.outputMediaIds;
    }

    public QueryIProductionJobResponseBody setOutputUrls(java.util.List<String> outputUrls) {
        this.outputUrls = outputUrls;
        return this;
    }
    public java.util.List<String> getOutputUrls() {
        return this.outputUrls;
    }

    public QueryIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIProductionJobResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryIProductionJobResponseBody setScheduleConfig(QueryIProductionJobResponseBodyScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public QueryIProductionJobResponseBodyScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public QueryIProductionJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryIProductionJobResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryIProductionJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class QueryIProductionJobResponseBodyInput extends TeaModel {
        /**
         * <p>The source file for the job. Set this to an OSS file URL if <code>Type</code> is <code>OSS</code>, or a media asset ID if <code>Type</code> is <code>Media</code>.
         * Valid OSS URL formats:</p>
         * <ol>
         * <li><p>oss\://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
         * In these formats, <code>bucket</code> is the name of the OSS bucket in the same region as the current project, and <code>object</code> is the file path.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Valid values:</p>
         * <ol>
         * <li><p>OSS: An OSS file URL.</p>
         * </li>
         * <li><p>Media: A media asset ID.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryIProductionJobResponseBodyInput build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyInput self = new QueryIProductionJobResponseBodyInput();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryIProductionJobResponseBodyInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIProductionJobResponseBodyOutput extends TeaModel {
        /**
         * <p>The service that the media asset belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>IMS</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The destination for the output. If the output <code>Type</code> is <code>OSS</code>, this parameter returns an OSS file URL. If the output <code>Type</code> is <code>Media</code>, it returns the specified or a newly generated media asset ID.</p>
         * <p>Valid OSS URL formats:</p>
         * <ol>
         * <li><p>oss\://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
         * In these formats, <code>bucket</code> is the name of the OSS bucket in the same region as the current project, and <code>object</code> is the file path.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS URL of the output file. This value is returned only when <code>Type</code> is <code>Media</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li><p>OSS: An OSS file URL.</p>
         * </li>
         * <li><p>Media: A media asset ID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryIProductionJobResponseBodyOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyOutput self = new QueryIProductionJobResponseBodyOutput();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyOutput setBiz(String biz) {
            this.biz = biz;
            return this;
        }
        public String getBiz() {
            return this.biz;
        }

        public QueryIProductionJobResponseBodyOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryIProductionJobResponseBodyOutput setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public QueryIProductionJobResponseBodyOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIProductionJobResponseBodyScheduleConfig extends TeaModel {
        /**
         * <p>The pipeline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a54fdc9c9aab413caef0d1150f565e86</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job\&quot;s priority within the pipeline.</p>
         * <ul>
         * <li><p>A larger value indicates a higher priority. The highest priority is 10.</p>
         * </li>
         * <li><p>Default: <strong>6</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static QueryIProductionJobResponseBodyScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyScheduleConfig self = new QueryIProductionJobResponseBodyScheduleConfig();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryIProductionJobResponseBodyScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
