// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
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

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public CreateProductRequest setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public CreateProductRequest setIconText(String iconText) {
        this.iconText = iconText;
        return this;
    }
    public String getIconText() {
        return this.iconText;
    }

    public CreateProductRequest setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public CreateProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateProductRequest setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

}
