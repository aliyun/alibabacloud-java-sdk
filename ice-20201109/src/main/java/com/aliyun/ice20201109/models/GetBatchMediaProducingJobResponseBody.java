// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("EditingBatchJob")
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaURL")
        public String mediaURL;

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
        @NameInMap("EditingConfig")
        public String editingConfig;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("InputConfig")
        public String inputConfig;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("OutputConfig")
        public String outputConfig;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubJobList")
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList;

        @NameInMap("UserData")
        public String userData;

        public static GetBatchMediaProducingJobResponseBodyEditingBatchJob build(java.util.Map<String, ?> map) throws Exception {
            GetBatchMediaProducingJobResponseBodyEditingBatchJob self = new GetBatchMediaProducingJobResponseBodyEditingBatchJob();
            return TeaModel.build(map, self);
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
