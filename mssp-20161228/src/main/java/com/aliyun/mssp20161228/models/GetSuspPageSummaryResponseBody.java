// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspPageSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSuspPageSummaryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSuspPageSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuspPageSummaryResponseBody self = new GetSuspPageSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuspPageSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSuspPageSummaryResponseBody setData(GetSuspPageSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSuspPageSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetSuspPageSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSuspPageSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSuspPageSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuspPageSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSuspPageSummaryResponseBodyData extends TeaModel {
        @NameInMap("CompletedCount")
        public Long completedCount;

        @NameInMap("HandingCount")
        public Long handingCount;

        @NameInMap("HighCount")
        public Long highCount;

        @NameInMap("LowCount")
        public Long lowCount;

        @NameInMap("MediumCount")
        public Long mediumCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("WaitHandleCount")
        public Long waitHandleCount;

        public static GetSuspPageSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSuspPageSummaryResponseBodyData self = new GetSuspPageSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSuspPageSummaryResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetSuspPageSummaryResponseBodyData setHandingCount(Long handingCount) {
            this.handingCount = handingCount;
            return this;
        }
        public Long getHandingCount() {
            return this.handingCount;
        }

        public GetSuspPageSummaryResponseBodyData setHighCount(Long highCount) {
            this.highCount = highCount;
            return this;
        }
        public Long getHighCount() {
            return this.highCount;
        }

        public GetSuspPageSummaryResponseBodyData setLowCount(Long lowCount) {
            this.lowCount = lowCount;
            return this;
        }
        public Long getLowCount() {
            return this.lowCount;
        }

        public GetSuspPageSummaryResponseBodyData setMediumCount(Long mediumCount) {
            this.mediumCount = mediumCount;
            return this;
        }
        public Long getMediumCount() {
            return this.mediumCount;
        }

        public GetSuspPageSummaryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetSuspPageSummaryResponseBodyData setWaitHandleCount(Long waitHandleCount) {
            this.waitHandleCount = waitHandleCount;
            return this;
        }
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

    }

}
