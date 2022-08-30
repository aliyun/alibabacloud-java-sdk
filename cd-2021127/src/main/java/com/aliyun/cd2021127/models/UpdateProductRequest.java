// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
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
