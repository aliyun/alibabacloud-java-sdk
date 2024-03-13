// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBalanceResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryAccountBalanceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The available balance of the account.</p>
         */
        @NameInMap("AvailableAmount")
        public String availableAmount;

        /**
         * <p>The available balance in cash.</p>
         */
        @NameInMap("AvailableCashAmount")
        public String availableCashAmount;

        /**
         * <p>The credit balance of the account.</p>
         */
        @NameInMap("CreditAmount")
        public String creditAmount;

        /**
         * <p>The type of the currency. Valid values:</p>
         * <br>
         * <p>*   CNY: Chinese Yuan</p>
         * <p>*   USD: US dollar</p>
         * <p>*   JPY: Japanese Yen</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The credit line controlled by MYbank.</p>
         */
        @NameInMap("MybankCreditAmount")
        public String mybankCreditAmount;

        @NameInMap("QuotaLimit")
        public String quotaLimit;

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

        public QueryAccountBalanceResponseBodyData setQuotaLimit(String quotaLimit) {
            this.quotaLimit = quotaLimit;
            return this;
        }
        public String getQuotaLimit() {
            return this.quotaLimit;
        }

    }

}
