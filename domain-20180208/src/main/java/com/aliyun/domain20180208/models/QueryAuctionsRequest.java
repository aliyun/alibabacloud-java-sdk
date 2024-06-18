// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionsRequest extends TeaModel {
    @NameInMap("AuctionEndTimeOrder")
    public String auctionEndTimeOrder;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Statuses")
    public String statuses;

    public static QueryAuctionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionsRequest self = new QueryAuctionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuctionsRequest setAuctionEndTimeOrder(String auctionEndTimeOrder) {
        this.auctionEndTimeOrder = auctionEndTimeOrder;
        return this;
    }
    public String getAuctionEndTimeOrder() {
        return this.auctionEndTimeOrder;
    }

    public QueryAuctionsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryAuctionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAuctionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAuctionsRequest setStatuses(String statuses) {
        this.statuses = statuses;
        return this;
    }
    public String getStatuses() {
        return this.statuses;
    }

}
