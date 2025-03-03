// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsShrinkRequest extends TeaModel {
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
    public String transactionChannelListShrink;

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
