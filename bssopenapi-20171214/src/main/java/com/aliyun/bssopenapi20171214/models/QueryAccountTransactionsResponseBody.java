// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryAccountTransactionsResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8634E02D-0942-4B1D-8295-5352FE9A1F39</p>
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

    public static QueryAccountTransactionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsResponseBody self = new QueryAccountTransactionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAccountTransactionsResponseBody setData(QueryAccountTransactionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAccountTransactionsResponseBodyData getData() {
        return this.data;
    }

    public QueryAccountTransactionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList extends TeaModel {
        /**
         * <p>The amount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The billing cycle. Format: YYYY-MM.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03</p>
         */
        @NameInMap("BillingCycle")
        public String billingCycle;

        /**
         * <p>The type of transaction payment. Valid values:</p>
         * <ul>
         * <li>Cash: pay for the transaction in cash.</li>
         * <li>Deposit: pay for the transaction with deposit.</li>
         * <li>RegularBankCreditRefund: pay for the transaction with credit refund controlled by a bank.</li>
         * <li>DirectPay: directly pay for the transaction.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cash</p>
         */
        @NameInMap("FundType")
        public String fundType;

        /**
         * <p>The number of the order or bill.</p>
         * 
         * <strong>example:</strong>
         * <p>2020030242</p>
         */
        @NameInMap("RecordID")
        public String recordID;

        /**
         * <p>The remarks on the transaction.</p>
         * 
         * <strong>example:</strong>
         * <p>NAT_GW</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The transaction account. For example, the account is a recharge account in Alipay or a transfer account.</p>
         * 
         * <strong>example:</strong>
         * <p>213562146</p>
         */
        @NameInMap("TransactionAccount")
        public String transactionAccount;

        /**
         * <p>The transaction channel.</p>
         * <ul>
         * <li>AccountBalance</li>
         * <li>BankTransfer</li>
         * <li>Alipay</li>
         * <li>AntCreditPay</li>
         * <li>OfflineRemittance</li>
         * <li>RegularBankCreditRefund</li>
         * <li>CreditCard</li>
         * <li>MyBankCredit</li>
         * <li>HuaxiaBankCInstallment</li>
         * <li>ApplePay</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountBalance</p>
         */
        @NameInMap("TransactionChannel")
        public String transactionChannel;

        /**
         * <p>The serial number of the transaction channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1234354325</p>
         */
        @NameInMap("TransactionChannelSN")
        public String transactionChannelSN;

        /**
         * <p>The type of the transaction flow.</p>
         * <ul>
         * <li>Income</li>
         * <li>Expense</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Expense</p>
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
         * <p>2020-03-10T02:03:20Z</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

        /**
         * <p>The type of the transaction.</p>
         * <ul>
         * <li>Payment</li>
         * <li>Withdraw</li>
         * <li>Refund</li>
         * <li>Consumption</li>
         * <li>Transfer</li>
         * <li>Adjust</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Consumption</p>
         */
        @NameInMap("TransactionType")
        public String transactionType;

        public static QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList self = new QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList();
            return TeaModel.build(map, self);
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

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setBillingCycle(String billingCycle) {
            this.billingCycle = billingCycle;
            return this;
        }
        public String getBillingCycle() {
            return this.billingCycle;
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

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
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

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionFlow(String transactionFlow) {
            this.transactionFlow = transactionFlow;
            return this;
        }
        public String getTransactionFlow() {
            return this.transactionFlow;
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

        public QueryAccountTransactionsResponseBodyDataAccountTransactionsListAccountTransactionsList setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
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
        /**
         * <p>The name of your Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The information about transactions.</p>
         */
        @NameInMap("AccountTransactionsList")
        public QueryAccountTransactionsResponseBodyDataAccountTransactionsList accountTransactionsList;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

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

        public QueryAccountTransactionsResponseBodyData setAccountTransactionsList(QueryAccountTransactionsResponseBodyDataAccountTransactionsList accountTransactionsList) {
            this.accountTransactionsList = accountTransactionsList;
            return this;
        }
        public QueryAccountTransactionsResponseBodyDataAccountTransactionsList getAccountTransactionsList() {
            return this.accountTransactionsList;
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

        public QueryAccountTransactionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
