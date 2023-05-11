// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyResponseBody extends TeaModel {
    /**
     * <p>请求 RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public RefundApplyResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

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
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

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
        @NameInMap("fail_reason")
        public String failReason;

        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        @NameInMap("refund_passengers")
        public java.util.List<RefundApplyResponseBodyDataRefundResultsRefundPassengers> refundPassengers;

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
        @NameInMap("order_num")
        public Long orderNum;

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
