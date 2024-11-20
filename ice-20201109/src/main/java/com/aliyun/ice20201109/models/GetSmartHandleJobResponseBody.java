// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSmartHandleJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job results.</p>
     */
    @NameInMap("JobResult")
    public GetSmartHandleJobResponseBodyJobResult jobResult;

    /**
     * <p>The job results.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the intelligent job.</p>
     */
    @NameInMap("SmartJobInfo")
    public GetSmartHandleJobResponseBodySmartJobInfo smartJobInfo;

    /**
     * <p>The job state.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Finished</li>
     * <li>Failed</li>
     * <li>Executing</li>
     * <li>Created</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The user-defined data in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:&quot;data&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static GetSmartHandleJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartHandleJobResponseBody self = new GetSmartHandleJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartHandleJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetSmartHandleJobResponseBody setJobResult(GetSmartHandleJobResponseBodyJobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public GetSmartHandleJobResponseBodyJobResult getJobResult() {
        return this.jobResult;
    }

    public GetSmartHandleJobResponseBody setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public GetSmartHandleJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartHandleJobResponseBody setSmartJobInfo(GetSmartHandleJobResponseBodySmartJobInfo smartJobInfo) {
        this.smartJobInfo = smartJobInfo;
        return this;
    }
    public GetSmartHandleJobResponseBodySmartJobInfo getSmartJobInfo() {
        return this.smartJobInfo;
    }

    public GetSmartHandleJobResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetSmartHandleJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class GetSmartHandleJobResponseBodyJobResult extends TeaModel {
        /**
         * <p>The AI analysis result.</p>
         * 
         * <strong>example:</strong>
         * <p>Intelligent segmentation or tagging information</p>
         */
        @NameInMap("AiResult")
        public String aiResult;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The token usage. This parameter is returned only for keyword-based text generation jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;total_tokens&quot;:100}</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static GetSmartHandleJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodyJobResult self = new GetSmartHandleJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodyJobResult setAiResult(String aiResult) {
            this.aiResult = aiResult;
            return this;
        }
        public String getAiResult() {
            return this.aiResult;
        }

        public GetSmartHandleJobResponseBodyJobResult setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetSmartHandleJobResponseBodyJobResult setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfoInputConfig extends TeaModel {
        /**
         * <p>The OSS URL or the ID of the material in the media asset library.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 或 <strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        @NameInMap("InputFile")
        public String inputFile;

        public static GetSmartHandleJobResponseBodySmartJobInfoInputConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfoInputConfig self = new GetSmartHandleJobResponseBodySmartJobInfoInputConfig();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig setInputFile(String inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public String getInputFile() {
            return this.inputFile;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfoOutputConfig extends TeaModel {
        /**
         * <p>The OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>test-object</p>
         */
        @NameInMap("Object")
        public String object;

        public static GetSmartHandleJobResponseBodySmartJobInfoOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfoOutputConfig self = new GetSmartHandleJobResponseBodySmartJobInfoOutputConfig();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSmartHandleJobResponseBodySmartJobInfo extends TeaModel {
        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The input configurations.</p>
         */
        @NameInMap("InputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig inputConfig;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASR</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The output configurations.</p>
         */
        @NameInMap("OutputConfig")
        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig outputConfig;

        /**
         * <p>The job title.</p>
         * 
         * <strong>example:</strong>
         * <p>测试标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1974526429******</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetSmartHandleJobResponseBodySmartJobInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSmartHandleJobResponseBodySmartJobInfo self = new GetSmartHandleJobResponseBodySmartJobInfo();
            return TeaModel.build(map, self);
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setInputConfig(GetSmartHandleJobResponseBodySmartJobInfoInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public GetSmartHandleJobResponseBodySmartJobInfoInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setOutputConfig(GetSmartHandleJobResponseBodySmartJobInfoOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public GetSmartHandleJobResponseBodySmartJobInfoOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetSmartHandleJobResponseBodySmartJobInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
