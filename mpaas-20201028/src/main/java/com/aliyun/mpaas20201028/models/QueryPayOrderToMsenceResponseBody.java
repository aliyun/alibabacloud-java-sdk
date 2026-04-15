// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPayOrderToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasUserGamecenterPaymentQuerystatusResponse")
    public QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPayOrderToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPayOrderToMsenceResponseBody self = new QueryPayOrderToMsenceResponseBody();
        return TeaModel.build(map, self);
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderStatus")
        public String orderStatus;

        public static QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse self = new QueryPayOrderToMsenceResponseBodyMpaasUserGamecenterPaymentQuerystatusResponse();
            return TeaModel.build(map, self);
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
