// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ChangeAuctionRequest extends TeaModel {
    @NameInMap("AuctionList")
    public java.util.List<ChangeAuctionRequestAuctionList> auctionList;

    public static ChangeAuctionRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAuctionRequest self = new ChangeAuctionRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAuctionRequest setAuctionList(java.util.List<ChangeAuctionRequestAuctionList> auctionList) {
        this.auctionList = auctionList;
        return this;
    }
    public java.util.List<ChangeAuctionRequestAuctionList> getAuctionList() {
        return this.auctionList;
    }

    public static class ChangeAuctionRequestAuctionListBidRecords extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Price")
        public Float price;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ChangeAuctionRequestAuctionListBidRecords build(java.util.Map<String, ?> map) throws Exception {
            ChangeAuctionRequestAuctionListBidRecords self = new ChangeAuctionRequestAuctionListBidRecords();
            return TeaModel.build(map, self);
        }

        public ChangeAuctionRequestAuctionListBidRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ChangeAuctionRequestAuctionListBidRecords setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public ChangeAuctionRequestAuctionListBidRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ChangeAuctionRequestAuctionList extends TeaModel {
        @NameInMap("BidRecords")
        public java.util.List<ChangeAuctionRequestAuctionListBidRecords> bidRecords;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("IsReserve")
        public Integer isReserve;

        @NameInMap("ReservePrice")
        public Float reservePrice;

        @NameInMap("ReserveRange")
        public String reserveRange;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeLeft")
        public Long timeLeft;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Winner")
        public String winner;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WinnerPrice")
        public Float winnerPrice;

        public static ChangeAuctionRequestAuctionList build(java.util.Map<String, ?> map) throws Exception {
            ChangeAuctionRequestAuctionList self = new ChangeAuctionRequestAuctionList();
            return TeaModel.build(map, self);
        }

        public ChangeAuctionRequestAuctionList setBidRecords(java.util.List<ChangeAuctionRequestAuctionListBidRecords> bidRecords) {
            this.bidRecords = bidRecords;
            return this;
        }
        public java.util.List<ChangeAuctionRequestAuctionListBidRecords> getBidRecords() {
            return this.bidRecords;
        }

        public ChangeAuctionRequestAuctionList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ChangeAuctionRequestAuctionList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ChangeAuctionRequestAuctionList setIsReserve(Integer isReserve) {
            this.isReserve = isReserve;
            return this;
        }
        public Integer getIsReserve() {
            return this.isReserve;
        }

        public ChangeAuctionRequestAuctionList setReservePrice(Float reservePrice) {
            this.reservePrice = reservePrice;
            return this;
        }
        public Float getReservePrice() {
            return this.reservePrice;
        }

        public ChangeAuctionRequestAuctionList setReserveRange(String reserveRange) {
            this.reserveRange = reserveRange;
            return this;
        }
        public String getReserveRange() {
            return this.reserveRange;
        }

        public ChangeAuctionRequestAuctionList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ChangeAuctionRequestAuctionList setTimeLeft(Long timeLeft) {
            this.timeLeft = timeLeft;
            return this;
        }
        public Long getTimeLeft() {
            return this.timeLeft;
        }

        public ChangeAuctionRequestAuctionList setWinner(String winner) {
            this.winner = winner;
            return this;
        }
        public String getWinner() {
            return this.winner;
        }

        public ChangeAuctionRequestAuctionList setWinnerPrice(Float winnerPrice) {
            this.winnerPrice = winnerPrice;
            return this;
        }
        public Float getWinnerPrice() {
            return this.winnerPrice;
        }

    }

}
