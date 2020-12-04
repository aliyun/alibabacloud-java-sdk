// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryItemsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Long httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryItemsResponseData data;

    public static QueryItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryItemsResponse self = new QueryItemsResponse();
        return TeaModel.build(map, self);
    }

    public QueryItemsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemsResponse setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryItemsResponse setData(QueryItemsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryItemsResponseData getData() {
        return this.data;
    }

    public static class QueryItemsResponseDataItemsSkusSaleProps extends TeaModel {
        @NameInMap("ValueId")
        @Validation(required = true)
        public Long valueId;

        @NameInMap("PropertyName")
        @Validation(required = true)
        public String propertyName;

        @NameInMap("PropertyId")
        @Validation(required = true)
        public Long propertyId;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static QueryItemsResponseDataItemsSkusSaleProps build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseDataItemsSkusSaleProps self = new QueryItemsResponseDataItemsSkusSaleProps();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseDataItemsSkusSaleProps setValueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }
        public Long getValueId() {
            return this.valueId;
        }

        public QueryItemsResponseDataItemsSkusSaleProps setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public QueryItemsResponseDataItemsSkusSaleProps setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public QueryItemsResponseDataItemsSkusSaleProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryItemsResponseDataItemsSkus extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("SalePrice")
        @Validation(required = true)
        public Long salePrice;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("SkuId")
        @Validation(required = true)
        public String skuId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("SaleProps")
        @Validation(required = true)
        public java.util.List<QueryItemsResponseDataItemsSkusSaleProps> saleProps;

        public static QueryItemsResponseDataItemsSkus build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseDataItemsSkus self = new QueryItemsResponseDataItemsSkus();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseDataItemsSkus setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryItemsResponseDataItemsSkus setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryItemsResponseDataItemsSkus setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public QueryItemsResponseDataItemsSkus setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryItemsResponseDataItemsSkus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryItemsResponseDataItemsSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryItemsResponseDataItemsSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemsResponseDataItemsSkus setSaleProps(java.util.List<QueryItemsResponseDataItemsSkusSaleProps> saleProps) {
            this.saleProps = saleProps;
            return this;
        }
        public java.util.List<QueryItemsResponseDataItemsSkusSaleProps> getSaleProps() {
            return this.saleProps;
        }

    }

    public static class QueryItemsResponseDataItemsGames extends TeaModel {
        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static QueryItemsResponseDataItemsGames build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseDataItemsGames self = new QueryItemsResponseDataItemsGames();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseDataItemsGames setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public QueryItemsResponseDataItemsGames setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryItemsResponseDataItems extends TeaModel {
        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("SalePrice")
        @Validation(required = true)
        public Long salePrice;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("SellerId")
        @Validation(required = true)
        public String sellerId;

        @NameInMap("Supplier")
        @Validation(required = true)
        public String supplier;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Skus")
        @Validation(required = true)
        public java.util.List<QueryItemsResponseDataItemsSkus> skus;

        @NameInMap("Games")
        @Validation(required = true)
        public java.util.List<QueryItemsResponseDataItemsGames> games;

        public static QueryItemsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseDataItems self = new QueryItemsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseDataItems setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryItemsResponseDataItems setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public QueryItemsResponseDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryItemsResponseDataItems setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryItemsResponseDataItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryItemsResponseDataItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryItemsResponseDataItems setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryItemsResponseDataItems setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public QueryItemsResponseDataItems setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public String getSupplier() {
            return this.supplier;
        }

        public QueryItemsResponseDataItems setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public QueryItemsResponseDataItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryItemsResponseDataItems setSkus(java.util.List<QueryItemsResponseDataItemsSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<QueryItemsResponseDataItemsSkus> getSkus() {
            return this.skus;
        }

        public QueryItemsResponseDataItems setGames(java.util.List<QueryItemsResponseDataItemsGames> games) {
            this.games = games;
            return this;
        }
        public java.util.List<QueryItemsResponseDataItemsGames> getGames() {
            return this.games;
        }

    }

    public static class QueryItemsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<QueryItemsResponseDataItems> items;

        public static QueryItemsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryItemsResponseData self = new QueryItemsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryItemsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryItemsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryItemsResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryItemsResponseData setItems(java.util.List<QueryItemsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryItemsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
