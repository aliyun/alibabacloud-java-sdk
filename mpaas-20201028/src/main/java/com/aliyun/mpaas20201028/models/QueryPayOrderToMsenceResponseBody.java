// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPayOrderToMsenceResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("MpaasUserGamecenterPaymentQuerystatusResponse")
    public QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPayOrderToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPayOrderToMsenceResponseBody self = new QueryPayOrderToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPayOrderToMsenceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPayOrderToMsenceResponseBody setMpaasUserGamecenterPaymentQuerystatusResponse(QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse) {
        this.mpaasUserGamecenterPaymentQuerystatusResponse = mpaasUserGamecenterPaymentQuerystatusResponse;
        return this;
    }
    public QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse getMpaasUserGamecenterPaymentQuerystatusResponse() {
        return this.mpaasUserGamecenterPaymentQuerystatusResponse;
    }

    public QueryPayOrderToMsenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPayOrderToMsenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPayOrderToMsenceResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPayOrderToMsenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse extends TeaModel {
        @NameInMap("CpExtra")
        public String cpExtra;

        @NameInMap("OrderStatus")
        public String orderStatus;

        public static QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse self = new QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse();
            return TeaModel.build(map, self);
        }

        public QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse setCpExtra(String cpExtra) {
            this.cpExtra = cpExtra;
            return this;
        }
        public String getCpExtra() {
            return this.cpExtra;
        }

        public QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

    }

}
