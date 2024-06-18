// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1515961936000</p>
     */
    @NameInMap("AuctionEndTime")
    public Long auctionEndTime;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    /**
     * <strong>example:</strong>
     * <p>1515961936000</p>
     */
    @NameInMap("BookEndTime")
    public Long bookEndTime;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("BookedPartner")
    public String bookedPartner;

    /**
     * <strong>example:</strong>
     * <p>RMB</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>1515961936000</p>
     */
    @NameInMap("DeliveryTime")
    public Long deliveryTime;

    /**
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailCode")
    public String failCode;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HighBid")
    public Float highBid;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("HighBidder")
    public String highBidder;

    /**
     * <strong>example:</strong>
     * <p>110</p>
     */
    @NameInMap("NextValidBid")
    public Float nextValidBid;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("PartnerType")
    public String partnerType;

    /**
     * <strong>example:</strong>
     * <p>1515961936000</p>
     */
    @NameInMap("PayEndTime")
    public Long payEndTime;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PayPrice")
    public Float payPrice;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PayStatus")
    public String payStatus;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ProduceStatus")
    public String produceStatus;

    /**
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReserveMet")
    public Boolean reserveMet;

    @NameInMap("ReservePrice")
    public Float reservePrice;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TransferInPrice")
    public Float transferInPrice;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("YourCurrentBid")
    public Float yourCurrentBid;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
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
