// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAccountTransactionDetailsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAccountTransactionDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionDetailsResponseBody self = new QueryAccountTransactionDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountTransactionDetailsResponseBody setData(QueryAccountTransactionDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountTransactionDetailsResponseBodyData getData() {
        return this.data;
    }

    public QueryAccountTransactionDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountTransactionDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountTransactionDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList extends TeaModel {
        @NameInMap("Amount")
        public String amount;

        @NameInMap("Balance")
        public String balance;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("FundType")
        public String fundType;

        @NameInMap("RecordID")
        public String recordID;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("TransactionAccount")
        public String transactionAccount;

        @NameInMap("TransactionChannel")
        public String transactionChannel;

        @NameInMap("TransactionChannelSN")
        public String transactionChannelSN;

        @NameInMap("TransactionFlow")
        public String transactionFlow;

        @NameInMap("TransactionNumber")
        public String transactionNumber;

        @NameInMap("TransactionTime")
        public String transactionTime;

        @NameInMap("TransactionType")
        public String transactionType;

        public static QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList self = new QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionChannel(String transactionChannel) {
            this.transactionChannel = transactionChannel;
            return this;
        }
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionChannelSN(String transactionChannelSN) {
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }
        public String getTransactionChannelSN() {
            return this.transactionChannelSN;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionFlow(String transactionFlow) {
            this.transactionFlow = transactionFlow;
            return this;
        }
        public String getTransactionFlow() {
            return this.transactionFlow;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionNumber(String transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }
        public String getTransactionNumber() {
            return this.transactionNumber;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

    }

    public static class QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList extends TeaModel {
        @NameInMap("AccountTransactionsList")
        public java.util.List<QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList> accountTransactionsList;

        public static QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList self = new QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList setAccountTransactionsList(java.util.List<QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList> accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public java.util.List<QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsListAccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

    public static class QueryAccountTransactionDetailsResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountTransactionsList")
        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList accountTransactionsList;

        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryAccountTransactionDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseBodyData self = new QueryAccountTransactionDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountTransactionDetailsResponseBodyData setAccountTransactionsList(QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

        public QueryAccountTransactionDetailsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public QueryAccountTransactionDetailsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryAccountTransactionDetailsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
