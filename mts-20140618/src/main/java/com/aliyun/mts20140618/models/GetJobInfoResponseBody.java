// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MtsTransferJob")
    public GetJobInfoResponseBodyMtsTransferJob mtsTransferJob;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInfoResponseBody setMtsTransferJob(GetJobInfoResponseBodyMtsTransferJob mtsTransferJob) {
        this.mtsTransferJob = mtsTransferJob;
        return this;
    }
    public GetJobInfoResponseBodyMtsTransferJob getMtsTransferJob() {
        return this.mtsTransferJob;
    }

    public static class GetJobInfoResponseBodyMtsTransferJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("State")
        public String state;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("RequestJson")
        public String requestJson;

        public static GetJobInfoResponseBodyMtsTransferJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyMtsTransferJob self = new GetJobInfoResponseBodyMtsTransferJob();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyMtsTransferJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobInfoResponseBodyMtsTransferJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobInfoResponseBodyMtsTransferJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobInfoResponseBodyMtsTransferJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetJobInfoResponseBodyMtsTransferJob setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
        }

        public GetJobInfoResponseBodyMtsTransferJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobInfoResponseBodyMtsTransferJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetJobInfoResponseBodyMtsTransferJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetJobInfoResponseBodyMtsTransferJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetJobInfoResponseBodyMtsTransferJob setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetJobInfoResponseBodyMtsTransferJob setRequestJson(String requestJson) {
            this.requestJson = requestJson;
            return this;
        }
        public String getRequestJson() {
            return this.requestJson;
        }

    }

}
