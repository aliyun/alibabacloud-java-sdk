// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Details of the spark job
    @NameInMap("JobDetail")
    public GetSparkJobDetailResponseBodyJobDetail jobDetail;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSparkJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobDetailResponseBody self = new GetSparkJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkJobDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSparkJobDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSparkJobDetailResponseBody setJobDetail(GetSparkJobDetailResponseBodyJobDetail jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }
    public GetSparkJobDetailResponseBodyJobDetail getJobDetail() {
        return this.jobDetail;
    }

    public GetSparkJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSparkJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSparkJobDetailResponseBodyJobDetail extends TeaModel {
        @NameInMap("Arguments")
        public String arguments;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MainClass")
        public String mainClass;

        @NameInMap("MainFile")
        public String mainFile;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        public static GetSparkJobDetailResponseBodyJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSparkJobDetailResponseBodyJobDetail self = new GetSparkJobDetailResponseBodyJobDetail();
            return TeaModel.build(map, self);
        }

        public GetSparkJobDetailResponseBodyJobDetail setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public GetSparkJobDetailResponseBodyJobDetail setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetSparkJobDetailResponseBodyJobDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetSparkJobDetailResponseBodyJobDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetSparkJobDetailResponseBodyJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetSparkJobDetailResponseBodyJobDetail setMainClass(String mainClass) {
            this.mainClass = mainClass;
            return this;
        }
        public String getMainClass() {
            return this.mainClass;
        }

        public GetSparkJobDetailResponseBodyJobDetail setMainFile(String mainFile) {
            this.mainFile = mainFile;
            return this;
        }
        public String getMainFile() {
            return this.mainFile;
        }

        public GetSparkJobDetailResponseBodyJobDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSparkJobDetailResponseBodyJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSparkJobDetailResponseBodyJobDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

}
