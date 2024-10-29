// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyResponseBody extends TeaModel {
    /**
     * <p>request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public RefundApplyResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>error data</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http reqeust has been processed successfully，status code is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true represents success, false represents failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RefundApplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundApplyResponseBody self = new RefundApplyResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundApplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundApplyResponseBody setData(RefundApplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefundApplyResponseBodyData getData() {
        return this.data;
    }

    public RefundApplyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefundApplyResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public RefundApplyResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RefundApplyResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RefundApplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefundApplyResponseBodyDataRefundResultsRefundPassengers extends TeaModel {
        /**
         * <p>credential number</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>first name</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>last name</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static RefundApplyResponseBodyDataRefundResultsRefundPassengers build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyResponseBodyDataRefundResultsRefundPassengers self = new RefundApplyResponseBodyDataRefundResultsRefundPassengers();
            return TeaModel.build(map, self);
        }

        public RefundApplyResponseBodyDataRefundResultsRefundPassengers setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public RefundApplyResponseBodyDataRefundResultsRefundPassengers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public RefundApplyResponseBodyDataRefundResultsRefundPassengers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class RefundApplyResponseBodyDataRefundResults extends TeaModel {
        /**
         * <p>reason for refund application failure</p>
         * 
         * <strong>example:</strong>
         * <p>desc reason</p>
         */
        @NameInMap("fail_reason")
        public String failReason;

        /**
         * <p>refund order number</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617202</p>
         */
        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        /**
         * <p>passengers of current refund order</p>
         */
        @NameInMap("refund_passengers")
        public java.util.List<RefundApplyResponseBodyDataRefundResultsRefundPassengers> refundPassengers;

        /**
         * <p>refund order status </p>
         * <p>0: refund order created successfully</p>
         * <p>1: refund order creation failed</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        public static RefundApplyResponseBodyDataRefundResults build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyResponseBodyDataRefundResults self = new RefundApplyResponseBodyDataRefundResults();
            return TeaModel.build(map, self);
        }

        public RefundApplyResponseBodyDataRefundResults setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public RefundApplyResponseBodyDataRefundResults setRefundOrderNum(Long refundOrderNum) {
            this.refundOrderNum = refundOrderNum;
            return this;
        }
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        public RefundApplyResponseBodyDataRefundResults setRefundPassengers(java.util.List<RefundApplyResponseBodyDataRefundResultsRefundPassengers> refundPassengers) {
            this.refundPassengers = refundPassengers;
            return this;
        }
        public java.util.List<RefundApplyResponseBodyDataRefundResultsRefundPassengers> getRefundPassengers() {
            return this.refundPassengers;
        }

        public RefundApplyResponseBodyDataRefundResults setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class RefundApplyResponseBodyData extends TeaModel {
        /**
         * <p>order number</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>refund results</p>
         */
        @NameInMap("refund_results")
        public java.util.List<RefundApplyResponseBodyDataRefundResults> refundResults;

        public static RefundApplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyResponseBodyData self = new RefundApplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefundApplyResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public RefundApplyResponseBodyData setRefundResults(java.util.List<RefundApplyResponseBodyDataRefundResults> refundResults) {
            this.refundResults = refundResults;
            return this;
        }
        public java.util.List<RefundApplyResponseBodyDataRefundResults> getRefundResults() {
            return this.refundResults;
        }

    }

}
