// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    // 商品中文名称
    @NameInMap("ChineseName")
    public String chineseName;

    // 状态码
    @NameInMap("Code")
    public String code;

    // 商品现价（可空）
    @NameInMap("CurrentPrice")
    public String currentPrice;

    // 商品描述（可空）
    @NameInMap("Description")
    public String description;

    // 商品英文名称（可空）
    @NameInMap("EnglishName")
    public String englishName;

    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 商品图标文字 （可空）
    @NameInMap("IconText")
    public String iconText;

    // 说明
    @NameInMap("Message")
    public String message;

    // 商品原价（可空）
    @NameInMap("OriginalPrice")
    public String originalPrice;

    // 商品编号(ID)
    @NameInMap("ProductId")
    public String productId;

    // 商品类型（可空）（数据格式：顶层类型-中层类型-底层类型）
    @NameInMap("ProductType")
    public String productType;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 商品冷热属性：hot,cold,normol（不传默认normal，不做特效展示）
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
