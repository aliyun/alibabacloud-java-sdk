// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionsRequest extends TeaModel {
    /**
     * <p>The end of the creation time range to query. By default, the transactions in the last month are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-01-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-06T01:55:00Z</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The beginning of the creation time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2018-01-01T00:00:00Z.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-05T01:46:09Z</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the order or bill.</p>
     * 
     * <strong>example:</strong>
     * <p>20200302</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <p>The transaction channel. If you specify one of the following transaction channels for this parameter, the results for the specified transaction channel are returned. If the transaction channel that you specify does not belong to the following transaction channels, no result is returned. If you leave this parameter empty, the results for all the following transaction channels are returned by default. Valid values:</p>
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
     * <p>12342134</p>
     */
    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    /**
     * <p>The type of the transaction flow. If you specify one of the following types for this parameter, the results for the specified type are returned. If the type that you specify does not belong to the following types, no result is returned. If you leave this parameter empty, the results for the following two types are returned by default. Valid values:</p>
     * <ul>
     * <li>Income</li>
     * <li>Expense</li>
     * </ul>
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
     * <p>133314076</p>
     */
    @NameInMap("TransactionNumber")
    public String transactionNumber;

    /**
     * <p>The type of the transaction. If you specify one of the following transaction types for this parameter, the results for the specified transaction type are returned. If the transaction type that you specify does not belong to the following types, no result is returned. If you leave this parameter empty, the results for all the following transaction types are returned by default. Valid values:</p>
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
