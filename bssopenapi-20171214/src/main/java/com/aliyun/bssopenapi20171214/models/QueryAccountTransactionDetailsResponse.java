// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsResponse extends TeaModel {
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
    public QueryAccountTransactionDetailsResponseData data;

    public static QueryAccountTransactionDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionDetailsResponse self = new QueryAccountTransactionDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountTransactionDetailsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountTransactionDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountTransactionDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountTransactionDetailsResponse setData(QueryAccountTransactionDetailsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAccountTransactionDetailsResponseData getData() {
        return this.data;
    }

    public static class QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList extends TeaModel {
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

        public static QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList self = new QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionNumber(String transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }
        public String getTransactionNumber() {
            return this.transactionNumber;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionFlow(String transactionFlow) {
            this.transactionFlow = transactionFlow;
            return this;
        }
        public String getTransactionFlow() {
            return this.transactionFlow;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionChannel(String transactionChannel) {
            this.transactionChannel = transactionChannel;
            return this;
        }
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionChannelSN(String transactionChannelSN) {
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }
        public String getTransactionChannelSN() {
            return this.transactionChannelSN;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

    }

    public static class QueryAccountTransactionDetailsResponseDataAccountTransactionsList extends TeaModel {
        @NameInMap("AccountTransactionsList")
        @Validation(required = true)
        public java.util.List<QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList> accountTransactionsList;

        public static QueryAccountTransactionDetailsResponseDataAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseDataAccountTransactionsList self = new QueryAccountTransactionDetailsResponseDataAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseDataAccountTransactionsList setAccountTransactionsList(java.util.List<QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList> accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public java.util.List<QueryAccountTransactionDetailsResponseDataAccountTransactionsListAccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

    public static class QueryAccountTransactionDetailsResponseData extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("NextToken")
        @Validation(required = true)
        public String nextToken;

        @NameInMap("MaxResults")
        @Validation(required = true)
        public Integer maxResults;

        @NameInMap("AccountTransactionsList")
        @Validation(required = true)
        public QueryAccountTransactionDetailsResponseDataAccountTransactionsList accountTransactionsList;

        public static QueryAccountTransactionDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionDetailsResponseData self = new QueryAccountTransactionDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionDetailsResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountTransactionDetailsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAccountTransactionDetailsResponseData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public QueryAccountTransactionDetailsResponseData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public QueryAccountTransactionDetailsResponseData setAccountTransactionsList(QueryAccountTransactionDetailsResponseDataAccountTransactionsList accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public QueryAccountTransactionDetailsResponseDataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

}
