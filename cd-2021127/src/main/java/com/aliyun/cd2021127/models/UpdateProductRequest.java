// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    // 商品中文名称
    @NameInMap("ChineseName")
    public String chineseName;

    // 商品现价（可空）
    @NameInMap("CurrentPrice")
    public String currentPrice;

    // 商品描述（可空）
    @NameInMap("Description")
    public String description;

    // 商品英文名称（可空）
    @NameInMap("EnglishName")
    public String englishName;

    // 商品图标文字 （可空）
    @NameInMap("IconText")
    public String iconText;

    // 商品原价（可空）
    @NameInMap("OriginalPrice")
    public String originalPrice;

    // 商品编号(ID)
    @NameInMap("ProductId")
    public String productId;

    // 商品类型（可空）（数据格式：顶层类型-中层类型-底层类型）
    @NameInMap("ProductType")
    public String productType;

    // 商品冷热属性：hot,cold,normol（不传默认normal，不做特效展示）
    @NameInMap("Temperature")
    public String temperature;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public UpdateProductRequest setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    public UpdateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductRequest setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public UpdateProductRequest setIconText(String iconText) {
        this.iconText = iconText;
        return this;
    }
    public String getIconText() {
        return this.iconText;
    }

    public UpdateProductRequest setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public UpdateProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateProductRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

}
