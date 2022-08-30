// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    @NameInMap("ChineseName")
    public String chineseName;

    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPrice")
    public String currentPrice;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnglishName")
    public String englishName;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("IconText")
    public String iconText;

    @NameInMap("Message")
    public String message;

    @NameInMap("OriginalPrice")
    public String originalPrice;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Temperature")
    public String temperature;

    public static GetProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponseBody self = new GetProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductResponseBody setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public GetProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductResponseBody setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }
    public String getCurrentPrice() {
        return this.currentPrice;
    }

    public GetProductResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetProductResponseBody setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public GetProductResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProductResponseBody setIconText(String iconText) {
        this.iconText = iconText;
        return this;
    }
    public String getIconText() {
        return this.iconText;
    }

    public GetProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProductResponseBody setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
        return this;
    }
    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public GetProductResponseBody setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public GetProductResponseBody setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GetProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProductResponseBody setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }
    public String getTemperature() {
        return this.temperature;
    }

}
