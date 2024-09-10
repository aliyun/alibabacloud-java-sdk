// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of invalid parameters.</p>
     * <p>If a request parameter is invalid, the details of the invalid parameter are returned.</p>
     */
    @NameInMap("ErrorDetail")
    public java.util.List<PutHybridMonitorMetricDataResponseBodyErrorDetail> errorDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DB1CBCA-D14A-55FA-814F-B4DBD9735F68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutHybridMonitorMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutHybridMonitorMetricDataResponseBody self = new PutHybridMonitorMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PutHybridMonitorMetricDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutHybridMonitorMetricDataResponseBody setErrorDetail(java.util.List<PutHybridMonitorMetricDataResponseBodyErrorDetail> errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public java.util.List<PutHybridMonitorMetricDataResponseBodyErrorDetail> getErrorDetail() {
        return this.errorDetail;
    }

    public PutHybridMonitorMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PutHybridMonitorMetricDataResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The error message of the invalid parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>label name :123 not match [a-zA-Z_][a-zA-Z0-9_]*</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The position of the error message in the array.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        public static PutHybridMonitorMetricDataResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            PutHybridMonitorMetricDataResponseBodyErrorDetail self = new PutHybridMonitorMetricDataResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public PutHybridMonitorMetricDataResponseBodyErrorDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PutHybridMonitorMetricDataResponseBodyErrorDetail setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

}
