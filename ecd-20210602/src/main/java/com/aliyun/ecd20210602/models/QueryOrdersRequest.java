// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class QueryOrdersRequest extends TeaModel {
    @NameInMap("BuyerId")
    public Long buyerId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SellerId")
    public Long sellerId;

    @NameInMap("Status")
    public Long status;

    public static QueryOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrdersRequest self = new QueryOrdersRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrdersRequest setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public Long getBuyerId() {
        return this.buyerId;
    }

    public QueryOrdersRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public QueryOrdersRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public QueryOrdersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrdersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrdersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryOrdersRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrdersRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public QueryOrdersRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
