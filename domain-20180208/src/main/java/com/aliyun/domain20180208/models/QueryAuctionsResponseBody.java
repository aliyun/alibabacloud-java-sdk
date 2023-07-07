// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryAuctionsResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryAuctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionsResponseBody self = new QueryAuctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuctionsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryAuctionsResponseBody setData(java.util.List<QueryAuctionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAuctionsResponseBodyData> getData() {
        return this.data;
    }

    public QueryAuctionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAuctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuctionsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryAuctionsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryAuctionsResponseBodyData extends TeaModel {
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

        @NameInMap("ReserveMax")
        public Long reserveMax;

        @NameInMap("ReserveMet")
        public Boolean reserveMet;

        @NameInMap("ReserveMin")
        public Long reserveMin;

        @NameInMap("ReservePrice")
        public Long reservePrice;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransferInPrice")
        public Float transferInPrice;

        @NameInMap("YourCurrentBid")
        public Float yourCurrentBid;

        @NameInMap("YourMaxBid")
        public Float yourMaxBid;

        public static QueryAuctionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAuctionsResponseBodyData self = new QueryAuctionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAuctionsResponseBodyData setAuctionEndTime(Long auctionEndTime) {
            this.auctionEndTime = auctionEndTime;
            return this;
        }
        public Long getAuctionEndTime() {
            return this.auctionEndTime;
        }

        public QueryAuctionsResponseBodyData setAuctionId(String auctionId) {
            this.auctionId = auctionId;
            return this;
        }
        public String getAuctionId() {
            return this.auctionId;
        }

        public QueryAuctionsResponseBodyData setBookEndTime(Long bookEndTime) {
            this.bookEndTime = bookEndTime;
            return this;
        }
        public Long getBookEndTime() {
            return this.bookEndTime;
        }

        public QueryAuctionsResponseBodyData setBookedPartner(String bookedPartner) {
            this.bookedPartner = bookedPartner;
            return this;
        }
        public String getBookedPartner() {
            return this.bookedPartner;
        }

        public QueryAuctionsResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryAuctionsResponseBodyData setDeliveryTime(Long deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }
        public Long getDeliveryTime() {
            return this.deliveryTime;
        }

        public QueryAuctionsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public QueryAuctionsResponseBodyData setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public QueryAuctionsResponseBodyData setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public QueryAuctionsResponseBodyData setHighBid(Float highBid) {
            this.highBid = highBid;
            return this;
        }
        public Float getHighBid() {
            return this.highBid;
        }

        public QueryAuctionsResponseBodyData setHighBidder(String highBidder) {
            this.highBidder = highBidder;
            return this;
        }
        public String getHighBidder() {
            return this.highBidder;
        }

        public QueryAuctionsResponseBodyData setNextValidBid(Float nextValidBid) {
            this.nextValidBid = nextValidBid;
            return this;
        }
        public Float getNextValidBid() {
            return this.nextValidBid;
        }

        public QueryAuctionsResponseBodyData setPartnerType(String partnerType) {
            this.partnerType = partnerType;
            return this;
        }
        public String getPartnerType() {
            return this.partnerType;
        }

        public QueryAuctionsResponseBodyData setPayEndTime(Long payEndTime) {
            this.payEndTime = payEndTime;
            return this;
        }
        public Long getPayEndTime() {
            return this.payEndTime;
        }

        public QueryAuctionsResponseBodyData setPayPrice(Float payPrice) {
            this.payPrice = payPrice;
            return this;
        }
        public Float getPayPrice() {
            return this.payPrice;
        }

        public QueryAuctionsResponseBodyData setPayStatus(String payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public String getPayStatus() {
            return this.payStatus;
        }

        public QueryAuctionsResponseBodyData setProduceStatus(String produceStatus) {
            this.produceStatus = produceStatus;
            return this;
        }
        public String getProduceStatus() {
            return this.produceStatus;
        }

        public QueryAuctionsResponseBodyData setReserveMax(Long reserveMax) {
            this.reserveMax = reserveMax;
            return this;
        }
        public Long getReserveMax() {
            return this.reserveMax;
        }

        public QueryAuctionsResponseBodyData setReserveMet(Boolean reserveMet) {
            this.reserveMet = reserveMet;
            return this;
        }
        public Boolean getReserveMet() {
            return this.reserveMet;
        }

        public QueryAuctionsResponseBodyData setReserveMin(Long reserveMin) {
            this.reserveMin = reserveMin;
            return this;
        }
        public Long getReserveMin() {
            return this.reserveMin;
        }

        public QueryAuctionsResponseBodyData setReservePrice(Long reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Long getReservePrice() {
            return this.reservePrice;
        }

        public QueryAuctionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryAuctionsResponseBodyData setTransferInPrice(Float transferInPrice) {
            this.transferInPrice = transferInPrice;
            return this;
        }
        public Float getTransferInPrice() {
            return this.transferInPrice;
        }

        public QueryAuctionsResponseBodyData setYourCurrentBid(Float yourCurrentBid) {
            this.yourCurrentBid = yourCurrentBid;
            return this;
        }
        public Float getYourCurrentBid() {
            return this.yourCurrentBid;
        }

        public QueryAuctionsResponseBodyData setYourMaxBid(Float yourMaxBid) {
            this.yourMaxBid = yourMaxBid;
            return this;
        }
        public Float getYourMaxBid() {
            return this.yourMaxBid;
        }

    }

}
