// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetFundAccountTransactionDetailsResponseBodyData> data;

    /**
     * <p>The metadata of the response structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetFundAccountTransactionDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountTransactionDetailsResponseBody self = new GetFundAccountTransactionDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountTransactionDetailsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetFundAccountTransactionDetailsResponseBody setData(java.util.List<GetFundAccountTransactionDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetFundAccountTransactionDetailsResponseBodyData> getData() {
        return this.data;
    }

    public GetFundAccountTransactionDetailsResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountTransactionDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetFundAccountTransactionDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountTransactionDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetFundAccountTransactionDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The balance after the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The order number or bill number.</p>
         * 
         * <strong>example:</strong>
         * <p>2323203243</p>
         */
        @NameInMap("BillNumber")
        public String billNumber;

        /**
         * <p>The external transaction serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>20244389232</p>
         */
        @NameInMap("ChannelTransactionNumber")
        public String channelTransactionNumber;

        /**
         * <p>The currency of the transaction amount.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The enterprise entity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23473943</p>
         */
        @NameInMap("FundAccountEcid")
        public String fundAccountEcid;

        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1232121</p>
         */
        @NameInMap("FundAccountId")
        public Long fundAccountId;

        /**
         * <p>The account name.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample account name</p>
         */
        @NameInMap("FundAccountName")
        public String fundAccountName;

        /**
         * <p>The Alibaba Cloud account ID of the account owner.</p>
         * 
         * <strong>example:</strong>
         * <p>32343231</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public Long fundAccountOwnerAccountId;

        /**
         * <p>The fund type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACCT_BOOK</p>
         */
        @NameInMap("FundType")
        public String fundType;

        /**
         * <p>The primary marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <p>The remark.</p>
         * 
         * <strong>example:</strong>
         * <p>Order remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The site.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>The corresponding transaction account, such as the Alipay top-up account or the counterparty account for a transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>186****3975</p>
         */
        @NameInMap("TransactionAccount")
        public String transactionAccount;

        /**
         * <p>The transaction amount.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransactionAmount")
        public String transactionAmount;

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
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        @NameInMap("TransactionChannel")
        public String transactionChannel;

        /**
         * <p>The transaction direction. Valid values: in (income) and out (expense).</p>
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
         * <p>5423121</p>
         */
        @NameInMap("TransactionNumber")
        public Long transactionNumber;

        /**
         * <p>The formatted string of the transaction time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 12:00:00</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

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

        public static GetFundAccountTransactionDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFundAccountTransactionDetailsResponseBodyData self = new GetFundAccountTransactionDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFundAccountTransactionDetailsResponseBodyData setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setBillNumber(String billNumber) {
            this.billNumber = billNumber;
            return this;
        }
        public String getBillNumber() {
            return this.billNumber;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setChannelTransactionNumber(String channelTransactionNumber) {
            this.channelTransactionNumber = channelTransactionNumber;
            return this;
        }
        public String getChannelTransactionNumber() {
            return this.channelTransactionNumber;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setFundAccountEcid(String fundAccountEcid) {
            this.fundAccountEcid = fundAccountEcid;
            return this;
        }
        public String getFundAccountEcid() {
            return this.fundAccountEcid;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setFundAccountId(Long fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }
        public Long getFundAccountId() {
            return this.fundAccountId;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setFundAccountName(String fundAccountName) {
            this.fundAccountName = fundAccountName;
            return this;
        }
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setFundAccountOwnerAccountId(Long fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }
        public Long getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setNbid(String nbid) {
            this.nbid = nbid;
            return this;
        }
        public String getNbid() {
            return this.nbid;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionAccount(String transactionAccount) {
            this.transactionAccount = transactionAccount;
            return this;
        }
        public String getTransactionAccount() {
            return this.transactionAccount;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionAmount(String transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }
        public String getTransactionAmount() {
            return this.transactionAmount;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionChannel(String transactionChannel) {
            this.transactionChannel = transactionChannel;
            return this;
        }
        public String getTransactionChannel() {
            return this.transactionChannel;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionDirection(String transactionDirection) {
            this.transactionDirection = transactionDirection;
            return this;
        }
        public String getTransactionDirection() {
            return this.transactionDirection;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionNumber(Long transactionNumber) {
            this.transactionNumber = transactionNumber;
            return this;
        }
        public Long getTransactionNumber() {
            return this.transactionNumber;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }
        public String getTransactionTime() {
            return this.transactionTime;
        }

        public GetFundAccountTransactionDetailsResponseBodyData setTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }
        public String getTransactionType() {
            return this.transactionType;
        }

    }

}
