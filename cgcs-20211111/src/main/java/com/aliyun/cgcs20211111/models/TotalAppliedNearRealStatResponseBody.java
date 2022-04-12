// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedNearRealStatResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public TotalAppliedNearRealStatResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static TotalAppliedNearRealStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedNearRealStatResponseBody self = new TotalAppliedNearRealStatResponseBody();
        return TeaModel.build(map, self);
    }

    public TotalAppliedNearRealStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TotalAppliedNearRealStatResponseBody setData(TotalAppliedNearRealStatResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TotalAppliedNearRealStatResponseBodyData getData() {
        return this.data;
    }

    public TotalAppliedNearRealStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TotalAppliedNearRealStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TotalAppliedNearRealStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TotalAppliedNearRealStatResponseBodyData extends TeaModel {
        // 实时消耗并发
        @NameInMap("TotalConcurrency")
        public Long totalConcurrency;

        // 实时消耗CU
        @NameInMap("TotalConsumptionCu")
        public Double totalConsumptionCu;

        public static TotalAppliedNearRealStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TotalAppliedNearRealStatResponseBodyData self = new TotalAppliedNearRealStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TotalAppliedNearRealStatResponseBodyData setTotalConcurrency(Long totalConcurrency) {
            this.totalConcurrency = totalConcurrency;
            return this;
        }
        public Long getTotalConcurrency() {
            return this.totalConcurrency;
        }

        public TotalAppliedNearRealStatResponseBodyData setTotalConsumptionCu(Double totalConsumptionCu) {
            this.totalConsumptionCu = totalConsumptionCu;
            return this;
        }
        public Double getTotalConsumptionCu() {
            return this.totalConsumptionCu;
        }

    }

}
