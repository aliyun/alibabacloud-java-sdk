// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionDetailResponseBody extends TeaModel {
    @NameInMap("AuctionEndTime")
    public Long auctionEndTime;

    @NameInMap("AuctionId")
    public String auctionId;

    @NameInMap("BookEndTime")
    public Long bookEndTime;

    @NameInMap("BookedPartner")
    public String bookedPartner;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("DeliveryTime")
    public Long deliveryTime;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("FailCode")
    public String failCode;

    @NameInMap("HighBid")
    public Float highBid;

    @NameInMap("HighBidder")
    public String highBidder;

    @NameInMap("NextValidBid")
    public Float nextValidBid;

    @NameInMap("PartnerType")
    public String partnerType;

    @NameInMap("PayEndTime")
    public Long payEndTime;

    @NameInMap("PayPrice")
    public Float payPrice;

    @NameInMap("PayStatus")
    public String payStatus;

    @NameInMap("ProduceStatus")
    public String produceStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReserveMet")
    public Boolean reserveMet;

    @NameInMap("ReservePrice")
    public Float reservePrice;

    @NameInMap("Status")
    public String status;

    @NameInMap("TransferInPrice")
    public Float transferInPrice;

    @NameInMap("YourCurrentBid")
    public Float yourCurrentBid;

    @NameInMap("YourMaxBid")
    public Float yourMaxBid;

    public static QueryAuctionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionDetailResponseBody self = new QueryAuctionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuctionDetailResponseBody setAuctionEndTime(Long auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
        return this;
    }
    public Long getAuctionEndTime() {
        return this.auctionEndTime;
    }

    public QueryAuctionDetailResponseBody setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public QueryAuctionDetailResponseBody setBookEndTime(Long bookEndTime) {
        this.bookEndTime = bookEndTime;
        return this;
    }
    public Long getBookEndTime() {
        return this.bookEndTime;
    }

    public QueryAuctionDetailResponseBody setBookedPartner(String bookedPartner) {
        this.bookedPartner = bookedPartner;
        return this;
    }
    public String getBookedPartner() {
        return this.bookedPartner;
    }

    public QueryAuctionDetailResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryAuctionDetailResponseBody setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public Long getDeliveryTime() {
        return this.deliveryTime;
    }

    public QueryAuctionDetailResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryAuctionDetailResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public QueryAuctionDetailResponseBody setFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }
    public String getFailCode() {
        return this.failCode;
    }

    public QueryAuctionDetailResponseBody setHighBid(Float highBid) {
        this.highBid = highBid;
        return this;
    }
    public Float getHighBid() {
        return this.highBid;
    }

    public QueryAuctionDetailResponseBody setHighBidder(String highBidder) {
        this.highBidder = highBidder;
        return this;
    }
    public String getHighBidder() {
        return this.highBidder;
    }

    public QueryAuctionDetailResponseBody setNextValidBid(Float nextValidBid) {
        this.nextValidBid = nextValidBid;
        return this;
    }
    public Float getNextValidBid() {
        return this.nextValidBid;
    }

    public QueryAuctionDetailResponseBody setPartnerType(String partnerType) {
        this.partnerType = partnerType;
        return this;
    }
    public String getPartnerType() {
        return this.partnerType;
    }

    public QueryAuctionDetailResponseBody setPayEndTime(Long payEndTime) {
        this.payEndTime = payEndTime;
        return this;
    }
    public Long getPayEndTime() {
        return this.payEndTime;
    }

    public QueryAuctionDetailResponseBody setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
        return this;
    }
    public Float getPayPrice() {
        return this.payPrice;
    }

    public QueryAuctionDetailResponseBody setPayStatus(String payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public String getPayStatus() {
        return this.payStatus;
    }

    public QueryAuctionDetailResponseBody setProduceStatus(String produceStatus) {
        this.produceStatus = produceStatus;
        return this;
    }
    public String getProduceStatus() {
        return this.produceStatus;
    }

    public QueryAuctionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuctionDetailResponseBody setReserveMet(Boolean reserveMet) {
        this.reserveMet = reserveMet;
        return this;
    }
    public Boolean getReserveMet() {
        return this.reserveMet;
    }

    public QueryAuctionDetailResponseBody setReservePrice(Float reservePrice) {
        this.reservePrice = reservePrice;
        return this;
    }
    public Float getReservePrice() {
        return this.reservePrice;
    }

    public QueryAuctionDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAuctionDetailResponseBody setTransferInPrice(Float transferInPrice) {
        this.transferInPrice = transferInPrice;
        return this;
    }
    public Float getTransferInPrice() {
        return this.transferInPrice;
    }

    public QueryAuctionDetailResponseBody setYourCurrentBid(Float yourCurrentBid) {
        this.yourCurrentBid = yourCurrentBid;
        return this;
    }
    public Float getYourCurrentBid() {
        return this.yourCurrentBid;
    }

    public QueryAuctionDetailResponseBody setYourMaxBid(Float yourMaxBid) {
        this.yourMaxBid = yourMaxBid;
        return this;
    }
    public Float getYourMaxBid() {
        return this.yourMaxBid;
    }

}
