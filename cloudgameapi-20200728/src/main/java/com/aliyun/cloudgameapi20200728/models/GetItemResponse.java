// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetItemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetItemResponseData data;

    public static GetItemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetItemResponse self = new GetItemResponse();
        return TeaModel.build(map, self);
    }

    public GetItemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetItemResponse setData(GetItemResponseData data) {
        this.data = data;
        return this;
    }
    public GetItemResponseData getData() {
        return this.data;
    }

    public static class GetItemResponseDataGames extends TeaModel {
        @NameInMap("GameId")
        @Validation(required = true)
        public String gameId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static GetItemResponseDataGames build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseDataGames self = new GetItemResponseDataGames();
            return TeaModel.build(map, self);
        }

        public GetItemResponseDataGames setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetItemResponseDataGames setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetItemResponseDataSkusSaleProps extends TeaModel {
        @NameInMap("PropertyId")
        @Validation(required = true)
        public Long propertyId;

        @NameInMap("PropertyName")
        @Validation(required = true)
        public String propertyName;

        @NameInMap("ValueId")
        @Validation(required = true)
        public Long valueId;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static GetItemResponseDataSkusSaleProps build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseDataSkusSaleProps self = new GetItemResponseDataSkusSaleProps();
            return TeaModel.build(map, self);
        }

        public GetItemResponseDataSkusSaleProps setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public GetItemResponseDataSkusSaleProps setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetItemResponseDataSkusSaleProps setValueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }
        public Long getValueId() {
            return this.valueId;
        }

        public GetItemResponseDataSkusSaleProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetItemResponseDataSkus extends TeaModel {
        @NameInMap("SkuId")
        @Validation(required = true)
        public String skuId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("SalePrice")
        @Validation(required = true)
        public Long salePrice;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("SaleProps")
        @Validation(required = true)
        public java.util.List<GetItemResponseDataSkusSaleProps> saleProps;

        public static GetItemResponseDataSkus build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseDataSkus self = new GetItemResponseDataSkus();
            return TeaModel.build(map, self);
        }

        public GetItemResponseDataSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public GetItemResponseDataSkus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetItemResponseDataSkus setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetItemResponseDataSkus setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetItemResponseDataSkus setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public GetItemResponseDataSkus setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public GetItemResponseDataSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetItemResponseDataSkus setSaleProps(java.util.List<GetItemResponseDataSkusSaleProps> saleProps) {
            this.saleProps = saleProps;
            return this;
        }
        public java.util.List<GetItemResponseDataSkusSaleProps> getSaleProps() {
            return this.saleProps;
        }

    }

    public static class GetItemResponseData extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifyTime")
        @Validation(required = true)
        public Long modifyTime;

        @NameInMap("SellerId")
        @Validation(required = true)
        public String sellerId;

        @NameInMap("CategoryId")
        @Validation(required = true)
        public Long categoryId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("SalePrice")
        @Validation(required = true)
        public Long salePrice;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Supplier")
        @Validation(required = true)
        public String supplier;

        @NameInMap("Games")
        @Validation(required = true)
        public java.util.List<GetItemResponseDataGames> games;

        @NameInMap("Skus")
        @Validation(required = true)
        public java.util.List<GetItemResponseDataSkus> skus;

        public static GetItemResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseData self = new GetItemResponseData();
            return TeaModel.build(map, self);
        }

        public GetItemResponseData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetItemResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetItemResponseData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetItemResponseData setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public GetItemResponseData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetItemResponseData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetItemResponseData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public GetItemResponseData setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public GetItemResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetItemResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetItemResponseData setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public String getSupplier() {
            return this.supplier;
        }

        public GetItemResponseData setGames(java.util.List<GetItemResponseDataGames> games) {
            this.games = games;
            return this;
        }
        public java.util.List<GetItemResponseDataGames> getGames() {
            return this.games;
        }

        public GetItemResponseData setSkus(java.util.List<GetItemResponseDataSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<GetItemResponseDataSkus> getSkus() {
            return this.skus;
        }

    }

}
