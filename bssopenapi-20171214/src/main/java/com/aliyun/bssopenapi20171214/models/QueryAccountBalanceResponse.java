// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBalanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryAccountBalanceResponseData data;

    public static QueryAccountBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBalanceResponse self = new QueryAccountBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountBalanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountBalanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountBalanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountBalanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountBalanceResponse setData(QueryAccountBalanceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAccountBalanceResponseData getData() {
        return this.data;
    }

    public static class QueryAccountBalanceResponseData extends TeaModel {
        @NameInMap("AvailableAmount")
        @Validation(required = true)
        public String availableAmount;

        @NameInMap("AvailableCashAmount")
        @Validation(required = true)
        public String availableCashAmount;

        @NameInMap("CreditAmount")
        @Validation(required = true)
        public String creditAmount;

        @NameInMap("MybankCreditAmount")
        @Validation(required = true)
        public String mybankCreditAmount;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        public static QueryAccountBalanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBalanceResponseData self = new QueryAccountBalanceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAccountBalanceResponseData setAvailableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public String getAvailableAmount() {
            return this.availableAmount;
        }

        public QueryAccountBalanceResponseData setAvailableCashAmount(String availableCashAmount) {
            this.availableCashAmount = availableCashAmount;
            return this;
        }
        public String getAvailableCashAmount() {
            return this.availableCashAmount;
        }

        public QueryAccountBalanceResponseData setCreditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }
        public String getCreditAmount() {
            return this.creditAmount;
        }

        public QueryAccountBalanceResponseData setMybankCreditAmount(String mybankCreditAmount) {
            this.mybankCreditAmount = mybankCreditAmount;
            return this;
        }
        public String getMybankCreditAmount() {
            return this.mybankCreditAmount;
        }

        public QueryAccountBalanceResponseData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

}
