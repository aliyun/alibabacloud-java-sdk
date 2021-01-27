// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBalanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAccountBalanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountBalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBalanceResponseBody self = new QueryAccountBalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountBalanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountBalanceResponseBody setData(QueryAccountBalanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountBalanceResponseBodyData getData() {
        return this.data;
    }

    public QueryAccountBalanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountBalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountBalanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountBalanceResponseBodyData extends TeaModel {
        @NameInMap("AvailableAmount")
        public String availableAmount;

        @NameInMap("AvailableCashAmount")
        public String availableCashAmount;

        @NameInMap("CreditAmount")
        public String creditAmount;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("MybankCreditAmount")
        public String mybankCreditAmount;

        public static QueryAccountBalanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountBalanceResponseBodyData self = new QueryAccountBalanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountBalanceResponseBodyData setAvailableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public String getAvailableAmount() {
            return this.availableAmount;
        }

        public QueryAccountBalanceResponseBodyData setAvailableCashAmount(String availableCashAmount) {
            this.availableCashAmount = availableCashAmount;
            return this;
        }
        public String getAvailableCashAmount() {
            return this.availableCashAmount;
        }

        public QueryAccountBalanceResponseBodyData setCreditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }
        public String getCreditAmount() {
            return this.creditAmount;
        }

        public QueryAccountBalanceResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryAccountBalanceResponseBodyData setMybankCreditAmount(String mybankCreditAmount) {
            this.mybankCreditAmount = mybankCreditAmount;
            return this;
        }
        public String getMybankCreditAmount() {
            return this.mybankCreditAmount;
        }

    }

}
