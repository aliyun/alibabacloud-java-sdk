// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportAuctionDetailResponseBody extends TeaModel {
    @NameInMap("AuctionEndTime")
    public String auctionEndTime;

    @NameInMap("AuctionId")
    public String auctionId;

    @NameInMap("AuctionStatus")
    public String auctionStatus;

    @NameInMap("BookEndTime")
    public String bookEndTime;

    @NameInMap("BuyerStatus")
    public String buyerStatus;

    @NameInMap("CurrentPrice")
    public Double currentPrice;

    @NameInMap("IncreasePrice")
    public Double increasePrice;

    @NameInMap("MyPrice")
    public Double myPrice;

    @NameInMap("MyProxyPrice")
    public Double myProxyPrice;

    @NameInMap("OthersMaxProxyPrice")
    public Double othersMaxProxyPrice;

    @NameInMap("ProxyPrice")
    public Double proxyPrice;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryExportAuctionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExportAuctionDetailResponseBody self = new QueryExportAuctionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExportAuctionDetailResponseBody setAuctionEndTime(String auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
        return this;
    }
    public String getAuctionEndTime() {
        return this.auctionEndTime;
    }

    public QueryExportAuctionDetailResponseBody setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public QueryExportAuctionDetailResponseBody setAuctionStatus(String auctionStatus) {
        this.auctionStatus = auctionStatus;
        return this;
    }
    public String getAuctionStatus() {
        return this.auctionStatus;
    }

    public QueryExportAuctionDetailResponseBody setBookEndTime(String bookEndTime) {
        this.bookEndTime = bookEndTime;
        return this;
    }
    public String getBookEndTime() {
        return this.bookEndTime;
    }

    public QueryExportAuctionDetailResponseBody setBuyerStatus(String buyerStatus) {
        this.buyerStatus = buyerStatus;
        return this;
    }
    public String getBuyerStatus() {
        return this.buyerStatus;
    }

    public QueryExportAuctionDetailResponseBody setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }
    public Double getCurrentPrice() {
        return this.currentPrice;
    }

    public QueryExportAuctionDetailResponseBody setIncreasePrice(Double increasePrice) {
        this.increasePrice = increasePrice;
        return this;
    }
    public Double getIncreasePrice() {
        return this.increasePrice;
    }

    public QueryExportAuctionDetailResponseBody setMyPrice(Double myPrice) {
        this.myPrice = myPrice;
        return this;
    }
    public Double getMyPrice() {
        return this.myPrice;
    }

    public QueryExportAuctionDetailResponseBody setMyProxyPrice(Double myProxyPrice) {
        this.myProxyPrice = myProxyPrice;
        return this;
    }
    public Double getMyProxyPrice() {
        return this.myProxyPrice;
    }

    public QueryExportAuctionDetailResponseBody setOthersMaxProxyPrice(Double othersMaxProxyPrice) {
        this.othersMaxProxyPrice = othersMaxProxyPrice;
        return this;
    }
    public Double getOthersMaxProxyPrice() {
        return this.othersMaxProxyPrice;
    }

    public QueryExportAuctionDetailResponseBody setProxyPrice(Double proxyPrice) {
        this.proxyPrice = proxyPrice;
        return this;
    }
    public Double getProxyPrice() {
        return this.proxyPrice;
    }

    public QueryExportAuctionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
