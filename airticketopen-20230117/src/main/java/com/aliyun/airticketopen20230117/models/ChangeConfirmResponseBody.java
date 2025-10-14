// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeConfirmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeConfirmResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("pay_amount")
        public Double payAmount;

        /**
         * <strong>example:</strong>
         * <p>1756797933000</p>
         */
        @NameInMap("pay_time")
        public Long payTime;

        /**
         * <strong>example:</strong>
         * <p>hkduendkd-2023-dj0</p>
         */
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

        public ChangeConfirmResponseBodyData setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
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
