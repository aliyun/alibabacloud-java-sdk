// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiCallSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataServiceApiCallSummaryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceApiCallSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiCallSummaryResponseBody self = new GetDataServiceApiCallSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiCallSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceApiCallSummaryResponseBody setData(GetDataServiceApiCallSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiCallSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiCallSummaryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiCallSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceApiCallSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiCallSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiCallSummaryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ErrorApiCount")
        public Long errorApiCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ErrorAppCount")
        public Long errorAppCount;

        /**
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <strong>example:</strong>
         * <p>10.01</p>
         */
        @NameInMap("ErrorRate")
        public Double errorRate;

        /**
         * <strong>example:</strong>
         * <p>2.03</p>
         */
        @NameInMap("OfflineRate")
        public Double offlineRate;

        public static GetDataServiceApiCallSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiCallSummaryResponseBodyData self = new GetDataServiceApiCallSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiCallSummaryResponseBodyData setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public GetDataServiceApiCallSummaryResponseBodyData setErrorApiCount(Long errorApiCount) {
            this.errorApiCount = errorApiCount;
            return this;
        }
        public Long getErrorApiCount() {
            return this.errorApiCount;
        }

        public GetDataServiceApiCallSummaryResponseBodyData setErrorAppCount(Long errorAppCount) {
            this.errorAppCount = errorAppCount;
            return this;
        }
        public Long getErrorAppCount() {
            return this.errorAppCount;
        }

        public GetDataServiceApiCallSummaryResponseBodyData setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetDataServiceApiCallSummaryResponseBodyData setErrorRate(Double errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public Double getErrorRate() {
            return this.errorRate;
        }

        public GetDataServiceApiCallSummaryResponseBodyData setOfflineRate(Double offlineRate) {
            this.offlineRate = offlineRate;
            return this;
        }
        public Double getOfflineRate() {
            return this.offlineRate;
        }

    }

}
