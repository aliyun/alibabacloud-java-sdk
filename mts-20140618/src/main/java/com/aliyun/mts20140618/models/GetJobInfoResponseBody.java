// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetJobInfoResponseBody extends TeaModel {
    @NameInMap("MtsTransferJob")
    public GetJobInfoResponseBodyMtsTransferJob mtsTransferJob;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInfoResponseBody self = new GetJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInfoResponseBody setMtsTransferJob(GetJobInfoResponseBodyMtsTransferJob mtsTransferJob) {
        this.mtsTransferJob = mtsTransferJob;
        return this;
    }
    public GetJobInfoResponseBodyMtsTransferJob getMtsTransferJob() {
        return this.mtsTransferJob;
    }

    public GetJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobInfoResponseBodyMtsTransferJob extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("FinishedTime")
        public String finishedTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RequestJson")
        public String requestJson;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static GetJobInfoResponseBodyMtsTransferJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobInfoResponseBodyMtsTransferJob self = new GetJobInfoResponseBodyMtsTransferJob();
            return TeaModel.build(map, self);
        }

        public GetJobInfoResponseBodyMtsTransferJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public GetJobInfoResponseBodyMtsTransferJob setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetJobInfoResponseBodyMtsTransferJob setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public String getFinishedTime() {
            return this.finishedTime;
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

        public GetJobInfoResponseBodyMtsTransferJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetJobInfoResponseBodyMtsTransferJob setRequestJson(String requestJson) {
            this.requestJson = requestJson;
            return this;
        }
        public String getRequestJson() {
            return this.requestJson;
        }

        public GetJobInfoResponseBodyMtsTransferJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobInfoResponseBodyMtsTransferJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
