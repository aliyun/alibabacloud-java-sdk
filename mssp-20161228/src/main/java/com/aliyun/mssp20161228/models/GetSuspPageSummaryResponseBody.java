// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSuspPageSummaryResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public GetSuspPageSummaryResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the result returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EF801DD1-D934-51B3-92D4-776CE17B184F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Number of completed items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CompletedCount")
        public Long completedCount;

        /**
         * <p>Number of items being processed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HandingCount")
        public Long handingCount;

        /**
         * <p>Number of high-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HighCount")
        public Long highCount;

        /**
         * <p>Number of low-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LowCount")
        public Long lowCount;

        /**
         * <p>Number of medium-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MediumCount")
        public Long mediumCount;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>Number of unhandled items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
