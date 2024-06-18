// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBidRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<QueryBidRecordsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Bid")
        public Float bid;

        /**
         * <strong>example:</strong>
         * <p>1515961936000</p>
         */
        @NameInMap("BidTime")
        public Long bidTime;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Bidder")
        public String bidder;

        /**
         * <strong>example:</strong>
         * <p>RMB</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
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
