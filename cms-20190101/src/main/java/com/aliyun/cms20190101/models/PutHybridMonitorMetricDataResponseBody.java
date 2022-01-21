// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutHybridMonitorMetricDataResponseBody extends TeaModel {
    // 返回code
    @NameInMap("Code")
    public String code;

    // 不合法的指标信息
    @NameInMap("ErrorDetail")
    public java.util.List<PutHybridMonitorMetricDataResponseBodyErrorDetail> errorDetail;

    // 请求的requestId
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
        // 错误信息
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // 错误数据在上报列表中的序号，从0开始
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
