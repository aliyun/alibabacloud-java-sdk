// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    /**
     * <p>The time when the job was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-07T07:16:11Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the job was complete.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-26T14:50:25Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The name of the algorithm that you want to use for the job. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: This algorithm intelligently generates a thumbnail image for a video.</li>
     * <li><strong>VideoClip</strong>: This algorithm intelligently generates a summary for a video.</li>
     * <li><strong>VideoDelogo</strong>: This algorithm removes logos from a video.</li>
     * <li><strong>VideoDetext</strong>: This algorithm removes captions from a video.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <p>The input file.</p>
     */
    @NameInMap("Input")
    public QueryIProductionJobResponseBodyInput input;

    /**
     * <p>The ID of the intelligent production job.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The algorithm-specific parameters. The parameters are specified as JSON objects and vary based on the algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <p>The name of the intelligent production job.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output file.</p>
     */
    @NameInMap("Output")
    public QueryIProductionJobResponseBodyOutput output;

    /**
     * <p>The output files.</p>
     */
    @NameInMap("OutputFiles")
    public java.util.List<String> outputFiles;

    @NameInMap("OutputMediaIds")
    public java.util.List<String> outputMediaIds;

    /**
     * <p>The URLs of the output files.</p>
     */
    @NameInMap("OutputUrls")
    public java.util.List<String> outputUrls;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The output of the algorithm. The output is in JSON format and varies based on the algorithm. For more information, see the &quot;Parameters of Result&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The scheduling configuration.</p>
     */
    @NameInMap("ScheduleConfig")
    public QueryIProductionJobResponseBodyScheduleConfig scheduleConfig;

    /**
     * <p>The status of the job. Valid values:</p>
     * <ul>
     * <li>Queuing: The job is waiting in the queue.</li>
     * <li>Analysing: The job is in progress.</li>
     * <li>Fail: The job failed.</li>
     * <li>Success: The job was successful.</li>
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
     * <p>The user-defined data that is returned in the response.</p>
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
         * <p>The input file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media type. Valid values:</p>
         * <ol>
         * <li>OSS: Object Storage Service (OSS) object</li>
         * <li>Media: media asset</li>
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
        @NameInMap("Biz")
        public String biz;

        /**
         * <p>The output file. If Type is set to OSS, set this parameter to the path of an OSS object. If Type is set to Media, set this parameter to the ID of a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <ol>
         * <li>oss://bucket/object</li>
         * <li>http(s)://bucket.oss-[RegionId].aliyuncs.com/object bucket in the path specifies an OSS bucket that resides in the same region as the intelligent production job. object in the path specifies the object path in OSS.</li>
         * </ol>
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue.</p>
         * 
         * <strong>example:</strong>
         * <p>a54fdc9c9aab413caef0d1150f565e86</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job in the MPS queue to which the job is added.</p>
         * <ul>
         * <li>A value of 10 indicates the highest priority.</li>
         * <li>Default value: <strong>6</strong>.</li>
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
