// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsRequest extends TeaModel {
    /**
     * <p>Transaction order number</p>
     * 
     * <strong>example:</strong>
     * <p>2023212312321</p>
     */
    @NameInMap("BillNumber")
    public String billNumber;

    /**
     * <p>Transaction channel serial number</p>
     * 
     * <strong>example:</strong>
     * <p>20250312334312322</p>
     */
    @NameInMap("ChannelTransactionNumber")
    public String channelTransactionNumber;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Query end timestamp (milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1735664561000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Fund account ID. If not specified, the account ID owned by the current account (owner) is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>123221232</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    /**
     * <p>Page size (maximum 200)</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Query start timestamp (milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1735664461000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Transaction channel. If specified, the query filters by transaction channel. If not specified, all channels are queried by default.</p>
     * <p>User balance: ACCT_CASH.</p>
     * <p>Alipay: ALIPAY.</p>
     * <p>Alipay Zhifutong: ALIPAY_ZHIFUTONG.</p>
     * <p>Offline remittance: OFFLINE_REMIT.</p>
     * <p>Credit control quota refund: REFUND.</p>
     * <p>Online banking: UNION_PAY_BANK.</p>
     * <p>Credit card: CREDIT_CARD. (International site only)</p>
     * <p>PayPal: PAYPAL. (International site only)</p>
     */
    @NameInMap("TransactionChannelList")
    public java.util.List<String> transactionChannelList;

    /**
     * <p>Transaction direction: in/out (fund inflow/outflow)</p>
     * 
     * <strong>example:</strong>
     * <p>IN</p>
     */
    @NameInMap("TransactionDirection")
    public String transactionDirection;

    /**
     * <p>Transaction serial number</p>
     * 
     * <strong>example:</strong>
     * <p>543231231</p>
     */
    @NameInMap("TransactionNumber")
    public Long transactionNumber;

    /**
     * <p>Transaction type. If a transaction type is specified, only results of that type are returned. If the specified type does not exist, the result is empty. If not specified, all types are returned by default.</p>
     * <p>Top-up: CHARGE.</p>
     * <p>Withdrawal: WITHDRAW.</p>
     * <p>Refund: REFUND.</p>
     * <p>Payment: PAY.</p>
     * <p>Transfer: TRANSFER.</p>
     * <p>Adjustment: ADJUST.</p>
     * <p>Order expiration refund: PAY_FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>CHARGE</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

    /**
     * <p>Transaction type list. Supports querying with multiple parameters.</p>
     */
    @NameInMap("TransactionTypeList")
    public java.util.List<String> transactionTypeList;

    public static GetFundAccountTransactionDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountTransactionDetailsRequest self = new GetFundAccountTransactionDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetFundAccountTransactionDetailsRequest setBillNumber(String billNumber) {
        this.billNumber = billNumber;
        return this;
    }
    public String getBillNumber() {
        return this.billNumber;
    }

    public GetFundAccountTransactionDetailsRequest setChannelTransactionNumber(String channelTransactionNumber) {
        this.channelTransactionNumber = channelTransactionNumber;
        return this;
    }
    public String getChannelTransactionNumber() {
        return this.channelTransactionNumber;
    }

    public GetFundAccountTransactionDetailsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetFundAccountTransactionDetailsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetFundAccountTransactionDetailsRequest setFundAccountId(Long fundAccountId) {
        this.fundAccountId = fundAccountId;
        return this;
    }
    public Long getFundAccountId() {
        return this.fundAccountId;
    }

    public GetFundAccountTransactionDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFundAccountTransactionDetailsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetFundAccountTransactionDetailsRequest setTransactionChannelList(java.util.List<String> transactionChannelList) {
        this.transactionChannelList = transactionChannelList;
        return this;
    }
    public java.util.List<String> getTransactionChannelList() {
        return this.transactionChannelList;
    }

    public GetFundAccountTransactionDetailsRequest setTransactionDirection(String transactionDirection) {
        this.transactionDirection = transactionDirection;
        return this;
    }
    public String getTransactionDirection() {
        return this.transactionDirection;
    }

    public GetFundAccountTransactionDetailsRequest setTransactionNumber(Long transactionNumber) {
        this.transactionNumber = transactionNumber;
        return this;
    }
    public Long getTransactionNumber() {
        return this.transactionNumber;
    }

    public GetFundAccountTransactionDetailsRequest setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public GetFundAccountTransactionDetailsRequest setTransactionTypeList(java.util.List<String> transactionTypeList) {
        this.transactionTypeList = transactionTypeList;
        return this;
    }
    public java.util.List<String> getTransactionTypeList() {
        return this.transactionTypeList;
    }

}
