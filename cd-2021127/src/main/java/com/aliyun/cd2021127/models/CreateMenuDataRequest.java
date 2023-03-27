// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateMenuDataRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("Country")
    public String country;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("ProductCombineList")
    public java.util.List<CreateMenuDataRequestProductCombineList> productCombineList;

    @NameInMap("ProductContainerId")
    public String productContainerId;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    @NameInMap("Type")
    public String type;

    public static CreateMenuDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMenuDataRequest self = new CreateMenuDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateMenuDataRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CreateMenuDataRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateMenuDataRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateMenuDataRequest setProductCombineList(java.util.List<CreateMenuDataRequestProductCombineList> productCombineList) {
        this.productCombineList = productCombineList;
        return this;
    }
    public java.util.List<CreateMenuDataRequestProductCombineList> getProductCombineList() {
        return this.productCombineList;
    }

    public CreateMenuDataRequest setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

    public CreateMenuDataRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public CreateMenuDataRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public CreateMenuDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMenuDataRequestProductCombineListProductItemListProductInfo extends TeaModel {
        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("CurrentPrice")
        public String currentPrice;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnglishName")
        public String englishName;

        @NameInMap("IconText")
        public String iconText;

        @NameInMap("OriginalPrice")
        public String originalPrice;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("Temperature")
        public String temperature;

        public static CreateMenuDataRequestProductCombineListProductItemListProductInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateMenuDataRequestProductCombineListProductItemListProductInfo self = new CreateMenuDataRequestProductCombineListProductItemListProductInfo();
            return TeaModel.build(map, self);
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setCurrentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }
        public String getCurrentPrice() {
            return this.currentPrice;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setIconText(String iconText) {
            this.iconText = iconText;
            return this;
        }
        public String getIconText() {
            return this.iconText;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setOriginalPrice(String originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public CreateMenuDataRequestProductCombineListProductItemListProductInfo setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }
        public String getTemperature() {
            return this.temperature;
        }

    }

    public static class CreateMenuDataRequestProductCombineListProductItemList extends TeaModel {
        @NameInMap("Order")
        public Integer order;

        @NameInMap("ProductInfo")
        public CreateMenuDataRequestProductCombineListProductItemListProductInfo productInfo;

        public static CreateMenuDataRequestProductCombineListProductItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateMenuDataRequestProductCombineListProductItemList self = new CreateMenuDataRequestProductCombineListProductItemList();
            return TeaModel.build(map, self);
        }

        public CreateMenuDataRequestProductCombineListProductItemList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateMenuDataRequestProductCombineListProductItemList setProductInfo(CreateMenuDataRequestProductCombineListProductItemListProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public CreateMenuDataRequestProductCombineListProductItemListProductInfo getProductInfo() {
            return this.productInfo;
        }

    }

    public static class CreateMenuDataRequestProductCombineList extends TeaModel {
        @NameInMap("EnglishName")
        public String englishName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("ProductItemList")
        public java.util.List<CreateMenuDataRequestProductCombineListProductItemList> productItemList;

        public static CreateMenuDataRequestProductCombineList build(java.util.Map<String, ?> map) throws Exception {
            CreateMenuDataRequestProductCombineList self = new CreateMenuDataRequestProductCombineList();
            return TeaModel.build(map, self);
        }

        public CreateMenuDataRequestProductCombineList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public CreateMenuDataRequestProductCombineList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMenuDataRequestProductCombineList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CreateMenuDataRequestProductCombineList setProductItemList(java.util.List<CreateMenuDataRequestProductCombineListProductItemList> productItemList) {
            this.productItemList = productItemList;
            return this;
        }
        public java.util.List<CreateMenuDataRequestProductCombineListProductItemList> getProductItemList() {
            return this.productItemList;
        }

    }

}
