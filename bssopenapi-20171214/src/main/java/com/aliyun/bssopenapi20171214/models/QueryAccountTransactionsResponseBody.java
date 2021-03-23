// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryAccountTransactionsResponseBodyData data;

    public static QueryAccountTransactionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsResponseBody self = new QueryAccountTransactionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccountTransactionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAccountTransactionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountTransactionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAccountTransactionsResponseBody setData(QueryAccountTransactionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountTransactionsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList extends TeaModel {
        @NameInMap("TransactionNumber")
        public String transactionNumber;

        @NameInMap("TransactionTime")
        public String transactionTime;

        @NameInMap("TransactionFlow")
        public String transactionFlow;

        @NameInMap("TransactionType")
        public String transactionType;

        @NameInMap("TransactionChannel")
        public String transactionChannel;

        @NameInMap("TransactionChannelSN")
        public String transactionChannelSN;

        @NameInMap("FundType")
        public String fundType;

        @NameInMap("RecordID")
        public String recordID;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("BillingCycle")
        public String billingCycle;

        @NameInMap("Amount")
        public String amount;

        @NameInMap("Balance")
        public String balance;

        @NameInMap("TransactionAccount")
        public String transactionAccount;

        public static QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList self = new QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionNumber(String transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }
        public String getTransactionNumber() {
            return this.transactionNumber;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionFlow(String transactionFlow) {
            this.transactionFlow = transactionFlow;
            return this;
        }
        public String getTransactionFlow() {
            return this.transactionFlow;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionChannel(String transactionChannel) {
            this.transactionChannel = transactionChannel;
            return this;
        }
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionChannelSN(String transactionChannelSN) {
            this.transactionChannelSN = transactionChannelSN;
            return this;
        }
        public String getTransactionChannelSN() {
            return this.transactionChannelSN;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public String getRecordID() {
            return this.recordID;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

    }

    public static class QueryAccountTransactionsResponseBodyDataAccountTransactionsList extends TeaModel {
        @NameInMap("AccountTransactionsList")
        public java.util.List<QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList> accountTransactionsList;

        public static QueryAccountTransactionsResponseBodyDataAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseBodyDataAccountTransactionsList self = new QueryAccountTransactionsResponseBodyDataAccountTransactionsList();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsList setAccountTransactionsList(java.util.List<QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList> accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public java.util.List<QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList> getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

    public static class QueryAccountTransactionsResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("AccountTransactionsList")
        public QueryAccountTransactionsResponseBodyDataAccountTransactionsList accountTransactionsList;

        public static QueryAccountTransactionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseBodyData self = new QueryAccountTransactionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAccountTransactionsResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public QueryAccountTransactionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public QueryAccountTransactionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccountTransactionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAccountTransactionsResponseBodyData setAccountTransactionsList(QueryAccountTransactionsResponseBodyDataAccountTransactionsList accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public QueryAccountTransactionsResponseBodyDataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
        }

    }

}
