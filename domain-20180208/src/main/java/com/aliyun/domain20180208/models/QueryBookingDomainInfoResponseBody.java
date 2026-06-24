// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBookingDomainInfoResponseBody extends TeaModel {
    @NameInMap("AuctionId")
    public Integer auctionId;

    @NameInMap("BookEndTime")
    public Long bookEndTime;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("MaxBid")
    public Float maxBid;

    @NameInMap("PartnerType")
    public String partnerType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SnatchNo")
    public String snatchNo;

    @NameInMap("TransferInPrice")
    public Float transferInPrice;

    public static QueryBookingDomainInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBookingDomainInfoResponseBody self = new QueryBookingDomainInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBookingDomainInfoResponseBody setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public Integer getAuctionId() {
        return this.auctionId;
    }

    public QueryBookingDomainInfoResponseBody setBookEndTime(Long bookEndTime) {
        this.bookEndTime = bookEndTime;
        return this;
    }
    public Long getBookEndTime() {
        return this.bookEndTime;
    }

    public QueryBookingDomainInfoResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryBookingDomainInfoResponseBody setMaxBid(Float maxBid) {
        this.maxBid = maxBid;
        return this;
    }
    public Float getMaxBid() {
        return this.maxBid;
    }

    public QueryBookingDomainInfoResponseBody setPartnerType(String partnerType) {
        this.partnerType = partnerType;
        return this;
    }
    public String getPartnerType() {
        return this.partnerType;
    }

    public QueryBookingDomainInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBookingDomainInfoResponseBody setSnatchNo(String snatchNo) {
        this.snatchNo = snatchNo;
        return this;
    }
    public String getSnatchNo() {
        return this.snatchNo;
    }

    public QueryBookingDomainInfoResponseBody setTransferInPrice(Float transferInPrice) {
        this.transferInPrice = transferInPrice;
        return this;
    }
    public Float getTransferInPrice() {
        return this.transferInPrice;
    }

}
