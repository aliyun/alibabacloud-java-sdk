// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureSearchJobStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetPictureSearchJobStatusResponseData data;

    public static GetPictureSearchJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchJobStatusResponse self = new GetPictureSearchJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchJobStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPictureSearchJobStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPictureSearchJobStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPictureSearchJobStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPictureSearchJobStatusResponse setData(GetPictureSearchJobStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetPictureSearchJobStatusResponseData getData() {
        return this.data;
    }

    public static class GetPictureSearchJobStatusResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobStatus")
        @Validation(required = true)
        public Integer jobStatus;

        @NameInMap("SearchPicUrl")
        @Validation(required = true)
        public String searchPicUrl;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        public static GetPictureSearchJobStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPictureSearchJobStatusResponseData self = new GetPictureSearchJobStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetPictureSearchJobStatusResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPictureSearchJobStatusResponseData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetPictureSearchJobStatusResponseData setSearchPicUrl(String searchPicUrl) {
            this.searchPicUrl = searchPicUrl;
            return this;
        }
        public String getSearchPicUrl() {
            return this.searchPicUrl;
        }

        public GetPictureSearchJobStatusResponseData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPictureSearchJobStatusResponseData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPictureSearchJobStatusResponseData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public GetPictureSearchJobStatusResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
