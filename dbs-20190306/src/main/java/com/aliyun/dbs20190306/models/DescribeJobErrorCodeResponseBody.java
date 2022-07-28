// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeJobErrorCodeResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Item")
    public DescribeJobErrorCodeResponseBodyItem item;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeJobErrorCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobErrorCodeResponseBody self = new DescribeJobErrorCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobErrorCodeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeJobErrorCodeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeJobErrorCodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeJobErrorCodeResponseBody setItem(DescribeJobErrorCodeResponseBodyItem item) {
        this.item = item;
        return this;
    }
    public DescribeJobErrorCodeResponseBodyItem getItem() {
        return this.item;
    }

    public DescribeJobErrorCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobErrorCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeJobErrorCodeResponseBodyItem extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobState")
        public String jobState;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("Language")
        public String language;

        public static DescribeJobErrorCodeResponseBodyItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobErrorCodeResponseBodyItem self = new DescribeJobErrorCodeResponseBodyItem();
            return TeaModel.build(map, self);
        }

        public DescribeJobErrorCodeResponseBodyItem setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeJobErrorCodeResponseBodyItem setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeJobErrorCodeResponseBodyItem setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobErrorCodeResponseBodyItem setJobState(String jobState) {
            this.jobState = jobState;
            return this;
        }
        public String getJobState() {
            return this.jobState;
        }

        public DescribeJobErrorCodeResponseBodyItem setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public DescribeJobErrorCodeResponseBodyItem setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

}
