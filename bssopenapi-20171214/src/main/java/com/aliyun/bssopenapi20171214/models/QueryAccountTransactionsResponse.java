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

    public QueryAccountTransactionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountTransactionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountTransactionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountTransactionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountTransactionsResponse setData(QueryAccountTransactionsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryAccountTransactionsResponseData getData() {
        return this.data;
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

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionNumber(String transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }
        public String getTransactionNumber() {
            return this.transactionNumber;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionFlow(String transactionFlow) {
            this.transactionFlow = transactionFlow;
            return this;
        }
        public String getTransactionFlow() {
            return this.transactionFlow;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionChannel(String transactionChannel) {
            this.transactionChannel = transactionChannel;
            return this;
        }
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionChannelSN(String transactionChannelSN) {
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }
        public String getTransactionChannelSN() {
            return this.transactionChannelSN;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
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

        public QueryAccountTransactionsResponseDataAccountTransactionsList setAccountTransactionsList(java.util.List<QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList> accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public java.util.List<QueryAccountTransactionsResponseDataAccountTransactionsListAccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
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

        public QueryAccountTransactionsResponseData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountTransactionsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAccountTransactionsResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccountTransactionsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAccountTransactionsResponseData setAccountTransactionsList(QueryAccountTransactionsResponseDataAccountTransactionsList accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public QueryAccountTransactionsResponseDataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

}
