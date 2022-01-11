// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBidRecordsRequest extends TeaModel {
    @NameInMap("AuctionId")
    public String auctionId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryBidRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBidRecordsRequest self = new QueryBidRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBidRecordsRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public QueryBidRecordsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryBidRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
