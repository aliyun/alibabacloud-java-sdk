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

    }

}
