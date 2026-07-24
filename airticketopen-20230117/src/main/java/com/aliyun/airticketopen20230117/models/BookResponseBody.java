// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned for a successful request.</p>
     */
    @NameInMap("data")
    public BookResponseBodyData data;

    /**
     * <p>The business error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The data returned with the error.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public BookResponseBodyErrorData errorData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>The HTTP status code. The value is always 200 for successful HTTP requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static BookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BookResponseBody self = new BookResponseBody();
        return TeaModel.build(map, self);
    }

    public BookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BookResponseBody setData(BookResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BookResponseBodyData getData() {
        return this.data;
    }

    public BookResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BookResponseBody setErrorData(BookResponseBodyErrorData errorData) {
        this.errorData = errorData;
        return this;
    }
    public BookResponseBodyErrorData getErrorData() {
        return this.errorData;
    }

    public BookResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public BookResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public BookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>14.2854</p>
         */
        @NameInMap("pay_intended_amount")
        public String payIntendedAmount;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("pay_intended_currency_code")
        public String payIntendedCurrencyCode;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("quotation_currency_code")
        public String quotationCurrencyCode;

        /**
         * <strong>example:</strong>
         * <p>7.1427</p>
         */
        @NameInMap("to_pay_currency_rate")
        public String toPayCurrencyRate;

        public static BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo self = new BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo setPayIntendedAmount(String payIntendedAmount) {
            this.payIntendedAmount = payIntendedAmount;
            return this;
        }
        public String getPayIntendedAmount() {
            return this.payIntendedAmount;
        }

        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo setPayIntendedCurrencyCode(String payIntendedCurrencyCode) {
            this.payIntendedCurrencyCode = payIntendedCurrencyCode;
            return this;
        }
        public String getPayIntendedCurrencyCode() {
            return this.payIntendedCurrencyCode;
        }

        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo setQuotationCurrencyCode(String quotationCurrencyCode) {
            this.quotationCurrencyCode = quotationCurrencyCode;
            return this;
        }
        public String getQuotationCurrencyCode() {
            return this.quotationCurrencyCode;
        }

        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo setToPayCurrencyRate(String toPayCurrencyRate) {
            this.toPayCurrencyRate = toPayCurrencyRate;
            return this;
        }
        public String getToPayCurrencyRate() {
            return this.toPayCurrencyRate;
        }

    }

    public static class BookResponseBodyDataOrderListOrderAttribute extends TeaModel {
        @NameInMap("aba_pay_lock_rate_info")
        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo abaPayLockRateInfo;

        public static BookResponseBodyDataOrderListOrderAttribute build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyDataOrderListOrderAttribute self = new BookResponseBodyDataOrderListOrderAttribute();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyDataOrderListOrderAttribute setAbaPayLockRateInfo(BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo abaPayLockRateInfo) {
            this.abaPayLockRateInfo = abaPayLockRateInfo;
            return this;
        }
        public BookResponseBodyDataOrderListOrderAttributeAbaPayLockRateInfo getAbaPayLockRateInfo() {
            return this.abaPayLockRateInfo;
        }

    }

    public static class BookResponseBodyDataOrderList extends TeaModel {
        @NameInMap("order_attribute")
        public BookResponseBodyDataOrderListOrderAttribute orderAttribute;

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        public static BookResponseBodyDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyDataOrderList self = new BookResponseBodyDataOrderList();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyDataOrderList setOrderAttribute(BookResponseBodyDataOrderListOrderAttribute orderAttribute) {
            this.orderAttribute = orderAttribute;
            return this;
        }
        public BookResponseBodyDataOrderListOrderAttribute getOrderAttribute() {
            return this.orderAttribute;
        }

        public BookResponseBodyDataOrderList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

    public static class BookResponseBodyData extends TeaModel {
        /**
         * <p>The list of order information.</p>
         */
        @NameInMap("order_list")
        public java.util.List<BookResponseBodyDataOrderList> orderList;

        public static BookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyData self = new BookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyData setOrderList(java.util.List<BookResponseBodyDataOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<BookResponseBodyDataOrderList> getOrderList() {
            return this.orderList;
        }

    }

    public static class BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>14.2854</p>
         */
        @NameInMap("pay_intended_amount")
        public String payIntendedAmount;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("pay_intended_currency_code")
        public String payIntendedCurrencyCode;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("quotation_currency_code")
        public String quotationCurrencyCode;

        /**
         * <strong>example:</strong>
         * <p>7.1427</p>
         */
        @NameInMap("to_pay_currency_rate")
        public String toPayCurrencyRate;

        public static BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo self = new BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo setPayIntendedAmount(String payIntendedAmount) {
            this.payIntendedAmount = payIntendedAmount;
            return this;
        }
        public String getPayIntendedAmount() {
            return this.payIntendedAmount;
        }

        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo setPayIntendedCurrencyCode(String payIntendedCurrencyCode) {
            this.payIntendedCurrencyCode = payIntendedCurrencyCode;
            return this;
        }
        public String getPayIntendedCurrencyCode() {
            return this.payIntendedCurrencyCode;
        }

        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo setQuotationCurrencyCode(String quotationCurrencyCode) {
            this.quotationCurrencyCode = quotationCurrencyCode;
            return this;
        }
        public String getQuotationCurrencyCode() {
            return this.quotationCurrencyCode;
        }

        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo setToPayCurrencyRate(String toPayCurrencyRate) {
            this.toPayCurrencyRate = toPayCurrencyRate;
            return this;
        }
        public String getToPayCurrencyRate() {
            return this.toPayCurrencyRate;
        }

    }

    public static class BookResponseBodyErrorDataOrderListOrderAttribute extends TeaModel {
        @NameInMap("aba_pay_lock_rate_info")
        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo abaPayLockRateInfo;

        public static BookResponseBodyErrorDataOrderListOrderAttribute build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorDataOrderListOrderAttribute self = new BookResponseBodyErrorDataOrderListOrderAttribute();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorDataOrderListOrderAttribute setAbaPayLockRateInfo(BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo abaPayLockRateInfo) {
            this.abaPayLockRateInfo = abaPayLockRateInfo;
            return this;
        }
        public BookResponseBodyErrorDataOrderListOrderAttributeAbaPayLockRateInfo getAbaPayLockRateInfo() {
            return this.abaPayLockRateInfo;
        }

    }

    public static class BookResponseBodyErrorDataOrderList extends TeaModel {
        @NameInMap("order_attribute")
        public BookResponseBodyErrorDataOrderListOrderAttribute orderAttribute;

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        public static BookResponseBodyErrorDataOrderList build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorDataOrderList self = new BookResponseBodyErrorDataOrderList();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorDataOrderList setOrderAttribute(BookResponseBodyErrorDataOrderListOrderAttribute orderAttribute) {
            this.orderAttribute = orderAttribute;
            return this;
        }
        public BookResponseBodyErrorDataOrderListOrderAttribute getOrderAttribute() {
            return this.orderAttribute;
        }

        public BookResponseBodyErrorDataOrderList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

    public static class BookResponseBodyErrorData extends TeaModel {
        /**
         * <p>The list of order information. If you call the Book operation again with the same parameters after a successful booking, the order number is returned.</p>
         */
        @NameInMap("order_list")
        public java.util.List<BookResponseBodyErrorDataOrderList> orderList;

        public static BookResponseBodyErrorData build(java.util.Map<String, ?> map) throws Exception {
            BookResponseBodyErrorData self = new BookResponseBodyErrorData();
            return TeaModel.build(map, self);
        }

        public BookResponseBodyErrorData setOrderList(java.util.List<BookResponseBodyErrorDataOrderList> orderList) {
            this.orderList = orderList;
            return this;
        }
        public java.util.List<BookResponseBodyErrorDataOrderList> getOrderList() {
            return this.orderList;
        }

    }

}
