// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023212312321</p>
     */
    @NameInMap("BillNumber")
    public String billNumber;

    /**
     * <strong>example:</strong>
     * <p>20250312334312322</p>
     */
    @NameInMap("ChannelTransactionNumber")
    public String channelTransactionNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>1735664561000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>123221232</p>
     */
    @NameInMap("FundAccountId")
    public Long fundAccountId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1735664461000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TransactionChannelList")
    public java.util.List<String> transactionChannelList;

    /**
     * <strong>example:</strong>
     * <p>IN</p>
     */
    @NameInMap("TransactionDirection")
    public String transactionDirection;

    /**
     * <strong>example:</strong>
     * <p>543231231</p>
     */
    @NameInMap("TransactionNumber")
    public Long transactionNumber;

    /**
     * <strong>example:</strong>
     * <p>CHARGE</p>
     */
    @NameInMap("TransactionType")
    public String transactionType;

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
