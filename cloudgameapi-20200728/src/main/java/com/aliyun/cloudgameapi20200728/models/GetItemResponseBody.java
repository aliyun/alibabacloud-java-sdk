// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetItemResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetItemResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetItemResponseBody self = new GetItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetItemResponseBody setData(GetItemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetItemResponseBodyData getData() {
        return this.data;
    }

    public GetItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetItemResponseBodyDataGames extends TeaModel {
        @NameInMap("GameId")
        public String gameId;

        @NameInMap("Name")
        public String name;

        public static GetItemResponseBodyDataGames build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseBodyDataGames self = new GetItemResponseBodyDataGames();
            return TeaModel.build(map, self);
        }

        public GetItemResponseBodyDataGames setGameId(String gameId) {
            this.gameId = gameId;
            return this;
        }
        public String getGameId() {
            return this.gameId;
        }

        public GetItemResponseBodyDataGames setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetItemResponseBodyDataSkusSaleProps extends TeaModel {
        @NameInMap("PropertyId")
        public Long propertyId;

        @NameInMap("PropertyName")
        public String propertyName;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueId")
        public Long valueId;

        public static GetItemResponseBodyDataSkusSaleProps build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseBodyDataSkusSaleProps self = new GetItemResponseBodyDataSkusSaleProps();
            return TeaModel.build(map, self);
        }

        public GetItemResponseBodyDataSkusSaleProps setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }
        public Long getPropertyId() {
            return this.propertyId;
        }

        public GetItemResponseBodyDataSkusSaleProps setPropertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }
        public String getPropertyName() {
            return this.propertyName;
        }

        public GetItemResponseBodyDataSkusSaleProps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetItemResponseBodyDataSkusSaleProps setValueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }
        public Long getValueId() {
            return this.valueId;
        }

    }

    public static class GetItemResponseBodyDataSkus extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("SalePrice")
        public Long salePrice;

        @NameInMap("SaleProps")
        public java.util.List<GetItemResponseBodyDataSkusSaleProps> saleProps;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("Status")
        public Integer status;

        public static GetItemResponseBodyDataSkus build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseBodyDataSkus self = new GetItemResponseBodyDataSkus();
            return TeaModel.build(map, self);
        }

        public GetItemResponseBodyDataSkus setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetItemResponseBodyDataSkus setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetItemResponseBodyDataSkus setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetItemResponseBodyDataSkus setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public GetItemResponseBodyDataSkus setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public GetItemResponseBodyDataSkus setSaleProps(java.util.List<GetItemResponseBodyDataSkusSaleProps> saleProps) {
            this.saleProps = saleProps;
            return this;
        }
        public java.util.List<GetItemResponseBodyDataSkusSaleProps> getSaleProps() {
            return this.saleProps;
        }

        public GetItemResponseBodyDataSkus setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public GetItemResponseBodyDataSkus setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetItemResponseBodyData extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Games")
        public java.util.List<GetItemResponseBodyDataGames> games;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("SalePrice")
        public Long salePrice;

        @NameInMap("SellerId")
        public String sellerId;

        @NameInMap("Skus")
        public java.util.List<GetItemResponseBodyDataSkus> skus;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Supplier")
        public String supplier;

        @NameInMap("Title")
        public String title;

        public static GetItemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetItemResponseBodyData self = new GetItemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetItemResponseBodyData setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public GetItemResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetItemResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetItemResponseBodyData setGames(java.util.List<GetItemResponseBodyDataGames> games) {
            this.games = games;
            return this;
        }
        public java.util.List<GetItemResponseBodyDataGames> getGames() {
            return this.games;
        }

        public GetItemResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetItemResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetItemResponseBodyData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public GetItemResponseBodyData setSalePrice(Long salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Long getSalePrice() {
            return this.salePrice;
        }

        public GetItemResponseBodyData setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public GetItemResponseBodyData setSkus(java.util.List<GetItemResponseBodyDataSkus> skus) {
            this.skus = skus;
            return this;
        }
        public java.util.List<GetItemResponseBodyDataSkus> getSkus() {
            return this.skus;
        }

        public GetItemResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetItemResponseBodyData setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public String getSupplier() {
            return this.supplier;
        }

        public GetItemResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
