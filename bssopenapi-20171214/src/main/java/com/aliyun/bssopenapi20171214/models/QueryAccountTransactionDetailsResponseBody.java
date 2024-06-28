// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryAccountTransactionDetailsResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>asadadad-edafafafaasd</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The amount of the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>1.00</p>
         */
        @NameInMap("Amount")
        public String amount;

        /**
         * <p>The balance of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The billing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The type of transaction payment. Valid values:</p>
         * <p>Cash: pay for the transaction in cash. Deposit: pay for the transaction with deposit. RegularBankCreditRefund: pay for the transaction with credit refund controlled by a bank. DirectPay: directly pay for the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>Cash</p>
         */
        @NameInMap("FundType")
        public String fundType;

        /**
         * <p>The ID of the order or bill.</p>
         * 
         * <strong>example:</strong>
         * <p>2022120336190912</p>
         */
        @NameInMap("RecordID")
        public String recordID;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The transaction account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:fortune_test@xxx.com">fortune_test@xxx.com</a></p>
         */
        @NameInMap("TransactionAccount")
        public String transactionAccount;

        /**
         * <p>The transaction channel.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        @NameInMap("TransactionChannel")
        public String transactionChannel;

        /**
         * <p>The serial number of the transaction channel.</p>
         * 
         * <strong>example:</strong>
         * <p>123232434343532</p>
         */
        @NameInMap("TransactionChannelSN")
        public String transactionChannelSN;

        /**
         * <p>Indicates whether the transaction is of the income type or the expenditure type. If one of the following types is specified, results for the specific type are returned. If the type that you specified for the parameter does not belong to the following types, no result is returned. If the parameter is left empty, results for transactions of the income and expenditure types are all returned. Valid values:</p>
         * <p>Income and Expense.</p>
         * 
         * <strong>example:</strong>
         * <p>Income</p>
         */
        @NameInMap("TransactionFlow")
        public String transactionFlow;

        /**
         * <p>The number of the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>43342334</p>
         */
        @NameInMap("TransactionNumber")
        public String transactionNumber;

        /**
         * <p>The time when the transaction was made.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

        /**
         * <p>The type of the transaction. If one of the following transaction types is specified, results for the specified transaction type are returned. If the transaction type that you specified does not belong to the following transaction types, no result is returned. If the parameter is left empty, results for all transaction types are returned. Valid values:</p>
         * <p>Payment, Withdraw, Refund, Consumption, Transfer, and Adjust.</p>
         * 
         * <strong>example:</strong>
         * <p>Consumption</p>
         */
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
        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>yidi</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The details of the transactions within the account.</p>
         */
        @NameInMap("AccountTransactionsList")
        public QueryAccountTransactionDetailsResponseBodyDataAccountTransactionsList accountTransactionsList;

        /**
         * <p>This parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The token that is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>ASHDADS</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
