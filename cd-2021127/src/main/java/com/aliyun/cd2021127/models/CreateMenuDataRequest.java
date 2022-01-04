// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateMenuDataRequest extends TeaModel {
    // 菜单商品容器数据批次id-选填
    @NameInMap("BatchId")
    public String batchId;

    // 数据优先级，数值越高，优先级越大（默认为0）-选填
    @NameInMap("Priority")
    public Integer priority;

    // 菜单商品容器数据-必填
    @NameInMap("ProductCombineList")
    public java.util.List<CreateMenuDataRequestProductCombineList> productCombineList;

    // 菜单商品容器数据id-必填
    @NameInMap("ProductContainerId")
    public String productContainerId;

    // 自定义门店组id（当shopIdList为空才生效）-选填
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    // 自定义门店id列表（shopIdList不为空，shopGroupId无效，shopId=-1表示门店默认数据）-选填
    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    // 菜单商品容器数据类型（目前支持：top,morning,afternoon）-必填
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
        // 商品中文名称-必填
        @NameInMap("ChineseName")
        public String chineseName;

        // 商品现价-选填
        @NameInMap("CurrentPrice")
        public String currentPrice;

        // 商品描述-选填
        @NameInMap("Description")
        public String description;

        // 商品英文名称-选填
        @NameInMap("EnglishName")
        public String englishName;

        // 商品图标文字-选填
        @NameInMap("IconText")
        public String iconText;

        // 商品原价-选填
        @NameInMap("OriginalPrice")
        public String originalPrice;

        // 商品编号(ID)-必填
        @NameInMap("ProductId")
        public String productId;

        // 商品类型（数据格式：顶层类型-中层类型-底层类型）-选填
        @NameInMap("ProductType")
        public String productType;

        // 商品冷热属性（hot,cold,normal，默认normal，不做特效展示）-选填
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
        // 商品顺序-必填
        @NameInMap("Order")
        public Integer order;

        // 商品信息-必填
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
        // 商品组名称-选填
        @NameInMap("Name")
        public String name;

        // 组合顺序-必填
        @NameInMap("Order")
        public Integer order;

        // 商品组信息-必填
        @NameInMap("ProductItemList")
        public java.util.List<CreateMenuDataRequestProductCombineListProductItemList> productItemList;

        public static CreateMenuDataRequestProductCombineList build(java.util.Map<String, ?> map) throws Exception {
            CreateMenuDataRequestProductCombineList self = new CreateMenuDataRequestProductCombineList();
            return TeaModel.build(map, self);
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
