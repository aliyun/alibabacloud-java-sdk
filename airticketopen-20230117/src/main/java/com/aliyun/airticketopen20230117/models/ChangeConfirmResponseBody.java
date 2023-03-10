// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeConfirmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeConfirmResponseBodyData data;

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

    public static ChangeConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeConfirmResponseBody self = new ChangeConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeConfirmResponseBody setData(ChangeConfirmResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeConfirmResponseBodyData getData() {
        return this.data;
    }

    public ChangeConfirmResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeConfirmResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeConfirmResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeConfirmResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeConfirmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeConfirmResponseBodyData extends TeaModel {
        @NameInMap("pay_amount")
        public Double payAmount;

        @NameInMap("transaction_no")
        public String transactionNo;

        public static ChangeConfirmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeConfirmResponseBodyData self = new ChangeConfirmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeConfirmResponseBodyData setPayAmount(Double payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Double getPayAmount() {
            return this.payAmount;
        }

        public ChangeConfirmResponseBodyData setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

}
