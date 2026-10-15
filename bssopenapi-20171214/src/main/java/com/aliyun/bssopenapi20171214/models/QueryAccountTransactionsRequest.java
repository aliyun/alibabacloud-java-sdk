// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsRequest extends TeaModel {
    /**
     * <p>The end time of the creation time range. If not specified, the default value is the current time. Example: 2018-01-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-06T01:55:00Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start time of the creation time range. If not specified, the default value is one month before the current time. Example: 2018-01-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-05T01:46:09Z</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The order or bill number.</p>
     * 
     * <strong>example:</strong>
     * <p>20200302</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <p>The transaction channel. If you specify a transaction channel, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
     * <ul>
     * <li>AccountBalance: Account balance.</li>
     * <li>BankTransfer: Bank transfer.</li>
     * <li>Alipay: Alipay.</li>
     * <li>AntCreditPay: Ant Credit Pay.</li>
     * <li>OfflineRemittance: Offline remittance.</li>
     * <li>RegularBankCreditRefund: Credit-based payment refund.</li>
     * <li>CreditCard: Credit card.</li>
     * <li>MyBankCredit: MYbank Credit.</li>
     * <li>HuaxiaBankCInstallment: Huaxia Bank installment.</li>
     * <li>ApplePay: Apple Pay.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AccountBalance</p>
     */
    @NameInMap("TransactionChannel")
    public String transactionChannel;

    /**
     * <p>The payment reference No.</p>
     * 
     * <strong>example:</strong>
     * <p>12342134</p>
     */
    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    /**
     * <p>The income and expense type. If you specify an income and expense type, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
     * <ul>
     * <li>Income: Income.</li>
     * <li>Expense: Expense.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Income</p>
     */
    @NameInMap("TransactionFlow")
    public String transactionFlow;

    /**
     * <p>The transaction number.</p>
     * 
     * <strong>example:</strong>
     * <p>133314076</p>
     */
    @NameInMap("TransactionNumber")
    public String transactionNumber;

    /**
     * <p>The transaction type. If you specify a transaction type, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
     * <ul>
     * <li>Payment: Top-up.</li>
     * <li>Withdraw: Withdrawal.</li>
     * <li>Refund: Refund.</li>
     * <li>Consumption: Consumption.</li>
     * <li>Transfer: Transfer.</li>
     * <li>Adjust: Adjustment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Payment</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

    public static QueryAccountTransactionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionsRequest self = new QueryAccountTransactionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAccountTransactionsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryAccountTransactionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAccountTransactionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAccountTransactionsRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QueryAccountTransactionsRequest setTransactionChannel(String transactionChannel) {
        this.transactionChannel = transactionChannel;
        return this;
    }
    public String getTransactionChannel() {
        return this.transactionChannel;
    }

    public QueryAccountTransactionsRequest setTransactionChannelSN(String transactionChannelSN) {
        this.transactionChannelSN = transactionChannelSN;
        return this;
    }
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    public QueryAccountTransactionsRequest setTransactionFlow(String transactionFlow) {
        this.transactionFlow = transactionFlow;
        return this;
    }
    public String getTransactionFlow() {
        return this.transactionFlow;
    }

    public QueryAccountTransactionsRequest setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public QueryAccountTransactionsRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
