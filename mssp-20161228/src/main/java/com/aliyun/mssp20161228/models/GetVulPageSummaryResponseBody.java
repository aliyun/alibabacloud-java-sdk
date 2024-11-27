// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulPageSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVulPageSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A3A575C8-80F9-5F04-AA24-CCAC246884A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetVulPageSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulPageSummaryResponseBody self = new GetVulPageSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulPageSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVulPageSummaryResponseBody setData(GetVulPageSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVulPageSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetVulPageSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVulPageSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVulPageSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulPageSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVulPageSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1990</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("HandingCount")
        public Long handingCount;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("HighCount")
        public Long highCount;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("LowCount")
        public Long lowCount;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MediumCount")
        public Long mediumCount;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WaitHandleCount")
        public Long waitHandleCount;

        public static GetVulPageSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVulPageSummaryResponseBodyData self = new GetVulPageSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVulPageSummaryResponseBodyData setCompletedCount(Long completedCount) {
            this.completedCount = completedCount;
            return this;
        }
        public Long getCompletedCount() {
            return this.completedCount;
        }

        public GetVulPageSummaryResponseBodyData setHandingCount(Long handingCount) {
            this.handingCount = handingCount;
            return this;
        }
        public Long getHandingCount() {
            return this.handingCount;
        }

        public GetVulPageSummaryResponseBodyData setHighCount(Long highCount) {
            this.highCount = highCount;
            return this;
        }
        public Long getHighCount() {
            return this.highCount;
        }

        public GetVulPageSummaryResponseBodyData setLowCount(Long lowCount) {
            this.lowCount = lowCount;
            return this;
        }
        public Long getLowCount() {
            return this.lowCount;
        }

        public GetVulPageSummaryResponseBodyData setMediumCount(Long mediumCount) {
            this.mediumCount = mediumCount;
            return this;
        }
        public Long getMediumCount() {
            return this.mediumCount;
        }

        public GetVulPageSummaryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetVulPageSummaryResponseBodyData setWaitHandleCount(Long waitHandleCount) {
            this.waitHandleCount = waitHandleCount;
            return this;
        }
        public Long getWaitHandleCount() {
            return this.waitHandleCount;
        }

    }

}
