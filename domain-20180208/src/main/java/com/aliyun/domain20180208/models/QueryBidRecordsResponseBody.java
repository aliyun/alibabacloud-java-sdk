// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBidRecordsResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryBidRecordsResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryBidRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBidRecordsResponseBody self = new QueryBidRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBidRecordsResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryBidRecordsResponseBody setData(java.util.List<QueryBidRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryBidRecordsResponseBodyData> getData() {
        return this.data;
    }

    public QueryBidRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBidRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBidRecordsResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryBidRecordsResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryBidRecordsResponseBodyData extends TeaModel {
        @NameInMap("Bid")
        public Float bid;

        @NameInMap("BidTime")
        public Long bidTime;

        @NameInMap("Bidder")
        public String bidder;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DomainName")
        public String domainName;

        public static QueryBidRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBidRecordsResponseBodyData self = new QueryBidRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBidRecordsResponseBodyData setBid(Float bid) {
            this.bid = bid;
            return this;
        }
        public Float getBid() {
            return this.bid;
        }

        public QueryBidRecordsResponseBodyData setBidTime(Long bidTime) {
            this.bidTime = bidTime;
            return this;
        }
        public Long getBidTime() {
            return this.bidTime;
        }

        public QueryBidRecordsResponseBodyData setBidder(String bidder) {
            this.bidder = bidder;
            return this;
        }
        public String getBidder() {
            return this.bidder;
        }

        public QueryBidRecordsResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryBidRecordsResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
