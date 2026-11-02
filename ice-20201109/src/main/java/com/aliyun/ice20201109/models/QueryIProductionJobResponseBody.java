// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    /**
     * <p>The creation time in GMT.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-07T07:16:11Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The completion time in GMT.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-26T14:50:25Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The name of the algorithm feature to use. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: Intelligent cover</li>
     * <li><strong>VideoClip</strong>: Video synopsis</li>
     * <li><strong>VideoDelogo</strong>: Video icon removal</li>
     * <li><strong>VideoDetext</strong>: Video subtitle removal</li>
     * <li><strong>CaptionExtraction</strong>: Subtitle fetch</li>
     * <li><strong>VideoGreenScreenMatting</strong>: Image matting</li>
     * <li><strong>FaceBeauty</strong>: Video face beautification</li>
     * <li><strong>VideoH2V</strong>: Video landscape-to-portrait conversion</li>
     * <li><strong>MusicSegmentDetect</strong>: Chorus detection</li>
     * <li><strong>AudioBeatDetection</strong>: Beat detection</li>
     * <li><strong>AudioQualityAssessment</strong>: Audio quality assessment</li>
     * <li><strong>SpeechDenoise</strong>: Speech noise reduction</li>
     * <li><strong>AudioMixing</strong>: Audio mixing</li>
     * <li><strong>MusicDemix</strong>: Vocal and accompaniment separation</li>
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
     * <p>The algorithm job parameters. This is a JSON object. The parameters vary based on the algorithm.</p>
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
     * <p>The output file array.</p>
     */
    @NameInMap("OutputFiles")
    public java.util.List<String> outputFiles;

    /**
     * <p>The list of media asset IDs output by the job.</p>
     */
    @NameInMap("OutputMediaIds")
    public java.util.List<String> outputMediaIds;

    /**
     * <p>The output file URL array.</p>
     */
    @NameInMap("OutputUrls")
    public java.util.List<String> outputUrls;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0E5D1-4B3C-599D-8017-2DA186EA1053</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information output by the algorithm. The output varies based on FunctionName and is in JSON format. For more information, see the following sections.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The job configuration information.</p>
     */
    @NameInMap("ScheduleConfig")
    public QueryIProductionJobResponseBodyScheduleConfig scheduleConfig;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Queuing: The job is queued.</li>
     * <li>Analysing: The job is being analyzed.</li>
     * <li>Fail: The job failed.</li>
     * <li>Success: The job succeeded.</li>
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
     * <p>The user-defined data. This data is returned as-is when the result is retrieved.</p>
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
         * <p>The input media. If Type is set to OSS, enter the OSS URL. If Type is set to Media, enter the media asset ID.
         * The OSS URL must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
         * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file URL.</li>
         * <li>Media: media asset ID.</li>
         * </ul>
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
         * <p>The business to which the media asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>IMS</p>
         */
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The output media. If Type is set to OSS, the OSS URL is returned. If Type is set to Media, the specified media asset ID or a newly generated media asset ID is returned.</p>
         * <p>The OSS URL must be in one of the following formats:</p>
         * <ul>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object
         * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The OSS URL of the specified output file when Type is set to Media.</p>
         * 
         * <strong>example:</strong>
         * <p>http(s)://bucket.oss-[RegionId].aliyuncs.com/object</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The media type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS path.</li>
         * <li>Media: media asset ID.</li>
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
         * <p>The priority of the job in its corresponding pipeline.</p>
         * <ul>
         * <li><p>Highest priority: 10.</p>
         * </li>
         * <li><p>Default value: <strong>6</strong>.</p>
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
