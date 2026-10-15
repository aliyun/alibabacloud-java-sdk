// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsShrinkRequest extends TeaModel {
    /**
     * <p>The transaction order number.</p>
     * 
     * <strong>example:</strong>
     * <p>2023212312321</p>
     */
    @NameInMap("BillNumber")
    public String billNumber;

    /**
     * <p>The payment reference No.</p>
     * 
     * <strong>example:</strong>
     * <p>20250312334312322</p>
     */
    @NameInMap("ChannelTransactionNumber")
    public String channelTransactionNumber;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end timestamp for the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735664561000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the fund account. If you do not specify this parameter, the ID of the account owned by the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>123221232</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    /**
     * <p>The number of entries per page. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start timestamp for the query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1735664461000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of transaction channels. If you specify this parameter, transactions are queried by channel. If you do not specify this parameter, all channels are queried by default. Valid values:</p>
     * <ul>
     * <li>ACCT_CASH: User balance.</li>
     * <li>ALIPAY: Alipay.</li>
     * <li>ALIPAY_ZHIFUTONG: Alipay Zhifutong.</li>
     * <li>OFFLINE_REMIT: Corporate remittance.</li>
     * <li>REFUND: Credit limit refund.</li>
     * <li>UNION_PAY_BANK: Online banking.</li>
     * <li>CREDIT_CARD: Credit card. Available only on the international site.</li>
     * <li>AYPAL: PayPal. Available only on the international site.</li>
     * </ul>
     */
    @NameInMap("TransactionChannelList")
    public String transactionChannelListShrink;

    /**
     * <p>The direction of the transaction.</p>
     * 
     * <strong>example:</strong>
     * <p>IN</p>
     */
    @NameInMap("TransactionDirection")
    public String transactionDirection;

    /**
     * <p>The transaction number.</p>
     * 
     * <strong>example:</strong>
     * <p>543231231</p>
     */
    @NameInMap("TransactionNumber")
    public Long transactionNumber;

    /**
     * <p>The transaction type. If you specify a transaction type, the query returns results of the corresponding type. If no results exist, an empty result is returned. If you do not specify this parameter, all types are returned by default. Valid values:</p>
     * <ul>
     * <li>CHARGE: Top-up.</li>
     * <li>WITHDRAW: Withdrawal.</li>
     * <li>REFUND: Refund.</li>
     * <li>PAY: Payment.</li>
     * <li>TRANSFER: Transfer.</li>
     * <li>ADJUST: Adjustment.</li>
     * <li>PAY_FAILED: Refund for failed order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CHARGE</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

    /**
     * <p>The list of transaction types. You can specify multiple parameters for a parameter query.</p>
     */
    @NameInMap("TransactionTypeList")
    public String transactionTypeListShrink;

    public static GetFundAccountTransactionDetailsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountTransactionDetailsShrinkRequest self = new GetFundAccountTransactionDetailsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountTransactionDetailsShrinkRequest setBillNumber(String billNumber) {
        this.billNumber = billNumber;
        return this;
    }
    public String getBillNumber() {
        return this.billNumber;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setChannelTransactionNumber(String channelTransactionNumber) {
        this.channelTransactionNumber = channelTransactionNumber;
        return this;
    }
    public String getChannelTransactionNumber() {
        return this.channelTransactionNumber;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setTransactionChannelListShrink(String transactionChannelListShrink) {
        this.transactionChannelListShrink = transactionChannelListShrink;
        return this;
    }
    public String getTransactionChannelListShrink() {
        return this.transactionChannelListShrink;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setTransactionDirection(String transactionDirection) {
        this.transactionDirection = transactionDirection;
        return this;
    }
    public String getTransactionDirection() {
        return this.transactionDirection;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setTransactionNumber(Long transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public Long getTransactionNumber() {
        return this.transactionNumber;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public GetFundAccountTransactionDetailsShrinkRequest setTransactionTypeListShrink(String transactionTypeListShrink) {
        this.transactionTypeListShrink = transactionTypeListShrink;
        return this;
    }
    public String getTransactionTypeListShrink() {
        return this.transactionTypeListShrink;
    }

}
