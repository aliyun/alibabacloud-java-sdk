// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<GetFundAccountTransactionDetailsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>D6E068C3-25BC-455A-85FE-45F0B22ECB1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <strong>example:</strong>
         * <p>2323203243</p>
         */
        @NameInMap("BillNumber")
        public String billNumber;

        /**
         * <strong>example:</strong>
         * <p>20244389232</p>
         */
        @NameInMap("ChannelTransactionNumber")
        public String channelTransactionNumber;

        /**
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>23473943</p>
         */
        @NameInMap("FundAccountEcid")
        public String fundAccountEcid;

        /**
         * <strong>example:</strong>
         * <p>1232121</p>
         */
        @NameInMap("FundAccountId")
        public Long fundAccountId;

        /**
         * <strong>example:</strong>
         * <p>云某的名称</p>
         */
        @NameInMap("FundAccountName")
        public String fundAccountName;

        /**
         * <strong>example:</strong>
         * <p>32343231</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public Long fundAccountOwnerAccountId;

        /**
         * <strong>example:</strong>
         * <p>ACCT_BOOK</p>
         */
        @NameInMap("FundType")
        public String fundType;

        /**
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <strong>example:</strong>
         * <p>订单备注</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        /**
         * <strong>example:</strong>
         * <p>186****3975</p>
         */
        @NameInMap("TransactionAccount")
        public String transactionAccount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TransactionAmount")
        public String transactionAmount;

        /**
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        @NameInMap("TransactionChannel")
        public String transactionChannel;

        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("TransactionDirection")
        public String transactionDirection;

        /**
         * <strong>example:</strong>
         * <p>5423121</p>
         */
        @NameInMap("TransactionNumber")
        public Long transactionNumber;

        /**
         * <strong>example:</strong>
         * <p>2024-12-01 12:00:00</p>
         */
        @NameInMap("TransactionTime")
        public String transactionTime;

        /**
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
