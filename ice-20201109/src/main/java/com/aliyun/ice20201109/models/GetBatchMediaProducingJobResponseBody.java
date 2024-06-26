// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("EditingBatchJob")
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob;

    /**
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
         * <strong>example:</strong>
         * <p>InvalidMaterial.NotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>8e81933d44e3ae69e2f81485</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>1470b11171ee9d19e7e6c66a</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p>http:/xxx.oss-cn-shanghai.aliyuncs.com/xxx_0.mp4</p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
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

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBatchMediaProducingJobResponseBodyEditingBatchJob extends TeaModel {
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreateTime")
        public String createTime;

        /**
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
         * <strong>example:</strong>
         * <p>{
         *     &quot;ErrorCode&quot;: &quot;InvalidMaterial.NotFound&quot;,
         *     &quot;ErrorMessage&quot;: &quot;The specified clips id not found:[\&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>\&quot;]&quot;
         * }</p>
         */
        @NameInMap("Extend")
        public String extend;

        @NameInMap("InputConfig")
        public String inputConfig;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>b6b2750d4308892ac3330238</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
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
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubJobList")
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList;

        /**
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
