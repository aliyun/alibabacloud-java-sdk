// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsResponse extends TeaModel {
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
    public QueryAccountTransactionsResponseData data;

    public static QueryAccountTransactionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsResponse self = new QueryAccountTransactionsResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList extends TeaModel {
        @NameInMap("TransactionNumber")
        @Validation(required = true)
        public String transactionNumber;

        @NameInMap("TransactionTime")
        @Validation(required = true)
        public String transactionTime;

        @NameInMap("TransactionFlow")
        @Validation(required = true)
        public String transactionFlow;

        @NameInMap("TransactionType")
        @Validation(required = true)
        public String transactionType;

        @NameInMap("TransactionChannel")
        @Validation(required = true)
        public String transactionChannel;

        @NameInMap("TransactionChannelSN")
        @Validation(required = true)
        public String transactionChannelSN;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        @NameInMap("RecordID")
        @Validation(required = true)
        public String recordID;

        @NameInMap("Remarks")
        @Validation(required = true)
        public String remarks;

        @NameInMap("BillingCycle")
        @Validation(required = true)
        public String billingCycle;

        @NameInMap("Amount")
        @Validation(required = true)
        public String amount;

        @NameInMap("Balance")
        @Validation(required = true)
        public String balance;

        @NameInMap("TransactionAccount")
        @Validation(required = true)
        public String transactionAccount;

        public static QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList self = new QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryAccountTransactionsResponseDataAccountTransactionsList extends TeaModel {
        @NameInMap("AccountTransactionsList")
        @Validation(required = true)
        public java.util.List<QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList> accountTransactionsList;

        public static QueryAccountTransactionsResponseDataAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseDataAccountTransactionsList self = new QueryAccountTransactionsResponseDataAccountTransactionsList();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryAccountTransactionsResponseData extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("AccountTransactionsList")
        @Validation(required = true)
        public QueryAccountTransactionsResponseDataAccountTransactionsList accountTransactionsList;

        public static QueryAccountTransactionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseData self = new QueryAccountTransactionsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
