// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public TicketingResponseBodyData data;

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

    public static TicketingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketingResponseBody self = new TicketingResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketingResponseBody setData(TicketingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketingResponseBodyData getData() {
        return this.data;
    }

    public TicketingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketingResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public TicketingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketingResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public TicketingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketingResponseBodyData extends TeaModel {
        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("transaction_no")
        public String transactionNo;

        public static TicketingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketingResponseBodyData self = new TicketingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketingResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public TicketingResponseBodyData setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

}
