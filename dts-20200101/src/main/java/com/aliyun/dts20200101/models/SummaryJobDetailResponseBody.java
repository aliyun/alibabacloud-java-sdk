// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SummaryJobDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ProgressSummaryDetails")
    public java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> progressSummaryDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SummaryJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SummaryJobDetailResponseBody self = new SummaryJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public SummaryJobDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SummaryJobDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SummaryJobDetailResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SummaryJobDetailResponseBody setProgressSummaryDetails(java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> progressSummaryDetails) {
        this.progressSummaryDetails = progressSummaryDetails;
        return this;
    }
    public java.util.List<SummaryJobDetailResponseBodyProgressSummaryDetails> getProgressSummaryDetails() {
        return this.progressSummaryDetails;
    }

    public SummaryJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SummaryJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SummaryJobDetailResponseBodyProgressSummaryDetails extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("State")
        public Integer state;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SummaryJobDetailResponseBodyProgressSummaryDetails build(java.util.Map<String, ?> map) throws Exception {
            SummaryJobDetailResponseBodyProgressSummaryDetails self = new SummaryJobDetailResponseBodyProgressSummaryDetails();
            return TeaModel.build(map, self);
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public SummaryJobDetailResponseBodyProgressSummaryDetails setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
