// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountTransactionDetailsRequest extends TeaModel {
    /**
     * <p>The end time of creation.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-20</p>
     */
    @NameInMap("CreateTimeEnd")
    public String createTimeEnd;

    /**
     * <p>The start time of creation.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-20</p>
     */
    @NameInMap("CreateTimeStart")
    public String createTimeStart;

    /**
     * <p>An invalid parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The paging token for the paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>ABEDSDS124DASA</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order ID or bill ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2022120336190912</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <p>The transaction channel. If you specify one of the following transaction channel types, the query returns results of the specified type. If no results are found, an empty result is returned. If you do not specify this parameter, all types are returned by default.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>AccountBalance: account balance</li>
     * <li>BankTransfer: bank transfer</li>
     * <li>Alipay: Alipay</li>
     * <li>AntCreditPay: Ant Credit Pay</li>
     * <li>OfflineRemittance: offline remittance</li>
     * <li>RegularBankCreditRefund: credit limit refund</li>
     * <li>CreditCard: credit card</li>
     * <li>MyBankCredit: MYbank credit</li>
     * <li>HuaxiaBankCInstallment: Huaxia Bank installment</li>
     * <li>ApplePay: Apple Pay</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AccountBalance</p>
     */
    @NameInMap("TransactionChannel")
    public String transactionChannel;

    /**
     * <p>The payment reference No. of the transaction channel.</p>
     * 
     * <strong>example:</strong>
     * <p>2022112122001470591458665933</p>
     */
    @NameInMap("TransactionChannelSN")
    public String transactionChannelSN;

    /**
     * <p>The transaction number.</p>
     * 
     * <strong>example:</strong>
     * <p>410874027490089</p>
     */
    @NameInMap("TransactionNumber")
    public String transactionNumber;

    /**
     * <p>The transaction type. If you specify one of the following transaction types, the query returns results of the specified type. If no results are found, an empty result is returned. If you do not specify this parameter, all types are returned by default.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Payment: top-up</li>
     * <li>Withdraw: withdrawal</li>
     * <li>Refund: refund</li>
     * <li>Consumption: consumption</li>
     * <li>Transfer: transfer</li>
     * <li>Adjust: adjustment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Payment</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

    public static QueryAccountTransactionDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTransactionDetailsRequest self = new QueryAccountTransactionDetailsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountTransactionDetailsRequest setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public QueryAccountTransactionDetailsRequest setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public QueryAccountTransactionDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryAccountTransactionDetailsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryAccountTransactionDetailsRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QueryAccountTransactionDetailsRequest setTransactionChannel(String transactionChannel) {
        this.transactionChannel = transactionChannel;
        return this;
    }
    public String getTransactionChannel() {
        return this.transactionChannel;
    }

    public QueryAccountTransactionDetailsRequest setTransactionChannelSN(String transactionChannelSN) {
        this.transactionChannelSN = transactionChannelSN;
        return this;
    }
    public String getTransactionChannelSN() {
        return this.transactionChannelSN;
    }

    public QueryAccountTransactionDetailsRequest setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public QueryAccountTransactionDetailsRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

}
