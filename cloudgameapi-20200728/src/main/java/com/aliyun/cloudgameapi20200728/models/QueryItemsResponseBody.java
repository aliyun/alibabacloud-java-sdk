// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryItemsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryItemsResponseBodyData data;

    public static QueryItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemsResponseBody self = new QueryItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemsResponseBody setData(QueryItemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryItemsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryItemsResponseBodyDataItemsSkusSaleProps extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("ValueId")
        public Long valueId;

        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("PropertyId")
        public Long propertyId;

        public static QueryItemsResponseBodyDataItemsSkusSaleProps build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyDataItemsSkusSaleProps self = new QueryItemsResponseBodyDataItemsSkusSaleProps();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyDataItemsSkusSaleProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryItemsResponseBodyDataItemsSkusSaleProps setValueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }
        public Long getValueId() {
            return this.valueId;
        }

        public QueryItemsResponseBodyDataItemsSkusSaleProps setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public QueryItemsResponseBodyDataItemsSkusSaleProps setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

    }

    public static class QueryItemsResponseBodyDataItemsSkus extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("SalePrice")
        public Long salePrice;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("SaleProps")
        public java.util.List<QueryItemsResponseBodyDataItemsSkusSaleProps> saleProps;

        public static QueryItemsResponseBodyDataItemsSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyDataItemsSkus self = new QueryItemsResponseBodyDataItemsSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyDataItemsSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemsResponseBodyDataItemsSkus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryItemsResponseBodyDataItemsSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryItemsResponseBodyDataItemsSkus setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryItemsResponseBodyDataItemsSkus setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public QueryItemsResponseBodyDataItemsSkus setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryItemsResponseBodyDataItemsSkus setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryItemsResponseBodyDataItemsSkus setSaleProps(java.util.List<QueryItemsResponseBodyDataItemsSkusSaleProps> saleProps) {
            this.saleProps = saleProps;
            return this;
        }
        public java.util.List<QueryItemsResponseBodyDataItemsSkusSaleProps> getSaleProps() {
            return this.saleProps;
        }

    }

    public static class QueryItemsResponseBodyDataItemsGames extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("GameId")
        public String gameId;

        public static QueryItemsResponseBodyDataItemsGames build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyDataItemsGames self = new QueryItemsResponseBodyDataItemsGames();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyDataItemsGames setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryItemsResponseBodyDataItemsGames setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

    }

    public static class QueryItemsResponseBodyDataItems extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Supplier")
        public String supplier;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("Title")
        public String title;

        @NameInMap("SalePrice")
        public Long salePrice;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Skus")
        public java.util.List<QueryItemsResponseBodyDataItemsSkus> skus;

        @NameInMap("Games")
        public java.util.List<QueryItemsResponseBodyDataItemsGames> games;

        public static QueryItemsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyDataItems self = new QueryItemsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyDataItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemsResponseBodyDataItems setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public String getSupplier() {
            return this.supplier;
        }

        public QueryItemsResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryItemsResponseBodyDataItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryItemsResponseBodyDataItems setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public QueryItemsResponseBodyDataItems setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemsResponseBodyDataItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryItemsResponseBodyDataItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryItemsResponseBodyDataItems setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public QueryItemsResponseBodyDataItems setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryItemsResponseBodyDataItems setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryItemsResponseBodyDataItems setSkus(java.util.List<QueryItemsResponseBodyDataItemsSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<QueryItemsResponseBodyDataItemsSkus> getSkus() {
            return this.skus;
        }

        public QueryItemsResponseBodyDataItems setGames(java.util.List<QueryItemsResponseBodyDataItemsGames> games) {
            this.games = games;
            return this;
        }
        public java.util.List<QueryItemsResponseBodyDataItemsGames> getGames() {
            return this.games;
        }

    }

    public static class QueryItemsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Items")
        public java.util.List<QueryItemsResponseBodyDataItems> items;

        public static QueryItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseBodyData self = new QueryItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryItemsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryItemsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryItemsResponseBodyData setItems(java.util.List<QueryItemsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryItemsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
