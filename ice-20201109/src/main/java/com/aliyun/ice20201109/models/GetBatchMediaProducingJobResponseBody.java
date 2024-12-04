// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    /**
     * <p>The information about the quick video production job.</p>
     */
    @NameInMap("EditingBatchJob")
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBatchMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobResponseBody self = new GetBatchMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobResponseBody setEditingBatchJob(GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob) {
        this.editingBatchJob = editingBatchJob;
        return this;
    }
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob getEditingBatchJob() {
        return this.editingBatchJob;
    }

    public GetBatchMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList extends TeaModel {
        /**
         * <p>The error code that is returned if the subjob failed. This parameter is not returned if the subjob is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidMaterial.NotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned if the subjob failed. This parameter is not returned if the subjob is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The subjob ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>8e81933d44e3ae69e2f81485</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>1470b11171ee9d19e7e6c66a</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>http:/xxx.oss-cn-shanghai.aliyuncs.com/xxx_0.mp4</p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The subjob state. Valid values:</p>
         * <p>Init: The subjob is initialized.</p>
         * <p>Processing: The subjob is in progress.</p>
         * <p>Success: The subjob is successful.</p>
         * <p>Failed: The subjob failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList self = new GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList();
            return TeaModel.build(map, self);
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBatchMediaProducingJobResponseBodyEditingBatchJob extends TeaModel {
        /**
         * <p>The time when the job was complete.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:57:07Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:47:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The editing configurations. For more information, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaConfig&quot;: {
         *       &quot;Volume&quot;: 0
         *   },
         *   &quot;SpeechConfig&quot;: {
         *       &quot;Volume&quot;: 1
         *   },
         *  &quot;BackgroundMusicConfig&quot;: {
         *       &quot;Volume&quot;: 0.3
         *   }
         * }</p>
         */
        @NameInMap("EditingConfig")
        public String editingConfig;

        /**
         * <p>The extended information. This parameter contains the following fields:</p>
         * <p>ErrorCode: the error code of the main job.</p>
         * <p>ErrorMessage: the error message of the main job.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ErrorCode&quot;: &quot;InvalidMaterial.NotFound&quot;,
         *     &quot;ErrorMessage&quot;: &quot;The specified clips id not found:[\&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>\&quot;]&quot;
         * }</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The input configurations. For more information, see <a href="~~2692547#2faed1559549n~~">InputConfig</a>.</p>
         */
        @NameInMap("InputConfig")
        public String inputConfig;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>b6b2750d4308892ac3330238</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the job was last modified.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:57:07Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The output configurations. For more information, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Count&quot;: 20,
         *   &quot;MaxDuration&quot;: 15,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920,
         *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
         * }</p>
         */
        @NameInMap("OutputConfig")
        public String outputConfig;

        /**
         * <p>The job state. Valid values:</p>
         * <p>Init: The job is initialized.</p>
         * <p>Processing: The job is in progress.</p>
         * <p>Finished: The job is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The quick video production subjobs.</p>
         */
        @NameInMap("SubJobList")
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList;

        /**
         * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="https://help.aliyun.com/document_detail/357745.html">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetBatchMediaProducingJobResponseBodyEditingBatchJob build(java.util.Map<String, ?> map) throws Exception {
            GetBatchMediaProducingJobResponseBodyEditingBatchJob self = new GetBatchMediaProducingJobResponseBodyEditingBatchJob();
            return TeaModel.build(map, self);
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setSubJobList(java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList) {
            this.subJobList = subJobList;
            return this;
        }
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> getSubJobList() {
            return this.subJobList;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
