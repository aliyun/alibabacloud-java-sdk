// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsResponseBody extends TeaModel {
    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Data list</p>
     */
    @NameInMap("Data")
    public java.util.List<GetFundAccountTransactionDetailsResponseBodyData> data;

    /**
     * <p>Response structure metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of records</p>
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
         * <p>Balance after the operation</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>Order number or bill number</p>
         * 
         * <strong>example:</strong>
         * <p>2323203243</p>
         */
        @NameInMap("BillNumber")
        public String billNumber;

        /**
         * <p>External transaction serial number</p>
         * 
         * <strong>example:</strong>
         * <p>20244389232</p>
         */
        @NameInMap("ChannelTransactionNumber")
        public String channelTransactionNumber;

        /**
         * <p>Transaction amount currency</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>Enterprise entity ID</p>
         * 
         * <strong>example:</strong>
         * <p>23473943</p>
         */
        @NameInMap("FundAccountEcid")
        public String fundAccountEcid;

        /**
         * <p>Account ID</p>
         * 
         * <strong>example:</strong>
         * <p>1232121</p>
         */
        @NameInMap("FundAccountId")
        public Long fundAccountId;

        /**
         * <p>Account name</p>
         * 
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("FundAccountName")
        public String fundAccountName;

        /**
         * <p>Alibaba Cloud account ID of the account owner</p>
         * 
         * <strong>example:</strong>
         * <p>32343231</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public Long fundAccountOwnerAccountId;

        /**
         * <p>Fund type</p>
         * 
         * <strong>example:</strong>
         * <p>ACCT_BOOK</p>
         */
        @NameInMap("FundType")
        public String fundType;

        /**
         * <p>Primary marketplace</p>
         * 
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <p>Remarks</p>
         * 
         * <strong>example:</strong>
         * <p>订单备注</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Site</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <p>Corresponding transaction account, such as the Alipay top-up account or the counterparty account for transfers.</p>
         * 
         * <strong>example:</strong>
         * <p>186****3975</p>
         */
        @NameInMap("TransactionAccount")
        public String transactionAccount;

        /**
         * <p>Transaction amount</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransactionAmount")
        public String transactionAmount;

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
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        @NameInMap("TransactionChannel")
        public String transactionChannel;

        /**
         * <p>Transaction direction: in/out (income/expenditure)</p>
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
         * <p>5423121</p>
         */
        @NameInMap("TransactionNumber")
        public Long transactionNumber;

        /**
         * <p>Formatted transaction time string</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 12:00:00</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

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
