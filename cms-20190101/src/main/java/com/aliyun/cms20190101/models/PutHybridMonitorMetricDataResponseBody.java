// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataResponseBody extends TeaModel {
    /**
     * <p>The details of the invalid parameters.</p>
     * <br>
     * <p>If the request parameters that you set are invalid, the details of the invalid parameters are displayed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("ErrorDetail")
    public java.util.List<PutHybridMonitorMetricDataResponseBodyErrorDetail> errorDetail;

    /**
     * <p>The ID of the request.</p>
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
        @NameInMap("ErrorMessage")
        public String errorMessage;

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
