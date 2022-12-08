// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureSearchJobStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPictureSearchJobStatusResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPictureSearchJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchJobStatusResponseBody self = new GetPictureSearchJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchJobStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPictureSearchJobStatusResponseBody setData(GetPictureSearchJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPictureSearchJobStatusResponseBodyData getData() {
        return this.data;
    }

    public GetPictureSearchJobStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPictureSearchJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPictureSearchJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPictureSearchJobStatusResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("SearchPicUrl")
        public String searchPicUrl;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Threshold")
        public Float threshold;

        public static GetPictureSearchJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPictureSearchJobStatusResponseBodyData self = new GetPictureSearchJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPictureSearchJobStatusResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPictureSearchJobStatusResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPictureSearchJobStatusResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPictureSearchJobStatusResponseBodyData setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public GetPictureSearchJobStatusResponseBodyData setSearchPicUrl(String searchPicUrl) {
            this.searchPicUrl = searchPicUrl;
            return this;
        }
        public String getSearchPicUrl() {
            return this.searchPicUrl;
        }

        public GetPictureSearchJobStatusResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPictureSearchJobStatusResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
